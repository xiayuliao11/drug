package com.jk.pojo;

public class SaleBean {

    //销售ID
    private  Integer id;
    //产品名
    private String  saleName;
    //下单时间
    private String  lowerTime;
    //支付时间
    private  String PaymentTime;
    //采购商
    private  String saleAddress;
    //采购数量
    private Integer saleCount;
    //价格
    private Integer saleMoney;
    /**
     * 1--待发货
     * 2--配送中
     * 3--待收货
     * 4--已完成
     * 5--已关闭
     * 6--待支付
     */
    private Integer saleStatus;
    //推广
    private Integer saleExtension;
    //活动
    private Integer saleActivity;

    private Integer invoiceId;
    private String  invoiceName;

    private  String start;
    private  String  end;


    public Integer getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(Integer invoiceId) {
        this.invoiceId = invoiceId;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName;
    }

    public String getLowerTime() {
        return lowerTime;
    }

    public void setLowerTime(String lowerTime) {
        this.lowerTime = lowerTime;
    }

    public String getPaymentTime() {
        return PaymentTime;
    }

    public void setPaymentTime(String paymentTime) {
        PaymentTime = paymentTime;
    }

    public String getSaleAddress() {
        return saleAddress;
    }

    public void setSaleAddress(String saleAddress) {
        this.saleAddress = saleAddress;
    }

    public Integer getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(Integer saleCount) {
        this.saleCount = saleCount;
    }

    public Integer getSaleMoney() {
        return saleMoney;
    }

    public void setSaleMoney(Integer saleMoney) {
        this.saleMoney = saleMoney;
    }

    public Integer getSaleStatus() {
        return saleStatus;
    }

    public void setSaleStatus(Integer saleStatus) {
        this.saleStatus = saleStatus;
    }

    public Integer getSaleExtension() {
        return saleExtension;
    }

    public void setSaleExtension(Integer saleExtension) {
        this.saleExtension = saleExtension;
    }

    public Integer getSaleActivity() {
        return saleActivity;
    }

    public void setSaleActivity(Integer saleActivity) {
        this.saleActivity = saleActivity;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "SaleBean{" +
                "id=" + id +
                ", saleName='" + saleName + '\'' +
                ", lowerTime='" + lowerTime + '\'' +
                ", PaymentTime='" + PaymentTime + '\'' +
                ", saleAddress='" + saleAddress + '\'' +
                ", saleCount=" + saleCount +
                ", saleMoney=" + saleMoney +
                ", saleStatus=" + saleStatus +
                ", saleExtension=" + saleExtension +
                ", saleActivity=" + saleActivity +
                ", invoiceId=" + invoiceId +
                ", invoiceName='" + invoiceName + '\'' +
                '}';
    }
}
