package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class OrderGoodsAttribute {
    private Integer id;

    private Integer orderGoodsSpecId;

    private Integer goodsAttributeId;

    private Float attributePrice;

    private Float attributeNumber;

    private Date createTime;

    private Float workerAttributePrice;

    private String attributeName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderGoodsSpecId() {
        return orderGoodsSpecId;
    }

    public void setOrderGoodsSpecId(Integer orderGoodsSpecId) {
        this.orderGoodsSpecId = orderGoodsSpecId;
    }

    public Integer getGoodsAttributeId() {
        return goodsAttributeId;
    }

    public void setGoodsAttributeId(Integer goodsAttributeId) {
        this.goodsAttributeId = goodsAttributeId;
    }

    public Float getAttributePrice() {
        return attributePrice;
    }

    public void setAttributePrice(Float attributePrice) {
        this.attributePrice = attributePrice;
    }

    public Float getAttributeNumber() {
        return attributeNumber;
    }

    public void setAttributeNumber(Float attributeNumber) {
        this.attributeNumber = attributeNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Float getWorkerAttributePrice() {
        return workerAttributePrice;
    }

    public void setWorkerAttributePrice(Float workerAttributePrice) {
        this.workerAttributePrice = workerAttributePrice;
    }

    public String getAttributeName() {
        return attributeName;
    }

    public void setAttributeName(String attributeName) {
        this.attributeName = attributeName == null ? null : attributeName.trim();
    }
}