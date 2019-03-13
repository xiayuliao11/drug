package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface PortMapper {
    //查询用户信息
    @Select("select * from drug_user where id=#{id}")
    UserBean findUserById(Integer id);
    //修改密码
    @Update("update drug_user set userPwd=#{userNewPwd} where id=#{id} ")
    Boolean updateUserPwd(UserBean userBean);

    @Insert("insert into t_site(cityid,consignee,detailedAddress,phone,postcode,provinceId) VALUES" +
            "(#{cityid},#{consignee},#{detailedAddress},#{phone},#{postcode},#{provinceId})")
    void saveSite(SiteBean siteBean);

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

    List<ProductBean> findProductPage(ProductBean productBean);

    void batchDownById(Integer[] ids);

    void batchUpById(Integer[] ids);

    void saveProduct(ProductBean productBean);

    @Select("SELECT * FROM drug_product p WHERE p.productId = #{id}")
    ProductBean findProduct(Integer id);

    @Delete("delete from drug_product where productId=#{id}")
    void delProduct(Integer id);

    @Select("select * from drug_type where pid=#{id}")
    List<DrugTypeBean> findDrugType(Integer id);

    @Select("select * from drug_agentia")
    List<AgentiaBean> findAgentia();

    void updateProduct(ProductBean productBean);

    void saveAttract(AttractBean attractBean);
}
