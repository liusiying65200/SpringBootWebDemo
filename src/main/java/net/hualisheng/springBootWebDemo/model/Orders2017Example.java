package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Orders2017Example {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public Orders2017Example() {
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

        public Criteria andBussinessIdIsNull() {
            addCriterion("bussiness_id is null");
            return (Criteria) this;
        }

        public Criteria andBussinessIdIsNotNull() {
            addCriterion("bussiness_id is not null");
            return (Criteria) this;
        }

        public Criteria andBussinessIdEqualTo(Integer value) {
            addCriterion("bussiness_id =", value, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdNotEqualTo(Integer value) {
            addCriterion("bussiness_id <>", value, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdGreaterThan(Integer value) {
            addCriterion("bussiness_id >", value, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bussiness_id >=", value, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdLessThan(Integer value) {
            addCriterion("bussiness_id <", value, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdLessThanOrEqualTo(Integer value) {
            addCriterion("bussiness_id <=", value, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdIn(List<Integer> values) {
            addCriterion("bussiness_id in", values, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdNotIn(List<Integer> values) {
            addCriterion("bussiness_id not in", values, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdBetween(Integer value1, Integer value2) {
            addCriterion("bussiness_id between", value1, value2, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussinessIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bussiness_id not between", value1, value2, "bussinessId");
            return (Criteria) this;
        }

        public Criteria andBussernameIsNull() {
            addCriterion("bussername is null");
            return (Criteria) this;
        }

        public Criteria andBussernameIsNotNull() {
            addCriterion("bussername is not null");
            return (Criteria) this;
        }

        public Criteria andBussernameEqualTo(String value) {
            addCriterion("bussername =", value, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameNotEqualTo(String value) {
            addCriterion("bussername <>", value, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameGreaterThan(String value) {
            addCriterion("bussername >", value, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameGreaterThanOrEqualTo(String value) {
            addCriterion("bussername >=", value, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameLessThan(String value) {
            addCriterion("bussername <", value, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameLessThanOrEqualTo(String value) {
            addCriterion("bussername <=", value, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameLike(String value) {
            addCriterion("bussername like", value, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameNotLike(String value) {
            addCriterion("bussername not like", value, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameIn(List<String> values) {
            addCriterion("bussername in", values, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameNotIn(List<String> values) {
            addCriterion("bussername not in", values, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameBetween(String value1, String value2) {
            addCriterion("bussername between", value1, value2, "bussername");
            return (Criteria) this;
        }

        public Criteria andBussernameNotBetween(String value1, String value2) {
            addCriterion("bussername not between", value1, value2, "bussername");
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

        public Criteria andOrderCatIsNull() {
            addCriterion("order_cat is null");
            return (Criteria) this;
        }

        public Criteria andOrderCatIsNotNull() {
            addCriterion("order_cat is not null");
            return (Criteria) this;
        }

        public Criteria andOrderCatEqualTo(Integer value) {
            addCriterion("order_cat =", value, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatNotEqualTo(Integer value) {
            addCriterion("order_cat <>", value, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatGreaterThan(Integer value) {
            addCriterion("order_cat >", value, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_cat >=", value, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatLessThan(Integer value) {
            addCriterion("order_cat <", value, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatLessThanOrEqualTo(Integer value) {
            addCriterion("order_cat <=", value, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatIn(List<Integer> values) {
            addCriterion("order_cat in", values, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatNotIn(List<Integer> values) {
            addCriterion("order_cat not in", values, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatBetween(Integer value1, Integer value2) {
            addCriterion("order_cat between", value1, value2, "orderCat");
            return (Criteria) this;
        }

        public Criteria andOrderCatNotBetween(Integer value1, Integer value2) {
            addCriterion("order_cat not between", value1, value2, "orderCat");
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

        public Criteria andIsExceptionEqualTo(Byte value) {
            addCriterion("is_exception =", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotEqualTo(Byte value) {
            addCriterion("is_exception <>", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionGreaterThan(Byte value) {
            addCriterion("is_exception >", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_exception >=", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionLessThan(Byte value) {
            addCriterion("is_exception <", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionLessThanOrEqualTo(Byte value) {
            addCriterion("is_exception <=", value, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionIn(List<Byte> values) {
            addCriterion("is_exception in", values, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotIn(List<Byte> values) {
            addCriterion("is_exception not in", values, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionBetween(Byte value1, Byte value2) {
            addCriterion("is_exception between", value1, value2, "isException");
            return (Criteria) this;
        }

        public Criteria andIsExceptionNotBetween(Byte value1, Byte value2) {
            addCriterion("is_exception not between", value1, value2, "isException");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonIsNull() {
            addCriterion("exception_reason is null");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonIsNotNull() {
            addCriterion("exception_reason is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonEqualTo(Integer value) {
            addCriterion("exception_reason =", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonNotEqualTo(Integer value) {
            addCriterion("exception_reason <>", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonGreaterThan(Integer value) {
            addCriterion("exception_reason >", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonGreaterThanOrEqualTo(Integer value) {
            addCriterion("exception_reason >=", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonLessThan(Integer value) {
            addCriterion("exception_reason <", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonLessThanOrEqualTo(Integer value) {
            addCriterion("exception_reason <=", value, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonIn(List<Integer> values) {
            addCriterion("exception_reason in", values, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonNotIn(List<Integer> values) {
            addCriterion("exception_reason not in", values, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonBetween(Integer value1, Integer value2) {
            addCriterion("exception_reason between", value1, value2, "exceptionReason");
            return (Criteria) this;
        }

        public Criteria andExceptionReasonNotBetween(Integer value1, Integer value2) {
            addCriterion("exception_reason not between", value1, value2, "exceptionReason");
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

        public Criteria andCustomerProvinceIsNull() {
            addCriterion("customer_province is null");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceIsNotNull() {
            addCriterion("customer_province is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceEqualTo(Integer value) {
            addCriterion("customer_province =", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotEqualTo(Integer value) {
            addCriterion("customer_province <>", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceGreaterThan(Integer value) {
            addCriterion("customer_province >", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_province >=", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceLessThan(Integer value) {
            addCriterion("customer_province <", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("customer_province <=", value, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceIn(List<Integer> values) {
            addCriterion("customer_province in", values, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotIn(List<Integer> values) {
            addCriterion("customer_province not in", values, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceBetween(Integer value1, Integer value2) {
            addCriterion("customer_province between", value1, value2, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_province not between", value1, value2, "customerProvince");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNull() {
            addCriterion("customer_city is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIsNotNull() {
            addCriterion("customer_city is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCityEqualTo(Integer value) {
            addCriterion("customer_city =", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotEqualTo(Integer value) {
            addCriterion("customer_city <>", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThan(Integer value) {
            addCriterion("customer_city >", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_city >=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThan(Integer value) {
            addCriterion("customer_city <", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityLessThanOrEqualTo(Integer value) {
            addCriterion("customer_city <=", value, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityIn(List<Integer> values) {
            addCriterion("customer_city in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotIn(List<Integer> values) {
            addCriterion("customer_city not in", values, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityBetween(Integer value1, Integer value2) {
            addCriterion("customer_city between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerCityNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_city not between", value1, value2, "customerCity");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictIsNull() {
            addCriterion("customer_district is null");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictIsNotNull() {
            addCriterion("customer_district is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictEqualTo(Integer value) {
            addCriterion("customer_district =", value, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictNotEqualTo(Integer value) {
            addCriterion("customer_district <>", value, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictGreaterThan(Integer value) {
            addCriterion("customer_district >", value, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_district >=", value, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictLessThan(Integer value) {
            addCriterion("customer_district <", value, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("customer_district <=", value, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictIn(List<Integer> values) {
            addCriterion("customer_district in", values, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictNotIn(List<Integer> values) {
            addCriterion("customer_district not in", values, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictBetween(Integer value1, Integer value2) {
            addCriterion("customer_district between", value1, value2, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_district not between", value1, value2, "customerDistrict");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNull() {
            addCriterion("customer_address is null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIsNotNull() {
            addCriterion("customer_address is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressEqualTo(String value) {
            addCriterion("customer_address =", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotEqualTo(String value) {
            addCriterion("customer_address <>", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThan(String value) {
            addCriterion("customer_address >", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressGreaterThanOrEqualTo(String value) {
            addCriterion("customer_address >=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThan(String value) {
            addCriterion("customer_address <", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLessThanOrEqualTo(String value) {
            addCriterion("customer_address <=", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressLike(String value) {
            addCriterion("customer_address like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotLike(String value) {
            addCriterion("customer_address not like", value, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressIn(List<String> values) {
            addCriterion("customer_address in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotIn(List<String> values) {
            addCriterion("customer_address not in", values, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressBetween(String value1, String value2) {
            addCriterion("customer_address between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andCustomerAddressNotBetween(String value1, String value2) {
            addCriterion("customer_address not between", value1, value2, "customerAddress");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIsNull() {
            addCriterion("express_company is null");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIsNotNull() {
            addCriterion("express_company is not null");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyEqualTo(String value) {
            addCriterion("express_company =", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyNotEqualTo(String value) {
            addCriterion("express_company <>", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyGreaterThan(String value) {
            addCriterion("express_company >", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("express_company >=", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyLessThan(String value) {
            addCriterion("express_company <", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyLessThanOrEqualTo(String value) {
            addCriterion("express_company <=", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyLike(String value) {
            addCriterion("express_company like", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyNotLike(String value) {
            addCriterion("express_company not like", value, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyIn(List<String> values) {
            addCriterion("express_company in", values, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyNotIn(List<String> values) {
            addCriterion("express_company not in", values, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyBetween(String value1, String value2) {
            addCriterion("express_company between", value1, value2, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressCompanyNotBetween(String value1, String value2) {
            addCriterion("express_company not between", value1, value2, "expressCompany");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNull() {
            addCriterion("express_no is null");
            return (Criteria) this;
        }

        public Criteria andExpressNoIsNotNull() {
            addCriterion("express_no is not null");
            return (Criteria) this;
        }

        public Criteria andExpressNoEqualTo(String value) {
            addCriterion("express_no =", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotEqualTo(String value) {
            addCriterion("express_no <>", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThan(String value) {
            addCriterion("express_no >", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoGreaterThanOrEqualTo(String value) {
            addCriterion("express_no >=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThan(String value) {
            addCriterion("express_no <", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLessThanOrEqualTo(String value) {
            addCriterion("express_no <=", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoLike(String value) {
            addCriterion("express_no like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotLike(String value) {
            addCriterion("express_no not like", value, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoIn(List<String> values) {
            addCriterion("express_no in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotIn(List<String> values) {
            addCriterion("express_no not in", values, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoBetween(String value1, String value2) {
            addCriterion("express_no between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andExpressNoNotBetween(String value1, String value2) {
            addCriterion("express_no not between", value1, value2, "expressNo");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentIsNull() {
            addCriterion("business_payment is null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentIsNotNull() {
            addCriterion("business_payment is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentEqualTo(Float value) {
            addCriterion("business_payment =", value, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentNotEqualTo(Float value) {
            addCriterion("business_payment <>", value, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentGreaterThan(Float value) {
            addCriterion("business_payment >", value, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentGreaterThanOrEqualTo(Float value) {
            addCriterion("business_payment >=", value, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentLessThan(Float value) {
            addCriterion("business_payment <", value, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentLessThanOrEqualTo(Float value) {
            addCriterion("business_payment <=", value, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentIn(List<Float> values) {
            addCriterion("business_payment in", values, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentNotIn(List<Float> values) {
            addCriterion("business_payment not in", values, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentBetween(Float value1, Float value2) {
            addCriterion("business_payment between", value1, value2, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andBusinessPaymentNotBetween(Float value1, Float value2) {
            addCriterion("business_payment not between", value1, value2, "businessPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentIsNull() {
            addCriterion("worker_payment is null");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentIsNotNull() {
            addCriterion("worker_payment is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentEqualTo(Float value) {
            addCriterion("worker_payment =", value, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentNotEqualTo(Float value) {
            addCriterion("worker_payment <>", value, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentGreaterThan(Float value) {
            addCriterion("worker_payment >", value, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentGreaterThanOrEqualTo(Float value) {
            addCriterion("worker_payment >=", value, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentLessThan(Float value) {
            addCriterion("worker_payment <", value, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentLessThanOrEqualTo(Float value) {
            addCriterion("worker_payment <=", value, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentIn(List<Float> values) {
            addCriterion("worker_payment in", values, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentNotIn(List<Float> values) {
            addCriterion("worker_payment not in", values, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentBetween(Float value1, Float value2) {
            addCriterion("worker_payment between", value1, value2, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerPaymentNotBetween(Float value1, Float value2) {
            addCriterion("worker_payment not between", value1, value2, "workerPayment");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeIsNull() {
            addCriterion("worker_servicetype_code is null");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeIsNotNull() {
            addCriterion("worker_servicetype_code is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeEqualTo(String value) {
            addCriterion("worker_servicetype_code =", value, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeNotEqualTo(String value) {
            addCriterion("worker_servicetype_code <>", value, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeGreaterThan(String value) {
            addCriterion("worker_servicetype_code >", value, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeGreaterThanOrEqualTo(String value) {
            addCriterion("worker_servicetype_code >=", value, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeLessThan(String value) {
            addCriterion("worker_servicetype_code <", value, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeLessThanOrEqualTo(String value) {
            addCriterion("worker_servicetype_code <=", value, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeLike(String value) {
            addCriterion("worker_servicetype_code like", value, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeNotLike(String value) {
            addCriterion("worker_servicetype_code not like", value, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeIn(List<String> values) {
            addCriterion("worker_servicetype_code in", values, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeNotIn(List<String> values) {
            addCriterion("worker_servicetype_code not in", values, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeBetween(String value1, String value2) {
            addCriterion("worker_servicetype_code between", value1, value2, "workerServicetypeCode");
            return (Criteria) this;
        }

        public Criteria andWorkerServicetypeCodeNotBetween(String value1, String value2) {
            addCriterion("worker_servicetype_code not between", value1, value2, "workerServicetypeCode");
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

        public Criteria andValidateCodeIsNull() {
            addCriterion("validate_code is null");
            return (Criteria) this;
        }

        public Criteria andValidateCodeIsNotNull() {
            addCriterion("validate_code is not null");
            return (Criteria) this;
        }

        public Criteria andValidateCodeEqualTo(Integer value) {
            addCriterion("validate_code =", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeNotEqualTo(Integer value) {
            addCriterion("validate_code <>", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeGreaterThan(Integer value) {
            addCriterion("validate_code >", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("validate_code >=", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeLessThan(Integer value) {
            addCriterion("validate_code <", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeLessThanOrEqualTo(Integer value) {
            addCriterion("validate_code <=", value, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeIn(List<Integer> values) {
            addCriterion("validate_code in", values, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeNotIn(List<Integer> values) {
            addCriterion("validate_code not in", values, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeBetween(Integer value1, Integer value2) {
            addCriterion("validate_code between", value1, value2, "validateCode");
            return (Criteria) this;
        }

        public Criteria andValidateCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("validate_code not between", value1, value2, "validateCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNull() {
            addCriterion("service_code is null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIsNotNull() {
            addCriterion("service_code is not null");
            return (Criteria) this;
        }

        public Criteria andServiceCodeEqualTo(Integer value) {
            addCriterion("service_code =", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotEqualTo(Integer value) {
            addCriterion("service_code <>", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThan(Integer value) {
            addCriterion("service_code >", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_code >=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThan(Integer value) {
            addCriterion("service_code <", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeLessThanOrEqualTo(Integer value) {
            addCriterion("service_code <=", value, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeIn(List<Integer> values) {
            addCriterion("service_code in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotIn(List<Integer> values) {
            addCriterion("service_code not in", values, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeBetween(Integer value1, Integer value2) {
            addCriterion("service_code between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andServiceCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_code not between", value1, value2, "serviceCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeIsNull() {
            addCriterion("alternate_code is null");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeIsNotNull() {
            addCriterion("alternate_code is not null");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeEqualTo(Integer value) {
            addCriterion("alternate_code =", value, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeNotEqualTo(Integer value) {
            addCriterion("alternate_code <>", value, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeGreaterThan(Integer value) {
            addCriterion("alternate_code >", value, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("alternate_code >=", value, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeLessThan(Integer value) {
            addCriterion("alternate_code <", value, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeLessThanOrEqualTo(Integer value) {
            addCriterion("alternate_code <=", value, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeIn(List<Integer> values) {
            addCriterion("alternate_code in", values, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeNotIn(List<Integer> values) {
            addCriterion("alternate_code not in", values, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeBetween(Integer value1, Integer value2) {
            addCriterion("alternate_code between", value1, value2, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andAlternateCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("alternate_code not between", value1, value2, "alternateCode");
            return (Criteria) this;
        }

        public Criteria andNotesIsNull() {
            addCriterion("notes is null");
            return (Criteria) this;
        }

        public Criteria andNotesIsNotNull() {
            addCriterion("notes is not null");
            return (Criteria) this;
        }

        public Criteria andNotesEqualTo(String value) {
            addCriterion("notes =", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotEqualTo(String value) {
            addCriterion("notes <>", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThan(String value) {
            addCriterion("notes >", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesGreaterThanOrEqualTo(String value) {
            addCriterion("notes >=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThan(String value) {
            addCriterion("notes <", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLessThanOrEqualTo(String value) {
            addCriterion("notes <=", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesLike(String value) {
            addCriterion("notes like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotLike(String value) {
            addCriterion("notes not like", value, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesIn(List<String> values) {
            addCriterion("notes in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotIn(List<String> values) {
            addCriterion("notes not in", values, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesBetween(String value1, String value2) {
            addCriterion("notes between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andNotesNotBetween(String value1, String value2) {
            addCriterion("notes not between", value1, value2, "notes");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(Double value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(Double value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(Double value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(Double value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(Double value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<Double> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<Double> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(Double value1, Double value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(Double value1, Double value2) {
            addCriterion("discount not between", value1, value2, "discount");
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

        public Criteria andServiceTimeEqualTo(Date value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(Date value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(Date value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(Date value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(Date value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<Date> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<Date> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(Date value1, Date value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(Date value1, Date value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteIsNull() {
            addCriterion("business_note is null");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteIsNotNull() {
            addCriterion("business_note is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteEqualTo(String value) {
            addCriterion("business_note =", value, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteNotEqualTo(String value) {
            addCriterion("business_note <>", value, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteGreaterThan(String value) {
            addCriterion("business_note >", value, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteGreaterThanOrEqualTo(String value) {
            addCriterion("business_note >=", value, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteLessThan(String value) {
            addCriterion("business_note <", value, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteLessThanOrEqualTo(String value) {
            addCriterion("business_note <=", value, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteLike(String value) {
            addCriterion("business_note like", value, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteNotLike(String value) {
            addCriterion("business_note not like", value, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteIn(List<String> values) {
            addCriterion("business_note in", values, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteNotIn(List<String> values) {
            addCriterion("business_note not in", values, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteBetween(String value1, String value2) {
            addCriterion("business_note between", value1, value2, "businessNote");
            return (Criteria) this;
        }

        public Criteria andBusinessNoteNotBetween(String value1, String value2) {
            addCriterion("business_note not between", value1, value2, "businessNote");
            return (Criteria) this;
        }

        public Criteria andIsPauseIsNull() {
            addCriterion("is_pause is null");
            return (Criteria) this;
        }

        public Criteria andIsPauseIsNotNull() {
            addCriterion("is_pause is not null");
            return (Criteria) this;
        }

        public Criteria andIsPauseEqualTo(Integer value) {
            addCriterion("is_pause =", value, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseNotEqualTo(Integer value) {
            addCriterion("is_pause <>", value, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseGreaterThan(Integer value) {
            addCriterion("is_pause >", value, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pause >=", value, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseLessThan(Integer value) {
            addCriterion("is_pause <", value, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseLessThanOrEqualTo(Integer value) {
            addCriterion("is_pause <=", value, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseIn(List<Integer> values) {
            addCriterion("is_pause in", values, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseNotIn(List<Integer> values) {
            addCriterion("is_pause not in", values, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseBetween(Integer value1, Integer value2) {
            addCriterion("is_pause between", value1, value2, "isPause");
            return (Criteria) this;
        }

        public Criteria andIsPauseNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pause not between", value1, value2, "isPause");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIsNull() {
            addCriterion("pause_reason is null");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIsNotNull() {
            addCriterion("pause_reason is not null");
            return (Criteria) this;
        }

        public Criteria andPauseReasonEqualTo(String value) {
            addCriterion("pause_reason =", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotEqualTo(String value) {
            addCriterion("pause_reason <>", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonGreaterThan(String value) {
            addCriterion("pause_reason >", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("pause_reason >=", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLessThan(String value) {
            addCriterion("pause_reason <", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLessThanOrEqualTo(String value) {
            addCriterion("pause_reason <=", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonLike(String value) {
            addCriterion("pause_reason like", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotLike(String value) {
            addCriterion("pause_reason not like", value, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonIn(List<String> values) {
            addCriterion("pause_reason in", values, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotIn(List<String> values) {
            addCriterion("pause_reason not in", values, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonBetween(String value1, String value2) {
            addCriterion("pause_reason between", value1, value2, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseReasonNotBetween(String value1, String value2) {
            addCriterion("pause_reason not between", value1, value2, "pauseReason");
            return (Criteria) this;
        }

        public Criteria andPauseNoteIsNull() {
            addCriterion("pause_note is null");
            return (Criteria) this;
        }

        public Criteria andPauseNoteIsNotNull() {
            addCriterion("pause_note is not null");
            return (Criteria) this;
        }

        public Criteria andPauseNoteEqualTo(String value) {
            addCriterion("pause_note =", value, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteNotEqualTo(String value) {
            addCriterion("pause_note <>", value, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteGreaterThan(String value) {
            addCriterion("pause_note >", value, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("pause_note >=", value, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteLessThan(String value) {
            addCriterion("pause_note <", value, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteLessThanOrEqualTo(String value) {
            addCriterion("pause_note <=", value, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteLike(String value) {
            addCriterion("pause_note like", value, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteNotLike(String value) {
            addCriterion("pause_note not like", value, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteIn(List<String> values) {
            addCriterion("pause_note in", values, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteNotIn(List<String> values) {
            addCriterion("pause_note not in", values, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteBetween(String value1, String value2) {
            addCriterion("pause_note between", value1, value2, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseNoteNotBetween(String value1, String value2) {
            addCriterion("pause_note not between", value1, value2, "pauseNote");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNull() {
            addCriterion("pause_time is null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIsNotNull() {
            addCriterion("pause_time is not null");
            return (Criteria) this;
        }

        public Criteria andPauseTimeEqualTo(Date value) {
            addCriterion("pause_time =", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotEqualTo(Date value) {
            addCriterion("pause_time <>", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThan(Date value) {
            addCriterion("pause_time >", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("pause_time >=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThan(Date value) {
            addCriterion("pause_time <", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeLessThanOrEqualTo(Date value) {
            addCriterion("pause_time <=", value, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeIn(List<Date> values) {
            addCriterion("pause_time in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotIn(List<Date> values) {
            addCriterion("pause_time not in", values, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeBetween(Date value1, Date value2) {
            addCriterion("pause_time between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andPauseTimeNotBetween(Date value1, Date value2) {
            addCriterion("pause_time not between", value1, value2, "pauseTime");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeIsNull() {
            addCriterion("urgentFee is null");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeIsNotNull() {
            addCriterion("urgentFee is not null");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeEqualTo(Double value) {
            addCriterion("urgentFee =", value, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeNotEqualTo(Double value) {
            addCriterion("urgentFee <>", value, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeGreaterThan(Double value) {
            addCriterion("urgentFee >", value, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeGreaterThanOrEqualTo(Double value) {
            addCriterion("urgentFee >=", value, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeLessThan(Double value) {
            addCriterion("urgentFee <", value, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeLessThanOrEqualTo(Double value) {
            addCriterion("urgentFee <=", value, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeIn(List<Double> values) {
            addCriterion("urgentFee in", values, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeNotIn(List<Double> values) {
            addCriterion("urgentFee not in", values, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeBetween(Double value1, Double value2) {
            addCriterion("urgentFee between", value1, value2, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andUrgentfeeNotBetween(Double value1, Double value2) {
            addCriterion("urgentFee not between", value1, value2, "urgentfee");
            return (Criteria) this;
        }

        public Criteria andIsAssignedIsNull() {
            addCriterion("is_assigned is null");
            return (Criteria) this;
        }

        public Criteria andIsAssignedIsNotNull() {
            addCriterion("is_assigned is not null");
            return (Criteria) this;
        }

        public Criteria andIsAssignedEqualTo(Integer value) {
            addCriterion("is_assigned =", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedNotEqualTo(Integer value) {
            addCriterion("is_assigned <>", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedGreaterThan(Integer value) {
            addCriterion("is_assigned >", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_assigned >=", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedLessThan(Integer value) {
            addCriterion("is_assigned <", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedLessThanOrEqualTo(Integer value) {
            addCriterion("is_assigned <=", value, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedIn(List<Integer> values) {
            addCriterion("is_assigned in", values, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedNotIn(List<Integer> values) {
            addCriterion("is_assigned not in", values, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedBetween(Integer value1, Integer value2) {
            addCriterion("is_assigned between", value1, value2, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andIsAssignedNotBetween(Integer value1, Integer value2) {
            addCriterion("is_assigned not between", value1, value2, "isAssigned");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeIsNull() {
            addCriterion("reSend_signCode is null");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeIsNotNull() {
            addCriterion("reSend_signCode is not null");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeEqualTo(Integer value) {
            addCriterion("reSend_signCode =", value, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeNotEqualTo(Integer value) {
            addCriterion("reSend_signCode <>", value, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeGreaterThan(Integer value) {
            addCriterion("reSend_signCode >", value, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reSend_signCode >=", value, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeLessThan(Integer value) {
            addCriterion("reSend_signCode <", value, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeLessThanOrEqualTo(Integer value) {
            addCriterion("reSend_signCode <=", value, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeIn(List<Integer> values) {
            addCriterion("reSend_signCode in", values, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeNotIn(List<Integer> values) {
            addCriterion("reSend_signCode not in", values, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeBetween(Integer value1, Integer value2) {
            addCriterion("reSend_signCode between", value1, value2, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendSigncodeNotBetween(Integer value1, Integer value2) {
            addCriterion("reSend_signCode not between", value1, value2, "resendSigncode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeIsNull() {
            addCriterion("reSend_serviceCode is null");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeIsNotNull() {
            addCriterion("reSend_serviceCode is not null");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeEqualTo(Integer value) {
            addCriterion("reSend_serviceCode =", value, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeNotEqualTo(Integer value) {
            addCriterion("reSend_serviceCode <>", value, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeGreaterThan(Integer value) {
            addCriterion("reSend_serviceCode >", value, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("reSend_serviceCode >=", value, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeLessThan(Integer value) {
            addCriterion("reSend_serviceCode <", value, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeLessThanOrEqualTo(Integer value) {
            addCriterion("reSend_serviceCode <=", value, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeIn(List<Integer> values) {
            addCriterion("reSend_serviceCode in", values, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeNotIn(List<Integer> values) {
            addCriterion("reSend_serviceCode not in", values, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeBetween(Integer value1, Integer value2) {
            addCriterion("reSend_serviceCode between", value1, value2, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andResendServicecodeNotBetween(Integer value1, Integer value2) {
            addCriterion("reSend_serviceCode not between", value1, value2, "resendServicecode");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallIsNull() {
            addCriterion("need_ontime_install is null");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallIsNotNull() {
            addCriterion("need_ontime_install is not null");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallEqualTo(Integer value) {
            addCriterion("need_ontime_install =", value, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallNotEqualTo(Integer value) {
            addCriterion("need_ontime_install <>", value, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallGreaterThan(Integer value) {
            addCriterion("need_ontime_install >", value, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallGreaterThanOrEqualTo(Integer value) {
            addCriterion("need_ontime_install >=", value, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallLessThan(Integer value) {
            addCriterion("need_ontime_install <", value, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallLessThanOrEqualTo(Integer value) {
            addCriterion("need_ontime_install <=", value, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallIn(List<Integer> values) {
            addCriterion("need_ontime_install in", values, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallNotIn(List<Integer> values) {
            addCriterion("need_ontime_install not in", values, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallBetween(Integer value1, Integer value2) {
            addCriterion("need_ontime_install between", value1, value2, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andNeedOntimeInstallNotBetween(Integer value1, Integer value2) {
            addCriterion("need_ontime_install not between", value1, value2, "needOntimeInstall");
            return (Criteria) this;
        }

        public Criteria andInstallNoteIsNull() {
            addCriterion("install_note is null");
            return (Criteria) this;
        }

        public Criteria andInstallNoteIsNotNull() {
            addCriterion("install_note is not null");
            return (Criteria) this;
        }

        public Criteria andInstallNoteEqualTo(String value) {
            addCriterion("install_note =", value, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteNotEqualTo(String value) {
            addCriterion("install_note <>", value, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteGreaterThan(String value) {
            addCriterion("install_note >", value, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteGreaterThanOrEqualTo(String value) {
            addCriterion("install_note >=", value, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteLessThan(String value) {
            addCriterion("install_note <", value, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteLessThanOrEqualTo(String value) {
            addCriterion("install_note <=", value, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteLike(String value) {
            addCriterion("install_note like", value, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteNotLike(String value) {
            addCriterion("install_note not like", value, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteIn(List<String> values) {
            addCriterion("install_note in", values, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteNotIn(List<String> values) {
            addCriterion("install_note not in", values, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteBetween(String value1, String value2) {
            addCriterion("install_note between", value1, value2, "installNote");
            return (Criteria) this;
        }

        public Criteria andInstallNoteNotBetween(String value1, String value2) {
            addCriterion("install_note not between", value1, value2, "installNote");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeIsNull() {
            addCriterion("exception_subscribe is null");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeIsNotNull() {
            addCriterion("exception_subscribe is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeEqualTo(Integer value) {
            addCriterion("exception_subscribe =", value, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeNotEqualTo(Integer value) {
            addCriterion("exception_subscribe <>", value, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeGreaterThan(Integer value) {
            addCriterion("exception_subscribe >", value, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeGreaterThanOrEqualTo(Integer value) {
            addCriterion("exception_subscribe >=", value, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeLessThan(Integer value) {
            addCriterion("exception_subscribe <", value, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeLessThanOrEqualTo(Integer value) {
            addCriterion("exception_subscribe <=", value, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeIn(List<Integer> values) {
            addCriterion("exception_subscribe in", values, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeNotIn(List<Integer> values) {
            addCriterion("exception_subscribe not in", values, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeBetween(Integer value1, Integer value2) {
            addCriterion("exception_subscribe between", value1, value2, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExceptionSubscribeNotBetween(Integer value1, Integer value2) {
            addCriterion("exception_subscribe not between", value1, value2, "exceptionSubscribe");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeIsNull() {
            addCriterion("excep_subscribe_time is null");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeIsNotNull() {
            addCriterion("excep_subscribe_time is not null");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeEqualTo(Date value) {
            addCriterion("excep_subscribe_time =", value, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeNotEqualTo(Date value) {
            addCriterion("excep_subscribe_time <>", value, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeGreaterThan(Date value) {
            addCriterion("excep_subscribe_time >", value, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("excep_subscribe_time >=", value, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeLessThan(Date value) {
            addCriterion("excep_subscribe_time <", value, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeLessThanOrEqualTo(Date value) {
            addCriterion("excep_subscribe_time <=", value, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeIn(List<Date> values) {
            addCriterion("excep_subscribe_time in", values, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeNotIn(List<Date> values) {
            addCriterion("excep_subscribe_time not in", values, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeBetween(Date value1, Date value2) {
            addCriterion("excep_subscribe_time between", value1, value2, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSubscribeTimeNotBetween(Date value1, Date value2) {
            addCriterion("excep_subscribe_time not between", value1, value2, "excepSubscribeTime");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonIsNull() {
            addCriterion("excep_sbuscribe_reason is null");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonIsNotNull() {
            addCriterion("excep_sbuscribe_reason is not null");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonEqualTo(String value) {
            addCriterion("excep_sbuscribe_reason =", value, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonNotEqualTo(String value) {
            addCriterion("excep_sbuscribe_reason <>", value, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonGreaterThan(String value) {
            addCriterion("excep_sbuscribe_reason >", value, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonGreaterThanOrEqualTo(String value) {
            addCriterion("excep_sbuscribe_reason >=", value, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonLessThan(String value) {
            addCriterion("excep_sbuscribe_reason <", value, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonLessThanOrEqualTo(String value) {
            addCriterion("excep_sbuscribe_reason <=", value, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonLike(String value) {
            addCriterion("excep_sbuscribe_reason like", value, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonNotLike(String value) {
            addCriterion("excep_sbuscribe_reason not like", value, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonIn(List<String> values) {
            addCriterion("excep_sbuscribe_reason in", values, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonNotIn(List<String> values) {
            addCriterion("excep_sbuscribe_reason not in", values, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonBetween(String value1, String value2) {
            addCriterion("excep_sbuscribe_reason between", value1, value2, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeReasonNotBetween(String value1, String value2) {
            addCriterion("excep_sbuscribe_reason not between", value1, value2, "excepSbuscribeReason");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteIsNull() {
            addCriterion("excep_sbuscribe_note is null");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteIsNotNull() {
            addCriterion("excep_sbuscribe_note is not null");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteEqualTo(String value) {
            addCriterion("excep_sbuscribe_note =", value, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteNotEqualTo(String value) {
            addCriterion("excep_sbuscribe_note <>", value, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteGreaterThan(String value) {
            addCriterion("excep_sbuscribe_note >", value, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteGreaterThanOrEqualTo(String value) {
            addCriterion("excep_sbuscribe_note >=", value, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteLessThan(String value) {
            addCriterion("excep_sbuscribe_note <", value, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteLessThanOrEqualTo(String value) {
            addCriterion("excep_sbuscribe_note <=", value, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteLike(String value) {
            addCriterion("excep_sbuscribe_note like", value, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteNotLike(String value) {
            addCriterion("excep_sbuscribe_note not like", value, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteIn(List<String> values) {
            addCriterion("excep_sbuscribe_note in", values, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteNotIn(List<String> values) {
            addCriterion("excep_sbuscribe_note not in", values, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteBetween(String value1, String value2) {
            addCriterion("excep_sbuscribe_note between", value1, value2, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andExcepSbuscribeNoteNotBetween(String value1, String value2) {
            addCriterion("excep_sbuscribe_note not between", value1, value2, "excepSbuscribeNote");
            return (Criteria) this;
        }

        public Criteria andIsSignIsNull() {
            addCriterion("is_sign is null");
            return (Criteria) this;
        }

        public Criteria andIsSignIsNotNull() {
            addCriterion("is_sign is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignEqualTo(Integer value) {
            addCriterion("is_sign =", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotEqualTo(Integer value) {
            addCriterion("is_sign <>", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignGreaterThan(Integer value) {
            addCriterion("is_sign >", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_sign >=", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignLessThan(Integer value) {
            addCriterion("is_sign <", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignLessThanOrEqualTo(Integer value) {
            addCriterion("is_sign <=", value, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignIn(List<Integer> values) {
            addCriterion("is_sign in", values, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotIn(List<Integer> values) {
            addCriterion("is_sign not in", values, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignBetween(Integer value1, Integer value2) {
            addCriterion("is_sign between", value1, value2, "isSign");
            return (Criteria) this;
        }

        public Criteria andIsSignNotBetween(Integer value1, Integer value2) {
            addCriterion("is_sign not between", value1, value2, "isSign");
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

        public Criteria andPackageNoIsNull() {
            addCriterion("package_no is null");
            return (Criteria) this;
        }

        public Criteria andPackageNoIsNotNull() {
            addCriterion("package_no is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNoEqualTo(String value) {
            addCriterion("package_no =", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoNotEqualTo(String value) {
            addCriterion("package_no <>", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoGreaterThan(String value) {
            addCriterion("package_no >", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoGreaterThanOrEqualTo(String value) {
            addCriterion("package_no >=", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoLessThan(String value) {
            addCriterion("package_no <", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoLessThanOrEqualTo(String value) {
            addCriterion("package_no <=", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoLike(String value) {
            addCriterion("package_no like", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoNotLike(String value) {
            addCriterion("package_no not like", value, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoIn(List<String> values) {
            addCriterion("package_no in", values, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoNotIn(List<String> values) {
            addCriterion("package_no not in", values, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoBetween(String value1, String value2) {
            addCriterion("package_no between", value1, value2, "packageNo");
            return (Criteria) this;
        }

        public Criteria andPackageNoNotBetween(String value1, String value2) {
            addCriterion("package_no not between", value1, value2, "packageNo");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagIsNull() {
            addCriterion("refuse_pay_flag is null");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagIsNotNull() {
            addCriterion("refuse_pay_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagEqualTo(Integer value) {
            addCriterion("refuse_pay_flag =", value, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagNotEqualTo(Integer value) {
            addCriterion("refuse_pay_flag <>", value, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagGreaterThan(Integer value) {
            addCriterion("refuse_pay_flag >", value, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("refuse_pay_flag >=", value, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagLessThan(Integer value) {
            addCriterion("refuse_pay_flag <", value, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagLessThanOrEqualTo(Integer value) {
            addCriterion("refuse_pay_flag <=", value, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagIn(List<Integer> values) {
            addCriterion("refuse_pay_flag in", values, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagNotIn(List<Integer> values) {
            addCriterion("refuse_pay_flag not in", values, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagBetween(Integer value1, Integer value2) {
            addCriterion("refuse_pay_flag between", value1, value2, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andRefusePayFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("refuse_pay_flag not between", value1, value2, "refusePayFlag");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerIsNull() {
            addCriterion("belong_customer is null");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerIsNotNull() {
            addCriterion("belong_customer is not null");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerEqualTo(String value) {
            addCriterion("belong_customer =", value, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerNotEqualTo(String value) {
            addCriterion("belong_customer <>", value, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerGreaterThan(String value) {
            addCriterion("belong_customer >", value, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("belong_customer >=", value, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerLessThan(String value) {
            addCriterion("belong_customer <", value, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerLessThanOrEqualTo(String value) {
            addCriterion("belong_customer <=", value, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerLike(String value) {
            addCriterion("belong_customer like", value, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerNotLike(String value) {
            addCriterion("belong_customer not like", value, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerIn(List<String> values) {
            addCriterion("belong_customer in", values, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerNotIn(List<String> values) {
            addCriterion("belong_customer not in", values, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerBetween(String value1, String value2) {
            addCriterion("belong_customer between", value1, value2, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andBelongCustomerNotBetween(String value1, String value2) {
            addCriterion("belong_customer not between", value1, value2, "belongCustomer");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagIsNull() {
            addCriterion("finish_order_flag is null");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagIsNotNull() {
            addCriterion("finish_order_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagEqualTo(Integer value) {
            addCriterion("finish_order_flag =", value, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagNotEqualTo(Integer value) {
            addCriterion("finish_order_flag <>", value, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagGreaterThan(Integer value) {
            addCriterion("finish_order_flag >", value, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("finish_order_flag >=", value, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagLessThan(Integer value) {
            addCriterion("finish_order_flag <", value, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagLessThanOrEqualTo(Integer value) {
            addCriterion("finish_order_flag <=", value, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagIn(List<Integer> values) {
            addCriterion("finish_order_flag in", values, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagNotIn(List<Integer> values) {
            addCriterion("finish_order_flag not in", values, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagBetween(Integer value1, Integer value2) {
            addCriterion("finish_order_flag between", value1, value2, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andFinishOrderFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("finish_order_flag not between", value1, value2, "finishOrderFlag");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerIsNull() {
            addCriterion("settlement_belong_customer is null");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerIsNotNull() {
            addCriterion("settlement_belong_customer is not null");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerEqualTo(String value) {
            addCriterion("settlement_belong_customer =", value, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerNotEqualTo(String value) {
            addCriterion("settlement_belong_customer <>", value, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerGreaterThan(String value) {
            addCriterion("settlement_belong_customer >", value, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("settlement_belong_customer >=", value, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerLessThan(String value) {
            addCriterion("settlement_belong_customer <", value, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerLessThanOrEqualTo(String value) {
            addCriterion("settlement_belong_customer <=", value, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerLike(String value) {
            addCriterion("settlement_belong_customer like", value, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerNotLike(String value) {
            addCriterion("settlement_belong_customer not like", value, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerIn(List<String> values) {
            addCriterion("settlement_belong_customer in", values, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerNotIn(List<String> values) {
            addCriterion("settlement_belong_customer not in", values, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerBetween(String value1, String value2) {
            addCriterion("settlement_belong_customer between", value1, value2, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andSettlementBelongCustomerNotBetween(String value1, String value2) {
            addCriterion("settlement_belong_customer not between", value1, value2, "settlementBelongCustomer");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeIsNull() {
            addCriterion("business_min_fee is null");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeIsNotNull() {
            addCriterion("business_min_fee is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeEqualTo(Float value) {
            addCriterion("business_min_fee =", value, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeNotEqualTo(Float value) {
            addCriterion("business_min_fee <>", value, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeGreaterThan(Float value) {
            addCriterion("business_min_fee >", value, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("business_min_fee >=", value, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeLessThan(Float value) {
            addCriterion("business_min_fee <", value, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeLessThanOrEqualTo(Float value) {
            addCriterion("business_min_fee <=", value, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeIn(List<Float> values) {
            addCriterion("business_min_fee in", values, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeNotIn(List<Float> values) {
            addCriterion("business_min_fee not in", values, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeBetween(Float value1, Float value2) {
            addCriterion("business_min_fee between", value1, value2, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andBusinessMinFeeNotBetween(Float value1, Float value2) {
            addCriterion("business_min_fee not between", value1, value2, "businessMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeIsNull() {
            addCriterion("worker_min_fee is null");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeIsNotNull() {
            addCriterion("worker_min_fee is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeEqualTo(Float value) {
            addCriterion("worker_min_fee =", value, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeNotEqualTo(Float value) {
            addCriterion("worker_min_fee <>", value, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeGreaterThan(Float value) {
            addCriterion("worker_min_fee >", value, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeGreaterThanOrEqualTo(Float value) {
            addCriterion("worker_min_fee >=", value, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeLessThan(Float value) {
            addCriterion("worker_min_fee <", value, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeLessThanOrEqualTo(Float value) {
            addCriterion("worker_min_fee <=", value, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeIn(List<Float> values) {
            addCriterion("worker_min_fee in", values, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeNotIn(List<Float> values) {
            addCriterion("worker_min_fee not in", values, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeBetween(Float value1, Float value2) {
            addCriterion("worker_min_fee between", value1, value2, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andWorkerMinFeeNotBetween(Float value1, Float value2) {
            addCriterion("worker_min_fee not between", value1, value2, "workerMinFee");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerIsNull() {
            addCriterion("develop_worker is null");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerIsNotNull() {
            addCriterion("develop_worker is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerEqualTo(Integer value) {
            addCriterion("develop_worker =", value, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerNotEqualTo(Integer value) {
            addCriterion("develop_worker <>", value, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerGreaterThan(Integer value) {
            addCriterion("develop_worker >", value, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerGreaterThanOrEqualTo(Integer value) {
            addCriterion("develop_worker >=", value, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerLessThan(Integer value) {
            addCriterion("develop_worker <", value, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerLessThanOrEqualTo(Integer value) {
            addCriterion("develop_worker <=", value, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerIn(List<Integer> values) {
            addCriterion("develop_worker in", values, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerNotIn(List<Integer> values) {
            addCriterion("develop_worker not in", values, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerBetween(Integer value1, Integer value2) {
            addCriterion("develop_worker between", value1, value2, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopWorkerNotBetween(Integer value1, Integer value2) {
            addCriterion("develop_worker not between", value1, value2, "developWorker");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteIsNull() {
            addCriterion("develop_note is null");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteIsNotNull() {
            addCriterion("develop_note is not null");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteEqualTo(String value) {
            addCriterion("develop_note =", value, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteNotEqualTo(String value) {
            addCriterion("develop_note <>", value, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteGreaterThan(String value) {
            addCriterion("develop_note >", value, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteGreaterThanOrEqualTo(String value) {
            addCriterion("develop_note >=", value, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteLessThan(String value) {
            addCriterion("develop_note <", value, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteLessThanOrEqualTo(String value) {
            addCriterion("develop_note <=", value, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteLike(String value) {
            addCriterion("develop_note like", value, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteNotLike(String value) {
            addCriterion("develop_note not like", value, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteIn(List<String> values) {
            addCriterion("develop_note in", values, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteNotIn(List<String> values) {
            addCriterion("develop_note not in", values, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteBetween(String value1, String value2) {
            addCriterion("develop_note between", value1, value2, "developNote");
            return (Criteria) this;
        }

        public Criteria andDevelopNoteNotBetween(String value1, String value2) {
            addCriterion("develop_note not between", value1, value2, "developNote");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusIsNull() {
            addCriterion("make_good_status is null");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusIsNotNull() {
            addCriterion("make_good_status is not null");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusEqualTo(Integer value) {
            addCriterion("make_good_status =", value, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusNotEqualTo(Integer value) {
            addCriterion("make_good_status <>", value, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusGreaterThan(Integer value) {
            addCriterion("make_good_status >", value, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("make_good_status >=", value, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusLessThan(Integer value) {
            addCriterion("make_good_status <", value, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusLessThanOrEqualTo(Integer value) {
            addCriterion("make_good_status <=", value, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusIn(List<Integer> values) {
            addCriterion("make_good_status in", values, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusNotIn(List<Integer> values) {
            addCriterion("make_good_status not in", values, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusBetween(Integer value1, Integer value2) {
            addCriterion("make_good_status between", value1, value2, "makeGoodStatus");
            return (Criteria) this;
        }

        public Criteria andMakeGoodStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("make_good_status not between", value1, value2, "makeGoodStatus");
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

        public Criteria andMakeGoodFailReasonIsNull() {
            addCriterion("make_good_fail_reason is null");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonIsNotNull() {
            addCriterion("make_good_fail_reason is not null");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonEqualTo(String value) {
            addCriterion("make_good_fail_reason =", value, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonNotEqualTo(String value) {
            addCriterion("make_good_fail_reason <>", value, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonGreaterThan(String value) {
            addCriterion("make_good_fail_reason >", value, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonGreaterThanOrEqualTo(String value) {
            addCriterion("make_good_fail_reason >=", value, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonLessThan(String value) {
            addCriterion("make_good_fail_reason <", value, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonLessThanOrEqualTo(String value) {
            addCriterion("make_good_fail_reason <=", value, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonLike(String value) {
            addCriterion("make_good_fail_reason like", value, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonNotLike(String value) {
            addCriterion("make_good_fail_reason not like", value, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonIn(List<String> values) {
            addCriterion("make_good_fail_reason in", values, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonNotIn(List<String> values) {
            addCriterion("make_good_fail_reason not in", values, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonBetween(String value1, String value2) {
            addCriterion("make_good_fail_reason between", value1, value2, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andMakeGoodFailReasonNotBetween(String value1, String value2) {
            addCriterion("make_good_fail_reason not between", value1, value2, "makeGoodFailReason");
            return (Criteria) this;
        }

        public Criteria andYyStatusIsNull() {
            addCriterion("yy_status is null");
            return (Criteria) this;
        }

        public Criteria andYyStatusIsNotNull() {
            addCriterion("yy_status is not null");
            return (Criteria) this;
        }

        public Criteria andYyStatusEqualTo(Integer value) {
            addCriterion("yy_status =", value, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusNotEqualTo(Integer value) {
            addCriterion("yy_status <>", value, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusGreaterThan(Integer value) {
            addCriterion("yy_status >", value, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("yy_status >=", value, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusLessThan(Integer value) {
            addCriterion("yy_status <", value, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusLessThanOrEqualTo(Integer value) {
            addCriterion("yy_status <=", value, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusIn(List<Integer> values) {
            addCriterion("yy_status in", values, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusNotIn(List<Integer> values) {
            addCriterion("yy_status not in", values, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusBetween(Integer value1, Integer value2) {
            addCriterion("yy_status between", value1, value2, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andYyStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("yy_status not between", value1, value2, "yyStatus");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagIsNull() {
            addCriterion("order_deal_flag is null");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagIsNotNull() {
            addCriterion("order_deal_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagEqualTo(Integer value) {
            addCriterion("order_deal_flag =", value, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagNotEqualTo(Integer value) {
            addCriterion("order_deal_flag <>", value, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagGreaterThan(Integer value) {
            addCriterion("order_deal_flag >", value, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_deal_flag >=", value, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagLessThan(Integer value) {
            addCriterion("order_deal_flag <", value, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagLessThanOrEqualTo(Integer value) {
            addCriterion("order_deal_flag <=", value, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagIn(List<Integer> values) {
            addCriterion("order_deal_flag in", values, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagNotIn(List<Integer> values) {
            addCriterion("order_deal_flag not in", values, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagBetween(Integer value1, Integer value2) {
            addCriterion("order_deal_flag between", value1, value2, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andOrderDealFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("order_deal_flag not between", value1, value2, "orderDealFlag");
            return (Criteria) this;
        }

        public Criteria andLubanCoinIsNull() {
            addCriterion("luban_coin is null");
            return (Criteria) this;
        }

        public Criteria andLubanCoinIsNotNull() {
            addCriterion("luban_coin is not null");
            return (Criteria) this;
        }

        public Criteria andLubanCoinEqualTo(Double value) {
            addCriterion("luban_coin =", value, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinNotEqualTo(Double value) {
            addCriterion("luban_coin <>", value, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinGreaterThan(Double value) {
            addCriterion("luban_coin >", value, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinGreaterThanOrEqualTo(Double value) {
            addCriterion("luban_coin >=", value, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinLessThan(Double value) {
            addCriterion("luban_coin <", value, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinLessThanOrEqualTo(Double value) {
            addCriterion("luban_coin <=", value, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinIn(List<Double> values) {
            addCriterion("luban_coin in", values, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinNotIn(List<Double> values) {
            addCriterion("luban_coin not in", values, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinBetween(Double value1, Double value2) {
            addCriterion("luban_coin between", value1, value2, "lubanCoin");
            return (Criteria) this;
        }

        public Criteria andLubanCoinNotBetween(Double value1, Double value2) {
            addCriterion("luban_coin not between", value1, value2, "lubanCoin");
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

        public Criteria andRefuseCaseIsNull() {
            addCriterion("refuse_case is null");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseIsNotNull() {
            addCriterion("refuse_case is not null");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseEqualTo(String value) {
            addCriterion("refuse_case =", value, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseNotEqualTo(String value) {
            addCriterion("refuse_case <>", value, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseGreaterThan(String value) {
            addCriterion("refuse_case >", value, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseGreaterThanOrEqualTo(String value) {
            addCriterion("refuse_case >=", value, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseLessThan(String value) {
            addCriterion("refuse_case <", value, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseLessThanOrEqualTo(String value) {
            addCriterion("refuse_case <=", value, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseLike(String value) {
            addCriterion("refuse_case like", value, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseNotLike(String value) {
            addCriterion("refuse_case not like", value, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseIn(List<String> values) {
            addCriterion("refuse_case in", values, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseNotIn(List<String> values) {
            addCriterion("refuse_case not in", values, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseBetween(String value1, String value2) {
            addCriterion("refuse_case between", value1, value2, "refuseCase");
            return (Criteria) this;
        }

        public Criteria andRefuseCaseNotBetween(String value1, String value2) {
            addCriterion("refuse_case not between", value1, value2, "refuseCase");
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