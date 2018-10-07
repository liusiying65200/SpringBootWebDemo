package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class BusinessAccount {
    private Integer id;

    private Integer businessId;

    private Float totalMoney;

    private Float lockMoney;

    private Double dynamicLines;

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

    public Float getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(Float totalMoney) {
        this.totalMoney = totalMoney;
    }

    public Float getLockMoney() {
        return lockMoney;
    }

    public void setLockMoney(Float lockMoney) {
        this.lockMoney = lockMoney;
    }

    public Double getDynamicLines() {
        return dynamicLines;
    }

    public void setDynamicLines(Double dynamicLines) {
        this.dynamicLines = dynamicLines;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}