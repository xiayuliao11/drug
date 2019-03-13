package com.jk.pojo;

public class SiteBean {
    private Integer id; //地址id
    private String  consignee;  //收货人
    private Integer  provinceId;//省id
    private String  provinceName;//省名称
    private Integer  cityid;//市id
    private String  cityName;//市名称
    private String detailedAddress;//详细地址
    private String postcode;  //邮编
    private String  phone;  //电话

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getConsignee() {
        return consignee;
    }

    public void setConsignee(String consignee) {
        this.consignee = consignee;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityid() {
        return cityid;
    }

    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    public String getDetailedAddress() {
        return detailedAddress;
    }

    public void setDetailedAddress(String detailedAddress) {
        this.detailedAddress = detailedAddress;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "SiteBean{" +
                "consignee='" + consignee + '\'' +
                ", provinceId=" + provinceId +
                ", cityid=" + cityid +
                ", detailedAddress='" + detailedAddress + '\'' +
                ", postcode='" + postcode + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
