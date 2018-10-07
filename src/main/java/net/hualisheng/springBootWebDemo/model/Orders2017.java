package net.hualisheng.springBootWebDemo.model;

import java.util.Date;

public class Orders2017 {
    private Integer id;

    private Integer bussinessId;

    private String bussername;

    private Integer shopId;

    private Integer orderCat;

    private String orderSn;

    private Integer orderStatus;

    private Byte isException;

    private Integer exceptionReason;

    private String sourceOrderId;

    private String customerName;

    private String customerPhone;

    private String customerAliww;

    private Integer customerProvince;

    private Integer customerCity;

    private Integer customerDistrict;

    private String customerAddress;

    private String expressCompany;

    private String expressNo;

    private Float businessPayment;

    private Float workerPayment;

    private String workerServicetypeCode;

    private Date createTime;

    private Integer workerId;

    private Integer validateCode;

    private Integer serviceCode;

    private Integer alternateCode;

    private String notes;

    private Double discount;

    private Date serviceTime;

    private String businessNote;

    private Integer isPause;

    private String pauseReason;

    private String pauseNote;

    private Date pauseTime;

    private Double urgentfee;

    private Integer isAssigned;

    private Integer resendSigncode;

    private Integer resendServicecode;

    private Integer needOntimeInstall;

    private String installNote;

    private Integer exceptionSubscribe;

    private Date excepSubscribeTime;

    private String excepSbuscribeReason;

    private String excepSbuscribeNote;

    private Integer isSign;

    private Date updateTime;

    private String packageNo;

    private Integer refusePayFlag;

    private String belongCustomer;

    private Integer finishOrderFlag;

    private String settlementBelongCustomer;

    private Float businessMinFee;

    private Float workerMinFee;

    private Integer developWorker;

    private String developNote;

    private Integer makeGoodStatus;

    private Double makeGoodMoney;

    private String makeGoodFailReason;

    private Integer yyStatus;

    private Integer orderDealFlag;

    private Double lubanCoin;

    private Integer lubanCardAccountId;

    private String refuseCase;

    private String customerDesc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(Integer bussinessId) {
        this.bussinessId = bussinessId;
    }

    public String getBussername() {
        return bussername;
    }

    public void setBussername(String bussername) {
        this.bussername = bussername == null ? null : bussername.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getOrderCat() {
        return orderCat;
    }

    public void setOrderCat(Integer orderCat) {
        this.orderCat = orderCat;
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

    public Byte getIsException() {
        return isException;
    }

    public void setIsException(Byte isException) {
        this.isException = isException;
    }

    public Integer getExceptionReason() {
        return exceptionReason;
    }

    public void setExceptionReason(Integer exceptionReason) {
        this.exceptionReason = exceptionReason;
    }

    public String getSourceOrderId() {
        return sourceOrderId;
    }

    public void setSourceOrderId(String sourceOrderId) {
        this.sourceOrderId = sourceOrderId == null ? null : sourceOrderId.trim();
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

    public Integer getCustomerProvince() {
        return customerProvince;
    }

    public void setCustomerProvince(Integer customerProvince) {
        this.customerProvince = customerProvince;
    }

    public Integer getCustomerCity() {
        return customerCity;
    }

    public void setCustomerCity(Integer customerCity) {
        this.customerCity = customerCity;
    }

    public Integer getCustomerDistrict() {
        return customerDistrict;
    }

    public void setCustomerDistrict(Integer customerDistrict) {
        this.customerDistrict = customerDistrict;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress == null ? null : customerAddress.trim();
    }

    public String getExpressCompany() {
        return expressCompany;
    }

    public void setExpressCompany(String expressCompany) {
        this.expressCompany = expressCompany == null ? null : expressCompany.trim();
    }

    public String getExpressNo() {
        return expressNo;
    }

    public void setExpressNo(String expressNo) {
        this.expressNo = expressNo == null ? null : expressNo.trim();
    }

    public Float getBusinessPayment() {
        return businessPayment;
    }

    public void setBusinessPayment(Float businessPayment) {
        this.businessPayment = businessPayment;
    }

    public Float getWorkerPayment() {
        return workerPayment;
    }

    public void setWorkerPayment(Float workerPayment) {
        this.workerPayment = workerPayment;
    }

    public String getWorkerServicetypeCode() {
        return workerServicetypeCode;
    }

    public void setWorkerServicetypeCode(String workerServicetypeCode) {
        this.workerServicetypeCode = workerServicetypeCode == null ? null : workerServicetypeCode.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getWorkerId() {
        return workerId;
    }

    public void setWorkerId(Integer workerId) {
        this.workerId = workerId;
    }

    public Integer getValidateCode() {
        return validateCode;
    }

    public void setValidateCode(Integer validateCode) {
        this.validateCode = validateCode;
    }

    public Integer getServiceCode() {
        return serviceCode;
    }

    public void setServiceCode(Integer serviceCode) {
        this.serviceCode = serviceCode;
    }

    public Integer getAlternateCode() {
        return alternateCode;
    }

    public void setAlternateCode(Integer alternateCode) {
        this.alternateCode = alternateCode;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes == null ? null : notes.trim();
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Date getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Date serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String getBusinessNote() {
        return businessNote;
    }

    public void setBusinessNote(String businessNote) {
        this.businessNote = businessNote == null ? null : businessNote.trim();
    }

    public Integer getIsPause() {
        return isPause;
    }

    public void setIsPause(Integer isPause) {
        this.isPause = isPause;
    }

    public String getPauseReason() {
        return pauseReason;
    }

    public void setPauseReason(String pauseReason) {
        this.pauseReason = pauseReason == null ? null : pauseReason.trim();
    }

    public String getPauseNote() {
        return pauseNote;
    }

    public void setPauseNote(String pauseNote) {
        this.pauseNote = pauseNote == null ? null : pauseNote.trim();
    }

    public Date getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(Date pauseTime) {
        this.pauseTime = pauseTime;
    }

    public Double getUrgentfee() {
        return urgentfee;
    }

    public void setUrgentfee(Double urgentfee) {
        this.urgentfee = urgentfee;
    }

    public Integer getIsAssigned() {
        return isAssigned;
    }

    public void setIsAssigned(Integer isAssigned) {
        this.isAssigned = isAssigned;
    }

    public Integer getResendSigncode() {
        return resendSigncode;
    }

    public void setResendSigncode(Integer resendSigncode) {
        this.resendSigncode = resendSigncode;
    }

    public Integer getResendServicecode() {
        return resendServicecode;
    }

    public void setResendServicecode(Integer resendServicecode) {
        this.resendServicecode = resendServicecode;
    }

    public Integer getNeedOntimeInstall() {
        return needOntimeInstall;
    }

    public void setNeedOntimeInstall(Integer needOntimeInstall) {
        this.needOntimeInstall = needOntimeInstall;
    }

    public String getInstallNote() {
        return installNote;
    }

    public void setInstallNote(String installNote) {
        this.installNote = installNote == null ? null : installNote.trim();
    }

    public Integer getExceptionSubscribe() {
        return exceptionSubscribe;
    }

    public void setExceptionSubscribe(Integer exceptionSubscribe) {
        this.exceptionSubscribe = exceptionSubscribe;
    }

    public Date getExcepSubscribeTime() {
        return excepSubscribeTime;
    }

    public void setExcepSubscribeTime(Date excepSubscribeTime) {
        this.excepSubscribeTime = excepSubscribeTime;
    }

    public String getExcepSbuscribeReason() {
        return excepSbuscribeReason;
    }

    public void setExcepSbuscribeReason(String excepSbuscribeReason) {
        this.excepSbuscribeReason = excepSbuscribeReason == null ? null : excepSbuscribeReason.trim();
    }

    public String getExcepSbuscribeNote() {
        return excepSbuscribeNote;
    }

    public void setExcepSbuscribeNote(String excepSbuscribeNote) {
        this.excepSbuscribeNote = excepSbuscribeNote == null ? null : excepSbuscribeNote.trim();
    }

    public Integer getIsSign() {
        return isSign;
    }

    public void setIsSign(Integer isSign) {
        this.isSign = isSign;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getPackageNo() {
        return packageNo;
    }

    public void setPackageNo(String packageNo) {
        this.packageNo = packageNo == null ? null : packageNo.trim();
    }

    public Integer getRefusePayFlag() {
        return refusePayFlag;
    }

    public void setRefusePayFlag(Integer refusePayFlag) {
        this.refusePayFlag = refusePayFlag;
    }

    public String getBelongCustomer() {
        return belongCustomer;
    }

    public void setBelongCustomer(String belongCustomer) {
        this.belongCustomer = belongCustomer == null ? null : belongCustomer.trim();
    }

    public Integer getFinishOrderFlag() {
        return finishOrderFlag;
    }

    public void setFinishOrderFlag(Integer finishOrderFlag) {
        this.finishOrderFlag = finishOrderFlag;
    }

    public String getSettlementBelongCustomer() {
        return settlementBelongCustomer;
    }

    public void setSettlementBelongCustomer(String settlementBelongCustomer) {
        this.settlementBelongCustomer = settlementBelongCustomer == null ? null : settlementBelongCustomer.trim();
    }

    public Float getBusinessMinFee() {
        return businessMinFee;
    }

    public void setBusinessMinFee(Float businessMinFee) {
        this.businessMinFee = businessMinFee;
    }

    public Float getWorkerMinFee() {
        return workerMinFee;
    }

    public void setWorkerMinFee(Float workerMinFee) {
        this.workerMinFee = workerMinFee;
    }

    public Integer getDevelopWorker() {
        return developWorker;
    }

    public void setDevelopWorker(Integer developWorker) {
        this.developWorker = developWorker;
    }

    public String getDevelopNote() {
        return developNote;
    }

    public void setDevelopNote(String developNote) {
        this.developNote = developNote == null ? null : developNote.trim();
    }

    public Integer getMakeGoodStatus() {
        return makeGoodStatus;
    }

    public void setMakeGoodStatus(Integer makeGoodStatus) {
        this.makeGoodStatus = makeGoodStatus;
    }

    public Double getMakeGoodMoney() {
        return makeGoodMoney;
    }

    public void setMakeGoodMoney(Double makeGoodMoney) {
        this.makeGoodMoney = makeGoodMoney;
    }

    public String getMakeGoodFailReason() {
        return makeGoodFailReason;
    }

    public void setMakeGoodFailReason(String makeGoodFailReason) {
        this.makeGoodFailReason = makeGoodFailReason == null ? null : makeGoodFailReason.trim();
    }

    public Integer getYyStatus() {
        return yyStatus;
    }

    public void setYyStatus(Integer yyStatus) {
        this.yyStatus = yyStatus;
    }

    public Integer getOrderDealFlag() {
        return orderDealFlag;
    }

    public void setOrderDealFlag(Integer orderDealFlag) {
        this.orderDealFlag = orderDealFlag;
    }

    public Double getLubanCoin() {
        return lubanCoin;
    }

    public void setLubanCoin(Double lubanCoin) {
        this.lubanCoin = lubanCoin;
    }

    public Integer getLubanCardAccountId() {
        return lubanCardAccountId;
    }

    public void setLubanCardAccountId(Integer lubanCardAccountId) {
        this.lubanCardAccountId = lubanCardAccountId;
    }

    public String getRefuseCase() {
        return refuseCase;
    }

    public void setRefuseCase(String refuseCase) {
        this.refuseCase = refuseCase == null ? null : refuseCase.trim();
    }

    public String getCustomerDesc() {
        return customerDesc;
    }

    public void setCustomerDesc(String customerDesc) {
        this.customerDesc = customerDesc == null ? null : customerDesc.trim();
    }
}