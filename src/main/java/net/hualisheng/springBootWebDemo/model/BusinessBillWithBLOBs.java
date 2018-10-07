package net.hualisheng.springBootWebDemo.model;

public class BusinessBillWithBLOBs extends BusinessBill {
    private String billCheckMoneyDesc;

    private String billPayMoneyDesc;

    private String orderids;

    public String getBillCheckMoneyDesc() {
        return billCheckMoneyDesc;
    }

    public void setBillCheckMoneyDesc(String billCheckMoneyDesc) {
        this.billCheckMoneyDesc = billCheckMoneyDesc == null ? null : billCheckMoneyDesc.trim();
    }

    public String getBillPayMoneyDesc() {
        return billPayMoneyDesc;
    }

    public void setBillPayMoneyDesc(String billPayMoneyDesc) {
        this.billPayMoneyDesc = billPayMoneyDesc == null ? null : billPayMoneyDesc.trim();
    }

    public String getOrderids() {
        return orderids;
    }

    public void setOrderids(String orderids) {
        this.orderids = orderids == null ? null : orderids.trim();
    }
}