package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class GoodsCategory {
    private Integer id;

    private Integer parentId;

    private String categoryName;

    private Date createTime;

    private Integer level;

    private String servicesTypes;

    private Byte isDelete;

    private Float shareRate;

    private Boolean isShow;

    private String tipInfo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public String getServicesTypes() {
        return servicesTypes;
    }

    public void setServicesTypes(String servicesTypes) {
        this.servicesTypes = servicesTypes == null ? null : servicesTypes.trim();
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Float getShareRate() {
        return shareRate;
    }

    public void setShareRate(Float shareRate) {
        this.shareRate = shareRate;
    }

    public Boolean getIsShow() {
        return isShow;
    }

    public void setIsShow(Boolean isShow) {
        this.isShow = isShow;
    }

    public String getTipInfo() {
        return tipInfo;
    }

    public void setTipInfo(String tipInfo) {
        this.tipInfo = tipInfo == null ? null : tipInfo.trim();
    }
}