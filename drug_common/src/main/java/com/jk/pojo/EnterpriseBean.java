package com.jk.pojo;

import java.util.Date;

public class EnterpriseBean {

    private Integer enterpriseId;
    private String enterpriseType;
    private String enterpriseName;
    private String businessNumber;
    private String enterpriseLinkman;
    private String enterprisePhone;
    private String enterpriseArea;
    private String enterpriseAddress;
    private String purchasingArea;
    private Integer certificateNumber;
    private String openingDate;
    private Integer validityDate;

    public Integer getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Integer enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(String enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public String getBusinessNumber() {
        return businessNumber;
    }

    public void setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
    }

    public String getEnterpriseLinkman() {
        return enterpriseLinkman;
    }

    public void setEnterpriseLinkman(String enterpriseLinkman) {
        this.enterpriseLinkman = enterpriseLinkman;
    }

    public String getEnterprisePhone() {
        return enterprisePhone;
    }

    public void setEnterprisePhone(String enterprisePhone) {
        this.enterprisePhone = enterprisePhone;
    }

    public String getEnterpriseArea() {
        return enterpriseArea;
    }

    public void setEnterpriseArea(String enterpriseArea) {
        this.enterpriseArea = enterpriseArea;
    }

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }

    public String getPurchasingArea() {
        return purchasingArea;
    }

    public void setPurchasingArea(String purchasingArea) {
        this.purchasingArea = purchasingArea;
    }

    public Integer getCertificateNumber() {
        return certificateNumber;
    }

    public void setCertificateNumber(Integer certificateNumber) {
        this.certificateNumber = certificateNumber;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public Integer getValidityDate() {
        return validityDate;
    }

    public void setValidityDate(Integer validityDate) {
        this.validityDate = validityDate;
    }

    @Override
    public String toString() {
        return "EnterpriseBean{" +
                "enterpriseId=" + enterpriseId +
                ", enterpriseType='" + enterpriseType + '\'' +
                ", enterpriseName='" + enterpriseName + '\'' +
                ", businessNumber='" + businessNumber + '\'' +
                ", enterpriseLinkman='" + enterpriseLinkman + '\'' +
                ", enterprisePhone='" + enterprisePhone + '\'' +
                ", enterpriseArea='" + enterpriseArea + '\'' +
                ", enterpriseAddress='" + enterpriseAddress + '\'' +
                ", purchasingArea='" + purchasingArea + '\'' +
                ", certificateNumber=" + certificateNumber +
                ", openingDate='" + openingDate + '\'' +
                ", validityDate=" + validityDate +
                '}';
    }
}
