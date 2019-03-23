package com.jk.service;


import com.jk.pojo.*;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

public interface PortsService {

    UserBean findUserById(Integer id);

    Boolean updateUserPwd(UserBean userBean);

    void saveSite(SiteBean siteBean);

    List<SiteBean> findSitePage();

    void delById(Integer userId);

    List<AreaBean> findAreaList(Integer id);

    SiteBean findSiteList(Integer id);

    List<ProductBean> findProductPage(ProductBean productBean);

    void batchDownById(Integer[] ids);

    void batchUpById(Integer[] ids);

    Boolean saveProduct(ProductBean productBean);

    ProductBean findProduct(Integer id);

    void delProduct(Integer id);

    List<DrugTypeBean> findDrugType(Integer id);

    List<AgentiaBean> findAgentia();

    void saveAttract(AttractBean attractBean);

    HashMap<String, Object> findAttractPage(Integer page, Integer rows, AttractBean attractBean);

    HashMap<String, Object> findAgencyPage(Integer page, Integer rows, ProductsBean productsBean);
}
