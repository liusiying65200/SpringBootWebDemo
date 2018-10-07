package net.hualisheng.springBootWebDemo.model;

public class OrderLogistics {
    private Integer id;

    private Integer orderId;

    private String logisticsCompany;

    private String logisticsSingle;

    private String pickupPassword;

    private Double agentPay;

    private Double logisticsCost;

    private Double distance;

    private String pickupPhone;

    private String pickupAddress;

    private String dicKey;

    private Integer goods;

    private String descr;

    private Integer districtId;

    private Integer provinceId;

    private Integer cityId;

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

    public String getLogisticsCompany() {
        return logisticsCompany;
    }

    public void setLogisticsCompany(String logisticsCompany) {
        this.logisticsCompany = logisticsCompany == null ? null : logisticsCompany.trim();
    }

    public String getLogisticsSingle() {
        return logisticsSingle;
    }

    public void setLogisticsSingle(String logisticsSingle) {
        this.logisticsSingle = logisticsSingle == null ? null : logisticsSingle.trim();
    }

    public String getPickupPassword() {
        return pickupPassword;
    }

    public void setPickupPassword(String pickupPassword) {
        this.pickupPassword = pickupPassword == null ? null : pickupPassword.trim();
    }

    public Double getAgentPay() {
        return agentPay;
    }

    public void setAgentPay(Double agentPay) {
        this.agentPay = agentPay;
    }

    public Double getLogisticsCost() {
        return logisticsCost;
    }

    public void setLogisticsCost(Double logisticsCost) {
        this.logisticsCost = logisticsCost;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public String getPickupPhone() {
        return pickupPhone;
    }

    public void setPickupPhone(String pickupPhone) {
        this.pickupPhone = pickupPhone == null ? null : pickupPhone.trim();
    }

    public String getPickupAddress() {
        return pickupAddress;
    }

    public void setPickupAddress(String pickupAddress) {
        this.pickupAddress = pickupAddress == null ? null : pickupAddress.trim();
    }

    public String getDicKey() {
        return dicKey;
    }

    public void setDicKey(String dicKey) {
        this.dicKey = dicKey == null ? null : dicKey.trim();
    }

    public Integer getGoods() {
        return goods;
    }

    public void setGoods(Integer goods) {
        this.goods = goods;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr == null ? null : descr.trim();
    }

    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}