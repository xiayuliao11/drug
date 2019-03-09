package com.jk.controller;

import com.jk.constant.ConstanType;
import com.jk.pojo.UserBean;
import com.jk.service.ManageService;
import com.jk.service.ManageServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.Map;

@Controller
public class ManageController {

    @Autowired
    private ManageServiceFeign manageServiceFeign;

    /**
     * 查看用户信息
     */

    @GetMapping("findUserById")
    @ResponseBody
    public UserBean findUserById(@RequestParam("id") Integer id){
        return manageServiceFeign.findUserById(id);
    }

    @PostMapping("updateUserPwd")
    @ResponseBody
    public Boolean updateUserPwd(UserBean userBean){
        //查询用户信息
        Integer id = userBean.getId();
        UserBean userInfo =  manageServiceFeign.findUserById(id);
        //判断输入的密码是否与原密码一直
        if(!userInfo.getUserPwd().equals(userBean.getUserPwd())){
            return ConstanType.PASSWORD_STATUS_WRONG;
        }
        return manageServiceFeign.updateUserPwd(userBean);
    }

    @GetMapping("toSelectPwd")
    public String toSelectPwd(){
        return "updatePwd";
    }
}
