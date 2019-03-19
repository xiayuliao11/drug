package com.jk.service.impl;

import com.jk.mapper.LoginMapper;
import com.jk.pojo.UserBean;
import com.jk.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    /**
     * 查询用户是否存在
     * @param account
     * @param userPwd
     * @return
     */
    @Override
    public UserBean getQuery(String account,String userPwd) {
        return loginMapper.getQuery(account,userPwd);
    }

    @Override
    public UserBean getUser(UserBean user) {
        return loginMapper.getUser(user);
    }

    /**
     * 根据手机号码查询账户信息
     * @param phone_no
     * @return
     */
    @Override
    public UserBean getUserBeanByPhone(String phone_no) {
        return loginMapper.getUserBeanByPhone(phone_no);
    }
}
