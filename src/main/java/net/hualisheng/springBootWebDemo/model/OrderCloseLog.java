package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class OrderCloseLog {
    private Integer id;

    private Integer orderId;

    private Integer workerId;

    private String closeReason;

    private String closeNote;

    private Date createTime;

    private Integer result;

    private Integer createbusiness;

    private Integer doAdmin;

    private Date doTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCloseReason() {
        return closeReason;
    }

    public void setCloseReason(String closeReason) {
        this.closeReason = closeReason == null ? null : closeReason.trim();
    }

    public String getCloseNote() {
        return closeNote;
    }

    public void setCloseNote(String closeNote) {
        this.closeNote = closeNote == null ? null : closeNote.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public Integer getCreatebusiness() {
        return createbusiness;
    }

    public void setCreatebusiness(Integer createbusiness) {
        this.createbusiness = createbusiness;
    }

    public Integer getDoAdmin() {
        return doAdmin;
    }

    public void setDoAdmin(Integer doAdmin) {
        this.doAdmin = doAdmin;
    }

    public Date getDoTime() {
        return doTime;
    }

    public void setDoTime(Date doTime) {
        this.doTime = doTime;
    }
}