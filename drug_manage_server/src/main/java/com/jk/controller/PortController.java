package com.jk.controller;

import com.jk.pojo.UserBean;
import com.jk.service.ManageService;
import com.jk.service.PortsService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
public class PortController implements ManageService {
    @Autowired
    private PortsService portsService;

//
//    @Autowired
//    private RedisTemplate<String, Object> redisTemplate;

    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @Override
    @ResponseBody
    public UserBean findUserById(@RequestParam("id") Integer id) {
        return portsService.findUserById(id);
    }

    /**
     * 修改密码
     * @param userBean
     * @return
     */

    @Override
    @ResponseBody
    public Boolean updateUserPwd(@RequestBody UserBean userBean) {
        return portsService.updateUserPwd(userBean);
    }
}
