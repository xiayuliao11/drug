package com.jk.controller;

import com.jk.pojo.*;
import com.jk.service.InformationServiceWeb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class InformationController {

    @Autowired
    private InformationServiceWeb informationServiceWeb;

    /**
     * 查询树信息
     *
     * @return
     */
    @RequestMapping("queryTree")
    @ResponseBody
    public List<TreeBean> queryTree() {
        return informationServiceWeb.queryTree();
    }

    /**
     * 新增企业信息
     *
     * @param enterpriseBean
     * @return
     */
    @RequestMapping("saveEnterprise")
    @ResponseBody
    public Boolean saveEnterprise(EnterpriseBean enterpriseBean) {
        try {
            informationServiceWeb.saveEnterprise(enterpriseBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 跳转新增企业信息页面
     *
     * @return
     */
    @RequestMapping("toEnterpriseList")
    public String toEnterpriseList() {
        return "saveEnterpriseList";
    }

    /**
     * 跳转发布代理信息页面
     *
     * @return
     */
    @RequestMapping("toAgencyList")
    public String toAgencyList() {
        return "saveAgencyList";
    }

    /**
     * 跳转主页面
     *
     * @return
     */
    @RequestMapping("toIndex")
    public String toIndex() {
        return "index";
    }

    /**
     * 跳转list页面
     *
     * @return
     */
    @RequestMapping("toList")
    public String toList() {
        return "agencylist";
    }

    /**
     * 跳转代理信息修改页面
     *
     * @return
     */
    @RequestMapping("toUpdateAgencyList")
    public String toUpdateAgencyList() {
        return "updateAgencyList";
    }

    /**
     * 跳转审核页面
     * @return
     */
    @RequestMapping("toAuditList")
    public String toAuditList(){
        return "auditList";
    }

    /**
     * 新增代理信息
     *
     * @param productsBean
     * @return
     */
    @RequestMapping("saveAgency")
    @ResponseBody
    public Boolean saveAgency(ProductsBean productsBean) {
        try {
            informationServiceWeb.saveAgency(productsBean);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 查询审核列表
     *
     * @return
     */
    @RequestMapping("queryAudit")
    @ResponseBody
    public List<AuditBean> queryAudit() {
        return informationServiceWeb.queryAudit();
    }

    /**
     * 查询代理信息
     *
     * @return
     */
    @RequestMapping("queryProduct")
    @ResponseBody
    public List<ProductsBean> queryProduct() {
        return informationServiceWeb.queryProduct();
    }

    /**
     * 删除代理信息
     *
     * @param ids
     * @return
     */
    @RequestMapping("deleteAgency")
    @ResponseBody
    public Boolean deleteAgency(Integer ids) {
        try {
            informationServiceWeb.deleteAgency(ids);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }


    /**
     * 回显代理信息
     *
     * @return
     */
    @RequestMapping("findAgencyById")
    @ResponseBody
    public ProductsBean findAgencyById(Integer productsId) {
        return informationServiceWeb.findAgencyById(productsId);
    }

    /**
     * 查询类型(三级联动)
     * @return
     */
    @RequestMapping("findDrugType")
    @ResponseBody
    public List<TypeBean>findDrugType(Integer id){
        return informationServiceWeb.findDrugType(id);
    }

    /**
     * 查询地区(三级联动)
     * @param id
     * @return
     */
    @RequestMapping("findDrugArea")
    @ResponseBody
    public List<AreaBean>findDrugArea(Integer id){
        return informationServiceWeb.findDrugArea(id);
    }


}

