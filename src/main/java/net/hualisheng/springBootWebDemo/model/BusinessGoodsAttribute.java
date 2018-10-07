package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class BusinessGoodsAttribute {
    private Integer id;

    private Integer businessGoodsSpecId;

    private Integer goodsAttributeId;

    private Double attributePrice;

    private Date createTime;

    private Byte isDelete;

    private String attributeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessGoodsSpecId() {
        return businessGoodsSpecId;
    }

    public void setBusinessGoodsSpecId(Integer businessGoodsSpecId) {
        this.businessGoodsSpecId = businessGoodsSpecId;
    }

    public Integer getGoodsAttributeId() {
        return goodsAttributeId;
    }

    public void setGoodsAttributeId(Integer goodsAttributeId) {
        this.goodsAttributeId = goodsAttributeId;
    }

    public Double getAttributePrice() {
        return attributePrice;
    }

    public void setAttributePrice(Double attributePrice) {
        this.attributePrice = attributePrice;
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

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }
}