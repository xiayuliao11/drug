package com.jk.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.regex.Pattern;

public class SupplierDrugs {

    //编号
    private Integer id;
    //药品名称
    private String drugName;
    //生产厂家
    private String manufacturer;
    //采购价
    private Integer purchasePrice;
    //规格
    private String specifications;
    //有效期限
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    private Date validityPeriod;
    //包装数量
    private Integer packageQuantity;
    //库存
    private Integer stock;
    //盒
    private Integer boxCount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDrugName() {
        return drugName;
    }

    public void setDrugName(String drugName) {
        this.drugName = drugName;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Integer getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(Integer purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Date getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(Date validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    public Integer getPackageQuantity() {
        return packageQuantity;
    }

    public void setPackageQuantity(Integer packageQuantity) {
        this.packageQuantity = packageQuantity;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getBoxCount() {
        return boxCount;
    }

    public void setBoxCount(Integer boxCount) {
        this.boxCount = boxCount;
    }

    @Override
    public String toString() {
        return "SupplierDrugs{" +
                "id=" + id +
                ", drugName='" + drugName + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", purchasePrice=" + purchasePrice +
                ", specifications='" + specifications + '\'' +
                ", validityPeriod=" + validityPeriod +
                ", packageQuantity=" + packageQuantity +
                ", stock=" + stock +
                ", boxCount=" + boxCount +
                '}';
    }
}
