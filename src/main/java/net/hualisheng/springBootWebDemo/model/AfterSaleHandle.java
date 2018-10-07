package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class AfterSaleHandle {
    private Integer id;

    private Integer afterBussId;

    private Integer isAgree;

    private Integer type;

    private String otherType;

    private Double pay;

    private String reason;

    private Integer isPay;

    private Date payTime;

    private String cusEvidence;

    private String worEvidence;

    private String description;

    private String signImgs;

    private Integer adminId;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAfterBussId() {
        return afterBussId;
    }

    public void setAfterBussId(Integer afterBussId) {
        this.afterBussId = afterBussId;
    }

    public Integer getIsAgree() {
        return isAgree;
    }

    public void setIsAgree(Integer isAgree) {
        this.isAgree = isAgree;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getOtherType() {
        return otherType;
    }

    public void setOtherType(String otherType) {
        this.otherType = otherType == null ? null : otherType.trim();
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Integer getIsPay() {
        return isPay;
    }

    public void setIsPay(Integer isPay) {
        this.isPay = isPay;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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
}