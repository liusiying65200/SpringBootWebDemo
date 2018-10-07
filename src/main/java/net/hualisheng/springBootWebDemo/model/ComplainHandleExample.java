package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplainHandleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainHandleExample() {
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

        public Criteria andComplainIdIsNull() {
            addCriterion("complain_id is null");
            return (Criteria) this;
        }

        public Criteria andComplainIdIsNotNull() {
            addCriterion("complain_id is not null");
            return (Criteria) this;
        }

        public Criteria andComplainIdEqualTo(Integer value) {
            addCriterion("complain_id =", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotEqualTo(Integer value) {
            addCriterion("complain_id <>", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThan(Integer value) {
            addCriterion("complain_id >", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("complain_id >=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThan(Integer value) {
            addCriterion("complain_id <", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdLessThanOrEqualTo(Integer value) {
            addCriterion("complain_id <=", value, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdIn(List<Integer> values) {
            addCriterion("complain_id in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotIn(List<Integer> values) {
            addCriterion("complain_id not in", values, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdBetween(Integer value1, Integer value2) {
            addCriterion("complain_id between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andComplainIdNotBetween(Integer value1, Integer value2) {
            addCriterion("complain_id not between", value1, value2, "complainId");
            return (Criteria) this;
        }

        public Criteria andIsFoundIsNull() {
            addCriterion("is_found is null");
            return (Criteria) this;
        }

        public Criteria andIsFoundIsNotNull() {
            addCriterion("is_found is not null");
            return (Criteria) this;
        }

        public Criteria andIsFoundEqualTo(Integer value) {
            addCriterion("is_found =", value, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundNotEqualTo(Integer value) {
            addCriterion("is_found <>", value, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundGreaterThan(Integer value) {
            addCriterion("is_found >", value, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_found >=", value, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundLessThan(Integer value) {
            addCriterion("is_found <", value, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundLessThanOrEqualTo(Integer value) {
            addCriterion("is_found <=", value, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundIn(List<Integer> values) {
            addCriterion("is_found in", values, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundNotIn(List<Integer> values) {
            addCriterion("is_found not in", values, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundBetween(Integer value1, Integer value2) {
            addCriterion("is_found between", value1, value2, "isFound");
            return (Criteria) this;
        }

        public Criteria andIsFoundNotBetween(Integer value1, Integer value2) {
            addCriterion("is_found not between", value1, value2, "isFound");
            return (Criteria) this;
        }

        public Criteria andLevelIsNull() {
            addCriterion("level is null");
            return (Criteria) this;
        }

        public Criteria andLevelIsNotNull() {
            addCriterion("level is not null");
            return (Criteria) this;
        }

        public Criteria andLevelEqualTo(Integer value) {
            addCriterion("level =", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotEqualTo(Integer value) {
            addCriterion("level <>", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThan(Integer value) {
            addCriterion("level >", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("level >=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThan(Integer value) {
            addCriterion("level <", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelLessThanOrEqualTo(Integer value) {
            addCriterion("level <=", value, "level");
            return (Criteria) this;
        }

        public Criteria andLevelIn(List<Integer> values) {
            addCriterion("level in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotIn(List<Integer> values) {
            addCriterion("level not in", values, "level");
            return (Criteria) this;
        }

        public Criteria andLevelBetween(Integer value1, Integer value2) {
            addCriterion("level between", value1, value2, "level");
            return (Criteria) this;
        }

        public Criteria andLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("level not between", value1, value2, "level");
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

        public Criteria andDeductGrouthIsNull() {
            addCriterion("deduct_grouth is null");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthIsNotNull() {
            addCriterion("deduct_grouth is not null");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthEqualTo(Integer value) {
            addCriterion("deduct_grouth =", value, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthNotEqualTo(Integer value) {
            addCriterion("deduct_grouth <>", value, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthGreaterThan(Integer value) {
            addCriterion("deduct_grouth >", value, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthGreaterThanOrEqualTo(Integer value) {
            addCriterion("deduct_grouth >=", value, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthLessThan(Integer value) {
            addCriterion("deduct_grouth <", value, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthLessThanOrEqualTo(Integer value) {
            addCriterion("deduct_grouth <=", value, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthIn(List<Integer> values) {
            addCriterion("deduct_grouth in", values, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthNotIn(List<Integer> values) {
            addCriterion("deduct_grouth not in", values, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthBetween(Integer value1, Integer value2) {
            addCriterion("deduct_grouth between", value1, value2, "deductGrouth");
            return (Criteria) this;
        }

        public Criteria andDeductGrouthNotBetween(Integer value1, Integer value2) {
            addCriterion("deduct_grouth not between", value1, value2, "deductGrouth");
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

        public Criteria andCompensateIsNull() {
            addCriterion("compensate is null");
            return (Criteria) this;
        }

        public Criteria andCompensateIsNotNull() {
            addCriterion("compensate is not null");
            return (Criteria) this;
        }

        public Criteria andCompensateEqualTo(Integer value) {
            addCriterion("compensate =", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateNotEqualTo(Integer value) {
            addCriterion("compensate <>", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateGreaterThan(Integer value) {
            addCriterion("compensate >", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateGreaterThanOrEqualTo(Integer value) {
            addCriterion("compensate >=", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateLessThan(Integer value) {
            addCriterion("compensate <", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateLessThanOrEqualTo(Integer value) {
            addCriterion("compensate <=", value, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateIn(List<Integer> values) {
            addCriterion("compensate in", values, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateNotIn(List<Integer> values) {
            addCriterion("compensate not in", values, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateBetween(Integer value1, Integer value2) {
            addCriterion("compensate between", value1, value2, "compensate");
            return (Criteria) this;
        }

        public Criteria andCompensateNotBetween(Integer value1, Integer value2) {
            addCriterion("compensate not between", value1, value2, "compensate");
            return (Criteria) this;
        }

        public Criteria andCashVoucherIsNull() {
            addCriterion("cash_voucher is null");
            return (Criteria) this;
        }

        public Criteria andCashVoucherIsNotNull() {
            addCriterion("cash_voucher is not null");
            return (Criteria) this;
        }

        public Criteria andCashVoucherEqualTo(Integer value) {
            addCriterion("cash_voucher =", value, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherNotEqualTo(Integer value) {
            addCriterion("cash_voucher <>", value, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherGreaterThan(Integer value) {
            addCriterion("cash_voucher >", value, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash_voucher >=", value, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherLessThan(Integer value) {
            addCriterion("cash_voucher <", value, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherLessThanOrEqualTo(Integer value) {
            addCriterion("cash_voucher <=", value, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherIn(List<Integer> values) {
            addCriterion("cash_voucher in", values, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherNotIn(List<Integer> values) {
            addCriterion("cash_voucher not in", values, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherBetween(Integer value1, Integer value2) {
            addCriterion("cash_voucher between", value1, value2, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andCashVoucherNotBetween(Integer value1, Integer value2) {
            addCriterion("cash_voucher not between", value1, value2, "cashVoucher");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNull() {
            addCriterion("integral is null");
            return (Criteria) this;
        }

        public Criteria andIntegralIsNotNull() {
            addCriterion("integral is not null");
            return (Criteria) this;
        }

        public Criteria andIntegralEqualTo(Integer value) {
            addCriterion("integral =", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotEqualTo(Integer value) {
            addCriterion("integral <>", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThan(Integer value) {
            addCriterion("integral >", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralGreaterThanOrEqualTo(Integer value) {
            addCriterion("integral >=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThan(Integer value) {
            addCriterion("integral <", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralLessThanOrEqualTo(Integer value) {
            addCriterion("integral <=", value, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralIn(List<Integer> values) {
            addCriterion("integral in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotIn(List<Integer> values) {
            addCriterion("integral not in", values, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralBetween(Integer value1, Integer value2) {
            addCriterion("integral between", value1, value2, "integral");
            return (Criteria) this;
        }

        public Criteria andIntegralNotBetween(Integer value1, Integer value2) {
            addCriterion("integral not between", value1, value2, "integral");
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

        public Criteria andLeaderCommentIsNull() {
            addCriterion("leader_comment is null");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentIsNotNull() {
            addCriterion("leader_comment is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentEqualTo(String value) {
            addCriterion("leader_comment =", value, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentNotEqualTo(String value) {
            addCriterion("leader_comment <>", value, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentGreaterThan(String value) {
            addCriterion("leader_comment >", value, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentGreaterThanOrEqualTo(String value) {
            addCriterion("leader_comment >=", value, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentLessThan(String value) {
            addCriterion("leader_comment <", value, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentLessThanOrEqualTo(String value) {
            addCriterion("leader_comment <=", value, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentLike(String value) {
            addCriterion("leader_comment like", value, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentNotLike(String value) {
            addCriterion("leader_comment not like", value, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentIn(List<String> values) {
            addCriterion("leader_comment in", values, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentNotIn(List<String> values) {
            addCriterion("leader_comment not in", values, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentBetween(String value1, String value2) {
            addCriterion("leader_comment between", value1, value2, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCommentNotBetween(String value1, String value2) {
            addCriterion("leader_comment not between", value1, value2, "leaderComment");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckIsNull() {
            addCriterion("leader_check is null");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckIsNotNull() {
            addCriterion("leader_check is not null");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckEqualTo(Integer value) {
            addCriterion("leader_check =", value, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckNotEqualTo(Integer value) {
            addCriterion("leader_check <>", value, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckGreaterThan(Integer value) {
            addCriterion("leader_check >", value, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckGreaterThanOrEqualTo(Integer value) {
            addCriterion("leader_check >=", value, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckLessThan(Integer value) {
            addCriterion("leader_check <", value, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckLessThanOrEqualTo(Integer value) {
            addCriterion("leader_check <=", value, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckIn(List<Integer> values) {
            addCriterion("leader_check in", values, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckNotIn(List<Integer> values) {
            addCriterion("leader_check not in", values, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckBetween(Integer value1, Integer value2) {
            addCriterion("leader_check between", value1, value2, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andLeaderCheckNotBetween(Integer value1, Integer value2) {
            addCriterion("leader_check not between", value1, value2, "leaderCheck");
            return (Criteria) this;
        }

        public Criteria andIsModificationIsNull() {
            addCriterion("is_modification is null");
            return (Criteria) this;
        }

        public Criteria andIsModificationIsNotNull() {
            addCriterion("is_modification is not null");
            return (Criteria) this;
        }

        public Criteria andIsModificationEqualTo(Integer value) {
            addCriterion("is_modification =", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationNotEqualTo(Integer value) {
            addCriterion("is_modification <>", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationGreaterThan(Integer value) {
            addCriterion("is_modification >", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_modification >=", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationLessThan(Integer value) {
            addCriterion("is_modification <", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationLessThanOrEqualTo(Integer value) {
            addCriterion("is_modification <=", value, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationIn(List<Integer> values) {
            addCriterion("is_modification in", values, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationNotIn(List<Integer> values) {
            addCriterion("is_modification not in", values, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationBetween(Integer value1, Integer value2) {
            addCriterion("is_modification between", value1, value2, "isModification");
            return (Criteria) this;
        }

        public Criteria andIsModificationNotBetween(Integer value1, Integer value2) {
            addCriterion("is_modification not between", value1, value2, "isModification");
            return (Criteria) this;
        }

        public Criteria andDeductDepositIsNull() {
            addCriterion("deduct_deposit is null");
            return (Criteria) this;
        }

        public Criteria andDeductDepositIsNotNull() {
            addCriterion("deduct_deposit is not null");
            return (Criteria) this;
        }

        public Criteria andDeductDepositEqualTo(Double value) {
            addCriterion("deduct_deposit =", value, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositNotEqualTo(Double value) {
            addCriterion("deduct_deposit <>", value, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositGreaterThan(Double value) {
            addCriterion("deduct_deposit >", value, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositGreaterThanOrEqualTo(Double value) {
            addCriterion("deduct_deposit >=", value, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositLessThan(Double value) {
            addCriterion("deduct_deposit <", value, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositLessThanOrEqualTo(Double value) {
            addCriterion("deduct_deposit <=", value, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositIn(List<Double> values) {
            addCriterion("deduct_deposit in", values, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositNotIn(List<Double> values) {
            addCriterion("deduct_deposit not in", values, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositBetween(Double value1, Double value2) {
            addCriterion("deduct_deposit between", value1, value2, "deductDeposit");
            return (Criteria) this;
        }

        public Criteria andDeductDepositNotBetween(Double value1, Double value2) {
            addCriterion("deduct_deposit not between", value1, value2, "deductDeposit");
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