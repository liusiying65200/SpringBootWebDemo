package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class EmpExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EmpExample() {
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

        public Criteria andCompanyNameIsNull() {
            addCriterion("company_name is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("company_name is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("company_name =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("company_name <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("company_name >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("company_name >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("company_name <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("company_name <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("company_name like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("company_name not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("company_name in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("company_name not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("company_name between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("company_name not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNull() {
            addCriterion("company_tel is null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIsNotNull() {
            addCriterion("company_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyTelEqualTo(String value) {
            addCriterion("company_tel =", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotEqualTo(String value) {
            addCriterion("company_tel <>", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThan(String value) {
            addCriterion("company_tel >", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelGreaterThanOrEqualTo(String value) {
            addCriterion("company_tel >=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThan(String value) {
            addCriterion("company_tel <", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLessThanOrEqualTo(String value) {
            addCriterion("company_tel <=", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelLike(String value) {
            addCriterion("company_tel like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotLike(String value) {
            addCriterion("company_tel not like", value, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelIn(List<String> values) {
            addCriterion("company_tel in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotIn(List<String> values) {
            addCriterion("company_tel not in", values, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelBetween(String value1, String value2) {
            addCriterion("company_tel between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyTelNotBetween(String value1, String value2) {
            addCriterion("company_tel not between", value1, value2, "companyTel");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNull() {
            addCriterion("company_website is null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIsNotNull() {
            addCriterion("company_website is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteEqualTo(String value) {
            addCriterion("company_website =", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotEqualTo(String value) {
            addCriterion("company_website <>", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThan(String value) {
            addCriterion("company_website >", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteGreaterThanOrEqualTo(String value) {
            addCriterion("company_website >=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThan(String value) {
            addCriterion("company_website <", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLessThanOrEqualTo(String value) {
            addCriterion("company_website <=", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteLike(String value) {
            addCriterion("company_website like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotLike(String value) {
            addCriterion("company_website not like", value, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteIn(List<String> values) {
            addCriterion("company_website in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotIn(List<String> values) {
            addCriterion("company_website not in", values, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteBetween(String value1, String value2) {
            addCriterion("company_website between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyWebsiteNotBetween(String value1, String value2) {
            addCriterion("company_website not between", value1, value2, "companyWebsite");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIsNull() {
            addCriterion("company_mail is null");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIsNotNull() {
            addCriterion("company_mail is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyMailEqualTo(String value) {
            addCriterion("company_mail =", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotEqualTo(String value) {
            addCriterion("company_mail <>", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailGreaterThan(String value) {
            addCriterion("company_mail >", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailGreaterThanOrEqualTo(String value) {
            addCriterion("company_mail >=", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLessThan(String value) {
            addCriterion("company_mail <", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLessThanOrEqualTo(String value) {
            addCriterion("company_mail <=", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailLike(String value) {
            addCriterion("company_mail like", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotLike(String value) {
            addCriterion("company_mail not like", value, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailIn(List<String> values) {
            addCriterion("company_mail in", values, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotIn(List<String> values) {
            addCriterion("company_mail not in", values, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailBetween(String value1, String value2) {
            addCriterion("company_mail between", value1, value2, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyMailNotBetween(String value1, String value2) {
            addCriterion("company_mail not between", value1, value2, "companyMail");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeIsNull() {
            addCriterion("company_account_type is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeIsNotNull() {
            addCriterion("company_account_type is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeEqualTo(String value) {
            addCriterion("company_account_type =", value, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeNotEqualTo(String value) {
            addCriterion("company_account_type <>", value, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeGreaterThan(String value) {
            addCriterion("company_account_type >", value, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("company_account_type >=", value, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeLessThan(String value) {
            addCriterion("company_account_type <", value, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeLessThanOrEqualTo(String value) {
            addCriterion("company_account_type <=", value, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeLike(String value) {
            addCriterion("company_account_type like", value, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeNotLike(String value) {
            addCriterion("company_account_type not like", value, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeIn(List<String> values) {
            addCriterion("company_account_type in", values, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeNotIn(List<String> values) {
            addCriterion("company_account_type not in", values, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeBetween(String value1, String value2) {
            addCriterion("company_account_type between", value1, value2, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountTypeNotBetween(String value1, String value2) {
            addCriterion("company_account_type not between", value1, value2, "companyAccountType");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberIsNull() {
            addCriterion("company_account_number is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberIsNotNull() {
            addCriterion("company_account_number is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberEqualTo(String value) {
            addCriterion("company_account_number =", value, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberNotEqualTo(String value) {
            addCriterion("company_account_number <>", value, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberGreaterThan(String value) {
            addCriterion("company_account_number >", value, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberGreaterThanOrEqualTo(String value) {
            addCriterion("company_account_number >=", value, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberLessThan(String value) {
            addCriterion("company_account_number <", value, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberLessThanOrEqualTo(String value) {
            addCriterion("company_account_number <=", value, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberLike(String value) {
            addCriterion("company_account_number like", value, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberNotLike(String value) {
            addCriterion("company_account_number not like", value, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberIn(List<String> values) {
            addCriterion("company_account_number in", values, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberNotIn(List<String> values) {
            addCriterion("company_account_number not in", values, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberBetween(String value1, String value2) {
            addCriterion("company_account_number between", value1, value2, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andCompanyAccountNumberNotBetween(String value1, String value2) {
            addCriterion("company_account_number not between", value1, value2, "companyAccountNumber");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNull() {
            addCriterion("legal_person is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIsNotNull() {
            addCriterion("legal_person is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonEqualTo(String value) {
            addCriterion("legal_person =", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotEqualTo(String value) {
            addCriterion("legal_person <>", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThan(String value) {
            addCriterion("legal_person >", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person >=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThan(String value) {
            addCriterion("legal_person <", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLessThanOrEqualTo(String value) {
            addCriterion("legal_person <=", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonLike(String value) {
            addCriterion("legal_person like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotLike(String value) {
            addCriterion("legal_person not like", value, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonIn(List<String> values) {
            addCriterion("legal_person in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotIn(List<String> values) {
            addCriterion("legal_person not in", values, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonBetween(String value1, String value2) {
            addCriterion("legal_person between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonNotBetween(String value1, String value2) {
            addCriterion("legal_person not between", value1, value2, "legalPerson");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIsNull() {
            addCriterion("legal_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIsNotNull() {
            addCriterion("legal_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneEqualTo(String value) {
            addCriterion("legal_person_phone =", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotEqualTo(String value) {
            addCriterion("legal_person_phone <>", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneGreaterThan(String value) {
            addCriterion("legal_person_phone >", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("legal_person_phone >=", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLessThan(String value) {
            addCriterion("legal_person_phone <", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("legal_person_phone <=", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneLike(String value) {
            addCriterion("legal_person_phone like", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotLike(String value) {
            addCriterion("legal_person_phone not like", value, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneIn(List<String> values) {
            addCriterion("legal_person_phone in", values, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotIn(List<String> values) {
            addCriterion("legal_person_phone not in", values, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneBetween(String value1, String value2) {
            addCriterion("legal_person_phone between", value1, value2, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andLegalPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("legal_person_phone not between", value1, value2, "legalPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactsIsNull() {
            addCriterion("contacts is null");
            return (Criteria) this;
        }

        public Criteria andContactsIsNotNull() {
            addCriterion("contacts is not null");
            return (Criteria) this;
        }

        public Criteria andContactsEqualTo(String value) {
            addCriterion("contacts =", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotEqualTo(String value) {
            addCriterion("contacts <>", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThan(String value) {
            addCriterion("contacts >", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsGreaterThanOrEqualTo(String value) {
            addCriterion("contacts >=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThan(String value) {
            addCriterion("contacts <", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLessThanOrEqualTo(String value) {
            addCriterion("contacts <=", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsLike(String value) {
            addCriterion("contacts like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotLike(String value) {
            addCriterion("contacts not like", value, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsIn(List<String> values) {
            addCriterion("contacts in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotIn(List<String> values) {
            addCriterion("contacts not in", values, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsBetween(String value1, String value2) {
            addCriterion("contacts between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsNotBetween(String value1, String value2) {
            addCriterion("contacts not between", value1, value2, "contacts");
            return (Criteria) this;
        }

        public Criteria andContactsTelIsNull() {
            addCriterion("contacts_tel is null");
            return (Criteria) this;
        }

        public Criteria andContactsTelIsNotNull() {
            addCriterion("contacts_tel is not null");
            return (Criteria) this;
        }

        public Criteria andContactsTelEqualTo(String value) {
            addCriterion("contacts_tel =", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelNotEqualTo(String value) {
            addCriterion("contacts_tel <>", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelGreaterThan(String value) {
            addCriterion("contacts_tel >", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_tel >=", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelLessThan(String value) {
            addCriterion("contacts_tel <", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelLessThanOrEqualTo(String value) {
            addCriterion("contacts_tel <=", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelLike(String value) {
            addCriterion("contacts_tel like", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelNotLike(String value) {
            addCriterion("contacts_tel not like", value, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelIn(List<String> values) {
            addCriterion("contacts_tel in", values, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelNotIn(List<String> values) {
            addCriterion("contacts_tel not in", values, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelBetween(String value1, String value2) {
            addCriterion("contacts_tel between", value1, value2, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsTelNotBetween(String value1, String value2) {
            addCriterion("contacts_tel not between", value1, value2, "contactsTel");
            return (Criteria) this;
        }

        public Criteria andContactsQqIsNull() {
            addCriterion("contacts_qq is null");
            return (Criteria) this;
        }

        public Criteria andContactsQqIsNotNull() {
            addCriterion("contacts_qq is not null");
            return (Criteria) this;
        }

        public Criteria andContactsQqEqualTo(String value) {
            addCriterion("contacts_qq =", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqNotEqualTo(String value) {
            addCriterion("contacts_qq <>", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqGreaterThan(String value) {
            addCriterion("contacts_qq >", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqGreaterThanOrEqualTo(String value) {
            addCriterion("contacts_qq >=", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqLessThan(String value) {
            addCriterion("contacts_qq <", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqLessThanOrEqualTo(String value) {
            addCriterion("contacts_qq <=", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqLike(String value) {
            addCriterion("contacts_qq like", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqNotLike(String value) {
            addCriterion("contacts_qq not like", value, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqIn(List<String> values) {
            addCriterion("contacts_qq in", values, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqNotIn(List<String> values) {
            addCriterion("contacts_qq not in", values, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqBetween(String value1, String value2) {
            addCriterion("contacts_qq between", value1, value2, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andContactsQqNotBetween(String value1, String value2) {
            addCriterion("contacts_qq not between", value1, value2, "contactsQq");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Integer value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Integer value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Integer value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Integer value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Integer> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Integer> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Integer value1, Integer value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNull() {
            addCriterion("rank_id is null");
            return (Criteria) this;
        }

        public Criteria andRankIdIsNotNull() {
            addCriterion("rank_id is not null");
            return (Criteria) this;
        }

        public Criteria andRankIdEqualTo(Integer value) {
            addCriterion("rank_id =", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotEqualTo(Integer value) {
            addCriterion("rank_id <>", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThan(Integer value) {
            addCriterion("rank_id >", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rank_id >=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThan(Integer value) {
            addCriterion("rank_id <", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdLessThanOrEqualTo(Integer value) {
            addCriterion("rank_id <=", value, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdIn(List<Integer> values) {
            addCriterion("rank_id in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotIn(List<Integer> values) {
            addCriterion("rank_id not in", values, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdBetween(Integer value1, Integer value2) {
            addCriterion("rank_id between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andRankIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rank_id not between", value1, value2, "rankId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdIsNull() {
            addCriterion("salesperson_id is null");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdIsNotNull() {
            addCriterion("salesperson_id is not null");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdEqualTo(Integer value) {
            addCriterion("salesperson_id =", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdNotEqualTo(Integer value) {
            addCriterion("salesperson_id <>", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdGreaterThan(Integer value) {
            addCriterion("salesperson_id >", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("salesperson_id >=", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdLessThan(Integer value) {
            addCriterion("salesperson_id <", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdLessThanOrEqualTo(Integer value) {
            addCriterion("salesperson_id <=", value, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdIn(List<Integer> values) {
            addCriterion("salesperson_id in", values, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdNotIn(List<Integer> values) {
            addCriterion("salesperson_id not in", values, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdBetween(Integer value1, Integer value2) {
            addCriterion("salesperson_id between", value1, value2, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andSalespersonIdNotBetween(Integer value1, Integer value2) {
            addCriterion("salesperson_id not between", value1, value2, "salespersonId");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeIsNull() {
            addCriterion("cooperation_starttime is null");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeIsNotNull() {
            addCriterion("cooperation_starttime is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeEqualTo(Date value) {
            addCriterion("cooperation_starttime =", value, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeNotEqualTo(Date value) {
            addCriterion("cooperation_starttime <>", value, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeGreaterThan(Date value) {
            addCriterion("cooperation_starttime >", value, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cooperation_starttime >=", value, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeLessThan(Date value) {
            addCriterion("cooperation_starttime <", value, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("cooperation_starttime <=", value, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeIn(List<Date> values) {
            addCriterion("cooperation_starttime in", values, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeNotIn(List<Date> values) {
            addCriterion("cooperation_starttime not in", values, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeBetween(Date value1, Date value2) {
            addCriterion("cooperation_starttime between", value1, value2, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("cooperation_starttime not between", value1, value2, "cooperationStarttime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeIsNull() {
            addCriterion("cooperation_endtime is null");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeIsNotNull() {
            addCriterion("cooperation_endtime is not null");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeEqualTo(Date value) {
            addCriterion("cooperation_endtime =", value, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeNotEqualTo(Date value) {
            addCriterion("cooperation_endtime <>", value, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeGreaterThan(Date value) {
            addCriterion("cooperation_endtime >", value, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("cooperation_endtime >=", value, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeLessThan(Date value) {
            addCriterion("cooperation_endtime <", value, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("cooperation_endtime <=", value, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeIn(List<Date> values) {
            addCriterion("cooperation_endtime in", values, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeNotIn(List<Date> values) {
            addCriterion("cooperation_endtime not in", values, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeBetween(Date value1, Date value2) {
            addCriterion("cooperation_endtime between", value1, value2, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andCooperationEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("cooperation_endtime not between", value1, value2, "cooperationEndtime");
            return (Criteria) this;
        }

        public Criteria andIsSignContractIsNull() {
            addCriterion("is_sign_contract is null");
            return (Criteria) this;
        }

        public Criteria andIsSignContractIsNotNull() {
            addCriterion("is_sign_contract is not null");
            return (Criteria) this;
        }

        public Criteria andIsSignContractEqualTo(Byte value) {
            addCriterion("is_sign_contract =", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractNotEqualTo(Byte value) {
            addCriterion("is_sign_contract <>", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractGreaterThan(Byte value) {
            addCriterion("is_sign_contract >", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_sign_contract >=", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractLessThan(Byte value) {
            addCriterion("is_sign_contract <", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractLessThanOrEqualTo(Byte value) {
            addCriterion("is_sign_contract <=", value, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractIn(List<Byte> values) {
            addCriterion("is_sign_contract in", values, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractNotIn(List<Byte> values) {
            addCriterion("is_sign_contract not in", values, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractBetween(Byte value1, Byte value2) {
            addCriterion("is_sign_contract between", value1, value2, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsSignContractNotBetween(Byte value1, Byte value2) {
            addCriterion("is_sign_contract not between", value1, value2, "isSignContract");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodIsNull() {
            addCriterion("is_forever_probation_period is null");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodIsNotNull() {
            addCriterion("is_forever_probation_period is not null");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodEqualTo(Byte value) {
            addCriterion("is_forever_probation_period =", value, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodNotEqualTo(Byte value) {
            addCriterion("is_forever_probation_period <>", value, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodGreaterThan(Byte value) {
            addCriterion("is_forever_probation_period >", value, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_forever_probation_period >=", value, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodLessThan(Byte value) {
            addCriterion("is_forever_probation_period <", value, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodLessThanOrEqualTo(Byte value) {
            addCriterion("is_forever_probation_period <=", value, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodIn(List<Byte> values) {
            addCriterion("is_forever_probation_period in", values, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodNotIn(List<Byte> values) {
            addCriterion("is_forever_probation_period not in", values, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodBetween(Byte value1, Byte value2) {
            addCriterion("is_forever_probation_period between", value1, value2, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andIsForeverProbationPeriodNotBetween(Byte value1, Byte value2) {
            addCriterion("is_forever_probation_period not between", value1, value2, "isForeverProbationPeriod");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitIsNull() {
            addCriterion("compare_account_time_limit is null");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitIsNotNull() {
            addCriterion("compare_account_time_limit is not null");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitEqualTo(Integer value) {
            addCriterion("compare_account_time_limit =", value, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitNotEqualTo(Integer value) {
            addCriterion("compare_account_time_limit <>", value, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitGreaterThan(Integer value) {
            addCriterion("compare_account_time_limit >", value, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("compare_account_time_limit >=", value, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitLessThan(Integer value) {
            addCriterion("compare_account_time_limit <", value, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitLessThanOrEqualTo(Integer value) {
            addCriterion("compare_account_time_limit <=", value, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitIn(List<Integer> values) {
            addCriterion("compare_account_time_limit in", values, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitNotIn(List<Integer> values) {
            addCriterion("compare_account_time_limit not in", values, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitBetween(Integer value1, Integer value2) {
            addCriterion("compare_account_time_limit between", value1, value2, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andCompareAccountTimeLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("compare_account_time_limit not between", value1, value2, "compareAccountTimeLimit");
            return (Criteria) this;
        }

        public Criteria andAccountTimeIsNull() {
            addCriterion("account_time is null");
            return (Criteria) this;
        }

        public Criteria andAccountTimeIsNotNull() {
            addCriterion("account_time is not null");
            return (Criteria) this;
        }

        public Criteria andAccountTimeEqualTo(Integer value) {
            addCriterion("account_time =", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotEqualTo(Integer value) {
            addCriterion("account_time <>", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeGreaterThan(Integer value) {
            addCriterion("account_time >", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("account_time >=", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeLessThan(Integer value) {
            addCriterion("account_time <", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeLessThanOrEqualTo(Integer value) {
            addCriterion("account_time <=", value, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeIn(List<Integer> values) {
            addCriterion("account_time in", values, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotIn(List<Integer> values) {
            addCriterion("account_time not in", values, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeBetween(Integer value1, Integer value2) {
            addCriterion("account_time between", value1, value2, "accountTime");
            return (Criteria) this;
        }

        public Criteria andAccountTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("account_time not between", value1, value2, "accountTime");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitIsNull() {
            addCriterion("money_limit is null");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitIsNotNull() {
            addCriterion("money_limit is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitEqualTo(Integer value) {
            addCriterion("money_limit =", value, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitNotEqualTo(Integer value) {
            addCriterion("money_limit <>", value, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitGreaterThan(Integer value) {
            addCriterion("money_limit >", value, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("money_limit >=", value, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitLessThan(Integer value) {
            addCriterion("money_limit <", value, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitLessThanOrEqualTo(Integer value) {
            addCriterion("money_limit <=", value, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitIn(List<Integer> values) {
            addCriterion("money_limit in", values, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitNotIn(List<Integer> values) {
            addCriterion("money_limit not in", values, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitBetween(Integer value1, Integer value2) {
            addCriterion("money_limit between", value1, value2, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andMoneyLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("money_limit not between", value1, value2, "moneyLimit");
            return (Criteria) this;
        }

        public Criteria andAccountantNameIsNull() {
            addCriterion("accountant_name is null");
            return (Criteria) this;
        }

        public Criteria andAccountantNameIsNotNull() {
            addCriterion("accountant_name is not null");
            return (Criteria) this;
        }

        public Criteria andAccountantNameEqualTo(String value) {
            addCriterion("accountant_name =", value, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameNotEqualTo(String value) {
            addCriterion("accountant_name <>", value, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameGreaterThan(String value) {
            addCriterion("accountant_name >", value, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameGreaterThanOrEqualTo(String value) {
            addCriterion("accountant_name >=", value, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameLessThan(String value) {
            addCriterion("accountant_name <", value, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameLessThanOrEqualTo(String value) {
            addCriterion("accountant_name <=", value, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameLike(String value) {
            addCriterion("accountant_name like", value, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameNotLike(String value) {
            addCriterion("accountant_name not like", value, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameIn(List<String> values) {
            addCriterion("accountant_name in", values, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameNotIn(List<String> values) {
            addCriterion("accountant_name not in", values, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameBetween(String value1, String value2) {
            addCriterion("accountant_name between", value1, value2, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantNameNotBetween(String value1, String value2) {
            addCriterion("accountant_name not between", value1, value2, "accountantName");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneIsNull() {
            addCriterion("accountant_phone is null");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneIsNotNull() {
            addCriterion("accountant_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneEqualTo(String value) {
            addCriterion("accountant_phone =", value, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneNotEqualTo(String value) {
            addCriterion("accountant_phone <>", value, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneGreaterThan(String value) {
            addCriterion("accountant_phone >", value, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("accountant_phone >=", value, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneLessThan(String value) {
            addCriterion("accountant_phone <", value, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneLessThanOrEqualTo(String value) {
            addCriterion("accountant_phone <=", value, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneLike(String value) {
            addCriterion("accountant_phone like", value, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneNotLike(String value) {
            addCriterion("accountant_phone not like", value, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneIn(List<String> values) {
            addCriterion("accountant_phone in", values, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneNotIn(List<String> values) {
            addCriterion("accountant_phone not in", values, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneBetween(String value1, String value2) {
            addCriterion("accountant_phone between", value1, value2, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantPhoneNotBetween(String value1, String value2) {
            addCriterion("accountant_phone not between", value1, value2, "accountantPhone");
            return (Criteria) this;
        }

        public Criteria andAccountantQqIsNull() {
            addCriterion("accountant_qq is null");
            return (Criteria) this;
        }

        public Criteria andAccountantQqIsNotNull() {
            addCriterion("accountant_qq is not null");
            return (Criteria) this;
        }

        public Criteria andAccountantQqEqualTo(String value) {
            addCriterion("accountant_qq =", value, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqNotEqualTo(String value) {
            addCriterion("accountant_qq <>", value, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqGreaterThan(String value) {
            addCriterion("accountant_qq >", value, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqGreaterThanOrEqualTo(String value) {
            addCriterion("accountant_qq >=", value, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqLessThan(String value) {
            addCriterion("accountant_qq <", value, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqLessThanOrEqualTo(String value) {
            addCriterion("accountant_qq <=", value, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqLike(String value) {
            addCriterion("accountant_qq like", value, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqNotLike(String value) {
            addCriterion("accountant_qq not like", value, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqIn(List<String> values) {
            addCriterion("accountant_qq in", values, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqNotIn(List<String> values) {
            addCriterion("accountant_qq not in", values, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqBetween(String value1, String value2) {
            addCriterion("accountant_qq between", value1, value2, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andAccountantQqNotBetween(String value1, String value2) {
            addCriterion("accountant_qq not between", value1, value2, "accountantQq");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNull() {
            addCriterion("is_lock is null");
            return (Criteria) this;
        }

        public Criteria andIsLockIsNotNull() {
            addCriterion("is_lock is not null");
            return (Criteria) this;
        }

        public Criteria andIsLockEqualTo(Byte value) {
            addCriterion("is_lock =", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotEqualTo(Byte value) {
            addCriterion("is_lock <>", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThan(Byte value) {
            addCriterion("is_lock >", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_lock >=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThan(Byte value) {
            addCriterion("is_lock <", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockLessThanOrEqualTo(Byte value) {
            addCriterion("is_lock <=", value, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockIn(List<Byte> values) {
            addCriterion("is_lock in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotIn(List<Byte> values) {
            addCriterion("is_lock not in", values, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockBetween(Byte value1, Byte value2) {
            addCriterion("is_lock between", value1, value2, "isLock");
            return (Criteria) this;
        }

        public Criteria andIsLockNotBetween(Byte value1, Byte value2) {
            addCriterion("is_lock not between", value1, value2, "isLock");
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

        public Criteria andLoginAccountIsNull() {
            addCriterion("login_account is null");
            return (Criteria) this;
        }

        public Criteria andLoginAccountIsNotNull() {
            addCriterion("login_account is not null");
            return (Criteria) this;
        }

        public Criteria andLoginAccountEqualTo(String value) {
            addCriterion("login_account =", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotEqualTo(String value) {
            addCriterion("login_account <>", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountGreaterThan(String value) {
            addCriterion("login_account >", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountGreaterThanOrEqualTo(String value) {
            addCriterion("login_account >=", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLessThan(String value) {
            addCriterion("login_account <", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLessThanOrEqualTo(String value) {
            addCriterion("login_account <=", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountLike(String value) {
            addCriterion("login_account like", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotLike(String value) {
            addCriterion("login_account not like", value, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountIn(List<String> values) {
            addCriterion("login_account in", values, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotIn(List<String> values) {
            addCriterion("login_account not in", values, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountBetween(String value1, String value2) {
            addCriterion("login_account between", value1, value2, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginAccountNotBetween(String value1, String value2) {
            addCriterion("login_account not between", value1, value2, "loginAccount");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNull() {
            addCriterion("login_password is null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIsNotNull() {
            addCriterion("login_password is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordEqualTo(String value) {
            addCriterion("login_password =", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotEqualTo(String value) {
            addCriterion("login_password <>", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThan(String value) {
            addCriterion("login_password >", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("login_password >=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThan(String value) {
            addCriterion("login_password <", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLessThanOrEqualTo(String value) {
            addCriterion("login_password <=", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordLike(String value) {
            addCriterion("login_password like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotLike(String value) {
            addCriterion("login_password not like", value, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordIn(List<String> values) {
            addCriterion("login_password in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotIn(List<String> values) {
            addCriterion("login_password not in", values, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordBetween(String value1, String value2) {
            addCriterion("login_password between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andLoginPasswordNotBetween(String value1, String value2) {
            addCriterion("login_password not between", value1, value2, "loginPassword");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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

        public Criteria andDeleteStatesIsNull() {
            addCriterion("delete_states is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesIsNotNull() {
            addCriterion("delete_states is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesEqualTo(Integer value) {
            addCriterion("delete_states =", value, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesNotEqualTo(Integer value) {
            addCriterion("delete_states <>", value, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesGreaterThan(Integer value) {
            addCriterion("delete_states >", value, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesGreaterThanOrEqualTo(Integer value) {
            addCriterion("delete_states >=", value, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesLessThan(Integer value) {
            addCriterion("delete_states <", value, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesLessThanOrEqualTo(Integer value) {
            addCriterion("delete_states <=", value, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesIn(List<Integer> values) {
            addCriterion("delete_states in", values, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesNotIn(List<Integer> values) {
            addCriterion("delete_states not in", values, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesBetween(Integer value1, Integer value2) {
            addCriterion("delete_states between", value1, value2, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteStatesNotBetween(Integer value1, Integer value2) {
            addCriterion("delete_states not between", value1, value2, "deleteStates");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNull() {
            addCriterion("delete_time is null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIsNotNull() {
            addCriterion("delete_time is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeEqualTo(Date value) {
            addCriterion("delete_time =", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotEqualTo(Date value) {
            addCriterion("delete_time <>", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThan(Date value) {
            addCriterion("delete_time >", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("delete_time >=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThan(Date value) {
            addCriterion("delete_time <", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeLessThanOrEqualTo(Date value) {
            addCriterion("delete_time <=", value, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeIn(List<Date> values) {
            addCriterion("delete_time in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotIn(List<Date> values) {
            addCriterion("delete_time not in", values, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeBetween(Date value1, Date value2) {
            addCriterion("delete_time between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andDeleteTimeNotBetween(Date value1, Date value2) {
            addCriterion("delete_time not between", value1, value2, "deleteTime");
            return (Criteria) this;
        }

        public Criteria andIsTryoutIsNull() {
            addCriterion("is_tryout is null");
            return (Criteria) this;
        }

        public Criteria andIsTryoutIsNotNull() {
            addCriterion("is_tryout is not null");
            return (Criteria) this;
        }

        public Criteria andIsTryoutEqualTo(Integer value) {
            addCriterion("is_tryout =", value, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutNotEqualTo(Integer value) {
            addCriterion("is_tryout <>", value, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutGreaterThan(Integer value) {
            addCriterion("is_tryout >", value, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_tryout >=", value, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutLessThan(Integer value) {
            addCriterion("is_tryout <", value, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutLessThanOrEqualTo(Integer value) {
            addCriterion("is_tryout <=", value, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutIn(List<Integer> values) {
            addCriterion("is_tryout in", values, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutNotIn(List<Integer> values) {
            addCriterion("is_tryout not in", values, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutBetween(Integer value1, Integer value2) {
            addCriterion("is_tryout between", value1, value2, "isTryout");
            return (Criteria) this;
        }

        public Criteria andIsTryoutNotBetween(Integer value1, Integer value2) {
            addCriterion("is_tryout not between", value1, value2, "isTryout");
            return (Criteria) this;
        }

        public Criteria andTrialIsNull() {
            addCriterion("trial is null");
            return (Criteria) this;
        }

        public Criteria andTrialIsNotNull() {
            addCriterion("trial is not null");
            return (Criteria) this;
        }

        public Criteria andTrialEqualTo(Integer value) {
            addCriterion("trial =", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialNotEqualTo(Integer value) {
            addCriterion("trial <>", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialGreaterThan(Integer value) {
            addCriterion("trial >", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialGreaterThanOrEqualTo(Integer value) {
            addCriterion("trial >=", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialLessThan(Integer value) {
            addCriterion("trial <", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialLessThanOrEqualTo(Integer value) {
            addCriterion("trial <=", value, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialIn(List<Integer> values) {
            addCriterion("trial in", values, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialNotIn(List<Integer> values) {
            addCriterion("trial not in", values, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialBetween(Integer value1, Integer value2) {
            addCriterion("trial between", value1, value2, "trial");
            return (Criteria) this;
        }

        public Criteria andTrialNotBetween(Integer value1, Integer value2) {
            addCriterion("trial not between", value1, value2, "trial");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorIsNull() {
            addCriterion("minimum_fee_door is null");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorIsNotNull() {
            addCriterion("minimum_fee_door is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorEqualTo(Double value) {
            addCriterion("minimum_fee_door =", value, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorNotEqualTo(Double value) {
            addCriterion("minimum_fee_door <>", value, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorGreaterThan(Double value) {
            addCriterion("minimum_fee_door >", value, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorGreaterThanOrEqualTo(Double value) {
            addCriterion("minimum_fee_door >=", value, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorLessThan(Double value) {
            addCriterion("minimum_fee_door <", value, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorLessThanOrEqualTo(Double value) {
            addCriterion("minimum_fee_door <=", value, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorIn(List<Double> values) {
            addCriterion("minimum_fee_door in", values, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorNotIn(List<Double> values) {
            addCriterion("minimum_fee_door not in", values, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorBetween(Double value1, Double value2) {
            addCriterion("minimum_fee_door between", value1, value2, "minimumFeeDoor");
            return (Criteria) this;
        }

        public Criteria andMinimumFeeDoorNotBetween(Double value1, Double value2) {
            addCriterion("minimum_fee_door not between", value1, value2, "minimumFeeDoor");
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

        public Criteria andDiscountTypeIsNull() {
            addCriterion("discount_type is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNotNull() {
            addCriterion("discount_type is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeEqualTo(Integer value) {
            addCriterion("discount_type =", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotEqualTo(Integer value) {
            addCriterion("discount_type <>", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThan(Integer value) {
            addCriterion("discount_type >", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("discount_type >=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThan(Integer value) {
            addCriterion("discount_type <", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThanOrEqualTo(Integer value) {
            addCriterion("discount_type <=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIn(List<Integer> values) {
            addCriterion("discount_type in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotIn(List<Integer> values) {
            addCriterion("discount_type not in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeBetween(Integer value1, Integer value2) {
            addCriterion("discount_type between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("discount_type not between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementIsNull() {
            addCriterion("accept_agreement is null");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementIsNotNull() {
            addCriterion("accept_agreement is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementEqualTo(Integer value) {
            addCriterion("accept_agreement =", value, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementNotEqualTo(Integer value) {
            addCriterion("accept_agreement <>", value, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementGreaterThan(Integer value) {
            addCriterion("accept_agreement >", value, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementGreaterThanOrEqualTo(Integer value) {
            addCriterion("accept_agreement >=", value, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementLessThan(Integer value) {
            addCriterion("accept_agreement <", value, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementLessThanOrEqualTo(Integer value) {
            addCriterion("accept_agreement <=", value, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementIn(List<Integer> values) {
            addCriterion("accept_agreement in", values, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementNotIn(List<Integer> values) {
            addCriterion("accept_agreement not in", values, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementBetween(Integer value1, Integer value2) {
            addCriterion("accept_agreement between", value1, value2, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andAcceptAgreementNotBetween(Integer value1, Integer value2) {
            addCriterion("accept_agreement not between", value1, value2, "acceptAgreement");
            return (Criteria) this;
        }

        public Criteria andTechPhoneIsNull() {
            addCriterion("tech_phone is null");
            return (Criteria) this;
        }

        public Criteria andTechPhoneIsNotNull() {
            addCriterion("tech_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTechPhoneEqualTo(String value) {
            addCriterion("tech_phone =", value, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneNotEqualTo(String value) {
            addCriterion("tech_phone <>", value, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneGreaterThan(String value) {
            addCriterion("tech_phone >", value, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("tech_phone >=", value, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneLessThan(String value) {
            addCriterion("tech_phone <", value, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneLessThanOrEqualTo(String value) {
            addCriterion("tech_phone <=", value, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneLike(String value) {
            addCriterion("tech_phone like", value, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneNotLike(String value) {
            addCriterion("tech_phone not like", value, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneIn(List<String> values) {
            addCriterion("tech_phone in", values, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneNotIn(List<String> values) {
            addCriterion("tech_phone not in", values, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneBetween(String value1, String value2) {
            addCriterion("tech_phone between", value1, value2, "techPhone");
            return (Criteria) this;
        }

        public Criteria andTechPhoneNotBetween(String value1, String value2) {
            addCriterion("tech_phone not between", value1, value2, "techPhone");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(Integer value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(Integer value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(Integer value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(Integer value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(Integer value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(Integer value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<Integer> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<Integer> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(Integer value1, Integer value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(Integer value1, Integer value2) {
            addCriterion("source not between", value1, value2, "source");
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