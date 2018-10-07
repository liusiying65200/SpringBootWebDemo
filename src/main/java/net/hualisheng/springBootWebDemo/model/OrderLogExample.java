package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderLogExample() {
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

        public Criteria andOrderExceptionStatusIsNull() {
            addCriterion("order_exception_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusIsNotNull() {
            addCriterion("order_exception_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusEqualTo(Integer value) {
            addCriterion("order_exception_status =", value, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusNotEqualTo(Integer value) {
            addCriterion("order_exception_status <>", value, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusGreaterThan(Integer value) {
            addCriterion("order_exception_status >", value, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_exception_status >=", value, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusLessThan(Integer value) {
            addCriterion("order_exception_status <", value, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_exception_status <=", value, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusIn(List<Integer> values) {
            addCriterion("order_exception_status in", values, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusNotIn(List<Integer> values) {
            addCriterion("order_exception_status not in", values, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_exception_status between", value1, value2, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andOrderExceptionStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_exception_status not between", value1, value2, "orderExceptionStatus");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
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

        public Criteria andMoneyEqualTo(Float value) {
            addCriterion("money =", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotEqualTo(Float value) {
            addCriterion("money <>", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThan(Float value) {
            addCriterion("money >", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("money >=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThan(Float value) {
            addCriterion("money <", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyLessThanOrEqualTo(Float value) {
            addCriterion("money <=", value, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyIn(List<Float> values) {
            addCriterion("money in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotIn(List<Float> values) {
            addCriterion("money not in", values, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyBetween(Float value1, Float value2) {
            addCriterion("money between", value1, value2, "money");
            return (Criteria) this;
        }

        public Criteria andMoneyNotBetween(Float value1, Float value2) {
            addCriterion("money not between", value1, value2, "money");
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

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Integer value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Integer value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Integer value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Integer value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Integer> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Integer> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andLogStatusIsNull() {
            addCriterion("log_status is null");
            return (Criteria) this;
        }

        public Criteria andLogStatusIsNotNull() {
            addCriterion("log_status is not null");
            return (Criteria) this;
        }

        public Criteria andLogStatusEqualTo(Integer value) {
            addCriterion("log_status =", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotEqualTo(Integer value) {
            addCriterion("log_status <>", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusGreaterThan(Integer value) {
            addCriterion("log_status >", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("log_status >=", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusLessThan(Integer value) {
            addCriterion("log_status <", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusLessThanOrEqualTo(Integer value) {
            addCriterion("log_status <=", value, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusIn(List<Integer> values) {
            addCriterion("log_status in", values, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotIn(List<Integer> values) {
            addCriterion("log_status not in", values, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusBetween(Integer value1, Integer value2) {
            addCriterion("log_status between", value1, value2, "logStatus");
            return (Criteria) this;
        }

        public Criteria andLogStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("log_status not between", value1, value2, "logStatus");
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

        public Criteria andServiceTimeIsNull() {
            addCriterion("service_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNotNull() {
            addCriterion("service_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEqualTo(String value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(String value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(String value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(String value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(String value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLike(String value) {
            addCriterion("service_time like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotLike(String value) {
            addCriterion("service_time not like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<String> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<String> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(String value1, String value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(String value1, String value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("times not between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdIsNull() {
            addCriterion("bisiness_user_id is null");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdIsNotNull() {
            addCriterion("bisiness_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdEqualTo(Integer value) {
            addCriterion("bisiness_user_id =", value, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdNotEqualTo(Integer value) {
            addCriterion("bisiness_user_id <>", value, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdGreaterThan(Integer value) {
            addCriterion("bisiness_user_id >", value, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bisiness_user_id >=", value, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdLessThan(Integer value) {
            addCriterion("bisiness_user_id <", value, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("bisiness_user_id <=", value, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdIn(List<Integer> values) {
            addCriterion("bisiness_user_id in", values, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdNotIn(List<Integer> values) {
            addCriterion("bisiness_user_id not in", values, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdBetween(Integer value1, Integer value2) {
            addCriterion("bisiness_user_id between", value1, value2, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andBisinessUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bisiness_user_id not between", value1, value2, "bisinessUserId");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessIsNull() {
            addCriterion("createbusiness is null");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessIsNotNull() {
            addCriterion("createbusiness is not null");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessEqualTo(Integer value) {
            addCriterion("createbusiness =", value, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessNotEqualTo(Integer value) {
            addCriterion("createbusiness <>", value, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessGreaterThan(Integer value) {
            addCriterion("createbusiness >", value, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessGreaterThanOrEqualTo(Integer value) {
            addCriterion("createbusiness >=", value, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessLessThan(Integer value) {
            addCriterion("createbusiness <", value, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessLessThanOrEqualTo(Integer value) {
            addCriterion("createbusiness <=", value, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessIn(List<Integer> values) {
            addCriterion("createbusiness in", values, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessNotIn(List<Integer> values) {
            addCriterion("createbusiness not in", values, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessBetween(Integer value1, Integer value2) {
            addCriterion("createbusiness between", value1, value2, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andCreatebusinessNotBetween(Integer value1, Integer value2) {
            addCriterion("createbusiness not between", value1, value2, "createbusiness");
            return (Criteria) this;
        }

        public Criteria andPunishIsNull() {
            addCriterion("punish is null");
            return (Criteria) this;
        }

        public Criteria andPunishIsNotNull() {
            addCriterion("punish is not null");
            return (Criteria) this;
        }

        public Criteria andPunishEqualTo(Integer value) {
            addCriterion("punish =", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotEqualTo(Integer value) {
            addCriterion("punish <>", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishGreaterThan(Integer value) {
            addCriterion("punish >", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishGreaterThanOrEqualTo(Integer value) {
            addCriterion("punish >=", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishLessThan(Integer value) {
            addCriterion("punish <", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishLessThanOrEqualTo(Integer value) {
            addCriterion("punish <=", value, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishIn(List<Integer> values) {
            addCriterion("punish in", values, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotIn(List<Integer> values) {
            addCriterion("punish not in", values, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishBetween(Integer value1, Integer value2) {
            addCriterion("punish between", value1, value2, "punish");
            return (Criteria) this;
        }

        public Criteria andPunishNotBetween(Integer value1, Integer value2) {
            addCriterion("punish not between", value1, value2, "punish");
            return (Criteria) this;
        }

        public Criteria andSendSmsIsNull() {
            addCriterion("send_sms is null");
            return (Criteria) this;
        }

        public Criteria andSendSmsIsNotNull() {
            addCriterion("send_sms is not null");
            return (Criteria) this;
        }

        public Criteria andSendSmsEqualTo(Integer value) {
            addCriterion("send_sms =", value, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsNotEqualTo(Integer value) {
            addCriterion("send_sms <>", value, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsGreaterThan(Integer value) {
            addCriterion("send_sms >", value, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsGreaterThanOrEqualTo(Integer value) {
            addCriterion("send_sms >=", value, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsLessThan(Integer value) {
            addCriterion("send_sms <", value, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsLessThanOrEqualTo(Integer value) {
            addCriterion("send_sms <=", value, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsIn(List<Integer> values) {
            addCriterion("send_sms in", values, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsNotIn(List<Integer> values) {
            addCriterion("send_sms not in", values, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsBetween(Integer value1, Integer value2) {
            addCriterion("send_sms between", value1, value2, "sendSms");
            return (Criteria) this;
        }

        public Criteria andSendSmsNotBetween(Integer value1, Integer value2) {
            addCriterion("send_sms not between", value1, value2, "sendSms");
            return (Criteria) this;
        }

        public Criteria andInsertReasonIsNull() {
            addCriterion("insert_reason is null");
            return (Criteria) this;
        }

        public Criteria andInsertReasonIsNotNull() {
            addCriterion("insert_reason is not null");
            return (Criteria) this;
        }

        public Criteria andInsertReasonEqualTo(Integer value) {
            addCriterion("insert_reason =", value, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonNotEqualTo(Integer value) {
            addCriterion("insert_reason <>", value, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonGreaterThan(Integer value) {
            addCriterion("insert_reason >", value, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("insert_reason >=", value, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonLessThan(Integer value) {
            addCriterion("insert_reason <", value, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonLessThanOrEqualTo(Integer value) {
            addCriterion("insert_reason <=", value, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonIn(List<Integer> values) {
            addCriterion("insert_reason in", values, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonNotIn(List<Integer> values) {
            addCriterion("insert_reason not in", values, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonBetween(Integer value1, Integer value2) {
            addCriterion("insert_reason between", value1, value2, "insertReason");
            return (Criteria) this;
        }

        public Criteria andInsertReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("insert_reason not between", value1, value2, "insertReason");
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