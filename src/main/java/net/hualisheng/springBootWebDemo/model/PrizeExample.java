package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.List;

public class PrizeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrizeExample() {
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

        public Criteria andPrizeNameIsNull() {
            addCriterion("prize_name is null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIsNotNull() {
            addCriterion("prize_name is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeNameEqualTo(String value) {
            addCriterion("prize_name =", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotEqualTo(String value) {
            addCriterion("prize_name <>", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThan(String value) {
            addCriterion("prize_name >", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameGreaterThanOrEqualTo(String value) {
            addCriterion("prize_name >=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThan(String value) {
            addCriterion("prize_name <", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLessThanOrEqualTo(String value) {
            addCriterion("prize_name <=", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameLike(String value) {
            addCriterion("prize_name like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotLike(String value) {
            addCriterion("prize_name not like", value, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameIn(List<String> values) {
            addCriterion("prize_name in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotIn(List<String> values) {
            addCriterion("prize_name not in", values, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameBetween(String value1, String value2) {
            addCriterion("prize_name between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeNameNotBetween(String value1, String value2) {
            addCriterion("prize_name not between", value1, value2, "prizeName");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNull() {
            addCriterion("prize_type is null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIsNotNull() {
            addCriterion("prize_type is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeEqualTo(Integer value) {
            addCriterion("prize_type =", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotEqualTo(Integer value) {
            addCriterion("prize_type <>", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThan(Integer value) {
            addCriterion("prize_type >", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("prize_type >=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThan(Integer value) {
            addCriterion("prize_type <", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("prize_type <=", value, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeIn(List<Integer> values) {
            addCriterion("prize_type in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotIn(List<Integer> values) {
            addCriterion("prize_type not in", values, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeBetween(Integer value1, Integer value2) {
            addCriterion("prize_type between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("prize_type not between", value1, value2, "prizeType");
            return (Criteria) this;
        }

        public Criteria andPrizeValueIsNull() {
            addCriterion("prize_value is null");
            return (Criteria) this;
        }

        public Criteria andPrizeValueIsNotNull() {
            addCriterion("prize_value is not null");
            return (Criteria) this;
        }

        public Criteria andPrizeValueEqualTo(Float value) {
            addCriterion("prize_value =", value, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueNotEqualTo(Float value) {
            addCriterion("prize_value <>", value, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueGreaterThan(Float value) {
            addCriterion("prize_value >", value, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueGreaterThanOrEqualTo(Float value) {
            addCriterion("prize_value >=", value, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueLessThan(Float value) {
            addCriterion("prize_value <", value, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueLessThanOrEqualTo(Float value) {
            addCriterion("prize_value <=", value, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueIn(List<Float> values) {
            addCriterion("prize_value in", values, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueNotIn(List<Float> values) {
            addCriterion("prize_value not in", values, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueBetween(Float value1, Float value2) {
            addCriterion("prize_value between", value1, value2, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPrizeValueNotBetween(Float value1, Float value2) {
            addCriterion("prize_value not between", value1, value2, "prizeValue");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNull() {
            addCriterion("page_no is null");
            return (Criteria) this;
        }

        public Criteria andPageNoIsNotNull() {
            addCriterion("page_no is not null");
            return (Criteria) this;
        }

        public Criteria andPageNoEqualTo(Integer value) {
            addCriterion("page_no =", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotEqualTo(Integer value) {
            addCriterion("page_no <>", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThan(Integer value) {
            addCriterion("page_no >", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoGreaterThanOrEqualTo(Integer value) {
            addCriterion("page_no >=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThan(Integer value) {
            addCriterion("page_no <", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoLessThanOrEqualTo(Integer value) {
            addCriterion("page_no <=", value, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoIn(List<Integer> values) {
            addCriterion("page_no in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotIn(List<Integer> values) {
            addCriterion("page_no not in", values, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoBetween(Integer value1, Integer value2) {
            addCriterion("page_no between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andPageNoNotBetween(Integer value1, Integer value2) {
            addCriterion("page_no not between", value1, value2, "pageNo");
            return (Criteria) this;
        }

        public Criteria andUseInIsNull() {
            addCriterion("use_in is null");
            return (Criteria) this;
        }

        public Criteria andUseInIsNotNull() {
            addCriterion("use_in is not null");
            return (Criteria) this;
        }

        public Criteria andUseInEqualTo(Integer value) {
            addCriterion("use_in =", value, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInNotEqualTo(Integer value) {
            addCriterion("use_in <>", value, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInGreaterThan(Integer value) {
            addCriterion("use_in >", value, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInGreaterThanOrEqualTo(Integer value) {
            addCriterion("use_in >=", value, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInLessThan(Integer value) {
            addCriterion("use_in <", value, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInLessThanOrEqualTo(Integer value) {
            addCriterion("use_in <=", value, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInIn(List<Integer> values) {
            addCriterion("use_in in", values, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInNotIn(List<Integer> values) {
            addCriterion("use_in not in", values, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInBetween(Integer value1, Integer value2) {
            addCriterion("use_in between", value1, value2, "useIn");
            return (Criteria) this;
        }

        public Criteria andUseInNotBetween(Integer value1, Integer value2) {
            addCriterion("use_in not between", value1, value2, "useIn");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNull() {
            addCriterion("is_use is null");
            return (Criteria) this;
        }

        public Criteria andIsUseIsNotNull() {
            addCriterion("is_use is not null");
            return (Criteria) this;
        }

        public Criteria andIsUseEqualTo(Integer value) {
            addCriterion("is_use =", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotEqualTo(Integer value) {
            addCriterion("is_use <>", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThan(Integer value) {
            addCriterion("is_use >", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_use >=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThan(Integer value) {
            addCriterion("is_use <", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseLessThanOrEqualTo(Integer value) {
            addCriterion("is_use <=", value, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseIn(List<Integer> values) {
            addCriterion("is_use in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotIn(List<Integer> values) {
            addCriterion("is_use not in", values, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseBetween(Integer value1, Integer value2) {
            addCriterion("is_use between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andIsUseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_use not between", value1, value2, "isUse");
            return (Criteria) this;
        }

        public Criteria andActCodeIsNull() {
            addCriterion("act_code is null");
            return (Criteria) this;
        }

        public Criteria andActCodeIsNotNull() {
            addCriterion("act_code is not null");
            return (Criteria) this;
        }

        public Criteria andActCodeEqualTo(String value) {
            addCriterion("act_code =", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeNotEqualTo(String value) {
            addCriterion("act_code <>", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeGreaterThan(String value) {
            addCriterion("act_code >", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeGreaterThanOrEqualTo(String value) {
            addCriterion("act_code >=", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeLessThan(String value) {
            addCriterion("act_code <", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeLessThanOrEqualTo(String value) {
            addCriterion("act_code <=", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeLike(String value) {
            addCriterion("act_code like", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeNotLike(String value) {
            addCriterion("act_code not like", value, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeIn(List<String> values) {
            addCriterion("act_code in", values, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeNotIn(List<String> values) {
            addCriterion("act_code not in", values, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeBetween(String value1, String value2) {
            addCriterion("act_code between", value1, value2, "actCode");
            return (Criteria) this;
        }

        public Criteria andActCodeNotBetween(String value1, String value2) {
            addCriterion("act_code not between", value1, value2, "actCode");
            return (Criteria) this;
        }

        public Criteria andProbabilityIsNull() {
            addCriterion("probability is null");
            return (Criteria) this;
        }

        public Criteria andProbabilityIsNotNull() {
            addCriterion("probability is not null");
            return (Criteria) this;
        }

        public Criteria andProbabilityEqualTo(Double value) {
            addCriterion("probability =", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotEqualTo(Double value) {
            addCriterion("probability <>", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityGreaterThan(Double value) {
            addCriterion("probability >", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityGreaterThanOrEqualTo(Double value) {
            addCriterion("probability >=", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityLessThan(Double value) {
            addCriterion("probability <", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityLessThanOrEqualTo(Double value) {
            addCriterion("probability <=", value, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityIn(List<Double> values) {
            addCriterion("probability in", values, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotIn(List<Double> values) {
            addCriterion("probability not in", values, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityBetween(Double value1, Double value2) {
            addCriterion("probability between", value1, value2, "probability");
            return (Criteria) this;
        }

        public Criteria andProbabilityNotBetween(Double value1, Double value2) {
            addCriterion("probability not between", value1, value2, "probability");
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