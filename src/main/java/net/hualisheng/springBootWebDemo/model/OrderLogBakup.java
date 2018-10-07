package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class OrderLogBakup {
    private Integer orderLogId;

    private Integer orderId;

    private Integer workerId;

    private String workerPhone;

    private Integer orderStatus;

    private Integer orderExceptionStatus;

    private Integer adminId;

    private Float money;

    private String description;

    private Integer parentId;

    private Integer logStatus;

    private Date createTime;

    private String serviceTime;

    private Integer times;

    private Integer bisinessUserId;

    private Integer createbusiness;

    public Integer getOrderLogId() {
        return orderLogId;
    }

    public void setOrderLogId(Integer orderLogId) {
        this.orderLogId = orderLogId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerPhone() {
        return workerPhone;
    }

    public void setWorkerPhone(String workerPhone) {
        this.workerPhone = workerPhone == null ? null : workerPhone.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getOrderExceptionStatus() {
        return orderExceptionStatus;
    }

    public void setOrderExceptionStatus(Integer orderExceptionStatus) {
        this.orderExceptionStatus = orderExceptionStatus;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Float getMoney() {
        return money;
    }

    public void setMoney(Float money) {
        this.money = money;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getLogStatus() {
        return logStatus;
    }

    public void setLogStatus(Integer logStatus) {
        this.logStatus = logStatus;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime == null ? null : serviceTime.trim();
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }

    public Integer getBisinessUserId() {
        return bisinessUserId;
    }

    public void setBisinessUserId(Integer bisinessUserId) {
        this.bisinessUserId = bisinessUserId;
    }

    public Integer getCreatebusiness() {
        return createbusiness;
    }

    public void setCreatebusiness(Integer createbusiness) {
        this.createbusiness = createbusiness;
    }
}