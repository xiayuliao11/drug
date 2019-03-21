package com.jk.service;

import com.jk.constant.ConstanType;
import com.jk.mapper.PortMapper;
import com.jk.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


@Service
public class PortServiceImpl implements PortsService {

    @Autowired
    private PortMapper portMapper;

    /**
     * 用户查询
     * @param id
     * @return
     */
    @Override
    public UserBean findUserById(Integer id) {
        return portMapper.findUserById(id);
    }

    /**
     * 修改密码
     * @param userBean
     * @return
     */
    @Override
    public Boolean updateUserPwd(UserBean userBean) {
        return portMapper.updateUserPwd(userBean);
    }

    /**
     * 新增地址
     * @param siteBean
     * @return
     */
    @Override
    public void saveSite(SiteBean siteBean) {
        if (siteBean.getId()!=null){
            portMapper.updateSite(siteBean);
        }else {
            portMapper.saveSite(siteBean);
            System.out.println("siteBean = [" + siteBean + "]");
        }

    }

    /**
     * 查看地址信息
     * @param page
     * @param rows
     * @return
     */

    @Override
    public List<SiteBean> findSitePage() {
        List<SiteBean> list = portMapper.findSitePage();
        return list;
    }


    /**
     * 删除地址信息
     * @param userId
     */
    @Override
    public void delById(Integer userId) {
        portMapper.delById(userId);
    }

    /**
     * 二级联动
     * @param id
     * @return
     */
    @Override
    public List<AreaBean> findAreaList(Integer id) {
        return portMapper.findAreaList(id);
    }

    /**
     * 修改地址
     * @param id
     * @return
     */
    @Override
    public SiteBean findSiteList(Integer id) {
        return portMapper.findSiteList(id);
    }
     /**
     * 商品查询
     * @param page
     * @param rows
     * @return
     */
    @Override
    public List<ProductBean> findProductPage(ProductBean productBean) {
        List<ProductBean> list = portMapper.findProductPage(productBean);
        return list;
    }

    @Override
    public void batchDownById(Integer[] ids) {
        portMapper.batchDownById(ids);
    }

    /**
     * 下架
     * @param ids
     */
    @Override
    public void batchUpById(Integer[] ids) {
        portMapper.batchUpById(ids);
    }

    /**
     * 新增商品
     * @param productBean
     */
    @Override
    public Boolean saveProduct(ProductBean productBean) {
        if (productBean.getProductId()!=null) {
            portMapper.updateProduct(productBean);
        } else {
            portMapper.saveProduct(productBean);
        }
      return true;
    }

    /**
     * 商品回显
     * @param id
     * @return
     */
    @Override
    public ProductBean findProduct(Integer id) {
        return portMapper.findProduct(id);
    }

    /**
     * 删除商品
     * @param id
     */
    @Override
    public void delProduct(Integer id) {
        portMapper.delProduct(id);
    }

    /**
     * 分类查询
     * @param id
     * @return
     */
    @Override
    public List<DrugTypeBean> findDrugType(Integer id) {
        return portMapper.findDrugType(id);
    }

    /**
     * 剂型查询
     * @return
     */
    @Override
    public List<AgentiaBean> findAgentia() {
        return portMapper.findAgentia();
    }

    /**
     * 招商管理
     * @param attractBean
     */
    @Override
    public void saveAttract(AttractBean attractBean) {
        portMapper.saveAttract(attractBean);
    }

    @Override
    public HashMap<String, Object> findAttractPage(Integer page, Integer rows, AttractBean attractBean) {
        HashMap<String, Object> param = new HashMap<>();
        int total = portMapper.findAttractCount(attractBean);
        int start = (page-1)*rows;
        List<AttractBean> list = portMapper.findAttractPage(start,rows,attractBean);
        param.put("total",total);
        param.put("rows",list);
        return param;
    }


}
