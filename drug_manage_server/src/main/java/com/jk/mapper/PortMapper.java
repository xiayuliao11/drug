package com.jk.mapper;

import com.jk.pojo.AreaBean;
import com.jk.pojo.SiteBean;
import com.jk.pojo.UserBean;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PortMapper {
    //查询用户信息
    @Select("select * from drug_user where id=#{id}")
    UserBean findUserById(Integer id);
    //修改密码
    @Update("update drug_user set userPwd=#{userNewPwd} where id=#{id} ")
    Boolean updateUserPwd(UserBean userBean);

    @Insert("insert into t_site(cityid,detailedAddress,phone,postcode,provinceId) VALUES" +
            "(#{cityid},#{detailedAddress},#{phone},#{postcode},#{provinceId})")
    String saveSite(SiteBean siteBean);

    int findSiteCount();

    List<SiteBean> findSitePage(@Param("start") int start, @Param("rows") Integer rows);

    @Delete("delete from t_site where id=#{userId}")
    void delById(Integer userId);

    @Select("select * from drug_area where pid=#{id}")
    List<AreaBean> findAreaList(Integer id);


    @Select("select * from t_site where id=#{id}")
    SiteBean findSiteList(Integer id);

    @Update("update t_site  set cityid=#{cityid},consignee=#{consignee},detailedAddress=#{detailedAddress}" +
            ",phone=#{phone},postcode=#{postcode},provinceId=#{provinceId} where id=#{id} ")
    void updateSite(SiteBean siteBean);
}
