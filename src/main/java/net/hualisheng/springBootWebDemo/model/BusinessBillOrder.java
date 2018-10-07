package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class BusinessBillOrder {
    private Integer id;

    private Integer billId;

    private Integer orderId;

    private Integer status;

    private Date createTime;

    private Integer businessStatus;

    private Integer erpStatus;

    private Integer dealResult;

    private String isPay;

    private String billStatus;

    private String payObject;

    private Float platformMoney;

    private Float businessMoney;

    private Double money;

    private Integer orderType;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
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

    public Integer getBusinessStatus() {
        return businessStatus;
    }

    public void setBusinessStatus(Integer businessStatus) {
        this.businessStatus = businessStatus;
    }

    public Integer getErpStatus() {
        return erpStatus;
    }

    public void setErpStatus(Integer erpStatus) {
        this.erpStatus = erpStatus;
    }

    public Integer getDealResult() {
        return dealResult;
    }

    public void setDealResult(Integer dealResult) {
        this.dealResult = dealResult;
    }

    public String getIsPay() {
        return isPay;
    }

    public void setIsPay(String isPay) {
        this.isPay = isPay == null ? null : isPay.trim();
    }

    public String getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(String billStatus) {
        this.billStatus = billStatus == null ? null : billStatus.trim();
    }

    public String getPayObject() {
        return payObject;
    }

    public void setPayObject(String payObject) {
        this.payObject = payObject == null ? null : payObject.trim();
    }

    public Float getPlatformMoney() {
        return platformMoney;
    }

    public void setPlatformMoney(Float platformMoney) {
        this.platformMoney = platformMoney;
    }

    public Float getBusinessMoney() {
        return businessMoney;
    }

    public void setBusinessMoney(Float businessMoney) {
        this.businessMoney = businessMoney;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}