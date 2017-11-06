package cn.kcat.pojo;

import java.util.ArrayList;
import java.util.List;

public class ZysoftwareExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZysoftwareExample() {
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

        public Criteria andSoftnameIsNull() {
            addCriterion("softName is null");
            return (Criteria) this;
        }

        public Criteria andSoftnameIsNotNull() {
            addCriterion("softName is not null");
            return (Criteria) this;
        }

        public Criteria andSoftnameEqualTo(String value) {
            addCriterion("softName =", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotEqualTo(String value) {
            addCriterion("softName <>", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameGreaterThan(String value) {
            addCriterion("softName >", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameGreaterThanOrEqualTo(String value) {
            addCriterion("softName >=", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLessThan(String value) {
            addCriterion("softName <", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLessThanOrEqualTo(String value) {
            addCriterion("softName <=", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameLike(String value) {
            addCriterion("softName like", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotLike(String value) {
            addCriterion("softName not like", value, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameIn(List<String> values) {
            addCriterion("softName in", values, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotIn(List<String> values) {
            addCriterion("softName not in", values, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameBetween(String value1, String value2) {
            addCriterion("softName between", value1, value2, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftnameNotBetween(String value1, String value2) {
            addCriterion("softName not between", value1, value2, "softname");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesIsNull() {
            addCriterion("soft_to_titleS is null");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesIsNotNull() {
            addCriterion("soft_to_titleS is not null");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesEqualTo(Integer value) {
            addCriterion("soft_to_titleS =", value, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesNotEqualTo(Integer value) {
            addCriterion("soft_to_titleS <>", value, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesGreaterThan(Integer value) {
            addCriterion("soft_to_titleS >", value, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesGreaterThanOrEqualTo(Integer value) {
            addCriterion("soft_to_titleS >=", value, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesLessThan(Integer value) {
            addCriterion("soft_to_titleS <", value, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesLessThanOrEqualTo(Integer value) {
            addCriterion("soft_to_titleS <=", value, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesIn(List<Integer> values) {
            addCriterion("soft_to_titleS in", values, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesNotIn(List<Integer> values) {
            addCriterion("soft_to_titleS not in", values, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesBetween(Integer value1, Integer value2) {
            addCriterion("soft_to_titleS between", value1, value2, "softToTitles");
            return (Criteria) this;
        }

        public Criteria andSoftToTitlesNotBetween(Integer value1, Integer value2) {
            addCriterion("soft_to_titleS not between", value1, value2, "softToTitles");
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