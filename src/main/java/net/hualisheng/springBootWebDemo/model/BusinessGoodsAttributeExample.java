package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessGoodsAttributeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessGoodsAttributeExample() {
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

        public Criteria andBusinessGoodsSpecIdIsNull() {
            addCriterion("business_goods_spec_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdIsNotNull() {
            addCriterion("business_goods_spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdEqualTo(Integer value) {
            addCriterion("business_goods_spec_id =", value, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdNotEqualTo(Integer value) {
            addCriterion("business_goods_spec_id <>", value, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdGreaterThan(Integer value) {
            addCriterion("business_goods_spec_id >", value, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_goods_spec_id >=", value, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdLessThan(Integer value) {
            addCriterion("business_goods_spec_id <", value, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_goods_spec_id <=", value, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdIn(List<Integer> values) {
            addCriterion("business_goods_spec_id in", values, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdNotIn(List<Integer> values) {
            addCriterion("business_goods_spec_id not in", values, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("business_goods_spec_id between", value1, value2, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_goods_spec_id not between", value1, value2, "businessGoodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdIsNull() {
            addCriterion("goods_attribute_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdIsNotNull() {
            addCriterion("goods_attribute_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdEqualTo(Integer value) {
            addCriterion("goods_attribute_id =", value, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdNotEqualTo(Integer value) {
            addCriterion("goods_attribute_id <>", value, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdGreaterThan(Integer value) {
            addCriterion("goods_attribute_id >", value, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_attribute_id >=", value, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdLessThan(Integer value) {
            addCriterion("goods_attribute_id <", value, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_attribute_id <=", value, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdIn(List<Integer> values) {
            addCriterion("goods_attribute_id in", values, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdNotIn(List<Integer> values) {
            addCriterion("goods_attribute_id not in", values, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_attribute_id between", value1, value2, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andGoodsAttributeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_attribute_id not between", value1, value2, "goodsAttributeId");
            return (Criteria) this;
        }

        public Criteria andAttributePriceIsNull() {
            addCriterion("attribute_price is null");
            return (Criteria) this;
        }

        public Criteria andAttributePriceIsNotNull() {
            addCriterion("attribute_price is not null");
            return (Criteria) this;
        }

        public Criteria andAttributePriceEqualTo(Double value) {
            addCriterion("attribute_price =", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceNotEqualTo(Double value) {
            addCriterion("attribute_price <>", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceGreaterThan(Double value) {
            addCriterion("attribute_price >", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceGreaterThanOrEqualTo(Double value) {
            addCriterion("attribute_price >=", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceLessThan(Double value) {
            addCriterion("attribute_price <", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceLessThanOrEqualTo(Double value) {
            addCriterion("attribute_price <=", value, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceIn(List<Double> values) {
            addCriterion("attribute_price in", values, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceNotIn(List<Double> values) {
            addCriterion("attribute_price not in", values, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceBetween(Double value1, Double value2) {
            addCriterion("attribute_price between", value1, value2, "attributePrice");
            return (Criteria) this;
        }

        public Criteria andAttributePriceNotBetween(Double value1, Double value2) {
            addCriterion("attribute_price not between", value1, value2, "attributePrice");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIsNull() {
            addCriterion("attribute_name is null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIsNotNull() {
            addCriterion("attribute_name is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeNameEqualTo(String value) {
            addCriterion("attribute_name =", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotEqualTo(String value) {
            addCriterion("attribute_name <>", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThan(String value) {
            addCriterion("attribute_name >", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_name >=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThan(String value) {
            addCriterion("attribute_name <", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLessThanOrEqualTo(String value) {
            addCriterion("attribute_name <=", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameLike(String value) {
            addCriterion("attribute_name like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotLike(String value) {
            addCriterion("attribute_name not like", value, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameIn(List<String> values) {
            addCriterion("attribute_name in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotIn(List<String> values) {
            addCriterion("attribute_name not in", values, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameBetween(String value1, String value2) {
            addCriterion("attribute_name between", value1, value2, "attributeName");
            return (Criteria) this;
        }

        public Criteria andAttributeNameNotBetween(String value1, String value2) {
            addCriterion("attribute_name not between", value1, value2, "attributeName");
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