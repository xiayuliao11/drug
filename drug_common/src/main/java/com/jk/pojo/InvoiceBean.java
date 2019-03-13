package com.jk.pojo;

public class InvoiceBean {

    private  Integer id;
    //发票类型
    private  String  invoiceType;
    //订单号
    private  Integer invoiceHao;
    //下单时间
    private  String  lowerTime;
    //采购企业
    private  String   address;
    //采购人姓名
    private  String   invoiceName;
    //发票状态
    private  Integer   status;
    //发票内容
    private  String   invoiceText;
    //发票金额
    private Integer   invoiceMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(String invoiceType) {
        this.invoiceType = invoiceType;
    }

    public Integer getInvoiceHao() {
        return invoiceHao;
    }

    public void setInvoiceHao(Integer invoiceHao) {
        this.invoiceHao = invoiceHao;
    }

    public String getLowerTime() {
        return lowerTime;
    }

    public void setLowerTime(String lowerTime) {
        this.lowerTime = lowerTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInvoiceName() {
        return invoiceName;
    }

    public void setInvoiceName(String invoiceName) {
        this.invoiceName = invoiceName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getInvoiceText() {
        return invoiceText;
    }

    public void setInvoiceText(String invoiceText) {
        this.invoiceText = invoiceText;
    }

    public Integer getInvoiceMoney() {
        return invoiceMoney;
    }

    public void setInvoiceMoney(Integer invoiceMoney) {
        this.invoiceMoney = invoiceMoney;
    }
}
