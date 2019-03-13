package com.jk.controller;

import com.jk.mapper.InformationMapper;
import com.jk.pojo.*;
import com.jk.service.InformationServiceApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformationController implements InformationServiceApi {

    @Autowired
    private InformationMapper informationMapper;

    /**
     * 查询树信息
     * @return
     */
    @Override
    public List<TreeBean> queryTree() {
        return informationMapper.queryTree();
    }

    /**
     * 新增企业信息
     * @param enterpriseBean
     */
    @Override
    public void saveEnterprise(EnterpriseBean enterpriseBean) {
        informationMapper.saveEnterprise(enterpriseBean);
    }

    /**
     * 新增代理信息
     * @param productsBean
     */
    @Override
    public void saveAgency(@RequestBody ProductsBean productsBean) {
        Integer id = productsBean.getProductsId();
        if (id!=null){
            informationMapper.updateAgency(productsBean);
        }else {
            informationMapper.saveAgency(productsBean);
        }
    }

    /**
     * 查询审核列表
     * @return
     */
    @Override
    public List<AuditBean> queryAudit() {
        return informationMapper.queryAudit();
    }

    /**
     * 删除代理信息
     * @param ids
     */
    @Override
    public void deleteAgency(Integer ids) {
        informationMapper.deleteAgency(ids);
    }

    /**
     * 回显代理信息
     * @param productsId
     * @return
     */
    @Override
    public ProductsBean findAgencyById(Integer productsId) {
        return informationMapper.findAgencyById(productsId);
    }

    /**
     * 查询类型(三级联动)
     * @param id
     * @return
     */
    @Override
    public List<TypeBean> findDrugType(Integer id) {
        return informationMapper.findDrugType(id);
    }

    /**
     * 查询地区(三级联动)
     * @param id
     * @return
     */
    @Override
    public List<AreaBean> findDrugArea(Integer id) {
        return informationMapper.findDrugArea(id);
    }

    /**
     *  查询代理信息
     * @return
     */
    @Override
    public List<ProductsBean> queryProduct() {
        return informationMapper.queryProduct();
    }


}
