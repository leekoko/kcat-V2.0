package cn.kcat.pojo;

import java.util.ArrayList;
import java.util.List;

public class ZysoftwareTitlesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ZysoftwareTitlesExample() {
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

        public Criteria andTitlesnameIsNull() {
            addCriterion("titleSName is null");
            return (Criteria) this;
        }

        public Criteria andTitlesnameIsNotNull() {
            addCriterion("titleSName is not null");
            return (Criteria) this;
        }

        public Criteria andTitlesnameEqualTo(String value) {
            addCriterion("titleSName =", value, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameNotEqualTo(String value) {
            addCriterion("titleSName <>", value, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameGreaterThan(String value) {
            addCriterion("titleSName >", value, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameGreaterThanOrEqualTo(String value) {
            addCriterion("titleSName >=", value, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameLessThan(String value) {
            addCriterion("titleSName <", value, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameLessThanOrEqualTo(String value) {
            addCriterion("titleSName <=", value, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameLike(String value) {
            addCriterion("titleSName like", value, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameNotLike(String value) {
            addCriterion("titleSName not like", value, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameIn(List<String> values) {
            addCriterion("titleSName in", values, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameNotIn(List<String> values) {
            addCriterion("titleSName not in", values, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameBetween(String value1, String value2) {
            addCriterion("titleSName between", value1, value2, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesnameNotBetween(String value1, String value2) {
            addCriterion("titleSName not between", value1, value2, "titlesname");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebIsNull() {
            addCriterion("titleS_to_titleB is null");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebIsNotNull() {
            addCriterion("titleS_to_titleB is not null");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebEqualTo(Integer value) {
            addCriterion("titleS_to_titleB =", value, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebNotEqualTo(Integer value) {
            addCriterion("titleS_to_titleB <>", value, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebGreaterThan(Integer value) {
            addCriterion("titleS_to_titleB >", value, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebGreaterThanOrEqualTo(Integer value) {
            addCriterion("titleS_to_titleB >=", value, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebLessThan(Integer value) {
            addCriterion("titleS_to_titleB <", value, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebLessThanOrEqualTo(Integer value) {
            addCriterion("titleS_to_titleB <=", value, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebIn(List<Integer> values) {
            addCriterion("titleS_to_titleB in", values, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebNotIn(List<Integer> values) {
            addCriterion("titleS_to_titleB not in", values, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebBetween(Integer value1, Integer value2) {
            addCriterion("titleS_to_titleB between", value1, value2, "titlesToTitleb");
            return (Criteria) this;
        }

        public Criteria andTitlesToTitlebNotBetween(Integer value1, Integer value2) {
            addCriterion("titleS_to_titleB not between", value1, value2, "titlesToTitleb");
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