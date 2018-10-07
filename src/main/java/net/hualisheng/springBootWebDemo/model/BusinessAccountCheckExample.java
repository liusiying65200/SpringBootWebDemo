package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessAccountCheckExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessAccountCheckExample() {
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

        public Criteria andBusinessIdIsNull() {
            addCriterion("business_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIsNotNull() {
            addCriterion("business_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIdEqualTo(Integer value) {
            addCriterion("business_id =", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotEqualTo(Integer value) {
            addCriterion("business_id <>", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThan(Integer value) {
            addCriterion("business_id >", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_id >=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThan(Integer value) {
            addCriterion("business_id <", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_id <=", value, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdIn(List<Integer> values) {
            addCriterion("business_id in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotIn(List<Integer> values) {
            addCriterion("business_id not in", values, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdBetween(Integer value1, Integer value2) {
            addCriterion("business_id between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBusinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_id not between", value1, value2, "businessId");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Date value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Date value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Date value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Date value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Date value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Date> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Date> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Date value1, Date value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Date value1, Date value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNull() {
            addCriterion("recharge_money is null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIsNotNull() {
            addCriterion("recharge_money is not null");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyEqualTo(Double value) {
            addCriterion("recharge_money =", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotEqualTo(Double value) {
            addCriterion("recharge_money <>", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThan(Double value) {
            addCriterion("recharge_money >", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("recharge_money >=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThan(Double value) {
            addCriterion("recharge_money <", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("recharge_money <=", value, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyIn(List<Double> values) {
            addCriterion("recharge_money in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotIn(List<Double> values) {
            addCriterion("recharge_money not in", values, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyBetween(Double value1, Double value2) {
            addCriterion("recharge_money between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andRechargeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("recharge_money not between", value1, value2, "rechargeMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyIsNull() {
            addCriterion("normal_money is null");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyIsNotNull() {
            addCriterion("normal_money is not null");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyEqualTo(Double value) {
            addCriterion("normal_money =", value, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyNotEqualTo(Double value) {
            addCriterion("normal_money <>", value, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyGreaterThan(Double value) {
            addCriterion("normal_money >", value, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("normal_money >=", value, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyLessThan(Double value) {
            addCriterion("normal_money <", value, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("normal_money <=", value, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyIn(List<Double> values) {
            addCriterion("normal_money in", values, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyNotIn(List<Double> values) {
            addCriterion("normal_money not in", values, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyBetween(Double value1, Double value2) {
            addCriterion("normal_money between", value1, value2, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andNormalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("normal_money not between", value1, value2, "normalMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyIsNull() {
            addCriterion("exception_money is null");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyIsNotNull() {
            addCriterion("exception_money is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyEqualTo(Double value) {
            addCriterion("exception_money =", value, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyNotEqualTo(Double value) {
            addCriterion("exception_money <>", value, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyGreaterThan(Double value) {
            addCriterion("exception_money >", value, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("exception_money >=", value, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyLessThan(Double value) {
            addCriterion("exception_money <", value, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyLessThanOrEqualTo(Double value) {
            addCriterion("exception_money <=", value, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyIn(List<Double> values) {
            addCriterion("exception_money in", values, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyNotIn(List<Double> values) {
            addCriterion("exception_money not in", values, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyBetween(Double value1, Double value2) {
            addCriterion("exception_money between", value1, value2, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andExceptionMoneyNotBetween(Double value1, Double value2) {
            addCriterion("exception_money not between", value1, value2, "exceptionMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyIsNull() {
            addCriterion("reparations_money is null");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyIsNotNull() {
            addCriterion("reparations_money is not null");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyEqualTo(Double value) {
            addCriterion("reparations_money =", value, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyNotEqualTo(Double value) {
            addCriterion("reparations_money <>", value, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyGreaterThan(Double value) {
            addCriterion("reparations_money >", value, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("reparations_money >=", value, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyLessThan(Double value) {
            addCriterion("reparations_money <", value, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyLessThanOrEqualTo(Double value) {
            addCriterion("reparations_money <=", value, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyIn(List<Double> values) {
            addCriterion("reparations_money in", values, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyNotIn(List<Double> values) {
            addCriterion("reparations_money not in", values, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyBetween(Double value1, Double value2) {
            addCriterion("reparations_money between", value1, value2, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andReparationsMoneyNotBetween(Double value1, Double value2) {
            addCriterion("reparations_money not between", value1, value2, "reparationsMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceIsNull() {
            addCriterion("last_balance is null");
            return (Criteria) this;
        }

        public Criteria andLastBalanceIsNotNull() {
            addCriterion("last_balance is not null");
            return (Criteria) this;
        }

        public Criteria andLastBalanceEqualTo(Double value) {
            addCriterion("last_balance =", value, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceNotEqualTo(Double value) {
            addCriterion("last_balance <>", value, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceGreaterThan(Double value) {
            addCriterion("last_balance >", value, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("last_balance >=", value, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceLessThan(Double value) {
            addCriterion("last_balance <", value, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceLessThanOrEqualTo(Double value) {
            addCriterion("last_balance <=", value, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceIn(List<Double> values) {
            addCriterion("last_balance in", values, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceNotIn(List<Double> values) {
            addCriterion("last_balance not in", values, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceBetween(Double value1, Double value2) {
            addCriterion("last_balance between", value1, value2, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andLastBalanceNotBetween(Double value1, Double value2) {
            addCriterion("last_balance not between", value1, value2, "lastBalance");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNull() {
            addCriterion("sort_num is null");
            return (Criteria) this;
        }

        public Criteria andSortNumIsNotNull() {
            addCriterion("sort_num is not null");
            return (Criteria) this;
        }

        public Criteria andSortNumEqualTo(Double value) {
            addCriterion("sort_num =", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotEqualTo(Double value) {
            addCriterion("sort_num <>", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThan(Double value) {
            addCriterion("sort_num >", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumGreaterThanOrEqualTo(Double value) {
            addCriterion("sort_num >=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThan(Double value) {
            addCriterion("sort_num <", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumLessThanOrEqualTo(Double value) {
            addCriterion("sort_num <=", value, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumIn(List<Double> values) {
            addCriterion("sort_num in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotIn(List<Double> values) {
            addCriterion("sort_num not in", values, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumBetween(Double value1, Double value2) {
            addCriterion("sort_num between", value1, value2, "sortNum");
            return (Criteria) this;
        }

        public Criteria andSortNumNotBetween(Double value1, Double value2) {
            addCriterion("sort_num not between", value1, value2, "sortNum");
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

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNull() {
            addCriterion("modify_user is null");
            return (Criteria) this;
        }

        public Criteria andModifyUserIsNotNull() {
            addCriterion("modify_user is not null");
            return (Criteria) this;
        }

        public Criteria andModifyUserEqualTo(Integer value) {
            addCriterion("modify_user =", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotEqualTo(Integer value) {
            addCriterion("modify_user <>", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThan(Integer value) {
            addCriterion("modify_user >", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("modify_user >=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThan(Integer value) {
            addCriterion("modify_user <", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserLessThanOrEqualTo(Integer value) {
            addCriterion("modify_user <=", value, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserIn(List<Integer> values) {
            addCriterion("modify_user in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotIn(List<Integer> values) {
            addCriterion("modify_user not in", values, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserBetween(Integer value1, Integer value2) {
            addCriterion("modify_user between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andModifyUserNotBetween(Integer value1, Integer value2) {
            addCriterion("modify_user not between", value1, value2, "modifyUser");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyIsNull() {
            addCriterion("empty_run_money is null");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyIsNotNull() {
            addCriterion("empty_run_money is not null");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyEqualTo(Double value) {
            addCriterion("empty_run_money =", value, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyNotEqualTo(Double value) {
            addCriterion("empty_run_money <>", value, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyGreaterThan(Double value) {
            addCriterion("empty_run_money >", value, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("empty_run_money >=", value, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyLessThan(Double value) {
            addCriterion("empty_run_money <", value, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyLessThanOrEqualTo(Double value) {
            addCriterion("empty_run_money <=", value, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyIn(List<Double> values) {
            addCriterion("empty_run_money in", values, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyNotIn(List<Double> values) {
            addCriterion("empty_run_money not in", values, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyBetween(Double value1, Double value2) {
            addCriterion("empty_run_money between", value1, value2, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andEmptyRunMoneyNotBetween(Double value1, Double value2) {
            addCriterion("empty_run_money not between", value1, value2, "emptyRunMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNull() {
            addCriterion("refund_money is null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIsNotNull() {
            addCriterion("refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyEqualTo(Double value) {
            addCriterion("refund_money =", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotEqualTo(Double value) {
            addCriterion("refund_money <>", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThan(Double value) {
            addCriterion("refund_money >", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("refund_money >=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThan(Double value) {
            addCriterion("refund_money <", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyLessThanOrEqualTo(Double value) {
            addCriterion("refund_money <=", value, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyIn(List<Double> values) {
            addCriterion("refund_money in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotIn(List<Double> values) {
            addCriterion("refund_money not in", values, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyBetween(Double value1, Double value2) {
            addCriterion("refund_money between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andRefundMoneyNotBetween(Double value1, Double value2) {
            addCriterion("refund_money not between", value1, value2, "refundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyIsNull() {
            addCriterion("coin_total_money is null");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyIsNotNull() {
            addCriterion("coin_total_money is not null");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyEqualTo(Double value) {
            addCriterion("coin_total_money =", value, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyNotEqualTo(Double value) {
            addCriterion("coin_total_money <>", value, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyGreaterThan(Double value) {
            addCriterion("coin_total_money >", value, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("coin_total_money >=", value, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyLessThan(Double value) {
            addCriterion("coin_total_money <", value, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("coin_total_money <=", value, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyIn(List<Double> values) {
            addCriterion("coin_total_money in", values, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyNotIn(List<Double> values) {
            addCriterion("coin_total_money not in", values, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyBetween(Double value1, Double value2) {
            addCriterion("coin_total_money between", value1, value2, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinTotalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("coin_total_money not between", value1, value2, "coinTotalMoney");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceIsNull() {
            addCriterion("coin_balance is null");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceIsNotNull() {
            addCriterion("coin_balance is not null");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceEqualTo(Double value) {
            addCriterion("coin_balance =", value, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceNotEqualTo(Double value) {
            addCriterion("coin_balance <>", value, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceGreaterThan(Double value) {
            addCriterion("coin_balance >", value, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("coin_balance >=", value, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceLessThan(Double value) {
            addCriterion("coin_balance <", value, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceLessThanOrEqualTo(Double value) {
            addCriterion("coin_balance <=", value, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceIn(List<Double> values) {
            addCriterion("coin_balance in", values, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceNotIn(List<Double> values) {
            addCriterion("coin_balance not in", values, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceBetween(Double value1, Double value2) {
            addCriterion("coin_balance between", value1, value2, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinBalanceNotBetween(Double value1, Double value2) {
            addCriterion("coin_balance not between", value1, value2, "coinBalance");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyIsNull() {
            addCriterion("coin_use_money is null");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyIsNotNull() {
            addCriterion("coin_use_money is not null");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyEqualTo(Double value) {
            addCriterion("coin_use_money =", value, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyNotEqualTo(Double value) {
            addCriterion("coin_use_money <>", value, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyGreaterThan(Double value) {
            addCriterion("coin_use_money >", value, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("coin_use_money >=", value, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyLessThan(Double value) {
            addCriterion("coin_use_money <", value, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyLessThanOrEqualTo(Double value) {
            addCriterion("coin_use_money <=", value, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyIn(List<Double> values) {
            addCriterion("coin_use_money in", values, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyNotIn(List<Double> values) {
            addCriterion("coin_use_money not in", values, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyBetween(Double value1, Double value2) {
            addCriterion("coin_use_money between", value1, value2, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinUseMoneyNotBetween(Double value1, Double value2) {
            addCriterion("coin_use_money not between", value1, value2, "coinUseMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyIsNull() {
            addCriterion("coin_refund_money is null");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyIsNotNull() {
            addCriterion("coin_refund_money is not null");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyEqualTo(Double value) {
            addCriterion("coin_refund_money =", value, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyNotEqualTo(Double value) {
            addCriterion("coin_refund_money <>", value, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyGreaterThan(Double value) {
            addCriterion("coin_refund_money >", value, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("coin_refund_money >=", value, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyLessThan(Double value) {
            addCriterion("coin_refund_money <", value, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyLessThanOrEqualTo(Double value) {
            addCriterion("coin_refund_money <=", value, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyIn(List<Double> values) {
            addCriterion("coin_refund_money in", values, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyNotIn(List<Double> values) {
            addCriterion("coin_refund_money not in", values, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyBetween(Double value1, Double value2) {
            addCriterion("coin_refund_money between", value1, value2, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andCoinRefundMoneyNotBetween(Double value1, Double value2) {
            addCriterion("coin_refund_money not between", value1, value2, "coinRefundMoney");
            return (Criteria) this;
        }

        public Criteria andBackFeeIsNull() {
            addCriterion("back_fee is null");
            return (Criteria) this;
        }

        public Criteria andBackFeeIsNotNull() {
            addCriterion("back_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBackFeeEqualTo(Integer value) {
            addCriterion("back_fee =", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeNotEqualTo(Integer value) {
            addCriterion("back_fee <>", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeGreaterThan(Integer value) {
            addCriterion("back_fee >", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("back_fee >=", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeLessThan(Integer value) {
            addCriterion("back_fee <", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeLessThanOrEqualTo(Integer value) {
            addCriterion("back_fee <=", value, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeIn(List<Integer> values) {
            addCriterion("back_fee in", values, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeNotIn(List<Integer> values) {
            addCriterion("back_fee not in", values, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeBetween(Integer value1, Integer value2) {
            addCriterion("back_fee between", value1, value2, "backFee");
            return (Criteria) this;
        }

        public Criteria andBackFeeNotBetween(Integer value1, Integer value2) {
            addCriterion("back_fee not between", value1, value2, "backFee");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyIsNull() {
            addCriterion("hpfx_money is null");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyIsNotNull() {
            addCriterion("hpfx_money is not null");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyEqualTo(Double value) {
            addCriterion("hpfx_money =", value, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyNotEqualTo(Double value) {
            addCriterion("hpfx_money <>", value, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyGreaterThan(Double value) {
            addCriterion("hpfx_money >", value, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("hpfx_money >=", value, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyLessThan(Double value) {
            addCriterion("hpfx_money <", value, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyLessThanOrEqualTo(Double value) {
            addCriterion("hpfx_money <=", value, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyIn(List<Double> values) {
            addCriterion("hpfx_money in", values, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyNotIn(List<Double> values) {
            addCriterion("hpfx_money not in", values, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyBetween(Double value1, Double value2) {
            addCriterion("hpfx_money between", value1, value2, "hpfxMoney");
            return (Criteria) this;
        }

        public Criteria andHpfxMoneyNotBetween(Double value1, Double value2) {
            addCriterion("hpfx_money not between", value1, value2, "hpfxMoney");
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