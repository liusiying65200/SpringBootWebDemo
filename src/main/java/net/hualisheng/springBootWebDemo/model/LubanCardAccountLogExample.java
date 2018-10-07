package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LubanCardAccountLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LubanCardAccountLogExample() {
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

        public Criteria andLubanCardAccountIdIsNull() {
            addCriterion("luban_card_account_id is null");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdIsNotNull() {
            addCriterion("luban_card_account_id is not null");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdEqualTo(Integer value) {
            addCriterion("luban_card_account_id =", value, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdNotEqualTo(Integer value) {
            addCriterion("luban_card_account_id <>", value, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdGreaterThan(Integer value) {
            addCriterion("luban_card_account_id >", value, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("luban_card_account_id >=", value, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdLessThan(Integer value) {
            addCriterion("luban_card_account_id <", value, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdLessThanOrEqualTo(Integer value) {
            addCriterion("luban_card_account_id <=", value, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdIn(List<Integer> values) {
            addCriterion("luban_card_account_id in", values, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdNotIn(List<Integer> values) {
            addCriterion("luban_card_account_id not in", values, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdBetween(Integer value1, Integer value2) {
            addCriterion("luban_card_account_id between", value1, value2, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andLubanCardAccountIdNotBetween(Integer value1, Integer value2) {
            addCriterion("luban_card_account_id not between", value1, value2, "lubanCardAccountId");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnIsNull() {
            addCriterion("account_sn is null");
            return (Criteria) this;
        }

        public Criteria andAccountSnIsNotNull() {
            addCriterion("account_sn is not null");
            return (Criteria) this;
        }

        public Criteria andAccountSnEqualTo(String value) {
            addCriterion("account_sn =", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnNotEqualTo(String value) {
            addCriterion("account_sn <>", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnGreaterThan(String value) {
            addCriterion("account_sn >", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnGreaterThanOrEqualTo(String value) {
            addCriterion("account_sn >=", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnLessThan(String value) {
            addCriterion("account_sn <", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnLessThanOrEqualTo(String value) {
            addCriterion("account_sn <=", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnLike(String value) {
            addCriterion("account_sn like", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnNotLike(String value) {
            addCriterion("account_sn not like", value, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnIn(List<String> values) {
            addCriterion("account_sn in", values, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnNotIn(List<String> values) {
            addCriterion("account_sn not in", values, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnBetween(String value1, String value2) {
            addCriterion("account_sn between", value1, value2, "accountSn");
            return (Criteria) this;
        }

        public Criteria andAccountSnNotBetween(String value1, String value2) {
            addCriterion("account_sn not between", value1, value2, "accountSn");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeIsNull() {
            addCriterion("luban_coin_change is null");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeIsNotNull() {
            addCriterion("luban_coin_change is not null");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeEqualTo(Double value) {
            addCriterion("luban_coin_change =", value, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeNotEqualTo(Double value) {
            addCriterion("luban_coin_change <>", value, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeGreaterThan(Double value) {
            addCriterion("luban_coin_change >", value, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("luban_coin_change >=", value, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeLessThan(Double value) {
            addCriterion("luban_coin_change <", value, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeLessThanOrEqualTo(Double value) {
            addCriterion("luban_coin_change <=", value, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeIn(List<Double> values) {
            addCriterion("luban_coin_change in", values, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeNotIn(List<Double> values) {
            addCriterion("luban_coin_change not in", values, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeBetween(Double value1, Double value2) {
            addCriterion("luban_coin_change between", value1, value2, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinChangeNotBetween(Double value1, Double value2) {
            addCriterion("luban_coin_change not between", value1, value2, "lubanCoinChange");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceIsNull() {
            addCriterion("luban_coin_balance is null");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceIsNotNull() {
            addCriterion("luban_coin_balance is not null");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceEqualTo(Double value) {
            addCriterion("luban_coin_balance =", value, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceNotEqualTo(Double value) {
            addCriterion("luban_coin_balance <>", value, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceGreaterThan(Double value) {
            addCriterion("luban_coin_balance >", value, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("luban_coin_balance >=", value, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceLessThan(Double value) {
            addCriterion("luban_coin_balance <", value, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceLessThanOrEqualTo(Double value) {
            addCriterion("luban_coin_balance <=", value, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceIn(List<Double> values) {
            addCriterion("luban_coin_balance in", values, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceNotIn(List<Double> values) {
            addCriterion("luban_coin_balance not in", values, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceBetween(Double value1, Double value2) {
            addCriterion("luban_coin_balance between", value1, value2, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBalanceNotBetween(Double value1, Double value2) {
            addCriterion("luban_coin_balance not between", value1, value2, "lubanCoinBalance");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNull() {
            addCriterion("log_type is null");
            return (Criteria) this;
        }

        public Criteria andLogTypeIsNotNull() {
            addCriterion("log_type is not null");
            return (Criteria) this;
        }

        public Criteria andLogTypeEqualTo(Integer value) {
            addCriterion("log_type =", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotEqualTo(Integer value) {
            addCriterion("log_type <>", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThan(Integer value) {
            addCriterion("log_type >", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_type >=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThan(Integer value) {
            addCriterion("log_type <", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeLessThanOrEqualTo(Integer value) {
            addCriterion("log_type <=", value, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeIn(List<Integer> values) {
            addCriterion("log_type in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotIn(List<Integer> values) {
            addCriterion("log_type not in", values, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeBetween(Integer value1, Integer value2) {
            addCriterion("log_type between", value1, value2, "logType");
            return (Criteria) this;
        }

        public Criteria andLogTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("log_type not between", value1, value2, "logType");
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

        public Criteria andDetailDescIsNull() {
            addCriterion("detail_desc is null");
            return (Criteria) this;
        }

        public Criteria andDetailDescIsNotNull() {
            addCriterion("detail_desc is not null");
            return (Criteria) this;
        }

        public Criteria andDetailDescEqualTo(String value) {
            addCriterion("detail_desc =", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotEqualTo(String value) {
            addCriterion("detail_desc <>", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescGreaterThan(String value) {
            addCriterion("detail_desc >", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescGreaterThanOrEqualTo(String value) {
            addCriterion("detail_desc >=", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLessThan(String value) {
            addCriterion("detail_desc <", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLessThanOrEqualTo(String value) {
            addCriterion("detail_desc <=", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescLike(String value) {
            addCriterion("detail_desc like", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotLike(String value) {
            addCriterion("detail_desc not like", value, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescIn(List<String> values) {
            addCriterion("detail_desc in", values, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotIn(List<String> values) {
            addCriterion("detail_desc not in", values, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescBetween(String value1, String value2) {
            addCriterion("detail_desc between", value1, value2, "detailDesc");
            return (Criteria) this;
        }

        public Criteria andDetailDescNotBetween(String value1, String value2) {
            addCriterion("detail_desc not between", value1, value2, "detailDesc");
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