package com.jk.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.jk.constant.ConstanType;
import com.jk.pojo.AreaBean;
import com.jk.pojo.SiteBean;
import com.jk.pojo.UserBean;
import com.jk.service.ManageService;
import com.jk.service.ManageServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class ManageController {

    @Autowired
    private ManageServiceFeign manageServiceFeign;

    @Autowired
    private RedisTemplate redisTemplate;

    /**
     * 查看用户信息
     */
    @GetMapping("findUserById")
    @ResponseBody
    public UserBean findUserById(@RequestParam("id") Integer id){
        UserBean user = manageServiceFeign.findUserById(id);
        return user;
    }
    /**
     * 查看地址信息
     */
    @GetMapping("findSitePage")
    @ResponseBody
     public HashMap<String,Object> findSitePage(Integer page, Integer rows){
        HashMap<String, Object> sitePage = new HashMap<>();
        String cacheKey=ConstanType.CACHE_SITE;
        Boolean hasKey = redisTemplate.hasKey(cacheKey);
       /* if (hasKey) {
            //从缓存中取出来
            //System.out.println("走缓存");
            sitePage = (HashMap<String, Object>) redisTemplate.opsForValue().get(cacheKey);
        } else {
            sitePage = manageServiceFeign.findSitePage(page, rows);
            //存入缓存
            System.out.println("走数据库");
            System.out.println("page = [" +sitePage+ "]");
            redisTemplate.opsForValue().set(cacheKey,sitePage);
        }*/
        sitePage = manageServiceFeign.findSitePage(page, rows);
        return sitePage;
     }
    /**
     * 修改密码
     * @param userBean
     * @return
     */
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

    /**
     * 地址管理新增
     */
    @PostMapping("saveSite")
    @ResponseBody
    public String saveSite(SiteBean siteBean){
        return  manageServiceFeign.saveSite(siteBean);
    }

    /**
     * 删除地址信息
     * @return
     */
    @DeleteMapping("delById")
    @ResponseBody
    public void delById(Integer userId){
        manageServiceFeign.delById(userId);
    }

    /**
     * 查询地址信息
     * @param id
     * @return
     */
    @GetMapping("findSiteList")
    @ResponseBody
    public SiteBean findSiteList(Integer id){
        return manageServiceFeign.findSiteList(id);
    }
    /**
     * 二级联动地区查询
     * @return
     */
    @PostMapping("findAreaList")
    @ResponseBody
    public List<AreaBean> findAreaList(Integer id){
        System.out.println("id = [" + id + "]");
        return manageServiceFeign.findAreaList(id);
    }
    //跳转修改密码页面
    @GetMapping("toSelectPwd")
    public String toSelectPwd(){
        return "updatePwd";
    }
    //跳转新增地址页面
    @GetMapping("toSaveSite")
    public String toSaveSite(){
        return "saveSite";
    }
    //跳转查询地址页面
    @GetMapping("toSelectStie")
    public String toSelectStie(){
        return "stielist";
    }
}
