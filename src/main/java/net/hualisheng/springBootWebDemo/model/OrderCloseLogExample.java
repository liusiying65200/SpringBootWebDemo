package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderCloseLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderCloseLogExample() {
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

        public Criteria andCloseReasonIsNull() {
            addCriterion("close_reason is null");
            return (Criteria) this;
        }

        public Criteria andCloseReasonIsNotNull() {
            addCriterion("close_reason is not null");
            return (Criteria) this;
        }

        public Criteria andCloseReasonEqualTo(String value) {
            addCriterion("close_reason =", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotEqualTo(String value) {
            addCriterion("close_reason <>", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonGreaterThan(String value) {
            addCriterion("close_reason >", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonGreaterThanOrEqualTo(String value) {
            addCriterion("close_reason >=", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLessThan(String value) {
            addCriterion("close_reason <", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLessThanOrEqualTo(String value) {
            addCriterion("close_reason <=", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonLike(String value) {
            addCriterion("close_reason like", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotLike(String value) {
            addCriterion("close_reason not like", value, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonIn(List<String> values) {
            addCriterion("close_reason in", values, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotIn(List<String> values) {
            addCriterion("close_reason not in", values, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonBetween(String value1, String value2) {
            addCriterion("close_reason between", value1, value2, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseReasonNotBetween(String value1, String value2) {
            addCriterion("close_reason not between", value1, value2, "closeReason");
            return (Criteria) this;
        }

        public Criteria andCloseNoteIsNull() {
            addCriterion("close_note is null");
            return (Criteria) this;
        }

        public Criteria andCloseNoteIsNotNull() {
            addCriterion("close_note is not null");
            return (Criteria) this;
        }

        public Criteria andCloseNoteEqualTo(String value) {
            addCriterion("close_note =", value, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteNotEqualTo(String value) {
            addCriterion("close_note <>", value, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteGreaterThan(String value) {
            addCriterion("close_note >", value, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteGreaterThanOrEqualTo(String value) {
            addCriterion("close_note >=", value, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteLessThan(String value) {
            addCriterion("close_note <", value, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteLessThanOrEqualTo(String value) {
            addCriterion("close_note <=", value, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteLike(String value) {
            addCriterion("close_note like", value, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteNotLike(String value) {
            addCriterion("close_note not like", value, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteIn(List<String> values) {
            addCriterion("close_note in", values, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteNotIn(List<String> values) {
            addCriterion("close_note not in", values, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteBetween(String value1, String value2) {
            addCriterion("close_note between", value1, value2, "closeNote");
            return (Criteria) this;
        }

        public Criteria andCloseNoteNotBetween(String value1, String value2) {
            addCriterion("close_note not between", value1, value2, "closeNote");
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

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(Integer value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(Integer value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(Integer value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(Integer value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(Integer value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<Integer> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<Integer> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(Integer value1, Integer value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(Integer value1, Integer value2) {
            addCriterion("result not between", value1, value2, "result");
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

        public Criteria andDoAdminIsNull() {
            addCriterion("do_admin is null");
            return (Criteria) this;
        }

        public Criteria andDoAdminIsNotNull() {
            addCriterion("do_admin is not null");
            return (Criteria) this;
        }

        public Criteria andDoAdminEqualTo(Integer value) {
            addCriterion("do_admin =", value, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminNotEqualTo(Integer value) {
            addCriterion("do_admin <>", value, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminGreaterThan(Integer value) {
            addCriterion("do_admin >", value, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminGreaterThanOrEqualTo(Integer value) {
            addCriterion("do_admin >=", value, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminLessThan(Integer value) {
            addCriterion("do_admin <", value, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminLessThanOrEqualTo(Integer value) {
            addCriterion("do_admin <=", value, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminIn(List<Integer> values) {
            addCriterion("do_admin in", values, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminNotIn(List<Integer> values) {
            addCriterion("do_admin not in", values, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminBetween(Integer value1, Integer value2) {
            addCriterion("do_admin between", value1, value2, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoAdminNotBetween(Integer value1, Integer value2) {
            addCriterion("do_admin not between", value1, value2, "doAdmin");
            return (Criteria) this;
        }

        public Criteria andDoTimeIsNull() {
            addCriterion("do_time is null");
            return (Criteria) this;
        }

        public Criteria andDoTimeIsNotNull() {
            addCriterion("do_time is not null");
            return (Criteria) this;
        }

        public Criteria andDoTimeEqualTo(Date value) {
            addCriterion("do_time =", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotEqualTo(Date value) {
            addCriterion("do_time <>", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeGreaterThan(Date value) {
            addCriterion("do_time >", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("do_time >=", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeLessThan(Date value) {
            addCriterion("do_time <", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeLessThanOrEqualTo(Date value) {
            addCriterion("do_time <=", value, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeIn(List<Date> values) {
            addCriterion("do_time in", values, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotIn(List<Date> values) {
            addCriterion("do_time not in", values, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeBetween(Date value1, Date value2) {
            addCriterion("do_time between", value1, value2, "doTime");
            return (Criteria) this;
        }

        public Criteria andDoTimeNotBetween(Date value1, Date value2) {
            addCriterion("do_time not between", value1, value2, "doTime");
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