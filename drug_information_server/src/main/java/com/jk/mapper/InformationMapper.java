package com.jk.mapper;

import com.jk.pojo.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

public interface InformationMapper {

    /**
     * 查询树信息
     * @return
     */
    //@Select("select * from t_tree")
    List<TreeBean> queryTree();

    /**
     * 新增企业信息
     * @param enterpriseBean
     */
    void saveEnterprise( EnterpriseBean enterpriseBean);

    /**
     * 新增代理信息
     * @param productsBean
     */
    void saveAgency( ProductsBean productsBean);

    /**
     * 查询审核列表
     * @return
     */
    List<AuditBean> queryAudit();

    /**
     * 查询代理信息
     * @return
     */
    List<ProductsBean> queryProduct();

    /**
     * 删除代理信息
     * @param ids
     */
    void deleteAgency(@Param("ids") Integer ids);

    /**
     * 修改代理信息
     * @param productsBean
     */
    void updateAgency( ProductsBean productsBean);

    /**
     * 回显代理信息
     * @param productsId
     * @return
     */
    ProductsBean findAgencyById( Integer productsId);

    /**
     * 查询类型(三级联动)
     * @param id
     * @return
     */
    @Select("select * from drug_type where pid=#{id}")
    List<TypeBean> findDrugType(Integer id);

    /**
     * 查询地区(三级联动)
     * @param id
     * @return
     */
    @Select("select * from drug_area where pid=#{id}")
    List<AreaBean> findDrugArea(Integer id);

}
