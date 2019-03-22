package com.jk.pojo;

import com.jk.constant.ConstanType;

public class AttractBean {
    private Integer id;   //招商id
    private String headline; //招商标题
    private String overTime;//过期时间
    private String investment;//投资额度
    private String productName;//商品名称
    private String specifications;//规格
    private String approvalNumber;//国药准字
    private String manufacturer;//生产厂家
    private String drugNumber;//药品编号
    private Integer packagesNumber;//件装数
    private String trademark;//商标
    private String healthType;//医保类型
    private String catalogue;//医保类型
    private String  merchantsImg;//招商图片
    private String  details;//招商详细说明
    private String  cashDeposit;//需交保证金
    private String createTime = ConstanType.CURRENT_SYSTEM_TIME; //发布时间
    private Integer bigClass;
    private Integer centreClass;
    private Integer smallClass;
    private Integer  provinceId;//省id
    private String  provinceName;//省名称
    private Integer  cityid;//市id
    private String  cityName;//市名称

    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getBigClass() {
        return bigClass;
    }

    public void setBigClass(Integer bigClass) {
        this.bigClass = bigClass;
    }

    public Integer getCentreClass() {
        return centreClass;
    }

    public void setCentreClass(Integer centreClass) {
        this.centreClass = centreClass;
    }

    public Integer getSmallClass() {
        return smallClass;
    }

    public void setSmallClass(Integer smallClass) {
        this.smallClass = smallClass;
    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getOverTime() {
        return overTime;
    }

    public void setOverTime(String overTime) {
        this.overTime = overTime;
    }

    public String getInvestment() {
        return investment;
    }

    public void setInvestment(String investment) {
        this.investment = investment;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public String getApprovalNumber() {
        return approvalNumber;
    }

    public void setApprovalNumber(String approvalNumber) {
        this.approvalNumber = approvalNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(String drugNumber) {
        this.drugNumber = drugNumber;
    }

    public Integer getPackagesNumber() {
        return packagesNumber;
    }

    public void setPackagesNumber(Integer packagesNumber) {
        this.packagesNumber = packagesNumber;
    }

    public String getTrademark() {
        return trademark;
    }

    public void setTrademark(String trademark) {
        this.trademark = trademark;
    }


    public String getMerchantsImg() {
        return merchantsImg;
    }

    public void setMerchantsImg(String merchantsImg) {
        this.merchantsImg = merchantsImg;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCashDeposit() {
        return cashDeposit;
    }

    public void setCashDeposit(String cashDeposit) {
        this.cashDeposit = cashDeposit;
    }

    @Override
    public String toString() {
        return "AttractBean{" +
                "id=" + id +
                ", headline='" + headline + '\'' +
                ", overTime='" + overTime + '\'' +
                ", investment='" + investment + '\'' +
                ", productName='" + productName + '\'' +
                ", specifications='" + specifications + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", drugNumber='" + drugNumber + '\'' +
                ", packagesNumber=" + packagesNumber +
                ", trademark='" + trademark + '\'' +
                ", healthType='" + healthType + '\'' +
                ", catalogue='" + catalogue + '\'' +
                ", merchantsImg='" + merchantsImg + '\'' +
                ", details='" + details + '\'' +
                ", cashDeposit='" + cashDeposit + '\'' +
                ", createTime='" + createTime + '\'' +
                ", bigClass=" + bigClass +
                ", centreClass=" + centreClass +
                ", smallClass=" + smallClass +
                ", provinceId=" + provinceId +
                ", provinceName='" + provinceName + '\'' +
                ", cityid=" + cityid +
                ", cityName='" + cityName + '\'' +
                '}';
    }
}
