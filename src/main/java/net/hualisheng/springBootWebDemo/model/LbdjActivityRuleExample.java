package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.List;

public class LbdjActivityRuleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LbdjActivityRuleExample() {
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

        public Criteria andActIdIsNull() {
            addCriterion("act_id is null");
            return (Criteria) this;
        }

        public Criteria andActIdIsNotNull() {
            addCriterion("act_id is not null");
            return (Criteria) this;
        }

        public Criteria andActIdEqualTo(Integer value) {
            addCriterion("act_id =", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotEqualTo(Integer value) {
            addCriterion("act_id <>", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThan(Integer value) {
            addCriterion("act_id >", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_id >=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThan(Integer value) {
            addCriterion("act_id <", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdLessThanOrEqualTo(Integer value) {
            addCriterion("act_id <=", value, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdIn(List<Integer> values) {
            addCriterion("act_id in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotIn(List<Integer> values) {
            addCriterion("act_id not in", values, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdBetween(Integer value1, Integer value2) {
            addCriterion("act_id between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andActIdNotBetween(Integer value1, Integer value2) {
            addCriterion("act_id not between", value1, value2, "actId");
            return (Criteria) this;
        }

        public Criteria andRulesIsNull() {
            addCriterion("rules is null");
            return (Criteria) this;
        }

        public Criteria andRulesIsNotNull() {
            addCriterion("rules is not null");
            return (Criteria) this;
        }

        public Criteria andRulesEqualTo(String value) {
            addCriterion("rules =", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotEqualTo(String value) {
            addCriterion("rules <>", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesGreaterThan(String value) {
            addCriterion("rules >", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesGreaterThanOrEqualTo(String value) {
            addCriterion("rules >=", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLessThan(String value) {
            addCriterion("rules <", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLessThanOrEqualTo(String value) {
            addCriterion("rules <=", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLike(String value) {
            addCriterion("rules like", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotLike(String value) {
            addCriterion("rules not like", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesIn(List<String> values) {
            addCriterion("rules in", values, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotIn(List<String> values) {
            addCriterion("rules not in", values, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesBetween(String value1, String value2) {
            addCriterion("rules between", value1, value2, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotBetween(String value1, String value2) {
            addCriterion("rules not between", value1, value2, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesTypeIsNull() {
            addCriterion("rules_type is null");
            return (Criteria) this;
        }

        public Criteria andRulesTypeIsNotNull() {
            addCriterion("rules_type is not null");
            return (Criteria) this;
        }

        public Criteria andRulesTypeEqualTo(Integer value) {
            addCriterion("rules_type =", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeNotEqualTo(Integer value) {
            addCriterion("rules_type <>", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeGreaterThan(Integer value) {
            addCriterion("rules_type >", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("rules_type >=", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeLessThan(Integer value) {
            addCriterion("rules_type <", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeLessThanOrEqualTo(Integer value) {
            addCriterion("rules_type <=", value, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeIn(List<Integer> values) {
            addCriterion("rules_type in", values, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeNotIn(List<Integer> values) {
            addCriterion("rules_type not in", values, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeBetween(Integer value1, Integer value2) {
            addCriterion("rules_type between", value1, value2, "rulesType");
            return (Criteria) this;
        }

        public Criteria andRulesTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("rules_type not between", value1, value2, "rulesType");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesIsNull() {
            addCriterion("effective_times is null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesIsNotNull() {
            addCriterion("effective_times is not null");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesEqualTo(Integer value) {
            addCriterion("effective_times =", value, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesNotEqualTo(Integer value) {
            addCriterion("effective_times <>", value, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesGreaterThan(Integer value) {
            addCriterion("effective_times >", value, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("effective_times >=", value, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesLessThan(Integer value) {
            addCriterion("effective_times <", value, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesLessThanOrEqualTo(Integer value) {
            addCriterion("effective_times <=", value, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesIn(List<Integer> values) {
            addCriterion("effective_times in", values, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesNotIn(List<Integer> values) {
            addCriterion("effective_times not in", values, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesBetween(Integer value1, Integer value2) {
            addCriterion("effective_times between", value1, value2, "effectiveTimes");
            return (Criteria) this;
        }

        public Criteria andEffectiveTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("effective_times not between", value1, value2, "effectiveTimes");
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