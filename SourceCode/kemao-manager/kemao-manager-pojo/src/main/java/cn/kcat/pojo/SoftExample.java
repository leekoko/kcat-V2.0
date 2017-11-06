package cn.kcat.pojo;

import java.util.ArrayList;
import java.util.List;

public class SoftExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SoftExample() {
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

        public Criteria andSofttypeIsNull() {
            addCriterion("softType is null");
            return (Criteria) this;
        }

        public Criteria andSofttypeIsNotNull() {
            addCriterion("softType is not null");
            return (Criteria) this;
        }

        public Criteria andSofttypeEqualTo(String value) {
            addCriterion("softType =", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotEqualTo(String value) {
            addCriterion("softType <>", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeGreaterThan(String value) {
            addCriterion("softType >", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeGreaterThanOrEqualTo(String value) {
            addCriterion("softType >=", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLessThan(String value) {
            addCriterion("softType <", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLessThanOrEqualTo(String value) {
            addCriterion("softType <=", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeLike(String value) {
            addCriterion("softType like", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotLike(String value) {
            addCriterion("softType not like", value, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeIn(List<String> values) {
            addCriterion("softType in", values, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotIn(List<String> values) {
            addCriterion("softType not in", values, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeBetween(String value1, String value2) {
            addCriterion("softType between", value1, value2, "softtype");
            return (Criteria) this;
        }

        public Criteria andSofttypeNotBetween(String value1, String value2) {
            addCriterion("softType not between", value1, value2, "softtype");
            return (Criteria) this;
        }

        public Criteria andSoftimageIsNull() {
            addCriterion("softImage is null");
            return (Criteria) this;
        }

        public Criteria andSoftimageIsNotNull() {
            addCriterion("softImage is not null");
            return (Criteria) this;
        }

        public Criteria andSoftimageEqualTo(String value) {
            addCriterion("softImage =", value, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageNotEqualTo(String value) {
            addCriterion("softImage <>", value, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageGreaterThan(String value) {
            addCriterion("softImage >", value, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageGreaterThanOrEqualTo(String value) {
            addCriterion("softImage >=", value, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageLessThan(String value) {
            addCriterion("softImage <", value, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageLessThanOrEqualTo(String value) {
            addCriterion("softImage <=", value, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageLike(String value) {
            addCriterion("softImage like", value, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageNotLike(String value) {
            addCriterion("softImage not like", value, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageIn(List<String> values) {
            addCriterion("softImage in", values, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageNotIn(List<String> values) {
            addCriterion("softImage not in", values, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageBetween(String value1, String value2) {
            addCriterion("softImage between", value1, value2, "softimage");
            return (Criteria) this;
        }

        public Criteria andSoftimageNotBetween(String value1, String value2) {
            addCriterion("softImage not between", value1, value2, "softimage");
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

        public Criteria andSoftJianjieIsNull() {
            addCriterion("soft_jianjie is null");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieIsNotNull() {
            addCriterion("soft_jianjie is not null");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieEqualTo(String value) {
            addCriterion("soft_jianjie =", value, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieNotEqualTo(String value) {
            addCriterion("soft_jianjie <>", value, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieGreaterThan(String value) {
            addCriterion("soft_jianjie >", value, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieGreaterThanOrEqualTo(String value) {
            addCriterion("soft_jianjie >=", value, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieLessThan(String value) {
            addCriterion("soft_jianjie <", value, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieLessThanOrEqualTo(String value) {
            addCriterion("soft_jianjie <=", value, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieLike(String value) {
            addCriterion("soft_jianjie like", value, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieNotLike(String value) {
            addCriterion("soft_jianjie not like", value, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieIn(List<String> values) {
            addCriterion("soft_jianjie in", values, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieNotIn(List<String> values) {
            addCriterion("soft_jianjie not in", values, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieBetween(String value1, String value2) {
            addCriterion("soft_jianjie between", value1, value2, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJianjieNotBetween(String value1, String value2) {
            addCriterion("soft_jianjie not between", value1, value2, "softJianjie");
            return (Criteria) this;
        }

        public Criteria andSoftJietuIsNull() {
            addCriterion("soft_jietu is null");
            return (Criteria) this;
        }

        public Criteria andSoftJietuIsNotNull() {
            addCriterion("soft_jietu is not null");
            return (Criteria) this;
        }

        public Criteria andSoftJietuEqualTo(String value) {
            addCriterion("soft_jietu =", value, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuNotEqualTo(String value) {
            addCriterion("soft_jietu <>", value, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuGreaterThan(String value) {
            addCriterion("soft_jietu >", value, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuGreaterThanOrEqualTo(String value) {
            addCriterion("soft_jietu >=", value, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuLessThan(String value) {
            addCriterion("soft_jietu <", value, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuLessThanOrEqualTo(String value) {
            addCriterion("soft_jietu <=", value, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuLike(String value) {
            addCriterion("soft_jietu like", value, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuNotLike(String value) {
            addCriterion("soft_jietu not like", value, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuIn(List<String> values) {
            addCriterion("soft_jietu in", values, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuNotIn(List<String> values) {
            addCriterion("soft_jietu not in", values, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuBetween(String value1, String value2) {
            addCriterion("soft_jietu between", value1, value2, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSoftJietuNotBetween(String value1, String value2) {
            addCriterion("soft_jietu not between", value1, value2, "softJietu");
            return (Criteria) this;
        }

        public Criteria andSofturlIsNull() {
            addCriterion("softUrl is null");
            return (Criteria) this;
        }

        public Criteria andSofturlIsNotNull() {
            addCriterion("softUrl is not null");
            return (Criteria) this;
        }

        public Criteria andSofturlEqualTo(String value) {
            addCriterion("softUrl =", value, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlNotEqualTo(String value) {
            addCriterion("softUrl <>", value, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlGreaterThan(String value) {
            addCriterion("softUrl >", value, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlGreaterThanOrEqualTo(String value) {
            addCriterion("softUrl >=", value, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlLessThan(String value) {
            addCriterion("softUrl <", value, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlLessThanOrEqualTo(String value) {
            addCriterion("softUrl <=", value, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlLike(String value) {
            addCriterion("softUrl like", value, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlNotLike(String value) {
            addCriterion("softUrl not like", value, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlIn(List<String> values) {
            addCriterion("softUrl in", values, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlNotIn(List<String> values) {
            addCriterion("softUrl not in", values, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlBetween(String value1, String value2) {
            addCriterion("softUrl between", value1, value2, "softurl");
            return (Criteria) this;
        }

        public Criteria andSofturlNotBetween(String value1, String value2) {
            addCriterion("softUrl not between", value1, value2, "softurl");
            return (Criteria) this;
        }

        public Criteria andSoftDateIsNull() {
            addCriterion("soft_date is null");
            return (Criteria) this;
        }

        public Criteria andSoftDateIsNotNull() {
            addCriterion("soft_date is not null");
            return (Criteria) this;
        }

        public Criteria andSoftDateEqualTo(String value) {
            addCriterion("soft_date =", value, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateNotEqualTo(String value) {
            addCriterion("soft_date <>", value, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateGreaterThan(String value) {
            addCriterion("soft_date >", value, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateGreaterThanOrEqualTo(String value) {
            addCriterion("soft_date >=", value, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateLessThan(String value) {
            addCriterion("soft_date <", value, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateLessThanOrEqualTo(String value) {
            addCriterion("soft_date <=", value, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateLike(String value) {
            addCriterion("soft_date like", value, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateNotLike(String value) {
            addCriterion("soft_date not like", value, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateIn(List<String> values) {
            addCriterion("soft_date in", values, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateNotIn(List<String> values) {
            addCriterion("soft_date not in", values, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateBetween(String value1, String value2) {
            addCriterion("soft_date between", value1, value2, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftDateNotBetween(String value1, String value2) {
            addCriterion("soft_date not between", value1, value2, "softDate");
            return (Criteria) this;
        }

        public Criteria andSoftVersionIsNull() {
            addCriterion("soft_version is null");
            return (Criteria) this;
        }

        public Criteria andSoftVersionIsNotNull() {
            addCriterion("soft_version is not null");
            return (Criteria) this;
        }

        public Criteria andSoftVersionEqualTo(String value) {
            addCriterion("soft_version =", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionNotEqualTo(String value) {
            addCriterion("soft_version <>", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionGreaterThan(String value) {
            addCriterion("soft_version >", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionGreaterThanOrEqualTo(String value) {
            addCriterion("soft_version >=", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionLessThan(String value) {
            addCriterion("soft_version <", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionLessThanOrEqualTo(String value) {
            addCriterion("soft_version <=", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionLike(String value) {
            addCriterion("soft_version like", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionNotLike(String value) {
            addCriterion("soft_version not like", value, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionIn(List<String> values) {
            addCriterion("soft_version in", values, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionNotIn(List<String> values) {
            addCriterion("soft_version not in", values, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionBetween(String value1, String value2) {
            addCriterion("soft_version between", value1, value2, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftVersionNotBetween(String value1, String value2) {
            addCriterion("soft_version not between", value1, value2, "softVersion");
            return (Criteria) this;
        }

        public Criteria andSoftPwIsNull() {
            addCriterion("soft_pw is null");
            return (Criteria) this;
        }

        public Criteria andSoftPwIsNotNull() {
            addCriterion("soft_pw is not null");
            return (Criteria) this;
        }

        public Criteria andSoftPwEqualTo(String value) {
            addCriterion("soft_pw =", value, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwNotEqualTo(String value) {
            addCriterion("soft_pw <>", value, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwGreaterThan(String value) {
            addCriterion("soft_pw >", value, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwGreaterThanOrEqualTo(String value) {
            addCriterion("soft_pw >=", value, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwLessThan(String value) {
            addCriterion("soft_pw <", value, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwLessThanOrEqualTo(String value) {
            addCriterion("soft_pw <=", value, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwLike(String value) {
            addCriterion("soft_pw like", value, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwNotLike(String value) {
            addCriterion("soft_pw not like", value, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwIn(List<String> values) {
            addCriterion("soft_pw in", values, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwNotIn(List<String> values) {
            addCriterion("soft_pw not in", values, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwBetween(String value1, String value2) {
            addCriterion("soft_pw between", value1, value2, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftPwNotBetween(String value1, String value2) {
            addCriterion("soft_pw not between", value1, value2, "softPw");
            return (Criteria) this;
        }

        public Criteria andSoftVideoIsNull() {
            addCriterion("soft_video is null");
            return (Criteria) this;
        }

        public Criteria andSoftVideoIsNotNull() {
            addCriterion("soft_video is not null");
            return (Criteria) this;
        }

        public Criteria andSoftVideoEqualTo(String value) {
            addCriterion("soft_video =", value, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoNotEqualTo(String value) {
            addCriterion("soft_video <>", value, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoGreaterThan(String value) {
            addCriterion("soft_video >", value, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoGreaterThanOrEqualTo(String value) {
            addCriterion("soft_video >=", value, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoLessThan(String value) {
            addCriterion("soft_video <", value, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoLessThanOrEqualTo(String value) {
            addCriterion("soft_video <=", value, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoLike(String value) {
            addCriterion("soft_video like", value, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoNotLike(String value) {
            addCriterion("soft_video not like", value, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoIn(List<String> values) {
            addCriterion("soft_video in", values, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoNotIn(List<String> values) {
            addCriterion("soft_video not in", values, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoBetween(String value1, String value2) {
            addCriterion("soft_video between", value1, value2, "softVideo");
            return (Criteria) this;
        }

        public Criteria andSoftVideoNotBetween(String value1, String value2) {
            addCriterion("soft_video not between", value1, value2, "softVideo");
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