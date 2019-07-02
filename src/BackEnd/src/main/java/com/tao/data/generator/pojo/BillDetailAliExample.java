package com.tao.data.generator.pojo;

import java.util.ArrayList;
import java.util.List;

public class BillDetailAliExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BillDetailAliExample() {
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

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNull() {
            addCriterion("gmt_create is null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIsNotNull() {
            addCriterion("gmt_create is not null");
            return (Criteria) this;
        }

        public Criteria andGmtCreateEqualTo(Long value) {
            addCriterion("gmt_create =", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotEqualTo(Long value) {
            addCriterion("gmt_create <>", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThan(Long value) {
            addCriterion("gmt_create >", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_create >=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThan(Long value) {
            addCriterion("gmt_create <", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateLessThanOrEqualTo(Long value) {
            addCriterion("gmt_create <=", value, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateIn(List<Long> values) {
            addCriterion("gmt_create in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotIn(List<Long> values) {
            addCriterion("gmt_create not in", values, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateBetween(Long value1, Long value2) {
            addCriterion("gmt_create between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtCreateNotBetween(Long value1, Long value2) {
            addCriterion("gmt_create not between", value1, value2, "gmtCreate");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNull() {
            addCriterion("gmt_modified is null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIsNotNull() {
            addCriterion("gmt_modified is not null");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedEqualTo(Long value) {
            addCriterion("gmt_modified =", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotEqualTo(Long value) {
            addCriterion("gmt_modified <>", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThan(Long value) {
            addCriterion("gmt_modified >", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("gmt_modified >=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThan(Long value) {
            addCriterion("gmt_modified <", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedLessThanOrEqualTo(Long value) {
            addCriterion("gmt_modified <=", value, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedIn(List<Long> values) {
            addCriterion("gmt_modified in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotIn(List<Long> values) {
            addCriterion("gmt_modified not in", values, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedBetween(Long value1, Long value2) {
            addCriterion("gmt_modified between", value1, value2, "gmtModified");
            return (Criteria) this;
        }

        public Criteria andGmtModifiedNotBetween(Long value1, Long value2) {
            addCriterion("gmt_modified not between", value1, value2, "gmtModified");
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

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeIsNull() {
            addCriterion("pay_creat_time is null");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeIsNotNull() {
            addCriterion("pay_creat_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeEqualTo(Long value) {
            addCriterion("pay_creat_time =", value, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeNotEqualTo(Long value) {
            addCriterion("pay_creat_time <>", value, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeGreaterThan(Long value) {
            addCriterion("pay_creat_time >", value, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_creat_time >=", value, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeLessThan(Long value) {
            addCriterion("pay_creat_time <", value, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeLessThanOrEqualTo(Long value) {
            addCriterion("pay_creat_time <=", value, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeIn(List<Long> values) {
            addCriterion("pay_creat_time in", values, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeNotIn(List<Long> values) {
            addCriterion("pay_creat_time not in", values, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeBetween(Long value1, Long value2) {
            addCriterion("pay_creat_time between", value1, value2, "payCreatTime");
            return (Criteria) this;
        }

        public Criteria andPayCreatTimeNotBetween(Long value1, Long value2) {
            addCriterion("pay_creat_time not between", value1, value2, "payCreatTime");
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

        public Criteria andPayTimeEqualTo(Long value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(Long value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(Long value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(Long value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(Long value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<Long> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<Long> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(Long value1, Long value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(Long value1, Long value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeIsNull() {
            addCriterion("pay_modified_time is null");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeIsNotNull() {
            addCriterion("pay_modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeEqualTo(Long value) {
            addCriterion("pay_modified_time =", value, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeNotEqualTo(Long value) {
            addCriterion("pay_modified_time <>", value, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeGreaterThan(Long value) {
            addCriterion("pay_modified_time >", value, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_modified_time >=", value, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeLessThan(Long value) {
            addCriterion("pay_modified_time <", value, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeLessThanOrEqualTo(Long value) {
            addCriterion("pay_modified_time <=", value, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeIn(List<Long> values) {
            addCriterion("pay_modified_time in", values, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeNotIn(List<Long> values) {
            addCriterion("pay_modified_time not in", values, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeBetween(Long value1, Long value2) {
            addCriterion("pay_modified_time between", value1, value2, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andPayModifiedTimeNotBetween(Long value1, Long value2) {
            addCriterion("pay_modified_time not between", value1, value2, "payModifiedTime");
            return (Criteria) this;
        }

        public Criteria andBillPlaceIsNull() {
            addCriterion("bill_place is null");
            return (Criteria) this;
        }

        public Criteria andBillPlaceIsNotNull() {
            addCriterion("bill_place is not null");
            return (Criteria) this;
        }

        public Criteria andBillPlaceEqualTo(String value) {
            addCriterion("bill_place =", value, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceNotEqualTo(String value) {
            addCriterion("bill_place <>", value, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceGreaterThan(String value) {
            addCriterion("bill_place >", value, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceGreaterThanOrEqualTo(String value) {
            addCriterion("bill_place >=", value, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceLessThan(String value) {
            addCriterion("bill_place <", value, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceLessThanOrEqualTo(String value) {
            addCriterion("bill_place <=", value, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceLike(String value) {
            addCriterion("bill_place like", value, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceNotLike(String value) {
            addCriterion("bill_place not like", value, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceIn(List<String> values) {
            addCriterion("bill_place in", values, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceNotIn(List<String> values) {
            addCriterion("bill_place not in", values, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceBetween(String value1, String value2) {
            addCriterion("bill_place between", value1, value2, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillPlaceNotBetween(String value1, String value2) {
            addCriterion("bill_place not between", value1, value2, "billPlace");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNull() {
            addCriterion("bill_type is null");
            return (Criteria) this;
        }

        public Criteria andBillTypeIsNotNull() {
            addCriterion("bill_type is not null");
            return (Criteria) this;
        }

        public Criteria andBillTypeEqualTo(Short value) {
            addCriterion("bill_type =", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotEqualTo(Short value) {
            addCriterion("bill_type <>", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThan(Short value) {
            addCriterion("bill_type >", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("bill_type >=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThan(Short value) {
            addCriterion("bill_type <", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeLessThanOrEqualTo(Short value) {
            addCriterion("bill_type <=", value, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeIn(List<Short> values) {
            addCriterion("bill_type in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotIn(List<Short> values) {
            addCriterion("bill_type not in", values, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeBetween(Short value1, Short value2) {
            addCriterion("bill_type between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andBillTypeNotBetween(Short value1, Short value2) {
            addCriterion("bill_type not between", value1, value2, "billType");
            return (Criteria) this;
        }

        public Criteria andTraderIsNull() {
            addCriterion("trader is null");
            return (Criteria) this;
        }

        public Criteria andTraderIsNotNull() {
            addCriterion("trader is not null");
            return (Criteria) this;
        }

        public Criteria andTraderEqualTo(String value) {
            addCriterion("trader =", value, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderNotEqualTo(String value) {
            addCriterion("trader <>", value, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderGreaterThan(String value) {
            addCriterion("trader >", value, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderGreaterThanOrEqualTo(String value) {
            addCriterion("trader >=", value, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderLessThan(String value) {
            addCriterion("trader <", value, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderLessThanOrEqualTo(String value) {
            addCriterion("trader <=", value, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderLike(String value) {
            addCriterion("trader like", value, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderNotLike(String value) {
            addCriterion("trader not like", value, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderIn(List<String> values) {
            addCriterion("trader in", values, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderNotIn(List<String> values) {
            addCriterion("trader not in", values, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderBetween(String value1, String value2) {
            addCriterion("trader between", value1, value2, "trader");
            return (Criteria) this;
        }

        public Criteria andTraderNotBetween(String value1, String value2) {
            addCriterion("trader not between", value1, value2, "trader");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNull() {
            addCriterion("goods is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIsNotNull() {
            addCriterion("goods is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsEqualTo(String value) {
            addCriterion("goods =", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotEqualTo(String value) {
            addCriterion("goods <>", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThan(String value) {
            addCriterion("goods >", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsGreaterThanOrEqualTo(String value) {
            addCriterion("goods >=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThan(String value) {
            addCriterion("goods <", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLessThanOrEqualTo(String value) {
            addCriterion("goods <=", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsLike(String value) {
            addCriterion("goods like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotLike(String value) {
            addCriterion("goods not like", value, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsIn(List<String> values) {
            addCriterion("goods in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotIn(List<String> values) {
            addCriterion("goods not in", values, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsBetween(String value1, String value2) {
            addCriterion("goods between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andGoodsNotBetween(String value1, String value2) {
            addCriterion("goods not between", value1, value2, "goods");
            return (Criteria) this;
        }

        public Criteria andPayNumIsNull() {
            addCriterion("pay_num is null");
            return (Criteria) this;
        }

        public Criteria andPayNumIsNotNull() {
            addCriterion("pay_num is not null");
            return (Criteria) this;
        }

        public Criteria andPayNumEqualTo(Long value) {
            addCriterion("pay_num =", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotEqualTo(Long value) {
            addCriterion("pay_num <>", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThan(Long value) {
            addCriterion("pay_num >", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_num >=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThan(Long value) {
            addCriterion("pay_num <", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumLessThanOrEqualTo(Long value) {
            addCriterion("pay_num <=", value, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumIn(List<Long> values) {
            addCriterion("pay_num in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotIn(List<Long> values) {
            addCriterion("pay_num not in", values, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumBetween(Long value1, Long value2) {
            addCriterion("pay_num between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andPayNumNotBetween(Long value1, Long value2) {
            addCriterion("pay_num not between", value1, value2, "payNum");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNull() {
            addCriterion("income_type is null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIsNotNull() {
            addCriterion("income_type is not null");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeEqualTo(Short value) {
            addCriterion("income_type =", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotEqualTo(Short value) {
            addCriterion("income_type <>", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThan(Short value) {
            addCriterion("income_type >", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("income_type >=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThan(Short value) {
            addCriterion("income_type <", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeLessThanOrEqualTo(Short value) {
            addCriterion("income_type <=", value, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeIn(List<Short> values) {
            addCriterion("income_type in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotIn(List<Short> values) {
            addCriterion("income_type not in", values, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeBetween(Short value1, Short value2) {
            addCriterion("income_type between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andIncomeTypeNotBetween(Short value1, Short value2) {
            addCriterion("income_type not between", value1, value2, "incomeType");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(Short value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(Short value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(Short value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(Short value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(Short value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<Short> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<Short> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(Short value1, Short value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(Short value1, Short value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayServiceIsNull() {
            addCriterion("pay_service is null");
            return (Criteria) this;
        }

        public Criteria andPayServiceIsNotNull() {
            addCriterion("pay_service is not null");
            return (Criteria) this;
        }

        public Criteria andPayServiceEqualTo(Long value) {
            addCriterion("pay_service =", value, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceNotEqualTo(Long value) {
            addCriterion("pay_service <>", value, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceGreaterThan(Long value) {
            addCriterion("pay_service >", value, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_service >=", value, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceLessThan(Long value) {
            addCriterion("pay_service <", value, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceLessThanOrEqualTo(Long value) {
            addCriterion("pay_service <=", value, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceIn(List<Long> values) {
            addCriterion("pay_service in", values, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceNotIn(List<Long> values) {
            addCriterion("pay_service not in", values, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceBetween(Long value1, Long value2) {
            addCriterion("pay_service between", value1, value2, "payService");
            return (Criteria) this;
        }

        public Criteria andPayServiceNotBetween(Long value1, Long value2) {
            addCriterion("pay_service not between", value1, value2, "payService");
            return (Criteria) this;
        }

        public Criteria andPayReturnIsNull() {
            addCriterion("pay_return is null");
            return (Criteria) this;
        }

        public Criteria andPayReturnIsNotNull() {
            addCriterion("pay_return is not null");
            return (Criteria) this;
        }

        public Criteria andPayReturnEqualTo(Long value) {
            addCriterion("pay_return =", value, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnNotEqualTo(Long value) {
            addCriterion("pay_return <>", value, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnGreaterThan(Long value) {
            addCriterion("pay_return >", value, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnGreaterThanOrEqualTo(Long value) {
            addCriterion("pay_return >=", value, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnLessThan(Long value) {
            addCriterion("pay_return <", value, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnLessThanOrEqualTo(Long value) {
            addCriterion("pay_return <=", value, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnIn(List<Long> values) {
            addCriterion("pay_return in", values, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnNotIn(List<Long> values) {
            addCriterion("pay_return not in", values, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnBetween(Long value1, Long value2) {
            addCriterion("pay_return between", value1, value2, "payReturn");
            return (Criteria) this;
        }

        public Criteria andPayReturnNotBetween(Long value1, Long value2) {
            addCriterion("pay_return not between", value1, value2, "payReturn");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTradeNumIsNull() {
            addCriterion("trade_num is null");
            return (Criteria) this;
        }

        public Criteria andTradeNumIsNotNull() {
            addCriterion("trade_num is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNumEqualTo(String value) {
            addCriterion("trade_num =", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotEqualTo(String value) {
            addCriterion("trade_num <>", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumGreaterThan(String value) {
            addCriterion("trade_num >", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumGreaterThanOrEqualTo(String value) {
            addCriterion("trade_num >=", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLessThan(String value) {
            addCriterion("trade_num <", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLessThanOrEqualTo(String value) {
            addCriterion("trade_num <=", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumLike(String value) {
            addCriterion("trade_num like", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotLike(String value) {
            addCriterion("trade_num not like", value, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumIn(List<String> values) {
            addCriterion("trade_num in", values, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotIn(List<String> values) {
            addCriterion("trade_num not in", values, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumBetween(String value1, String value2) {
            addCriterion("trade_num between", value1, value2, "tradeNum");
            return (Criteria) this;
        }

        public Criteria andTradeNumNotBetween(String value1, String value2) {
            addCriterion("trade_num not between", value1, value2, "tradeNum");
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