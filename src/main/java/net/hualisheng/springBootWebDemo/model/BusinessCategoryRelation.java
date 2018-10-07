package net.hualisheng.springBootWebDemo.model;

public class BusinessCategoryRelation {
    private Integer id;

    private Integer businessId;

    private Integer goodsCategoryId;

    private Double minfee;

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

    public Integer getGoodsCategoryId() {
        return goodsCategoryId;
    }

    public void setGoodsCategoryId(Integer goodsCategoryId) {
        this.goodsCategoryId = goodsCategoryId;
    }

    public Double getMinfee() {
        return minfee;
    }

    public void setMinfee(Double minfee) {
        this.minfee = minfee;
    }
}