package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class GoodsAttribute {
    private Integer id;

    private Integer specId;

    private String attrCode;

    private String attrName;

    private Integer attrPrice;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public String getAttrCode() {
        return attrCode;
    }

    public void setAttrCode(String attrCode) {
        this.attrCode = attrCode == null ? null : attrCode.trim();
    }

    public String getAttrName() {
        return attrName;
    }

    public void setAttrName(String attrName) {
        this.attrName = attrName == null ? null : attrName.trim();
    }

    public Integer getAttrPrice() {
        return attrPrice;
    }

    public void setAttrPrice(Integer attrPrice) {
        this.attrPrice = attrPrice;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}