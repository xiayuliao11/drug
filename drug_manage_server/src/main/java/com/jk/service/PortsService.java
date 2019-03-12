package com.jk.service;


import com.jk.pojo.AreaBean;
import com.jk.pojo.SiteBean;
import com.jk.pojo.UserBean;

import java.util.HashMap;
import java.util.List;

public interface PortsService {

    UserBean findUserById(Integer id);

    Boolean updateUserPwd(UserBean userBean);

    String saveSite(SiteBean siteBean);

    HashMap<String, Object> findSitePage(Integer page, Integer rows);

    void delById(Integer userId);

    List<AreaBean> findAreaList(Integer id);

    SiteBean findSiteList(Integer id);
}
