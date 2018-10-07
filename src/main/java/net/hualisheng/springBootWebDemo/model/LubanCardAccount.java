package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class LubanCardAccount {
    private Integer id;

    private Integer actId;

    private Integer businessId;

    private Integer lubanCardId;

    private String cardSn;

    private String cardName;

    private Double discount;

    private Double lubanCoin;

    private Double coinBalance;

    private Date startTime;

    private Date endTime;

    private Date createTime;

    private Date updateTime;

    private Integer version;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActId() {
        return actId;
    }

    public void setActId(Integer actId) {
        this.actId = actId;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public Integer getLubanCardId() {
        return lubanCardId;
    }

    public void setLubanCardId(Integer lubanCardId) {
        this.lubanCardId = lubanCardId;
    }

    public String getCardSn() {
        return cardSn;
    }

    public void setCardSn(String cardSn) {
        this.cardSn = cardSn == null ? null : cardSn.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getLubanCoin() {
        return lubanCoin;
    }

    public void setLubanCoin(Double lubanCoin) {
        this.lubanCoin = lubanCoin;
    }

    public Double getCoinBalance() {
        return coinBalance;
    }

    public void setCoinBalance(Double coinBalance) {
        this.coinBalance = coinBalance;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }
}