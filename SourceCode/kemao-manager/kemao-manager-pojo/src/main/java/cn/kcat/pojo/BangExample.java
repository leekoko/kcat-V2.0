package cn.kcat.pojo;

import java.util.ArrayList;
import java.util.List;

public class BangExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BangExample() {
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

        public Criteria andVideonameIsNull() {
            addCriterion("videoName is null");
            return (Criteria) this;
        }

        public Criteria andVideonameIsNotNull() {
            addCriterion("videoName is not null");
            return (Criteria) this;
        }

        public Criteria andVideonameEqualTo(String value) {
            addCriterion("videoName =", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotEqualTo(String value) {
            addCriterion("videoName <>", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThan(String value) {
            addCriterion("videoName >", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameGreaterThanOrEqualTo(String value) {
            addCriterion("videoName >=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThan(String value) {
            addCriterion("videoName <", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLessThanOrEqualTo(String value) {
            addCriterion("videoName <=", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameLike(String value) {
            addCriterion("videoName like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotLike(String value) {
            addCriterion("videoName not like", value, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameIn(List<String> values) {
            addCriterion("videoName in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotIn(List<String> values) {
            addCriterion("videoName not in", values, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameBetween(String value1, String value2) {
            addCriterion("videoName between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideonameNotBetween(String value1, String value2) {
            addCriterion("videoName not between", value1, value2, "videoname");
            return (Criteria) this;
        }

        public Criteria andVideotypeIsNull() {
            addCriterion("videoType is null");
            return (Criteria) this;
        }

        public Criteria andVideotypeIsNotNull() {
            addCriterion("videoType is not null");
            return (Criteria) this;
        }

        public Criteria andVideotypeEqualTo(Integer value) {
            addCriterion("videoType =", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeNotEqualTo(Integer value) {
            addCriterion("videoType <>", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeGreaterThan(Integer value) {
            addCriterion("videoType >", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("videoType >=", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeLessThan(Integer value) {
            addCriterion("videoType <", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeLessThanOrEqualTo(Integer value) {
            addCriterion("videoType <=", value, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeIn(List<Integer> values) {
            addCriterion("videoType in", values, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeNotIn(List<Integer> values) {
            addCriterion("videoType not in", values, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeBetween(Integer value1, Integer value2) {
            addCriterion("videoType between", value1, value2, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideotypeNotBetween(Integer value1, Integer value2) {
            addCriterion("videoType not between", value1, value2, "videotype");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNull() {
            addCriterion("videoUrl is null");
            return (Criteria) this;
        }

        public Criteria andVideourlIsNotNull() {
            addCriterion("videoUrl is not null");
            return (Criteria) this;
        }

        public Criteria andVideourlEqualTo(String value) {
            addCriterion("videoUrl =", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotEqualTo(String value) {
            addCriterion("videoUrl <>", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThan(String value) {
            addCriterion("videoUrl >", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlGreaterThanOrEqualTo(String value) {
            addCriterion("videoUrl >=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThan(String value) {
            addCriterion("videoUrl <", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLessThanOrEqualTo(String value) {
            addCriterion("videoUrl <=", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlLike(String value) {
            addCriterion("videoUrl like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotLike(String value) {
            addCriterion("videoUrl not like", value, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlIn(List<String> values) {
            addCriterion("videoUrl in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotIn(List<String> values) {
            addCriterion("videoUrl not in", values, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlBetween(String value1, String value2) {
            addCriterion("videoUrl between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideourlNotBetween(String value1, String value2) {
            addCriterion("videoUrl not between", value1, value2, "videourl");
            return (Criteria) this;
        }

        public Criteria andVideoimageIsNull() {
            addCriterion("videoImage is null");
            return (Criteria) this;
        }

        public Criteria andVideoimageIsNotNull() {
            addCriterion("videoImage is not null");
            return (Criteria) this;
        }

        public Criteria andVideoimageEqualTo(String value) {
            addCriterion("videoImage =", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageNotEqualTo(String value) {
            addCriterion("videoImage <>", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageGreaterThan(String value) {
            addCriterion("videoImage >", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageGreaterThanOrEqualTo(String value) {
            addCriterion("videoImage >=", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageLessThan(String value) {
            addCriterion("videoImage <", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageLessThanOrEqualTo(String value) {
            addCriterion("videoImage <=", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageLike(String value) {
            addCriterion("videoImage like", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageNotLike(String value) {
            addCriterion("videoImage not like", value, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageIn(List<String> values) {
            addCriterion("videoImage in", values, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageNotIn(List<String> values) {
            addCriterion("videoImage not in", values, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageBetween(String value1, String value2) {
            addCriterion("videoImage between", value1, value2, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoimageNotBetween(String value1, String value2) {
            addCriterion("videoImage not between", value1, value2, "videoimage");
            return (Criteria) this;
        }

        public Criteria andVideoexplainIsNull() {
            addCriterion("videoExplain is null");
            return (Criteria) this;
        }

        public Criteria andVideoexplainIsNotNull() {
            addCriterion("videoExplain is not null");
            return (Criteria) this;
        }

        public Criteria andVideoexplainEqualTo(String value) {
            addCriterion("videoExplain =", value, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainNotEqualTo(String value) {
            addCriterion("videoExplain <>", value, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainGreaterThan(String value) {
            addCriterion("videoExplain >", value, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainGreaterThanOrEqualTo(String value) {
            addCriterion("videoExplain >=", value, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainLessThan(String value) {
            addCriterion("videoExplain <", value, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainLessThanOrEqualTo(String value) {
            addCriterion("videoExplain <=", value, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainLike(String value) {
            addCriterion("videoExplain like", value, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainNotLike(String value) {
            addCriterion("videoExplain not like", value, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainIn(List<String> values) {
            addCriterion("videoExplain in", values, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainNotIn(List<String> values) {
            addCriterion("videoExplain not in", values, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainBetween(String value1, String value2) {
            addCriterion("videoExplain between", value1, value2, "videoexplain");
            return (Criteria) this;
        }

        public Criteria andVideoexplainNotBetween(String value1, String value2) {
            addCriterion("videoExplain not between", value1, value2, "videoexplain");
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