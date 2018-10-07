package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class OrderExceptionAddFee {
    private Integer id;

    private Integer orderId;

    private Integer paymentType;

    private Float lubanMoney;

    private Float businessMoney;

    private Integer checkResult;

    private Integer businessCheckResult;

    private String description;

    private Date updateTime;

    private Date createTime;

    private Integer recordStatus;

    private Integer orderlogId;

    private Integer ifPercentage;

    private String serviceImage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public Float getLubanMoney() {
        return lubanMoney;
    }

    public void setLubanMoney(Float lubanMoney) {
        this.lubanMoney = lubanMoney;
    }

    public Float getBusinessMoney() {
        return businessMoney;
    }

    public void setBusinessMoney(Float businessMoney) {
        this.businessMoney = businessMoney;
    }

    public Integer getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(Integer checkResult) {
        this.checkResult = checkResult;
    }

    public Integer getBusinessCheckResult() {
        return businessCheckResult;
    }

    public void setBusinessCheckResult(Integer businessCheckResult) {
        this.businessCheckResult = businessCheckResult;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getRecordStatus() {
        return recordStatus;
    }

    public void setRecordStatus(Integer recordStatus) {
        this.recordStatus = recordStatus;
    }

    public Integer getOrderlogId() {
        return orderlogId;
    }

    public void setOrderlogId(Integer orderlogId) {
        this.orderlogId = orderlogId;
    }

    public Integer getIfPercentage() {
        return ifPercentage;
    }

    public void setIfPercentage(Integer ifPercentage) {
        this.ifPercentage = ifPercentage;
    }

    public String getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(String serviceImage) {
        this.serviceImage = serviceImage == null ? null : serviceImage.trim();
    }
}