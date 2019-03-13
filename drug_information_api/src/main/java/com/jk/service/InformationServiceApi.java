package com.jk.service;

import com.jk.pojo.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface InformationServiceApi {
    /**
     * 新增代理信息
     * @param productsBean
     */
    @PostMapping("saveAgency")
    void saveAgency(@RequestBody ProductsBean productsBean);


    /**
     * 查询树信息
     * @return
     */
    @GetMapping("queryTree")
    List<TreeBean> queryTree();

    /**
     * 查询代理信息
     * @return
     */
    @GetMapping("queryProduct")
    List<ProductsBean> queryProduct
    ();

    /**
     * 新增企业信息
     * @param enterpriseBean
     */
    @PostMapping("saveEnterprise")
    void saveEnterprise(@RequestBody EnterpriseBean enterpriseBean);

    /**
     * 查询审核列表
     * @return
     */
    @GetMapping("queryAudit")
    List<AuditBean> queryAudit();

    @DeleteMapping("deleteAgency")
    void deleteAgency(@RequestParam("ids") Integer ids);

    @GetMapping("findAgencyById")
    ProductsBean findAgencyById(@RequestParam("productsId") Integer productsId);

    @PostMapping("findDrugType")
    List<TypeBean> findDrugType(@RequestParam("id") Integer id);

    @PostMapping("findDrugArea")
    List<AreaBean> findDrugArea(@RequestParam("id")Integer id);
}
