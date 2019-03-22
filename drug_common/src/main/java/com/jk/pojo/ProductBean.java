package com.jk.pojo;

import com.jk.constant.ConstanType;

public class ProductBean {
    private Integer productId;  //商品id
    private String  productName;//商品名称
    private String   cargoNumber;//商品货号
    private String   manufacturer;//生产厂家
    private String  specifications;//商品规格
    private String  approvalNumber;//批准文号
    private Double supplyPrice;//供应价格
    private Integer inventory;//库存
    private Integer goodsState;//商品状态
    private String releaseTime;//发布时间
    private Integer auditStatus = ConstanType.AUDIT_STATUS_ONE;//审核状态
    private Integer drugNumber;//药品编号
    private String commodityName;//商品别名
    private Integer  market;//是否拆零销售 1:是 2：否
    private Integer centreQuantity;//中包装数量
    private Integer bigQuantity;//大包装数量
    private Integer  control;//商品销售控制  1:普通药品 2：医院专供
    private String  parturitionTime;//生产日期
    private String  expirationDate;//保质期
    private Integer validity;//有效期
    private Double marketPrice;//市场价格
    private Double commodityPrices;//商品价格
    private Integer commodityStocks;//商品库存
    private String  commoditImages;//商品图片
    private String   commoditVideo;//商品展示视频
    private String  purchaserType;//采购商类型 1：医院 2：卫生院
     //3：诊所 4：药店
    private String  qualification;//商品资质
    private String  catalogue;//基药目录
    private String  healthType;//医保类型
    private Integer prescription;//是否处方
    private String ingredient;//主要成分
    private String drugFunction;//主治功能
    private String  drugTaboo;//禁忌
    private String  adverseReaction;//不良反应
    private String detail;//详细描述
    private String  attention;//注意事项
    private String drugToxicology;//药物毒理
    private String overdose;//药物过量
    private String  drugInteractions;//药物相互作用
    private String measure;//用法计量
    private String recommend;//店铺推荐
    private Integer InventorWarning;//库存警告数量
    private String  freight;//是否为免运费产品
    private Integer bigClass;
    private Integer centreClass;
    private Integer smallClass;
    private Integer agentiaId;

    public Integer getAgentiaId() {
        return agentiaId;
    }

    public void setAgentiaId(Integer agentiaId) {
        this.agentiaId = agentiaId;
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

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCargoNumber() {
        return cargoNumber;
    }

    public void setCargoNumber(String cargoNumber) {
        this.cargoNumber = cargoNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
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

    public Double getSupplyPrice() {
        return supplyPrice;
    }

    public void setSupplyPrice(Double supplyPrice) {
        this.supplyPrice = supplyPrice;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getGoodsState() {
        return goodsState;
    }

    public void setGoodsState(Integer goodsState) {
        this.goodsState = goodsState;
    }

    public String getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(String releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Integer auditStatus) {
        this.auditStatus = auditStatus;
    }

    public Integer getDrugNumber() {
        return drugNumber;
    }

    public void setDrugNumber(Integer drugNumber) {
        this.drugNumber = drugNumber;
    }

    public String getCommodityName() {
        return commodityName;
    }

    public void setCommodityName(String commodityName) {
        this.commodityName = commodityName;
    }

    public Integer getMarket() {
        return market;
    }

    public void setMarket(Integer market) {
        this.market = market;
    }

    public Integer getCentreQuantity() {
        return centreQuantity;
    }

    public void setCentreQuantity(Integer centreQuantity) {
        this.centreQuantity = centreQuantity;
    }

    public Integer getBigQuantity() {
        return bigQuantity;
    }

    public void setBigQuantity(Integer bigQuantity) {
        this.bigQuantity = bigQuantity;
    }

    public Integer getControl() {
        return control;
    }

    public void setControl(Integer control) {
        this.control = control;
    }

    public String getParturitionTime() {
        return parturitionTime;
    }

    public void setParturitionTime(String parturitionTime) {
        this.parturitionTime = parturitionTime;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getValidity() {
        return validity;
    }

    public void setValidity(Integer validity) {
        this.validity = validity;
    }

    public Double getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(Double marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Double getCommodityPrices() {
        return commodityPrices;
    }

    public void setCommodityPrices(Double commodityPrices) {
        this.commodityPrices = commodityPrices;
    }

    public Integer getCommodityStocks() {
        return commodityStocks;
    }

    public void setCommodityStocks(Integer commodityStocks) {
        this.commodityStocks = commodityStocks;
    }

    public String getCommoditImages() {
        return commoditImages;
    }

    public void setCommoditImages(String commoditImages) {
        this.commoditImages = commoditImages;
    }

    public String getCommoditVideo() {
        return commoditVideo;
    }

    public void setCommoditVideo(String commoditVideo) {
        this.commoditVideo = commoditVideo;
    }

    public String getPurchaserType() {
        return purchaserType;
    }

    public void setPurchaserType(String purchaserType) {
        this.purchaserType = purchaserType;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(String catalogue) {
        this.catalogue = catalogue;
    }

    public String getHealthType() {
        return healthType;
    }

    public void setHealthType(String healthType) {
        this.healthType = healthType;
    }

    public Integer getPrescription() {
        return prescription;
    }

    public void setPrescription(Integer prescription) {
        this.prescription = prescription;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getDrugFunction() {
        return drugFunction;
    }

    public void setDrugFunction(String drugFunction) {
        this.drugFunction = drugFunction;
    }

    public String getDrugTaboo() {
        return drugTaboo;
    }

    public void setDrugTaboo(String drugTaboo) {
        this.drugTaboo = drugTaboo;
    }

    public String getAdverseReaction() {
        return adverseReaction;
    }

    public void setAdverseReaction(String adverseReaction) {
        this.adverseReaction = adverseReaction;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getAttention() {
        return attention;
    }

    public void setAttention(String attention) {
        this.attention = attention;
    }

    public String getDrugToxicology() {
        return drugToxicology;
    }

    public void setDrugToxicology(String drugToxicology) {
        this.drugToxicology = drugToxicology;
    }

    public String getOverdose() {
        return overdose;
    }

    public void setOverdose(String overdose) {
        this.overdose = overdose;
    }

    public String getDrugInteractions() {
        return drugInteractions;
    }

    public void setDrugInteractions(String drugInteractions) {
        this.drugInteractions = drugInteractions;
    }

    public String getMeasure() {
        return measure;
    }

    public void setMeasure(String measure) {
        this.measure = measure;
    }

    public String getRecommend() {
        return recommend;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public Integer getInventorWarning() {
        return InventorWarning;
    }

    public void setInventorWarning(Integer inventorWarning) {
        InventorWarning = inventorWarning;
    }

    public String getFreight() {
        return freight;
    }

    public void setFreight(String freight) {
        this.freight = freight;
    }

    @Override
    public String toString() {
        return "ProductBean{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", cargoNumber='" + cargoNumber + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", specifications='" + specifications + '\'' +
                ", approvalNumber='" + approvalNumber + '\'' +
                ", supplyPrice=" + supplyPrice +
                ", inventory=" + inventory +
                ", goodsState=" + goodsState +
                ", releaseTime='" + releaseTime + '\'' +
                ", auditStatus=" + auditStatus +
                ", drugNumber=" + drugNumber +
                ", commodityName='" + commodityName + '\'' +
                ", market=" + market +
                ", centreQuantity=" + centreQuantity +
                ", bigQuantity=" + bigQuantity +
                ", control=" + control +
                ", parturitionTime='" + parturitionTime + '\'' +
                ", expirationDate='" + expirationDate + '\'' +
                ", validity=" + validity +
                ", marketPrice=" + marketPrice +
                ", commodityPrices=" + commodityPrices +
                ", commodityStocks=" + commodityStocks +
                ", commoditImages='" + commoditImages + '\'' +
                ", commoditVideo='" + commoditVideo + '\'' +
                ", purchaserType='" + purchaserType + '\'' +
                ", qualification='" + qualification + '\'' +
                ", catalogue='" + catalogue + '\'' +
                ", healthType='" + healthType + '\'' +
                ", prescription=" + prescription +
                ", ingredient='" + ingredient + '\'' +
                ", drugFunction='" + drugFunction + '\'' +
                ", drugTaboo='" + drugTaboo + '\'' +
                ", adverseReaction='" + adverseReaction + '\'' +
                ", detail='" + detail + '\'' +
                ", attention='" + attention + '\'' +
                ", drugToxicology='" + drugToxicology + '\'' +
                ", overdose='" + overdose + '\'' +
                ", drugInteractions='" + drugInteractions + '\'' +
                ", measure='" + measure + '\'' +
                ", recommend='" + recommend + '\'' +
                ", InventorWarning=" + InventorWarning +
                ", freight='" + freight + '\'' +
                '}';
    }
}
