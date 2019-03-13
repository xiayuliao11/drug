package com.jk.pojo;

public class GoodsReturnedBean {

    //主键ID
    private Integer id;
    //订单号
    private String orderNumber;
    //退货单号
    private String salesReturnNumber;
    //退货商品
    private String salesReturnCommddtiy;
    //退货时间
    private String salesReturnTime;
    //采购商
    private String procurer;
    //申请人
    private String proposer;
    //退货金额
    private Double salesReturnPrice;
    //退货状态
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSalesReturnNumber() {
        return salesReturnNumber;
    }

    public void setSalesReturnNumber(String salesReturnNumber) {
        this.salesReturnNumber = salesReturnNumber;
    }

    public String getSalesReturnCommddtiy() {
        return salesReturnCommddtiy;
    }

    public void setSalesReturnCommddtiy(String salesReturnCommddtiy) {
        this.salesReturnCommddtiy = salesReturnCommddtiy;
    }

    public String getSalesReturnTime() {
        return salesReturnTime;
    }

    public void setSalesReturnTime(String salesReturnTime) {
        this.salesReturnTime = salesReturnTime;
    }

    public String getProcurer() {
        return procurer;
    }

    public void setProcurer(String procurer) {
        this.procurer = procurer;
    }

    public String getProposer() {
        return proposer;
    }

    public void setProposer(String proposer) {
        this.proposer = proposer;
    }

    public Double getSalesReturnPrice() {
        return salesReturnPrice;
    }

    public void setSalesReturnPrice(Double salesReturnPrice) {
        this.salesReturnPrice = salesReturnPrice;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
