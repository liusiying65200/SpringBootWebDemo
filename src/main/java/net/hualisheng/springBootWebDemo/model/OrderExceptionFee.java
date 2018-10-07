package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class OrderExceptionFee {
    private Integer orderId;

    private Double originalMoney;

    private Double originalDismoney;

    private Double businessIncome;

    private Double businessOutcome;

    private Double workerIncome;

    private Double workerOutcome;

    private Integer status;

    private Integer type;

    private String exceptionDesc;

    private String note;

    private Date createTime;

    private String financeNote;

    private Integer workerId;

    private Integer enabled;

    private Date updateTime;

    private String serviceImage;

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

    public Double getOriginalDismoney() {
        return originalDismoney;
    }

    public void setOriginalDismoney(Double originalDismoney) {
        this.originalDismoney = originalDismoney;
    }

    public Double getBusinessIncome() {
        return businessIncome;
    }

    public void setBusinessIncome(Double businessIncome) {
        this.businessIncome = businessIncome;
    }

    public Double getBusinessOutcome() {
        return businessOutcome;
    }

    public void setBusinessOutcome(Double businessOutcome) {
        this.businessOutcome = businessOutcome;
    }

    public Double getWorkerIncome() {
        return workerIncome;
    }

    public void setWorkerIncome(Double workerIncome) {
        this.workerIncome = workerIncome;
    }

    public Double getWorkerOutcome() {
        return workerOutcome;
    }

    public void setWorkerOutcome(Double workerOutcome) {
        this.workerOutcome = workerOutcome;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getExceptionDesc() {
        return exceptionDesc;
    }

    public void setExceptionDesc(String exceptionDesc) {
        this.exceptionDesc = exceptionDesc == null ? null : exceptionDesc.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getFinanceNote() {
        return financeNote;
    }

    public void setFinanceNote(String financeNote) {
        this.financeNote = financeNote == null ? null : financeNote.trim();
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getServiceImage() {
        return serviceImage;
    }

    public void setServiceImage(String serviceImage) {
        this.serviceImage = serviceImage == null ? null : serviceImage.trim();
    }
}