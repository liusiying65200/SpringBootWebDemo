package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class ComplainHandle {
    private Integer id;

    private Integer complainId;

    private Integer isFound;

    private Integer level;

    private Integer type;

    private Integer deductGrouth;

    private Double pay;

    private String cusEvidence;

    private String worEvidence;

    private String description;

    private String signImgs;

    private Integer compensate;

    private Integer cashVoucher;

    private Integer integral;

    private Integer adminId;

    private Date createTime;

    private String leaderComment;

    private Integer leaderCheck;

    private Integer isModification;

    private Double deductDeposit;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getComplainId() {
        return complainId;
    }

    public void setComplainId(Integer complainId) {
        this.complainId = complainId;
    }

    public Integer getIsFound() {
        return isFound;
    }

    public void setIsFound(Integer isFound) {
        this.isFound = isFound;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getDeductGrouth() {
        return deductGrouth;
    }

    public void setDeductGrouth(Integer deductGrouth) {
        this.deductGrouth = deductGrouth;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public String getCusEvidence() {
        return cusEvidence;
    }

    public void setCusEvidence(String cusEvidence) {
        this.cusEvidence = cusEvidence == null ? null : cusEvidence.trim();
    }

    public String getWorEvidence() {
        return worEvidence;
    }

    public void setWorEvidence(String worEvidence) {
        this.worEvidence = worEvidence == null ? null : worEvidence.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getSignImgs() {
        return signImgs;
    }

    public void setSignImgs(String signImgs) {
        this.signImgs = signImgs == null ? null : signImgs.trim();
    }

    public Integer getCompensate() {
        return compensate;
    }

    public void setCompensate(Integer compensate) {
        this.compensate = compensate;
    }

    public Integer getCashVoucher() {
        return cashVoucher;
    }

    public void setCashVoucher(Integer cashVoucher) {
        this.cashVoucher = cashVoucher;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLeaderComment() {
        return leaderComment;
    }

    public void setLeaderComment(String leaderComment) {
        this.leaderComment = leaderComment == null ? null : leaderComment.trim();
    }

    public Integer getLeaderCheck() {
        return leaderCheck;
    }

    public void setLeaderCheck(Integer leaderCheck) {
        this.leaderCheck = leaderCheck;
    }

    public Integer getIsModification() {
        return isModification;
    }

    public void setIsModification(Integer isModification) {
        this.isModification = isModification;
    }

    public Double getDeductDeposit() {
        return deductDeposit;
    }

    public void setDeductDeposit(Double deductDeposit) {
        this.deductDeposit = deductDeposit;
    }
}