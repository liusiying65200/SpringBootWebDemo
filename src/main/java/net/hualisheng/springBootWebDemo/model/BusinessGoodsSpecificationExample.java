package net.hualisheng.springBootWebDemo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BusinessGoodsSpecificationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusinessGoodsSpecificationExample() {
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

        public Criteria andBusinessGoodsIdIsNull() {
            addCriterion("business_goods_id is null");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdIsNotNull() {
            addCriterion("business_goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdEqualTo(Integer value) {
            addCriterion("business_goods_id =", value, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdNotEqualTo(Integer value) {
            addCriterion("business_goods_id <>", value, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdGreaterThan(Integer value) {
            addCriterion("business_goods_id >", value, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("business_goods_id >=", value, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdLessThan(Integer value) {
            addCriterion("business_goods_id <", value, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdLessThanOrEqualTo(Integer value) {
            addCriterion("business_goods_id <=", value, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdIn(List<Integer> values) {
            addCriterion("business_goods_id in", values, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdNotIn(List<Integer> values) {
            addCriterion("business_goods_id not in", values, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdBetween(Integer value1, Integer value2) {
            addCriterion("business_goods_id between", value1, value2, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andBusinessGoodsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("business_goods_id not between", value1, value2, "businessGoodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdIsNull() {
            addCriterion("goods_spec_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdIsNotNull() {
            addCriterion("goods_spec_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdEqualTo(Integer value) {
            addCriterion("goods_spec_id =", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotEqualTo(Integer value) {
            addCriterion("goods_spec_id <>", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdGreaterThan(Integer value) {
            addCriterion("goods_spec_id >", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("goods_spec_id >=", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdLessThan(Integer value) {
            addCriterion("goods_spec_id <", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdLessThanOrEqualTo(Integer value) {
            addCriterion("goods_spec_id <=", value, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdIn(List<Integer> values) {
            addCriterion("goods_spec_id in", values, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotIn(List<Integer> values) {
            addCriterion("goods_spec_id not in", values, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdBetween(Integer value1, Integer value2) {
            addCriterion("goods_spec_id between", value1, value2, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecIdNotBetween(Integer value1, Integer value2) {
            addCriterion("goods_spec_id not between", value1, value2, "goodsSpecId");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceIsNull() {
            addCriterion("goods_spec_price is null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceIsNotNull() {
            addCriterion("goods_spec_price is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceEqualTo(Double value) {
            addCriterion("goods_spec_price =", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceNotEqualTo(Double value) {
            addCriterion("goods_spec_price <>", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceGreaterThan(Double value) {
            addCriterion("goods_spec_price >", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_spec_price >=", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceLessThan(Double value) {
            addCriterion("goods_spec_price <", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceLessThanOrEqualTo(Double value) {
            addCriterion("goods_spec_price <=", value, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceIn(List<Double> values) {
            addCriterion("goods_spec_price in", values, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceNotIn(List<Double> values) {
            addCriterion("goods_spec_price not in", values, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceBetween(Double value1, Double value2) {
            addCriterion("goods_spec_price between", value1, value2, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsSpecPriceNotBetween(Double value1, Double value2) {
            addCriterion("goods_spec_price not between", value1, value2, "goodsSpecPrice");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairIsNull() {
            addCriterion("goods_repair is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairIsNotNull() {
            addCriterion("goods_repair is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairEqualTo(Double value) {
            addCriterion("goods_repair =", value, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairNotEqualTo(Double value) {
            addCriterion("goods_repair <>", value, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairGreaterThan(Double value) {
            addCriterion("goods_repair >", value, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_repair >=", value, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairLessThan(Double value) {
            addCriterion("goods_repair <", value, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairLessThanOrEqualTo(Double value) {
            addCriterion("goods_repair <=", value, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairIn(List<Double> values) {
            addCriterion("goods_repair in", values, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairNotIn(List<Double> values) {
            addCriterion("goods_repair not in", values, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairBetween(Double value1, Double value2) {
            addCriterion("goods_repair between", value1, value2, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andGoodsRepairNotBetween(Double value1, Double value2) {
            addCriterion("goods_repair not between", value1, value2, "goodsRepair");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNull() {
            addCriterion("distribution is null");
            return (Criteria) this;
        }

        public Criteria andDistributionIsNotNull() {
            addCriterion("distribution is not null");
            return (Criteria) this;
        }

        public Criteria andDistributionEqualTo(Double value) {
            addCriterion("distribution =", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotEqualTo(Double value) {
            addCriterion("distribution <>", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThan(Double value) {
            addCriterion("distribution >", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionGreaterThanOrEqualTo(Double value) {
            addCriterion("distribution >=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThan(Double value) {
            addCriterion("distribution <", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionLessThanOrEqualTo(Double value) {
            addCriterion("distribution <=", value, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionIn(List<Double> values) {
            addCriterion("distribution in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotIn(List<Double> values) {
            addCriterion("distribution not in", values, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionBetween(Double value1, Double value2) {
            addCriterion("distribution between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andDistributionNotBetween(Double value1, Double value2) {
            addCriterion("distribution not between", value1, value2, "distribution");
            return (Criteria) this;
        }

        public Criteria andScaleIsNull() {
            addCriterion("scale is null");
            return (Criteria) this;
        }

        public Criteria andScaleIsNotNull() {
            addCriterion("scale is not null");
            return (Criteria) this;
        }

        public Criteria andScaleEqualTo(Double value) {
            addCriterion("scale =", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotEqualTo(Double value) {
            addCriterion("scale <>", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThan(Double value) {
            addCriterion("scale >", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleGreaterThanOrEqualTo(Double value) {
            addCriterion("scale >=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThan(Double value) {
            addCriterion("scale <", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleLessThanOrEqualTo(Double value) {
            addCriterion("scale <=", value, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleIn(List<Double> values) {
            addCriterion("scale in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotIn(List<Double> values) {
            addCriterion("scale not in", values, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleBetween(Double value1, Double value2) {
            addCriterion("scale between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andScaleNotBetween(Double value1, Double value2) {
            addCriterion("scale not between", value1, value2, "scale");
            return (Criteria) this;
        }

        public Criteria andDisassemblyIsNull() {
            addCriterion("disassembly is null");
            return (Criteria) this;
        }

        public Criteria andDisassemblyIsNotNull() {
            addCriterion("disassembly is not null");
            return (Criteria) this;
        }

        public Criteria andDisassemblyEqualTo(Double value) {
            addCriterion("disassembly =", value, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyNotEqualTo(Double value) {
            addCriterion("disassembly <>", value, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyGreaterThan(Double value) {
            addCriterion("disassembly >", value, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyGreaterThanOrEqualTo(Double value) {
            addCriterion("disassembly >=", value, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyLessThan(Double value) {
            addCriterion("disassembly <", value, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyLessThanOrEqualTo(Double value) {
            addCriterion("disassembly <=", value, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyIn(List<Double> values) {
            addCriterion("disassembly in", values, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyNotIn(List<Double> values) {
            addCriterion("disassembly not in", values, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyBetween(Double value1, Double value2) {
            addCriterion("disassembly between", value1, value2, "disassembly");
            return (Criteria) this;
        }

        public Criteria andDisassemblyNotBetween(Double value1, Double value2) {
            addCriterion("disassembly not between", value1, value2, "disassembly");
            return (Criteria) this;
        }

        public Criteria andBrandIsNull() {
            addCriterion("brand is null");
            return (Criteria) this;
        }

        public Criteria andBrandIsNotNull() {
            addCriterion("brand is not null");
            return (Criteria) this;
        }

        public Criteria andBrandEqualTo(String value) {
            addCriterion("brand =", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotEqualTo(String value) {
            addCriterion("brand <>", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThan(String value) {
            addCriterion("brand >", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandGreaterThanOrEqualTo(String value) {
            addCriterion("brand >=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThan(String value) {
            addCriterion("brand <", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLessThanOrEqualTo(String value) {
            addCriterion("brand <=", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandLike(String value) {
            addCriterion("brand like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotLike(String value) {
            addCriterion("brand not like", value, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandIn(List<String> values) {
            addCriterion("brand in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotIn(List<String> values) {
            addCriterion("brand not in", values, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandBetween(String value1, String value2) {
            addCriterion("brand between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andBrandNotBetween(String value1, String value2) {
            addCriterion("brand not between", value1, value2, "brand");
            return (Criteria) this;
        }

        public Criteria andModelIsNull() {
            addCriterion("model is null");
            return (Criteria) this;
        }

        public Criteria andModelIsNotNull() {
            addCriterion("model is not null");
            return (Criteria) this;
        }

        public Criteria andModelEqualTo(String value) {
            addCriterion("model =", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotEqualTo(String value) {
            addCriterion("model <>", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThan(String value) {
            addCriterion("model >", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelGreaterThanOrEqualTo(String value) {
            addCriterion("model >=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThan(String value) {
            addCriterion("model <", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLessThanOrEqualTo(String value) {
            addCriterion("model <=", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelLike(String value) {
            addCriterion("model like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotLike(String value) {
            addCriterion("model not like", value, "model");
            return (Criteria) this;
        }

        public Criteria andModelIn(List<String> values) {
            addCriterion("model in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotIn(List<String> values) {
            addCriterion("model not in", values, "model");
            return (Criteria) this;
        }

        public Criteria andModelBetween(String value1, String value2) {
            addCriterion("model between", value1, value2, "model");
            return (Criteria) this;
        }

        public Criteria andModelNotBetween(String value1, String value2) {
            addCriterion("model not between", value1, value2, "model");
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

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Byte value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Byte value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Byte value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Byte value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Byte value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Byte> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Byte> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Byte value1, Byte value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Byte value1, Byte value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeIsNull() {
            addCriterion("minimum_servicefee is null");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeIsNotNull() {
            addCriterion("minimum_servicefee is not null");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeEqualTo(Integer value) {
            addCriterion("minimum_servicefee =", value, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeNotEqualTo(Integer value) {
            addCriterion("minimum_servicefee <>", value, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeGreaterThan(Integer value) {
            addCriterion("minimum_servicefee >", value, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeGreaterThanOrEqualTo(Integer value) {
            addCriterion("minimum_servicefee >=", value, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeLessThan(Integer value) {
            addCriterion("minimum_servicefee <", value, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeLessThanOrEqualTo(Integer value) {
            addCriterion("minimum_servicefee <=", value, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeIn(List<Integer> values) {
            addCriterion("minimum_servicefee in", values, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeNotIn(List<Integer> values) {
            addCriterion("minimum_servicefee not in", values, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeBetween(Integer value1, Integer value2) {
            addCriterion("minimum_servicefee between", value1, value2, "minimumServicefee");
            return (Criteria) this;
        }

        public Criteria andMinimumServicefeeNotBetween(Integer value1, Integer value2) {
            addCriterion("minimum_servicefee not between", value1, value2, "minimumServicefee");
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

        public Criteria andAzDiscountIsNull() {
            addCriterion("az_discount is null");
            return (Criteria) this;
        }

        public Criteria andAzDiscountIsNotNull() {
            addCriterion("az_discount is not null");
            return (Criteria) this;
        }

        public Criteria andAzDiscountEqualTo(Double value) {
            addCriterion("az_discount =", value, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountNotEqualTo(Double value) {
            addCriterion("az_discount <>", value, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountGreaterThan(Double value) {
            addCriterion("az_discount >", value, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountGreaterThanOrEqualTo(Double value) {
            addCriterion("az_discount >=", value, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountLessThan(Double value) {
            addCriterion("az_discount <", value, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountLessThanOrEqualTo(Double value) {
            addCriterion("az_discount <=", value, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountIn(List<Double> values) {
            addCriterion("az_discount in", values, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountNotIn(List<Double> values) {
            addCriterion("az_discount not in", values, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountBetween(Double value1, Double value2) {
            addCriterion("az_discount between", value1, value2, "azDiscount");
            return (Criteria) this;
        }

        public Criteria andAzDiscountNotBetween(Double value1, Double value2) {
            addCriterion("az_discount not between", value1, value2, "azDiscount");
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