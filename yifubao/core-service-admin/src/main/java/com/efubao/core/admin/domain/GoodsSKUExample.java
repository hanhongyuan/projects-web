package com.efubao.core.admin.domain;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class GoodsSKUExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected int limitStart = -1;

    protected int limitEnd = -1;

    public GoodsSKUExample() {
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

    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    public int getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    public int getLimitEnd() {
        return limitEnd;
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNull() {
            addCriterion("goods_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIsNotNull() {
            addCriterion("goods_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsIdEqualTo(Long value) {
            addCriterion("goods_id =", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotEqualTo(Long value) {
            addCriterion("goods_id <>", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThan(Long value) {
            addCriterion("goods_id >", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("goods_id >=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThan(Long value) {
            addCriterion("goods_id <", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdLessThanOrEqualTo(Long value) {
            addCriterion("goods_id <=", value, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdIn(List<Long> values) {
            addCriterion("goods_id in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotIn(List<Long> values) {
            addCriterion("goods_id not in", values, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdBetween(Long value1, Long value2) {
            addCriterion("goods_id between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andGoodsIdNotBetween(Long value1, Long value2) {
            addCriterion("goods_id not between", value1, value2, "goodsId");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsIsNull() {
            addCriterion("attribute_ids is null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsIsNotNull() {
            addCriterion("attribute_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsEqualTo(String value) {
            addCriterion("attribute_ids =", value, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsNotEqualTo(String value) {
            addCriterion("attribute_ids <>", value, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsGreaterThan(String value) {
            addCriterion("attribute_ids >", value, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_ids >=", value, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsLessThan(String value) {
            addCriterion("attribute_ids <", value, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsLessThanOrEqualTo(String value) {
            addCriterion("attribute_ids <=", value, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsLike(String value) {
            addCriterion("attribute_ids like", value, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsNotLike(String value) {
            addCriterion("attribute_ids not like", value, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsIn(List<String> values) {
            addCriterion("attribute_ids in", values, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsNotIn(List<String> values) {
            addCriterion("attribute_ids not in", values, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsBetween(String value1, String value2) {
            addCriterion("attribute_ids between", value1, value2, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeIdsNotBetween(String value1, String value2) {
            addCriterion("attribute_ids not between", value1, value2, "attributeIds");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesIsNull() {
            addCriterion("attribute_names is null");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesIsNotNull() {
            addCriterion("attribute_names is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesEqualTo(String value) {
            addCriterion("attribute_names =", value, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesNotEqualTo(String value) {
            addCriterion("attribute_names <>", value, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesGreaterThan(String value) {
            addCriterion("attribute_names >", value, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_names >=", value, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesLessThan(String value) {
            addCriterion("attribute_names <", value, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesLessThanOrEqualTo(String value) {
            addCriterion("attribute_names <=", value, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesLike(String value) {
            addCriterion("attribute_names like", value, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesNotLike(String value) {
            addCriterion("attribute_names not like", value, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesIn(List<String> values) {
            addCriterion("attribute_names in", values, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesNotIn(List<String> values) {
            addCriterion("attribute_names not in", values, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesBetween(String value1, String value2) {
            addCriterion("attribute_names between", value1, value2, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeNamesNotBetween(String value1, String value2) {
            addCriterion("attribute_names not between", value1, value2, "attributeNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsIsNull() {
            addCriterion("attribute_value_ids is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsIsNotNull() {
            addCriterion("attribute_value_ids is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsEqualTo(String value) {
            addCriterion("attribute_value_ids =", value, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsNotEqualTo(String value) {
            addCriterion("attribute_value_ids <>", value, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsGreaterThan(String value) {
            addCriterion("attribute_value_ids >", value, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value_ids >=", value, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsLessThan(String value) {
            addCriterion("attribute_value_ids <", value, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsLessThanOrEqualTo(String value) {
            addCriterion("attribute_value_ids <=", value, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsLike(String value) {
            addCriterion("attribute_value_ids like", value, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsNotLike(String value) {
            addCriterion("attribute_value_ids not like", value, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsIn(List<String> values) {
            addCriterion("attribute_value_ids in", values, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsNotIn(List<String> values) {
            addCriterion("attribute_value_ids not in", values, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsBetween(String value1, String value2) {
            addCriterion("attribute_value_ids between", value1, value2, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueIdsNotBetween(String value1, String value2) {
            addCriterion("attribute_value_ids not between", value1, value2, "attributeValueIds");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesIsNull() {
            addCriterion("attribute_value_names is null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesIsNotNull() {
            addCriterion("attribute_value_names is not null");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesEqualTo(String value) {
            addCriterion("attribute_value_names =", value, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesNotEqualTo(String value) {
            addCriterion("attribute_value_names <>", value, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesGreaterThan(String value) {
            addCriterion("attribute_value_names >", value, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesGreaterThanOrEqualTo(String value) {
            addCriterion("attribute_value_names >=", value, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesLessThan(String value) {
            addCriterion("attribute_value_names <", value, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesLessThanOrEqualTo(String value) {
            addCriterion("attribute_value_names <=", value, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesLike(String value) {
            addCriterion("attribute_value_names like", value, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesNotLike(String value) {
            addCriterion("attribute_value_names not like", value, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesIn(List<String> values) {
            addCriterion("attribute_value_names in", values, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesNotIn(List<String> values) {
            addCriterion("attribute_value_names not in", values, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesBetween(String value1, String value2) {
            addCriterion("attribute_value_names between", value1, value2, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andAttributeValueNamesNotBetween(String value1, String value2) {
            addCriterion("attribute_value_names not between", value1, value2, "attributeValueNames");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNull() {
            addCriterion("image_path is null");
            return (Criteria) this;
        }

        public Criteria andImagePathIsNotNull() {
            addCriterion("image_path is not null");
            return (Criteria) this;
        }

        public Criteria andImagePathEqualTo(String value) {
            addCriterion("image_path =", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotEqualTo(String value) {
            addCriterion("image_path <>", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThan(String value) {
            addCriterion("image_path >", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathGreaterThanOrEqualTo(String value) {
            addCriterion("image_path >=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThan(String value) {
            addCriterion("image_path <", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLessThanOrEqualTo(String value) {
            addCriterion("image_path <=", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathLike(String value) {
            addCriterion("image_path like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotLike(String value) {
            addCriterion("image_path not like", value, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathIn(List<String> values) {
            addCriterion("image_path in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotIn(List<String> values) {
            addCriterion("image_path not in", values, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathBetween(String value1, String value2) {
            addCriterion("image_path between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andImagePathNotBetween(String value1, String value2) {
            addCriterion("image_path not between", value1, value2, "imagePath");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
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

        public Criteria andCreateTimeEqualTo(Timestamp value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Timestamp value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Timestamp value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Timestamp value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Timestamp> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Timestamp> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
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

        public Criteria andUpdateTimeEqualTo(Timestamp value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Timestamp value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Timestamp value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Timestamp value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Timestamp value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Timestamp value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Timestamp> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Timestamp> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Timestamp value1, Timestamp value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNull() {
            addCriterion("is_del is null");
            return (Criteria) this;
        }

        public Criteria andIsDelIsNotNull() {
            addCriterion("is_del is not null");
            return (Criteria) this;
        }

        public Criteria andIsDelEqualTo(Boolean value) {
            addCriterion("is_del =", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotEqualTo(Boolean value) {
            addCriterion("is_del <>", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThan(Boolean value) {
            addCriterion("is_del >", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_del >=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThan(Boolean value) {
            addCriterion("is_del <", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelLessThanOrEqualTo(Boolean value) {
            addCriterion("is_del <=", value, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelIn(List<Boolean> values) {
            addCriterion("is_del in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotIn(List<Boolean> values) {
            addCriterion("is_del not in", values, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del between", value1, value2, "isDel");
            return (Criteria) this;
        }

        public Criteria andIsDelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_del not between", value1, value2, "isDel");
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