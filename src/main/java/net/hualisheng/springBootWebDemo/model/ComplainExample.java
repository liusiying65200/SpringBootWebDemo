package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ComplainExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplainExample() {
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

        public Criteria andNumberIsNull() {
            addCriterion("number is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("number is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(String value) {
            addCriterion("number =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(String value) {
            addCriterion("number <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(String value) {
            addCriterion("number >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(String value) {
            addCriterion("number >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(String value) {
            addCriterion("number <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(String value) {
            addCriterion("number <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLike(String value) {
            addCriterion("number like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotLike(String value) {
            addCriterion("number not like", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<String> values) {
            addCriterion("number in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<String> values) {
            addCriterion("number not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(String value1, String value2) {
            addCriterion("number between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(String value1, String value2) {
            addCriterion("number not between", value1, value2, "number");
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

        public Criteria andPlaintiffIsNull() {
            addCriterion("plaintiff is null");
            return (Criteria) this;
        }

        public Criteria andPlaintiffIsNotNull() {
            addCriterion("plaintiff is not null");
            return (Criteria) this;
        }

        public Criteria andPlaintiffEqualTo(String value) {
            addCriterion("plaintiff =", value, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffNotEqualTo(String value) {
            addCriterion("plaintiff <>", value, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffGreaterThan(String value) {
            addCriterion("plaintiff >", value, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffGreaterThanOrEqualTo(String value) {
            addCriterion("plaintiff >=", value, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffLessThan(String value) {
            addCriterion("plaintiff <", value, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffLessThanOrEqualTo(String value) {
            addCriterion("plaintiff <=", value, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffLike(String value) {
            addCriterion("plaintiff like", value, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffNotLike(String value) {
            addCriterion("plaintiff not like", value, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffIn(List<String> values) {
            addCriterion("plaintiff in", values, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffNotIn(List<String> values) {
            addCriterion("plaintiff not in", values, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffBetween(String value1, String value2) {
            addCriterion("plaintiff between", value1, value2, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andPlaintiffNotBetween(String value1, String value2) {
            addCriterion("plaintiff not between", value1, value2, "plaintiff");
            return (Criteria) this;
        }

        public Criteria andDefendantIsNull() {
            addCriterion("defendant is null");
            return (Criteria) this;
        }

        public Criteria andDefendantIsNotNull() {
            addCriterion("defendant is not null");
            return (Criteria) this;
        }

        public Criteria andDefendantEqualTo(String value) {
            addCriterion("defendant =", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantNotEqualTo(String value) {
            addCriterion("defendant <>", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantGreaterThan(String value) {
            addCriterion("defendant >", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantGreaterThanOrEqualTo(String value) {
            addCriterion("defendant >=", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantLessThan(String value) {
            addCriterion("defendant <", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantLessThanOrEqualTo(String value) {
            addCriterion("defendant <=", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantLike(String value) {
            addCriterion("defendant like", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantNotLike(String value) {
            addCriterion("defendant not like", value, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantIn(List<String> values) {
            addCriterion("defendant in", values, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantNotIn(List<String> values) {
            addCriterion("defendant not in", values, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantBetween(String value1, String value2) {
            addCriterion("defendant between", value1, value2, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantNotBetween(String value1, String value2) {
            addCriterion("defendant not between", value1, value2, "defendant");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneIsNull() {
            addCriterion("defendant_phone is null");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneIsNotNull() {
            addCriterion("defendant_phone is not null");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneEqualTo(String value) {
            addCriterion("defendant_phone =", value, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneNotEqualTo(String value) {
            addCriterion("defendant_phone <>", value, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneGreaterThan(String value) {
            addCriterion("defendant_phone >", value, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("defendant_phone >=", value, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneLessThan(String value) {
            addCriterion("defendant_phone <", value, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneLessThanOrEqualTo(String value) {
            addCriterion("defendant_phone <=", value, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneLike(String value) {
            addCriterion("defendant_phone like", value, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneNotLike(String value) {
            addCriterion("defendant_phone not like", value, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneIn(List<String> values) {
            addCriterion("defendant_phone in", values, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneNotIn(List<String> values) {
            addCriterion("defendant_phone not in", values, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneBetween(String value1, String value2) {
            addCriterion("defendant_phone between", value1, value2, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantPhoneNotBetween(String value1, String value2) {
            addCriterion("defendant_phone not between", value1, value2, "defendantPhone");
            return (Criteria) this;
        }

        public Criteria andDefendantIdIsNull() {
            addCriterion("defendant_id is null");
            return (Criteria) this;
        }

        public Criteria andDefendantIdIsNotNull() {
            addCriterion("defendant_id is not null");
            return (Criteria) this;
        }

        public Criteria andDefendantIdEqualTo(Integer value) {
            addCriterion("defendant_id =", value, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdNotEqualTo(Integer value) {
            addCriterion("defendant_id <>", value, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdGreaterThan(Integer value) {
            addCriterion("defendant_id >", value, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("defendant_id >=", value, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdLessThan(Integer value) {
            addCriterion("defendant_id <", value, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdLessThanOrEqualTo(Integer value) {
            addCriterion("defendant_id <=", value, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdIn(List<Integer> values) {
            addCriterion("defendant_id in", values, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdNotIn(List<Integer> values) {
            addCriterion("defendant_id not in", values, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdBetween(Integer value1, Integer value2) {
            addCriterion("defendant_id between", value1, value2, "defendantId");
            return (Criteria) this;
        }

        public Criteria andDefendantIdNotBetween(Integer value1, Integer value2) {
            addCriterion("defendant_id not between", value1, value2, "defendantId");
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

        public Criteria andContentIsNull() {
            addCriterion("content is null");
            return (Criteria) this;
        }

        public Criteria andContentIsNotNull() {
            addCriterion("content is not null");
            return (Criteria) this;
        }

        public Criteria andContentEqualTo(String value) {
            addCriterion("content =", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotEqualTo(String value) {
            addCriterion("content <>", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThan(String value) {
            addCriterion("content >", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentGreaterThanOrEqualTo(String value) {
            addCriterion("content >=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThan(String value) {
            addCriterion("content <", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLessThanOrEqualTo(String value) {
            addCriterion("content <=", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentLike(String value) {
            addCriterion("content like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotLike(String value) {
            addCriterion("content not like", value, "content");
            return (Criteria) this;
        }

        public Criteria andContentIn(List<String> values) {
            addCriterion("content in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotIn(List<String> values) {
            addCriterion("content not in", values, "content");
            return (Criteria) this;
        }

        public Criteria andContentBetween(String value1, String value2) {
            addCriterion("content between", value1, value2, "content");
            return (Criteria) this;
        }

        public Criteria andContentNotBetween(String value1, String value2) {
            addCriterion("content not between", value1, value2, "content");
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

        public Criteria andUpdateAdminIdIsNull() {
            addCriterion("update_admin_id is null");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdIsNotNull() {
            addCriterion("update_admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdEqualTo(Integer value) {
            addCriterion("update_admin_id =", value, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdNotEqualTo(Integer value) {
            addCriterion("update_admin_id <>", value, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdGreaterThan(Integer value) {
            addCriterion("update_admin_id >", value, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("update_admin_id >=", value, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdLessThan(Integer value) {
            addCriterion("update_admin_id <", value, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("update_admin_id <=", value, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdIn(List<Integer> values) {
            addCriterion("update_admin_id in", values, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdNotIn(List<Integer> values) {
            addCriterion("update_admin_id not in", values, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("update_admin_id between", value1, value2, "updateAdminId");
            return (Criteria) this;
        }

        public Criteria andUpdateAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("update_admin_id not between", value1, value2, "updateAdminId");
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