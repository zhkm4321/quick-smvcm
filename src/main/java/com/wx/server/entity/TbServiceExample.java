package com.wx.server.entity;

import com.wx.server.vo.page.Page;
import java.util.ArrayList;
import java.util.List;

public class TbServiceExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    protected Page page;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public TbServiceExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public void setPage(Page page) {
        this.page=page;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_service
     *
     * @mbg.generated
     */
    public Page getPage() {
        return page;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_service
     *
     * @mbg.generated
     */
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

        public Criteria andCaretoryIdIsNull() {
            addCriterion("caretory_id is null");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdIsNotNull() {
            addCriterion("caretory_id is not null");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdEqualTo(Integer value) {
            addCriterion("caretory_id =", value, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdNotEqualTo(Integer value) {
            addCriterion("caretory_id <>", value, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdGreaterThan(Integer value) {
            addCriterion("caretory_id >", value, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("caretory_id >=", value, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdLessThan(Integer value) {
            addCriterion("caretory_id <", value, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("caretory_id <=", value, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdIn(List<Integer> values) {
            addCriterion("caretory_id in", values, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdNotIn(List<Integer> values) {
            addCriterion("caretory_id not in", values, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdBetween(Integer value1, Integer value2) {
            addCriterion("caretory_id between", value1, value2, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andCaretoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("caretory_id not between", value1, value2, "caretoryId");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNull() {
            addCriterion("service_name is null");
            return (Criteria) this;
        }

        public Criteria andServiceNameIsNotNull() {
            addCriterion("service_name is not null");
            return (Criteria) this;
        }

        public Criteria andServiceNameEqualTo(String value) {
            addCriterion("service_name =", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotEqualTo(String value) {
            addCriterion("service_name <>", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThan(String value) {
            addCriterion("service_name >", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameGreaterThanOrEqualTo(String value) {
            addCriterion("service_name >=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThan(String value) {
            addCriterion("service_name <", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLessThanOrEqualTo(String value) {
            addCriterion("service_name <=", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameLike(String value) {
            addCriterion("service_name like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotLike(String value) {
            addCriterion("service_name not like", value, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameIn(List<String> values) {
            addCriterion("service_name in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotIn(List<String> values) {
            addCriterion("service_name not in", values, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameBetween(String value1, String value2) {
            addCriterion("service_name between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceNameNotBetween(String value1, String value2) {
            addCriterion("service_name not between", value1, value2, "serviceName");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNull() {
            addCriterion("service_desc is null");
            return (Criteria) this;
        }

        public Criteria andServiceDescIsNotNull() {
            addCriterion("service_desc is not null");
            return (Criteria) this;
        }

        public Criteria andServiceDescEqualTo(String value) {
            addCriterion("service_desc =", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotEqualTo(String value) {
            addCriterion("service_desc <>", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThan(String value) {
            addCriterion("service_desc >", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescGreaterThanOrEqualTo(String value) {
            addCriterion("service_desc >=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThan(String value) {
            addCriterion("service_desc <", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLessThanOrEqualTo(String value) {
            addCriterion("service_desc <=", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescLike(String value) {
            addCriterion("service_desc like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotLike(String value) {
            addCriterion("service_desc not like", value, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescIn(List<String> values) {
            addCriterion("service_desc in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotIn(List<String> values) {
            addCriterion("service_desc not in", values, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescBetween(String value1, String value2) {
            addCriterion("service_desc between", value1, value2, "serviceDesc");
            return (Criteria) this;
        }

        public Criteria andServiceDescNotBetween(String value1, String value2) {
            addCriterion("service_desc not between", value1, value2, "serviceDesc");
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

        public Criteria andPriceEqualTo(Double value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(Double value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(Double value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(Double value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(Double value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<Double> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<Double> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(Double value1, Double value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(Double value1, Double value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andCommisionIsNull() {
            addCriterion("commision is null");
            return (Criteria) this;
        }

        public Criteria andCommisionIsNotNull() {
            addCriterion("commision is not null");
            return (Criteria) this;
        }

        public Criteria andCommisionEqualTo(Double value) {
            addCriterion("commision =", value, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionNotEqualTo(Double value) {
            addCriterion("commision <>", value, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionGreaterThan(Double value) {
            addCriterion("commision >", value, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionGreaterThanOrEqualTo(Double value) {
            addCriterion("commision >=", value, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionLessThan(Double value) {
            addCriterion("commision <", value, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionLessThanOrEqualTo(Double value) {
            addCriterion("commision <=", value, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionIn(List<Double> values) {
            addCriterion("commision in", values, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionNotIn(List<Double> values) {
            addCriterion("commision not in", values, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionBetween(Double value1, Double value2) {
            addCriterion("commision between", value1, value2, "commision");
            return (Criteria) this;
        }

        public Criteria andCommisionNotBetween(Double value1, Double value2) {
            addCriterion("commision not between", value1, value2, "commision");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceIsNull() {
            addCriterion("benefit_price is null");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceIsNotNull() {
            addCriterion("benefit_price is not null");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceEqualTo(Double value) {
            addCriterion("benefit_price =", value, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceNotEqualTo(Double value) {
            addCriterion("benefit_price <>", value, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceGreaterThan(Double value) {
            addCriterion("benefit_price >", value, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("benefit_price >=", value, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceLessThan(Double value) {
            addCriterion("benefit_price <", value, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceLessThanOrEqualTo(Double value) {
            addCriterion("benefit_price <=", value, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceIn(List<Double> values) {
            addCriterion("benefit_price in", values, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceNotIn(List<Double> values) {
            addCriterion("benefit_price not in", values, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceBetween(Double value1, Double value2) {
            addCriterion("benefit_price between", value1, value2, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andBenefitPriceNotBetween(Double value1, Double value2) {
            addCriterion("benefit_price not between", value1, value2, "benefitPrice");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_service
     *
     * @mbg.generated do_not_delete_during_merge
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table tb_service
     *
     * @mbg.generated
     */
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