package com.jk.service;

import com.jk.pojo.UserBean;

public interface LoginService {
    /**
     * 查询用户是否存在
     * @param user
     * @return
     */
    UserBean getQuery(String account,String userPwd);

    UserBean getUser(UserBean user);

    /**
     * 根据手机号码查询用户信息
     * @param phone_no
     * @return
     */
    UserBean getUserBeanByPhone(String phone_no);

    /**
     * 新增注册用户信息
     * @param userBean
     */
    void addUser(UserBean userBean);
}
