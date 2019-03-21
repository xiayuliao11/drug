package com.jk.pojo;

public class MedicineBean {

    private  Integral id;
    private  String picture;
    private  String  commodityInformation;
    private  String specifications;
    private  Double unitPrice;

    public MedicineBean() {
    }


    public Integral getId() {
        return this.id;
    }

    public String getPicture() {
        return this.picture;
    }

    public String getCommodityInformation() {
        return this.commodityInformation;
    }

    public String getSpecifications() {
        return this.specifications;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setId(Integral id) {
        this.id = id;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setCommodityInformation(String commodityInformation) {
        this.commodityInformation = commodityInformation;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof MedicineBean)) return false;
        final MedicineBean other = (MedicineBean) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$picture = this.getPicture();
        final Object other$picture = other.getPicture();
        if (this$picture == null ? other$picture != null : !this$picture.equals(other$picture)) return false;
        final Object this$commodityInformation = this.getCommodityInformation();
        final Object other$commodityInformation = other.getCommodityInformation();
        if (this$commodityInformation == null ? other$commodityInformation != null : !this$commodityInformation.equals(other$commodityInformation))
            return false;
        final Object this$specifications = this.getSpecifications();
        final Object other$specifications = other.getSpecifications();
        if (this$specifications == null ? other$specifications != null : !this$specifications.equals(other$specifications))
            return false;
        final Object this$unitPrice = this.getUnitPrice();
        final Object other$unitPrice = other.getUnitPrice();
        if (this$unitPrice == null ? other$unitPrice != null : !this$unitPrice.equals(other$unitPrice)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof MedicineBean;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $picture = this.getPicture();
        result = result * PRIME + ($picture == null ? 43 : $picture.hashCode());
        final Object $commodityInformation = this.getCommodityInformation();
        result = result * PRIME + ($commodityInformation == null ? 43 : $commodityInformation.hashCode());
        final Object $specifications = this.getSpecifications();
        result = result * PRIME + ($specifications == null ? 43 : $specifications.hashCode());
        final Object $unitPrice = this.getUnitPrice();
        result = result * PRIME + ($unitPrice == null ? 43 : $unitPrice.hashCode());
        return result;
    }

    public String toString() {
        return "MedicineBean(id=" + this.getId() + ", picture=" + this.getPicture() + ", commodityInformation=" + this.getCommodityInformation() + ", specifications=" + this.getSpecifications() + ", unitPrice=" + this.getUnitPrice() + ")";
    }
}
