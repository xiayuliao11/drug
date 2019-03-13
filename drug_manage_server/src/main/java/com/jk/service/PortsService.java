package com.jk.service;


import com.jk.pojo.*;

import java.util.HashMap;
import java.util.List;

public interface PortsService {

    UserBean findUserById(Integer id);

    Boolean updateUserPwd(UserBean userBean);

    void saveSite(SiteBean siteBean);

    HashMap<String, Object> findSitePage(Integer page, Integer rows);

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
}
