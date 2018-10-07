package net.hualisheng.springBootWebDemo.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LubanAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LubanAccountExample() {
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

        public Criteria andTotalMoneyIsNull() {
            addCriterion("total_money is null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIsNotNull() {
            addCriterion("total_money is not null");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyEqualTo(BigDecimal value) {
            addCriterion("total_money =", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("total_money <>", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThan(BigDecimal value) {
            addCriterion("total_money >", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_money >=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThan(BigDecimal value) {
            addCriterion("total_money <", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_money <=", value, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyIn(List<BigDecimal> values) {
            addCriterion("total_money in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("total_money not in", values, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_money between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andTotalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_money not between", value1, value2, "totalMoney");
            return (Criteria) this;
        }

        public Criteria andAccountInIsNull() {
            addCriterion("account_in is null");
            return (Criteria) this;
        }

        public Criteria andAccountInIsNotNull() {
            addCriterion("account_in is not null");
            return (Criteria) this;
        }

        public Criteria andAccountInEqualTo(BigDecimal value) {
            addCriterion("account_in =", value, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInNotEqualTo(BigDecimal value) {
            addCriterion("account_in <>", value, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInGreaterThan(BigDecimal value) {
            addCriterion("account_in >", value, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_in >=", value, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInLessThan(BigDecimal value) {
            addCriterion("account_in <", value, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_in <=", value, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInIn(List<BigDecimal> values) {
            addCriterion("account_in in", values, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInNotIn(List<BigDecimal> values) {
            addCriterion("account_in not in", values, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_in between", value1, value2, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountInNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_in not between", value1, value2, "accountIn");
            return (Criteria) this;
        }

        public Criteria andAccountOutIsNull() {
            addCriterion("account_out is null");
            return (Criteria) this;
        }

        public Criteria andAccountOutIsNotNull() {
            addCriterion("account_out is not null");
            return (Criteria) this;
        }

        public Criteria andAccountOutEqualTo(BigDecimal value) {
            addCriterion("account_out =", value, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutNotEqualTo(BigDecimal value) {
            addCriterion("account_out <>", value, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutGreaterThan(BigDecimal value) {
            addCriterion("account_out >", value, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("account_out >=", value, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutLessThan(BigDecimal value) {
            addCriterion("account_out <", value, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutLessThanOrEqualTo(BigDecimal value) {
            addCriterion("account_out <=", value, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutIn(List<BigDecimal> values) {
            addCriterion("account_out in", values, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutNotIn(List<BigDecimal> values) {
            addCriterion("account_out not in", values, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_out between", value1, value2, "accountOut");
            return (Criteria) this;
        }

        public Criteria andAccountOutNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("account_out not between", value1, value2, "accountOut");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyIsNull() {
            addCriterion("withdrawal_money is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyIsNotNull() {
            addCriterion("withdrawal_money is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyEqualTo(BigDecimal value) {
            addCriterion("withdrawal_money =", value, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyNotEqualTo(BigDecimal value) {
            addCriterion("withdrawal_money <>", value, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyGreaterThan(BigDecimal value) {
            addCriterion("withdrawal_money >", value, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawal_money >=", value, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyLessThan(BigDecimal value) {
            addCriterion("withdrawal_money <", value, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("withdrawal_money <=", value, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyIn(List<BigDecimal> values) {
            addCriterion("withdrawal_money in", values, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyNotIn(List<BigDecimal> values) {
            addCriterion("withdrawal_money not in", values, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawal_money between", value1, value2, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andWithdrawalMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("withdrawal_money not between", value1, value2, "withdrawalMoney");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIsNull() {
            addCriterion("trade_password is null");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIsNotNull() {
            addCriterion("trade_password is not null");
            return (Criteria) this;
        }

        public Criteria andTradePasswordEqualTo(String value) {
            addCriterion("trade_password =", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotEqualTo(String value) {
            addCriterion("trade_password <>", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordGreaterThan(String value) {
            addCriterion("trade_password >", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordGreaterThanOrEqualTo(String value) {
            addCriterion("trade_password >=", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLessThan(String value) {
            addCriterion("trade_password <", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLessThanOrEqualTo(String value) {
            addCriterion("trade_password <=", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordLike(String value) {
            addCriterion("trade_password like", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotLike(String value) {
            addCriterion("trade_password not like", value, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordIn(List<String> values) {
            addCriterion("trade_password in", values, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotIn(List<String> values) {
            addCriterion("trade_password not in", values, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordBetween(String value1, String value2) {
            addCriterion("trade_password between", value1, value2, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andTradePasswordNotBetween(String value1, String value2) {
            addCriterion("trade_password not between", value1, value2, "tradePassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordIsNull() {
            addCriterion("query_password is null");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordIsNotNull() {
            addCriterion("query_password is not null");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordEqualTo(String value) {
            addCriterion("query_password =", value, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordNotEqualTo(String value) {
            addCriterion("query_password <>", value, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordGreaterThan(String value) {
            addCriterion("query_password >", value, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("query_password >=", value, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordLessThan(String value) {
            addCriterion("query_password <", value, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordLessThanOrEqualTo(String value) {
            addCriterion("query_password <=", value, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordLike(String value) {
            addCriterion("query_password like", value, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordNotLike(String value) {
            addCriterion("query_password not like", value, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordIn(List<String> values) {
            addCriterion("query_password in", values, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordNotIn(List<String> values) {
            addCriterion("query_password not in", values, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordBetween(String value1, String value2) {
            addCriterion("query_password between", value1, value2, "queryPassword");
            return (Criteria) this;
        }

        public Criteria andQueryPasswordNotBetween(String value1, String value2) {
            addCriterion("query_password not between", value1, value2, "queryPassword");
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