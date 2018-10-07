package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class BusinessBill {
    private Integer id;

    private String billSn;

    private String billName;

    private Integer bussinessId;

    private Integer shopId;

    private Double billMoney;

    private Float billCheckMoney;

    private Date billCheckMoneyTime;

    private Float billPayMoney;

    private Date billPayMoneyTime;

    private Date startTime;

    private Date endTime;

    private Integer status;

    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillSn() {
        return billSn;
    }

    public void setBillSn(String billSn) {
        this.billSn = billSn == null ? null : billSn.trim();
    }

    public String getBillName() {
        return billName;
    }

    public void setBillName(String billName) {
        this.billName = billName == null ? null : billName.trim();
    }

    public Integer getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(Integer bussinessId) {
        this.bussinessId = bussinessId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Double billMoney) {
        this.billMoney = billMoney;
    }

    public Float getBillCheckMoney() {
        return billCheckMoney;
    }

    public void setBillCheckMoney(Float billCheckMoney) {
        this.billCheckMoney = billCheckMoney;
    }

    public Date getBillCheckMoneyTime() {
        return billCheckMoneyTime;
    }

    public void setBillCheckMoneyTime(Date billCheckMoneyTime) {
        this.billCheckMoneyTime = billCheckMoneyTime;
    }

    public Float getBillPayMoney() {
        return billPayMoney;
    }

    public void setBillPayMoney(Float billPayMoney) {
        this.billPayMoney = billPayMoney;
    }

    public Date getBillPayMoneyTime() {
        return billPayMoneyTime;
    }

    public void setBillPayMoneyTime(Date billPayMoneyTime) {
        this.billPayMoneyTime = billPayMoneyTime;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}