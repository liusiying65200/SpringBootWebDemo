package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class OrderStatistics {
    private Integer orderId;

    private String orderSn;

    private Integer orderStatus;

    private Integer isException;

    private String sourceOrderId;

    private Integer servicetype;

    private Integer businessId;

    private String businessName;

    private Integer grade;

    private Integer shopId;

    private String shopName;

    private Integer workerId;

    private String workerName;

    private String workerTel;

    private Integer workerGrade;

    private Integer saleId;

    private String saleName;

    private String adminName;

    private Date createTime;

    private Date payTime;

    private Date completeTime;

    private Date settlementTime;

    private Date finishTime;

    private Date closeTime;

    private String customerName;

    private String customerPhone;

    private String customerAliww;

    private Integer orderGoodsCatgoryId;

    private String orderGoodsCatgory;

    private String orderGoodsMap;

    private String orderGoodsId;

    private String orderGoodsName;

    private Double orderTotalFee;

    private Double businessTotalFee;

    private Double customerTotalFee;

    private Double workerTotalFee;

    private Double baseTotalFee;

    private Double discountBaseTotalFee;

    private Double additionalTotalFee;

    private Double urgentFee;

    private Double addLubanFee;

    private Double addBusinessFee;

    private Double addLubanNoccFee;

    private Double addBusinessNoccFee;

    private String addFeeMap;

    private Double businessIncomeFee;

    private Double businessOutcomeFee;

    private Double workerIncomeFee;

    private Double workerOutcomeFee;

    private Double psFee;

    private Double agentPayFee;

    private Double workerAwardFee;

    private Double workerActivityFee;

    private Double workerDepositFee;

    private Float workerAwardRate;

    private Float workerActivityRate;

    private Float workerDepositRate;

    private Double hongbaoFee;

    private Double infoFee;

    private Double lubanDakuanFee;

    private Double changeMoney;

    private Double orderDeductFee;

    private String orderRemark;

    private String remark;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Integer getIsException() {
        return isException;
    }

    public void setIsException(Integer isException) {
        this.isException = isException;
    }

    public String getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId == null ? null : sourceOrderId.trim();
    }

    public Integer getServicetype() {
        return servicetype;
    }

    public void setServicetype(Integer servicetype) {
        this.servicetype = servicetype;
    }

    public Integer getBusinessId() {
        return businessId;
    }

    public void setBusinessId(Integer businessId) {
        this.businessId = businessId;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName == null ? null : businessName.trim();
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public String getWorkerName() {
        return workerName;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName == null ? null : workerName.trim();
    }

    public String getWorkerTel() {
        return workerTel;
    }

    public void setWorkerTel(String workerTel) {
        this.workerTel = workerTel == null ? null : workerTel.trim();
    }

    public Integer getWorkerGrade() {
        return workerGrade;
    }

    public void setWorkerGrade(Integer workerGrade) {
        this.workerGrade = workerGrade;
    }

    public Integer getSaleId() {
        return saleId;
    }

    public void setSaleId(Integer saleId) {
        this.saleId = saleId;
    }

    public String getSaleName() {
        return saleName;
    }

    public void setSaleName(String saleName) {
        this.saleName = saleName == null ? null : saleName.trim();
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName == null ? null : adminName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Date getCompleteTime() {
        return completeTime;
    }

    public void setCompleteTime(Date completeTime) {
        this.completeTime = completeTime;
    }

    public Date getSettlementTime() {
        return settlementTime;
    }

    public void setSettlementTime(Date settlementTime) {
        this.settlementTime = settlementTime;
    }

    public Date getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(Date finishTime) {
        this.finishTime = finishTime;
    }

    public Date getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone == null ? null : customerPhone.trim();
    }

    public String getCustomerAliww() {
        return customerAliww;
    }

    public void setCustomerAliww(String customerAliww) {
        this.customerAliww = customerAliww == null ? null : customerAliww.trim();
    }

    public Integer getOrderGoodsCatgoryId() {
        return orderGoodsCatgoryId;
    }

    public void setOrderGoodsCatgoryId(Integer orderGoodsCatgoryId) {
        this.orderGoodsCatgoryId = orderGoodsCatgoryId;
    }

    public String getOrderGoodsCatgory() {
        return orderGoodsCatgory;
    }

    public void setOrderGoodsCatgory(String orderGoodsCatgory) {
        this.orderGoodsCatgory = orderGoodsCatgory == null ? null : orderGoodsCatgory.trim();
    }

    public String getOrderGoodsMap() {
        return orderGoodsMap;
    }

    public void setOrderGoodsMap(String orderGoodsMap) {
        this.orderGoodsMap = orderGoodsMap == null ? null : orderGoodsMap.trim();
    }

    public String getOrderGoodsId() {
        return orderGoodsId;
    }

    public void setOrderGoodsId(String orderGoodsId) {
        this.orderGoodsId = orderGoodsId == null ? null : orderGoodsId.trim();
    }

    public String getOrderGoodsName() {
        return orderGoodsName;
    }

    public void setOrderGoodsName(String orderGoodsName) {
        this.orderGoodsName = orderGoodsName == null ? null : orderGoodsName.trim();
    }

    public Double getOrderTotalFee() {
        return orderTotalFee;
    }

    public void setOrderTotalFee(Double orderTotalFee) {
        this.orderTotalFee = orderTotalFee;
    }

    public Double getBusinessTotalFee() {
        return businessTotalFee;
    }

    public void setBusinessTotalFee(Double businessTotalFee) {
        this.businessTotalFee = businessTotalFee;
    }

    public Double getCustomerTotalFee() {
        return customerTotalFee;
    }

    public void setCustomerTotalFee(Double customerTotalFee) {
        this.customerTotalFee = customerTotalFee;
    }

    public Double getWorkerTotalFee() {
        return workerTotalFee;
    }

    public void setWorkerTotalFee(Double workerTotalFee) {
        this.workerTotalFee = workerTotalFee;
    }

    public Double getBaseTotalFee() {
        return baseTotalFee;
    }

    public void setBaseTotalFee(Double baseTotalFee) {
        this.baseTotalFee = baseTotalFee;
    }

    public Double getDiscountBaseTotalFee() {
        return discountBaseTotalFee;
    }

    public void setDiscountBaseTotalFee(Double discountBaseTotalFee) {
        this.discountBaseTotalFee = discountBaseTotalFee;
    }

    public Double getAdditionalTotalFee() {
        return additionalTotalFee;
    }

    public void setAdditionalTotalFee(Double additionalTotalFee) {
        this.additionalTotalFee = additionalTotalFee;
    }

    public Double getUrgentFee() {
        return urgentFee;
    }

    public void setUrgentFee(Double urgentFee) {
        this.urgentFee = urgentFee;
    }

    public Double getAddLubanFee() {
        return addLubanFee;
    }

    public void setAddLubanFee(Double addLubanFee) {
        this.addLubanFee = addLubanFee;
    }

    public Double getAddBusinessFee() {
        return addBusinessFee;
    }

    public void setAddBusinessFee(Double addBusinessFee) {
        this.addBusinessFee = addBusinessFee;
    }

    public Double getAddLubanNoccFee() {
        return addLubanNoccFee;
    }

    public void setAddLubanNoccFee(Double addLubanNoccFee) {
        this.addLubanNoccFee = addLubanNoccFee;
    }

    public Double getAddBusinessNoccFee() {
        return addBusinessNoccFee;
    }

    public void setAddBusinessNoccFee(Double addBusinessNoccFee) {
        this.addBusinessNoccFee = addBusinessNoccFee;
    }

    public String getAddFeeMap() {
        return addFeeMap;
    }

    public void setAddFeeMap(String addFeeMap) {
        this.addFeeMap = addFeeMap == null ? null : addFeeMap.trim();
    }

    public Double getBusinessIncomeFee() {
        return businessIncomeFee;
    }

    public void setBusinessIncomeFee(Double businessIncomeFee) {
        this.businessIncomeFee = businessIncomeFee;
    }

    public Double getBusinessOutcomeFee() {
        return businessOutcomeFee;
    }

    public void setBusinessOutcomeFee(Double businessOutcomeFee) {
        this.businessOutcomeFee = businessOutcomeFee;
    }

    public Double getWorkerIncomeFee() {
        return workerIncomeFee;
    }

    public void setWorkerIncomeFee(Double workerIncomeFee) {
        this.workerIncomeFee = workerIncomeFee;
    }

    public Double getWorkerOutcomeFee() {
        return workerOutcomeFee;
    }

    public void setWorkerOutcomeFee(Double workerOutcomeFee) {
        this.workerOutcomeFee = workerOutcomeFee;
    }

    public Double getPsFee() {
        return psFee;
    }

    public void setPsFee(Double psFee) {
        this.psFee = psFee;
    }

    public Double getAgentPayFee() {
        return agentPayFee;
    }

    public void setAgentPayFee(Double agentPayFee) {
        this.agentPayFee = agentPayFee;
    }

    public Double getWorkerAwardFee() {
        return workerAwardFee;
    }

    public void setWorkerAwardFee(Double workerAwardFee) {
        this.workerAwardFee = workerAwardFee;
    }

    public Double getWorkerActivityFee() {
        return workerActivityFee;
    }

    public void setWorkerActivityFee(Double workerActivityFee) {
        this.workerActivityFee = workerActivityFee;
    }

    public Double getWorkerDepositFee() {
        return workerDepositFee;
    }

    public void setWorkerDepositFee(Double workerDepositFee) {
        this.workerDepositFee = workerDepositFee;
    }

    public Float getWorkerAwardRate() {
        return workerAwardRate;
    }

    public void setWorkerAwardRate(Float workerAwardRate) {
        this.workerAwardRate = workerAwardRate;
    }

    public Float getWorkerActivityRate() {
        return workerActivityRate;
    }

    public void setWorkerActivityRate(Float workerActivityRate) {
        this.workerActivityRate = workerActivityRate;
    }

    public Float getWorkerDepositRate() {
        return workerDepositRate;
    }

    public void setWorkerDepositRate(Float workerDepositRate) {
        this.workerDepositRate = workerDepositRate;
    }

    public Double getHongbaoFee() {
        return hongbaoFee;
    }

    public void setHongbaoFee(Double hongbaoFee) {
        this.hongbaoFee = hongbaoFee;
    }

    public Double getInfoFee() {
        return infoFee;
    }

    public void setInfoFee(Double infoFee) {
        this.infoFee = infoFee;
    }

    public Double getLubanDakuanFee() {
        return lubanDakuanFee;
    }

    public void setLubanDakuanFee(Double lubanDakuanFee) {
        this.lubanDakuanFee = lubanDakuanFee;
    }

    public Double getChangeMoney() {
        return changeMoney;
    }

    public void setChangeMoney(Double changeMoney) {
        this.changeMoney = changeMoney;
    }

    public Double getOrderDeductFee() {
        return orderDeductFee;
    }

    public void setOrderDeductFee(Double orderDeductFee) {
        this.orderDeductFee = orderDeductFee;
    }

    public String getOrderRemark() {
        return orderRemark;
    }

    public void setOrderRemark(String orderRemark) {
        this.orderRemark = orderRemark == null ? null : orderRemark.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}