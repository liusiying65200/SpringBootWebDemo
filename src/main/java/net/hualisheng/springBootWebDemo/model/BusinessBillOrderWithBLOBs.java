package net.hualisheng.springBootWebDemo.model;

public class BusinessBillOrderWithBLOBs extends BusinessBillOrder {
    private String excptionDesc;

    private String billOrderDesc;

    private String payDesc;

    private String businessRemark;

    private String busineeExceptionDesc;

    public String getExcptionDesc() {
        return excptionDesc;
    }

    public void setExcptionDesc(String excptionDesc) {
        this.excptionDesc = excptionDesc == null ? null : excptionDesc.trim();
    }

    public String getBillOrderDesc() {
        return billOrderDesc;
    }

    public void setBillOrderDesc(String billOrderDesc) {
        this.billOrderDesc = billOrderDesc == null ? null : billOrderDesc.trim();
    }

    public String getPayDesc() {
        return payDesc;
    }

    public void setPayDesc(String payDesc) {
        this.payDesc = payDesc == null ? null : payDesc.trim();
    }

    public String getBusinessRemark() {
        return businessRemark;
    }

    public void setBusinessRemark(String businessRemark) {
        this.businessRemark = businessRemark == null ? null : businessRemark.trim();
    }

    public String getBusineeExceptionDesc() {
        return busineeExceptionDesc;
    }

    public void setBusineeExceptionDesc(String busineeExceptionDesc) {
        this.busineeExceptionDesc = busineeExceptionDesc == null ? null : busineeExceptionDesc.trim();
    }
}