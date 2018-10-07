package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class BusinessGoodsSpecification {
    private Integer id;

    private Integer businessGoodsId;

    private Integer goodsSpecId;

    private Double goodsSpecPrice;

    private Double goodsRepair;

    private Double distribution;

    private Double scale;

    private Double disassembly;

    private String brand;

    private String model;

    private Date createTime;

    private Byte isDelete;

    private Integer minimumServicefee;

    private Double discount;

    private Double azDiscount;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessGoodsId() {
        return businessGoodsId;
    }

    public void setBusinessGoodsId(Integer businessGoodsId) {
        this.businessGoodsId = businessGoodsId;
    }

    public Integer getGoodsSpecId() {
        return goodsSpecId;
    }

    public void setGoodsSpecId(Integer goodsSpecId) {
        this.goodsSpecId = goodsSpecId;
    }

    public Double getGoodsSpecPrice() {
        return goodsSpecPrice;
    }

    public void setGoodsSpecPrice(Double goodsSpecPrice) {
        this.goodsSpecPrice = goodsSpecPrice;
    }

    public Double getGoodsRepair() {
        return goodsRepair;
    }

    public void setGoodsRepair(Double goodsRepair) {
        this.goodsRepair = goodsRepair;
    }

    public Double getDistribution() {
        return distribution;
    }

    public void setDistribution(Double distribution) {
        this.distribution = distribution;
    }

    public Double getScale() {
        return scale;
    }

    public void setScale(Double scale) {
        this.scale = scale;
    }

    public Double getDisassembly() {
        return disassembly;
    }

    public void setDisassembly(Double disassembly) {
        this.disassembly = disassembly;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getMinimumServicefee() {
        return minimumServicefee;
    }

    public void setMinimumServicefee(Integer minimumServicefee) {
        this.minimumServicefee = minimumServicefee;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getAzDiscount() {
        return azDiscount;
    }

    public void setAzDiscount(Double azDiscount) {
        this.azDiscount = azDiscount;
    }
}