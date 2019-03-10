package com.jk.service;


import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jk.pojo.AreaBean;
import com.jk.pojo.SiteBean;
import com.jk.pojo.UserBean;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;


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

    /**
     * 地址管理新增
     */
    @PostMapping("saveSite")
    String saveSite(@RequestBody SiteBean siteBean);

    /**
     * 查看地址信息
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("findSitePage")
    HashMap<String,Object> findSitePage(@RequestParam("page") Integer page, @RequestParam("rows") Integer rows);

    /**
     * 删除地址信息
     * @param userId
     */
    @DeleteMapping
    void delById(@RequestParam("userId") Integer userId);

    /**
     * 二级联动地区查询
     * @param id
     * @return
     */
    @PostMapping("findAreaList")
    List<AreaBean> findAreaList(@RequestParam("id") Integer id);

    /**
     * 修改地址
     */
    @GetMapping("findSiteList")
    SiteBean findSiteList(@RequestParam("id") Integer id);
}
