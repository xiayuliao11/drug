package com.jk.service;


import com.jk.pojo.UserBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RequestMapping("manage")
public interface ManageService {

    /**
     * 根据id查询用户
     */
    @GetMapping
    UserBean findUserById(@RequestParam("id")Integer id);

    /**
     * 修改密码
     */
    @PostMapping
    Boolean updateUserPwd(UserBean userBean);
}
