package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderFeeDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderFeeDetailExample() {
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

        public Criteria andWorkerIdIsNull() {
            addCriterion("worker_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIsNotNull() {
            addCriterion("worker_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIdEqualTo(Integer value) {
            addCriterion("worker_id =", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotEqualTo(Integer value) {
            addCriterion("worker_id <>", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThan(Integer value) {
            addCriterion("worker_id >", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("worker_id >=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThan(Integer value) {
            addCriterion("worker_id <", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdLessThanOrEqualTo(Integer value) {
            addCriterion("worker_id <=", value, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdIn(List<Integer> values) {
            addCriterion("worker_id in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotIn(List<Integer> values) {
            addCriterion("worker_id not in", values, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdBetween(Integer value1, Integer value2) {
            addCriterion("worker_id between", value1, value2, "workerId");
            return (Criteria) this;
        }

        public Criteria andWorkerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("worker_id not between", value1, value2, "workerId");
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

        public Criteria andOriginalMoneyIsNull() {
            addCriterion("original_money is null");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyIsNotNull() {
            addCriterion("original_money is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyEqualTo(Double value) {
            addCriterion("original_money =", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotEqualTo(Double value) {
            addCriterion("original_money <>", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyGreaterThan(Double value) {
            addCriterion("original_money >", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("original_money >=", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyLessThan(Double value) {
            addCriterion("original_money <", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("original_money <=", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyIn(List<Double> values) {
            addCriterion("original_money in", values, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotIn(List<Double> values) {
            addCriterion("original_money not in", values, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyBetween(Double value1, Double value2) {
            addCriterion("original_money between", value1, value2, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("original_money not between", value1, value2, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNull() {
            addCriterion("discount_money is null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIsNotNull() {
            addCriterion("discount_money is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyEqualTo(Double value) {
            addCriterion("discount_money =", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotEqualTo(Double value) {
            addCriterion("discount_money <>", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThan(Double value) {
            addCriterion("discount_money >", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_money >=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThan(Double value) {
            addCriterion("discount_money <", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyLessThanOrEqualTo(Double value) {
            addCriterion("discount_money <=", value, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyIn(List<Double> values) {
            addCriterion("discount_money in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotIn(List<Double> values) {
            addCriterion("discount_money not in", values, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyBetween(Double value1, Double value2) {
            addCriterion("discount_money between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andDiscountMoneyNotBetween(Double value1, Double value2) {
            addCriterion("discount_money not between", value1, value2, "discountMoney");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNull() {
            addCriterion("money is null");
            return (Criteria) this;
        }

        public Criteria andMoneyIsNotNull() {
            addCriterion("money is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyEqualTo(Double value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Double value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Double value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Double value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Double value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Double> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Double> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Double value1, Double value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Double value1, Double value2) {
            addCriterion("money not between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andDepositIsNull() {
            addCriterion("deposit is null");
            return (Criteria) this;
        }

        public Criteria andDepositIsNotNull() {
            addCriterion("deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDepositEqualTo(Integer value) {
            addCriterion("deposit =", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotEqualTo(Integer value) {
            addCriterion("deposit <>", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThan(Integer value) {
            addCriterion("deposit >", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositGreaterThanOrEqualTo(Integer value) {
            addCriterion("deposit >=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThan(Integer value) {
            addCriterion("deposit <", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositLessThanOrEqualTo(Integer value) {
            addCriterion("deposit <=", value, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositIn(List<Integer> values) {
            addCriterion("deposit in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotIn(List<Integer> values) {
            addCriterion("deposit not in", values, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositBetween(Integer value1, Integer value2) {
            addCriterion("deposit between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositNotBetween(Integer value1, Integer value2) {
            addCriterion("deposit not between", value1, value2, "deposit");
            return (Criteria) this;
        }

        public Criteria andDepositAwardIsNull() {
            addCriterion("deposit_award is null");
            return (Criteria) this;
        }

        public Criteria andDepositAwardIsNotNull() {
            addCriterion("deposit_award is not null");
            return (Criteria) this;
        }

        public Criteria andDepositAwardEqualTo(Double value) {
            addCriterion("deposit_award =", value, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardNotEqualTo(Double value) {
            addCriterion("deposit_award <>", value, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardGreaterThan(Double value) {
            addCriterion("deposit_award >", value, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardGreaterThanOrEqualTo(Double value) {
            addCriterion("deposit_award >=", value, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardLessThan(Double value) {
            addCriterion("deposit_award <", value, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardLessThanOrEqualTo(Double value) {
            addCriterion("deposit_award <=", value, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardIn(List<Double> values) {
            addCriterion("deposit_award in", values, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardNotIn(List<Double> values) {
            addCriterion("deposit_award not in", values, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardBetween(Double value1, Double value2) {
            addCriterion("deposit_award between", value1, value2, "depositAward");
            return (Criteria) this;
        }

        public Criteria andDepositAwardNotBetween(Double value1, Double value2) {
            addCriterion("deposit_award not between", value1, value2, "depositAward");
            return (Criteria) this;
        }

        public Criteria andAwardIsNull() {
            addCriterion("award is null");
            return (Criteria) this;
        }

        public Criteria andAwardIsNotNull() {
            addCriterion("award is not null");
            return (Criteria) this;
        }

        public Criteria andAwardEqualTo(Double value) {
            addCriterion("award =", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotEqualTo(Double value) {
            addCriterion("award <>", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardGreaterThan(Double value) {
            addCriterion("award >", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardGreaterThanOrEqualTo(Double value) {
            addCriterion("award >=", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLessThan(Double value) {
            addCriterion("award <", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardLessThanOrEqualTo(Double value) {
            addCriterion("award <=", value, "award");
            return (Criteria) this;
        }

        public Criteria andAwardIn(List<Double> values) {
            addCriterion("award in", values, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotIn(List<Double> values) {
            addCriterion("award not in", values, "award");
            return (Criteria) this;
        }

        public Criteria andAwardBetween(Double value1, Double value2) {
            addCriterion("award between", value1, value2, "award");
            return (Criteria) this;
        }

        public Criteria andAwardNotBetween(Double value1, Double value2) {
            addCriterion("award not between", value1, value2, "award");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyIsNull() {
            addCriterion("info_money is null");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyIsNotNull() {
            addCriterion("info_money is not null");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyEqualTo(Double value) {
            addCriterion("info_money =", value, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyNotEqualTo(Double value) {
            addCriterion("info_money <>", value, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyGreaterThan(Double value) {
            addCriterion("info_money >", value, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("info_money >=", value, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyLessThan(Double value) {
            addCriterion("info_money <", value, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyLessThanOrEqualTo(Double value) {
            addCriterion("info_money <=", value, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyIn(List<Double> values) {
            addCriterion("info_money in", values, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyNotIn(List<Double> values) {
            addCriterion("info_money not in", values, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyBetween(Double value1, Double value2) {
            addCriterion("info_money between", value1, value2, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andInfoMoneyNotBetween(Double value1, Double value2) {
            addCriterion("info_money not between", value1, value2, "infoMoney");
            return (Criteria) this;
        }

        public Criteria andActivityRateIsNull() {
            addCriterion("activity_rate is null");
            return (Criteria) this;
        }

        public Criteria andActivityRateIsNotNull() {
            addCriterion("activity_rate is not null");
            return (Criteria) this;
        }

        public Criteria andActivityRateEqualTo(Float value) {
            addCriterion("activity_rate =", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotEqualTo(Float value) {
            addCriterion("activity_rate <>", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateGreaterThan(Float value) {
            addCriterion("activity_rate >", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateGreaterThanOrEqualTo(Float value) {
            addCriterion("activity_rate >=", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateLessThan(Float value) {
            addCriterion("activity_rate <", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateLessThanOrEqualTo(Float value) {
            addCriterion("activity_rate <=", value, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateIn(List<Float> values) {
            addCriterion("activity_rate in", values, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotIn(List<Float> values) {
            addCriterion("activity_rate not in", values, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateBetween(Float value1, Float value2) {
            addCriterion("activity_rate between", value1, value2, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityRateNotBetween(Float value1, Float value2) {
            addCriterion("activity_rate not between", value1, value2, "activityRate");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyIsNull() {
            addCriterion("activity_money is null");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyIsNotNull() {
            addCriterion("activity_money is not null");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyEqualTo(Double value) {
            addCriterion("activity_money =", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyNotEqualTo(Double value) {
            addCriterion("activity_money <>", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyGreaterThan(Double value) {
            addCriterion("activity_money >", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("activity_money >=", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyLessThan(Double value) {
            addCriterion("activity_money <", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyLessThanOrEqualTo(Double value) {
            addCriterion("activity_money <=", value, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyIn(List<Double> values) {
            addCriterion("activity_money in", values, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyNotIn(List<Double> values) {
            addCriterion("activity_money not in", values, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyBetween(Double value1, Double value2) {
            addCriterion("activity_money between", value1, value2, "activityMoney");
            return (Criteria) this;
        }

        public Criteria andActivityMoneyNotBetween(Double value1, Double value2) {
            addCriterion("activity_money not between", value1, value2, "activityMoney");
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

        public Criteria andCategoryNameIsNull() {
            addCriterion("category_name is null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIsNotNull() {
            addCriterion("category_name is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryNameEqualTo(String value) {
            addCriterion("category_name =", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotEqualTo(String value) {
            addCriterion("category_name <>", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThan(String value) {
            addCriterion("category_name >", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameGreaterThanOrEqualTo(String value) {
            addCriterion("category_name >=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThan(String value) {
            addCriterion("category_name <", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLessThanOrEqualTo(String value) {
            addCriterion("category_name <=", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameLike(String value) {
            addCriterion("category_name like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotLike(String value) {
            addCriterion("category_name not like", value, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameIn(List<String> values) {
            addCriterion("category_name in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotIn(List<String> values) {
            addCriterion("category_name not in", values, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameBetween(String value1, String value2) {
            addCriterion("category_name between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andCategoryNameNotBetween(String value1, String value2) {
            addCriterion("category_name not between", value1, value2, "categoryName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNull() {
            addCriterion("grade_name is null");
            return (Criteria) this;
        }

        public Criteria andGradeNameIsNotNull() {
            addCriterion("grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNameEqualTo(String value) {
            addCriterion("grade_name =", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotEqualTo(String value) {
            addCriterion("grade_name <>", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThan(String value) {
            addCriterion("grade_name >", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("grade_name >=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThan(String value) {
            addCriterion("grade_name <", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLessThanOrEqualTo(String value) {
            addCriterion("grade_name <=", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameLike(String value) {
            addCriterion("grade_name like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotLike(String value) {
            addCriterion("grade_name not like", value, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameIn(List<String> values) {
            addCriterion("grade_name in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotIn(List<String> values) {
            addCriterion("grade_name not in", values, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameBetween(String value1, String value2) {
            addCriterion("grade_name between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNameNotBetween(String value1, String value2) {
            addCriterion("grade_name not between", value1, value2, "gradeName");
            return (Criteria) this;
        }

        public Criteria andGradeNumberIsNull() {
            addCriterion("grade_number is null");
            return (Criteria) this;
        }

        public Criteria andGradeNumberIsNotNull() {
            addCriterion("grade_number is not null");
            return (Criteria) this;
        }

        public Criteria andGradeNumberEqualTo(Integer value) {
            addCriterion("grade_number =", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberNotEqualTo(Integer value) {
            addCriterion("grade_number <>", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberGreaterThan(Integer value) {
            addCriterion("grade_number >", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade_number >=", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberLessThan(Integer value) {
            addCriterion("grade_number <", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberLessThanOrEqualTo(Integer value) {
            addCriterion("grade_number <=", value, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberIn(List<Integer> values) {
            addCriterion("grade_number in", values, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberNotIn(List<Integer> values) {
            addCriterion("grade_number not in", values, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberBetween(Integer value1, Integer value2) {
            addCriterion("grade_number between", value1, value2, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andGradeNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("grade_number not between", value1, value2, "gradeNumber");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnIsNull() {
            addCriterion("account_log_sn is null");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnIsNotNull() {
            addCriterion("account_log_sn is not null");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnEqualTo(String value) {
            addCriterion("account_log_sn =", value, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnNotEqualTo(String value) {
            addCriterion("account_log_sn <>", value, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnGreaterThan(String value) {
            addCriterion("account_log_sn >", value, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnGreaterThanOrEqualTo(String value) {
            addCriterion("account_log_sn >=", value, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnLessThan(String value) {
            addCriterion("account_log_sn <", value, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnLessThanOrEqualTo(String value) {
            addCriterion("account_log_sn <=", value, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnLike(String value) {
            addCriterion("account_log_sn like", value, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnNotLike(String value) {
            addCriterion("account_log_sn not like", value, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnIn(List<String> values) {
            addCriterion("account_log_sn in", values, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnNotIn(List<String> values) {
            addCriterion("account_log_sn not in", values, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnBetween(String value1, String value2) {
            addCriterion("account_log_sn between", value1, value2, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andAccountLogSnNotBetween(String value1, String value2) {
            addCriterion("account_log_sn not between", value1, value2, "accountLogSn");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyIsNull() {
            addCriterion("brokerage_refund_money is null");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyIsNotNull() {
            addCriterion("brokerage_refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyEqualTo(Double value) {
            addCriterion("brokerage_refund_money =", value, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyNotEqualTo(Double value) {
            addCriterion("brokerage_refund_money <>", value, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyGreaterThan(Double value) {
            addCriterion("brokerage_refund_money >", value, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("brokerage_refund_money >=", value, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyLessThan(Double value) {
            addCriterion("brokerage_refund_money <", value, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyLessThanOrEqualTo(Double value) {
            addCriterion("brokerage_refund_money <=", value, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyIn(List<Double> values) {
            addCriterion("brokerage_refund_money in", values, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyNotIn(List<Double> values) {
            addCriterion("brokerage_refund_money not in", values, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyBetween(Double value1, Double value2) {
            addCriterion("brokerage_refund_money between", value1, value2, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBrokerageRefundMoneyNotBetween(Double value1, Double value2) {
            addCriterion("brokerage_refund_money not between", value1, value2, "brokerageRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyIsNull() {
            addCriterion("bonus_money is null");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyIsNotNull() {
            addCriterion("bonus_money is not null");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyEqualTo(Double value) {
            addCriterion("bonus_money =", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyNotEqualTo(Double value) {
            addCriterion("bonus_money <>", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyGreaterThan(Double value) {
            addCriterion("bonus_money >", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bonus_money >=", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyLessThan(Double value) {
            addCriterion("bonus_money <", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyLessThanOrEqualTo(Double value) {
            addCriterion("bonus_money <=", value, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyIn(List<Double> values) {
            addCriterion("bonus_money in", values, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyNotIn(List<Double> values) {
            addCriterion("bonus_money not in", values, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyBetween(Double value1, Double value2) {
            addCriterion("bonus_money between", value1, value2, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andBonusMoneyNotBetween(Double value1, Double value2) {
            addCriterion("bonus_money not between", value1, value2, "bonusMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyIsNull() {
            addCriterion("make_good_money is null");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyIsNotNull() {
            addCriterion("make_good_money is not null");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyEqualTo(Double value) {
            addCriterion("make_good_money =", value, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyNotEqualTo(Double value) {
            addCriterion("make_good_money <>", value, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyGreaterThan(Double value) {
            addCriterion("make_good_money >", value, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("make_good_money >=", value, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyLessThan(Double value) {
            addCriterion("make_good_money <", value, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyLessThanOrEqualTo(Double value) {
            addCriterion("make_good_money <=", value, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyIn(List<Double> values) {
            addCriterion("make_good_money in", values, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyNotIn(List<Double> values) {
            addCriterion("make_good_money not in", values, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyBetween(Double value1, Double value2) {
            addCriterion("make_good_money between", value1, value2, "makeGoodMoney");
            return (Criteria) this;
        }

        public Criteria andMakeGoodMoneyNotBetween(Double value1, Double value2) {
            addCriterion("make_good_money not between", value1, value2, "makeGoodMoney");
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