package com.jk.controller;

import com.jk.constant.ConstanType;
import com.jk.pojo.*;
import com.jk.service.ManageServiceFeign;
import com.jk.utils.FileUtil;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

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
        UserBean user = manageServiceFeign.findUserById(id);
        return user;
    }
    /**
     * 查看地址信息
     */
    @GetMapping("findSitePage")
    @ResponseBody
     public List<SiteBean> findSitePage(){
        return manageServiceFeign.findSitePage();
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
    public void saveSite(SiteBean siteBean){
          manageServiceFeign.saveSite(siteBean);
    }

    /**
     * 删除地址信息
     * @return
     */
    @DeleteMapping("delById")
    @ResponseBody
    public void delById(Integer userId){
        manageServiceFeign.delById(userId);
      /*  ValueOperations<String, String> vo=redisTemplate.opsForValue();
        vo.getOperations().delete(userId.toString());*/
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
        return manageServiceFeign.findAreaList(id);
    }

    /**
     * 商品查询
     * @param page
     * @param rows
     * @return
     */
    @GetMapping("findProductPage")
    @ResponseBody
    public List<ProductBean> findProductPage(ProductBean productBean){

        return manageServiceFeign.findProductPage(productBean);
    }

    /**
     * 推广商品
     * @param productBean
     */
    @PostMapping("saveProduct")
    @ResponseBody
    public Boolean saveProduct(ProductBean productBean){

        return manageServiceFeign.saveProduct(productBean);
    }
    /**
     * 批量上架
     * @param ids
     */
    @GetMapping("batchDownById")
    @ResponseBody
    public void batchDownById(Integer[] ids){
        manageServiceFeign.batchDownById(ids);
    }

    /**
     * 商品查看
     */
    @GetMapping("findProduct")
    @ResponseBody
    public ProductBean findProduct(Integer id){

            return manageServiceFeign.findProduct(id);
    }
    /**
     * 删除商品
     */
    @DeleteMapping("delProduct")
    @ResponseBody
    public void delProduct(Integer id){
        manageServiceFeign.delProduct(id);
    }
    /**
     * 批量下架
     * @param ids
     */
    @GetMapping("batchUpById")
    @ResponseBody
    public void batchUpById(Integer[] ids){
        manageServiceFeign.batchUpById(ids);
    }

    /**
     * 查看分类
     * @return
     */
    @PostMapping("findDrugType")
    @ResponseBody
    public List<DrugTypeBean> findDrugType(Integer id){
         return manageServiceFeign.findDrugType(id);
    }

    /**
     * 查看剂型
     * @return
     */
    @GetMapping("findAgentia")
    @ResponseBody
    public List<AgentiaBean> finAgentia(){
        return manageServiceFeign.findAgentia();
    }

    /**
     * 招商新增
     * @param attractBean
     */
    @PostMapping("saveAttract")
    @ResponseBody
    public void saveAttract(AttractBean attractBean){

        manageServiceFeign.saveAttract(attractBean);
    }
    /**
     * 图片上传
     * @param img
     * @param request
     * @return
     */
    @RequestMapping("uploadUserImg")
    @ResponseBody
    public HashMap<String, String> uploadUserImg(MultipartFile merchantsImg, HttpServletRequest request) {
        HashMap<String, String> result = new HashMap<>();
        String fileUpload = FileUtil.fileUploadBootStrap(merchantsImg, request);
        result.put("img", fileUpload);
        return result;
    }

    /**
     * 招商信息
     * @param page
     * @param rows
     * @param attractBean
     * @return
     */
    @RequestMapping("findAttractPage")
    @ResponseBody
    public HashMap<String,Object> findAttractPage(Integer page,Integer rows,AttractBean attractBean){
        return manageServiceFeign.findAttractPage(page,rows,attractBean);
    }
    /**
     * 代理信息
     * @param page
     * @param rows
     * @param attractBean
     * @return
     */
    @RequestMapping("findAgencyPage")
    @ResponseBody
    public HashMap<String,Object> findAgencyPage(Integer page,Integer rows,ProductsBean productsBean){
        return manageServiceFeign.findAgencyPage(page,rows,productsBean);
    }

    //跳转查看页面
    @GetMapping("toFindProduct")
    public String toFindProduct(){
        return "selectProduct";
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
    //跳转查询地址页面
    @GetMapping("toSelectProduct")
    public String toSelectProduct(){
        return "productlist";
    }
    //跳转查询地址页面
    @GetMapping("toAddProduct")
    public String toAddProduct(){
        return "updateProduct";
    }
    //跳转新增页面
    @GetMapping("toAddAttract")
    public String toAddAttract(){
        return "saveAttract";
    }
    //跳转新增页面
    @GetMapping("toSelectAttract")
    public String toSelectAttract(){
        return "attractList";
    }
    //跳转新增页面
    @GetMapping("toSelectAengey")
    public String toSelectAengey(){
        return "productslist";
    }
}
