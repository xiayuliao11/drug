package com.jk.controller;

import com.jk.pojo.UserBean;
import com.jk.service.LoginService;
import com.jk.service.LoginServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController implements LoginServiceApi {
    @Autowired
    LoginService loginService;

    /**
     * 查询用户是否存在
     * @param
     * @return
     */

    @Override
    @ResponseBody
    public UserBean getQuery(String account,String userPwd) {

        return loginService.getQuery(account,userPwd);
    }

    /**
     * 根据电话号码获取用户信息
     * @param phone_no
     * @return
     */
    @Override
    @ResponseBody
    public UserBean getUserBeanByPhone(String phone_no) {
        UserBean userBeanByPhone = loginService.getUserBeanByPhone(phone_no);
        return userBeanByPhone;
    }

    /**
     * 新增用户信息
     * @param userBean
     */
    @Override
    @ResponseBody
    public void addUser(@RequestBody UserBean userBean) {
        loginService.addUser(userBean);
    }

//    //@Override
//    @ResponseBody
//    @GetMapping("getUser")
//    public UserBean getUser(@RequestBody UserBean user) {
//        return loginService.getUser(user);
//    }
}
