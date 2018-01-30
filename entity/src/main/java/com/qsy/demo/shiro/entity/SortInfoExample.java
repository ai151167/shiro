package com.qsy.demo.shiro.entity;

import java.util.ArrayList;
import java.util.List;

public class SortInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public SortInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
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
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
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

        public Criteria andSortIdIsNull() {
            addCriterion("SORT_ID is null");
            return (Criteria) this;
        }

        public Criteria andSortIdIsNotNull() {
            addCriterion("SORT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSortIdEqualTo(Integer value) {
            addCriterion("SORT_ID =", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotEqualTo(Integer value) {
            addCriterion("SORT_ID <>", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThan(Integer value) {
            addCriterion("SORT_ID >", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_ID >=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThan(Integer value) {
            addCriterion("SORT_ID <", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_ID <=", value, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdIn(List<Integer> values) {
            addCriterion("SORT_ID in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotIn(List<Integer> values) {
            addCriterion("SORT_ID not in", values, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdBetween(Integer value1, Integer value2) {
            addCriterion("SORT_ID between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortIdNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_ID not between", value1, value2, "sortId");
            return (Criteria) this;
        }

        public Criteria andSortNameIsNull() {
            addCriterion("SORT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andSortNameIsNotNull() {
            addCriterion("SORT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andSortNameEqualTo(String value) {
            addCriterion("SORT_NAME =", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotEqualTo(String value) {
            addCriterion("SORT_NAME <>", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameGreaterThan(String value) {
            addCriterion("SORT_NAME >", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameGreaterThanOrEqualTo(String value) {
            addCriterion("SORT_NAME >=", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLessThan(String value) {
            addCriterion("SORT_NAME <", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLessThanOrEqualTo(String value) {
            addCriterion("SORT_NAME <=", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameLike(String value) {
            addCriterion("SORT_NAME like", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotLike(String value) {
            addCriterion("SORT_NAME not like", value, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameIn(List<String> values) {
            addCriterion("SORT_NAME in", values, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotIn(List<String> values) {
            addCriterion("SORT_NAME not in", values, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameBetween(String value1, String value2) {
            addCriterion("SORT_NAME between", value1, value2, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortNameNotBetween(String value1, String value2) {
            addCriterion("SORT_NAME not between", value1, value2, "sortName");
            return (Criteria) this;
        }

        public Criteria andSortDescIsNull() {
            addCriterion("SORT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andSortDescIsNotNull() {
            addCriterion("SORT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andSortDescEqualTo(String value) {
            addCriterion("SORT_DESC =", value, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescNotEqualTo(String value) {
            addCriterion("SORT_DESC <>", value, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescGreaterThan(String value) {
            addCriterion("SORT_DESC >", value, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescGreaterThanOrEqualTo(String value) {
            addCriterion("SORT_DESC >=", value, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescLessThan(String value) {
            addCriterion("SORT_DESC <", value, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescLessThanOrEqualTo(String value) {
            addCriterion("SORT_DESC <=", value, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescLike(String value) {
            addCriterion("SORT_DESC like", value, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescNotLike(String value) {
            addCriterion("SORT_DESC not like", value, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescIn(List<String> values) {
            addCriterion("SORT_DESC in", values, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescNotIn(List<String> values) {
            addCriterion("SORT_DESC not in", values, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescBetween(String value1, String value2) {
            addCriterion("SORT_DESC between", value1, value2, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortDescNotBetween(String value1, String value2) {
            addCriterion("SORT_DESC not between", value1, value2, "sortDesc");
            return (Criteria) this;
        }

        public Criteria andSortParentIsNull() {
            addCriterion("SORT_PARENT is null");
            return (Criteria) this;
        }

        public Criteria andSortParentIsNotNull() {
            addCriterion("SORT_PARENT is not null");
            return (Criteria) this;
        }

        public Criteria andSortParentEqualTo(Integer value) {
            addCriterion("SORT_PARENT =", value, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentNotEqualTo(Integer value) {
            addCriterion("SORT_PARENT <>", value, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentGreaterThan(Integer value) {
            addCriterion("SORT_PARENT >", value, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentGreaterThanOrEqualTo(Integer value) {
            addCriterion("SORT_PARENT >=", value, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentLessThan(Integer value) {
            addCriterion("SORT_PARENT <", value, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentLessThanOrEqualTo(Integer value) {
            addCriterion("SORT_PARENT <=", value, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentIn(List<Integer> values) {
            addCriterion("SORT_PARENT in", values, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentNotIn(List<Integer> values) {
            addCriterion("SORT_PARENT not in", values, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentBetween(Integer value1, Integer value2) {
            addCriterion("SORT_PARENT between", value1, value2, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortParentNotBetween(Integer value1, Integer value2) {
            addCriterion("SORT_PARENT not between", value1, value2, "sortParent");
            return (Criteria) this;
        }

        public Criteria andSortStateIsNull() {
            addCriterion("SORT_STATE is null");
            return (Criteria) this;
        }

        public Criteria andSortStateIsNotNull() {
            addCriterion("SORT_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andSortStateEqualTo(String value) {
            addCriterion("SORT_STATE =", value, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateNotEqualTo(String value) {
            addCriterion("SORT_STATE <>", value, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateGreaterThan(String value) {
            addCriterion("SORT_STATE >", value, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateGreaterThanOrEqualTo(String value) {
            addCriterion("SORT_STATE >=", value, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateLessThan(String value) {
            addCriterion("SORT_STATE <", value, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateLessThanOrEqualTo(String value) {
            addCriterion("SORT_STATE <=", value, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateLike(String value) {
            addCriterion("SORT_STATE like", value, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateNotLike(String value) {
            addCriterion("SORT_STATE not like", value, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateIn(List<String> values) {
            addCriterion("SORT_STATE in", values, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateNotIn(List<String> values) {
            addCriterion("SORT_STATE not in", values, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateBetween(String value1, String value2) {
            addCriterion("SORT_STATE between", value1, value2, "sortState");
            return (Criteria) this;
        }

        public Criteria andSortStateNotBetween(String value1, String value2) {
            addCriterion("SORT_STATE not between", value1, value2, "sortState");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sort_info
     *
     * @mbg.generated do_not_delete_during_merge Tue Jan 30 11:59:11 CST 2018
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table sort_info
     *
     * @mbg.generated Tue Jan 30 11:59:11 CST 2018
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