package com.jk.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jk.constant.ConstanType;
import com.jk.pojo.AreaBean;
import com.jk.pojo.SiteBean;
import com.jk.pojo.UserBean;
import com.jk.service.ManageService;
import com.jk.service.PortsService;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class PortController implements ManageService {
    @Autowired
    private PortsService portsService;





    /**
     * 根据id查询用户信息
     * @param id
     * @return
     */
    @Override
    @ResponseBody
    public UserBean findUserById(@RequestParam("id") Integer id) {
        UserBean user= portsService.findUserById(id);
        return user;
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

    /**
     * 新建地址
     * @param siteBean
     * @return
     */
    @Override
    @ResponseBody
    public String saveSite(@RequestBody SiteBean siteBean) {
        return portsService.saveSite(siteBean);
    }

    /**
     * 查看地址信息
     * @param page
     * @param rows
     * @return
     */
    @Override
    @ResponseBody
    public HashMap<String,Object> findSitePage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows) {
        return portsService.findSitePage(page,rows);
    }
    /**
     * 删除地址信息
     * @param userId
     */
    @Override
    @ResponseBody
    public void delById(@RequestParam("userId") Integer userId) {
        System.out.println("userId = [" + userId + "]");
        portsService.delById(userId);
    }

    /**
     * 二级联动
     * @param id
     * @return
     */
    @Override
    @ResponseBody
    public List<AreaBean> findAreaList(@RequestParam("id") Integer id) {
        return portsService.findAreaList(id);
    }

    /**
     * 修改地址
     * @param id
     * @return
     */
    @Override
    @ResponseBody
    public SiteBean findSiteList(@RequestParam("id") Integer id) {
        return portsService.findSiteList(id);
    }
}
