package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AfterSaleHandleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AfterSaleHandleExample() {
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

        public Criteria andAfterBussIdIsNull() {
            addCriterion("after_buss_id is null");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdIsNotNull() {
            addCriterion("after_buss_id is not null");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdEqualTo(Integer value) {
            addCriterion("after_buss_id =", value, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdNotEqualTo(Integer value) {
            addCriterion("after_buss_id <>", value, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdGreaterThan(Integer value) {
            addCriterion("after_buss_id >", value, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("after_buss_id >=", value, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdLessThan(Integer value) {
            addCriterion("after_buss_id <", value, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdLessThanOrEqualTo(Integer value) {
            addCriterion("after_buss_id <=", value, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdIn(List<Integer> values) {
            addCriterion("after_buss_id in", values, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdNotIn(List<Integer> values) {
            addCriterion("after_buss_id not in", values, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdBetween(Integer value1, Integer value2) {
            addCriterion("after_buss_id between", value1, value2, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andAfterBussIdNotBetween(Integer value1, Integer value2) {
            addCriterion("after_buss_id not between", value1, value2, "afterBussId");
            return (Criteria) this;
        }

        public Criteria andIsAgreeIsNull() {
            addCriterion("is_agree is null");
            return (Criteria) this;
        }

        public Criteria andIsAgreeIsNotNull() {
            addCriterion("is_agree is not null");
            return (Criteria) this;
        }

        public Criteria andIsAgreeEqualTo(Integer value) {
            addCriterion("is_agree =", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeNotEqualTo(Integer value) {
            addCriterion("is_agree <>", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeGreaterThan(Integer value) {
            addCriterion("is_agree >", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_agree >=", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeLessThan(Integer value) {
            addCriterion("is_agree <", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeLessThanOrEqualTo(Integer value) {
            addCriterion("is_agree <=", value, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeIn(List<Integer> values) {
            addCriterion("is_agree in", values, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeNotIn(List<Integer> values) {
            addCriterion("is_agree not in", values, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeBetween(Integer value1, Integer value2) {
            addCriterion("is_agree between", value1, value2, "isAgree");
            return (Criteria) this;
        }

        public Criteria andIsAgreeNotBetween(Integer value1, Integer value2) {
            addCriterion("is_agree not between", value1, value2, "isAgree");
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

        public Criteria andOtherTypeIsNull() {
            addCriterion("other_type is null");
            return (Criteria) this;
        }

        public Criteria andOtherTypeIsNotNull() {
            addCriterion("other_type is not null");
            return (Criteria) this;
        }

        public Criteria andOtherTypeEqualTo(String value) {
            addCriterion("other_type =", value, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeNotEqualTo(String value) {
            addCriterion("other_type <>", value, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeGreaterThan(String value) {
            addCriterion("other_type >", value, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeGreaterThanOrEqualTo(String value) {
            addCriterion("other_type >=", value, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeLessThan(String value) {
            addCriterion("other_type <", value, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeLessThanOrEqualTo(String value) {
            addCriterion("other_type <=", value, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeLike(String value) {
            addCriterion("other_type like", value, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeNotLike(String value) {
            addCriterion("other_type not like", value, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeIn(List<String> values) {
            addCriterion("other_type in", values, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeNotIn(List<String> values) {
            addCriterion("other_type not in", values, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeBetween(String value1, String value2) {
            addCriterion("other_type between", value1, value2, "otherType");
            return (Criteria) this;
        }

        public Criteria andOtherTypeNotBetween(String value1, String value2) {
            addCriterion("other_type not between", value1, value2, "otherType");
            return (Criteria) this;
        }

        public Criteria andPayIsNull() {
            addCriterion("pay is null");
            return (Criteria) this;
        }

        public Criteria andPayIsNotNull() {
            addCriterion("pay is not null");
            return (Criteria) this;
        }

        public Criteria andPayEqualTo(Double value) {
            addCriterion("pay =", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotEqualTo(Double value) {
            addCriterion("pay <>", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThan(Double value) {
            addCriterion("pay >", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayGreaterThanOrEqualTo(Double value) {
            addCriterion("pay >=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThan(Double value) {
            addCriterion("pay <", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayLessThanOrEqualTo(Double value) {
            addCriterion("pay <=", value, "pay");
            return (Criteria) this;
        }

        public Criteria andPayIn(List<Double> values) {
            addCriterion("pay in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotIn(List<Double> values) {
            addCriterion("pay not in", values, "pay");
            return (Criteria) this;
        }

        public Criteria andPayBetween(Double value1, Double value2) {
            addCriterion("pay between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andPayNotBetween(Double value1, Double value2) {
            addCriterion("pay not between", value1, value2, "pay");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNull() {
            addCriterion("is_pay is null");
            return (Criteria) this;
        }

        public Criteria andIsPayIsNotNull() {
            addCriterion("is_pay is not null");
            return (Criteria) this;
        }

        public Criteria andIsPayEqualTo(Integer value) {
            addCriterion("is_pay =", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotEqualTo(Integer value) {
            addCriterion("is_pay <>", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThan(Integer value) {
            addCriterion("is_pay >", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_pay >=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThan(Integer value) {
            addCriterion("is_pay <", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayLessThanOrEqualTo(Integer value) {
            addCriterion("is_pay <=", value, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayIn(List<Integer> values) {
            addCriterion("is_pay in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotIn(List<Integer> values) {
            addCriterion("is_pay not in", values, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayBetween(Integer value1, Integer value2) {
            addCriterion("is_pay between", value1, value2, "isPay");
            return (Criteria) this;
        }

        public Criteria andIsPayNotBetween(Integer value1, Integer value2) {
            addCriterion("is_pay not between", value1, value2, "isPay");
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

        public Criteria andCusEvidenceIsNull() {
            addCriterion("cus_evidence is null");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceIsNotNull() {
            addCriterion("cus_evidence is not null");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceEqualTo(String value) {
            addCriterion("cus_evidence =", value, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceNotEqualTo(String value) {
            addCriterion("cus_evidence <>", value, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceGreaterThan(String value) {
            addCriterion("cus_evidence >", value, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceGreaterThanOrEqualTo(String value) {
            addCriterion("cus_evidence >=", value, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceLessThan(String value) {
            addCriterion("cus_evidence <", value, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceLessThanOrEqualTo(String value) {
            addCriterion("cus_evidence <=", value, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceLike(String value) {
            addCriterion("cus_evidence like", value, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceNotLike(String value) {
            addCriterion("cus_evidence not like", value, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceIn(List<String> values) {
            addCriterion("cus_evidence in", values, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceNotIn(List<String> values) {
            addCriterion("cus_evidence not in", values, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceBetween(String value1, String value2) {
            addCriterion("cus_evidence between", value1, value2, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andCusEvidenceNotBetween(String value1, String value2) {
            addCriterion("cus_evidence not between", value1, value2, "cusEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceIsNull() {
            addCriterion("wor_evidence is null");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceIsNotNull() {
            addCriterion("wor_evidence is not null");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceEqualTo(String value) {
            addCriterion("wor_evidence =", value, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceNotEqualTo(String value) {
            addCriterion("wor_evidence <>", value, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceGreaterThan(String value) {
            addCriterion("wor_evidence >", value, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceGreaterThanOrEqualTo(String value) {
            addCriterion("wor_evidence >=", value, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceLessThan(String value) {
            addCriterion("wor_evidence <", value, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceLessThanOrEqualTo(String value) {
            addCriterion("wor_evidence <=", value, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceLike(String value) {
            addCriterion("wor_evidence like", value, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceNotLike(String value) {
            addCriterion("wor_evidence not like", value, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceIn(List<String> values) {
            addCriterion("wor_evidence in", values, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceNotIn(List<String> values) {
            addCriterion("wor_evidence not in", values, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceBetween(String value1, String value2) {
            addCriterion("wor_evidence between", value1, value2, "worEvidence");
            return (Criteria) this;
        }

        public Criteria andWorEvidenceNotBetween(String value1, String value2) {
            addCriterion("wor_evidence not between", value1, value2, "worEvidence");
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

        public Criteria andSignImgsIsNull() {
            addCriterion("sign_imgs is null");
            return (Criteria) this;
        }

        public Criteria andSignImgsIsNotNull() {
            addCriterion("sign_imgs is not null");
            return (Criteria) this;
        }

        public Criteria andSignImgsEqualTo(String value) {
            addCriterion("sign_imgs =", value, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsNotEqualTo(String value) {
            addCriterion("sign_imgs <>", value, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsGreaterThan(String value) {
            addCriterion("sign_imgs >", value, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsGreaterThanOrEqualTo(String value) {
            addCriterion("sign_imgs >=", value, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsLessThan(String value) {
            addCriterion("sign_imgs <", value, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsLessThanOrEqualTo(String value) {
            addCriterion("sign_imgs <=", value, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsLike(String value) {
            addCriterion("sign_imgs like", value, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsNotLike(String value) {
            addCriterion("sign_imgs not like", value, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsIn(List<String> values) {
            addCriterion("sign_imgs in", values, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsNotIn(List<String> values) {
            addCriterion("sign_imgs not in", values, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsBetween(String value1, String value2) {
            addCriterion("sign_imgs between", value1, value2, "signImgs");
            return (Criteria) this;
        }

        public Criteria andSignImgsNotBetween(String value1, String value2) {
            addCriterion("sign_imgs not between", value1, value2, "signImgs");
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