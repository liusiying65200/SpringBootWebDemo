package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class LbdjActityBack {
    private Integer id;

    private Integer businessId;

    private Integer actId;

    private Integer consumeFee;

    private Integer rulesType;

    private Integer backFee;

    private String saleName;

    private String customerName;

    private Integer status;

    private Date updateTime;

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

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Integer getConsumeFee() {
        return consumeFee;
    }

    public void setConsumeFee(Integer consumeFee) {
        this.consumeFee = consumeFee;
    }

    public Integer getRulesType() {
        return rulesType;
    }

    public void setRulesType(Integer rulesType) {
        this.rulesType = rulesType;
    }

    public Integer getBackFee() {
        return backFee;
    }

    public void setBackFee(Integer backFee) {
        this.backFee = backFee;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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
}