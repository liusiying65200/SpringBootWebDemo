package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class OrderExceptionFeeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExceptionFeeExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andOriginalMoneyIsNull() {
            addCriterion("original_money is null");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyIsNotNull() {
            addCriterion("original_money is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyEqualTo(Double value) {
            addCriterion("original_money =", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotEqualTo(Double value) {
            addCriterion("original_money <>", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyGreaterThan(Double value) {
            addCriterion("original_money >", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("original_money >=", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyLessThan(Double value) {
            addCriterion("original_money <", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyLessThanOrEqualTo(Double value) {
            addCriterion("original_money <=", value, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyIn(List<Double> values) {
            addCriterion("original_money in", values, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotIn(List<Double> values) {
            addCriterion("original_money not in", values, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyBetween(Double value1, Double value2) {
            addCriterion("original_money between", value1, value2, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalMoneyNotBetween(Double value1, Double value2) {
            addCriterion("original_money not between", value1, value2, "originalMoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyIsNull() {
            addCriterion("original_dismoney is null");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyIsNotNull() {
            addCriterion("original_dismoney is not null");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyEqualTo(Double value) {
            addCriterion("original_dismoney =", value, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyNotEqualTo(Double value) {
            addCriterion("original_dismoney <>", value, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyGreaterThan(Double value) {
            addCriterion("original_dismoney >", value, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("original_dismoney >=", value, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyLessThan(Double value) {
            addCriterion("original_dismoney <", value, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyLessThanOrEqualTo(Double value) {
            addCriterion("original_dismoney <=", value, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyIn(List<Double> values) {
            addCriterion("original_dismoney in", values, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyNotIn(List<Double> values) {
            addCriterion("original_dismoney not in", values, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyBetween(Double value1, Double value2) {
            addCriterion("original_dismoney between", value1, value2, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andOriginalDismoneyNotBetween(Double value1, Double value2) {
            addCriterion("original_dismoney not between", value1, value2, "originalDismoney");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeIsNull() {
            addCriterion("business_income is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeIsNotNull() {
            addCriterion("business_income is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeEqualTo(Double value) {
            addCriterion("business_income =", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeNotEqualTo(Double value) {
            addCriterion("business_income <>", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeGreaterThan(Double value) {
            addCriterion("business_income >", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("business_income >=", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLessThan(Double value) {
            addCriterion("business_income <", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeLessThanOrEqualTo(Double value) {
            addCriterion("business_income <=", value, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeIn(List<Double> values) {
            addCriterion("business_income in", values, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeNotIn(List<Double> values) {
            addCriterion("business_income not in", values, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeBetween(Double value1, Double value2) {
            addCriterion("business_income between", value1, value2, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessIncomeNotBetween(Double value1, Double value2) {
            addCriterion("business_income not between", value1, value2, "businessIncome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeIsNull() {
            addCriterion("business_outcome is null");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeIsNotNull() {
            addCriterion("business_outcome is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeEqualTo(Double value) {
            addCriterion("business_outcome =", value, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeNotEqualTo(Double value) {
            addCriterion("business_outcome <>", value, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeGreaterThan(Double value) {
            addCriterion("business_outcome >", value, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeGreaterThanOrEqualTo(Double value) {
            addCriterion("business_outcome >=", value, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeLessThan(Double value) {
            addCriterion("business_outcome <", value, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeLessThanOrEqualTo(Double value) {
            addCriterion("business_outcome <=", value, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeIn(List<Double> values) {
            addCriterion("business_outcome in", values, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeNotIn(List<Double> values) {
            addCriterion("business_outcome not in", values, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeBetween(Double value1, Double value2) {
            addCriterion("business_outcome between", value1, value2, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andBusinessOutcomeNotBetween(Double value1, Double value2) {
            addCriterion("business_outcome not between", value1, value2, "businessOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeIsNull() {
            addCriterion("worker_income is null");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeIsNotNull() {
            addCriterion("worker_income is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeEqualTo(Double value) {
            addCriterion("worker_income =", value, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeNotEqualTo(Double value) {
            addCriterion("worker_income <>", value, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeGreaterThan(Double value) {
            addCriterion("worker_income >", value, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_income >=", value, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeLessThan(Double value) {
            addCriterion("worker_income <", value, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeLessThanOrEqualTo(Double value) {
            addCriterion("worker_income <=", value, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeIn(List<Double> values) {
            addCriterion("worker_income in", values, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeNotIn(List<Double> values) {
            addCriterion("worker_income not in", values, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeBetween(Double value1, Double value2) {
            addCriterion("worker_income between", value1, value2, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerIncomeNotBetween(Double value1, Double value2) {
            addCriterion("worker_income not between", value1, value2, "workerIncome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeIsNull() {
            addCriterion("worker_outcome is null");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeIsNotNull() {
            addCriterion("worker_outcome is not null");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeEqualTo(Double value) {
            addCriterion("worker_outcome =", value, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeNotEqualTo(Double value) {
            addCriterion("worker_outcome <>", value, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeGreaterThan(Double value) {
            addCriterion("worker_outcome >", value, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeGreaterThanOrEqualTo(Double value) {
            addCriterion("worker_outcome >=", value, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeLessThan(Double value) {
            addCriterion("worker_outcome <", value, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeLessThanOrEqualTo(Double value) {
            addCriterion("worker_outcome <=", value, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeIn(List<Double> values) {
            addCriterion("worker_outcome in", values, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeNotIn(List<Double> values) {
            addCriterion("worker_outcome not in", values, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeBetween(Double value1, Double value2) {
            addCriterion("worker_outcome between", value1, value2, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andWorkerOutcomeNotBetween(Double value1, Double value2) {
            addCriterion("worker_outcome not between", value1, value2, "workerOutcome");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andExceptionDescIsNull() {
            addCriterion("exception_desc is null");
            return (Criteria) this;
        }

        public Criteria andExceptionDescIsNotNull() {
            addCriterion("exception_desc is not null");
            return (Criteria) this;
        }

        public Criteria andExceptionDescEqualTo(String value) {
            addCriterion("exception_desc =", value, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescNotEqualTo(String value) {
            addCriterion("exception_desc <>", value, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescGreaterThan(String value) {
            addCriterion("exception_desc >", value, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescGreaterThanOrEqualTo(String value) {
            addCriterion("exception_desc >=", value, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescLessThan(String value) {
            addCriterion("exception_desc <", value, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescLessThanOrEqualTo(String value) {
            addCriterion("exception_desc <=", value, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescLike(String value) {
            addCriterion("exception_desc like", value, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescNotLike(String value) {
            addCriterion("exception_desc not like", value, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescIn(List<String> values) {
            addCriterion("exception_desc in", values, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescNotIn(List<String> values) {
            addCriterion("exception_desc not in", values, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescBetween(String value1, String value2) {
            addCriterion("exception_desc between", value1, value2, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andExceptionDescNotBetween(String value1, String value2) {
            addCriterion("exception_desc not between", value1, value2, "exceptionDesc");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
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
            addCriterionForJDBCDate("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterionForJDBCDate("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterionForJDBCDate("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteIsNull() {
            addCriterion("finance_note is null");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteIsNotNull() {
            addCriterion("finance_note is not null");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteEqualTo(String value) {
            addCriterion("finance_note =", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteNotEqualTo(String value) {
            addCriterion("finance_note <>", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteGreaterThan(String value) {
            addCriterion("finance_note >", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteGreaterThanOrEqualTo(String value) {
            addCriterion("finance_note >=", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteLessThan(String value) {
            addCriterion("finance_note <", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteLessThanOrEqualTo(String value) {
            addCriterion("finance_note <=", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteLike(String value) {
            addCriterion("finance_note like", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteNotLike(String value) {
            addCriterion("finance_note not like", value, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteIn(List<String> values) {
            addCriterion("finance_note in", values, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteNotIn(List<String> values) {
            addCriterion("finance_note not in", values, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteBetween(String value1, String value2) {
            addCriterion("finance_note between", value1, value2, "financeNote");
            return (Criteria) this;
        }

        public Criteria andFinanceNoteNotBetween(String value1, String value2) {
            addCriterion("finance_note not between", value1, value2, "financeNote");
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

        public Criteria andEnabledIsNull() {
            addCriterion("enabled is null");
            return (Criteria) this;
        }

        public Criteria andEnabledIsNotNull() {
            addCriterion("enabled is not null");
            return (Criteria) this;
        }

        public Criteria andEnabledEqualTo(Integer value) {
            addCriterion("enabled =", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotEqualTo(Integer value) {
            addCriterion("enabled <>", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThan(Integer value) {
            addCriterion("enabled >", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledGreaterThanOrEqualTo(Integer value) {
            addCriterion("enabled >=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThan(Integer value) {
            addCriterion("enabled <", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledLessThanOrEqualTo(Integer value) {
            addCriterion("enabled <=", value, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledIn(List<Integer> values) {
            addCriterion("enabled in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotIn(List<Integer> values) {
            addCriterion("enabled not in", values, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledBetween(Integer value1, Integer value2) {
            addCriterion("enabled between", value1, value2, "enabled");
            return (Criteria) this;
        }

        public Criteria andEnabledNotBetween(Integer value1, Integer value2) {
            addCriterion("enabled not between", value1, value2, "enabled");
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