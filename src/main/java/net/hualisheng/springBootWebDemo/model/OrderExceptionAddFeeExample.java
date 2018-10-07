package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExceptionAddFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExceptionAddFeeExample() {
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

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyIsNull() {
            addCriterion("luban_money is null");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyIsNotNull() {
            addCriterion("luban_money is not null");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyEqualTo(Float value) {
            addCriterion("luban_money =", value, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyNotEqualTo(Float value) {
            addCriterion("luban_money <>", value, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyGreaterThan(Float value) {
            addCriterion("luban_money >", value, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("luban_money >=", value, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyLessThan(Float value) {
            addCriterion("luban_money <", value, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyLessThanOrEqualTo(Float value) {
            addCriterion("luban_money <=", value, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyIn(List<Float> values) {
            addCriterion("luban_money in", values, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyNotIn(List<Float> values) {
            addCriterion("luban_money not in", values, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyBetween(Float value1, Float value2) {
            addCriterion("luban_money between", value1, value2, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andLubanMoneyNotBetween(Float value1, Float value2) {
            addCriterion("luban_money not between", value1, value2, "lubanMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyIsNull() {
            addCriterion("business_money is null");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyIsNotNull() {
            addCriterion("business_money is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyEqualTo(Float value) {
            addCriterion("business_money =", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyNotEqualTo(Float value) {
            addCriterion("business_money <>", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyGreaterThan(Float value) {
            addCriterion("business_money >", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("business_money >=", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyLessThan(Float value) {
            addCriterion("business_money <", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyLessThanOrEqualTo(Float value) {
            addCriterion("business_money <=", value, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyIn(List<Float> values) {
            addCriterion("business_money in", values, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyNotIn(List<Float> values) {
            addCriterion("business_money not in", values, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyBetween(Float value1, Float value2) {
            addCriterion("business_money between", value1, value2, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andBusinessMoneyNotBetween(Float value1, Float value2) {
            addCriterion("business_money not between", value1, value2, "businessMoney");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNull() {
            addCriterion("check_result is null");
            return (Criteria) this;
        }

        public Criteria andCheckResultIsNotNull() {
            addCriterion("check_result is not null");
            return (Criteria) this;
        }

        public Criteria andCheckResultEqualTo(Integer value) {
            addCriterion("check_result =", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotEqualTo(Integer value) {
            addCriterion("check_result <>", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThan(Integer value) {
            addCriterion("check_result >", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_result >=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThan(Integer value) {
            addCriterion("check_result <", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultLessThanOrEqualTo(Integer value) {
            addCriterion("check_result <=", value, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultIn(List<Integer> values) {
            addCriterion("check_result in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotIn(List<Integer> values) {
            addCriterion("check_result not in", values, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultBetween(Integer value1, Integer value2) {
            addCriterion("check_result between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andCheckResultNotBetween(Integer value1, Integer value2) {
            addCriterion("check_result not between", value1, value2, "checkResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultIsNull() {
            addCriterion("business_check_result is null");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultIsNotNull() {
            addCriterion("business_check_result is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultEqualTo(Integer value) {
            addCriterion("business_check_result =", value, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultNotEqualTo(Integer value) {
            addCriterion("business_check_result <>", value, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultGreaterThan(Integer value) {
            addCriterion("business_check_result >", value, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_check_result >=", value, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultLessThan(Integer value) {
            addCriterion("business_check_result <", value, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultLessThanOrEqualTo(Integer value) {
            addCriterion("business_check_result <=", value, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultIn(List<Integer> values) {
            addCriterion("business_check_result in", values, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultNotIn(List<Integer> values) {
            addCriterion("business_check_result not in", values, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultBetween(Integer value1, Integer value2) {
            addCriterion("business_check_result between", value1, value2, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andBusinessCheckResultNotBetween(Integer value1, Integer value2) {
            addCriterion("business_check_result not between", value1, value2, "businessCheckResult");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
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

        public Criteria andRecordStatusIsNull() {
            addCriterion("record_status is null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIsNotNull() {
            addCriterion("record_status is not null");
            return (Criteria) this;
        }

        public Criteria andRecordStatusEqualTo(Integer value) {
            addCriterion("record_status =", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotEqualTo(Integer value) {
            addCriterion("record_status <>", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThan(Integer value) {
            addCriterion("record_status >", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("record_status >=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThan(Integer value) {
            addCriterion("record_status <", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("record_status <=", value, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusIn(List<Integer> values) {
            addCriterion("record_status in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotIn(List<Integer> values) {
            addCriterion("record_status not in", values, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("record_status between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("record_status not between", value1, value2, "recordStatus");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdIsNull() {
            addCriterion("orderlog_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdIsNotNull() {
            addCriterion("orderlog_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdEqualTo(Integer value) {
            addCriterion("orderlog_id =", value, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdNotEqualTo(Integer value) {
            addCriterion("orderlog_id <>", value, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdGreaterThan(Integer value) {
            addCriterion("orderlog_id >", value, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderlog_id >=", value, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdLessThan(Integer value) {
            addCriterion("orderlog_id <", value, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdLessThanOrEqualTo(Integer value) {
            addCriterion("orderlog_id <=", value, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdIn(List<Integer> values) {
            addCriterion("orderlog_id in", values, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdNotIn(List<Integer> values) {
            addCriterion("orderlog_id not in", values, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdBetween(Integer value1, Integer value2) {
            addCriterion("orderlog_id between", value1, value2, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andOrderlogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("orderlog_id not between", value1, value2, "orderlogId");
            return (Criteria) this;
        }

        public Criteria andIfPercentageIsNull() {
            addCriterion("if_percentage is null");
            return (Criteria) this;
        }

        public Criteria andIfPercentageIsNotNull() {
            addCriterion("if_percentage is not null");
            return (Criteria) this;
        }

        public Criteria andIfPercentageEqualTo(Integer value) {
            addCriterion("if_percentage =", value, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageNotEqualTo(Integer value) {
            addCriterion("if_percentage <>", value, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageGreaterThan(Integer value) {
            addCriterion("if_percentage >", value, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageGreaterThanOrEqualTo(Integer value) {
            addCriterion("if_percentage >=", value, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageLessThan(Integer value) {
            addCriterion("if_percentage <", value, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageLessThanOrEqualTo(Integer value) {
            addCriterion("if_percentage <=", value, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageIn(List<Integer> values) {
            addCriterion("if_percentage in", values, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageNotIn(List<Integer> values) {
            addCriterion("if_percentage not in", values, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageBetween(Integer value1, Integer value2) {
            addCriterion("if_percentage between", value1, value2, "ifPercentage");
            return (Criteria) this;
        }

        public Criteria andIfPercentageNotBetween(Integer value1, Integer value2) {
            addCriterion("if_percentage not between", value1, value2, "ifPercentage");
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