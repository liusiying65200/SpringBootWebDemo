package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class OrderFeeDetail {
    private Integer id;

    private Integer workerId;

    private Integer orderId;

    private Double originalMoney;

    private Double discountMoney;

    private Double money;

    private Integer deposit;

    private Double depositAward;

    private Double award;

    private Double infoMoney;

    private Float activityRate;

    private Double activityMoney;

    private Double agentPay;

    private String categoryName;

    private String gradeName;

    private Integer gradeNumber;

    private Date createTime;

    private String accountLogSn;

    private String remark;

    private Double brokerageRefundMoney;

    private Double bonusMoney;

    private Double makeGoodMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Double getOriginalMoney() {
        return originalMoney;
    }

    public void setOriginalMoney(Double originalMoney) {
        this.originalMoney = originalMoney;
    }

    public Double getDiscountMoney() {
        return discountMoney;
    }

    public void setDiscountMoney(Double discountMoney) {
        this.discountMoney = discountMoney;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Integer getDeposit() {
        return deposit;
    }

    public void setDeposit(Integer deposit) {
        this.deposit = deposit;
    }

    public Double getDepositAward() {
        return depositAward;
    }

    public void setDepositAward(Double depositAward) {
        this.depositAward = depositAward;
    }

    public Double getAward() {
        return award;
    }

    public void setAward(Double award) {
        this.award = award;
    }

    public Double getInfoMoney() {
        return infoMoney;
    }

    public void setInfoMoney(Double infoMoney) {
        this.infoMoney = infoMoney;
    }

    public Float getActivityRate() {
        return activityRate;
    }

    public void setActivityRate(Float activityRate) {
        this.activityRate = activityRate;
    }

    public Double getActivityMoney() {
        return activityMoney;
    }

    public void setActivityMoney(Double activityMoney) {
        this.activityMoney = activityMoney;
    }

    public Double getAgentPay() {
        return agentPay;
    }

    public void setAgentPay(Double agentPay) {
        this.agentPay = agentPay;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public Integer getGradeNumber() {
        return gradeNumber;
    }

    public void setGradeNumber(Integer gradeNumber) {
        this.gradeNumber = gradeNumber;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getAccountLogSn() {
        return accountLogSn;
    }

    public void setAccountLogSn(String accountLogSn) {
        this.accountLogSn = accountLogSn == null ? null : accountLogSn.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Double getBrokerageRefundMoney() {
        return brokerageRefundMoney;
    }

    public void setBrokerageRefundMoney(Double brokerageRefundMoney) {
        this.brokerageRefundMoney = brokerageRefundMoney;
    }

    public Double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(Double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public Double getMakeGoodMoney() {
        return makeGoodMoney;
    }

    public void setMakeGoodMoney(Double makeGoodMoney) {
        this.makeGoodMoney = makeGoodMoney;
    }
}