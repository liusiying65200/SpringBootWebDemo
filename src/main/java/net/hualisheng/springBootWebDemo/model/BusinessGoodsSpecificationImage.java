package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class BusinessGoodsSpecificationImage {
    private Integer id;

    private Integer businessId;

    private Integer goodsCategoryId;

    private Integer businessGoodsSpecId;

    private String url;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Integer goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public Integer getBusinessGoodsSpecId() {
        return businessGoodsSpecId;
    }

    public void setBusinessGoodsSpecId(Integer businessGoodsSpecId) {
        this.businessGoodsSpecId = businessGoodsSpecId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}