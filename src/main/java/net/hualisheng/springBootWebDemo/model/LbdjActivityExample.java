package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class LbdjActivityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LbdjActivityExample() {
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

        public Criteria andCodeIsNull() {
            addCriterion("code is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("code is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("code =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("code <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("code >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("code >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("code <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("code <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("code like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("code not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("code in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("code not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("code between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("code not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andActObjectIsNull() {
            addCriterion("act_object is null");
            return (Criteria) this;
        }

        public Criteria andActObjectIsNotNull() {
            addCriterion("act_object is not null");
            return (Criteria) this;
        }

        public Criteria andActObjectEqualTo(Integer value) {
            addCriterion("act_object =", value, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectNotEqualTo(Integer value) {
            addCriterion("act_object <>", value, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectGreaterThan(Integer value) {
            addCriterion("act_object >", value, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_object >=", value, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectLessThan(Integer value) {
            addCriterion("act_object <", value, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectLessThanOrEqualTo(Integer value) {
            addCriterion("act_object <=", value, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectIn(List<Integer> values) {
            addCriterion("act_object in", values, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectNotIn(List<Integer> values) {
            addCriterion("act_object not in", values, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectBetween(Integer value1, Integer value2) {
            addCriterion("act_object between", value1, value2, "actObject");
            return (Criteria) this;
        }

        public Criteria andActObjectNotBetween(Integer value1, Integer value2) {
            addCriterion("act_object not between", value1, value2, "actObject");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNull() {
            addCriterion("act_type is null");
            return (Criteria) this;
        }

        public Criteria andActTypeIsNotNull() {
            addCriterion("act_type is not null");
            return (Criteria) this;
        }

        public Criteria andActTypeEqualTo(Byte value) {
            addCriterion("act_type =", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotEqualTo(Byte value) {
            addCriterion("act_type <>", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThan(Byte value) {
            addCriterion("act_type >", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("act_type >=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThan(Byte value) {
            addCriterion("act_type <", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeLessThanOrEqualTo(Byte value) {
            addCriterion("act_type <=", value, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeIn(List<Byte> values) {
            addCriterion("act_type in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotIn(List<Byte> values) {
            addCriterion("act_type not in", values, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeBetween(Byte value1, Byte value2) {
            addCriterion("act_type between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andActTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("act_type not between", value1, value2, "actType");
            return (Criteria) this;
        }

        public Criteria andActRuleIsNull() {
            addCriterion("act_rule is null");
            return (Criteria) this;
        }

        public Criteria andActRuleIsNotNull() {
            addCriterion("act_rule is not null");
            return (Criteria) this;
        }

        public Criteria andActRuleEqualTo(String value) {
            addCriterion("act_rule =", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleNotEqualTo(String value) {
            addCriterion("act_rule <>", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleGreaterThan(String value) {
            addCriterion("act_rule >", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleGreaterThanOrEqualTo(String value) {
            addCriterion("act_rule >=", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleLessThan(String value) {
            addCriterion("act_rule <", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleLessThanOrEqualTo(String value) {
            addCriterion("act_rule <=", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleLike(String value) {
            addCriterion("act_rule like", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleNotLike(String value) {
            addCriterion("act_rule not like", value, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleIn(List<String> values) {
            addCriterion("act_rule in", values, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleNotIn(List<String> values) {
            addCriterion("act_rule not in", values, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleBetween(String value1, String value2) {
            addCriterion("act_rule between", value1, value2, "actRule");
            return (Criteria) this;
        }

        public Criteria andActRuleNotBetween(String value1, String value2) {
            addCriterion("act_rule not between", value1, value2, "actRule");
            return (Criteria) this;
        }

        public Criteria andActNameIsNull() {
            addCriterion("act_name is null");
            return (Criteria) this;
        }

        public Criteria andActNameIsNotNull() {
            addCriterion("act_name is not null");
            return (Criteria) this;
        }

        public Criteria andActNameEqualTo(String value) {
            addCriterion("act_name =", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotEqualTo(String value) {
            addCriterion("act_name <>", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThan(String value) {
            addCriterion("act_name >", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameGreaterThanOrEqualTo(String value) {
            addCriterion("act_name >=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThan(String value) {
            addCriterion("act_name <", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLessThanOrEqualTo(String value) {
            addCriterion("act_name <=", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameLike(String value) {
            addCriterion("act_name like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotLike(String value) {
            addCriterion("act_name not like", value, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameIn(List<String> values) {
            addCriterion("act_name in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotIn(List<String> values) {
            addCriterion("act_name not in", values, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameBetween(String value1, String value2) {
            addCriterion("act_name between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActNameNotBetween(String value1, String value2) {
            addCriterion("act_name not between", value1, value2, "actName");
            return (Criteria) this;
        }

        public Criteria andActIntroIsNull() {
            addCriterion("act_intro is null");
            return (Criteria) this;
        }

        public Criteria andActIntroIsNotNull() {
            addCriterion("act_intro is not null");
            return (Criteria) this;
        }

        public Criteria andActIntroEqualTo(String value) {
            addCriterion("act_intro =", value, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroNotEqualTo(String value) {
            addCriterion("act_intro <>", value, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroGreaterThan(String value) {
            addCriterion("act_intro >", value, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroGreaterThanOrEqualTo(String value) {
            addCriterion("act_intro >=", value, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroLessThan(String value) {
            addCriterion("act_intro <", value, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroLessThanOrEqualTo(String value) {
            addCriterion("act_intro <=", value, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroLike(String value) {
            addCriterion("act_intro like", value, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroNotLike(String value) {
            addCriterion("act_intro not like", value, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroIn(List<String> values) {
            addCriterion("act_intro in", values, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroNotIn(List<String> values) {
            addCriterion("act_intro not in", values, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroBetween(String value1, String value2) {
            addCriterion("act_intro between", value1, value2, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActIntroNotBetween(String value1, String value2) {
            addCriterion("act_intro not between", value1, value2, "actIntro");
            return (Criteria) this;
        }

        public Criteria andActImgIsNull() {
            addCriterion("act_img is null");
            return (Criteria) this;
        }

        public Criteria andActImgIsNotNull() {
            addCriterion("act_img is not null");
            return (Criteria) this;
        }

        public Criteria andActImgEqualTo(String value) {
            addCriterion("act_img =", value, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgNotEqualTo(String value) {
            addCriterion("act_img <>", value, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgGreaterThan(String value) {
            addCriterion("act_img >", value, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgGreaterThanOrEqualTo(String value) {
            addCriterion("act_img >=", value, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgLessThan(String value) {
            addCriterion("act_img <", value, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgLessThanOrEqualTo(String value) {
            addCriterion("act_img <=", value, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgLike(String value) {
            addCriterion("act_img like", value, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgNotLike(String value) {
            addCriterion("act_img not like", value, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgIn(List<String> values) {
            addCriterion("act_img in", values, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgNotIn(List<String> values) {
            addCriterion("act_img not in", values, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgBetween(String value1, String value2) {
            addCriterion("act_img between", value1, value2, "actImg");
            return (Criteria) this;
        }

        public Criteria andActImgNotBetween(String value1, String value2) {
            addCriterion("act_img not between", value1, value2, "actImg");
            return (Criteria) this;
        }

        public Criteria andActHrefIsNull() {
            addCriterion("act_href is null");
            return (Criteria) this;
        }

        public Criteria andActHrefIsNotNull() {
            addCriterion("act_href is not null");
            return (Criteria) this;
        }

        public Criteria andActHrefEqualTo(String value) {
            addCriterion("act_href =", value, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefNotEqualTo(String value) {
            addCriterion("act_href <>", value, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefGreaterThan(String value) {
            addCriterion("act_href >", value, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefGreaterThanOrEqualTo(String value) {
            addCriterion("act_href >=", value, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefLessThan(String value) {
            addCriterion("act_href <", value, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefLessThanOrEqualTo(String value) {
            addCriterion("act_href <=", value, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefLike(String value) {
            addCriterion("act_href like", value, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefNotLike(String value) {
            addCriterion("act_href not like", value, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefIn(List<String> values) {
            addCriterion("act_href in", values, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefNotIn(List<String> values) {
            addCriterion("act_href not in", values, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefBetween(String value1, String value2) {
            addCriterion("act_href between", value1, value2, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefNotBetween(String value1, String value2) {
            addCriterion("act_href not between", value1, value2, "actHref");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeIsNull() {
            addCriterion("act_href_type is null");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeIsNotNull() {
            addCriterion("act_href_type is not null");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeEqualTo(Integer value) {
            addCriterion("act_href_type =", value, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeNotEqualTo(Integer value) {
            addCriterion("act_href_type <>", value, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeGreaterThan(Integer value) {
            addCriterion("act_href_type >", value, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("act_href_type >=", value, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeLessThan(Integer value) {
            addCriterion("act_href_type <", value, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeLessThanOrEqualTo(Integer value) {
            addCriterion("act_href_type <=", value, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeIn(List<Integer> values) {
            addCriterion("act_href_type in", values, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeNotIn(List<Integer> values) {
            addCriterion("act_href_type not in", values, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeBetween(Integer value1, Integer value2) {
            addCriterion("act_href_type between", value1, value2, "actHrefType");
            return (Criteria) this;
        }

        public Criteria andActHrefTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("act_href_type not between", value1, value2, "actHrefType");
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

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNull() {
            addCriterion("start_time is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeIsNotNull() {
            addCriterion("start_time is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeEqualTo(Date value) {
            addCriterion("start_time =", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotEqualTo(Date value) {
            addCriterion("start_time <>", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThan(Date value) {
            addCriterion("start_time >", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("start_time >=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThan(Date value) {
            addCriterion("start_time <", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeLessThanOrEqualTo(Date value) {
            addCriterion("start_time <=", value, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeIn(List<Date> values) {
            addCriterion("start_time in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotIn(List<Date> values) {
            addCriterion("start_time not in", values, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeBetween(Date value1, Date value2) {
            addCriterion("start_time between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeNotBetween(Date value1, Date value2) {
            addCriterion("start_time not between", value1, value2, "startTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Date value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Date value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Date value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Date> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
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

        public Criteria andChangeTimeIsNull() {
            addCriterion("change_time is null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIsNotNull() {
            addCriterion("change_time is not null");
            return (Criteria) this;
        }

        public Criteria andChangeTimeEqualTo(Date value) {
            addCriterion("change_time =", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotEqualTo(Date value) {
            addCriterion("change_time <>", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThan(Date value) {
            addCriterion("change_time >", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("change_time >=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThan(Date value) {
            addCriterion("change_time <", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeLessThanOrEqualTo(Date value) {
            addCriterion("change_time <=", value, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeIn(List<Date> values) {
            addCriterion("change_time in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotIn(List<Date> values) {
            addCriterion("change_time not in", values, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeBetween(Date value1, Date value2) {
            addCriterion("change_time between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeTimeNotBetween(Date value1, Date value2) {
            addCriterion("change_time not between", value1, value2, "changeTime");
            return (Criteria) this;
        }

        public Criteria andChangeUserIsNull() {
            addCriterion("change_user is null");
            return (Criteria) this;
        }

        public Criteria andChangeUserIsNotNull() {
            addCriterion("change_user is not null");
            return (Criteria) this;
        }

        public Criteria andChangeUserEqualTo(Integer value) {
            addCriterion("change_user =", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserNotEqualTo(Integer value) {
            addCriterion("change_user <>", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserGreaterThan(Integer value) {
            addCriterion("change_user >", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("change_user >=", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserLessThan(Integer value) {
            addCriterion("change_user <", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserLessThanOrEqualTo(Integer value) {
            addCriterion("change_user <=", value, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserIn(List<Integer> values) {
            addCriterion("change_user in", values, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserNotIn(List<Integer> values) {
            addCriterion("change_user not in", values, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserBetween(Integer value1, Integer value2) {
            addCriterion("change_user between", value1, value2, "changeUser");
            return (Criteria) this;
        }

        public Criteria andChangeUserNotBetween(Integer value1, Integer value2) {
            addCriterion("change_user not between", value1, value2, "changeUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNull() {
            addCriterion("create_user is null");
            return (Criteria) this;
        }

        public Criteria andCreateUserIsNotNull() {
            addCriterion("create_user is not null");
            return (Criteria) this;
        }

        public Criteria andCreateUserEqualTo(Integer value) {
            addCriterion("create_user =", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotEqualTo(Integer value) {
            addCriterion("create_user <>", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThan(Integer value) {
            addCriterion("create_user >", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserGreaterThanOrEqualTo(Integer value) {
            addCriterion("create_user >=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThan(Integer value) {
            addCriterion("create_user <", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserLessThanOrEqualTo(Integer value) {
            addCriterion("create_user <=", value, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserIn(List<Integer> values) {
            addCriterion("create_user in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotIn(List<Integer> values) {
            addCriterion("create_user not in", values, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserBetween(Integer value1, Integer value2) {
            addCriterion("create_user between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andCreateUserNotBetween(Integer value1, Integer value2) {
            addCriterion("create_user not between", value1, value2, "createUser");
            return (Criteria) this;
        }

        public Criteria andTopIsNull() {
            addCriterion("top is null");
            return (Criteria) this;
        }

        public Criteria andTopIsNotNull() {
            addCriterion("top is not null");
            return (Criteria) this;
        }

        public Criteria andTopEqualTo(Integer value) {
            addCriterion("top =", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotEqualTo(Integer value) {
            addCriterion("top <>", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThan(Integer value) {
            addCriterion("top >", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopGreaterThanOrEqualTo(Integer value) {
            addCriterion("top >=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThan(Integer value) {
            addCriterion("top <", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopLessThanOrEqualTo(Integer value) {
            addCriterion("top <=", value, "top");
            return (Criteria) this;
        }

        public Criteria andTopIn(List<Integer> values) {
            addCriterion("top in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotIn(List<Integer> values) {
            addCriterion("top not in", values, "top");
            return (Criteria) this;
        }

        public Criteria andTopBetween(Integer value1, Integer value2) {
            addCriterion("top between", value1, value2, "top");
            return (Criteria) this;
        }

        public Criteria andTopNotBetween(Integer value1, Integer value2) {
            addCriterion("top not between", value1, value2, "top");
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