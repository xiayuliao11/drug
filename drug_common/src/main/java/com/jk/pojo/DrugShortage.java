package com.jk.pojo;


import lombok.Data;

import java.io.Serializable;

            //缺药登记
@Data
public class DrugShortage implements Serializable {
    //主键ID
    private Integer id;
    //商品名称
    private String commddtiyName;
    //生产厂家
    private String manufacturer ;
    //规格
    private String specification ;
    //代理区域
    private String territory ;
    //联系人
    private String linkman;
    //联系电话
    private String  phone;
}
