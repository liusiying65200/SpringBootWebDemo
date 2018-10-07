package net.hualisheng.springBootWebDemo.model;

public class AdminActLogKey {
    private Integer orderId;

    private Integer actType;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getActType() {
        return actType;
    }

    public void setActType(Integer actType) {
        this.actType = actType;
    }
}