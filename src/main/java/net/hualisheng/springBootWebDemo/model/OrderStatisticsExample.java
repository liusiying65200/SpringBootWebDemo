package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderStatisticsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderStatisticsExample() {
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

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andIsExceptionIsNull() {
            addCriterion("is_exception is null");
            return (Criteria) this;
        }

        public Criteria andIsExceptionIsNotNull() {
            addCriterion("is_exception is not null");
            return (Criteria) this;
        }

        public Criteria andIsExceptionEqualTo(Integer value) {
            addCriterion("is_exception =", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotEqualTo(Integer value) {
            addCriterion("is_exception <>", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionGreaterThan(Integer value) {
            addCriterion("is_exception >", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_exception >=", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionLessThan(Integer value) {
            addCriterion("is_exception <", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionLessThanOrEqualTo(Integer value) {
            addCriterion("is_exception <=", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionIn(List<Integer> values) {
            addCriterion("is_exception in", values, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotIn(List<Integer> values) {
            addCriterion("is_exception not in", values, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionBetween(Integer value1, Integer value2) {
            addCriterion("is_exception between", value1, value2, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotBetween(Integer value1, Integer value2) {
            addCriterion("is_exception not between", value1, value2, "isException");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIsNull() {
            addCriterion("source_order_id is null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIsNotNull() {
            addCriterion("source_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdEqualTo(String value) {
            addCriterion("source_order_id =", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotEqualTo(String value) {
            addCriterion("source_order_id <>", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdGreaterThan(String value) {
            addCriterion("source_order_id >", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdGreaterThanOrEqualTo(String value) {
            addCriterion("source_order_id >=", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdLessThan(String value) {
            addCriterion("source_order_id <", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdLessThanOrEqualTo(String value) {
            addCriterion("source_order_id <=", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdLike(String value) {
            addCriterion("source_order_id like", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotLike(String value) {
            addCriterion("source_order_id not like", value, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdIn(List<String> values) {
            addCriterion("source_order_id in", values, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotIn(List<String> values) {
            addCriterion("source_order_id not in", values, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdBetween(String value1, String value2) {
            addCriterion("source_order_id between", value1, value2, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andSourceOrderIdNotBetween(String value1, String value2) {
            addCriterion("source_order_id not between", value1, value2, "sourceOrderId");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNull() {
            addCriterion("servicetype is null");
            return (Criteria) this;
        }

        public Criteria andServicetypeIsNotNull() {
            addCriterion("servicetype is not null");
            return (Criteria) this;
        }

        public Criteria andServicetypeEqualTo(Integer value) {
            addCriterion("servicetype =", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotEqualTo(Integer value) {
            addCriterion("servicetype <>", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThan(Integer value) {
            addCriterion("servicetype >", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("servicetype >=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThan(Integer value) {
            addCriterion("servicetype <", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeLessThanOrEqualTo(Integer value) {
            addCriterion("servicetype <=", value, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeIn(List<Integer> values) {
            addCriterion("servicetype in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotIn(List<Integer> values) {
            addCriterion("servicetype not in", values, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeBetween(Integer value1, Integer value2) {
            addCriterion("servicetype between", value1, value2, "servicetype");
            return (Criteria) this;
        }

        public Criteria andServicetypeNotBetween(Integer value1, Integer value2) {
            addCriterion("servicetype not between", value1, value2, "servicetype");
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

        public Criteria andBusinessNameIsNull() {
            addCriterion("business_name is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIsNotNull() {
            addCriterion("business_name is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNameEqualTo(String value) {
            addCriterion("business_name =", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotEqualTo(String value) {
            addCriterion("business_name <>", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThan(String value) {
            addCriterion("business_name >", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameGreaterThanOrEqualTo(String value) {
            addCriterion("business_name >=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThan(String value) {
            addCriterion("business_name <", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLessThanOrEqualTo(String value) {
            addCriterion("business_name <=", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameLike(String value) {
            addCriterion("business_name like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotLike(String value) {
            addCriterion("business_name not like", value, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameIn(List<String> values) {
            addCriterion("business_name in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotIn(List<String> values) {
            addCriterion("business_name not in", values, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameBetween(String value1, String value2) {
            addCriterion("business_name between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andBusinessNameNotBetween(String value1, String value2) {
            addCriterion("business_name not between", value1, value2, "businessName");
            return (Criteria) this;
        }

        public Criteria andGradeIsNull() {
            addCriterion("grade is null");
            return (Criteria) this;
        }

        public Criteria andGradeIsNotNull() {
            addCriterion("grade is not null");
            return (Criteria) this;
        }

        public Criteria andGradeEqualTo(Integer value) {
            addCriterion("grade =", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotEqualTo(Integer value) {
            addCriterion("grade <>", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThan(Integer value) {
            addCriterion("grade >", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("grade >=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThan(Integer value) {
            addCriterion("grade <", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeLessThanOrEqualTo(Integer value) {
            addCriterion("grade <=", value, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeIn(List<Integer> values) {
            addCriterion("grade in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotIn(List<Integer> values) {
            addCriterion("grade not in", values, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeBetween(Integer value1, Integer value2) {
            addCriterion("grade between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("grade not between", value1, value2, "grade");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShopNameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShopNameEqualTo(String value) {
            addCriterion("shop_name =", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThan(String value) {
            addCriterion("shop_name <", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameLike(String value) {
            addCriterion("shop_name like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotLike(String value) {
            addCriterion("shop_name not like", value, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameIn(List<String> values) {
            addCriterion("shop_name in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shopName");
            return (Criteria) this;
        }

        public Criteria andShopNameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shopName");
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

        public Criteria andWorkerNameIsNull() {
            addCriterion("worker_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIsNotNull() {
            addCriterion("worker_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerNameEqualTo(String value) {
            addCriterion("worker_name =", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotEqualTo(String value) {
            addCriterion("worker_name <>", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThan(String value) {
            addCriterion("worker_name >", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameGreaterThanOrEqualTo(String value) {
            addCriterion("worker_name >=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThan(String value) {
            addCriterion("worker_name <", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLessThanOrEqualTo(String value) {
            addCriterion("worker_name <=", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameLike(String value) {
            addCriterion("worker_name like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotLike(String value) {
            addCriterion("worker_name not like", value, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameIn(List<String> values) {
            addCriterion("worker_name in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotIn(List<String> values) {
            addCriterion("worker_name not in", values, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameBetween(String value1, String value2) {
            addCriterion("worker_name between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerNameNotBetween(String value1, String value2) {
            addCriterion("worker_name not between", value1, value2, "workerName");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIsNull() {
            addCriterion("worker_tel is null");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIsNotNull() {
            addCriterion("worker_tel is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerTelEqualTo(String value) {
            addCriterion("worker_tel =", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotEqualTo(String value) {
            addCriterion("worker_tel <>", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelGreaterThan(String value) {
            addCriterion("worker_tel >", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelGreaterThanOrEqualTo(String value) {
            addCriterion("worker_tel >=", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLessThan(String value) {
            addCriterion("worker_tel <", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLessThanOrEqualTo(String value) {
            addCriterion("worker_tel <=", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelLike(String value) {
            addCriterion("worker_tel like", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotLike(String value) {
            addCriterion("worker_tel not like", value, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelIn(List<String> values) {
            addCriterion("worker_tel in", values, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotIn(List<String> values) {
            addCriterion("worker_tel not in", values, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelBetween(String value1, String value2) {
            addCriterion("worker_tel between", value1, value2, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerTelNotBetween(String value1, String value2) {
            addCriterion("worker_tel not between", value1, value2, "workerTel");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeIsNull() {
            addCriterion("worker_grade is null");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeIsNotNull() {
            addCriterion("worker_grade is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeEqualTo(Integer value) {
            addCriterion("worker_grade =", value, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeNotEqualTo(Integer value) {
            addCriterion("worker_grade <>", value, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeGreaterThan(Integer value) {
            addCriterion("worker_grade >", value, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeGreaterThanOrEqualTo(Integer value) {
            addCriterion("worker_grade >=", value, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeLessThan(Integer value) {
            addCriterion("worker_grade <", value, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeLessThanOrEqualTo(Integer value) {
            addCriterion("worker_grade <=", value, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeIn(List<Integer> values) {
            addCriterion("worker_grade in", values, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeNotIn(List<Integer> values) {
            addCriterion("worker_grade not in", values, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeBetween(Integer value1, Integer value2) {
            addCriterion("worker_grade between", value1, value2, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andWorkerGradeNotBetween(Integer value1, Integer value2) {
            addCriterion("worker_grade not between", value1, value2, "workerGrade");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNull() {
            addCriterion("sale_id is null");
            return (Criteria) this;
        }

        public Criteria andSaleIdIsNotNull() {
            addCriterion("sale_id is not null");
            return (Criteria) this;
        }

        public Criteria andSaleIdEqualTo(Integer value) {
            addCriterion("sale_id =", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotEqualTo(Integer value) {
            addCriterion("sale_id <>", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThan(Integer value) {
            addCriterion("sale_id >", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sale_id >=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThan(Integer value) {
            addCriterion("sale_id <", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdLessThanOrEqualTo(Integer value) {
            addCriterion("sale_id <=", value, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdIn(List<Integer> values) {
            addCriterion("sale_id in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotIn(List<Integer> values) {
            addCriterion("sale_id not in", values, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdBetween(Integer value1, Integer value2) {
            addCriterion("sale_id between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sale_id not between", value1, value2, "saleId");
            return (Criteria) this;
        }

        public Criteria andSaleNameIsNull() {
            addCriterion("sale_name is null");
            return (Criteria) this;
        }

        public Criteria andSaleNameIsNotNull() {
            addCriterion("sale_name is not null");
            return (Criteria) this;
        }

        public Criteria andSaleNameEqualTo(String value) {
            addCriterion("sale_name =", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotEqualTo(String value) {
            addCriterion("sale_name <>", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameGreaterThan(String value) {
            addCriterion("sale_name >", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameGreaterThanOrEqualTo(String value) {
            addCriterion("sale_name >=", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLessThan(String value) {
            addCriterion("sale_name <", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLessThanOrEqualTo(String value) {
            addCriterion("sale_name <=", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameLike(String value) {
            addCriterion("sale_name like", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotLike(String value) {
            addCriterion("sale_name not like", value, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameIn(List<String> values) {
            addCriterion("sale_name in", values, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotIn(List<String> values) {
            addCriterion("sale_name not in", values, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameBetween(String value1, String value2) {
            addCriterion("sale_name between", value1, value2, "saleName");
            return (Criteria) this;
        }

        public Criteria andSaleNameNotBetween(String value1, String value2) {
            addCriterion("sale_name not between", value1, value2, "saleName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
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

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(Date value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Date value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Date> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNull() {
            addCriterion("complete_time is null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIsNotNull() {
            addCriterion("complete_time is not null");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeEqualTo(Date value) {
            addCriterion("complete_time =", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotEqualTo(Date value) {
            addCriterion("complete_time <>", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThan(Date value) {
            addCriterion("complete_time >", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("complete_time >=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThan(Date value) {
            addCriterion("complete_time <", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("complete_time <=", value, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeIn(List<Date> values) {
            addCriterion("complete_time in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotIn(List<Date> values) {
            addCriterion("complete_time not in", values, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeBetween(Date value1, Date value2) {
            addCriterion("complete_time between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andCompleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("complete_time not between", value1, value2, "completeTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNull() {
            addCriterion("settlement_time is null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIsNotNull() {
            addCriterion("settlement_time is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeEqualTo(Date value) {
            addCriterion("settlement_time =", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotEqualTo(Date value) {
            addCriterion("settlement_time <>", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThan(Date value) {
            addCriterion("settlement_time >", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("settlement_time >=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThan(Date value) {
            addCriterion("settlement_time <", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeLessThanOrEqualTo(Date value) {
            addCriterion("settlement_time <=", value, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeIn(List<Date> values) {
            addCriterion("settlement_time in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotIn(List<Date> values) {
            addCriterion("settlement_time not in", values, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeBetween(Date value1, Date value2) {
            addCriterion("settlement_time between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andSettlementTimeNotBetween(Date value1, Date value2) {
            addCriterion("settlement_time not between", value1, value2, "settlementTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNull() {
            addCriterion("finish_time is null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIsNotNull() {
            addCriterion("finish_time is not null");
            return (Criteria) this;
        }

        public Criteria andFinishTimeEqualTo(Date value) {
            addCriterion("finish_time =", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotEqualTo(Date value) {
            addCriterion("finish_time <>", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThan(Date value) {
            addCriterion("finish_time >", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finish_time >=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThan(Date value) {
            addCriterion("finish_time <", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeLessThanOrEqualTo(Date value) {
            addCriterion("finish_time <=", value, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeIn(List<Date> values) {
            addCriterion("finish_time in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotIn(List<Date> values) {
            addCriterion("finish_time not in", values, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeBetween(Date value1, Date value2) {
            addCriterion("finish_time between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andFinishTimeNotBetween(Date value1, Date value2) {
            addCriterion("finish_time not between", value1, value2, "finishTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNull() {
            addCriterion("close_time is null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIsNotNull() {
            addCriterion("close_time is not null");
            return (Criteria) this;
        }

        public Criteria andCloseTimeEqualTo(Date value) {
            addCriterion("close_time =", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotEqualTo(Date value) {
            addCriterion("close_time <>", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThan(Date value) {
            addCriterion("close_time >", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("close_time >=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThan(Date value) {
            addCriterion("close_time <", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeLessThanOrEqualTo(Date value) {
            addCriterion("close_time <=", value, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeIn(List<Date> values) {
            addCriterion("close_time in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotIn(List<Date> values) {
            addCriterion("close_time not in", values, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeBetween(Date value1, Date value2) {
            addCriterion("close_time between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCloseTimeNotBetween(Date value1, Date value2) {
            addCriterion("close_time not between", value1, value2, "closeTime");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNull() {
            addCriterion("customer_phone is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIsNotNull() {
            addCriterion("customer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneEqualTo(String value) {
            addCriterion("customer_phone =", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotEqualTo(String value) {
            addCriterion("customer_phone <>", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThan(String value) {
            addCriterion("customer_phone >", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("customer_phone >=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThan(String value) {
            addCriterion("customer_phone <", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLessThanOrEqualTo(String value) {
            addCriterion("customer_phone <=", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneLike(String value) {
            addCriterion("customer_phone like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotLike(String value) {
            addCriterion("customer_phone not like", value, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneIn(List<String> values) {
            addCriterion("customer_phone in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotIn(List<String> values) {
            addCriterion("customer_phone not in", values, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneBetween(String value1, String value2) {
            addCriterion("customer_phone between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerPhoneNotBetween(String value1, String value2) {
            addCriterion("customer_phone not between", value1, value2, "customerPhone");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwIsNull() {
            addCriterion("customer_aliww is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwIsNotNull() {
            addCriterion("customer_aliww is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwEqualTo(String value) {
            addCriterion("customer_aliww =", value, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwNotEqualTo(String value) {
            addCriterion("customer_aliww <>", value, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwGreaterThan(String value) {
            addCriterion("customer_aliww >", value, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwGreaterThanOrEqualTo(String value) {
            addCriterion("customer_aliww >=", value, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwLessThan(String value) {
            addCriterion("customer_aliww <", value, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwLessThanOrEqualTo(String value) {
            addCriterion("customer_aliww <=", value, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwLike(String value) {
            addCriterion("customer_aliww like", value, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwNotLike(String value) {
            addCriterion("customer_aliww not like", value, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwIn(List<String> values) {
            addCriterion("customer_aliww in", values, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwNotIn(List<String> values) {
            addCriterion("customer_aliww not in", values, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwBetween(String value1, String value2) {
            addCriterion("customer_aliww between", value1, value2, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andCustomerAliwwNotBetween(String value1, String value2) {
            addCriterion("customer_aliww not between", value1, value2, "customerAliww");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdIsNull() {
            addCriterion("order_goods_catgory_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdIsNotNull() {
            addCriterion("order_goods_catgory_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdEqualTo(Integer value) {
            addCriterion("order_goods_catgory_id =", value, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdNotEqualTo(Integer value) {
            addCriterion("order_goods_catgory_id <>", value, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdGreaterThan(Integer value) {
            addCriterion("order_goods_catgory_id >", value, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_goods_catgory_id >=", value, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdLessThan(Integer value) {
            addCriterion("order_goods_catgory_id <", value, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_goods_catgory_id <=", value, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdIn(List<Integer> values) {
            addCriterion("order_goods_catgory_id in", values, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdNotIn(List<Integer> values) {
            addCriterion("order_goods_catgory_id not in", values, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_catgory_id between", value1, value2, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_goods_catgory_id not between", value1, value2, "orderGoodsCatgoryId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIsNull() {
            addCriterion("order_goods_catgory is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIsNotNull() {
            addCriterion("order_goods_catgory is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryEqualTo(String value) {
            addCriterion("order_goods_catgory =", value, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryNotEqualTo(String value) {
            addCriterion("order_goods_catgory <>", value, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryGreaterThan(String value) {
            addCriterion("order_goods_catgory >", value, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_catgory >=", value, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryLessThan(String value) {
            addCriterion("order_goods_catgory <", value, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryLessThanOrEqualTo(String value) {
            addCriterion("order_goods_catgory <=", value, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryLike(String value) {
            addCriterion("order_goods_catgory like", value, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryNotLike(String value) {
            addCriterion("order_goods_catgory not like", value, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryIn(List<String> values) {
            addCriterion("order_goods_catgory in", values, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryNotIn(List<String> values) {
            addCriterion("order_goods_catgory not in", values, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryBetween(String value1, String value2) {
            addCriterion("order_goods_catgory between", value1, value2, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsCatgoryNotBetween(String value1, String value2) {
            addCriterion("order_goods_catgory not between", value1, value2, "orderGoodsCatgory");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapIsNull() {
            addCriterion("order_goods_map is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapIsNotNull() {
            addCriterion("order_goods_map is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapEqualTo(String value) {
            addCriterion("order_goods_map =", value, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapNotEqualTo(String value) {
            addCriterion("order_goods_map <>", value, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapGreaterThan(String value) {
            addCriterion("order_goods_map >", value, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_map >=", value, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapLessThan(String value) {
            addCriterion("order_goods_map <", value, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapLessThanOrEqualTo(String value) {
            addCriterion("order_goods_map <=", value, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapLike(String value) {
            addCriterion("order_goods_map like", value, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapNotLike(String value) {
            addCriterion("order_goods_map not like", value, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapIn(List<String> values) {
            addCriterion("order_goods_map in", values, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapNotIn(List<String> values) {
            addCriterion("order_goods_map not in", values, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapBetween(String value1, String value2) {
            addCriterion("order_goods_map between", value1, value2, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsMapNotBetween(String value1, String value2) {
            addCriterion("order_goods_map not between", value1, value2, "orderGoodsMap");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNull() {
            addCriterion("order_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIsNotNull() {
            addCriterion("order_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdEqualTo(String value) {
            addCriterion("order_goods_id =", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotEqualTo(String value) {
            addCriterion("order_goods_id <>", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThan(String value) {
            addCriterion("order_goods_id >", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_id >=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThan(String value) {
            addCriterion("order_goods_id <", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLessThanOrEqualTo(String value) {
            addCriterion("order_goods_id <=", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdLike(String value) {
            addCriterion("order_goods_id like", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotLike(String value) {
            addCriterion("order_goods_id not like", value, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdIn(List<String> values) {
            addCriterion("order_goods_id in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotIn(List<String> values) {
            addCriterion("order_goods_id not in", values, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdBetween(String value1, String value2) {
            addCriterion("order_goods_id between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsIdNotBetween(String value1, String value2) {
            addCriterion("order_goods_id not between", value1, value2, "orderGoodsId");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameIsNull() {
            addCriterion("order_goods_name is null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameIsNotNull() {
            addCriterion("order_goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameEqualTo(String value) {
            addCriterion("order_goods_name =", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameNotEqualTo(String value) {
            addCriterion("order_goods_name <>", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameGreaterThan(String value) {
            addCriterion("order_goods_name >", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("order_goods_name >=", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameLessThan(String value) {
            addCriterion("order_goods_name <", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("order_goods_name <=", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameLike(String value) {
            addCriterion("order_goods_name like", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameNotLike(String value) {
            addCriterion("order_goods_name not like", value, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameIn(List<String> values) {
            addCriterion("order_goods_name in", values, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameNotIn(List<String> values) {
            addCriterion("order_goods_name not in", values, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameBetween(String value1, String value2) {
            addCriterion("order_goods_name between", value1, value2, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderGoodsNameNotBetween(String value1, String value2) {
            addCriterion("order_goods_name not between", value1, value2, "orderGoodsName");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIsNull() {
            addCriterion("order_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIsNotNull() {
            addCriterion("order_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeEqualTo(Double value) {
            addCriterion("order_total_fee =", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotEqualTo(Double value) {
            addCriterion("order_total_fee <>", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeGreaterThan(Double value) {
            addCriterion("order_total_fee >", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("order_total_fee >=", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeLessThan(Double value) {
            addCriterion("order_total_fee <", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeLessThanOrEqualTo(Double value) {
            addCriterion("order_total_fee <=", value, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeIn(List<Double> values) {
            addCriterion("order_total_fee in", values, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotIn(List<Double> values) {
            addCriterion("order_total_fee not in", values, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeBetween(Double value1, Double value2) {
            addCriterion("order_total_fee between", value1, value2, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andOrderTotalFeeNotBetween(Double value1, Double value2) {
            addCriterion("order_total_fee not between", value1, value2, "orderTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeIsNull() {
            addCriterion("business_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeIsNotNull() {
            addCriterion("business_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeEqualTo(Double value) {
            addCriterion("business_total_fee =", value, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeNotEqualTo(Double value) {
            addCriterion("business_total_fee <>", value, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeGreaterThan(Double value) {
            addCriterion("business_total_fee >", value, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("business_total_fee >=", value, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeLessThan(Double value) {
            addCriterion("business_total_fee <", value, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeLessThanOrEqualTo(Double value) {
            addCriterion("business_total_fee <=", value, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeIn(List<Double> values) {
            addCriterion("business_total_fee in", values, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeNotIn(List<Double> values) {
            addCriterion("business_total_fee not in", values, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeBetween(Double value1, Double value2) {
            addCriterion("business_total_fee between", value1, value2, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andBusinessTotalFeeNotBetween(Double value1, Double value2) {
            addCriterion("business_total_fee not between", value1, value2, "businessTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeIsNull() {
            addCriterion("customer_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeIsNotNull() {
            addCriterion("customer_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeEqualTo(Double value) {
            addCriterion("customer_total_fee =", value, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeNotEqualTo(Double value) {
            addCriterion("customer_total_fee <>", value, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeGreaterThan(Double value) {
            addCriterion("customer_total_fee >", value, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("customer_total_fee >=", value, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeLessThan(Double value) {
            addCriterion("customer_total_fee <", value, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeLessThanOrEqualTo(Double value) {
            addCriterion("customer_total_fee <=", value, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeIn(List<Double> values) {
            addCriterion("customer_total_fee in", values, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeNotIn(List<Double> values) {
            addCriterion("customer_total_fee not in", values, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeBetween(Double value1, Double value2) {
            addCriterion("customer_total_fee between", value1, value2, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andCustomerTotalFeeNotBetween(Double value1, Double value2) {
            addCriterion("customer_total_fee not between", value1, value2, "customerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeIsNull() {
            addCriterion("worker_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeIsNotNull() {
            addCriterion("worker_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeEqualTo(Double value) {
            addCriterion("worker_total_fee =", value, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeNotEqualTo(Double value) {
            addCriterion("worker_total_fee <>", value, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeGreaterThan(Double value) {
            addCriterion("worker_total_fee >", value, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_total_fee >=", value, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeLessThan(Double value) {
            addCriterion("worker_total_fee <", value, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeLessThanOrEqualTo(Double value) {
            addCriterion("worker_total_fee <=", value, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeIn(List<Double> values) {
            addCriterion("worker_total_fee in", values, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeNotIn(List<Double> values) {
            addCriterion("worker_total_fee not in", values, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeBetween(Double value1, Double value2) {
            addCriterion("worker_total_fee between", value1, value2, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andWorkerTotalFeeNotBetween(Double value1, Double value2) {
            addCriterion("worker_total_fee not between", value1, value2, "workerTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeIsNull() {
            addCriterion("base_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeIsNotNull() {
            addCriterion("base_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeEqualTo(Double value) {
            addCriterion("base_total_fee =", value, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeNotEqualTo(Double value) {
            addCriterion("base_total_fee <>", value, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeGreaterThan(Double value) {
            addCriterion("base_total_fee >", value, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("base_total_fee >=", value, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeLessThan(Double value) {
            addCriterion("base_total_fee <", value, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeLessThanOrEqualTo(Double value) {
            addCriterion("base_total_fee <=", value, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeIn(List<Double> values) {
            addCriterion("base_total_fee in", values, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeNotIn(List<Double> values) {
            addCriterion("base_total_fee not in", values, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeBetween(Double value1, Double value2) {
            addCriterion("base_total_fee between", value1, value2, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andBaseTotalFeeNotBetween(Double value1, Double value2) {
            addCriterion("base_total_fee not between", value1, value2, "baseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeIsNull() {
            addCriterion("discount_base_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeIsNotNull() {
            addCriterion("discount_base_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeEqualTo(Double value) {
            addCriterion("discount_base_total_fee =", value, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeNotEqualTo(Double value) {
            addCriterion("discount_base_total_fee <>", value, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeGreaterThan(Double value) {
            addCriterion("discount_base_total_fee >", value, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("discount_base_total_fee >=", value, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeLessThan(Double value) {
            addCriterion("discount_base_total_fee <", value, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeLessThanOrEqualTo(Double value) {
            addCriterion("discount_base_total_fee <=", value, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeIn(List<Double> values) {
            addCriterion("discount_base_total_fee in", values, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeNotIn(List<Double> values) {
            addCriterion("discount_base_total_fee not in", values, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeBetween(Double value1, Double value2) {
            addCriterion("discount_base_total_fee between", value1, value2, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andDiscountBaseTotalFeeNotBetween(Double value1, Double value2) {
            addCriterion("discount_base_total_fee not between", value1, value2, "discountBaseTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeIsNull() {
            addCriterion("additional_total_fee is null");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeIsNotNull() {
            addCriterion("additional_total_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeEqualTo(Double value) {
            addCriterion("additional_total_fee =", value, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeNotEqualTo(Double value) {
            addCriterion("additional_total_fee <>", value, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeGreaterThan(Double value) {
            addCriterion("additional_total_fee >", value, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("additional_total_fee >=", value, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeLessThan(Double value) {
            addCriterion("additional_total_fee <", value, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeLessThanOrEqualTo(Double value) {
            addCriterion("additional_total_fee <=", value, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeIn(List<Double> values) {
            addCriterion("additional_total_fee in", values, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeNotIn(List<Double> values) {
            addCriterion("additional_total_fee not in", values, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeBetween(Double value1, Double value2) {
            addCriterion("additional_total_fee between", value1, value2, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andAdditionalTotalFeeNotBetween(Double value1, Double value2) {
            addCriterion("additional_total_fee not between", value1, value2, "additionalTotalFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeIsNull() {
            addCriterion("urgent_fee is null");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeIsNotNull() {
            addCriterion("urgent_fee is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeEqualTo(Double value) {
            addCriterion("urgent_fee =", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeNotEqualTo(Double value) {
            addCriterion("urgent_fee <>", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeGreaterThan(Double value) {
            addCriterion("urgent_fee >", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("urgent_fee >=", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeLessThan(Double value) {
            addCriterion("urgent_fee <", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeLessThanOrEqualTo(Double value) {
            addCriterion("urgent_fee <=", value, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeIn(List<Double> values) {
            addCriterion("urgent_fee in", values, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeNotIn(List<Double> values) {
            addCriterion("urgent_fee not in", values, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeBetween(Double value1, Double value2) {
            addCriterion("urgent_fee between", value1, value2, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andUrgentFeeNotBetween(Double value1, Double value2) {
            addCriterion("urgent_fee not between", value1, value2, "urgentFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeIsNull() {
            addCriterion("add_luban_fee is null");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeIsNotNull() {
            addCriterion("add_luban_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeEqualTo(Double value) {
            addCriterion("add_luban_fee =", value, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeNotEqualTo(Double value) {
            addCriterion("add_luban_fee <>", value, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeGreaterThan(Double value) {
            addCriterion("add_luban_fee >", value, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("add_luban_fee >=", value, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeLessThan(Double value) {
            addCriterion("add_luban_fee <", value, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeLessThanOrEqualTo(Double value) {
            addCriterion("add_luban_fee <=", value, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeIn(List<Double> values) {
            addCriterion("add_luban_fee in", values, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeNotIn(List<Double> values) {
            addCriterion("add_luban_fee not in", values, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeBetween(Double value1, Double value2) {
            addCriterion("add_luban_fee between", value1, value2, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanFeeNotBetween(Double value1, Double value2) {
            addCriterion("add_luban_fee not between", value1, value2, "addLubanFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeIsNull() {
            addCriterion("add_business_fee is null");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeIsNotNull() {
            addCriterion("add_business_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeEqualTo(Double value) {
            addCriterion("add_business_fee =", value, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeNotEqualTo(Double value) {
            addCriterion("add_business_fee <>", value, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeGreaterThan(Double value) {
            addCriterion("add_business_fee >", value, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("add_business_fee >=", value, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeLessThan(Double value) {
            addCriterion("add_business_fee <", value, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeLessThanOrEqualTo(Double value) {
            addCriterion("add_business_fee <=", value, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeIn(List<Double> values) {
            addCriterion("add_business_fee in", values, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeNotIn(List<Double> values) {
            addCriterion("add_business_fee not in", values, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeBetween(Double value1, Double value2) {
            addCriterion("add_business_fee between", value1, value2, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessFeeNotBetween(Double value1, Double value2) {
            addCriterion("add_business_fee not between", value1, value2, "addBusinessFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeIsNull() {
            addCriterion("add_luban_nocc_fee is null");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeIsNotNull() {
            addCriterion("add_luban_nocc_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeEqualTo(Double value) {
            addCriterion("add_luban_nocc_fee =", value, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeNotEqualTo(Double value) {
            addCriterion("add_luban_nocc_fee <>", value, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeGreaterThan(Double value) {
            addCriterion("add_luban_nocc_fee >", value, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("add_luban_nocc_fee >=", value, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeLessThan(Double value) {
            addCriterion("add_luban_nocc_fee <", value, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeLessThanOrEqualTo(Double value) {
            addCriterion("add_luban_nocc_fee <=", value, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeIn(List<Double> values) {
            addCriterion("add_luban_nocc_fee in", values, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeNotIn(List<Double> values) {
            addCriterion("add_luban_nocc_fee not in", values, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeBetween(Double value1, Double value2) {
            addCriterion("add_luban_nocc_fee between", value1, value2, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddLubanNoccFeeNotBetween(Double value1, Double value2) {
            addCriterion("add_luban_nocc_fee not between", value1, value2, "addLubanNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeIsNull() {
            addCriterion("add_business_nocc_fee is null");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeIsNotNull() {
            addCriterion("add_business_nocc_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeEqualTo(Double value) {
            addCriterion("add_business_nocc_fee =", value, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeNotEqualTo(Double value) {
            addCriterion("add_business_nocc_fee <>", value, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeGreaterThan(Double value) {
            addCriterion("add_business_nocc_fee >", value, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("add_business_nocc_fee >=", value, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeLessThan(Double value) {
            addCriterion("add_business_nocc_fee <", value, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeLessThanOrEqualTo(Double value) {
            addCriterion("add_business_nocc_fee <=", value, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeIn(List<Double> values) {
            addCriterion("add_business_nocc_fee in", values, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeNotIn(List<Double> values) {
            addCriterion("add_business_nocc_fee not in", values, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeBetween(Double value1, Double value2) {
            addCriterion("add_business_nocc_fee between", value1, value2, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddBusinessNoccFeeNotBetween(Double value1, Double value2) {
            addCriterion("add_business_nocc_fee not between", value1, value2, "addBusinessNoccFee");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapIsNull() {
            addCriterion("add_fee_map is null");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapIsNotNull() {
            addCriterion("add_fee_map is not null");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapEqualTo(String value) {
            addCriterion("add_fee_map =", value, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapNotEqualTo(String value) {
            addCriterion("add_fee_map <>", value, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapGreaterThan(String value) {
            addCriterion("add_fee_map >", value, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapGreaterThanOrEqualTo(String value) {
            addCriterion("add_fee_map >=", value, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapLessThan(String value) {
            addCriterion("add_fee_map <", value, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapLessThanOrEqualTo(String value) {
            addCriterion("add_fee_map <=", value, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapLike(String value) {
            addCriterion("add_fee_map like", value, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapNotLike(String value) {
            addCriterion("add_fee_map not like", value, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapIn(List<String> values) {
            addCriterion("add_fee_map in", values, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapNotIn(List<String> values) {
            addCriterion("add_fee_map not in", values, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapBetween(String value1, String value2) {
            addCriterion("add_fee_map between", value1, value2, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andAddFeeMapNotBetween(String value1, String value2) {
            addCriterion("add_fee_map not between", value1, value2, "addFeeMap");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeIsNull() {
            addCriterion("business_income_fee is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeIsNotNull() {
            addCriterion("business_income_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeEqualTo(Double value) {
            addCriterion("business_income_fee =", value, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeNotEqualTo(Double value) {
            addCriterion("business_income_fee <>", value, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeGreaterThan(Double value) {
            addCriterion("business_income_fee >", value, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("business_income_fee >=", value, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeLessThan(Double value) {
            addCriterion("business_income_fee <", value, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeLessThanOrEqualTo(Double value) {
            addCriterion("business_income_fee <=", value, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeIn(List<Double> values) {
            addCriterion("business_income_fee in", values, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeNotIn(List<Double> values) {
            addCriterion("business_income_fee not in", values, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeBetween(Double value1, Double value2) {
            addCriterion("business_income_fee between", value1, value2, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeFeeNotBetween(Double value1, Double value2) {
            addCriterion("business_income_fee not between", value1, value2, "businessIncomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeIsNull() {
            addCriterion("business_outcome_fee is null");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeIsNotNull() {
            addCriterion("business_outcome_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeEqualTo(Double value) {
            addCriterion("business_outcome_fee =", value, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeNotEqualTo(Double value) {
            addCriterion("business_outcome_fee <>", value, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeGreaterThan(Double value) {
            addCriterion("business_outcome_fee >", value, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("business_outcome_fee >=", value, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeLessThan(Double value) {
            addCriterion("business_outcome_fee <", value, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeLessThanOrEqualTo(Double value) {
            addCriterion("business_outcome_fee <=", value, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeIn(List<Double> values) {
            addCriterion("business_outcome_fee in", values, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeNotIn(List<Double> values) {
            addCriterion("business_outcome_fee not in", values, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeBetween(Double value1, Double value2) {
            addCriterion("business_outcome_fee between", value1, value2, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeFeeNotBetween(Double value1, Double value2) {
            addCriterion("business_outcome_fee not between", value1, value2, "businessOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeIsNull() {
            addCriterion("worker_income_fee is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeIsNotNull() {
            addCriterion("worker_income_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeEqualTo(Double value) {
            addCriterion("worker_income_fee =", value, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeNotEqualTo(Double value) {
            addCriterion("worker_income_fee <>", value, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeGreaterThan(Double value) {
            addCriterion("worker_income_fee >", value, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_income_fee >=", value, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeLessThan(Double value) {
            addCriterion("worker_income_fee <", value, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeLessThanOrEqualTo(Double value) {
            addCriterion("worker_income_fee <=", value, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeIn(List<Double> values) {
            addCriterion("worker_income_fee in", values, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeNotIn(List<Double> values) {
            addCriterion("worker_income_fee not in", values, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeBetween(Double value1, Double value2) {
            addCriterion("worker_income_fee between", value1, value2, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeFeeNotBetween(Double value1, Double value2) {
            addCriterion("worker_income_fee not between", value1, value2, "workerIncomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeIsNull() {
            addCriterion("worker_outcome_fee is null");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeIsNotNull() {
            addCriterion("worker_outcome_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeEqualTo(Double value) {
            addCriterion("worker_outcome_fee =", value, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeNotEqualTo(Double value) {
            addCriterion("worker_outcome_fee <>", value, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeGreaterThan(Double value) {
            addCriterion("worker_outcome_fee >", value, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_outcome_fee >=", value, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeLessThan(Double value) {
            addCriterion("worker_outcome_fee <", value, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeLessThanOrEqualTo(Double value) {
            addCriterion("worker_outcome_fee <=", value, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeIn(List<Double> values) {
            addCriterion("worker_outcome_fee in", values, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeNotIn(List<Double> values) {
            addCriterion("worker_outcome_fee not in", values, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeBetween(Double value1, Double value2) {
            addCriterion("worker_outcome_fee between", value1, value2, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeFeeNotBetween(Double value1, Double value2) {
            addCriterion("worker_outcome_fee not between", value1, value2, "workerOutcomeFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeIsNull() {
            addCriterion("ps_fee is null");
            return (Criteria) this;
        }

        public Criteria andPsFeeIsNotNull() {
            addCriterion("ps_fee is not null");
            return (Criteria) this;
        }

        public Criteria andPsFeeEqualTo(Double value) {
            addCriterion("ps_fee =", value, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeNotEqualTo(Double value) {
            addCriterion("ps_fee <>", value, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeGreaterThan(Double value) {
            addCriterion("ps_fee >", value, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("ps_fee >=", value, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeLessThan(Double value) {
            addCriterion("ps_fee <", value, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeLessThanOrEqualTo(Double value) {
            addCriterion("ps_fee <=", value, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeIn(List<Double> values) {
            addCriterion("ps_fee in", values, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeNotIn(List<Double> values) {
            addCriterion("ps_fee not in", values, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeBetween(Double value1, Double value2) {
            addCriterion("ps_fee between", value1, value2, "psFee");
            return (Criteria) this;
        }

        public Criteria andPsFeeNotBetween(Double value1, Double value2) {
            addCriterion("ps_fee not between", value1, value2, "psFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeIsNull() {
            addCriterion("agent_pay_fee is null");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeIsNotNull() {
            addCriterion("agent_pay_fee is not null");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeEqualTo(Double value) {
            addCriterion("agent_pay_fee =", value, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeNotEqualTo(Double value) {
            addCriterion("agent_pay_fee <>", value, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeGreaterThan(Double value) {
            addCriterion("agent_pay_fee >", value, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("agent_pay_fee >=", value, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeLessThan(Double value) {
            addCriterion("agent_pay_fee <", value, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeLessThanOrEqualTo(Double value) {
            addCriterion("agent_pay_fee <=", value, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeIn(List<Double> values) {
            addCriterion("agent_pay_fee in", values, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeNotIn(List<Double> values) {
            addCriterion("agent_pay_fee not in", values, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeBetween(Double value1, Double value2) {
            addCriterion("agent_pay_fee between", value1, value2, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andAgentPayFeeNotBetween(Double value1, Double value2) {
            addCriterion("agent_pay_fee not between", value1, value2, "agentPayFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeIsNull() {
            addCriterion("worker_award_fee is null");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeIsNotNull() {
            addCriterion("worker_award_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeEqualTo(Double value) {
            addCriterion("worker_award_fee =", value, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeNotEqualTo(Double value) {
            addCriterion("worker_award_fee <>", value, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeGreaterThan(Double value) {
            addCriterion("worker_award_fee >", value, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_award_fee >=", value, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeLessThan(Double value) {
            addCriterion("worker_award_fee <", value, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeLessThanOrEqualTo(Double value) {
            addCriterion("worker_award_fee <=", value, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeIn(List<Double> values) {
            addCriterion("worker_award_fee in", values, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeNotIn(List<Double> values) {
            addCriterion("worker_award_fee not in", values, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeBetween(Double value1, Double value2) {
            addCriterion("worker_award_fee between", value1, value2, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardFeeNotBetween(Double value1, Double value2) {
            addCriterion("worker_award_fee not between", value1, value2, "workerAwardFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeIsNull() {
            addCriterion("worker_activity_fee is null");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeIsNotNull() {
            addCriterion("worker_activity_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeEqualTo(Double value) {
            addCriterion("worker_activity_fee =", value, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeNotEqualTo(Double value) {
            addCriterion("worker_activity_fee <>", value, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeGreaterThan(Double value) {
            addCriterion("worker_activity_fee >", value, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_activity_fee >=", value, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeLessThan(Double value) {
            addCriterion("worker_activity_fee <", value, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeLessThanOrEqualTo(Double value) {
            addCriterion("worker_activity_fee <=", value, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeIn(List<Double> values) {
            addCriterion("worker_activity_fee in", values, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeNotIn(List<Double> values) {
            addCriterion("worker_activity_fee not in", values, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeBetween(Double value1, Double value2) {
            addCriterion("worker_activity_fee between", value1, value2, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityFeeNotBetween(Double value1, Double value2) {
            addCriterion("worker_activity_fee not between", value1, value2, "workerActivityFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeIsNull() {
            addCriterion("worker_deposit_fee is null");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeIsNotNull() {
            addCriterion("worker_deposit_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeEqualTo(Double value) {
            addCriterion("worker_deposit_fee =", value, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeNotEqualTo(Double value) {
            addCriterion("worker_deposit_fee <>", value, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeGreaterThan(Double value) {
            addCriterion("worker_deposit_fee >", value, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_deposit_fee >=", value, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeLessThan(Double value) {
            addCriterion("worker_deposit_fee <", value, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeLessThanOrEqualTo(Double value) {
            addCriterion("worker_deposit_fee <=", value, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeIn(List<Double> values) {
            addCriterion("worker_deposit_fee in", values, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeNotIn(List<Double> values) {
            addCriterion("worker_deposit_fee not in", values, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeBetween(Double value1, Double value2) {
            addCriterion("worker_deposit_fee between", value1, value2, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositFeeNotBetween(Double value1, Double value2) {
            addCriterion("worker_deposit_fee not between", value1, value2, "workerDepositFee");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateIsNull() {
            addCriterion("worker_award_rate is null");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateIsNotNull() {
            addCriterion("worker_award_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateEqualTo(Float value) {
            addCriterion("worker_award_rate =", value, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateNotEqualTo(Float value) {
            addCriterion("worker_award_rate <>", value, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateGreaterThan(Float value) {
            addCriterion("worker_award_rate >", value, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateGreaterThanOrEqualTo(Float value) {
            addCriterion("worker_award_rate >=", value, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateLessThan(Float value) {
            addCriterion("worker_award_rate <", value, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateLessThanOrEqualTo(Float value) {
            addCriterion("worker_award_rate <=", value, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateIn(List<Float> values) {
            addCriterion("worker_award_rate in", values, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateNotIn(List<Float> values) {
            addCriterion("worker_award_rate not in", values, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateBetween(Float value1, Float value2) {
            addCriterion("worker_award_rate between", value1, value2, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerAwardRateNotBetween(Float value1, Float value2) {
            addCriterion("worker_award_rate not between", value1, value2, "workerAwardRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateIsNull() {
            addCriterion("worker_activity_rate is null");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateIsNotNull() {
            addCriterion("worker_activity_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateEqualTo(Float value) {
            addCriterion("worker_activity_rate =", value, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateNotEqualTo(Float value) {
            addCriterion("worker_activity_rate <>", value, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateGreaterThan(Float value) {
            addCriterion("worker_activity_rate >", value, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateGreaterThanOrEqualTo(Float value) {
            addCriterion("worker_activity_rate >=", value, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateLessThan(Float value) {
            addCriterion("worker_activity_rate <", value, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateLessThanOrEqualTo(Float value) {
            addCriterion("worker_activity_rate <=", value, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateIn(List<Float> values) {
            addCriterion("worker_activity_rate in", values, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateNotIn(List<Float> values) {
            addCriterion("worker_activity_rate not in", values, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateBetween(Float value1, Float value2) {
            addCriterion("worker_activity_rate between", value1, value2, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerActivityRateNotBetween(Float value1, Float value2) {
            addCriterion("worker_activity_rate not between", value1, value2, "workerActivityRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateIsNull() {
            addCriterion("worker_deposit_rate is null");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateIsNotNull() {
            addCriterion("worker_deposit_rate is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateEqualTo(Float value) {
            addCriterion("worker_deposit_rate =", value, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateNotEqualTo(Float value) {
            addCriterion("worker_deposit_rate <>", value, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateGreaterThan(Float value) {
            addCriterion("worker_deposit_rate >", value, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateGreaterThanOrEqualTo(Float value) {
            addCriterion("worker_deposit_rate >=", value, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateLessThan(Float value) {
            addCriterion("worker_deposit_rate <", value, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateLessThanOrEqualTo(Float value) {
            addCriterion("worker_deposit_rate <=", value, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateIn(List<Float> values) {
            addCriterion("worker_deposit_rate in", values, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateNotIn(List<Float> values) {
            addCriterion("worker_deposit_rate not in", values, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateBetween(Float value1, Float value2) {
            addCriterion("worker_deposit_rate between", value1, value2, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andWorkerDepositRateNotBetween(Float value1, Float value2) {
            addCriterion("worker_deposit_rate not between", value1, value2, "workerDepositRate");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeIsNull() {
            addCriterion("hongbao_fee is null");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeIsNotNull() {
            addCriterion("hongbao_fee is not null");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeEqualTo(Double value) {
            addCriterion("hongbao_fee =", value, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeNotEqualTo(Double value) {
            addCriterion("hongbao_fee <>", value, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeGreaterThan(Double value) {
            addCriterion("hongbao_fee >", value, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("hongbao_fee >=", value, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeLessThan(Double value) {
            addCriterion("hongbao_fee <", value, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeLessThanOrEqualTo(Double value) {
            addCriterion("hongbao_fee <=", value, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeIn(List<Double> values) {
            addCriterion("hongbao_fee in", values, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeNotIn(List<Double> values) {
            addCriterion("hongbao_fee not in", values, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeBetween(Double value1, Double value2) {
            addCriterion("hongbao_fee between", value1, value2, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andHongbaoFeeNotBetween(Double value1, Double value2) {
            addCriterion("hongbao_fee not between", value1, value2, "hongbaoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeIsNull() {
            addCriterion("info_fee is null");
            return (Criteria) this;
        }

        public Criteria andInfoFeeIsNotNull() {
            addCriterion("info_fee is not null");
            return (Criteria) this;
        }

        public Criteria andInfoFeeEqualTo(Double value) {
            addCriterion("info_fee =", value, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeNotEqualTo(Double value) {
            addCriterion("info_fee <>", value, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeGreaterThan(Double value) {
            addCriterion("info_fee >", value, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("info_fee >=", value, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeLessThan(Double value) {
            addCriterion("info_fee <", value, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeLessThanOrEqualTo(Double value) {
            addCriterion("info_fee <=", value, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeIn(List<Double> values) {
            addCriterion("info_fee in", values, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeNotIn(List<Double> values) {
            addCriterion("info_fee not in", values, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeBetween(Double value1, Double value2) {
            addCriterion("info_fee between", value1, value2, "infoFee");
            return (Criteria) this;
        }

        public Criteria andInfoFeeNotBetween(Double value1, Double value2) {
            addCriterion("info_fee not between", value1, value2, "infoFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeIsNull() {
            addCriterion("luban_dakuan_fee is null");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeIsNotNull() {
            addCriterion("luban_dakuan_fee is not null");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeEqualTo(Double value) {
            addCriterion("luban_dakuan_fee =", value, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeNotEqualTo(Double value) {
            addCriterion("luban_dakuan_fee <>", value, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeGreaterThan(Double value) {
            addCriterion("luban_dakuan_fee >", value, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("luban_dakuan_fee >=", value, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeLessThan(Double value) {
            addCriterion("luban_dakuan_fee <", value, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeLessThanOrEqualTo(Double value) {
            addCriterion("luban_dakuan_fee <=", value, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeIn(List<Double> values) {
            addCriterion("luban_dakuan_fee in", values, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeNotIn(List<Double> values) {
            addCriterion("luban_dakuan_fee not in", values, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeBetween(Double value1, Double value2) {
            addCriterion("luban_dakuan_fee between", value1, value2, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andLubanDakuanFeeNotBetween(Double value1, Double value2) {
            addCriterion("luban_dakuan_fee not between", value1, value2, "lubanDakuanFee");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIsNull() {
            addCriterion("change_money is null");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIsNotNull() {
            addCriterion("change_money is not null");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyEqualTo(Double value) {
            addCriterion("change_money =", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotEqualTo(Double value) {
            addCriterion("change_money <>", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyGreaterThan(Double value) {
            addCriterion("change_money >", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("change_money >=", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyLessThan(Double value) {
            addCriterion("change_money <", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyLessThanOrEqualTo(Double value) {
            addCriterion("change_money <=", value, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyIn(List<Double> values) {
            addCriterion("change_money in", values, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotIn(List<Double> values) {
            addCriterion("change_money not in", values, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyBetween(Double value1, Double value2) {
            addCriterion("change_money between", value1, value2, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andChangeMoneyNotBetween(Double value1, Double value2) {
            addCriterion("change_money not between", value1, value2, "changeMoney");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeIsNull() {
            addCriterion("order_deduct_fee is null");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeIsNotNull() {
            addCriterion("order_deduct_fee is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeEqualTo(Double value) {
            addCriterion("order_deduct_fee =", value, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeNotEqualTo(Double value) {
            addCriterion("order_deduct_fee <>", value, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeGreaterThan(Double value) {
            addCriterion("order_deduct_fee >", value, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("order_deduct_fee >=", value, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeLessThan(Double value) {
            addCriterion("order_deduct_fee <", value, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeLessThanOrEqualTo(Double value) {
            addCriterion("order_deduct_fee <=", value, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeIn(List<Double> values) {
            addCriterion("order_deduct_fee in", values, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeNotIn(List<Double> values) {
            addCriterion("order_deduct_fee not in", values, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeBetween(Double value1, Double value2) {
            addCriterion("order_deduct_fee between", value1, value2, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderDeductFeeNotBetween(Double value1, Double value2) {
            addCriterion("order_deduct_fee not between", value1, value2, "orderDeductFee");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNull() {
            addCriterion("order_remark is null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIsNotNull() {
            addCriterion("order_remark is not null");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkEqualTo(String value) {
            addCriterion("order_remark =", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotEqualTo(String value) {
            addCriterion("order_remark <>", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThan(String value) {
            addCriterion("order_remark >", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("order_remark >=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThan(String value) {
            addCriterion("order_remark <", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLessThanOrEqualTo(String value) {
            addCriterion("order_remark <=", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkLike(String value) {
            addCriterion("order_remark like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotLike(String value) {
            addCriterion("order_remark not like", value, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkIn(List<String> values) {
            addCriterion("order_remark in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotIn(List<String> values) {
            addCriterion("order_remark not in", values, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkBetween(String value1, String value2) {
            addCriterion("order_remark between", value1, value2, "orderRemark");
            return (Criteria) this;
        }

        public Criteria andOrderRemarkNotBetween(String value1, String value2) {
            addCriterion("order_remark not between", value1, value2, "orderRemark");
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