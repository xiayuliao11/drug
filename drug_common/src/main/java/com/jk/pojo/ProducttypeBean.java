package com.jk.pojo;

public class ProducttypeBean {

    private Integer producttypeId;
    private String producttypeName;
    private Integer producttypePid;

    public Integer getProducttypeId() {
        return producttypeId;
    }

    public void setProducttypeId(Integer producttypeId) {
        this.producttypeId = producttypeId;
    }

    public String getProducttypeName() {
        return producttypeName;
    }

    public void setProducttypeName(String producttypeName) {
        this.producttypeName = producttypeName;
    }

    public Integer getProducttypePid() {
        return producttypePid;
    }

    public void setProducttypePid(Integer producttypePid) {
        this.producttypePid = producttypePid;
    }

    @Override
    public String toString() {
        return "ProducttypeBean{" +
                "producttypeId=" + producttypeId +
                ", producttypeName='" + producttypeName + '\'' +
                ", producttypePid=" + producttypePid +
                '}';
    }
}
