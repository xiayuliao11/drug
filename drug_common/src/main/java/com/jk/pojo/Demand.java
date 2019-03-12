package com.jk.pojo;


import lombok.Data;
                    //求购信息表
@Data
public class Demand {
    //主键ID
    private Integer id;
    //产品名称
    private String  commddtiyName;

    //产品类型1级
    private Integer tyida;
    //临时字段名称
    private String tyidaName;
    //产品类型2级
    private Integer tyidb;
    //临时字段名称
    private String tyidbName;
    //产品类型3级
    private Integer tyidc;
    //临时字段名称
    private String tyidcName;

    //生产厂家
    private String manufacturer ;
    //产品品牌
    private String commddtiyBrand ;

    //求购区域1级
    private Integer  qya;
    //临时字段名称
    private String qyaName;
    //求购区域2级
    private Integer  qyb;
    //临时字段名称
    private String qybName;
    //求购区域3级
    private Integer  qyc;
    //临时字段名称
    private String qycName;

    //信息有效期
    private Integer validity;
    //产品图片
    private String img="空图";
    //需求简要描述
    private String describ;
    //联系人
    private String linkman;
    //联系电话
    private String phone;
    //联系地址
    private String site;
    //审核状态
    private String state;
}
