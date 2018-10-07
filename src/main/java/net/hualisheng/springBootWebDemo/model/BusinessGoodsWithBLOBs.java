package net.hualisheng.springBootWebDemo.model;

public class BusinessGoodsWithBLOBs extends BusinessGoods {
    private String goodsImgs;

    private String description;

    public String getGoodsImgs() {
        return goodsImgs;
    }

    public void setGoodsImgs(String goodsImgs) {
        this.goodsImgs = goodsImgs == null ? null : goodsImgs.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}