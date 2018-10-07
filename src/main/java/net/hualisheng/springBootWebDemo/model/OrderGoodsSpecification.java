package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class OrderGoodsSpecification {
    private Integer id;

    private Integer shopId;

    private Integer orderId;

    private Integer specId;

    private Float numbers;

    private String brand;

    private String brandModel;

    private Float customerPayment;

    private Date createTime;

    private Integer status;

    private Float specPrice;

    private Float workerSpecPrice;

    private String goodsName;

    private String specName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public Integer getSpecId() {
        return specId;
    }

    public void setSpecId(Integer specId) {
        this.specId = specId;
    }

    public Float getNumbers() {
        return numbers;
    }

    public void setNumbers(Float numbers) {
        this.numbers = numbers;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getBrandModel() {
        return brandModel;
    }

    public void setBrandModel(String brandModel) {
        this.brandModel = brandModel == null ? null : brandModel.trim();
    }

    public Float getCustomerPayment() {
        return customerPayment;
    }

    public void setCustomerPayment(Float customerPayment) {
        this.customerPayment = customerPayment;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Float getSpecPrice() {
        return specPrice;
    }

    public void setSpecPrice(Float specPrice) {
        this.specPrice = specPrice;
    }

    public Float getWorkerSpecPrice() {
        return workerSpecPrice;
    }

    public void setWorkerSpecPrice(Float workerSpecPrice) {
        this.workerSpecPrice = workerSpecPrice;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName == null ? null : specName.trim();
    }
}