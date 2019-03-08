package com.jk.pojo;

public class ExtensionBean {

    //推广id
    private  Integer extensionId;
    //推广商品
    private  String  extensionCommodity;
    //商品货号
    private  String  extensionGoods;
    //商品规格
    private String   extensionSpecifications;
    //生产厂家
    private String   extensionManufacturer;
    //批准文号
    private  String  extensionSymbol;
    //供应价格
    private Double  extensionprice;
    //库存
    private String  extensionStock;
    //推广佣金
    private String  extensionCommission;

    public Integer getExtensionId() {
        return extensionId;
    }

    public void setExtensionId(Integer extensionId) {
        this.extensionId = extensionId;
    }

    public String getExtensionCommodity() {
        return extensionCommodity;
    }

    public void setExtensionCommodity(String extensionCommodity) {
        this.extensionCommodity = extensionCommodity;
    }

    public String getExtensionGoods() {
        return extensionGoods;
    }

    public void setExtensionGoods(String extensionGoods) {
        this.extensionGoods = extensionGoods;
    }

    public String getExtensionSpecifications() {
        return extensionSpecifications;
    }

    public void setExtensionSpecifications(String extensionSpecifications) {
        this.extensionSpecifications = extensionSpecifications;
    }

    public String getExtensionManufacturer() {
        return extensionManufacturer;
    }

    public void setExtensionManufacturer(String extensionManufacturer) {
        this.extensionManufacturer = extensionManufacturer;
    }

    public String getExtensionSymbol() {
        return extensionSymbol;
    }

    public void setExtensionSymbol(String extensionSymbol) {
        this.extensionSymbol = extensionSymbol;
    }

    public Double getExtensionprice() {
        return extensionprice;
    }

    public void setExtensionprice(Double extensionprice) {
        this.extensionprice = extensionprice;
    }

    public String getExtensionStock() {
        return extensionStock;
    }

    public void setExtensionStock(String extensionStock) {
        this.extensionStock = extensionStock;
    }

    public String getExtensionCommission() {
        return extensionCommission;
    }

    public void setExtensionCommission(String extensionCommission) {
        this.extensionCommission = extensionCommission;
    }

    @Override
    public String toString() {
        return "ExtensionBean{" +
                "extensionId=" + extensionId +
                ", extensionCommodity='" + extensionCommodity + '\'' +
                ", extensionGoods='" + extensionGoods + '\'' +
                ", extensionSpecifications='" + extensionSpecifications + '\'' +
                ", extensionManufacturer='" + extensionManufacturer + '\'' +
                ", extensionSymbol='" + extensionSymbol + '\'' +
                ", extensionprice=" + extensionprice +
                ", extensionStock='" + extensionStock + '\'' +
                ", extensionCommission='" + extensionCommission + '\'' +
                '}';
    }
}
