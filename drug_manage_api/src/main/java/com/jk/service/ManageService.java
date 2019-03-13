package com.jk.service;



import com.jk.pojo.*;
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
    void saveSite(@RequestBody SiteBean siteBean);

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

    /**
     * 商品查询
     */
    @PostMapping("findProductPage")
    List<ProductBean> findProductPage(ProductBean productBean);
    /**
     * 批量上架
     * @param ids
     */
    @GetMapping("batchDownById")
    void batchDownById(@RequestParam("ids") Integer[] ids);

    /**
     * 批量下架
     * @param ids
     */
    @GetMapping("batchUpById")
    void batchUpById(@RequestParam("ids") Integer[] ids);

    /**
     * 推广商品
     * @param productBean
     */
    @PostMapping("saveProduct")
    Boolean  saveProduct(@RequestBody ProductBean productBean);

    /**
     * 商品查看
     * @return
     */
    @GetMapping("findProduct")
    ProductBean findProduct(@RequestParam("id") Integer id);

    /**
     * 删除商品
     * @param id
     */
    @DeleteMapping("delProduct")
    void delProduct(@RequestParam("id") Integer id);

    /**
     * 查看分类
     * @return
     */
    @PostMapping("findDrugType")
    List<DrugTypeBean> findDrugType(@RequestParam("id")Integer id);
    /**
     * 查看剂型
     */
    @GetMapping("finAgentia")
    List<AgentiaBean> findAgentia();
    /**
     * 招商管理
     */
    @PostMapping("saveAttract")
    void saveAttract(@RequestBody AttractBean attractBean);
}
