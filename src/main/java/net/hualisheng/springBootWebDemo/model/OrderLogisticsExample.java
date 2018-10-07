package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.List;

public class OrderLogisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderLogisticsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNull() {
            addCriterion("logistics_company is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIsNotNull() {
            addCriterion("logistics_company is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyEqualTo(String value) {
            addCriterion("logistics_company =", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotEqualTo(String value) {
            addCriterion("logistics_company <>", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThan(String value) {
            addCriterion("logistics_company >", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_company >=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThan(String value) {
            addCriterion("logistics_company <", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLessThanOrEqualTo(String value) {
            addCriterion("logistics_company <=", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyLike(String value) {
            addCriterion("logistics_company like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotLike(String value) {
            addCriterion("logistics_company not like", value, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyIn(List<String> values) {
            addCriterion("logistics_company in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotIn(List<String> values) {
            addCriterion("logistics_company not in", values, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyBetween(String value1, String value2) {
            addCriterion("logistics_company between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsCompanyNotBetween(String value1, String value2) {
            addCriterion("logistics_company not between", value1, value2, "logisticsCompany");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleIsNull() {
            addCriterion("logistics_single is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleIsNotNull() {
            addCriterion("logistics_single is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleEqualTo(String value) {
            addCriterion("logistics_single =", value, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleNotEqualTo(String value) {
            addCriterion("logistics_single <>", value, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleGreaterThan(String value) {
            addCriterion("logistics_single >", value, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleGreaterThanOrEqualTo(String value) {
            addCriterion("logistics_single >=", value, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleLessThan(String value) {
            addCriterion("logistics_single <", value, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleLessThanOrEqualTo(String value) {
            addCriterion("logistics_single <=", value, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleLike(String value) {
            addCriterion("logistics_single like", value, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleNotLike(String value) {
            addCriterion("logistics_single not like", value, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleIn(List<String> values) {
            addCriterion("logistics_single in", values, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleNotIn(List<String> values) {
            addCriterion("logistics_single not in", values, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleBetween(String value1, String value2) {
            addCriterion("logistics_single between", value1, value2, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andLogisticsSingleNotBetween(String value1, String value2) {
            addCriterion("logistics_single not between", value1, value2, "logisticsSingle");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordIsNull() {
            addCriterion("pickup_password is null");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordIsNotNull() {
            addCriterion("pickup_password is not null");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordEqualTo(String value) {
            addCriterion("pickup_password =", value, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordNotEqualTo(String value) {
            addCriterion("pickup_password <>", value, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordGreaterThan(String value) {
            addCriterion("pickup_password >", value, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_password >=", value, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordLessThan(String value) {
            addCriterion("pickup_password <", value, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordLessThanOrEqualTo(String value) {
            addCriterion("pickup_password <=", value, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordLike(String value) {
            addCriterion("pickup_password like", value, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordNotLike(String value) {
            addCriterion("pickup_password not like", value, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordIn(List<String> values) {
            addCriterion("pickup_password in", values, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordNotIn(List<String> values) {
            addCriterion("pickup_password not in", values, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordBetween(String value1, String value2) {
            addCriterion("pickup_password between", value1, value2, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andPickupPasswordNotBetween(String value1, String value2) {
            addCriterion("pickup_password not between", value1, value2, "pickupPassword");
            return (Criteria) this;
        }

        public Criteria andAgentPayIsNull() {
            addCriterion("agent_pay is null");
            return (Criteria) this;
        }

        public Criteria andAgentPayIsNotNull() {
            addCriterion("agent_pay is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPayEqualTo(Double value) {
            addCriterion("agent_pay =", value, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayNotEqualTo(Double value) {
            addCriterion("agent_pay <>", value, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayGreaterThan(Double value) {
            addCriterion("agent_pay >", value, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayGreaterThanOrEqualTo(Double value) {
            addCriterion("agent_pay >=", value, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayLessThan(Double value) {
            addCriterion("agent_pay <", value, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayLessThanOrEqualTo(Double value) {
            addCriterion("agent_pay <=", value, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayIn(List<Double> values) {
            addCriterion("agent_pay in", values, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayNotIn(List<Double> values) {
            addCriterion("agent_pay not in", values, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayBetween(Double value1, Double value2) {
            addCriterion("agent_pay between", value1, value2, "agentPay");
            return (Criteria) this;
        }

        public Criteria andAgentPayNotBetween(Double value1, Double value2) {
            addCriterion("agent_pay not between", value1, value2, "agentPay");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNull() {
            addCriterion("logistics_cost is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIsNotNull() {
            addCriterion("logistics_cost is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostEqualTo(Double value) {
            addCriterion("logistics_cost =", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotEqualTo(Double value) {
            addCriterion("logistics_cost <>", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThan(Double value) {
            addCriterion("logistics_cost >", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostGreaterThanOrEqualTo(Double value) {
            addCriterion("logistics_cost >=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThan(Double value) {
            addCriterion("logistics_cost <", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostLessThanOrEqualTo(Double value) {
            addCriterion("logistics_cost <=", value, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostIn(List<Double> values) {
            addCriterion("logistics_cost in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotIn(List<Double> values) {
            addCriterion("logistics_cost not in", values, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostBetween(Double value1, Double value2) {
            addCriterion("logistics_cost between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andLogisticsCostNotBetween(Double value1, Double value2) {
            addCriterion("logistics_cost not between", value1, value2, "logisticsCost");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNull() {
            addCriterion("distance is null");
            return (Criteria) this;
        }

        public Criteria andDistanceIsNotNull() {
            addCriterion("distance is not null");
            return (Criteria) this;
        }

        public Criteria andDistanceEqualTo(Double value) {
            addCriterion("distance =", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotEqualTo(Double value) {
            addCriterion("distance <>", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThan(Double value) {
            addCriterion("distance >", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceGreaterThanOrEqualTo(Double value) {
            addCriterion("distance >=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThan(Double value) {
            addCriterion("distance <", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceLessThanOrEqualTo(Double value) {
            addCriterion("distance <=", value, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceIn(List<Double> values) {
            addCriterion("distance in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotIn(List<Double> values) {
            addCriterion("distance not in", values, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceBetween(Double value1, Double value2) {
            addCriterion("distance between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andDistanceNotBetween(Double value1, Double value2) {
            addCriterion("distance not between", value1, value2, "distance");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIsNull() {
            addCriterion("pickup_phone is null");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIsNotNull() {
            addCriterion("pickup_phone is not null");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneEqualTo(String value) {
            addCriterion("pickup_phone =", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotEqualTo(String value) {
            addCriterion("pickup_phone <>", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneGreaterThan(String value) {
            addCriterion("pickup_phone >", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_phone >=", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLessThan(String value) {
            addCriterion("pickup_phone <", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLessThanOrEqualTo(String value) {
            addCriterion("pickup_phone <=", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneLike(String value) {
            addCriterion("pickup_phone like", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotLike(String value) {
            addCriterion("pickup_phone not like", value, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneIn(List<String> values) {
            addCriterion("pickup_phone in", values, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotIn(List<String> values) {
            addCriterion("pickup_phone not in", values, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneBetween(String value1, String value2) {
            addCriterion("pickup_phone between", value1, value2, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupPhoneNotBetween(String value1, String value2) {
            addCriterion("pickup_phone not between", value1, value2, "pickupPhone");
            return (Criteria) this;
        }

        public Criteria andPickupAddressIsNull() {
            addCriterion("pickup_address is null");
            return (Criteria) this;
        }

        public Criteria andPickupAddressIsNotNull() {
            addCriterion("pickup_address is not null");
            return (Criteria) this;
        }

        public Criteria andPickupAddressEqualTo(String value) {
            addCriterion("pickup_address =", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressNotEqualTo(String value) {
            addCriterion("pickup_address <>", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressGreaterThan(String value) {
            addCriterion("pickup_address >", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressGreaterThanOrEqualTo(String value) {
            addCriterion("pickup_address >=", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressLessThan(String value) {
            addCriterion("pickup_address <", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressLessThanOrEqualTo(String value) {
            addCriterion("pickup_address <=", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressLike(String value) {
            addCriterion("pickup_address like", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressNotLike(String value) {
            addCriterion("pickup_address not like", value, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressIn(List<String> values) {
            addCriterion("pickup_address in", values, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressNotIn(List<String> values) {
            addCriterion("pickup_address not in", values, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressBetween(String value1, String value2) {
            addCriterion("pickup_address between", value1, value2, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andPickupAddressNotBetween(String value1, String value2) {
            addCriterion("pickup_address not between", value1, value2, "pickupAddress");
            return (Criteria) this;
        }

        public Criteria andDicKeyIsNull() {
            addCriterion("dic_key is null");
            return (Criteria) this;
        }

        public Criteria andDicKeyIsNotNull() {
            addCriterion("dic_key is not null");
            return (Criteria) this;
        }

        public Criteria andDicKeyEqualTo(String value) {
            addCriterion("dic_key =", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotEqualTo(String value) {
            addCriterion("dic_key <>", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyGreaterThan(String value) {
            addCriterion("dic_key >", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyGreaterThanOrEqualTo(String value) {
            addCriterion("dic_key >=", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLessThan(String value) {
            addCriterion("dic_key <", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLessThanOrEqualTo(String value) {
            addCriterion("dic_key <=", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyLike(String value) {
            addCriterion("dic_key like", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotLike(String value) {
            addCriterion("dic_key not like", value, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyIn(List<String> values) {
            addCriterion("dic_key in", values, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotIn(List<String> values) {
            addCriterion("dic_key not in", values, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyBetween(String value1, String value2) {
            addCriterion("dic_key between", value1, value2, "dicKey");
            return (Criteria) this;
        }

        public Criteria andDicKeyNotBetween(String value1, String value2) {
            addCriterion("dic_key not between", value1, value2, "dicKey");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(Integer value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(Integer value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(Integer value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(Integer value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(Integer value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<Integer> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<Integer> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(Integer value1, Integer value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(Integer value1, Integer value2) {
            addCriterion("goods not between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andDescrIsNull() {
            addCriterion("descr is null");
            return (Criteria) this;
        }

        public Criteria andDescrIsNotNull() {
            addCriterion("descr is not null");
            return (Criteria) this;
        }

        public Criteria andDescrEqualTo(String value) {
            addCriterion("descr =", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotEqualTo(String value) {
            addCriterion("descr <>", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThan(String value) {
            addCriterion("descr >", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrGreaterThanOrEqualTo(String value) {
            addCriterion("descr >=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThan(String value) {
            addCriterion("descr <", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLessThanOrEqualTo(String value) {
            addCriterion("descr <=", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrLike(String value) {
            addCriterion("descr like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotLike(String value) {
            addCriterion("descr not like", value, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrIn(List<String> values) {
            addCriterion("descr in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotIn(List<String> values) {
            addCriterion("descr not in", values, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrBetween(String value1, String value2) {
            addCriterion("descr between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andDescrNotBetween(String value1, String value2) {
            addCriterion("descr not between", value1, value2, "descr");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNull() {
            addCriterion("district_id is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIsNotNull() {
            addCriterion("district_id is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictIdEqualTo(Integer value) {
            addCriterion("district_id =", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotEqualTo(Integer value) {
            addCriterion("district_id <>", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThan(Integer value) {
            addCriterion("district_id >", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("district_id >=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThan(Integer value) {
            addCriterion("district_id <", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdLessThanOrEqualTo(Integer value) {
            addCriterion("district_id <=", value, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdIn(List<Integer> values) {
            addCriterion("district_id in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotIn(List<Integer> values) {
            addCriterion("district_id not in", values, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdBetween(Integer value1, Integer value2) {
            addCriterion("district_id between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andDistrictIdNotBetween(Integer value1, Integer value2) {
            addCriterion("district_id not between", value1, value2, "districtId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNull() {
            addCriterion("province_id is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIsNotNull() {
            addCriterion("province_id is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceIdEqualTo(Integer value) {
            addCriterion("province_id =", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotEqualTo(Integer value) {
            addCriterion("province_id <>", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThan(Integer value) {
            addCriterion("province_id >", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("province_id >=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThan(Integer value) {
            addCriterion("province_id <", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdLessThanOrEqualTo(Integer value) {
            addCriterion("province_id <=", value, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdIn(List<Integer> values) {
            addCriterion("province_id in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotIn(List<Integer> values) {
            addCriterion("province_id not in", values, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdBetween(Integer value1, Integer value2) {
            addCriterion("province_id between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andProvinceIdNotBetween(Integer value1, Integer value2) {
            addCriterion("province_id not between", value1, value2, "provinceId");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNull() {
            addCriterion("city_id is null");
            return (Criteria) this;
        }

        public Criteria andCityIdIsNotNull() {
            addCriterion("city_id is not null");
            return (Criteria) this;
        }

        public Criteria andCityIdEqualTo(Integer value) {
            addCriterion("city_id =", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotEqualTo(Integer value) {
            addCriterion("city_id <>", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThan(Integer value) {
            addCriterion("city_id >", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("city_id >=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThan(Integer value) {
            addCriterion("city_id <", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("city_id <=", value, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdIn(List<Integer> values) {
            addCriterion("city_id in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotIn(List<Integer> values) {
            addCriterion("city_id not in", values, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdBetween(Integer value1, Integer value2) {
            addCriterion("city_id between", value1, value2, "cityId");
            return (Criteria) this;
        }

        public Criteria andCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("city_id not between", value1, value2, "cityId");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}