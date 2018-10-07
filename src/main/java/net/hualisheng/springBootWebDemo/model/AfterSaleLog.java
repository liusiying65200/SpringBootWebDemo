package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class AfterSaleLog {
    private Integer id;

    private Integer afterCusId;

    private Integer afterSerId;

    private Integer adminId;

    private String description;

    private Integer status;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAfterCusId() {
        return afterCusId;
    }

    public void setAfterCusId(Integer afterCusId) {
        this.afterCusId = afterCusId;
    }

    public Integer getAfterSerId() {
        return afterSerId;
    }

    public void setAfterSerId(Integer afterSerId) {
        this.afterSerId = afterSerId;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}