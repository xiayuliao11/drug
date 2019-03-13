package com.jk.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jk.constant.ConstanType;
import com.jk.pojo.*;
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
    public void saveSite(@RequestBody SiteBean siteBean) {
         portsService.saveSite(siteBean);
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

    /**
     * 查看商品
     * @param productBean
     * @return
     */
    @Override
    @ResponseBody
    public List<ProductBean> findProductPage(ProductBean productBean) {
        return portsService.findProductPage(productBean);
    }

    /**
     * 上架
     * @param ids
     */
    @Override
    @ResponseBody
    public void batchDownById(Integer[] ids) {
        portsService.batchDownById(ids);
    }

    /**
     * 下架
     * @param ids
     */
    @Override
    @ResponseBody
    public void batchUpById(Integer[] ids) {
        portsService.batchUpById(ids);
    }

    /**
     * 新增商品
     * @param productBean
     * @return
     */
    @Override
    @ResponseBody
    public Boolean saveProduct(ProductBean productBean) {
        return portsService.saveProduct(productBean);
    }

    /**
     * 查看
     * @param id
     * @return
     */
    @Override
    @ResponseBody
    public ProductBean findProduct(Integer id) {
        return portsService.findProduct(id);
    }

    /**
     * 删除商品
     * @param id
     */
    @Override
    @ResponseBody
    public void delProduct(Integer id) {
        portsService.delProduct(id);
    }

    /**
     * 查看商品分类
     * @param id
     * @return
     */
    @Override
    @ResponseBody
    public List<DrugTypeBean> findDrugType(Integer id) {
        return portsService.findDrugType(id);
    }

    /**
     * 二级联动
     * @return
     */
    @Override
    @ResponseBody
    public List<AgentiaBean> findAgentia() {
        return portsService.findAgentia();
    }

    /**
     * 招商新增
     * @param attractBean
     */
    @Override
    @ResponseBody
    public void saveAttract(@RequestBody AttractBean attractBean) {
        portsService.saveAttract(attractBean);
    }
}
