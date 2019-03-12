package com.jk.pojo;

public class ShoppingCart {

    //购物车商品id
    private Integer id;
    //购物车商品名称
    private String name;
    //购物车商品规格
    private String specifications;
    //购物车商品单价
    private double unitPrice;
    //购物车单个商品数量
    private Integer count;
    //购物车商品小计
    private Double subtotal;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specifications='" + specifications + '\'' +
                ", unitPrice=" + unitPrice +
                ", count=" + count +
                ", subtotal=" + subtotal +
                '}';
    }
}
