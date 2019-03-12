package com.jk.service;

import com.jk.mapper.PortMapper;
import com.jk.pojo.AreaBean;
import com.jk.pojo.SiteBean;
import com.jk.pojo.UserBean;
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
    public String saveSite(SiteBean siteBean) {
        if (siteBean.getId()!=null){
            portMapper.updateSite(siteBean);
        }else {
            portMapper.saveSite(siteBean);
            System.out.println("siteBean = [" + siteBean + "]");
        }
        return null;
    }

    /**
     * 查看地址信息
     * @param page
     * @param rows
     * @return
     */
    @Override
    public HashMap<String, Object> findSitePage(Integer page, Integer rows) {
        HashMap<String,Object> param =  new HashMap<String,Object>();
        int total=portMapper.findSiteCount();
        int start=(page-1)*rows;
        List<SiteBean> list = portMapper.findSitePage(start,rows);
        param.put("total",total);
        param.put("rows",list);
        return param;
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
}
