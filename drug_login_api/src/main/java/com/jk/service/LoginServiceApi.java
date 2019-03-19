package com.jk.service;


import com.jk.pojo.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

public interface LoginServiceApi {

    /**
     * 查询账户是否存在
     */
    /**
     * 查询用户
     */
    @GetMapping("getQuery")
    UserBean getQuery(@RequestParam String account,@RequestParam String userPwd);
    //@GetMapping("getUser")
   // UserBean getUser(UserBean user);

    /**
     * 根据手机号码获取用户
     * @param phone_no
     * @return
     */
    @GetMapping("getUserBeanByPhone")
    UserBean getUserBeanByPhone(@RequestParam String phone_no);
}
