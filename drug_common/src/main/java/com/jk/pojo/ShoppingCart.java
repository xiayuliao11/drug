package com.jk.pojo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ShoppingCart implements Serializable {

    //购物车商品id
    private Integer id;
    //购物车商品名称
    private String name;
    //购物车商品规格
    private String specifications;
    //购物车商品单价
    private Integer unitPrice;
    //购物车单个商品数量
    private Integer count;
    //购物车商品小计
    private Integer subtotal;


    //新加字段
    private Integer userid;    //用户id
    private String imgg;

}
