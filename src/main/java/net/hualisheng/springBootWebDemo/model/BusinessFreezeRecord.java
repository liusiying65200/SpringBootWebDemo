package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class BusinessFreezeRecord {
    private Integer id;

    private Integer businessId;

    private Integer operation;

    private Integer operationer;

    private Date operationtime;

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

    public Integer getOperation() {
        return operation;
    }

    public void setOperation(Integer operation) {
        this.operation = operation;
    }

    public Integer getOperationer() {
        return operationer;
    }

    public void setOperationer(Integer operationer) {
        this.operationer = operationer;
    }

    public Date getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(Date operationtime) {
        this.operationtime = operationtime;
    }
}