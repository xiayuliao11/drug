package com.jk.pojo;

public class CardBean {

             private Integer   bindingId;
             private  String            bindingBank;
             private Integer   bindingNumber;
             private String        bindingPassword;
             private String bindingPeople;
             private String  bindingPhone;




    public void setBindingId(Integer bindingId) {
        this.bindingId = bindingId;
    }

    public void setBindingBank(String bindingBank) {
        this.bindingBank = bindingBank;
    }

    public void setBindingNumber(Integer bindingNumber) {
        this.bindingNumber = bindingNumber;
    }

    public void setBindingPassword(String bindingPassword) {
        this.bindingPassword = bindingPassword;
    }

    public void setBindingPeople(String bindingPeople) {
        this.bindingPeople = bindingPeople;
    }

    public void setBindingPhone(String bindingPhone) {
        this.bindingPhone = bindingPhone;
    }

    public Integer getBindingId() {
        return bindingId;
    }

    public String getBindingBank() {
        return bindingBank;
    }

    public Integer getBindingNumber() {
        return bindingNumber;
    }

    public String getBindingPassword() {
        return bindingPassword;
    }

    public String getBindingPeople() {
        return bindingPeople;
    }

    public String getBindingPhone() {
        return bindingPhone;
    }
}
