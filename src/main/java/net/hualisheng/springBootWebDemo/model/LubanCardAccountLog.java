package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class LubanCardAccountLog {
    private Integer id;

    private Integer businessId;

    private Integer lubanCardAccountId;

    private String orderSn;

    private String accountSn;

    private Double lubanCoinChange;

    private Double lubanCoinBalance;

    private Integer logType;

    private Date createTime;

    private String detailDesc;

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

    public Integer getLubanCardAccountId() {
        return lubanCardAccountId;
    }

    public void setLubanCardAccountId(Integer lubanCardAccountId) {
        this.lubanCardAccountId = lubanCardAccountId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getAccountSn() {
        return accountSn;
    }

    public void setAccountSn(String accountSn) {
        this.accountSn = accountSn == null ? null : accountSn.trim();
    }

    public Double getLubanCoinChange() {
        return lubanCoinChange;
    }

    public void setLubanCoinChange(Double lubanCoinChange) {
        this.lubanCoinChange = lubanCoinChange;
    }

    public Double getLubanCoinBalance() {
        return lubanCoinBalance;
    }

    public void setLubanCoinBalance(Double lubanCoinBalance) {
        this.lubanCoinBalance = lubanCoinBalance;
    }

    public Integer getLogType() {
        return logType;
    }

    public void setLogType(Integer logType) {
        this.logType = logType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getDetailDesc() {
        return detailDesc;
    }

    public void setDetailDesc(String detailDesc) {
        this.detailDesc = detailDesc == null ? null : detailDesc.trim();
    }
}