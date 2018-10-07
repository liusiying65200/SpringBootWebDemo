package net.hualisheng.springBootWebDemo.model;

public class BusinessGoodsSpecificationWithBLOBs extends BusinessGoodsSpecification {
    private String speimage;

    private String remark;

    public String getSpeimage() {
        return speimage;
    }

    public void setSpeimage(String speimage) {
        this.speimage = speimage == null ? null : speimage.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}