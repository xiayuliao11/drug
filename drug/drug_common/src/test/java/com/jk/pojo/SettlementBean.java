package com.jk.pojo;

public class SettlementBean {

    private Integer settlementId;   // id
    private  String settlementNumber; // 订单号
    private String settlementName; //  商品名称

    private  String  settlementSpecifications;// 规格
    private  String settlementEnterprise; //  采购企业
    private  Double settlementPrice; // 单价
    private  Double settlementPayment; //实结货款
    private Integer settlementPromotion; // 促销
    private Integer settlementCommission;//推广佣金
    private Double  settlementMoney;//应收金额
    private Integer settlementState;//结算状态


    /*get Set 方法*/

    public Integer getSettlementId() {
        return settlementId;
    }

    public String getSettlementNumber() {
        return settlementNumber;
    }

    public String getSettlementName() {
        return settlementName;
    }

    public String getSettlementSpecifications() {
        return settlementSpecifications;
    }

    public String getSettlementEnterprise() {
        return settlementEnterprise;
    }

    public Double getSettlementPrice() {
        return settlementPrice;
    }

    public Double getSettlementPayment() {
        return settlementPayment;
    }

    public Integer getSettlementPromotion() {
        return settlementPromotion;
    }

    public Integer getSettlementCommission() {
        return settlementCommission;
    }

    public Double getSettlementMoney() {
        return settlementMoney;
    }

    public Integer getSettlementState() {
        return settlementState;
    }

    public void setSettlementId(Integer settlementId) {
        this.settlementId = settlementId;
    }

    public void setSettlementNumber(String settlementNumber) {
        this.settlementNumber = settlementNumber;
    }

    public void setSettlementName(String settlementName) {
        this.settlementName = settlementName;
    }

    public void setSettlementSpecifications(String settlementSpecifications) {
        this.settlementSpecifications = settlementSpecifications;
    }

    public void setSettlementEnterprise(String settlementEnterprise) {
        this.settlementEnterprise = settlementEnterprise;
    }

    public void setSettlementPrice(Double settlementPrice) {
        this.settlementPrice = settlementPrice;
    }

    public void setSettlementPayment(Double settlementPayment) {
        this.settlementPayment = settlementPayment;
    }

    public void setSettlementPromotion(Integer settlementPromotion) {
        this.settlementPromotion = settlementPromotion;
    }

    public void setSettlementCommission(Integer settlementCommission) {
        this.settlementCommission = settlementCommission;
    }

    public void setSettlementMoney(Double settlementMoney) {
        this.settlementMoney = settlementMoney;
    }

    public void setSettlementState(Integer settlementState) {
        this.settlementState = settlementState;
    }
}
