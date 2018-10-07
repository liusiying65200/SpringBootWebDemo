package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class GoodsSpecification {
    private Integer id;

    private Integer goodsId;

    private String specName;

    private Float specPrice;

    private Byte isDelete;

    private Date createTime;

    private String remark;

    private String coverImage;

    private Float goodsRepair;

    private Float distribution;

    private Float scale;

    private Float disassembly;

    private Integer minimumServicefee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }

    public Float getSpecPrice() {
        return specPrice;
    }

    public void setSpecPrice(Float specPrice) {
        this.specPrice = specPrice;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getCoverImage() {
        return coverImage;
    }

    public void setCoverImage(String coverImage) {
        this.coverImage = coverImage == null ? null : coverImage.trim();
    }

    public Float getGoodsRepair() {
        return goodsRepair;
    }

    public void setGoodsRepair(Float goodsRepair) {
        this.goodsRepair = goodsRepair;
    }

    public Float getDistribution() {
        return distribution;
    }

    public void setDistribution(Float distribution) {
        this.distribution = distribution;
    }

    public Float getScale() {
        return scale;
    }

    public void setScale(Float scale) {
        this.scale = scale;
    }

    public Float getDisassembly() {
        return disassembly;
    }

    public void setDisassembly(Float disassembly) {
        this.disassembly = disassembly;
    }

    public Integer getMinimumServicefee() {
        return minimumServicefee;
    }

    public void setMinimumServicefee(Integer minimumServicefee) {
        this.minimumServicefee = minimumServicefee;
    }
}