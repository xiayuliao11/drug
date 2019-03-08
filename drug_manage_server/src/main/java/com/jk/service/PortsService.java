package com.jk.service;


import com.jk.pojo.UserBean;

public interface PortsService {

    UserBean findUserById(Integer id);

    Boolean updateUserPwd(UserBean userBean);
}
