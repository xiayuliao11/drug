package com.jk.pojo;

import com.jk.constant.ConstanType;

public class ProductsBean {

    private Integer productsId;
    private String productsName; //产品名称
    private Integer productsType; //产品类型1
    private String productsCommonname; //产品通用名称
    private String productsManufacturer;//生产厂家
    private String productsBrand;//品牌
    private String approvalNumber;//编号
    private String specifications;//规格
    private Integer goodsPrice;//商品价格
    private Integer quantity;//交易量
    private String createTime= ConstanType.CURRENT_SYSTEM_TIME; //发布时间
    private Integer productsDistrict;//代理区域区
    private String productsChannel; //销售渠道
    private Integer productsIndate; //有效期
    private String productsImg;//产品图片
    private String productsDetail; //需求描述
    private String productsLinkman; //联系人
    private String productsPhone; //联系电话
    private String productsArea; //联系地址
    private Integer productsTyped; //类型2
    private Integer productsTyping; //类型3
    private Integer productsProvince; //省
    private Integer productsCity;//市
    private String productsProvinceName;
    private String productsCityName;
    private String productsDistrictName;
    //业务字段
    private String producttypeName;

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public Integer getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(Integer goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getProductsProvinceName() {
        return productsProvinceName;
    }

    public void setProductsProvinceName(String productsProvinceName) {
        this.productsProvinceName = productsProvinceName;
    }

    public String getProductsCityName() {
        return productsCityName;
    }

    public void setProductsCityName(String productsCityName) {
        this.productsCityName = productsCityName;
    }

    public String getProductsDistrictName() {
        return productsDistrictName;
    }

    public void setProductsDistrictName(String productsDistrictName) {
        this.productsDistrictName = productsDistrictName;
    }

    public Integer getProductsId() {
        return productsId;
    }

    public void setProductsId(Integer productsId) {
        this.productsId = productsId;
    }

    public String getProductsName() {
        return productsName;
    }

    public void setProductsName(String productsName) {
        this.productsName = productsName;
    }

    public Integer getProductsType() {
        return productsType;
    }

    public void setProductsType(Integer productsType) {
        this.productsType = productsType;
    }

    public String getProductsCommonname() {
        return productsCommonname;
    }

    public void setProductsCommonname(String productsCommonname) {
        this.productsCommonname = productsCommonname;
    }

    public String getProductsManufacturer() {
        return productsManufacturer;
    }

    public void setProductsManufacturer(String productsManufacturer) {
        this.productsManufacturer = productsManufacturer;
    }

    public String getProductsBrand() {
        return productsBrand;
    }

    public void setProductsBrand(String productsBrand) {
        this.productsBrand = productsBrand;
    }

    public Integer getProductsDistrict() {
        return productsDistrict;
    }

    public void setProductsDistrict(Integer productsDistrict) {
        this.productsDistrict = productsDistrict;
    }

    public String getProductsChannel() {
        return productsChannel;
    }

    public void setProductsChannel(String productsChannel) {
        this.productsChannel = productsChannel;
    }

    public Integer getProductsIndate() {
        return productsIndate;
    }

    public void setProductsIndate(Integer productsIndate) {
        this.productsIndate = productsIndate;
    }

    public String getProductsImg() {
        return productsImg;
    }

    public void setProductsImg(String productsImg) {
        this.productsImg = productsImg;
    }

    public String getProductsDetail() {
        return productsDetail;
    }

    public void setProductsDetail(String productsDetail) {
        this.productsDetail = productsDetail;
    }

    public String getProductsLinkman() {
        return productsLinkman;
    }

    public void setProductsLinkman(String productsLinkman) {
        this.productsLinkman = productsLinkman;
    }

    public String getProductsPhone() {
        return productsPhone;
    }

    public void setProductsPhone(String productsPhone) {
        this.productsPhone = productsPhone;
    }

    public String getProductsArea() {
        return productsArea;
    }

    public void setProductsArea(String productsArea) {
        this.productsArea = productsArea;
    }

    public String getProducttypeName() {
        return producttypeName;
    }

    public void setProducttypeName(String producttypeName) {
        this.producttypeName = producttypeName;
    }

    public Integer getProductsTyped() {
        return productsTyped;
    }

    public void setProductsTyped(Integer productsTyped) {
        this.productsTyped = productsTyped;
    }

    public Integer getProductsTyping() {
        return productsTyping;
    }

    public void setProductsTyping(Integer productsTyping) {
        this.productsTyping = productsTyping;
    }

    public Integer getProductsProvince() {
        return productsProvince;
    }

    public void setProductsProvince(Integer productsProvince) {
        this.productsProvince = productsProvince;
    }

    public Integer getProductsCity() {
        return productsCity;
    }

    public void setProductsCity(Integer productsCity) {
        this.productsCity = productsCity;
    }

    @Override
    public String toString() {
        return "ProductsBean{" +
                "productsId=" + productsId +
                ", productsName='" + productsName + '\'' +
                ", productsType=" + productsType +
                ", productsCommonname='" + productsCommonname + '\'' +
                ", productsManufacturer='" + productsManufacturer + '\'' +
                ", productsBrand='" + productsBrand + '\'' +
                ", productsDistrict=" + productsDistrict +
                ", productsChannel='" + productsChannel + '\'' +
                ", productsIndate=" + productsIndate +
                ", productsImg='" + productsImg + '\'' +
                ", productsDetail='" + productsDetail + '\'' +
                ", productsLinkman='" + productsLinkman + '\'' +
                ", productsPhone='" + productsPhone + '\'' +
                ", productsArea='" + productsArea + '\'' +
                ", productsTyped=" + productsTyped +
                ", productsTyping=" + productsTyping +
                ", productsProvince=" + productsProvince +
                ", productsCity=" + productsCity +
                ", producttypeName='" + producttypeName + '\'' +
                '}';
    }
}
