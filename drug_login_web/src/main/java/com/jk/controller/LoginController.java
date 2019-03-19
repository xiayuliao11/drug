package com.jk.controller;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.jk.constant.ConstanType;
import com.jk.constant.HttpClient;
import com.jk.constant.QueryParam;
import com.jk.constant.Result;
import com.jk.pojo.UserBean;
import com.jk.service.LoginServiceDome;
import org.apache.tomcat.util.bcel.classfile.Constant;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;


@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    LoginServiceDome loginServiceDome;
    //注入redis
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
    @ResponseBody
    @RequestMapping(value = "getQuery",method = RequestMethod.GET)
    public String getQuery(String account, String userPwd, HttpSession session, HttpServletResponse response, HttpServletRequest request){
        UserBean userBean= loginServiceDome.getQuery(account,userPwd);
        if(userBean==null){
            return "0";//账号密码为空
        }else{
            session.setAttribute("userBean",userBean);
            Cookie cookie = new Cookie(ConstanType.remember_pwd,userBean.getAccount()+ConstanType.splitsperator+userBean.getUserName());
            cookie.setMaxAge(60*60*24*7);
            cookie.setPath("/");
            response.addCookie(cookie);
            return "1";
        }

    }

//    @ResponseBody
//    @RequestMapping(value = "getUser",method = RequestMethod.GET)
//    public String getUser(UserBean user){
//        UserBean userBean =loginServiceDome.getUser(user);
//        return "1";
//    }
    /**
     * 注销
     */
    @ResponseBody
    @RequestMapping("logout")
    public String logout(HttpSession session){
           session.invalidate();
           return "1";
    }
    /**
     * 用手机号获得code
     *
     */
    @RequestMapping("getRandomCode")
    @ResponseBody
    public Result getRandomCode(QueryParam queryParam, HttpSession session){
        Result result = new Result();
        //根据手机获取用户
        UserBean userBeanByPhone=loginServiceDome.getUserBeanByPhone(queryParam.getPhone_no());
        session.setAttribute("userBean",userBeanByPhone);
        if(userBeanByPhone!=null&&userBeanByPhone.getState()==1){
            //每次都从redis中取一下当前手机号 如果有值 说明是刷新界面多次获取验证码
            Boolean aBoolean = redisTemplate.hasKey(ConstanType.multiple_code + queryParam.getPhone_no());
            //两次获取验证码的时间没有超过40s
            if(aBoolean){
                result.setCode(2);   //对象已存在
            }else{
                result.setCode(1);   //不存在
                //产生一个6位随机验证码
                int random = (int)(Math.random() * 899999 + 100000);
                //把验证码放到缓层中
                redisTemplate.opsForValue().set(ConstanType.phone_code+queryParam.getPhone_no(),random+"",5, TimeUnit.MINUTES);
                System.out.println(random);
                // 调用接口发送验证码(60s不能重复发送 24h只能发三次)
                HashMap<String, Object> params = new HashMap<>();
                params.put("key","a171d11f051086a8985d078b02156c8d");//接口名称上查看
                params.put("mobile",queryParam.getPhone_no());//输入的手机号码
                params.put("tpl_id","124703");//短信模板id
                params.put("tpl_value","%23code%23%3d"+random);//变量名和变量值对

                String sendGet = HttpClient.sendGet("http://v.juhe.cn/sms/send", params);
                //把当前的手机号存到redis中 并设置40秒的过期时间  判断是否多次登录
                redisTemplate.opsForValue().set(ConstanType.multiple_code+queryParam.getPhone_no(),"123",5,TimeUnit.MINUTES);
            }
        }else{
            result.setCode(0);//在黑名单
        }
        return result;
    }
    /**
     * 验证验证码是否正确
     */
    @ResponseBody
    @RequestMapping("checkCode")
    public String checkCode(QueryParam queryParam,HttpSession session){
        //用户当前输入的验证码
        String verify_code = queryParam.getVerify_code();
        // 从Redis获取验证码
        String codefromredis = redisTemplate.opsForValue().get(ConstanType.phone_code + queryParam.getPhone_no());
      //比对验证码 如果用户输入的验证码正确则登录
        if(codefromredis!=null&&verify_code.equals(codefromredis)){
            // 登录成功 根据手机号 查询出用户的信息 保存到session
            UserBean userBeanByPhone=loginServiceDome.getUserBeanByPhone(queryParam.getPhone_no());
            //必须以user为key 不然拦截器会认为没有登录
            session.setAttribute("user", userBeanByPhone);
            //删除存在的code存在的key值
            redisTemplate.delete(ConstanType.phone_code+queryParam.getPhone_no());
            return "1";//校验成功
        }else{
            Long count = redisTemplate.opsForValue().increment(ConstanType.phone_code + queryParam.getPhone_no(), 1);
           if(count>3){
               Duration duration = Duration.between(LocalDateTime.now(), LocalDate.now().plusDays(1).atTime(0, 0, 0));
               redisTemplate.expire(ConstanType.phone_code+queryParam.getPhone_no(),duration.toMinutes(),TimeUnit.SECONDS);
               return "4";//发送次数达到上限
           }
           return "0";//检验失败
        }
    }
}
