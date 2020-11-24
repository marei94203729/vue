package com.cros.vue.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StoreExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public StoreExample() {
        oredCriteria = new ArrayList<>();
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
        public List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
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
            addCriterion("t1.ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("t1.ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("t1.ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("t1.ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("t1.ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("t1.ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("t1.ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("t1.ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("t1.ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAdClientIdIsNull() {
            addCriterion("t1.AD_CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdClientIdIsNotNull() {
            addCriterion("t1.AD_CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdClientIdEqualTo(Long value) {
            addCriterion("t1.AD_CLIENT_ID =", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotEqualTo(Long value) {
            addCriterion("t1.AD_CLIENT_ID <>", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdGreaterThan(Long value) {
            addCriterion("t1.AD_CLIENT_ID >", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.AD_CLIENT_ID >=", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdLessThan(Long value) {
            addCriterion("t1.AD_CLIENT_ID <", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.AD_CLIENT_ID <=", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdIn(List<Long> values) {
            addCriterion("t1.AD_CLIENT_ID in", values, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotIn(List<Long> values) {
            addCriterion("t1.AD_CLIENT_ID not in", values, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdBetween(Long value1, Long value2) {
            addCriterion("t1.AD_CLIENT_ID between", value1, value2, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.AD_CLIENT_ID not between", value1, value2, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIsNull() {
            addCriterion("t1.AD_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIsNotNull() {
            addCriterion("t1.AD_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdEqualTo(Long value) {
            addCriterion("t1.AD_ORG_ID =", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotEqualTo(Long value) {
            addCriterion("t1.AD_ORG_ID <>", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdGreaterThan(Long value) {
            addCriterion("t1.AD_ORG_ID >", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.AD_ORG_ID >=", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdLessThan(Long value) {
            addCriterion("t1.AD_ORG_ID <", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.AD_ORG_ID <=", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIn(List<Long> values) {
            addCriterion("t1.AD_ORG_ID in", values, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotIn(List<Long> values) {
            addCriterion("t1.AD_ORG_ID not in", values, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdBetween(Long value1, Long value2) {
            addCriterion("t1.AD_ORG_ID between", value1, value2, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.AD_ORG_ID not between", value1, value2, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("t1.ISACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("t1.ISACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("t1.ISACTIVE =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("t1.ISACTIVE <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("t1.ISACTIVE >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISACTIVE >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("t1.ISACTIVE <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("t1.ISACTIVE <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("t1.ISACTIVE like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("t1.ISACTIVE not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("t1.ISACTIVE in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("t1.ISACTIVE not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("t1.ISACTIVE between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("t1.ISACTIVE not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNull() {
            addCriterion("t1.MODIFIERID is null");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNotNull() {
            addCriterion("t1.MODIFIERID is not null");
            return (Criteria) this;
        }

        public Criteria andModifieridEqualTo(Long value) {
            addCriterion("t1.MODIFIERID =", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotEqualTo(Long value) {
            addCriterion("t1.MODIFIERID <>", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThan(Long value) {
            addCriterion("t1.MODIFIERID >", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.MODIFIERID >=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThan(Long value) {
            addCriterion("t1.MODIFIERID <", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThanOrEqualTo(Long value) {
            addCriterion("t1.MODIFIERID <=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridIn(List<Long> values) {
            addCriterion("t1.MODIFIERID in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotIn(List<Long> values) {
            addCriterion("t1.MODIFIERID not in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridBetween(Long value1, Long value2) {
            addCriterion("t1.MODIFIERID between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotBetween(Long value1, Long value2) {
            addCriterion("t1.MODIFIERID not between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("t1.CREATIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("t1.CREATIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterion("t1.CREATIONDATE =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("t1.CREATIONDATE <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("t1.CREATIONDATE >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.CREATIONDATE >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("t1.CREATIONDATE <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("t1.CREATIONDATE <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("t1.CREATIONDATE in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("t1.CREATIONDATE not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("t1.CREATIONDATE between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("t1.CREATIONDATE not between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNull() {
            addCriterion("t1.MODIFIEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNotNull() {
            addCriterion("t1.MODIFIEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddateEqualTo(Date value) {
            addCriterion("t1.MODIFIEDDATE =", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotEqualTo(Date value) {
            addCriterion("t1.MODIFIEDDATE <>", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThan(Date value) {
            addCriterion("t1.MODIFIEDDATE >", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.MODIFIEDDATE >=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThan(Date value) {
            addCriterion("t1.MODIFIEDDATE <", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThanOrEqualTo(Date value) {
            addCriterion("t1.MODIFIEDDATE <=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIn(List<Date> values) {
            addCriterion("t1.MODIFIEDDATE in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotIn(List<Date> values) {
            addCriterion("t1.MODIFIEDDATE not in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateBetween(Date value1, Date value2) {
            addCriterion("t1.MODIFIEDDATE between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotBetween(Date value1, Date value2) {
            addCriterion("t1.MODIFIEDDATE not between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("t1.OWNERID is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("t1.OWNERID is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Long value) {
            addCriterion("t1.OWNERID =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Long value) {
            addCriterion("t1.OWNERID <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Long value) {
            addCriterion("t1.OWNERID >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.OWNERID >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Long value) {
            addCriterion("t1.OWNERID <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Long value) {
            addCriterion("t1.OWNERID <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Long> values) {
            addCriterion("t1.OWNERID in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Long> values) {
            addCriterion("t1.OWNERID not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Long value1, Long value2) {
            addCriterion("t1.OWNERID between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Long value1, Long value2) {
            addCriterion("t1.OWNERID not between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("t1.NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("t1.NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("t1.NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("t1.NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("t1.NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("t1.NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("t1.NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("t1.NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("t1.NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("t1.NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("t1.NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("t1.NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("t1.NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("t1.NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("t1.DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("t1.DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("t1.DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("t1.DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("t1.DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("t1.DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("t1.DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("t1.DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("t1.DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("t1.DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("t1.DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("t1.DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("t1.DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("t1.DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIsNull() {
            addCriterion("t1.C_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIsNotNull() {
            addCriterion("t1.C_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCAreaIdEqualTo(Long value) {
            addCriterion("t1.C_AREA_ID =", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotEqualTo(Long value) {
            addCriterion("t1.C_AREA_ID <>", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdGreaterThan(Long value) {
            addCriterion("t1.C_AREA_ID >", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_AREA_ID >=", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdLessThan(Long value) {
            addCriterion("t1.C_AREA_ID <", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_AREA_ID <=", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIn(List<Long> values) {
            addCriterion("t1.C_AREA_ID in", values, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotIn(List<Long> values) {
            addCriterion("t1.C_AREA_ID not in", values, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_AREA_ID between", value1, value2, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_AREA_ID not between", value1, value2, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andLockcashIsNull() {
            addCriterion("t1.LOCKCASH is null");
            return (Criteria) this;
        }

        public Criteria andLockcashIsNotNull() {
            addCriterion("t1.LOCKCASH is not null");
            return (Criteria) this;
        }

        public Criteria andLockcashEqualTo(BigDecimal value) {
            addCriterion("t1.LOCKCASH =", value, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashNotEqualTo(BigDecimal value) {
            addCriterion("t1.LOCKCASH <>", value, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashGreaterThan(BigDecimal value) {
            addCriterion("t1.LOCKCASH >", value, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.LOCKCASH >=", value, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashLessThan(BigDecimal value) {
            addCriterion("t1.LOCKCASH <", value, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.LOCKCASH <=", value, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashIn(List<BigDecimal> values) {
            addCriterion("t1.LOCKCASH in", values, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashNotIn(List<BigDecimal> values) {
            addCriterion("t1.LOCKCASH not in", values, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.LOCKCASH between", value1, value2, "lockcash");
            return (Criteria) this;
        }

        public Criteria andLockcashNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.LOCKCASH not between", value1, value2, "lockcash");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("t1.ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("t1.ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("t1.ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("t1.ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("t1.ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("t1.ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("t1.ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("t1.ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("t1.ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("t1.ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("t1.ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("t1.ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("t1.ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("t1.PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("t1.PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("t1.PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("t1.PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("t1.PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("t1.PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("t1.PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("t1.PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("t1.PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("t1.PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("t1.PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("t1.PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("t1.PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("t1.PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("t1.FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("t1.FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("t1.FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("t1.FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("t1.FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("t1.FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("t1.FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("t1.FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("t1.FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("t1.FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("t1.FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("t1.FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("t1.FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("t1.FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andContactorIdIsNull() {
            addCriterion("t1.CONTACTOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andContactorIdIsNotNull() {
            addCriterion("t1.CONTACTOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andContactorIdEqualTo(Long value) {
            addCriterion("t1.CONTACTOR_ID =", value, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdNotEqualTo(Long value) {
            addCriterion("t1.CONTACTOR_ID <>", value, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdGreaterThan(Long value) {
            addCriterion("t1.CONTACTOR_ID >", value, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.CONTACTOR_ID >=", value, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdLessThan(Long value) {
            addCriterion("t1.CONTACTOR_ID <", value, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.CONTACTOR_ID <=", value, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdIn(List<Long> values) {
            addCriterion("t1.CONTACTOR_ID in", values, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdNotIn(List<Long> values) {
            addCriterion("t1.CONTACTOR_ID not in", values, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdBetween(Long value1, Long value2) {
            addCriterion("t1.CONTACTOR_ID between", value1, value2, "contactorId");
            return (Criteria) this;
        }

        public Criteria andContactorIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.CONTACTOR_ID not between", value1, value2, "contactorId");
            return (Criteria) this;
        }

        public Criteria andMonthfeeIsNull() {
            addCriterion("t1.MONTHFEE is null");
            return (Criteria) this;
        }

        public Criteria andMonthfeeIsNotNull() {
            addCriterion("t1.MONTHFEE is not null");
            return (Criteria) this;
        }

        public Criteria andMonthfeeEqualTo(BigDecimal value) {
            addCriterion("t1.MONTHFEE =", value, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeNotEqualTo(BigDecimal value) {
            addCriterion("t1.MONTHFEE <>", value, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeGreaterThan(BigDecimal value) {
            addCriterion("t1.MONTHFEE >", value, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.MONTHFEE >=", value, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLessThan(BigDecimal value) {
            addCriterion("t1.MONTHFEE <", value, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.MONTHFEE <=", value, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeIn(List<BigDecimal> values) {
            addCriterion("t1.MONTHFEE in", values, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeNotIn(List<BigDecimal> values) {
            addCriterion("t1.MONTHFEE not in", values, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.MONTHFEE between", value1, value2, "monthfee");
            return (Criteria) this;
        }

        public Criteria andMonthfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.MONTHFEE not between", value1, value2, "monthfee");
            return (Criteria) this;
        }

        public Criteria andIsStopIsNull() {
            addCriterion("t1.ISSTOP is null");
            return (Criteria) this;
        }

        public Criteria andIsStopIsNotNull() {
            addCriterion("t1.ISSTOP is not null");
            return (Criteria) this;
        }

        public Criteria andIsStopEqualTo(String value) {
            addCriterion("t1.ISSTOP =", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotEqualTo(String value) {
            addCriterion("t1.ISSTOP <>", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopGreaterThan(String value) {
            addCriterion("t1.ISSTOP >", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISSTOP >=", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopLessThan(String value) {
            addCriterion("t1.ISSTOP <", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopLessThanOrEqualTo(String value) {
            addCriterion("t1.ISSTOP <=", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopLike(String value) {
            addCriterion("t1.ISSTOP like", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotLike(String value) {
            addCriterion("t1.ISSTOP not like", value, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopIn(List<String> values) {
            addCriterion("t1.ISSTOP in", values, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotIn(List<String> values) {
            addCriterion("t1.ISSTOP not in", values, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopBetween(String value1, String value2) {
            addCriterion("t1.ISSTOP between", value1, value2, "isStop");
            return (Criteria) this;
        }

        public Criteria andIsStopNotBetween(String value1, String value2) {
            addCriterion("t1.ISSTOP not between", value1, value2, "isStop");
            return (Criteria) this;
        }

        public Criteria andRentbeginIsNull() {
            addCriterion("t1.RENTBEGIN is null");
            return (Criteria) this;
        }

        public Criteria andRentbeginIsNotNull() {
            addCriterion("t1.RENTBEGIN is not null");
            return (Criteria) this;
        }

        public Criteria andRentbeginEqualTo(Integer value) {
            addCriterion("t1.RENTBEGIN =", value, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginNotEqualTo(Integer value) {
            addCriterion("t1.RENTBEGIN <>", value, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginGreaterThan(Integer value) {
            addCriterion("t1.RENTBEGIN >", value, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.RENTBEGIN >=", value, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginLessThan(Integer value) {
            addCriterion("t1.RENTBEGIN <", value, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginLessThanOrEqualTo(Integer value) {
            addCriterion("t1.RENTBEGIN <=", value, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginIn(List<Integer> values) {
            addCriterion("t1.RENTBEGIN in", values, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginNotIn(List<Integer> values) {
            addCriterion("t1.RENTBEGIN not in", values, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginBetween(Integer value1, Integer value2) {
            addCriterion("t1.RENTBEGIN between", value1, value2, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentbeginNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.RENTBEGIN not between", value1, value2, "rentbegin");
            return (Criteria) this;
        }

        public Criteria andRentendIsNull() {
            addCriterion("t1.RENTEND is null");
            return (Criteria) this;
        }

        public Criteria andRentendIsNotNull() {
            addCriterion("t1.RENTEND is not null");
            return (Criteria) this;
        }

        public Criteria andRentendEqualTo(Integer value) {
            addCriterion("t1.RENTEND =", value, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendNotEqualTo(Integer value) {
            addCriterion("t1.RENTEND <>", value, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendGreaterThan(Integer value) {
            addCriterion("t1.RENTEND >", value, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.RENTEND >=", value, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendLessThan(Integer value) {
            addCriterion("t1.RENTEND <", value, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendLessThanOrEqualTo(Integer value) {
            addCriterion("t1.RENTEND <=", value, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendIn(List<Integer> values) {
            addCriterion("t1.RENTEND in", values, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendNotIn(List<Integer> values) {
            addCriterion("t1.RENTEND not in", values, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendBetween(Integer value1, Integer value2) {
            addCriterion("t1.RENTEND between", value1, value2, "rentend");
            return (Criteria) this;
        }

        public Criteria andRentendNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.RENTEND not between", value1, value2, "rentend");
            return (Criteria) this;
        }

        public Criteria andProportionIsNull() {
            addCriterion("t1.PROPORTION is null");
            return (Criteria) this;
        }

        public Criteria andProportionIsNotNull() {
            addCriterion("t1.PROPORTION is not null");
            return (Criteria) this;
        }

        public Criteria andProportionEqualTo(Integer value) {
            addCriterion("t1.PROPORTION =", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotEqualTo(Integer value) {
            addCriterion("t1.PROPORTION <>", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThan(Integer value) {
            addCriterion("t1.PROPORTION >", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.PROPORTION >=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThan(Integer value) {
            addCriterion("t1.PROPORTION <", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionLessThanOrEqualTo(Integer value) {
            addCriterion("t1.PROPORTION <=", value, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionIn(List<Integer> values) {
            addCriterion("t1.PROPORTION in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotIn(List<Integer> values) {
            addCriterion("t1.PROPORTION not in", values, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionBetween(Integer value1, Integer value2) {
            addCriterion("t1.PROPORTION between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andProportionNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.PROPORTION not between", value1, value2, "proportion");
            return (Criteria) this;
        }

        public Criteria andEmpcntIsNull() {
            addCriterion("t1.EMPCNT is null");
            return (Criteria) this;
        }

        public Criteria andEmpcntIsNotNull() {
            addCriterion("t1.EMPCNT is not null");
            return (Criteria) this;
        }

        public Criteria andEmpcntEqualTo(Integer value) {
            addCriterion("t1.EMPCNT =", value, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntNotEqualTo(Integer value) {
            addCriterion("t1.EMPCNT <>", value, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntGreaterThan(Integer value) {
            addCriterion("t1.EMPCNT >", value, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.EMPCNT >=", value, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntLessThan(Integer value) {
            addCriterion("t1.EMPCNT <", value, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntLessThanOrEqualTo(Integer value) {
            addCriterion("t1.EMPCNT <=", value, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntIn(List<Integer> values) {
            addCriterion("t1.EMPCNT in", values, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntNotIn(List<Integer> values) {
            addCriterion("t1.EMPCNT not in", values, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntBetween(Integer value1, Integer value2) {
            addCriterion("t1.EMPCNT between", value1, value2, "empcnt");
            return (Criteria) this;
        }

        public Criteria andEmpcntNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.EMPCNT not between", value1, value2, "empcnt");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNull() {
            addCriterion("t1.CHECKDATE is null");
            return (Criteria) this;
        }

        public Criteria andCheckdateIsNotNull() {
            addCriterion("t1.CHECKDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckdateEqualTo(Integer value) {
            addCriterion("t1.CHECKDATE =", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotEqualTo(Integer value) {
            addCriterion("t1.CHECKDATE <>", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThan(Integer value) {
            addCriterion("t1.CHECKDATE >", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.CHECKDATE >=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThan(Integer value) {
            addCriterion("t1.CHECKDATE <", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateLessThanOrEqualTo(Integer value) {
            addCriterion("t1.CHECKDATE <=", value, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateIn(List<Integer> values) {
            addCriterion("t1.CHECKDATE in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotIn(List<Integer> values) {
            addCriterion("t1.CHECKDATE not in", values, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateBetween(Integer value1, Integer value2) {
            addCriterion("t1.CHECKDATE between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andCheckdateNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.CHECKDATE not between", value1, value2, "checkdate");
            return (Criteria) this;
        }

        public Criteria andIscenterIsNull() {
            addCriterion("t1.ISCENTER is null");
            return (Criteria) this;
        }

        public Criteria andIscenterIsNotNull() {
            addCriterion("t1.ISCENTER is not null");
            return (Criteria) this;
        }

        public Criteria andIscenterEqualTo(String value) {
            addCriterion("t1.ISCENTER =", value, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterNotEqualTo(String value) {
            addCriterion("t1.ISCENTER <>", value, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterGreaterThan(String value) {
            addCriterion("t1.ISCENTER >", value, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISCENTER >=", value, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterLessThan(String value) {
            addCriterion("t1.ISCENTER <", value, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterLessThanOrEqualTo(String value) {
            addCriterion("t1.ISCENTER <=", value, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterLike(String value) {
            addCriterion("t1.ISCENTER like", value, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterNotLike(String value) {
            addCriterion("t1.ISCENTER not like", value, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterIn(List<String> values) {
            addCriterion("t1.ISCENTER in", values, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterNotIn(List<String> values) {
            addCriterion("t1.ISCENTER not in", values, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterBetween(String value1, String value2) {
            addCriterion("t1.ISCENTER between", value1, value2, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIscenterNotBetween(String value1, String value2) {
            addCriterion("t1.ISCENTER not between", value1, value2, "iscenter");
            return (Criteria) this;
        }

        public Criteria andIsretailIsNull() {
            addCriterion("t1.ISRETAIL is null");
            return (Criteria) this;
        }

        public Criteria andIsretailIsNotNull() {
            addCriterion("t1.ISRETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andIsretailEqualTo(String value) {
            addCriterion("t1.ISRETAIL =", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailNotEqualTo(String value) {
            addCriterion("t1.ISRETAIL <>", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailGreaterThan(String value) {
            addCriterion("t1.ISRETAIL >", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISRETAIL >=", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailLessThan(String value) {
            addCriterion("t1.ISRETAIL <", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailLessThanOrEqualTo(String value) {
            addCriterion("t1.ISRETAIL <=", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailLike(String value) {
            addCriterion("t1.ISRETAIL like", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailNotLike(String value) {
            addCriterion("t1.ISRETAIL not like", value, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailIn(List<String> values) {
            addCriterion("t1.ISRETAIL in", values, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailNotIn(List<String> values) {
            addCriterion("t1.ISRETAIL not in", values, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailBetween(String value1, String value2) {
            addCriterion("t1.ISRETAIL between", value1, value2, "isretail");
            return (Criteria) this;
        }

        public Criteria andIsretailNotBetween(String value1, String value2) {
            addCriterion("t1.ISRETAIL not between", value1, value2, "isretail");
            return (Criteria) this;
        }

        public Criteria andMobilIsNull() {
            addCriterion("t1.MOBIL is null");
            return (Criteria) this;
        }

        public Criteria andMobilIsNotNull() {
            addCriterion("t1.MOBIL is not null");
            return (Criteria) this;
        }

        public Criteria andMobilEqualTo(String value) {
            addCriterion("t1.MOBIL =", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilNotEqualTo(String value) {
            addCriterion("t1.MOBIL <>", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilGreaterThan(String value) {
            addCriterion("t1.MOBIL >", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilGreaterThanOrEqualTo(String value) {
            addCriterion("t1.MOBIL >=", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilLessThan(String value) {
            addCriterion("t1.MOBIL <", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilLessThanOrEqualTo(String value) {
            addCriterion("t1.MOBIL <=", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilLike(String value) {
            addCriterion("t1.MOBIL like", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilNotLike(String value) {
            addCriterion("t1.MOBIL not like", value, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilIn(List<String> values) {
            addCriterion("t1.MOBIL in", values, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilNotIn(List<String> values) {
            addCriterion("t1.MOBIL not in", values, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilBetween(String value1, String value2) {
            addCriterion("t1.MOBIL between", value1, value2, "mobil");
            return (Criteria) this;
        }

        public Criteria andMobilNotBetween(String value1, String value2) {
            addCriterion("t1.MOBIL not between", value1, value2, "mobil");
            return (Criteria) this;
        }

        public Criteria andSnameIsNull() {
            addCriterion("t1.SNAME is null");
            return (Criteria) this;
        }

        public Criteria andSnameIsNotNull() {
            addCriterion("t1.SNAME is not null");
            return (Criteria) this;
        }

        public Criteria andSnameEqualTo(String value) {
            addCriterion("t1.SNAME =", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotEqualTo(String value) {
            addCriterion("t1.SNAME <>", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThan(String value) {
            addCriterion("t1.SNAME >", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameGreaterThanOrEqualTo(String value) {
            addCriterion("t1.SNAME >=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThan(String value) {
            addCriterion("t1.SNAME <", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLessThanOrEqualTo(String value) {
            addCriterion("t1.SNAME <=", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameLike(String value) {
            addCriterion("t1.SNAME like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotLike(String value) {
            addCriterion("t1.SNAME not like", value, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameIn(List<String> values) {
            addCriterion("t1.SNAME in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotIn(List<String> values) {
            addCriterion("t1.SNAME not in", values, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameBetween(String value1, String value2) {
            addCriterion("t1.SNAME between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andSnameNotBetween(String value1, String value2) {
            addCriterion("t1.SNAME not between", value1, value2, "sname");
            return (Criteria) this;
        }

        public Criteria andPostcalIsNull() {
            addCriterion("t1.POSTCAL is null");
            return (Criteria) this;
        }

        public Criteria andPostcalIsNotNull() {
            addCriterion("t1.POSTCAL is not null");
            return (Criteria) this;
        }

        public Criteria andPostcalEqualTo(BigDecimal value) {
            addCriterion("t1.POSTCAL =", value, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalNotEqualTo(BigDecimal value) {
            addCriterion("t1.POSTCAL <>", value, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalGreaterThan(BigDecimal value) {
            addCriterion("t1.POSTCAL >", value, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.POSTCAL >=", value, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalLessThan(BigDecimal value) {
            addCriterion("t1.POSTCAL <", value, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.POSTCAL <=", value, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalIn(List<BigDecimal> values) {
            addCriterion("t1.POSTCAL in", values, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalNotIn(List<BigDecimal> values) {
            addCriterion("t1.POSTCAL not in", values, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.POSTCAL between", value1, value2, "postcal");
            return (Criteria) this;
        }

        public Criteria andPostcalNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.POSTCAL not between", value1, value2, "postcal");
            return (Criteria) this;
        }

        public Criteria andCalculationIsNull() {
            addCriterion("t1.CALCULATION is null");
            return (Criteria) this;
        }

        public Criteria andCalculationIsNotNull() {
            addCriterion("t1.CALCULATION is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationEqualTo(String value) {
            addCriterion("t1.CALCULATION =", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationNotEqualTo(String value) {
            addCriterion("t1.CALCULATION <>", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationGreaterThan(String value) {
            addCriterion("t1.CALCULATION >", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CALCULATION >=", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationLessThan(String value) {
            addCriterion("t1.CALCULATION <", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationLessThanOrEqualTo(String value) {
            addCriterion("t1.CALCULATION <=", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationLike(String value) {
            addCriterion("t1.CALCULATION like", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationNotLike(String value) {
            addCriterion("t1.CALCULATION not like", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationIn(List<String> values) {
            addCriterion("t1.CALCULATION in", values, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationNotIn(List<String> values) {
            addCriterion("t1.CALCULATION not in", values, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationBetween(String value1, String value2) {
            addCriterion("t1.CALCULATION between", value1, value2, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationNotBetween(String value1, String value2) {
            addCriterion("t1.CALCULATION not between", value1, value2, "calculation");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdIsNull() {
            addCriterion("t1.C_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdIsNotNull() {
            addCriterion("t1.C_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdEqualTo(Long value) {
            addCriterion("t1.C_CUSTOMER_ID =", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotEqualTo(Long value) {
            addCriterion("t1.C_CUSTOMER_ID <>", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdGreaterThan(Long value) {
            addCriterion("t1.C_CUSTOMER_ID >", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_CUSTOMER_ID >=", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdLessThan(Long value) {
            addCriterion("t1.C_CUSTOMER_ID <", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_CUSTOMER_ID <=", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdIn(List<Long> values) {
            addCriterion("t1.C_CUSTOMER_ID in", values, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotIn(List<Long> values) {
            addCriterion("t1.C_CUSTOMER_ID not in", values, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_CUSTOMER_ID between", value1, value2, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_CUSTOMER_ID not between", value1, value2, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdIsNull() {
            addCriterion("t1.C_CUSTOMERUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdIsNotNull() {
            addCriterion("t1.C_CUSTOMERUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdEqualTo(Long value) {
            addCriterion("t1.C_CUSTOMERUP_ID =", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdNotEqualTo(Long value) {
            addCriterion("t1.C_CUSTOMERUP_ID <>", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdGreaterThan(Long value) {
            addCriterion("t1.C_CUSTOMERUP_ID >", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_CUSTOMERUP_ID >=", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdLessThan(Long value) {
            addCriterion("t1.C_CUSTOMERUP_ID <", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_CUSTOMERUP_ID <=", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdIn(List<Long> values) {
            addCriterion("t1.C_CUSTOMERUP_ID in", values, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdNotIn(List<Long> values) {
            addCriterion("t1.C_CUSTOMERUP_ID not in", values, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_CUSTOMERUP_ID between", value1, value2, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_CUSTOMERUP_ID not between", value1, value2, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdIsNull() {
            addCriterion("t1.C_PRICEAREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdIsNotNull() {
            addCriterion("t1.C_PRICEAREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdEqualTo(Long value) {
            addCriterion("t1.C_PRICEAREA_ID =", value, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdNotEqualTo(Long value) {
            addCriterion("t1.C_PRICEAREA_ID <>", value, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdGreaterThan(Long value) {
            addCriterion("t1.C_PRICEAREA_ID >", value, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_PRICEAREA_ID >=", value, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdLessThan(Long value) {
            addCriterion("t1.C_PRICEAREA_ID <", value, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_PRICEAREA_ID <=", value, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdIn(List<Long> values) {
            addCriterion("t1.C_PRICEAREA_ID in", values, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdNotIn(List<Long> values) {
            addCriterion("t1.C_PRICEAREA_ID not in", values, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_PRICEAREA_ID between", value1, value2, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andCPriceareaIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_PRICEAREA_ID not between", value1, value2, "cPriceareaId");
            return (Criteria) this;
        }

        public Criteria andIsfairorigIsNull() {
            addCriterion("t1.ISFAIRORIG is null");
            return (Criteria) this;
        }

        public Criteria andIsfairorigIsNotNull() {
            addCriterion("t1.ISFAIRORIG is not null");
            return (Criteria) this;
        }

        public Criteria andIsfairorigEqualTo(String value) {
            addCriterion("t1.ISFAIRORIG =", value, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigNotEqualTo(String value) {
            addCriterion("t1.ISFAIRORIG <>", value, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigGreaterThan(String value) {
            addCriterion("t1.ISFAIRORIG >", value, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISFAIRORIG >=", value, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigLessThan(String value) {
            addCriterion("t1.ISFAIRORIG <", value, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigLessThanOrEqualTo(String value) {
            addCriterion("t1.ISFAIRORIG <=", value, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigLike(String value) {
            addCriterion("t1.ISFAIRORIG like", value, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigNotLike(String value) {
            addCriterion("t1.ISFAIRORIG not like", value, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigIn(List<String> values) {
            addCriterion("t1.ISFAIRORIG in", values, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigNotIn(List<String> values) {
            addCriterion("t1.ISFAIRORIG not in", values, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigBetween(String value1, String value2) {
            addCriterion("t1.ISFAIRORIG between", value1, value2, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andIsfairorigNotBetween(String value1, String value2) {
            addCriterion("t1.ISFAIRORIG not between", value1, value2, "isfairorig");
            return (Criteria) this;
        }

        public Criteria andAreamngIdIsNull() {
            addCriterion("t1.AREAMNG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreamngIdIsNotNull() {
            addCriterion("t1.AREAMNG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreamngIdEqualTo(Long value) {
            addCriterion("t1.AREAMNG_ID =", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdNotEqualTo(Long value) {
            addCriterion("t1.AREAMNG_ID <>", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdGreaterThan(Long value) {
            addCriterion("t1.AREAMNG_ID >", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.AREAMNG_ID >=", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdLessThan(Long value) {
            addCriterion("t1.AREAMNG_ID <", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.AREAMNG_ID <=", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdIn(List<Long> values) {
            addCriterion("t1.AREAMNG_ID in", values, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdNotIn(List<Long> values) {
            addCriterion("t1.AREAMNG_ID not in", values, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdBetween(Long value1, Long value2) {
            addCriterion("t1.AREAMNG_ID between", value1, value2, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.AREAMNG_ID not between", value1, value2, "areamngId");
            return (Criteria) this;
        }

        public Criteria andLimitqtyIsNull() {
            addCriterion("t1.LIMITQTY is null");
            return (Criteria) this;
        }

        public Criteria andLimitqtyIsNotNull() {
            addCriterion("t1.LIMITQTY is not null");
            return (Criteria) this;
        }

        public Criteria andLimitqtyEqualTo(Long value) {
            addCriterion("t1.LIMITQTY =", value, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyNotEqualTo(Long value) {
            addCriterion("t1.LIMITQTY <>", value, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyGreaterThan(Long value) {
            addCriterion("t1.LIMITQTY >", value, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.LIMITQTY >=", value, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyLessThan(Long value) {
            addCriterion("t1.LIMITQTY <", value, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyLessThanOrEqualTo(Long value) {
            addCriterion("t1.LIMITQTY <=", value, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyIn(List<Long> values) {
            addCriterion("t1.LIMITQTY in", values, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyNotIn(List<Long> values) {
            addCriterion("t1.LIMITQTY not in", values, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyBetween(Long value1, Long value2) {
            addCriterion("t1.LIMITQTY between", value1, value2, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitqtyNotBetween(Long value1, Long value2) {
            addCriterion("t1.LIMITQTY not between", value1, value2, "limitqty");
            return (Criteria) this;
        }

        public Criteria andLimitamtIsNull() {
            addCriterion("t1.LIMITAMT is null");
            return (Criteria) this;
        }

        public Criteria andLimitamtIsNotNull() {
            addCriterion("t1.LIMITAMT is not null");
            return (Criteria) this;
        }

        public Criteria andLimitamtEqualTo(BigDecimal value) {
            addCriterion("t1.LIMITAMT =", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtNotEqualTo(BigDecimal value) {
            addCriterion("t1.LIMITAMT <>", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtGreaterThan(BigDecimal value) {
            addCriterion("t1.LIMITAMT >", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.LIMITAMT >=", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtLessThan(BigDecimal value) {
            addCriterion("t1.LIMITAMT <", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.LIMITAMT <=", value, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtIn(List<BigDecimal> values) {
            addCriterion("t1.LIMITAMT in", values, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtNotIn(List<BigDecimal> values) {
            addCriterion("t1.LIMITAMT not in", values, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.LIMITAMT between", value1, value2, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.LIMITAMT not between", value1, value2, "limitamt");
            return (Criteria) this;
        }

        public Criteria andLimitmoIsNull() {
            addCriterion("t1.LIMITMO is null");
            return (Criteria) this;
        }

        public Criteria andLimitmoIsNotNull() {
            addCriterion("t1.LIMITMO is not null");
            return (Criteria) this;
        }

        public Criteria andLimitmoEqualTo(String value) {
            addCriterion("t1.LIMITMO =", value, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoNotEqualTo(String value) {
            addCriterion("t1.LIMITMO <>", value, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoGreaterThan(String value) {
            addCriterion("t1.LIMITMO >", value, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.LIMITMO >=", value, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoLessThan(String value) {
            addCriterion("t1.LIMITMO <", value, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoLessThanOrEqualTo(String value) {
            addCriterion("t1.LIMITMO <=", value, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoLike(String value) {
            addCriterion("t1.LIMITMO like", value, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoNotLike(String value) {
            addCriterion("t1.LIMITMO not like", value, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoIn(List<String> values) {
            addCriterion("t1.LIMITMO in", values, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoNotIn(List<String> values) {
            addCriterion("t1.LIMITMO not in", values, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoBetween(String value1, String value2) {
            addCriterion("t1.LIMITMO between", value1, value2, "limitmo");
            return (Criteria) this;
        }

        public Criteria andLimitmoNotBetween(String value1, String value2) {
            addCriterion("t1.LIMITMO not between", value1, value2, "limitmo");
            return (Criteria) this;
        }

        public Criteria andMarkdisIsNull() {
            addCriterion("t1.MARKDIS is null");
            return (Criteria) this;
        }

        public Criteria andMarkdisIsNotNull() {
            addCriterion("t1.MARKDIS is not null");
            return (Criteria) this;
        }

        public Criteria andMarkdisEqualTo(BigDecimal value) {
            addCriterion("t1.MARKDIS =", value, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisNotEqualTo(BigDecimal value) {
            addCriterion("t1.MARKDIS <>", value, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisGreaterThan(BigDecimal value) {
            addCriterion("t1.MARKDIS >", value, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.MARKDIS >=", value, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisLessThan(BigDecimal value) {
            addCriterion("t1.MARKDIS <", value, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.MARKDIS <=", value, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisIn(List<BigDecimal> values) {
            addCriterion("t1.MARKDIS in", values, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisNotIn(List<BigDecimal> values) {
            addCriterion("t1.MARKDIS not in", values, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.MARKDIS between", value1, value2, "markdis");
            return (Criteria) this;
        }

        public Criteria andMarkdisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.MARKDIS not between", value1, value2, "markdis");
            return (Criteria) this;
        }

        public Criteria andDateblockIsNull() {
            addCriterion("t1.DATEBLOCK is null");
            return (Criteria) this;
        }

        public Criteria andDateblockIsNotNull() {
            addCriterion("t1.DATEBLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andDateblockEqualTo(Integer value) {
            addCriterion("t1.DATEBLOCK =", value, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockNotEqualTo(Integer value) {
            addCriterion("t1.DATEBLOCK <>", value, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockGreaterThan(Integer value) {
            addCriterion("t1.DATEBLOCK >", value, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.DATEBLOCK >=", value, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockLessThan(Integer value) {
            addCriterion("t1.DATEBLOCK <", value, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockLessThanOrEqualTo(Integer value) {
            addCriterion("t1.DATEBLOCK <=", value, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockIn(List<Integer> values) {
            addCriterion("t1.DATEBLOCK in", values, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockNotIn(List<Integer> values) {
            addCriterion("t1.DATEBLOCK not in", values, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockBetween(Integer value1, Integer value2) {
            addCriterion("t1.DATEBLOCK between", value1, value2, "dateblock");
            return (Criteria) this;
        }

        public Criteria andDateblockNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.DATEBLOCK not between", value1, value2, "dateblock");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdIsNull() {
            addCriterion("t1.C_STORETYPE_JZ_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdIsNotNull() {
            addCriterion("t1.C_STORETYPE_JZ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdEqualTo(Long value) {
            addCriterion("t1.C_STORETYPE_JZ_ID =", value, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdNotEqualTo(Long value) {
            addCriterion("t1.C_STORETYPE_JZ_ID <>", value, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdGreaterThan(Long value) {
            addCriterion("t1.C_STORETYPE_JZ_ID >", value, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STORETYPE_JZ_ID >=", value, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdLessThan(Long value) {
            addCriterion("t1.C_STORETYPE_JZ_ID <", value, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STORETYPE_JZ_ID <=", value, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdIn(List<Long> values) {
            addCriterion("t1.C_STORETYPE_JZ_ID in", values, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdNotIn(List<Long> values) {
            addCriterion("t1.C_STORETYPE_JZ_ID not in", values, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STORETYPE_JZ_ID between", value1, value2, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andCStoretypeJzIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STORETYPE_JZ_ID not between", value1, value2, "cStoretypeJzId");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNull() {
            addCriterion("t1.IMGURL1 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNotNull() {
            addCriterion("t1.IMGURL1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl1EqualTo(String value) {
            addCriterion("t1.IMGURL1 =", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotEqualTo(String value) {
            addCriterion("t1.IMGURL1 <>", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThan(String value) {
            addCriterion("t1.IMGURL1 >", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL1 >=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThan(String value) {
            addCriterion("t1.IMGURL1 <", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL1 <=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Like(String value) {
            addCriterion("t1.IMGURL1 like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotLike(String value) {
            addCriterion("t1.IMGURL1 not like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1In(List<String> values) {
            addCriterion("t1.IMGURL1 in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotIn(List<String> values) {
            addCriterion("t1.IMGURL1 not in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Between(String value1, String value2) {
            addCriterion("t1.IMGURL1 between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotBetween(String value1, String value2) {
            addCriterion("t1.IMGURL1 not between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNull() {
            addCriterion("t1.IMGURL2 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNotNull() {
            addCriterion("t1.IMGURL2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl2EqualTo(String value) {
            addCriterion("t1.IMGURL2 =", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotEqualTo(String value) {
            addCriterion("t1.IMGURL2 <>", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThan(String value) {
            addCriterion("t1.IMGURL2 >", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL2 >=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThan(String value) {
            addCriterion("t1.IMGURL2 <", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL2 <=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Like(String value) {
            addCriterion("t1.IMGURL2 like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotLike(String value) {
            addCriterion("t1.IMGURL2 not like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2In(List<String> values) {
            addCriterion("t1.IMGURL2 in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotIn(List<String> values) {
            addCriterion("t1.IMGURL2 not in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Between(String value1, String value2) {
            addCriterion("t1.IMGURL2 between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotBetween(String value1, String value2) {
            addCriterion("t1.IMGURL2 not between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNull() {
            addCriterion("t1.IMGURL3 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNotNull() {
            addCriterion("t1.IMGURL3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl3EqualTo(String value) {
            addCriterion("t1.IMGURL3 =", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotEqualTo(String value) {
            addCriterion("t1.IMGURL3 <>", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThan(String value) {
            addCriterion("t1.IMGURL3 >", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL3 >=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThan(String value) {
            addCriterion("t1.IMGURL3 <", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL3 <=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Like(String value) {
            addCriterion("t1.IMGURL3 like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotLike(String value) {
            addCriterion("t1.IMGURL3 not like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3In(List<String> values) {
            addCriterion("t1.IMGURL3 in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotIn(List<String> values) {
            addCriterion("t1.IMGURL3 not in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Between(String value1, String value2) {
            addCriterion("t1.IMGURL3 between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotBetween(String value1, String value2) {
            addCriterion("t1.IMGURL3 not between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNull() {
            addCriterion("t1.IMGURL4 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNotNull() {
            addCriterion("t1.IMGURL4 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl4EqualTo(String value) {
            addCriterion("t1.IMGURL4 =", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotEqualTo(String value) {
            addCriterion("t1.IMGURL4 <>", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThan(String value) {
            addCriterion("t1.IMGURL4 >", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL4 >=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThan(String value) {
            addCriterion("t1.IMGURL4 <", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL4 <=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Like(String value) {
            addCriterion("t1.IMGURL4 like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotLike(String value) {
            addCriterion("t1.IMGURL4 not like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4In(List<String> values) {
            addCriterion("t1.IMGURL4 in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotIn(List<String> values) {
            addCriterion("t1.IMGURL4 not in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Between(String value1, String value2) {
            addCriterion("t1.IMGURL4 between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotBetween(String value1, String value2) {
            addCriterion("t1.IMGURL4 not between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl5IsNull() {
            addCriterion("t1.IMGURL5 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl5IsNotNull() {
            addCriterion("t1.IMGURL5 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl5EqualTo(String value) {
            addCriterion("t1.IMGURL5 =", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotEqualTo(String value) {
            addCriterion("t1.IMGURL5 <>", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5GreaterThan(String value) {
            addCriterion("t1.IMGURL5 >", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5GreaterThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL5 >=", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5LessThan(String value) {
            addCriterion("t1.IMGURL5 <", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5LessThanOrEqualTo(String value) {
            addCriterion("t1.IMGURL5 <=", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5Like(String value) {
            addCriterion("t1.IMGURL5 like", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotLike(String value) {
            addCriterion("t1.IMGURL5 not like", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5In(List<String> values) {
            addCriterion("t1.IMGURL5 in", values, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotIn(List<String> values) {
            addCriterion("t1.IMGURL5 not in", values, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5Between(String value1, String value2) {
            addCriterion("t1.IMGURL5 between", value1, value2, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotBetween(String value1, String value2) {
            addCriterion("t1.IMGURL5 not between", value1, value2, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdIsNull() {
            addCriterion("t1.BIGAREAMNG_ID is null");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdIsNotNull() {
            addCriterion("t1.BIGAREAMNG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdEqualTo(Long value) {
            addCriterion("t1.BIGAREAMNG_ID =", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdNotEqualTo(Long value) {
            addCriterion("t1.BIGAREAMNG_ID <>", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdGreaterThan(Long value) {
            addCriterion("t1.BIGAREAMNG_ID >", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.BIGAREAMNG_ID >=", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdLessThan(Long value) {
            addCriterion("t1.BIGAREAMNG_ID <", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.BIGAREAMNG_ID <=", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdIn(List<Long> values) {
            addCriterion("t1.BIGAREAMNG_ID in", values, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdNotIn(List<Long> values) {
            addCriterion("t1.BIGAREAMNG_ID not in", values, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdBetween(Long value1, Long value2) {
            addCriterion("t1.BIGAREAMNG_ID between", value1, value2, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.BIGAREAMNG_ID not between", value1, value2, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdIsNull() {
            addCriterion("t1.C_PROVINCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdIsNotNull() {
            addCriterion("t1.C_PROVINCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdEqualTo(Long value) {
            addCriterion("t1.C_PROVINCE_ID =", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdNotEqualTo(Long value) {
            addCriterion("t1.C_PROVINCE_ID <>", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdGreaterThan(Long value) {
            addCriterion("t1.C_PROVINCE_ID >", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_PROVINCE_ID >=", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdLessThan(Long value) {
            addCriterion("t1.C_PROVINCE_ID <", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_PROVINCE_ID <=", value, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdIn(List<Long> values) {
            addCriterion("t1.C_PROVINCE_ID in", values, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdNotIn(List<Long> values) {
            addCriterion("t1.C_PROVINCE_ID not in", values, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_PROVINCE_ID between", value1, value2, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCProvinceIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_PROVINCE_ID not between", value1, value2, "cProvinceId");
            return (Criteria) this;
        }

        public Criteria andCCityIdIsNull() {
            addCriterion("t1.C_CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCityIdIsNotNull() {
            addCriterion("t1.C_CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCityIdEqualTo(Long value) {
            addCriterion("t1.C_CITY_ID =", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotEqualTo(Long value) {
            addCriterion("t1.C_CITY_ID <>", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdGreaterThan(Long value) {
            addCriterion("t1.C_CITY_ID >", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_CITY_ID >=", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLessThan(Long value) {
            addCriterion("t1.C_CITY_ID <", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_CITY_ID <=", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdIn(List<Long> values) {
            addCriterion("t1.C_CITY_ID in", values, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotIn(List<Long> values) {
            addCriterion("t1.C_CITY_ID not in", values, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_CITY_ID between", value1, value2, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_CITY_ID not between", value1, value2, "cCityId");
            return (Criteria) this;
        }

        public Criteria andStoresignIsNull() {
            addCriterion("t1.STORESIGN is null");
            return (Criteria) this;
        }

        public Criteria andStoresignIsNotNull() {
            addCriterion("t1.STORESIGN is not null");
            return (Criteria) this;
        }

        public Criteria andStoresignEqualTo(Short value) {
            addCriterion("t1.STORESIGN =", value, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignNotEqualTo(Short value) {
            addCriterion("t1.STORESIGN <>", value, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignGreaterThan(Short value) {
            addCriterion("t1.STORESIGN >", value, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.STORESIGN >=", value, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignLessThan(Short value) {
            addCriterion("t1.STORESIGN <", value, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignLessThanOrEqualTo(Short value) {
            addCriterion("t1.STORESIGN <=", value, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignIn(List<Short> values) {
            addCriterion("t1.STORESIGN in", values, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignNotIn(List<Short> values) {
            addCriterion("t1.STORESIGN not in", values, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignBetween(Short value1, Short value2) {
            addCriterion("t1.STORESIGN between", value1, value2, "storesign");
            return (Criteria) this;
        }

        public Criteria andStoresignNotBetween(Short value1, Short value2) {
            addCriterion("t1.STORESIGN not between", value1, value2, "storesign");
            return (Criteria) this;
        }

        public Criteria andCStoretypeIsNull() {
            addCriterion("t1.C_STORETYPE is null");
            return (Criteria) this;
        }

        public Criteria andCStoretypeIsNotNull() {
            addCriterion("t1.C_STORETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andCStoretypeEqualTo(String value) {
            addCriterion("t1.C_STORETYPE =", value, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeNotEqualTo(String value) {
            addCriterion("t1.C_STORETYPE <>", value, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeGreaterThan(String value) {
            addCriterion("t1.C_STORETYPE >", value, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.C_STORETYPE >=", value, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeLessThan(String value) {
            addCriterion("t1.C_STORETYPE <", value, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeLessThanOrEqualTo(String value) {
            addCriterion("t1.C_STORETYPE <=", value, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeLike(String value) {
            addCriterion("t1.C_STORETYPE like", value, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeNotLike(String value) {
            addCriterion("t1.C_STORETYPE not like", value, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeIn(List<String> values) {
            addCriterion("t1.C_STORETYPE in", values, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeNotIn(List<String> values) {
            addCriterion("t1.C_STORETYPE not in", values, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeBetween(String value1, String value2) {
            addCriterion("t1.C_STORETYPE between", value1, value2, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andCStoretypeNotBetween(String value1, String value2) {
            addCriterion("t1.C_STORETYPE not between", value1, value2, "cStoretype");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("t1.REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("t1.REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("t1.REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("t1.REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("t1.REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("t1.REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("t1.REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("t1.REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("t1.REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("t1.REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("t1.REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("t1.REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("t1.REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("t1.REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("t1.CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("t1.CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("t1.CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("t1.CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("t1.CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("t1.CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("t1.CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("t1.CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("t1.CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("t1.CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("t1.CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("t1.CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("t1.CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andIsufstoreIsNull() {
            addCriterion("t1.ISUFSTORE is null");
            return (Criteria) this;
        }

        public Criteria andIsufstoreIsNotNull() {
            addCriterion("t1.ISUFSTORE is not null");
            return (Criteria) this;
        }

        public Criteria andIsufstoreEqualTo(String value) {
            addCriterion("t1.ISUFSTORE =", value, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreNotEqualTo(String value) {
            addCriterion("t1.ISUFSTORE <>", value, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreGreaterThan(String value) {
            addCriterion("t1.ISUFSTORE >", value, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISUFSTORE >=", value, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreLessThan(String value) {
            addCriterion("t1.ISUFSTORE <", value, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreLessThanOrEqualTo(String value) {
            addCriterion("t1.ISUFSTORE <=", value, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreLike(String value) {
            addCriterion("t1.ISUFSTORE like", value, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreNotLike(String value) {
            addCriterion("t1.ISUFSTORE not like", value, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreIn(List<String> values) {
            addCriterion("t1.ISUFSTORE in", values, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreNotIn(List<String> values) {
            addCriterion("t1.ISUFSTORE not in", values, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreBetween(String value1, String value2) {
            addCriterion("t1.ISUFSTORE between", value1, value2, "isufstore");
            return (Criteria) this;
        }

        public Criteria andIsufstoreNotBetween(String value1, String value2) {
            addCriterion("t1.ISUFSTORE not between", value1, value2, "isufstore");
            return (Criteria) this;
        }

        public Criteria andCStoreIdIsNull() {
            addCriterion("t1.C_STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreIdIsNotNull() {
            addCriterion("t1.C_STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreIdEqualTo(Long value) {
            addCriterion("t1.C_STORE_ID =", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdNotEqualTo(Long value) {
            addCriterion("t1.C_STORE_ID <>", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdGreaterThan(Long value) {
            addCriterion("t1.C_STORE_ID >", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STORE_ID >=", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdLessThan(Long value) {
            addCriterion("t1.C_STORE_ID <", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STORE_ID <=", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdIn(List<Long> values) {
            addCriterion("t1.C_STORE_ID in", values, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdNotIn(List<Long> values) {
            addCriterion("t1.C_STORE_ID not in", values, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STORE_ID between", value1, value2, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STORE_ID not between", value1, value2, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdIsNull() {
            addCriterion("t1.C_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdIsNotNull() {
            addCriterion("t1.C_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdEqualTo(Long value) {
            addCriterion("t1.C_DEPARTMENT_ID =", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdNotEqualTo(Long value) {
            addCriterion("t1.C_DEPARTMENT_ID <>", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdGreaterThan(Long value) {
            addCriterion("t1.C_DEPARTMENT_ID >", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_DEPARTMENT_ID >=", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdLessThan(Long value) {
            addCriterion("t1.C_DEPARTMENT_ID <", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_DEPARTMENT_ID <=", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdIn(List<Long> values) {
            addCriterion("t1.C_DEPARTMENT_ID in", values, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdNotIn(List<Long> values) {
            addCriterion("t1.C_DEPARTMENT_ID not in", values, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_DEPARTMENT_ID between", value1, value2, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_DEPARTMENT_ID not between", value1, value2, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdIsNull() {
            addCriterion("t1.C_CLASSCODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdIsNotNull() {
            addCriterion("t1.C_CLASSCODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdEqualTo(Long value) {
            addCriterion("t1.C_CLASSCODE_ID =", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdNotEqualTo(Long value) {
            addCriterion("t1.C_CLASSCODE_ID <>", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdGreaterThan(Long value) {
            addCriterion("t1.C_CLASSCODE_ID >", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_CLASSCODE_ID >=", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdLessThan(Long value) {
            addCriterion("t1.C_CLASSCODE_ID <", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_CLASSCODE_ID <=", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdIn(List<Long> values) {
            addCriterion("t1.C_CLASSCODE_ID in", values, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdNotIn(List<Long> values) {
            addCriterion("t1.C_CLASSCODE_ID not in", values, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_CLASSCODE_ID between", value1, value2, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_CLASSCODE_ID not between", value1, value2, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andBilldateFristIsNull() {
            addCriterion("t1.BILLDATE_FRIST is null");
            return (Criteria) this;
        }

        public Criteria andBilldateFristIsNotNull() {
            addCriterion("t1.BILLDATE_FRIST is not null");
            return (Criteria) this;
        }

        public Criteria andBilldateFristEqualTo(Integer value) {
            addCriterion("t1.BILLDATE_FRIST =", value, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristNotEqualTo(Integer value) {
            addCriterion("t1.BILLDATE_FRIST <>", value, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristGreaterThan(Integer value) {
            addCriterion("t1.BILLDATE_FRIST >", value, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.BILLDATE_FRIST >=", value, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristLessThan(Integer value) {
            addCriterion("t1.BILLDATE_FRIST <", value, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristLessThanOrEqualTo(Integer value) {
            addCriterion("t1.BILLDATE_FRIST <=", value, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristIn(List<Integer> values) {
            addCriterion("t1.BILLDATE_FRIST in", values, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristNotIn(List<Integer> values) {
            addCriterion("t1.BILLDATE_FRIST not in", values, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristBetween(Integer value1, Integer value2) {
            addCriterion("t1.BILLDATE_FRIST between", value1, value2, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andBilldateFristNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.BILLDATE_FRIST not between", value1, value2, "billdateFrist");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("t1.PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("t1.PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Long value) {
            addCriterion("t1.PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Long value) {
            addCriterion("t1.PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Long value) {
            addCriterion("t1.PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Long value) {
            addCriterion("t1.PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Long value) {
            addCriterion("t1.PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Long> values) {
            addCriterion("t1.PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Long> values) {
            addCriterion("t1.PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Long value1, Long value2) {
            addCriterion("t1.PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Long value1, Long value2) {
            addCriterion("t1.PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andCBlockIdIsNull() {
            addCriterion("t1.C_BLOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCBlockIdIsNotNull() {
            addCriterion("t1.C_BLOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCBlockIdEqualTo(Long value) {
            addCriterion("t1.C_BLOCK_ID =", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdNotEqualTo(Long value) {
            addCriterion("t1.C_BLOCK_ID <>", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdGreaterThan(Long value) {
            addCriterion("t1.C_BLOCK_ID >", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_BLOCK_ID >=", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdLessThan(Long value) {
            addCriterion("t1.C_BLOCK_ID <", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_BLOCK_ID <=", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdIn(List<Long> values) {
            addCriterion("t1.C_BLOCK_ID in", values, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdNotIn(List<Long> values) {
            addCriterion("t1.C_BLOCK_ID not in", values, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_BLOCK_ID between", value1, value2, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_BLOCK_ID not between", value1, value2, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousIsNull() {
            addCriterion("t1.ISFICTITIOUS is null");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousIsNotNull() {
            addCriterion("t1.ISFICTITIOUS is not null");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousEqualTo(String value) {
            addCriterion("t1.ISFICTITIOUS =", value, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousNotEqualTo(String value) {
            addCriterion("t1.ISFICTITIOUS <>", value, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousGreaterThan(String value) {
            addCriterion("t1.ISFICTITIOUS >", value, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISFICTITIOUS >=", value, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousLessThan(String value) {
            addCriterion("t1.ISFICTITIOUS <", value, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousLessThanOrEqualTo(String value) {
            addCriterion("t1.ISFICTITIOUS <=", value, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousLike(String value) {
            addCriterion("t1.ISFICTITIOUS like", value, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousNotLike(String value) {
            addCriterion("t1.ISFICTITIOUS not like", value, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousIn(List<String> values) {
            addCriterion("t1.ISFICTITIOUS in", values, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousNotIn(List<String> values) {
            addCriterion("t1.ISFICTITIOUS not in", values, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousBetween(String value1, String value2) {
            addCriterion("t1.ISFICTITIOUS between", value1, value2, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andIsfictitiousNotBetween(String value1, String value2) {
            addCriterion("t1.ISFICTITIOUS not between", value1, value2, "isfictitious");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeIsNull() {
            addCriterion("t1.SHOP_RECEIVE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeIsNotNull() {
            addCriterion("t1.SHOP_RECEIVE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeEqualTo(Short value) {
            addCriterion("t1.SHOP_RECEIVE_TYPE =", value, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeNotEqualTo(Short value) {
            addCriterion("t1.SHOP_RECEIVE_TYPE <>", value, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeGreaterThan(Short value) {
            addCriterion("t1.SHOP_RECEIVE_TYPE >", value, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.SHOP_RECEIVE_TYPE >=", value, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeLessThan(Short value) {
            addCriterion("t1.SHOP_RECEIVE_TYPE <", value, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeLessThanOrEqualTo(Short value) {
            addCriterion("t1.SHOP_RECEIVE_TYPE <=", value, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeIn(List<Short> values) {
            addCriterion("t1.SHOP_RECEIVE_TYPE in", values, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeNotIn(List<Short> values) {
            addCriterion("t1.SHOP_RECEIVE_TYPE not in", values, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeBetween(Short value1, Short value2) {
            addCriterion("t1.SHOP_RECEIVE_TYPE between", value1, value2, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andShopReceiveTypeNotBetween(Short value1, Short value2) {
            addCriterion("t1.SHOP_RECEIVE_TYPE not between", value1, value2, "shopReceiveType");
            return (Criteria) this;
        }

        public Criteria andPospwIsNull() {
            addCriterion("t1.POSPW is null");
            return (Criteria) this;
        }

        public Criteria andPospwIsNotNull() {
            addCriterion("t1.POSPW is not null");
            return (Criteria) this;
        }

        public Criteria andPospwEqualTo(String value) {
            addCriterion("t1.POSPW =", value, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwNotEqualTo(String value) {
            addCriterion("t1.POSPW <>", value, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwGreaterThan(String value) {
            addCriterion("t1.POSPW >", value, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwGreaterThanOrEqualTo(String value) {
            addCriterion("t1.POSPW >=", value, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwLessThan(String value) {
            addCriterion("t1.POSPW <", value, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwLessThanOrEqualTo(String value) {
            addCriterion("t1.POSPW <=", value, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwLike(String value) {
            addCriterion("t1.POSPW like", value, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwNotLike(String value) {
            addCriterion("t1.POSPW not like", value, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwIn(List<String> values) {
            addCriterion("t1.POSPW in", values, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwNotIn(List<String> values) {
            addCriterion("t1.POSPW not in", values, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwBetween(String value1, String value2) {
            addCriterion("t1.POSPW between", value1, value2, "pospw");
            return (Criteria) this;
        }

        public Criteria andPospwNotBetween(String value1, String value2) {
            addCriterion("t1.POSPW not between", value1, value2, "pospw");
            return (Criteria) this;
        }

        public Criteria andIsblockIsNull() {
            addCriterion("t1.ISBLOCK is null");
            return (Criteria) this;
        }

        public Criteria andIsblockIsNotNull() {
            addCriterion("t1.ISBLOCK is not null");
            return (Criteria) this;
        }

        public Criteria andIsblockEqualTo(String value) {
            addCriterion("t1.ISBLOCK =", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockNotEqualTo(String value) {
            addCriterion("t1.ISBLOCK <>", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockGreaterThan(String value) {
            addCriterion("t1.ISBLOCK >", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISBLOCK >=", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockLessThan(String value) {
            addCriterion("t1.ISBLOCK <", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockLessThanOrEqualTo(String value) {
            addCriterion("t1.ISBLOCK <=", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockLike(String value) {
            addCriterion("t1.ISBLOCK like", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockNotLike(String value) {
            addCriterion("t1.ISBLOCK not like", value, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockIn(List<String> values) {
            addCriterion("t1.ISBLOCK in", values, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockNotIn(List<String> values) {
            addCriterion("t1.ISBLOCK not in", values, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockBetween(String value1, String value2) {
            addCriterion("t1.ISBLOCK between", value1, value2, "isblock");
            return (Criteria) this;
        }

        public Criteria andIsblockNotBetween(String value1, String value2) {
            addCriterion("t1.ISBLOCK not between", value1, value2, "isblock");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("t1.DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("t1.DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("t1.DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("t1.DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("t1.DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("t1.DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("t1.DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("t1.DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.DISCOUNT not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andIsgiftIsNull() {
            addCriterion("t1.ISGIFT is null");
            return (Criteria) this;
        }

        public Criteria andIsgiftIsNotNull() {
            addCriterion("t1.ISGIFT is not null");
            return (Criteria) this;
        }

        public Criteria andIsgiftEqualTo(String value) {
            addCriterion("t1.ISGIFT =", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotEqualTo(String value) {
            addCriterion("t1.ISGIFT <>", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftGreaterThan(String value) {
            addCriterion("t1.ISGIFT >", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISGIFT >=", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftLessThan(String value) {
            addCriterion("t1.ISGIFT <", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftLessThanOrEqualTo(String value) {
            addCriterion("t1.ISGIFT <=", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftLike(String value) {
            addCriterion("t1.ISGIFT like", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotLike(String value) {
            addCriterion("t1.ISGIFT not like", value, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftIn(List<String> values) {
            addCriterion("t1.ISGIFT in", values, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotIn(List<String> values) {
            addCriterion("t1.ISGIFT not in", values, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftBetween(String value1, String value2) {
            addCriterion("t1.ISGIFT between", value1, value2, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsgiftNotBetween(String value1, String value2) {
            addCriterion("t1.ISGIFT not between", value1, value2, "isgift");
            return (Criteria) this;
        }

        public Criteria andIsdiscomIsNull() {
            addCriterion("t1.ISDISCOM is null");
            return (Criteria) this;
        }

        public Criteria andIsdiscomIsNotNull() {
            addCriterion("t1.ISDISCOM is not null");
            return (Criteria) this;
        }

        public Criteria andIsdiscomEqualTo(String value) {
            addCriterion("t1.ISDISCOM =", value, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomNotEqualTo(String value) {
            addCriterion("t1.ISDISCOM <>", value, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomGreaterThan(String value) {
            addCriterion("t1.ISDISCOM >", value, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISDISCOM >=", value, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomLessThan(String value) {
            addCriterion("t1.ISDISCOM <", value, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomLessThanOrEqualTo(String value) {
            addCriterion("t1.ISDISCOM <=", value, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomLike(String value) {
            addCriterion("t1.ISDISCOM like", value, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomNotLike(String value) {
            addCriterion("t1.ISDISCOM not like", value, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomIn(List<String> values) {
            addCriterion("t1.ISDISCOM in", values, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomNotIn(List<String> values) {
            addCriterion("t1.ISDISCOM not in", values, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomBetween(String value1, String value2) {
            addCriterion("t1.ISDISCOM between", value1, value2, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andIsdiscomNotBetween(String value1, String value2) {
            addCriterion("t1.ISDISCOM not between", value1, value2, "isdiscom");
            return (Criteria) this;
        }

        public Criteria andCDepartIdIsNull() {
            addCriterion("t1.C_DEPART_ID is null");
            return (Criteria) this;
        }

        public Criteria andCDepartIdIsNotNull() {
            addCriterion("t1.C_DEPART_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCDepartIdEqualTo(Long value) {
            addCriterion("t1.C_DEPART_ID =", value, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdNotEqualTo(Long value) {
            addCriterion("t1.C_DEPART_ID <>", value, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdGreaterThan(Long value) {
            addCriterion("t1.C_DEPART_ID >", value, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_DEPART_ID >=", value, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdLessThan(Long value) {
            addCriterion("t1.C_DEPART_ID <", value, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_DEPART_ID <=", value, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdIn(List<Long> values) {
            addCriterion("t1.C_DEPART_ID in", values, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdNotIn(List<Long> values) {
            addCriterion("t1.C_DEPART_ID not in", values, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_DEPART_ID between", value1, value2, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andCDepartIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_DEPART_ID not between", value1, value2, "cDepartId");
            return (Criteria) this;
        }

        public Criteria andImpMonthIsNull() {
            addCriterion("t1.IMP_MONTH is null");
            return (Criteria) this;
        }

        public Criteria andImpMonthIsNotNull() {
            addCriterion("t1.IMP_MONTH is not null");
            return (Criteria) this;
        }

        public Criteria andImpMonthEqualTo(Long value) {
            addCriterion("t1.IMP_MONTH =", value, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthNotEqualTo(Long value) {
            addCriterion("t1.IMP_MONTH <>", value, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthGreaterThan(Long value) {
            addCriterion("t1.IMP_MONTH >", value, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.IMP_MONTH >=", value, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthLessThan(Long value) {
            addCriterion("t1.IMP_MONTH <", value, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthLessThanOrEqualTo(Long value) {
            addCriterion("t1.IMP_MONTH <=", value, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthIn(List<Long> values) {
            addCriterion("t1.IMP_MONTH in", values, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthNotIn(List<Long> values) {
            addCriterion("t1.IMP_MONTH not in", values, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthBetween(Long value1, Long value2) {
            addCriterion("t1.IMP_MONTH between", value1, value2, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpMonthNotBetween(Long value1, Long value2) {
            addCriterion("t1.IMP_MONTH not between", value1, value2, "impMonth");
            return (Criteria) this;
        }

        public Criteria andImpType1IsNull() {
            addCriterion("t1.IMP_TYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andImpType1IsNotNull() {
            addCriterion("t1.IMP_TYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andImpType1EqualTo(Long value) {
            addCriterion("t1.IMP_TYPE1 =", value, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1NotEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE1 <>", value, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1GreaterThan(Long value) {
            addCriterion("t1.IMP_TYPE1 >", value, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1GreaterThanOrEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE1 >=", value, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1LessThan(Long value) {
            addCriterion("t1.IMP_TYPE1 <", value, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1LessThanOrEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE1 <=", value, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1In(List<Long> values) {
            addCriterion("t1.IMP_TYPE1 in", values, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1NotIn(List<Long> values) {
            addCriterion("t1.IMP_TYPE1 not in", values, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1Between(Long value1, Long value2) {
            addCriterion("t1.IMP_TYPE1 between", value1, value2, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType1NotBetween(Long value1, Long value2) {
            addCriterion("t1.IMP_TYPE1 not between", value1, value2, "impType1");
            return (Criteria) this;
        }

        public Criteria andImpType2IsNull() {
            addCriterion("t1.IMP_TYPE2 is null");
            return (Criteria) this;
        }

        public Criteria andImpType2IsNotNull() {
            addCriterion("t1.IMP_TYPE2 is not null");
            return (Criteria) this;
        }

        public Criteria andImpType2EqualTo(Long value) {
            addCriterion("t1.IMP_TYPE2 =", value, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2NotEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE2 <>", value, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2GreaterThan(Long value) {
            addCriterion("t1.IMP_TYPE2 >", value, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2GreaterThanOrEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE2 >=", value, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2LessThan(Long value) {
            addCriterion("t1.IMP_TYPE2 <", value, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2LessThanOrEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE2 <=", value, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2In(List<Long> values) {
            addCriterion("t1.IMP_TYPE2 in", values, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2NotIn(List<Long> values) {
            addCriterion("t1.IMP_TYPE2 not in", values, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2Between(Long value1, Long value2) {
            addCriterion("t1.IMP_TYPE2 between", value1, value2, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType2NotBetween(Long value1, Long value2) {
            addCriterion("t1.IMP_TYPE2 not between", value1, value2, "impType2");
            return (Criteria) this;
        }

        public Criteria andImpType3IsNull() {
            addCriterion("t1.IMP_TYPE3 is null");
            return (Criteria) this;
        }

        public Criteria andImpType3IsNotNull() {
            addCriterion("t1.IMP_TYPE3 is not null");
            return (Criteria) this;
        }

        public Criteria andImpType3EqualTo(Long value) {
            addCriterion("t1.IMP_TYPE3 =", value, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3NotEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE3 <>", value, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3GreaterThan(Long value) {
            addCriterion("t1.IMP_TYPE3 >", value, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3GreaterThanOrEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE3 >=", value, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3LessThan(Long value) {
            addCriterion("t1.IMP_TYPE3 <", value, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3LessThanOrEqualTo(Long value) {
            addCriterion("t1.IMP_TYPE3 <=", value, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3In(List<Long> values) {
            addCriterion("t1.IMP_TYPE3 in", values, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3NotIn(List<Long> values) {
            addCriterion("t1.IMP_TYPE3 not in", values, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3Between(Long value1, Long value2) {
            addCriterion("t1.IMP_TYPE3 between", value1, value2, "impType3");
            return (Criteria) this;
        }

        public Criteria andImpType3NotBetween(Long value1, Long value2) {
            addCriterion("t1.IMP_TYPE3 not between", value1, value2, "impType3");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNull() {
            addCriterion("t1.TAXRATE is null");
            return (Criteria) this;
        }

        public Criteria andTaxrateIsNotNull() {
            addCriterion("t1.TAXRATE is not null");
            return (Criteria) this;
        }

        public Criteria andTaxrateEqualTo(BigDecimal value) {
            addCriterion("t1.TAXRATE =", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotEqualTo(BigDecimal value) {
            addCriterion("t1.TAXRATE <>", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThan(BigDecimal value) {
            addCriterion("t1.TAXRATE >", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TAXRATE >=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThan(BigDecimal value) {
            addCriterion("t1.TAXRATE <", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TAXRATE <=", value, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateIn(List<BigDecimal> values) {
            addCriterion("t1.TAXRATE in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotIn(List<BigDecimal> values) {
            addCriterion("t1.TAXRATE not in", values, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TAXRATE between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andTaxrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TAXRATE not between", value1, value2, "taxrate");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdIsNull() {
            addCriterion("t1.C_STOREATTRIB1_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB1_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB1_ID =", value, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB1_ID <>", value, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB1_ID >", value, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB1_ID >=", value, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB1_ID <", value, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB1_ID <=", value, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB1_ID in", values, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB1_ID not in", values, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB1_ID between", value1, value2, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib1IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB1_ID not between", value1, value2, "cStoreattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdIsNull() {
            addCriterion("t1.C_STOREATTRIB2_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB2_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB2_ID =", value, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB2_ID <>", value, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB2_ID >", value, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB2_ID >=", value, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB2_ID <", value, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB2_ID <=", value, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB2_ID in", values, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB2_ID not in", values, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB2_ID between", value1, value2, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib2IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB2_ID not between", value1, value2, "cStoreattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdIsNull() {
            addCriterion("t1.C_STOREATTRIB3_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB3_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB3_ID =", value, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB3_ID <>", value, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB3_ID >", value, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB3_ID >=", value, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB3_ID <", value, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB3_ID <=", value, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB3_ID in", values, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB3_ID not in", values, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB3_ID between", value1, value2, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib3IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB3_ID not between", value1, value2, "cStoreattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdIsNull() {
            addCriterion("t1.C_STOREATTRIB4_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB4_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB4_ID =", value, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB4_ID <>", value, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB4_ID >", value, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB4_ID >=", value, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB4_ID <", value, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB4_ID <=", value, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB4_ID in", values, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB4_ID not in", values, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB4_ID between", value1, value2, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib4IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB4_ID not between", value1, value2, "cStoreattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdIsNull() {
            addCriterion("t1.C_STOREATTRIB5_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB5_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB5_ID =", value, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB5_ID <>", value, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB5_ID >", value, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB5_ID >=", value, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB5_ID <", value, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB5_ID <=", value, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB5_ID in", values, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB5_ID not in", values, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB5_ID between", value1, value2, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib5IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB5_ID not between", value1, value2, "cStoreattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdIsNull() {
            addCriterion("t1.C_STOREATTRIB6_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB6_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB6_ID =", value, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB6_ID <>", value, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB6_ID >", value, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB6_ID >=", value, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB6_ID <", value, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB6_ID <=", value, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB6_ID in", values, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB6_ID not in", values, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB6_ID between", value1, value2, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib6IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB6_ID not between", value1, value2, "cStoreattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdIsNull() {
            addCriterion("t1.C_STOREATTRIB7_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB7_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB7_ID =", value, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB7_ID <>", value, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB7_ID >", value, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB7_ID >=", value, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB7_ID <", value, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB7_ID <=", value, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB7_ID in", values, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB7_ID not in", values, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB7_ID between", value1, value2, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib7IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB7_ID not between", value1, value2, "cStoreattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdIsNull() {
            addCriterion("t1.C_STOREATTRIB8_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB8_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB8_ID =", value, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB8_ID <>", value, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB8_ID >", value, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB8_ID >=", value, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB8_ID <", value, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB8_ID <=", value, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB8_ID in", values, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB8_ID not in", values, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB8_ID between", value1, value2, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib8IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB8_ID not between", value1, value2, "cStoreattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdIsNull() {
            addCriterion("t1.C_STOREATTRIB9_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB9_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB9_ID =", value, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB9_ID <>", value, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB9_ID >", value, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB9_ID >=", value, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB9_ID <", value, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB9_ID <=", value, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB9_ID in", values, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB9_ID not in", values, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB9_ID between", value1, value2, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib9IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB9_ID not between", value1, value2, "cStoreattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdIsNull() {
            addCriterion("t1.C_STOREATTRIB10_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB10_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB10_ID =", value, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB10_ID <>", value, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB10_ID >", value, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB10_ID >=", value, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB10_ID <", value, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB10_ID <=", value, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB10_ID in", values, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB10_ID not in", values, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB10_ID between", value1, value2, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib10IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB10_ID not between", value1, value2, "cStoreattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdIsNull() {
            addCriterion("t1.C_STOREATTRIB11_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB11_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB11_ID =", value, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB11_ID <>", value, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB11_ID >", value, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB11_ID >=", value, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB11_ID <", value, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB11_ID <=", value, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB11_ID in", values, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB11_ID not in", values, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB11_ID between", value1, value2, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib11IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB11_ID not between", value1, value2, "cStoreattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdIsNull() {
            addCriterion("t1.C_STOREATTRIB12_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB12_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB12_ID =", value, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB12_ID <>", value, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB12_ID >", value, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB12_ID >=", value, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB12_ID <", value, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB12_ID <=", value, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB12_ID in", values, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB12_ID not in", values, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB12_ID between", value1, value2, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib12IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB12_ID not between", value1, value2, "cStoreattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdIsNull() {
            addCriterion("t1.C_STOREATTRIB13_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB13_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB13_ID =", value, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB13_ID <>", value, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB13_ID >", value, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB13_ID >=", value, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB13_ID <", value, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB13_ID <=", value, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB13_ID in", values, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB13_ID not in", values, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB13_ID between", value1, value2, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib13IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB13_ID not between", value1, value2, "cStoreattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdIsNull() {
            addCriterion("t1.C_STOREATTRIB14_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB14_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB14_ID =", value, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB14_ID <>", value, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB14_ID >", value, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB14_ID >=", value, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB14_ID <", value, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB14_ID <=", value, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB14_ID in", values, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB14_ID not in", values, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB14_ID between", value1, value2, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib14IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB14_ID not between", value1, value2, "cStoreattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdIsNull() {
            addCriterion("t1.C_STOREATTRIB15_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB15_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB15_ID =", value, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB15_ID <>", value, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB15_ID >", value, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB15_ID >=", value, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB15_ID <", value, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB15_ID <=", value, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB15_ID in", values, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB15_ID not in", values, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB15_ID between", value1, value2, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib15IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB15_ID not between", value1, value2, "cStoreattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdIsNull() {
            addCriterion("t1.C_STOREATTRIB16_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB16_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB16_ID =", value, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB16_ID <>", value, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB16_ID >", value, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB16_ID >=", value, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB16_ID <", value, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB16_ID <=", value, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB16_ID in", values, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB16_ID not in", values, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB16_ID between", value1, value2, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib16IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB16_ID not between", value1, value2, "cStoreattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdIsNull() {
            addCriterion("t1.C_STOREATTRIB17_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB17_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB17_ID =", value, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB17_ID <>", value, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB17_ID >", value, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB17_ID >=", value, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB17_ID <", value, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB17_ID <=", value, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB17_ID in", values, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB17_ID not in", values, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB17_ID between", value1, value2, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib17IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB17_ID not between", value1, value2, "cStoreattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdIsNull() {
            addCriterion("t1.C_STOREATTRIB18_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB18_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB18_ID =", value, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB18_ID <>", value, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB18_ID >", value, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB18_ID >=", value, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB18_ID <", value, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB18_ID <=", value, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB18_ID in", values, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB18_ID not in", values, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB18_ID between", value1, value2, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib18IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB18_ID not between", value1, value2, "cStoreattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdIsNull() {
            addCriterion("t1.C_STOREATTRIB19_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB19_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB19_ID =", value, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB19_ID <>", value, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB19_ID >", value, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB19_ID >=", value, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB19_ID <", value, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB19_ID <=", value, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB19_ID in", values, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB19_ID not in", values, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB19_ID between", value1, value2, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib19IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB19_ID not between", value1, value2, "cStoreattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdIsNull() {
            addCriterion("t1.C_STOREATTRIB20_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdIsNotNull() {
            addCriterion("t1.C_STOREATTRIB20_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB20_ID =", value, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB20_ID <>", value, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdGreaterThan(Long value) {
            addCriterion("t1.C_STOREATTRIB20_ID >", value, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB20_ID >=", value, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdLessThan(Long value) {
            addCriterion("t1.C_STOREATTRIB20_ID <", value, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREATTRIB20_ID <=", value, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB20_ID in", values, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREATTRIB20_ID not in", values, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB20_ID between", value1, value2, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCStoreattrib20IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREATTRIB20_ID not between", value1, value2, "cStoreattrib20Id");
            return (Criteria) this;
        }

        public Criteria andIsnegativeIsNull() {
            addCriterion("t1.ISNEGATIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsnegativeIsNotNull() {
            addCriterion("t1.ISNEGATIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsnegativeEqualTo(String value) {
            addCriterion("t1.ISNEGATIVE =", value, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeNotEqualTo(String value) {
            addCriterion("t1.ISNEGATIVE <>", value, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeGreaterThan(String value) {
            addCriterion("t1.ISNEGATIVE >", value, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISNEGATIVE >=", value, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeLessThan(String value) {
            addCriterion("t1.ISNEGATIVE <", value, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeLessThanOrEqualTo(String value) {
            addCriterion("t1.ISNEGATIVE <=", value, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeLike(String value) {
            addCriterion("t1.ISNEGATIVE like", value, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeNotLike(String value) {
            addCriterion("t1.ISNEGATIVE not like", value, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeIn(List<String> values) {
            addCriterion("t1.ISNEGATIVE in", values, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeNotIn(List<String> values) {
            addCriterion("t1.ISNEGATIVE not in", values, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeBetween(String value1, String value2) {
            addCriterion("t1.ISNEGATIVE between", value1, value2, "isnegative");
            return (Criteria) this;
        }

        public Criteria andIsnegativeNotBetween(String value1, String value2) {
            addCriterion("t1.ISNEGATIVE not between", value1, value2, "isnegative");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdIsNull() {
            addCriterion("t1.TDEFDOWNTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdIsNotNull() {
            addCriterion("t1.TDEFDOWNTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdEqualTo(Long value) {
            addCriterion("t1.TDEFDOWNTYPE_ID =", value, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdNotEqualTo(Long value) {
            addCriterion("t1.TDEFDOWNTYPE_ID <>", value, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdGreaterThan(Long value) {
            addCriterion("t1.TDEFDOWNTYPE_ID >", value, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.TDEFDOWNTYPE_ID >=", value, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdLessThan(Long value) {
            addCriterion("t1.TDEFDOWNTYPE_ID <", value, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.TDEFDOWNTYPE_ID <=", value, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdIn(List<Long> values) {
            addCriterion("t1.TDEFDOWNTYPE_ID in", values, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdNotIn(List<Long> values) {
            addCriterion("t1.TDEFDOWNTYPE_ID not in", values, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdBetween(Long value1, Long value2) {
            addCriterion("t1.TDEFDOWNTYPE_ID between", value1, value2, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andTdefdowntypeIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.TDEFDOWNTYPE_ID not between", value1, value2, "tdefdowntypeId");
            return (Criteria) this;
        }

        public Criteria andUsbkeyIsNull() {
            addCriterion("t1.USBKEY is null");
            return (Criteria) this;
        }

        public Criteria andUsbkeyIsNotNull() {
            addCriterion("t1.USBKEY is not null");
            return (Criteria) this;
        }

        public Criteria andUsbkeyEqualTo(String value) {
            addCriterion("t1.USBKEY =", value, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyNotEqualTo(String value) {
            addCriterion("t1.USBKEY <>", value, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyGreaterThan(String value) {
            addCriterion("t1.USBKEY >", value, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyGreaterThanOrEqualTo(String value) {
            addCriterion("t1.USBKEY >=", value, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyLessThan(String value) {
            addCriterion("t1.USBKEY <", value, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyLessThanOrEqualTo(String value) {
            addCriterion("t1.USBKEY <=", value, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyLike(String value) {
            addCriterion("t1.USBKEY like", value, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyNotLike(String value) {
            addCriterion("t1.USBKEY not like", value, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyIn(List<String> values) {
            addCriterion("t1.USBKEY in", values, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyNotIn(List<String> values) {
            addCriterion("t1.USBKEY not in", values, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyBetween(String value1, String value2) {
            addCriterion("t1.USBKEY between", value1, value2, "usbkey");
            return (Criteria) this;
        }

        public Criteria andUsbkeyNotBetween(String value1, String value2) {
            addCriterion("t1.USBKEY not between", value1, value2, "usbkey");
            return (Criteria) this;
        }

        public Criteria andContactorIsNull() {
            addCriterion("t1.CONTACTOR is null");
            return (Criteria) this;
        }

        public Criteria andContactorIsNotNull() {
            addCriterion("t1.CONTACTOR is not null");
            return (Criteria) this;
        }

        public Criteria andContactorEqualTo(String value) {
            addCriterion("t1.CONTACTOR =", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotEqualTo(String value) {
            addCriterion("t1.CONTACTOR <>", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorGreaterThan(String value) {
            addCriterion("t1.CONTACTOR >", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CONTACTOR >=", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLessThan(String value) {
            addCriterion("t1.CONTACTOR <", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLessThanOrEqualTo(String value) {
            addCriterion("t1.CONTACTOR <=", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorLike(String value) {
            addCriterion("t1.CONTACTOR like", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotLike(String value) {
            addCriterion("t1.CONTACTOR not like", value, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorIn(List<String> values) {
            addCriterion("t1.CONTACTOR in", values, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotIn(List<String> values) {
            addCriterion("t1.CONTACTOR not in", values, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorBetween(String value1, String value2) {
            addCriterion("t1.CONTACTOR between", value1, value2, "contactor");
            return (Criteria) this;
        }

        public Criteria andContactorNotBetween(String value1, String value2) {
            addCriterion("t1.CONTACTOR not between", value1, value2, "contactor");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdIsNull() {
            addCriterion("t1.C_STOREGRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdIsNotNull() {
            addCriterion("t1.C_STOREGRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdEqualTo(Long value) {
            addCriterion("t1.C_STOREGRADE_ID =", value, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREGRADE_ID <>", value, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdGreaterThan(Long value) {
            addCriterion("t1.C_STOREGRADE_ID >", value, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREGRADE_ID >=", value, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdLessThan(Long value) {
            addCriterion("t1.C_STOREGRADE_ID <", value, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREGRADE_ID <=", value, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdIn(List<Long> values) {
            addCriterion("t1.C_STOREGRADE_ID in", values, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREGRADE_ID not in", values, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREGRADE_ID between", value1, value2, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andCStoregradeIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREGRADE_ID not between", value1, value2, "cStoregradeId");
            return (Criteria) this;
        }

        public Criteria andComrentendIsNull() {
            addCriterion("t1.COMRENTEND is null");
            return (Criteria) this;
        }

        public Criteria andComrentendIsNotNull() {
            addCriterion("t1.COMRENTEND is not null");
            return (Criteria) this;
        }

        public Criteria andComrentendEqualTo(Integer value) {
            addCriterion("t1.COMRENTEND =", value, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendNotEqualTo(Integer value) {
            addCriterion("t1.COMRENTEND <>", value, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendGreaterThan(Integer value) {
            addCriterion("t1.COMRENTEND >", value, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.COMRENTEND >=", value, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendLessThan(Integer value) {
            addCriterion("t1.COMRENTEND <", value, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendLessThanOrEqualTo(Integer value) {
            addCriterion("t1.COMRENTEND <=", value, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendIn(List<Integer> values) {
            addCriterion("t1.COMRENTEND in", values, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendNotIn(List<Integer> values) {
            addCriterion("t1.COMRENTEND not in", values, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendBetween(Integer value1, Integer value2) {
            addCriterion("t1.COMRENTEND between", value1, value2, "comrentend");
            return (Criteria) this;
        }

        public Criteria andComrentendNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.COMRENTEND not between", value1, value2, "comrentend");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdIsNull() {
            addCriterion("t1.C_STOREKIND_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdIsNotNull() {
            addCriterion("t1.C_STOREKIND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdEqualTo(Long value) {
            addCriterion("t1.C_STOREKIND_ID =", value, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdNotEqualTo(Long value) {
            addCriterion("t1.C_STOREKIND_ID <>", value, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdGreaterThan(Long value) {
            addCriterion("t1.C_STOREKIND_ID >", value, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREKIND_ID >=", value, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdLessThan(Long value) {
            addCriterion("t1.C_STOREKIND_ID <", value, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STOREKIND_ID <=", value, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdIn(List<Long> values) {
            addCriterion("t1.C_STOREKIND_ID in", values, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdNotIn(List<Long> values) {
            addCriterion("t1.C_STOREKIND_ID not in", values, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREKIND_ID between", value1, value2, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andCStorekindIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STOREKIND_ID not between", value1, value2, "cStorekindId");
            return (Criteria) this;
        }

        public Criteria andMDim1IdIsNull() {
            addCriterion("t1.M_DIM1_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDim1IdIsNotNull() {
            addCriterion("t1.M_DIM1_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDim1IdEqualTo(Long value) {
            addCriterion("t1.M_DIM1_ID =", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdNotEqualTo(Long value) {
            addCriterion("t1.M_DIM1_ID <>", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdGreaterThan(Long value) {
            addCriterion("t1.M_DIM1_ID >", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.M_DIM1_ID >=", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdLessThan(Long value) {
            addCriterion("t1.M_DIM1_ID <", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdLessThanOrEqualTo(Long value) {
            addCriterion("t1.M_DIM1_ID <=", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdIn(List<Long> values) {
            addCriterion("t1.M_DIM1_ID in", values, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdNotIn(List<Long> values) {
            addCriterion("t1.M_DIM1_ID not in", values, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdBetween(Long value1, Long value2) {
            addCriterion("t1.M_DIM1_ID between", value1, value2, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdNotBetween(Long value1, Long value2) {
            addCriterion("t1.M_DIM1_ID not between", value1, value2, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andIstaxIsNull() {
            addCriterion("t1.ISTAX is null");
            return (Criteria) this;
        }

        public Criteria andIstaxIsNotNull() {
            addCriterion("t1.ISTAX is not null");
            return (Criteria) this;
        }

        public Criteria andIstaxEqualTo(String value) {
            addCriterion("t1.ISTAX =", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxNotEqualTo(String value) {
            addCriterion("t1.ISTAX <>", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxGreaterThan(String value) {
            addCriterion("t1.ISTAX >", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISTAX >=", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxLessThan(String value) {
            addCriterion("t1.ISTAX <", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxLessThanOrEqualTo(String value) {
            addCriterion("t1.ISTAX <=", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxLike(String value) {
            addCriterion("t1.ISTAX like", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxNotLike(String value) {
            addCriterion("t1.ISTAX not like", value, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxIn(List<String> values) {
            addCriterion("t1.ISTAX in", values, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxNotIn(List<String> values) {
            addCriterion("t1.ISTAX not in", values, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxBetween(String value1, String value2) {
            addCriterion("t1.ISTAX between", value1, value2, "istax");
            return (Criteria) this;
        }

        public Criteria andIstaxNotBetween(String value1, String value2) {
            addCriterion("t1.ISTAX not between", value1, value2, "istax");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNull() {
            addCriterion("t1.CARRIER is null");
            return (Criteria) this;
        }

        public Criteria andCarrierIsNotNull() {
            addCriterion("t1.CARRIER is not null");
            return (Criteria) this;
        }

        public Criteria andCarrierEqualTo(String value) {
            addCriterion("t1.CARRIER =", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotEqualTo(String value) {
            addCriterion("t1.CARRIER <>", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThan(String value) {
            addCriterion("t1.CARRIER >", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CARRIER >=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThan(String value) {
            addCriterion("t1.CARRIER <", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLessThanOrEqualTo(String value) {
            addCriterion("t1.CARRIER <=", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierLike(String value) {
            addCriterion("t1.CARRIER like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotLike(String value) {
            addCriterion("t1.CARRIER not like", value, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierIn(List<String> values) {
            addCriterion("t1.CARRIER in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotIn(List<String> values) {
            addCriterion("t1.CARRIER not in", values, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierBetween(String value1, String value2) {
            addCriterion("t1.CARRIER between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andCarrierNotBetween(String value1, String value2) {
            addCriterion("t1.CARRIER not between", value1, value2, "carrier");
            return (Criteria) this;
        }

        public Criteria andChkdayIsNull() {
            addCriterion("t1.CHKDAY is null");
            return (Criteria) this;
        }

        public Criteria andChkdayIsNotNull() {
            addCriterion("t1.CHKDAY is not null");
            return (Criteria) this;
        }

        public Criteria andChkdayEqualTo(Integer value) {
            addCriterion("t1.CHKDAY =", value, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayNotEqualTo(Integer value) {
            addCriterion("t1.CHKDAY <>", value, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayGreaterThan(Integer value) {
            addCriterion("t1.CHKDAY >", value, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.CHKDAY >=", value, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayLessThan(Integer value) {
            addCriterion("t1.CHKDAY <", value, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayLessThanOrEqualTo(Integer value) {
            addCriterion("t1.CHKDAY <=", value, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayIn(List<Integer> values) {
            addCriterion("t1.CHKDAY in", values, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayNotIn(List<Integer> values) {
            addCriterion("t1.CHKDAY not in", values, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayBetween(Integer value1, Integer value2) {
            addCriterion("t1.CHKDAY between", value1, value2, "chkday");
            return (Criteria) this;
        }

        public Criteria andChkdayNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.CHKDAY not between", value1, value2, "chkday");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidIsNull() {
            addCriterion("t1.DRAW_INVOICE_EMPID is null");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidIsNotNull() {
            addCriterion("t1.DRAW_INVOICE_EMPID is not null");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidEqualTo(Long value) {
            addCriterion("t1.DRAW_INVOICE_EMPID =", value, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidNotEqualTo(Long value) {
            addCriterion("t1.DRAW_INVOICE_EMPID <>", value, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidGreaterThan(Long value) {
            addCriterion("t1.DRAW_INVOICE_EMPID >", value, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.DRAW_INVOICE_EMPID >=", value, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidLessThan(Long value) {
            addCriterion("t1.DRAW_INVOICE_EMPID <", value, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidLessThanOrEqualTo(Long value) {
            addCriterion("t1.DRAW_INVOICE_EMPID <=", value, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidIn(List<Long> values) {
            addCriterion("t1.DRAW_INVOICE_EMPID in", values, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidNotIn(List<Long> values) {
            addCriterion("t1.DRAW_INVOICE_EMPID not in", values, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidBetween(Long value1, Long value2) {
            addCriterion("t1.DRAW_INVOICE_EMPID between", value1, value2, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andDrawInvoiceEmpidNotBetween(Long value1, Long value2) {
            addCriterion("t1.DRAW_INVOICE_EMPID not between", value1, value2, "drawInvoiceEmpid");
            return (Criteria) this;
        }

        public Criteria andInvoiceComIsNull() {
            addCriterion("t1.INVOICE_COM is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceComIsNotNull() {
            addCriterion("t1.INVOICE_COM is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceComEqualTo(String value) {
            addCriterion("t1.INVOICE_COM =", value, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComNotEqualTo(String value) {
            addCriterion("t1.INVOICE_COM <>", value, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComGreaterThan(String value) {
            addCriterion("t1.INVOICE_COM >", value, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComGreaterThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_COM >=", value, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComLessThan(String value) {
            addCriterion("t1.INVOICE_COM <", value, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComLessThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_COM <=", value, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComLike(String value) {
            addCriterion("t1.INVOICE_COM like", value, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComNotLike(String value) {
            addCriterion("t1.INVOICE_COM not like", value, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComIn(List<String> values) {
            addCriterion("t1.INVOICE_COM in", values, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComNotIn(List<String> values) {
            addCriterion("t1.INVOICE_COM not in", values, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_COM between", value1, value2, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceComNotBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_COM not between", value1, value2, "invoiceCom");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIsNull() {
            addCriterion("t1.INVOICE_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIsNotNull() {
            addCriterion("t1.INVOICE_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrEqualTo(String value) {
            addCriterion("t1.INVOICE_ADDR =", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNotEqualTo(String value) {
            addCriterion("t1.INVOICE_ADDR <>", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrGreaterThan(String value) {
            addCriterion("t1.INVOICE_ADDR >", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_ADDR >=", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrLessThan(String value) {
            addCriterion("t1.INVOICE_ADDR <", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrLessThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_ADDR <=", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrLike(String value) {
            addCriterion("t1.INVOICE_ADDR like", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNotLike(String value) {
            addCriterion("t1.INVOICE_ADDR not like", value, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrIn(List<String> values) {
            addCriterion("t1.INVOICE_ADDR in", values, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNotIn(List<String> values) {
            addCriterion("t1.INVOICE_ADDR not in", values, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_ADDR between", value1, value2, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceAddrNotBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_ADDR not between", value1, value2, "invoiceAddr");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankIsNull() {
            addCriterion("t1.INVOICE_BANK is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankIsNotNull() {
            addCriterion("t1.INVOICE_BANK is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankEqualTo(String value) {
            addCriterion("t1.INVOICE_BANK =", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankNotEqualTo(String value) {
            addCriterion("t1.INVOICE_BANK <>", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankGreaterThan(String value) {
            addCriterion("t1.INVOICE_BANK >", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankGreaterThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_BANK >=", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankLessThan(String value) {
            addCriterion("t1.INVOICE_BANK <", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankLessThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_BANK <=", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankLike(String value) {
            addCriterion("t1.INVOICE_BANK like", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankNotLike(String value) {
            addCriterion("t1.INVOICE_BANK not like", value, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankIn(List<String> values) {
            addCriterion("t1.INVOICE_BANK in", values, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankNotIn(List<String> values) {
            addCriterion("t1.INVOICE_BANK not in", values, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_BANK between", value1, value2, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoiceBankNotBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_BANK not between", value1, value2, "invoiceBank");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneIsNull() {
            addCriterion("t1.INVOICE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneIsNotNull() {
            addCriterion("t1.INVOICE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneEqualTo(String value) {
            addCriterion("t1.INVOICE_PHONE =", value, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneNotEqualTo(String value) {
            addCriterion("t1.INVOICE_PHONE <>", value, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneGreaterThan(String value) {
            addCriterion("t1.INVOICE_PHONE >", value, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_PHONE >=", value, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneLessThan(String value) {
            addCriterion("t1.INVOICE_PHONE <", value, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneLessThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_PHONE <=", value, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneLike(String value) {
            addCriterion("t1.INVOICE_PHONE like", value, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneNotLike(String value) {
            addCriterion("t1.INVOICE_PHONE not like", value, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneIn(List<String> values) {
            addCriterion("t1.INVOICE_PHONE in", values, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneNotIn(List<String> values) {
            addCriterion("t1.INVOICE_PHONE not in", values, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_PHONE between", value1, value2, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoicePhoneNotBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_PHONE not between", value1, value2, "invoicePhone");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoIsNull() {
            addCriterion("t1.INVOICE_TAXNO is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoIsNotNull() {
            addCriterion("t1.INVOICE_TAXNO is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoEqualTo(String value) {
            addCriterion("t1.INVOICE_TAXNO =", value, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoNotEqualTo(String value) {
            addCriterion("t1.INVOICE_TAXNO <>", value, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoGreaterThan(String value) {
            addCriterion("t1.INVOICE_TAXNO >", value, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_TAXNO >=", value, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoLessThan(String value) {
            addCriterion("t1.INVOICE_TAXNO <", value, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoLessThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_TAXNO <=", value, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoLike(String value) {
            addCriterion("t1.INVOICE_TAXNO like", value, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoNotLike(String value) {
            addCriterion("t1.INVOICE_TAXNO not like", value, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoIn(List<String> values) {
            addCriterion("t1.INVOICE_TAXNO in", values, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoNotIn(List<String> values) {
            addCriterion("t1.INVOICE_TAXNO not in", values, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_TAXNO between", value1, value2, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceTaxnoNotBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_TAXNO not between", value1, value2, "invoiceTaxno");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountIsNull() {
            addCriterion("t1.INVOICE_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountIsNotNull() {
            addCriterion("t1.INVOICE_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountEqualTo(String value) {
            addCriterion("t1.INVOICE_ACCOUNT =", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountNotEqualTo(String value) {
            addCriterion("t1.INVOICE_ACCOUNT <>", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountGreaterThan(String value) {
            addCriterion("t1.INVOICE_ACCOUNT >", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountGreaterThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_ACCOUNT >=", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountLessThan(String value) {
            addCriterion("t1.INVOICE_ACCOUNT <", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountLessThanOrEqualTo(String value) {
            addCriterion("t1.INVOICE_ACCOUNT <=", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountLike(String value) {
            addCriterion("t1.INVOICE_ACCOUNT like", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountNotLike(String value) {
            addCriterion("t1.INVOICE_ACCOUNT not like", value, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountIn(List<String> values) {
            addCriterion("t1.INVOICE_ACCOUNT in", values, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountNotIn(List<String> values) {
            addCriterion("t1.INVOICE_ACCOUNT not in", values, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_ACCOUNT between", value1, value2, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andInvoiceAccountNotBetween(String value1, String value2) {
            addCriterion("t1.INVOICE_ACCOUNT not between", value1, value2, "invoiceAccount");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateIsNull() {
            addCriterion("t1.ORDERLIMITDATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateIsNotNull() {
            addCriterion("t1.ORDERLIMITDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateEqualTo(Long value) {
            addCriterion("t1.ORDERLIMITDATE =", value, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateNotEqualTo(Long value) {
            addCriterion("t1.ORDERLIMITDATE <>", value, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateGreaterThan(Long value) {
            addCriterion("t1.ORDERLIMITDATE >", value, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.ORDERLIMITDATE >=", value, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateLessThan(Long value) {
            addCriterion("t1.ORDERLIMITDATE <", value, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateLessThanOrEqualTo(Long value) {
            addCriterion("t1.ORDERLIMITDATE <=", value, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateIn(List<Long> values) {
            addCriterion("t1.ORDERLIMITDATE in", values, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateNotIn(List<Long> values) {
            addCriterion("t1.ORDERLIMITDATE not in", values, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateBetween(Long value1, Long value2) {
            addCriterion("t1.ORDERLIMITDATE between", value1, value2, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andOrderlimitdateNotBetween(Long value1, Long value2) {
            addCriterion("t1.ORDERLIMITDATE not between", value1, value2, "orderlimitdate");
            return (Criteria) this;
        }

        public Criteria andIforderstoreIsNull() {
            addCriterion("t1.IFORDERSTORE is null");
            return (Criteria) this;
        }

        public Criteria andIforderstoreIsNotNull() {
            addCriterion("t1.IFORDERSTORE is not null");
            return (Criteria) this;
        }

        public Criteria andIforderstoreEqualTo(String value) {
            addCriterion("t1.IFORDERSTORE =", value, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreNotEqualTo(String value) {
            addCriterion("t1.IFORDERSTORE <>", value, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreGreaterThan(String value) {
            addCriterion("t1.IFORDERSTORE >", value, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IFORDERSTORE >=", value, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreLessThan(String value) {
            addCriterion("t1.IFORDERSTORE <", value, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreLessThanOrEqualTo(String value) {
            addCriterion("t1.IFORDERSTORE <=", value, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreLike(String value) {
            addCriterion("t1.IFORDERSTORE like", value, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreNotLike(String value) {
            addCriterion("t1.IFORDERSTORE not like", value, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreIn(List<String> values) {
            addCriterion("t1.IFORDERSTORE in", values, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreNotIn(List<String> values) {
            addCriterion("t1.IFORDERSTORE not in", values, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreBetween(String value1, String value2) {
            addCriterion("t1.IFORDERSTORE between", value1, value2, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andIforderstoreNotBetween(String value1, String value2) {
            addCriterion("t1.IFORDERSTORE not between", value1, value2, "iforderstore");
            return (Criteria) this;
        }

        public Criteria andComptypeIsNull() {
            addCriterion("t1.COMPTYPE is null");
            return (Criteria) this;
        }

        public Criteria andComptypeIsNotNull() {
            addCriterion("t1.COMPTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andComptypeEqualTo(Short value) {
            addCriterion("t1.COMPTYPE =", value, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeNotEqualTo(Short value) {
            addCriterion("t1.COMPTYPE <>", value, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeGreaterThan(Short value) {
            addCriterion("t1.COMPTYPE >", value, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.COMPTYPE >=", value, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeLessThan(Short value) {
            addCriterion("t1.COMPTYPE <", value, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeLessThanOrEqualTo(Short value) {
            addCriterion("t1.COMPTYPE <=", value, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeIn(List<Short> values) {
            addCriterion("t1.COMPTYPE in", values, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeNotIn(List<Short> values) {
            addCriterion("t1.COMPTYPE not in", values, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeBetween(Short value1, Short value2) {
            addCriterion("t1.COMPTYPE between", value1, value2, "comptype");
            return (Criteria) this;
        }

        public Criteria andComptypeNotBetween(Short value1, Short value2) {
            addCriterion("t1.COMPTYPE not between", value1, value2, "comptype");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlIsNull() {
            addCriterion("t1.WEBPOSLOGINURL is null");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlIsNotNull() {
            addCriterion("t1.WEBPOSLOGINURL is not null");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlEqualTo(String value) {
            addCriterion("t1.WEBPOSLOGINURL =", value, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlNotEqualTo(String value) {
            addCriterion("t1.WEBPOSLOGINURL <>", value, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlGreaterThan(String value) {
            addCriterion("t1.WEBPOSLOGINURL >", value, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlGreaterThanOrEqualTo(String value) {
            addCriterion("t1.WEBPOSLOGINURL >=", value, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlLessThan(String value) {
            addCriterion("t1.WEBPOSLOGINURL <", value, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlLessThanOrEqualTo(String value) {
            addCriterion("t1.WEBPOSLOGINURL <=", value, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlLike(String value) {
            addCriterion("t1.WEBPOSLOGINURL like", value, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlNotLike(String value) {
            addCriterion("t1.WEBPOSLOGINURL not like", value, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlIn(List<String> values) {
            addCriterion("t1.WEBPOSLOGINURL in", values, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlNotIn(List<String> values) {
            addCriterion("t1.WEBPOSLOGINURL not in", values, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlBetween(String value1, String value2) {
            addCriterion("t1.WEBPOSLOGINURL between", value1, value2, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andWebposloginurlNotBetween(String value1, String value2) {
            addCriterion("t1.WEBPOSLOGINURL not between", value1, value2, "webposloginurl");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("t1.STATE is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("t1.STATE is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("t1.STATE =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("t1.STATE <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("t1.STATE >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("t1.STATE >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("t1.STATE <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("t1.STATE <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("t1.STATE like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("t1.STATE not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("t1.STATE in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("t1.STATE not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("t1.STATE between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("t1.STATE not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andCClassIdIsNull() {
            addCriterion("t1.C_CLASS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCClassIdIsNotNull() {
            addCriterion("t1.C_CLASS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCClassIdEqualTo(Long value) {
            addCriterion("t1.C_CLASS_ID =", value, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdNotEqualTo(Long value) {
            addCriterion("t1.C_CLASS_ID <>", value, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdGreaterThan(Long value) {
            addCriterion("t1.C_CLASS_ID >", value, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_CLASS_ID >=", value, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdLessThan(Long value) {
            addCriterion("t1.C_CLASS_ID <", value, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_CLASS_ID <=", value, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdIn(List<Long> values) {
            addCriterion("t1.C_CLASS_ID in", values, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdNotIn(List<Long> values) {
            addCriterion("t1.C_CLASS_ID not in", values, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_CLASS_ID between", value1, value2, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCClassIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_CLASS_ID not between", value1, value2, "cClassId");
            return (Criteria) this;
        }

        public Criteria andCStandIdIsNull() {
            addCriterion("t1.C_STAND_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStandIdIsNotNull() {
            addCriterion("t1.C_STAND_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStandIdEqualTo(Long value) {
            addCriterion("t1.C_STAND_ID =", value, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdNotEqualTo(Long value) {
            addCriterion("t1.C_STAND_ID <>", value, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdGreaterThan(Long value) {
            addCriterion("t1.C_STAND_ID >", value, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STAND_ID >=", value, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdLessThan(Long value) {
            addCriterion("t1.C_STAND_ID <", value, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STAND_ID <=", value, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdIn(List<Long> values) {
            addCriterion("t1.C_STAND_ID in", values, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdNotIn(List<Long> values) {
            addCriterion("t1.C_STAND_ID not in", values, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STAND_ID between", value1, value2, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCStandIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STAND_ID not between", value1, value2, "cStandId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdIsNull() {
            addCriterion("t1.C_ADDRESS_ID is null");
            return (Criteria) this;
        }

        public Criteria andCAddressIdIsNotNull() {
            addCriterion("t1.C_ADDRESS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCAddressIdEqualTo(Long value) {
            addCriterion("t1.C_ADDRESS_ID =", value, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdNotEqualTo(Long value) {
            addCriterion("t1.C_ADDRESS_ID <>", value, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdGreaterThan(Long value) {
            addCriterion("t1.C_ADDRESS_ID >", value, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_ADDRESS_ID >=", value, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdLessThan(Long value) {
            addCriterion("t1.C_ADDRESS_ID <", value, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_ADDRESS_ID <=", value, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdIn(List<Long> values) {
            addCriterion("t1.C_ADDRESS_ID in", values, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdNotIn(List<Long> values) {
            addCriterion("t1.C_ADDRESS_ID not in", values, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_ADDRESS_ID between", value1, value2, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andCAddressIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_ADDRESS_ID not between", value1, value2, "cAddressId");
            return (Criteria) this;
        }

        public Criteria andIfeffectIsNull() {
            addCriterion("t1.IFEFFECT is null");
            return (Criteria) this;
        }

        public Criteria andIfeffectIsNotNull() {
            addCriterion("t1.IFEFFECT is not null");
            return (Criteria) this;
        }

        public Criteria andIfeffectEqualTo(String value) {
            addCriterion("t1.IFEFFECT =", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectNotEqualTo(String value) {
            addCriterion("t1.IFEFFECT <>", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectGreaterThan(String value) {
            addCriterion("t1.IFEFFECT >", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IFEFFECT >=", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectLessThan(String value) {
            addCriterion("t1.IFEFFECT <", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectLessThanOrEqualTo(String value) {
            addCriterion("t1.IFEFFECT <=", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectLike(String value) {
            addCriterion("t1.IFEFFECT like", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectNotLike(String value) {
            addCriterion("t1.IFEFFECT not like", value, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectIn(List<String> values) {
            addCriterion("t1.IFEFFECT in", values, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectNotIn(List<String> values) {
            addCriterion("t1.IFEFFECT not in", values, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectBetween(String value1, String value2) {
            addCriterion("t1.IFEFFECT between", value1, value2, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andIfeffectNotBetween(String value1, String value2) {
            addCriterion("t1.IFEFFECT not between", value1, value2, "ifeffect");
            return (Criteria) this;
        }

        public Criteria andState1IsNull() {
            addCriterion("t1.STATE1 is null");
            return (Criteria) this;
        }

        public Criteria andState1IsNotNull() {
            addCriterion("t1.STATE1 is not null");
            return (Criteria) this;
        }

        public Criteria andState1EqualTo(Short value) {
            addCriterion("t1.STATE1 =", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1NotEqualTo(Short value) {
            addCriterion("t1.STATE1 <>", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1GreaterThan(Short value) {
            addCriterion("t1.STATE1 >", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.STATE1 >=", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1LessThan(Short value) {
            addCriterion("t1.STATE1 <", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1LessThanOrEqualTo(Short value) {
            addCriterion("t1.STATE1 <=", value, "state1");
            return (Criteria) this;
        }

        public Criteria andState1In(List<Short> values) {
            addCriterion("t1.STATE1 in", values, "state1");
            return (Criteria) this;
        }

        public Criteria andState1NotIn(List<Short> values) {
            addCriterion("t1.STATE1 not in", values, "state1");
            return (Criteria) this;
        }

        public Criteria andState1Between(Short value1, Short value2) {
            addCriterion("t1.STATE1 between", value1, value2, "state1");
            return (Criteria) this;
        }

        public Criteria andState1NotBetween(Short value1, Short value2) {
            addCriterion("t1.STATE1 not between", value1, value2, "state1");
            return (Criteria) this;
        }

        public Criteria andState2IsNull() {
            addCriterion("t1.STATE2 is null");
            return (Criteria) this;
        }

        public Criteria andState2IsNotNull() {
            addCriterion("t1.STATE2 is not null");
            return (Criteria) this;
        }

        public Criteria andState2EqualTo(Short value) {
            addCriterion("t1.STATE2 =", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotEqualTo(Short value) {
            addCriterion("t1.STATE2 <>", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2GreaterThan(Short value) {
            addCriterion("t1.STATE2 >", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.STATE2 >=", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2LessThan(Short value) {
            addCriterion("t1.STATE2 <", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2LessThanOrEqualTo(Short value) {
            addCriterion("t1.STATE2 <=", value, "state2");
            return (Criteria) this;
        }

        public Criteria andState2In(List<Short> values) {
            addCriterion("t1.STATE2 in", values, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotIn(List<Short> values) {
            addCriterion("t1.STATE2 not in", values, "state2");
            return (Criteria) this;
        }

        public Criteria andState2Between(Short value1, Short value2) {
            addCriterion("t1.STATE2 between", value1, value2, "state2");
            return (Criteria) this;
        }

        public Criteria andState2NotBetween(Short value1, Short value2) {
            addCriterion("t1.STATE2 not between", value1, value2, "state2");
            return (Criteria) this;
        }

        public Criteria andState3IsNull() {
            addCriterion("t1.STATE3 is null");
            return (Criteria) this;
        }

        public Criteria andState3IsNotNull() {
            addCriterion("t1.STATE3 is not null");
            return (Criteria) this;
        }

        public Criteria andState3EqualTo(Short value) {
            addCriterion("t1.STATE3 =", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3NotEqualTo(Short value) {
            addCriterion("t1.STATE3 <>", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3GreaterThan(Short value) {
            addCriterion("t1.STATE3 >", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.STATE3 >=", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3LessThan(Short value) {
            addCriterion("t1.STATE3 <", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3LessThanOrEqualTo(Short value) {
            addCriterion("t1.STATE3 <=", value, "state3");
            return (Criteria) this;
        }

        public Criteria andState3In(List<Short> values) {
            addCriterion("t1.STATE3 in", values, "state3");
            return (Criteria) this;
        }

        public Criteria andState3NotIn(List<Short> values) {
            addCriterion("t1.STATE3 not in", values, "state3");
            return (Criteria) this;
        }

        public Criteria andState3Between(Short value1, Short value2) {
            addCriterion("t1.STATE3 between", value1, value2, "state3");
            return (Criteria) this;
        }

        public Criteria andState3NotBetween(Short value1, Short value2) {
            addCriterion("t1.STATE3 not between", value1, value2, "state3");
            return (Criteria) this;
        }

        public Criteria andMovstateIsNull() {
            addCriterion("t1.MOVSTATE is null");
            return (Criteria) this;
        }

        public Criteria andMovstateIsNotNull() {
            addCriterion("t1.MOVSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andMovstateEqualTo(Short value) {
            addCriterion("t1.MOVSTATE =", value, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateNotEqualTo(Short value) {
            addCriterion("t1.MOVSTATE <>", value, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateGreaterThan(Short value) {
            addCriterion("t1.MOVSTATE >", value, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MOVSTATE >=", value, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateLessThan(Short value) {
            addCriterion("t1.MOVSTATE <", value, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateLessThanOrEqualTo(Short value) {
            addCriterion("t1.MOVSTATE <=", value, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateIn(List<Short> values) {
            addCriterion("t1.MOVSTATE in", values, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateNotIn(List<Short> values) {
            addCriterion("t1.MOVSTATE not in", values, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateBetween(Short value1, Short value2) {
            addCriterion("t1.MOVSTATE between", value1, value2, "movstate");
            return (Criteria) this;
        }

        public Criteria andMovstateNotBetween(Short value1, Short value2) {
            addCriterion("t1.MOVSTATE not between", value1, value2, "movstate");
            return (Criteria) this;
        }

        public Criteria andConstateIsNull() {
            addCriterion("t1.CONSTATE is null");
            return (Criteria) this;
        }

        public Criteria andConstateIsNotNull() {
            addCriterion("t1.CONSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andConstateEqualTo(Short value) {
            addCriterion("t1.CONSTATE =", value, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateNotEqualTo(Short value) {
            addCriterion("t1.CONSTATE <>", value, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateGreaterThan(Short value) {
            addCriterion("t1.CONSTATE >", value, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.CONSTATE >=", value, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateLessThan(Short value) {
            addCriterion("t1.CONSTATE <", value, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateLessThanOrEqualTo(Short value) {
            addCriterion("t1.CONSTATE <=", value, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateIn(List<Short> values) {
            addCriterion("t1.CONSTATE in", values, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateNotIn(List<Short> values) {
            addCriterion("t1.CONSTATE not in", values, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateBetween(Short value1, Short value2) {
            addCriterion("t1.CONSTATE between", value1, value2, "constate");
            return (Criteria) this;
        }

        public Criteria andConstateNotBetween(Short value1, Short value2) {
            addCriterion("t1.CONSTATE not between", value1, value2, "constate");
            return (Criteria) this;
        }

        public Criteria andCListoreIdIsNull() {
            addCriterion("t1.C_LISTORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCListoreIdIsNotNull() {
            addCriterion("t1.C_LISTORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCListoreIdEqualTo(Long value) {
            addCriterion("t1.C_LISTORE_ID =", value, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdNotEqualTo(Long value) {
            addCriterion("t1.C_LISTORE_ID <>", value, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdGreaterThan(Long value) {
            addCriterion("t1.C_LISTORE_ID >", value, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_LISTORE_ID >=", value, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdLessThan(Long value) {
            addCriterion("t1.C_LISTORE_ID <", value, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_LISTORE_ID <=", value, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdIn(List<Long> values) {
            addCriterion("t1.C_LISTORE_ID in", values, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdNotIn(List<Long> values) {
            addCriterion("t1.C_LISTORE_ID not in", values, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_LISTORE_ID between", value1, value2, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCListoreIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_LISTORE_ID not between", value1, value2, "cListoreId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdIsNull() {
            addCriterion("t1.C_BIGAREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdIsNotNull() {
            addCriterion("t1.C_BIGAREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdEqualTo(Long value) {
            addCriterion("t1.C_BIGAREA_ID =", value, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdNotEqualTo(Long value) {
            addCriterion("t1.C_BIGAREA_ID <>", value, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdGreaterThan(Long value) {
            addCriterion("t1.C_BIGAREA_ID >", value, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_BIGAREA_ID >=", value, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdLessThan(Long value) {
            addCriterion("t1.C_BIGAREA_ID <", value, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_BIGAREA_ID <=", value, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdIn(List<Long> values) {
            addCriterion("t1.C_BIGAREA_ID in", values, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdNotIn(List<Long> values) {
            addCriterion("t1.C_BIGAREA_ID not in", values, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_BIGAREA_ID between", value1, value2, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andCBigareaIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_BIGAREA_ID not between", value1, value2, "cBigareaId");
            return (Criteria) this;
        }

        public Criteria andSrccodeIsNull() {
            addCriterion("t1.SRCCODE is null");
            return (Criteria) this;
        }

        public Criteria andSrccodeIsNotNull() {
            addCriterion("t1.SRCCODE is not null");
            return (Criteria) this;
        }

        public Criteria andSrccodeEqualTo(String value) {
            addCriterion("t1.SRCCODE =", value, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeNotEqualTo(String value) {
            addCriterion("t1.SRCCODE <>", value, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeGreaterThan(String value) {
            addCriterion("t1.SRCCODE >", value, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.SRCCODE >=", value, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeLessThan(String value) {
            addCriterion("t1.SRCCODE <", value, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeLessThanOrEqualTo(String value) {
            addCriterion("t1.SRCCODE <=", value, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeLike(String value) {
            addCriterion("t1.SRCCODE like", value, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeNotLike(String value) {
            addCriterion("t1.SRCCODE not like", value, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeIn(List<String> values) {
            addCriterion("t1.SRCCODE in", values, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeNotIn(List<String> values) {
            addCriterion("t1.SRCCODE not in", values, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeBetween(String value1, String value2) {
            addCriterion("t1.SRCCODE between", value1, value2, "srccode");
            return (Criteria) this;
        }

        public Criteria andSrccodeNotBetween(String value1, String value2) {
            addCriterion("t1.SRCCODE not between", value1, value2, "srccode");
            return (Criteria) this;
        }

        public Criteria andIsflagIsNull() {
            addCriterion("t1.ISFLAG is null");
            return (Criteria) this;
        }

        public Criteria andIsflagIsNotNull() {
            addCriterion("t1.ISFLAG is not null");
            return (Criteria) this;
        }

        public Criteria andIsflagEqualTo(String value) {
            addCriterion("t1.ISFLAG =", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagNotEqualTo(String value) {
            addCriterion("t1.ISFLAG <>", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagGreaterThan(String value) {
            addCriterion("t1.ISFLAG >", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISFLAG >=", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagLessThan(String value) {
            addCriterion("t1.ISFLAG <", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagLessThanOrEqualTo(String value) {
            addCriterion("t1.ISFLAG <=", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagLike(String value) {
            addCriterion("t1.ISFLAG like", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagNotLike(String value) {
            addCriterion("t1.ISFLAG not like", value, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagIn(List<String> values) {
            addCriterion("t1.ISFLAG in", values, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagNotIn(List<String> values) {
            addCriterion("t1.ISFLAG not in", values, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagBetween(String value1, String value2) {
            addCriterion("t1.ISFLAG between", value1, value2, "isflag");
            return (Criteria) this;
        }

        public Criteria andIsflagNotBetween(String value1, String value2) {
            addCriterion("t1.ISFLAG not between", value1, value2, "isflag");
            return (Criteria) this;
        }

        public Criteria andCountercodeIsNull() {
            addCriterion("t1.COUNTERCODE is null");
            return (Criteria) this;
        }

        public Criteria andCountercodeIsNotNull() {
            addCriterion("t1.COUNTERCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCountercodeEqualTo(String value) {
            addCriterion("t1.COUNTERCODE =", value, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeNotEqualTo(String value) {
            addCriterion("t1.COUNTERCODE <>", value, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeGreaterThan(String value) {
            addCriterion("t1.COUNTERCODE >", value, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.COUNTERCODE >=", value, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeLessThan(String value) {
            addCriterion("t1.COUNTERCODE <", value, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeLessThanOrEqualTo(String value) {
            addCriterion("t1.COUNTERCODE <=", value, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeLike(String value) {
            addCriterion("t1.COUNTERCODE like", value, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeNotLike(String value) {
            addCriterion("t1.COUNTERCODE not like", value, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeIn(List<String> values) {
            addCriterion("t1.COUNTERCODE in", values, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeNotIn(List<String> values) {
            addCriterion("t1.COUNTERCODE not in", values, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeBetween(String value1, String value2) {
            addCriterion("t1.COUNTERCODE between", value1, value2, "countercode");
            return (Criteria) this;
        }

        public Criteria andCountercodeNotBetween(String value1, String value2) {
            addCriterion("t1.COUNTERCODE not between", value1, value2, "countercode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeIsNull() {
            addCriterion("t1.INSIDECODE is null");
            return (Criteria) this;
        }

        public Criteria andInsidecodeIsNotNull() {
            addCriterion("t1.INSIDECODE is not null");
            return (Criteria) this;
        }

        public Criteria andInsidecodeEqualTo(String value) {
            addCriterion("t1.INSIDECODE =", value, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeNotEqualTo(String value) {
            addCriterion("t1.INSIDECODE <>", value, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeGreaterThan(String value) {
            addCriterion("t1.INSIDECODE >", value, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.INSIDECODE >=", value, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeLessThan(String value) {
            addCriterion("t1.INSIDECODE <", value, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeLessThanOrEqualTo(String value) {
            addCriterion("t1.INSIDECODE <=", value, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeLike(String value) {
            addCriterion("t1.INSIDECODE like", value, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeNotLike(String value) {
            addCriterion("t1.INSIDECODE not like", value, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeIn(List<String> values) {
            addCriterion("t1.INSIDECODE in", values, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeNotIn(List<String> values) {
            addCriterion("t1.INSIDECODE not in", values, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeBetween(String value1, String value2) {
            addCriterion("t1.INSIDECODE between", value1, value2, "insidecode");
            return (Criteria) this;
        }

        public Criteria andInsidecodeNotBetween(String value1, String value2) {
            addCriterion("t1.INSIDECODE not between", value1, value2, "insidecode");
            return (Criteria) this;
        }

        public Criteria andRegisternameIsNull() {
            addCriterion("t1.REGISTERNAME is null");
            return (Criteria) this;
        }

        public Criteria andRegisternameIsNotNull() {
            addCriterion("t1.REGISTERNAME is not null");
            return (Criteria) this;
        }

        public Criteria andRegisternameEqualTo(String value) {
            addCriterion("t1.REGISTERNAME =", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotEqualTo(String value) {
            addCriterion("t1.REGISTERNAME <>", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameGreaterThan(String value) {
            addCriterion("t1.REGISTERNAME >", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameGreaterThanOrEqualTo(String value) {
            addCriterion("t1.REGISTERNAME >=", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLessThan(String value) {
            addCriterion("t1.REGISTERNAME <", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLessThanOrEqualTo(String value) {
            addCriterion("t1.REGISTERNAME <=", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameLike(String value) {
            addCriterion("t1.REGISTERNAME like", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotLike(String value) {
            addCriterion("t1.REGISTERNAME not like", value, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameIn(List<String> values) {
            addCriterion("t1.REGISTERNAME in", values, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotIn(List<String> values) {
            addCriterion("t1.REGISTERNAME not in", values, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameBetween(String value1, String value2) {
            addCriterion("t1.REGISTERNAME between", value1, value2, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisternameNotBetween(String value1, String value2) {
            addCriterion("t1.REGISTERNAME not between", value1, value2, "registername");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrIsNull() {
            addCriterion("t1.REGISTERADDR is null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrIsNotNull() {
            addCriterion("t1.REGISTERADDR is not null");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrEqualTo(String value) {
            addCriterion("t1.REGISTERADDR =", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrNotEqualTo(String value) {
            addCriterion("t1.REGISTERADDR <>", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrGreaterThan(String value) {
            addCriterion("t1.REGISTERADDR >", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrGreaterThanOrEqualTo(String value) {
            addCriterion("t1.REGISTERADDR >=", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrLessThan(String value) {
            addCriterion("t1.REGISTERADDR <", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrLessThanOrEqualTo(String value) {
            addCriterion("t1.REGISTERADDR <=", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrLike(String value) {
            addCriterion("t1.REGISTERADDR like", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrNotLike(String value) {
            addCriterion("t1.REGISTERADDR not like", value, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrIn(List<String> values) {
            addCriterion("t1.REGISTERADDR in", values, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrNotIn(List<String> values) {
            addCriterion("t1.REGISTERADDR not in", values, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrBetween(String value1, String value2) {
            addCriterion("t1.REGISTERADDR between", value1, value2, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andRegisteraddrNotBetween(String value1, String value2) {
            addCriterion("t1.REGISTERADDR not between", value1, value2, "registeraddr");
            return (Criteria) this;
        }

        public Criteria andAccperiodIsNull() {
            addCriterion("t1.ACCPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andAccperiodIsNotNull() {
            addCriterion("t1.ACCPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andAccperiodEqualTo(String value) {
            addCriterion("t1.ACCPERIOD =", value, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodNotEqualTo(String value) {
            addCriterion("t1.ACCPERIOD <>", value, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodGreaterThan(String value) {
            addCriterion("t1.ACCPERIOD >", value, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ACCPERIOD >=", value, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodLessThan(String value) {
            addCriterion("t1.ACCPERIOD <", value, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodLessThanOrEqualTo(String value) {
            addCriterion("t1.ACCPERIOD <=", value, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodLike(String value) {
            addCriterion("t1.ACCPERIOD like", value, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodNotLike(String value) {
            addCriterion("t1.ACCPERIOD not like", value, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodIn(List<String> values) {
            addCriterion("t1.ACCPERIOD in", values, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodNotIn(List<String> values) {
            addCriterion("t1.ACCPERIOD not in", values, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodBetween(String value1, String value2) {
            addCriterion("t1.ACCPERIOD between", value1, value2, "accperiod");
            return (Criteria) this;
        }

        public Criteria andAccperiodNotBetween(String value1, String value2) {
            addCriterion("t1.ACCPERIOD not between", value1, value2, "accperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodIsNull() {
            addCriterion("t1.CHECKPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andCheckperiodIsNotNull() {
            addCriterion("t1.CHECKPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andCheckperiodEqualTo(String value) {
            addCriterion("t1.CHECKPERIOD =", value, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodNotEqualTo(String value) {
            addCriterion("t1.CHECKPERIOD <>", value, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodGreaterThan(String value) {
            addCriterion("t1.CHECKPERIOD >", value, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CHECKPERIOD >=", value, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodLessThan(String value) {
            addCriterion("t1.CHECKPERIOD <", value, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodLessThanOrEqualTo(String value) {
            addCriterion("t1.CHECKPERIOD <=", value, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodLike(String value) {
            addCriterion("t1.CHECKPERIOD like", value, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodNotLike(String value) {
            addCriterion("t1.CHECKPERIOD not like", value, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodIn(List<String> values) {
            addCriterion("t1.CHECKPERIOD in", values, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodNotIn(List<String> values) {
            addCriterion("t1.CHECKPERIOD not in", values, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodBetween(String value1, String value2) {
            addCriterion("t1.CHECKPERIOD between", value1, value2, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andCheckperiodNotBetween(String value1, String value2) {
            addCriterion("t1.CHECKPERIOD not between", value1, value2, "checkperiod");
            return (Criteria) this;
        }

        public Criteria andAccdateIsNull() {
            addCriterion("t1.ACCDATE is null");
            return (Criteria) this;
        }

        public Criteria andAccdateIsNotNull() {
            addCriterion("t1.ACCDATE is not null");
            return (Criteria) this;
        }

        public Criteria andAccdateEqualTo(String value) {
            addCriterion("t1.ACCDATE =", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateNotEqualTo(String value) {
            addCriterion("t1.ACCDATE <>", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateGreaterThan(String value) {
            addCriterion("t1.ACCDATE >", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ACCDATE >=", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateLessThan(String value) {
            addCriterion("t1.ACCDATE <", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateLessThanOrEqualTo(String value) {
            addCriterion("t1.ACCDATE <=", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateLike(String value) {
            addCriterion("t1.ACCDATE like", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateNotLike(String value) {
            addCriterion("t1.ACCDATE not like", value, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateIn(List<String> values) {
            addCriterion("t1.ACCDATE in", values, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateNotIn(List<String> values) {
            addCriterion("t1.ACCDATE not in", values, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateBetween(String value1, String value2) {
            addCriterion("t1.ACCDATE between", value1, value2, "accdate");
            return (Criteria) this;
        }

        public Criteria andAccdateNotBetween(String value1, String value2) {
            addCriterion("t1.ACCDATE not between", value1, value2, "accdate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIsNull() {
            addCriterion("t1.INVOICEDATE is null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIsNotNull() {
            addCriterion("t1.INVOICEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andInvoicedateEqualTo(String value) {
            addCriterion("t1.INVOICEDATE =", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotEqualTo(String value) {
            addCriterion("t1.INVOICEDATE <>", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThan(String value) {
            addCriterion("t1.INVOICEDATE >", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateGreaterThanOrEqualTo(String value) {
            addCriterion("t1.INVOICEDATE >=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThan(String value) {
            addCriterion("t1.INVOICEDATE <", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLessThanOrEqualTo(String value) {
            addCriterion("t1.INVOICEDATE <=", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateLike(String value) {
            addCriterion("t1.INVOICEDATE like", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotLike(String value) {
            addCriterion("t1.INVOICEDATE not like", value, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateIn(List<String> values) {
            addCriterion("t1.INVOICEDATE in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotIn(List<String> values) {
            addCriterion("t1.INVOICEDATE not in", values, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateBetween(String value1, String value2) {
            addCriterion("t1.INVOICEDATE between", value1, value2, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andInvoicedateNotBetween(String value1, String value2) {
            addCriterion("t1.INVOICEDATE not between", value1, value2, "invoicedate");
            return (Criteria) this;
        }

        public Criteria andMBreakevenIsNull() {
            addCriterion("t1.M_BREAKEVEN is null");
            return (Criteria) this;
        }

        public Criteria andMBreakevenIsNotNull() {
            addCriterion("t1.M_BREAKEVEN is not null");
            return (Criteria) this;
        }

        public Criteria andMBreakevenEqualTo(BigDecimal value) {
            addCriterion("t1.M_BREAKEVEN =", value, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenNotEqualTo(BigDecimal value) {
            addCriterion("t1.M_BREAKEVEN <>", value, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenGreaterThan(BigDecimal value) {
            addCriterion("t1.M_BREAKEVEN >", value, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.M_BREAKEVEN >=", value, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenLessThan(BigDecimal value) {
            addCriterion("t1.M_BREAKEVEN <", value, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.M_BREAKEVEN <=", value, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenIn(List<BigDecimal> values) {
            addCriterion("t1.M_BREAKEVEN in", values, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenNotIn(List<BigDecimal> values) {
            addCriterion("t1.M_BREAKEVEN not in", values, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.M_BREAKEVEN between", value1, value2, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andMBreakevenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.M_BREAKEVEN not between", value1, value2, "mBreakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenIsNull() {
            addCriterion("t1.BREAKEVEN is null");
            return (Criteria) this;
        }

        public Criteria andBreakevenIsNotNull() {
            addCriterion("t1.BREAKEVEN is not null");
            return (Criteria) this;
        }

        public Criteria andBreakevenEqualTo(BigDecimal value) {
            addCriterion("t1.BREAKEVEN =", value, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenNotEqualTo(BigDecimal value) {
            addCriterion("t1.BREAKEVEN <>", value, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenGreaterThan(BigDecimal value) {
            addCriterion("t1.BREAKEVEN >", value, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.BREAKEVEN >=", value, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenLessThan(BigDecimal value) {
            addCriterion("t1.BREAKEVEN <", value, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.BREAKEVEN <=", value, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenIn(List<BigDecimal> values) {
            addCriterion("t1.BREAKEVEN in", values, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenNotIn(List<BigDecimal> values) {
            addCriterion("t1.BREAKEVEN not in", values, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.BREAKEVEN between", value1, value2, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.BREAKEVEN not between", value1, value2, "breakeven");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoIsNull() {
            addCriterion("t1.BREAKEVEN_INFO is null");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoIsNotNull() {
            addCriterion("t1.BREAKEVEN_INFO is not null");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoEqualTo(String value) {
            addCriterion("t1.BREAKEVEN_INFO =", value, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoNotEqualTo(String value) {
            addCriterion("t1.BREAKEVEN_INFO <>", value, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoGreaterThan(String value) {
            addCriterion("t1.BREAKEVEN_INFO >", value, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.BREAKEVEN_INFO >=", value, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoLessThan(String value) {
            addCriterion("t1.BREAKEVEN_INFO <", value, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoLessThanOrEqualTo(String value) {
            addCriterion("t1.BREAKEVEN_INFO <=", value, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoLike(String value) {
            addCriterion("t1.BREAKEVEN_INFO like", value, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoNotLike(String value) {
            addCriterion("t1.BREAKEVEN_INFO not like", value, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoIn(List<String> values) {
            addCriterion("t1.BREAKEVEN_INFO in", values, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoNotIn(List<String> values) {
            addCriterion("t1.BREAKEVEN_INFO not in", values, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoBetween(String value1, String value2) {
            addCriterion("t1.BREAKEVEN_INFO between", value1, value2, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBreakevenInfoNotBetween(String value1, String value2) {
            addCriterion("t1.BREAKEVEN_INFO not between", value1, value2, "breakevenInfo");
            return (Criteria) this;
        }

        public Criteria andBillperiodIsNull() {
            addCriterion("t1.BILLPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andBillperiodIsNotNull() {
            addCriterion("t1.BILLPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andBillperiodEqualTo(String value) {
            addCriterion("t1.BILLPERIOD =", value, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodNotEqualTo(String value) {
            addCriterion("t1.BILLPERIOD <>", value, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodGreaterThan(String value) {
            addCriterion("t1.BILLPERIOD >", value, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodGreaterThanOrEqualTo(String value) {
            addCriterion("t1.BILLPERIOD >=", value, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodLessThan(String value) {
            addCriterion("t1.BILLPERIOD <", value, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodLessThanOrEqualTo(String value) {
            addCriterion("t1.BILLPERIOD <=", value, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodLike(String value) {
            addCriterion("t1.BILLPERIOD like", value, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodNotLike(String value) {
            addCriterion("t1.BILLPERIOD not like", value, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodIn(List<String> values) {
            addCriterion("t1.BILLPERIOD in", values, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodNotIn(List<String> values) {
            addCriterion("t1.BILLPERIOD not in", values, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodBetween(String value1, String value2) {
            addCriterion("t1.BILLPERIOD between", value1, value2, "billperiod");
            return (Criteria) this;
        }

        public Criteria andBillperiodNotBetween(String value1, String value2) {
            addCriterion("t1.BILLPERIOD not between", value1, value2, "billperiod");
            return (Criteria) this;
        }

        public Criteria andPosCntIsNull() {
            addCriterion("t1.POS_CNT is null");
            return (Criteria) this;
        }

        public Criteria andPosCntIsNotNull() {
            addCriterion("t1.POS_CNT is not null");
            return (Criteria) this;
        }

        public Criteria andPosCntEqualTo(Long value) {
            addCriterion("t1.POS_CNT =", value, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntNotEqualTo(Long value) {
            addCriterion("t1.POS_CNT <>", value, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntGreaterThan(Long value) {
            addCriterion("t1.POS_CNT >", value, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.POS_CNT >=", value, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntLessThan(Long value) {
            addCriterion("t1.POS_CNT <", value, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntLessThanOrEqualTo(Long value) {
            addCriterion("t1.POS_CNT <=", value, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntIn(List<Long> values) {
            addCriterion("t1.POS_CNT in", values, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntNotIn(List<Long> values) {
            addCriterion("t1.POS_CNT not in", values, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntBetween(Long value1, Long value2) {
            addCriterion("t1.POS_CNT between", value1, value2, "posCnt");
            return (Criteria) this;
        }

        public Criteria andPosCntNotBetween(Long value1, Long value2) {
            addCriterion("t1.POS_CNT not between", value1, value2, "posCnt");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeIsNull() {
            addCriterion("t1.CATALOGCODE is null");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeIsNotNull() {
            addCriterion("t1.CATALOGCODE is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeEqualTo(String value) {
            addCriterion("t1.CATALOGCODE =", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeNotEqualTo(String value) {
            addCriterion("t1.CATALOGCODE <>", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeGreaterThan(String value) {
            addCriterion("t1.CATALOGCODE >", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CATALOGCODE >=", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeLessThan(String value) {
            addCriterion("t1.CATALOGCODE <", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeLessThanOrEqualTo(String value) {
            addCriterion("t1.CATALOGCODE <=", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeLike(String value) {
            addCriterion("t1.CATALOGCODE like", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeNotLike(String value) {
            addCriterion("t1.CATALOGCODE not like", value, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeIn(List<String> values) {
            addCriterion("t1.CATALOGCODE in", values, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeNotIn(List<String> values) {
            addCriterion("t1.CATALOGCODE not in", values, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeBetween(String value1, String value2) {
            addCriterion("t1.CATALOGCODE between", value1, value2, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalogcodeNotBetween(String value1, String value2) {
            addCriterion("t1.CATALOGCODE not between", value1, value2, "catalogcode");
            return (Criteria) this;
        }

        public Criteria andCatalognameIsNull() {
            addCriterion("t1.CATALOGNAME is null");
            return (Criteria) this;
        }

        public Criteria andCatalognameIsNotNull() {
            addCriterion("t1.CATALOGNAME is not null");
            return (Criteria) this;
        }

        public Criteria andCatalognameEqualTo(String value) {
            addCriterion("t1.CATALOGNAME =", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameNotEqualTo(String value) {
            addCriterion("t1.CATALOGNAME <>", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameGreaterThan(String value) {
            addCriterion("t1.CATALOGNAME >", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CATALOGNAME >=", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameLessThan(String value) {
            addCriterion("t1.CATALOGNAME <", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameLessThanOrEqualTo(String value) {
            addCriterion("t1.CATALOGNAME <=", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameLike(String value) {
            addCriterion("t1.CATALOGNAME like", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameNotLike(String value) {
            addCriterion("t1.CATALOGNAME not like", value, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameIn(List<String> values) {
            addCriterion("t1.CATALOGNAME in", values, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameNotIn(List<String> values) {
            addCriterion("t1.CATALOGNAME not in", values, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameBetween(String value1, String value2) {
            addCriterion("t1.CATALOGNAME between", value1, value2, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalognameNotBetween(String value1, String value2) {
            addCriterion("t1.CATALOGNAME not between", value1, value2, "catalogname");
            return (Criteria) this;
        }

        public Criteria andCatalogupIsNull() {
            addCriterion("t1.CATALOGUP is null");
            return (Criteria) this;
        }

        public Criteria andCatalogupIsNotNull() {
            addCriterion("t1.CATALOGUP is not null");
            return (Criteria) this;
        }

        public Criteria andCatalogupEqualTo(String value) {
            addCriterion("t1.CATALOGUP =", value, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupNotEqualTo(String value) {
            addCriterion("t1.CATALOGUP <>", value, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupGreaterThan(String value) {
            addCriterion("t1.CATALOGUP >", value, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CATALOGUP >=", value, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupLessThan(String value) {
            addCriterion("t1.CATALOGUP <", value, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupLessThanOrEqualTo(String value) {
            addCriterion("t1.CATALOGUP <=", value, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupLike(String value) {
            addCriterion("t1.CATALOGUP like", value, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupNotLike(String value) {
            addCriterion("t1.CATALOGUP not like", value, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupIn(List<String> values) {
            addCriterion("t1.CATALOGUP in", values, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupNotIn(List<String> values) {
            addCriterion("t1.CATALOGUP not in", values, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupBetween(String value1, String value2) {
            addCriterion("t1.CATALOGUP between", value1, value2, "catalogup");
            return (Criteria) this;
        }

        public Criteria andCatalogupNotBetween(String value1, String value2) {
            addCriterion("t1.CATALOGUP not between", value1, value2, "catalogup");
            return (Criteria) this;
        }

        public Criteria andClienttypeIsNull() {
            addCriterion("t1.CLIENTTYPE is null");
            return (Criteria) this;
        }

        public Criteria andClienttypeIsNotNull() {
            addCriterion("t1.CLIENTTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andClienttypeEqualTo(String value) {
            addCriterion("t1.CLIENTTYPE =", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotEqualTo(String value) {
            addCriterion("t1.CLIENTTYPE <>", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeGreaterThan(String value) {
            addCriterion("t1.CLIENTTYPE >", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CLIENTTYPE >=", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeLessThan(String value) {
            addCriterion("t1.CLIENTTYPE <", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeLessThanOrEqualTo(String value) {
            addCriterion("t1.CLIENTTYPE <=", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeLike(String value) {
            addCriterion("t1.CLIENTTYPE like", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotLike(String value) {
            addCriterion("t1.CLIENTTYPE not like", value, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeIn(List<String> values) {
            addCriterion("t1.CLIENTTYPE in", values, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotIn(List<String> values) {
            addCriterion("t1.CLIENTTYPE not in", values, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeBetween(String value1, String value2) {
            addCriterion("t1.CLIENTTYPE between", value1, value2, "clienttype");
            return (Criteria) this;
        }

        public Criteria andClienttypeNotBetween(String value1, String value2) {
            addCriterion("t1.CLIENTTYPE not between", value1, value2, "clienttype");
            return (Criteria) this;
        }

        public Criteria andUpidIsNull() {
            addCriterion("t1.UPID is null");
            return (Criteria) this;
        }

        public Criteria andUpidIsNotNull() {
            addCriterion("t1.UPID is not null");
            return (Criteria) this;
        }

        public Criteria andUpidEqualTo(String value) {
            addCriterion("t1.UPID =", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotEqualTo(String value) {
            addCriterion("t1.UPID <>", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThan(String value) {
            addCriterion("t1.UPID >", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidGreaterThanOrEqualTo(String value) {
            addCriterion("t1.UPID >=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThan(String value) {
            addCriterion("t1.UPID <", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLessThanOrEqualTo(String value) {
            addCriterion("t1.UPID <=", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidLike(String value) {
            addCriterion("t1.UPID like", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotLike(String value) {
            addCriterion("t1.UPID not like", value, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidIn(List<String> values) {
            addCriterion("t1.UPID in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotIn(List<String> values) {
            addCriterion("t1.UPID not in", values, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidBetween(String value1, String value2) {
            addCriterion("t1.UPID between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andUpidNotBetween(String value1, String value2) {
            addCriterion("t1.UPID not between", value1, value2, "upid");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlIsNull() {
            addCriterion("t1.C_STORE_SQL is null");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlIsNotNull() {
            addCriterion("t1.C_STORE_SQL is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlEqualTo(String value) {
            addCriterion("t1.C_STORE_SQL =", value, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlNotEqualTo(String value) {
            addCriterion("t1.C_STORE_SQL <>", value, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlGreaterThan(String value) {
            addCriterion("t1.C_STORE_SQL >", value, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlGreaterThanOrEqualTo(String value) {
            addCriterion("t1.C_STORE_SQL >=", value, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlLessThan(String value) {
            addCriterion("t1.C_STORE_SQL <", value, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlLessThanOrEqualTo(String value) {
            addCriterion("t1.C_STORE_SQL <=", value, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlLike(String value) {
            addCriterion("t1.C_STORE_SQL like", value, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlNotLike(String value) {
            addCriterion("t1.C_STORE_SQL not like", value, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlIn(List<String> values) {
            addCriterion("t1.C_STORE_SQL in", values, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlNotIn(List<String> values) {
            addCriterion("t1.C_STORE_SQL not in", values, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlBetween(String value1, String value2) {
            addCriterion("t1.C_STORE_SQL between", value1, value2, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andCStoreSqlNotBetween(String value1, String value2) {
            addCriterion("t1.C_STORE_SQL not between", value1, value2, "cStoreSql");
            return (Criteria) this;
        }

        public Criteria andIfstockIsNull() {
            addCriterion("t1.IFSTOCK is null");
            return (Criteria) this;
        }

        public Criteria andIfstockIsNotNull() {
            addCriterion("t1.IFSTOCK is not null");
            return (Criteria) this;
        }

        public Criteria andIfstockEqualTo(String value) {
            addCriterion("t1.IFSTOCK =", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockNotEqualTo(String value) {
            addCriterion("t1.IFSTOCK <>", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockGreaterThan(String value) {
            addCriterion("t1.IFSTOCK >", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IFSTOCK >=", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockLessThan(String value) {
            addCriterion("t1.IFSTOCK <", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockLessThanOrEqualTo(String value) {
            addCriterion("t1.IFSTOCK <=", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockLike(String value) {
            addCriterion("t1.IFSTOCK like", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockNotLike(String value) {
            addCriterion("t1.IFSTOCK not like", value, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockIn(List<String> values) {
            addCriterion("t1.IFSTOCK in", values, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockNotIn(List<String> values) {
            addCriterion("t1.IFSTOCK not in", values, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockBetween(String value1, String value2) {
            addCriterion("t1.IFSTOCK between", value1, value2, "ifstock");
            return (Criteria) this;
        }

        public Criteria andIfstockNotBetween(String value1, String value2) {
            addCriterion("t1.IFSTOCK not between", value1, value2, "ifstock");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdIsNull() {
            addCriterion("t1.C_BIGCITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdIsNotNull() {
            addCriterion("t1.C_BIGCITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdEqualTo(Long value) {
            addCriterion("t1.C_BIGCITY_ID =", value, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdNotEqualTo(Long value) {
            addCriterion("t1.C_BIGCITY_ID <>", value, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdGreaterThan(Long value) {
            addCriterion("t1.C_BIGCITY_ID >", value, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_BIGCITY_ID >=", value, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdLessThan(Long value) {
            addCriterion("t1.C_BIGCITY_ID <", value, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_BIGCITY_ID <=", value, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdIn(List<Long> values) {
            addCriterion("t1.C_BIGCITY_ID in", values, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdNotIn(List<Long> values) {
            addCriterion("t1.C_BIGCITY_ID not in", values, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_BIGCITY_ID between", value1, value2, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andCBigcityIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_BIGCITY_ID not between", value1, value2, "cBigcityId");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNull() {
            addCriterion("t1.LICENSE is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("t1.LICENSE is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("t1.LICENSE =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("t1.LICENSE <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("t1.LICENSE >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("t1.LICENSE >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("t1.LICENSE <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("t1.LICENSE <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("t1.LICENSE like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("t1.LICENSE not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("t1.LICENSE in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("t1.LICENSE not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("t1.LICENSE between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("t1.LICENSE not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andMinStorageIsNull() {
            addCriterion("t1.MIN_STORAGE is null");
            return (Criteria) this;
        }

        public Criteria andMinStorageIsNotNull() {
            addCriterion("t1.MIN_STORAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMinStorageEqualTo(Long value) {
            addCriterion("t1.MIN_STORAGE =", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageNotEqualTo(Long value) {
            addCriterion("t1.MIN_STORAGE <>", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageGreaterThan(Long value) {
            addCriterion("t1.MIN_STORAGE >", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.MIN_STORAGE >=", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageLessThan(Long value) {
            addCriterion("t1.MIN_STORAGE <", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageLessThanOrEqualTo(Long value) {
            addCriterion("t1.MIN_STORAGE <=", value, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageIn(List<Long> values) {
            addCriterion("t1.MIN_STORAGE in", values, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageNotIn(List<Long> values) {
            addCriterion("t1.MIN_STORAGE not in", values, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageBetween(Long value1, Long value2) {
            addCriterion("t1.MIN_STORAGE between", value1, value2, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMinStorageNotBetween(Long value1, Long value2) {
            addCriterion("t1.MIN_STORAGE not between", value1, value2, "minStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageIsNull() {
            addCriterion("t1.MAX_STORAGE is null");
            return (Criteria) this;
        }

        public Criteria andMaxStorageIsNotNull() {
            addCriterion("t1.MAX_STORAGE is not null");
            return (Criteria) this;
        }

        public Criteria andMaxStorageEqualTo(Long value) {
            addCriterion("t1.MAX_STORAGE =", value, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageNotEqualTo(Long value) {
            addCriterion("t1.MAX_STORAGE <>", value, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageGreaterThan(Long value) {
            addCriterion("t1.MAX_STORAGE >", value, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.MAX_STORAGE >=", value, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageLessThan(Long value) {
            addCriterion("t1.MAX_STORAGE <", value, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageLessThanOrEqualTo(Long value) {
            addCriterion("t1.MAX_STORAGE <=", value, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageIn(List<Long> values) {
            addCriterion("t1.MAX_STORAGE in", values, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageNotIn(List<Long> values) {
            addCriterion("t1.MAX_STORAGE not in", values, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageBetween(Long value1, Long value2) {
            addCriterion("t1.MAX_STORAGE between", value1, value2, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andMaxStorageNotBetween(Long value1, Long value2) {
            addCriterion("t1.MAX_STORAGE not between", value1, value2, "maxStorage");
            return (Criteria) this;
        }

        public Criteria andProfitcenterIsNull() {
            addCriterion("t1.PROFITCENTER is null");
            return (Criteria) this;
        }

        public Criteria andProfitcenterIsNotNull() {
            addCriterion("t1.PROFITCENTER is not null");
            return (Criteria) this;
        }

        public Criteria andProfitcenterEqualTo(String value) {
            addCriterion("t1.PROFITCENTER =", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterNotEqualTo(String value) {
            addCriterion("t1.PROFITCENTER <>", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterGreaterThan(String value) {
            addCriterion("t1.PROFITCENTER >", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterGreaterThanOrEqualTo(String value) {
            addCriterion("t1.PROFITCENTER >=", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterLessThan(String value) {
            addCriterion("t1.PROFITCENTER <", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterLessThanOrEqualTo(String value) {
            addCriterion("t1.PROFITCENTER <=", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterLike(String value) {
            addCriterion("t1.PROFITCENTER like", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterNotLike(String value) {
            addCriterion("t1.PROFITCENTER not like", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterIn(List<String> values) {
            addCriterion("t1.PROFITCENTER in", values, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterNotIn(List<String> values) {
            addCriterion("t1.PROFITCENTER not in", values, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterBetween(String value1, String value2) {
            addCriterion("t1.PROFITCENTER between", value1, value2, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterNotBetween(String value1, String value2) {
            addCriterion("t1.PROFITCENTER not between", value1, value2, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdIsNull() {
            addCriterion("t1.C_UFBLOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdIsNotNull() {
            addCriterion("t1.C_UFBLOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdEqualTo(Long value) {
            addCriterion("t1.C_UFBLOCK_ID =", value, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdNotEqualTo(Long value) {
            addCriterion("t1.C_UFBLOCK_ID <>", value, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdGreaterThan(Long value) {
            addCriterion("t1.C_UFBLOCK_ID >", value, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_UFBLOCK_ID >=", value, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdLessThan(Long value) {
            addCriterion("t1.C_UFBLOCK_ID <", value, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_UFBLOCK_ID <=", value, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdIn(List<Long> values) {
            addCriterion("t1.C_UFBLOCK_ID in", values, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdNotIn(List<Long> values) {
            addCriterion("t1.C_UFBLOCK_ID not in", values, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_UFBLOCK_ID between", value1, value2, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andCUfblockIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_UFBLOCK_ID not between", value1, value2, "cUfblockId");
            return (Criteria) this;
        }

        public Criteria andIsjoinIsNull() {
            addCriterion("t1.ISJOIN is null");
            return (Criteria) this;
        }

        public Criteria andIsjoinIsNotNull() {
            addCriterion("t1.ISJOIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsjoinEqualTo(String value) {
            addCriterion("t1.ISJOIN =", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinNotEqualTo(String value) {
            addCriterion("t1.ISJOIN <>", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinGreaterThan(String value) {
            addCriterion("t1.ISJOIN >", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISJOIN >=", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinLessThan(String value) {
            addCriterion("t1.ISJOIN <", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinLessThanOrEqualTo(String value) {
            addCriterion("t1.ISJOIN <=", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinLike(String value) {
            addCriterion("t1.ISJOIN like", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinNotLike(String value) {
            addCriterion("t1.ISJOIN not like", value, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinIn(List<String> values) {
            addCriterion("t1.ISJOIN in", values, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinNotIn(List<String> values) {
            addCriterion("t1.ISJOIN not in", values, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinBetween(String value1, String value2) {
            addCriterion("t1.ISJOIN between", value1, value2, "isjoin");
            return (Criteria) this;
        }

        public Criteria andIsjoinNotBetween(String value1, String value2) {
            addCriterion("t1.ISJOIN not between", value1, value2, "isjoin");
            return (Criteria) this;
        }

        public Criteria andOldStorenameIsNull() {
            addCriterion("t1.OLD_STORENAME is null");
            return (Criteria) this;
        }

        public Criteria andOldStorenameIsNotNull() {
            addCriterion("t1.OLD_STORENAME is not null");
            return (Criteria) this;
        }

        public Criteria andOldStorenameEqualTo(String value) {
            addCriterion("t1.OLD_STORENAME =", value, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameNotEqualTo(String value) {
            addCriterion("t1.OLD_STORENAME <>", value, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameGreaterThan(String value) {
            addCriterion("t1.OLD_STORENAME >", value, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameGreaterThanOrEqualTo(String value) {
            addCriterion("t1.OLD_STORENAME >=", value, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameLessThan(String value) {
            addCriterion("t1.OLD_STORENAME <", value, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameLessThanOrEqualTo(String value) {
            addCriterion("t1.OLD_STORENAME <=", value, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameLike(String value) {
            addCriterion("t1.OLD_STORENAME like", value, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameNotLike(String value) {
            addCriterion("t1.OLD_STORENAME not like", value, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameIn(List<String> values) {
            addCriterion("t1.OLD_STORENAME in", values, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameNotIn(List<String> values) {
            addCriterion("t1.OLD_STORENAME not in", values, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameBetween(String value1, String value2) {
            addCriterion("t1.OLD_STORENAME between", value1, value2, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andOldStorenameNotBetween(String value1, String value2) {
            addCriterion("t1.OLD_STORENAME not between", value1, value2, "oldStorename");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdIsNull() {
            addCriterion("t1.C_INTEGRALAREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdIsNotNull() {
            addCriterion("t1.C_INTEGRALAREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdEqualTo(Long value) {
            addCriterion("t1.C_INTEGRALAREA_ID =", value, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdNotEqualTo(Long value) {
            addCriterion("t1.C_INTEGRALAREA_ID <>", value, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdGreaterThan(Long value) {
            addCriterion("t1.C_INTEGRALAREA_ID >", value, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_INTEGRALAREA_ID >=", value, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdLessThan(Long value) {
            addCriterion("t1.C_INTEGRALAREA_ID <", value, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_INTEGRALAREA_ID <=", value, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdIn(List<Long> values) {
            addCriterion("t1.C_INTEGRALAREA_ID in", values, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdNotIn(List<Long> values) {
            addCriterion("t1.C_INTEGRALAREA_ID not in", values, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_INTEGRALAREA_ID between", value1, value2, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andCIntegralareaIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_INTEGRALAREA_ID not between", value1, value2, "cIntegralareaId");
            return (Criteria) this;
        }

        public Criteria andOpenremarkIsNull() {
            addCriterion("t1.OPENREMARK is null");
            return (Criteria) this;
        }

        public Criteria andOpenremarkIsNotNull() {
            addCriterion("t1.OPENREMARK is not null");
            return (Criteria) this;
        }

        public Criteria andOpenremarkEqualTo(String value) {
            addCriterion("t1.OPENREMARK =", value, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkNotEqualTo(String value) {
            addCriterion("t1.OPENREMARK <>", value, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkGreaterThan(String value) {
            addCriterion("t1.OPENREMARK >", value, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkGreaterThanOrEqualTo(String value) {
            addCriterion("t1.OPENREMARK >=", value, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkLessThan(String value) {
            addCriterion("t1.OPENREMARK <", value, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkLessThanOrEqualTo(String value) {
            addCriterion("t1.OPENREMARK <=", value, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkLike(String value) {
            addCriterion("t1.OPENREMARK like", value, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkNotLike(String value) {
            addCriterion("t1.OPENREMARK not like", value, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkIn(List<String> values) {
            addCriterion("t1.OPENREMARK in", values, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkNotIn(List<String> values) {
            addCriterion("t1.OPENREMARK not in", values, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkBetween(String value1, String value2) {
            addCriterion("t1.OPENREMARK between", value1, value2, "openremark");
            return (Criteria) this;
        }

        public Criteria andOpenremarkNotBetween(String value1, String value2) {
            addCriterion("t1.OPENREMARK not between", value1, value2, "openremark");
            return (Criteria) this;
        }

        public Criteria andIsTowmsIsNull() {
            addCriterion("t1.IS_TOWMS is null");
            return (Criteria) this;
        }

        public Criteria andIsTowmsIsNotNull() {
            addCriterion("t1.IS_TOWMS is not null");
            return (Criteria) this;
        }

        public Criteria andIsTowmsEqualTo(String value) {
            addCriterion("t1.IS_TOWMS =", value, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsNotEqualTo(String value) {
            addCriterion("t1.IS_TOWMS <>", value, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsGreaterThan(String value) {
            addCriterion("t1.IS_TOWMS >", value, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IS_TOWMS >=", value, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsLessThan(String value) {
            addCriterion("t1.IS_TOWMS <", value, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsLessThanOrEqualTo(String value) {
            addCriterion("t1.IS_TOWMS <=", value, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsLike(String value) {
            addCriterion("t1.IS_TOWMS like", value, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsNotLike(String value) {
            addCriterion("t1.IS_TOWMS not like", value, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsIn(List<String> values) {
            addCriterion("t1.IS_TOWMS in", values, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsNotIn(List<String> values) {
            addCriterion("t1.IS_TOWMS not in", values, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsBetween(String value1, String value2) {
            addCriterion("t1.IS_TOWMS between", value1, value2, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsTowmsNotBetween(String value1, String value2) {
            addCriterion("t1.IS_TOWMS not between", value1, value2, "isTowms");
            return (Criteria) this;
        }

        public Criteria andIsIchibanIsNull() {
            addCriterion("t1.IS_ICHIBAN is null");
            return (Criteria) this;
        }

        public Criteria andIsIchibanIsNotNull() {
            addCriterion("t1.IS_ICHIBAN is not null");
            return (Criteria) this;
        }

        public Criteria andIsIchibanEqualTo(String value) {
            addCriterion("t1.IS_ICHIBAN =", value, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanNotEqualTo(String value) {
            addCriterion("t1.IS_ICHIBAN <>", value, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanGreaterThan(String value) {
            addCriterion("t1.IS_ICHIBAN >", value, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IS_ICHIBAN >=", value, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanLessThan(String value) {
            addCriterion("t1.IS_ICHIBAN <", value, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanLessThanOrEqualTo(String value) {
            addCriterion("t1.IS_ICHIBAN <=", value, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanLike(String value) {
            addCriterion("t1.IS_ICHIBAN like", value, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanNotLike(String value) {
            addCriterion("t1.IS_ICHIBAN not like", value, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanIn(List<String> values) {
            addCriterion("t1.IS_ICHIBAN in", values, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanNotIn(List<String> values) {
            addCriterion("t1.IS_ICHIBAN not in", values, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanBetween(String value1, String value2) {
            addCriterion("t1.IS_ICHIBAN between", value1, value2, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsIchibanNotBetween(String value1, String value2) {
            addCriterion("t1.IS_ICHIBAN not between", value1, value2, "isIchiban");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreIsNull() {
            addCriterion("t1.IS_WMSSTORE is null");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreIsNotNull() {
            addCriterion("t1.IS_WMSSTORE is not null");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreEqualTo(String value) {
            addCriterion("t1.IS_WMSSTORE =", value, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreNotEqualTo(String value) {
            addCriterion("t1.IS_WMSSTORE <>", value, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreGreaterThan(String value) {
            addCriterion("t1.IS_WMSSTORE >", value, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IS_WMSSTORE >=", value, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreLessThan(String value) {
            addCriterion("t1.IS_WMSSTORE <", value, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreLessThanOrEqualTo(String value) {
            addCriterion("t1.IS_WMSSTORE <=", value, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreLike(String value) {
            addCriterion("t1.IS_WMSSTORE like", value, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreNotLike(String value) {
            addCriterion("t1.IS_WMSSTORE not like", value, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreIn(List<String> values) {
            addCriterion("t1.IS_WMSSTORE in", values, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreNotIn(List<String> values) {
            addCriterion("t1.IS_WMSSTORE not in", values, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreBetween(String value1, String value2) {
            addCriterion("t1.IS_WMSSTORE between", value1, value2, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andIsWmsstoreNotBetween(String value1, String value2) {
            addCriterion("t1.IS_WMSSTORE not between", value1, value2, "isWmsstore");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdIsNull() {
            addCriterion("t1.WMS_CONTROLSTORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdIsNotNull() {
            addCriterion("t1.WMS_CONTROLSTORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdEqualTo(Long value) {
            addCriterion("t1.WMS_CONTROLSTORE_ID =", value, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdNotEqualTo(Long value) {
            addCriterion("t1.WMS_CONTROLSTORE_ID <>", value, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdGreaterThan(Long value) {
            addCriterion("t1.WMS_CONTROLSTORE_ID >", value, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.WMS_CONTROLSTORE_ID >=", value, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdLessThan(Long value) {
            addCriterion("t1.WMS_CONTROLSTORE_ID <", value, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.WMS_CONTROLSTORE_ID <=", value, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdIn(List<Long> values) {
            addCriterion("t1.WMS_CONTROLSTORE_ID in", values, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdNotIn(List<Long> values) {
            addCriterion("t1.WMS_CONTROLSTORE_ID not in", values, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdBetween(Long value1, Long value2) {
            addCriterion("t1.WMS_CONTROLSTORE_ID between", value1, value2, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andWmsControlstoreIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.WMS_CONTROLSTORE_ID not between", value1, value2, "wmsControlstoreId");
            return (Criteria) this;
        }

        public Criteria andCarrier2IsNull() {
            addCriterion("t1.CARRIER2 is null");
            return (Criteria) this;
        }

        public Criteria andCarrier2IsNotNull() {
            addCriterion("t1.CARRIER2 is not null");
            return (Criteria) this;
        }

        public Criteria andCarrier2EqualTo(String value) {
            addCriterion("t1.CARRIER2 =", value, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2NotEqualTo(String value) {
            addCriterion("t1.CARRIER2 <>", value, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2GreaterThan(String value) {
            addCriterion("t1.CARRIER2 >", value, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2GreaterThanOrEqualTo(String value) {
            addCriterion("t1.CARRIER2 >=", value, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2LessThan(String value) {
            addCriterion("t1.CARRIER2 <", value, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2LessThanOrEqualTo(String value) {
            addCriterion("t1.CARRIER2 <=", value, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2Like(String value) {
            addCriterion("t1.CARRIER2 like", value, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2NotLike(String value) {
            addCriterion("t1.CARRIER2 not like", value, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2In(List<String> values) {
            addCriterion("t1.CARRIER2 in", values, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2NotIn(List<String> values) {
            addCriterion("t1.CARRIER2 not in", values, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2Between(String value1, String value2) {
            addCriterion("t1.CARRIER2 between", value1, value2, "carrier2");
            return (Criteria) this;
        }

        public Criteria andCarrier2NotBetween(String value1, String value2) {
            addCriterion("t1.CARRIER2 not between", value1, value2, "carrier2");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreIsNull() {
            addCriterion("t1.WMS_CONTRAN_STORE is null");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreIsNotNull() {
            addCriterion("t1.WMS_CONTRAN_STORE is not null");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreEqualTo(Short value) {
            addCriterion("t1.WMS_CONTRAN_STORE =", value, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreNotEqualTo(Short value) {
            addCriterion("t1.WMS_CONTRAN_STORE <>", value, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreGreaterThan(Short value) {
            addCriterion("t1.WMS_CONTRAN_STORE >", value, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.WMS_CONTRAN_STORE >=", value, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreLessThan(Short value) {
            addCriterion("t1.WMS_CONTRAN_STORE <", value, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreLessThanOrEqualTo(Short value) {
            addCriterion("t1.WMS_CONTRAN_STORE <=", value, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreIn(List<Short> values) {
            addCriterion("t1.WMS_CONTRAN_STORE in", values, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreNotIn(List<Short> values) {
            addCriterion("t1.WMS_CONTRAN_STORE not in", values, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreBetween(Short value1, Short value2) {
            addCriterion("t1.WMS_CONTRAN_STORE between", value1, value2, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andWmsContranStoreNotBetween(Short value1, Short value2) {
            addCriterion("t1.WMS_CONTRAN_STORE not between", value1, value2, "wmsContranStore");
            return (Criteria) this;
        }

        public Criteria andRetchkorgIsNull() {
            addCriterion("t1.RETCHKORG is null");
            return (Criteria) this;
        }

        public Criteria andRetchkorgIsNotNull() {
            addCriterion("t1.RETCHKORG is not null");
            return (Criteria) this;
        }

        public Criteria andRetchkorgEqualTo(String value) {
            addCriterion("t1.RETCHKORG =", value, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgNotEqualTo(String value) {
            addCriterion("t1.RETCHKORG <>", value, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgGreaterThan(String value) {
            addCriterion("t1.RETCHKORG >", value, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgGreaterThanOrEqualTo(String value) {
            addCriterion("t1.RETCHKORG >=", value, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgLessThan(String value) {
            addCriterion("t1.RETCHKORG <", value, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgLessThanOrEqualTo(String value) {
            addCriterion("t1.RETCHKORG <=", value, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgLike(String value) {
            addCriterion("t1.RETCHKORG like", value, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgNotLike(String value) {
            addCriterion("t1.RETCHKORG not like", value, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgIn(List<String> values) {
            addCriterion("t1.RETCHKORG in", values, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgNotIn(List<String> values) {
            addCriterion("t1.RETCHKORG not in", values, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgBetween(String value1, String value2) {
            addCriterion("t1.RETCHKORG between", value1, value2, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andRetchkorgNotBetween(String value1, String value2) {
            addCriterion("t1.RETCHKORG not between", value1, value2, "retchkorg");
            return (Criteria) this;
        }

        public Criteria andMarketIsNull() {
            addCriterion("t1.MARKET is null");
            return (Criteria) this;
        }

        public Criteria andMarketIsNotNull() {
            addCriterion("t1.MARKET is not null");
            return (Criteria) this;
        }

        public Criteria andMarketEqualTo(String value) {
            addCriterion("t1.MARKET =", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotEqualTo(String value) {
            addCriterion("t1.MARKET <>", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThan(String value) {
            addCriterion("t1.MARKET >", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketGreaterThanOrEqualTo(String value) {
            addCriterion("t1.MARKET >=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThan(String value) {
            addCriterion("t1.MARKET <", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLessThanOrEqualTo(String value) {
            addCriterion("t1.MARKET <=", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketLike(String value) {
            addCriterion("t1.MARKET like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotLike(String value) {
            addCriterion("t1.MARKET not like", value, "market");
            return (Criteria) this;
        }

        public Criteria andMarketIn(List<String> values) {
            addCriterion("t1.MARKET in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotIn(List<String> values) {
            addCriterion("t1.MARKET not in", values, "market");
            return (Criteria) this;
        }

        public Criteria andMarketBetween(String value1, String value2) {
            addCriterion("t1.MARKET between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andMarketNotBetween(String value1, String value2) {
            addCriterion("t1.MARKET not between", value1, value2, "market");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdIsNull() {
            addCriterion("t1.B_STORECODE_FORMAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdIsNotNull() {
            addCriterion("t1.B_STORECODE_FORMAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdEqualTo(Long value) {
            addCriterion("t1.B_STORECODE_FORMAT_ID =", value, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdNotEqualTo(Long value) {
            addCriterion("t1.B_STORECODE_FORMAT_ID <>", value, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdGreaterThan(Long value) {
            addCriterion("t1.B_STORECODE_FORMAT_ID >", value, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.B_STORECODE_FORMAT_ID >=", value, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdLessThan(Long value) {
            addCriterion("t1.B_STORECODE_FORMAT_ID <", value, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.B_STORECODE_FORMAT_ID <=", value, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdIn(List<Long> values) {
            addCriterion("t1.B_STORECODE_FORMAT_ID in", values, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdNotIn(List<Long> values) {
            addCriterion("t1.B_STORECODE_FORMAT_ID not in", values, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdBetween(Long value1, Long value2) {
            addCriterion("t1.B_STORECODE_FORMAT_ID between", value1, value2, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBStorecodeFormatIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.B_STORECODE_FORMAT_ID not between", value1, value2, "bStorecodeFormatId");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondIsNull() {
            addCriterion("t1.TOT_AMT_BOND is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondIsNotNull() {
            addCriterion("t1.TOT_AMT_BOND is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_BOND =", value, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_BOND <>", value, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMT_BOND >", value, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_BOND >=", value, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMT_BOND <", value, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_BOND <=", value, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMT_BOND in", values, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMT_BOND not in", values, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMT_BOND between", value1, value2, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andTotAmtBondNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMT_BOND not between", value1, value2, "totAmtBond");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeIsNull() {
            addCriterion("t1.WMS_STORECODE is null");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeIsNotNull() {
            addCriterion("t1.WMS_STORECODE is not null");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeEqualTo(String value) {
            addCriterion("t1.WMS_STORECODE =", value, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeNotEqualTo(String value) {
            addCriterion("t1.WMS_STORECODE <>", value, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeGreaterThan(String value) {
            addCriterion("t1.WMS_STORECODE >", value, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.WMS_STORECODE >=", value, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeLessThan(String value) {
            addCriterion("t1.WMS_STORECODE <", value, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeLessThanOrEqualTo(String value) {
            addCriterion("t1.WMS_STORECODE <=", value, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeLike(String value) {
            addCriterion("t1.WMS_STORECODE like", value, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeNotLike(String value) {
            addCriterion("t1.WMS_STORECODE not like", value, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeIn(List<String> values) {
            addCriterion("t1.WMS_STORECODE in", values, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeNotIn(List<String> values) {
            addCriterion("t1.WMS_STORECODE not in", values, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeBetween(String value1, String value2) {
            addCriterion("t1.WMS_STORECODE between", value1, value2, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andWmsStorecodeNotBetween(String value1, String value2) {
            addCriterion("t1.WMS_STORECODE not between", value1, value2, "wmsStorecode");
            return (Criteria) this;
        }

        public Criteria andPurautostayIsNull() {
            addCriterion("t1.PURAUTOSTAY is null");
            return (Criteria) this;
        }

        public Criteria andPurautostayIsNotNull() {
            addCriterion("t1.PURAUTOSTAY is not null");
            return (Criteria) this;
        }

        public Criteria andPurautostayEqualTo(String value) {
            addCriterion("t1.PURAUTOSTAY =", value, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayNotEqualTo(String value) {
            addCriterion("t1.PURAUTOSTAY <>", value, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayGreaterThan(String value) {
            addCriterion("t1.PURAUTOSTAY >", value, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayGreaterThanOrEqualTo(String value) {
            addCriterion("t1.PURAUTOSTAY >=", value, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayLessThan(String value) {
            addCriterion("t1.PURAUTOSTAY <", value, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayLessThanOrEqualTo(String value) {
            addCriterion("t1.PURAUTOSTAY <=", value, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayLike(String value) {
            addCriterion("t1.PURAUTOSTAY like", value, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayNotLike(String value) {
            addCriterion("t1.PURAUTOSTAY not like", value, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayIn(List<String> values) {
            addCriterion("t1.PURAUTOSTAY in", values, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayNotIn(List<String> values) {
            addCriterion("t1.PURAUTOSTAY not in", values, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayBetween(String value1, String value2) {
            addCriterion("t1.PURAUTOSTAY between", value1, value2, "purautostay");
            return (Criteria) this;
        }

        public Criteria andPurautostayNotBetween(String value1, String value2) {
            addCriterion("t1.PURAUTOSTAY not between", value1, value2, "purautostay");
            return (Criteria) this;
        }

        public Criteria andIsConsignIsNull() {
            addCriterion("t1.IS_CONSIGN is null");
            return (Criteria) this;
        }

        public Criteria andIsConsignIsNotNull() {
            addCriterion("t1.IS_CONSIGN is not null");
            return (Criteria) this;
        }

        public Criteria andIsConsignEqualTo(String value) {
            addCriterion("t1.IS_CONSIGN =", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignNotEqualTo(String value) {
            addCriterion("t1.IS_CONSIGN <>", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignGreaterThan(String value) {
            addCriterion("t1.IS_CONSIGN >", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IS_CONSIGN >=", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignLessThan(String value) {
            addCriterion("t1.IS_CONSIGN <", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignLessThanOrEqualTo(String value) {
            addCriterion("t1.IS_CONSIGN <=", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignLike(String value) {
            addCriterion("t1.IS_CONSIGN like", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignNotLike(String value) {
            addCriterion("t1.IS_CONSIGN not like", value, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignIn(List<String> values) {
            addCriterion("t1.IS_CONSIGN in", values, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignNotIn(List<String> values) {
            addCriterion("t1.IS_CONSIGN not in", values, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignBetween(String value1, String value2) {
            addCriterion("t1.IS_CONSIGN between", value1, value2, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsConsignNotBetween(String value1, String value2) {
            addCriterion("t1.IS_CONSIGN not between", value1, value2, "isConsign");
            return (Criteria) this;
        }

        public Criteria andIsmarkIsNull() {
            addCriterion("t1.ISMARK is null");
            return (Criteria) this;
        }

        public Criteria andIsmarkIsNotNull() {
            addCriterion("t1.ISMARK is not null");
            return (Criteria) this;
        }

        public Criteria andIsmarkEqualTo(String value) {
            addCriterion("t1.ISMARK =", value, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkNotEqualTo(String value) {
            addCriterion("t1.ISMARK <>", value, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkGreaterThan(String value) {
            addCriterion("t1.ISMARK >", value, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISMARK >=", value, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkLessThan(String value) {
            addCriterion("t1.ISMARK <", value, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkLessThanOrEqualTo(String value) {
            addCriterion("t1.ISMARK <=", value, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkLike(String value) {
            addCriterion("t1.ISMARK like", value, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkNotLike(String value) {
            addCriterion("t1.ISMARK not like", value, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkIn(List<String> values) {
            addCriterion("t1.ISMARK in", values, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkNotIn(List<String> values) {
            addCriterion("t1.ISMARK not in", values, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkBetween(String value1, String value2) {
            addCriterion("t1.ISMARK between", value1, value2, "ismark");
            return (Criteria) this;
        }

        public Criteria andIsmarkNotBetween(String value1, String value2) {
            addCriterion("t1.ISMARK not between", value1, value2, "ismark");
            return (Criteria) this;
        }

        public Criteria andCSalerIdIsNull() {
            addCriterion("t1.C_SALER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCSalerIdIsNotNull() {
            addCriterion("t1.C_SALER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCSalerIdEqualTo(Long value) {
            addCriterion("t1.C_SALER_ID =", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdNotEqualTo(Long value) {
            addCriterion("t1.C_SALER_ID <>", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdGreaterThan(Long value) {
            addCriterion("t1.C_SALER_ID >", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_SALER_ID >=", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdLessThan(Long value) {
            addCriterion("t1.C_SALER_ID <", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_SALER_ID <=", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdIn(List<Long> values) {
            addCriterion("t1.C_SALER_ID in", values, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdNotIn(List<Long> values) {
            addCriterion("t1.C_SALER_ID not in", values, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_SALER_ID between", value1, value2, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_SALER_ID not between", value1, value2, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andSalefalgIsNull() {
            addCriterion("t1.SALEFALG is null");
            return (Criteria) this;
        }

        public Criteria andSalefalgIsNotNull() {
            addCriterion("t1.SALEFALG is not null");
            return (Criteria) this;
        }

        public Criteria andSalefalgEqualTo(String value) {
            addCriterion("t1.SALEFALG =", value, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgNotEqualTo(String value) {
            addCriterion("t1.SALEFALG <>", value, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgGreaterThan(String value) {
            addCriterion("t1.SALEFALG >", value, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgGreaterThanOrEqualTo(String value) {
            addCriterion("t1.SALEFALG >=", value, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgLessThan(String value) {
            addCriterion("t1.SALEFALG <", value, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgLessThanOrEqualTo(String value) {
            addCriterion("t1.SALEFALG <=", value, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgLike(String value) {
            addCriterion("t1.SALEFALG like", value, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgNotLike(String value) {
            addCriterion("t1.SALEFALG not like", value, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgIn(List<String> values) {
            addCriterion("t1.SALEFALG in", values, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgNotIn(List<String> values) {
            addCriterion("t1.SALEFALG not in", values, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgBetween(String value1, String value2) {
            addCriterion("t1.SALEFALG between", value1, value2, "salefalg");
            return (Criteria) this;
        }

        public Criteria andSalefalgNotBetween(String value1, String value2) {
            addCriterion("t1.SALEFALG not between", value1, value2, "salefalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgIsNull() {
            addCriterion("t1.M_IN_FALG is null");
            return (Criteria) this;
        }

        public Criteria andMInFalgIsNotNull() {
            addCriterion("t1.M_IN_FALG is not null");
            return (Criteria) this;
        }

        public Criteria andMInFalgEqualTo(String value) {
            addCriterion("t1.M_IN_FALG =", value, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgNotEqualTo(String value) {
            addCriterion("t1.M_IN_FALG <>", value, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgGreaterThan(String value) {
            addCriterion("t1.M_IN_FALG >", value, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgGreaterThanOrEqualTo(String value) {
            addCriterion("t1.M_IN_FALG >=", value, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgLessThan(String value) {
            addCriterion("t1.M_IN_FALG <", value, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgLessThanOrEqualTo(String value) {
            addCriterion("t1.M_IN_FALG <=", value, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgLike(String value) {
            addCriterion("t1.M_IN_FALG like", value, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgNotLike(String value) {
            addCriterion("t1.M_IN_FALG not like", value, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgIn(List<String> values) {
            addCriterion("t1.M_IN_FALG in", values, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgNotIn(List<String> values) {
            addCriterion("t1.M_IN_FALG not in", values, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgBetween(String value1, String value2) {
            addCriterion("t1.M_IN_FALG between", value1, value2, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andMInFalgNotBetween(String value1, String value2) {
            addCriterion("t1.M_IN_FALG not between", value1, value2, "mInFalg");
            return (Criteria) this;
        }

        public Criteria andTotFeeIsNull() {
            addCriterion("t1.TOT_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTotFeeIsNotNull() {
            addCriterion("t1.TOT_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTotFeeEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_FEE =", value, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_FEE <>", value, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_FEE >", value, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_FEE >=", value, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeLessThan(BigDecimal value) {
            addCriterion("t1.TOT_FEE <", value, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_FEE <=", value, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_FEE in", values, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_FEE not in", values, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_FEE between", value1, value2, "totFee");
            return (Criteria) this;
        }

        public Criteria andTotFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_FEE not between", value1, value2, "totFee");
            return (Criteria) this;
        }

        public Criteria andForegiftIsNull() {
            addCriterion("t1.FOREGIFT is null");
            return (Criteria) this;
        }

        public Criteria andForegiftIsNotNull() {
            addCriterion("t1.FOREGIFT is not null");
            return (Criteria) this;
        }

        public Criteria andForegiftEqualTo(BigDecimal value) {
            addCriterion("t1.FOREGIFT =", value, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftNotEqualTo(BigDecimal value) {
            addCriterion("t1.FOREGIFT <>", value, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftGreaterThan(BigDecimal value) {
            addCriterion("t1.FOREGIFT >", value, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.FOREGIFT >=", value, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftLessThan(BigDecimal value) {
            addCriterion("t1.FOREGIFT <", value, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.FOREGIFT <=", value, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftIn(List<BigDecimal> values) {
            addCriterion("t1.FOREGIFT in", values, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftNotIn(List<BigDecimal> values) {
            addCriterion("t1.FOREGIFT not in", values, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.FOREGIFT between", value1, value2, "foregift");
            return (Criteria) this;
        }

        public Criteria andForegiftNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.FOREGIFT not between", value1, value2, "foregift");
            return (Criteria) this;
        }

        public Criteria andFeedateIsNull() {
            addCriterion("t1.FEEDATE is null");
            return (Criteria) this;
        }

        public Criteria andFeedateIsNotNull() {
            addCriterion("t1.FEEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andFeedateEqualTo(Integer value) {
            addCriterion("t1.FEEDATE =", value, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateNotEqualTo(Integer value) {
            addCriterion("t1.FEEDATE <>", value, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateGreaterThan(Integer value) {
            addCriterion("t1.FEEDATE >", value, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.FEEDATE >=", value, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateLessThan(Integer value) {
            addCriterion("t1.FEEDATE <", value, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateLessThanOrEqualTo(Integer value) {
            addCriterion("t1.FEEDATE <=", value, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateIn(List<Integer> values) {
            addCriterion("t1.FEEDATE in", values, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateNotIn(List<Integer> values) {
            addCriterion("t1.FEEDATE not in", values, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateBetween(Integer value1, Integer value2) {
            addCriterion("t1.FEEDATE between", value1, value2, "feedate");
            return (Criteria) this;
        }

        public Criteria andFeedateNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.FEEDATE not between", value1, value2, "feedate");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthIsNull() {
            addCriterion("t1.C_STORE_WIDTH is null");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthIsNotNull() {
            addCriterion("t1.C_STORE_WIDTH is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthEqualTo(Long value) {
            addCriterion("t1.C_STORE_WIDTH =", value, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthNotEqualTo(Long value) {
            addCriterion("t1.C_STORE_WIDTH <>", value, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthGreaterThan(Long value) {
            addCriterion("t1.C_STORE_WIDTH >", value, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STORE_WIDTH >=", value, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthLessThan(Long value) {
            addCriterion("t1.C_STORE_WIDTH <", value, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STORE_WIDTH <=", value, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthIn(List<Long> values) {
            addCriterion("t1.C_STORE_WIDTH in", values, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthNotIn(List<Long> values) {
            addCriterion("t1.C_STORE_WIDTH not in", values, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthBetween(Long value1, Long value2) {
            addCriterion("t1.C_STORE_WIDTH between", value1, value2, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andCStoreWidthNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STORE_WIDTH not between", value1, value2, "cStoreWidth");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNull() {
            addCriterion("t1.TRANSFER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNotNull() {
            addCriterion("t1.TRANSFER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeEqualTo(BigDecimal value) {
            addCriterion("t1.TRANSFER_FEE =", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotEqualTo(BigDecimal value) {
            addCriterion("t1.TRANSFER_FEE <>", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThan(BigDecimal value) {
            addCriterion("t1.TRANSFER_FEE >", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TRANSFER_FEE >=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThan(BigDecimal value) {
            addCriterion("t1.TRANSFER_FEE <", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TRANSFER_FEE <=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIn(List<BigDecimal> values) {
            addCriterion("t1.TRANSFER_FEE in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotIn(List<BigDecimal> values) {
            addCriterion("t1.TRANSFER_FEE not in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TRANSFER_FEE between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TRANSFER_FEE not between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeIsNull() {
            addCriterion("t1.DECORATE_FEE is null");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeIsNotNull() {
            addCriterion("t1.DECORATE_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeEqualTo(BigDecimal value) {
            addCriterion("t1.DECORATE_FEE =", value, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeNotEqualTo(BigDecimal value) {
            addCriterion("t1.DECORATE_FEE <>", value, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeGreaterThan(BigDecimal value) {
            addCriterion("t1.DECORATE_FEE >", value, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.DECORATE_FEE >=", value, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeLessThan(BigDecimal value) {
            addCriterion("t1.DECORATE_FEE <", value, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.DECORATE_FEE <=", value, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeIn(List<BigDecimal> values) {
            addCriterion("t1.DECORATE_FEE in", values, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeNotIn(List<BigDecimal> values) {
            addCriterion("t1.DECORATE_FEE not in", values, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.DECORATE_FEE between", value1, value2, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andDecorateFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.DECORATE_FEE not between", value1, value2, "decorateFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeIsNull() {
            addCriterion("t1.INVEST_FEE is null");
            return (Criteria) this;
        }

        public Criteria andInvestFeeIsNotNull() {
            addCriterion("t1.INVEST_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andInvestFeeEqualTo(BigDecimal value) {
            addCriterion("t1.INVEST_FEE =", value, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeNotEqualTo(BigDecimal value) {
            addCriterion("t1.INVEST_FEE <>", value, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeGreaterThan(BigDecimal value) {
            addCriterion("t1.INVEST_FEE >", value, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.INVEST_FEE >=", value, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeLessThan(BigDecimal value) {
            addCriterion("t1.INVEST_FEE <", value, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.INVEST_FEE <=", value, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeIn(List<BigDecimal> values) {
            addCriterion("t1.INVEST_FEE in", values, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeNotIn(List<BigDecimal> values) {
            addCriterion("t1.INVEST_FEE not in", values, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.INVEST_FEE between", value1, value2, "investFee");
            return (Criteria) this;
        }

        public Criteria andInvestFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.INVEST_FEE not between", value1, value2, "investFee");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtIsNull() {
            addCriterion("t1.VIP_LIMITAMT is null");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtIsNotNull() {
            addCriterion("t1.VIP_LIMITAMT is not null");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtEqualTo(BigDecimal value) {
            addCriterion("t1.VIP_LIMITAMT =", value, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtNotEqualTo(BigDecimal value) {
            addCriterion("t1.VIP_LIMITAMT <>", value, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtGreaterThan(BigDecimal value) {
            addCriterion("t1.VIP_LIMITAMT >", value, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.VIP_LIMITAMT >=", value, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtLessThan(BigDecimal value) {
            addCriterion("t1.VIP_LIMITAMT <", value, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.VIP_LIMITAMT <=", value, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtIn(List<BigDecimal> values) {
            addCriterion("t1.VIP_LIMITAMT in", values, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtNotIn(List<BigDecimal> values) {
            addCriterion("t1.VIP_LIMITAMT not in", values, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.VIP_LIMITAMT between", value1, value2, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andVipLimitamtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.VIP_LIMITAMT not between", value1, value2, "vipLimitamt");
            return (Criteria) this;
        }

        public Criteria andShippedIsNull() {
            addCriterion("t1.SHIPPED is null");
            return (Criteria) this;
        }

        public Criteria andShippedIsNotNull() {
            addCriterion("t1.SHIPPED is not null");
            return (Criteria) this;
        }

        public Criteria andShippedEqualTo(String value) {
            addCriterion("t1.SHIPPED =", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedNotEqualTo(String value) {
            addCriterion("t1.SHIPPED <>", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedGreaterThan(String value) {
            addCriterion("t1.SHIPPED >", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedGreaterThanOrEqualTo(String value) {
            addCriterion("t1.SHIPPED >=", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedLessThan(String value) {
            addCriterion("t1.SHIPPED <", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedLessThanOrEqualTo(String value) {
            addCriterion("t1.SHIPPED <=", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedLike(String value) {
            addCriterion("t1.SHIPPED like", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedNotLike(String value) {
            addCriterion("t1.SHIPPED not like", value, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedIn(List<String> values) {
            addCriterion("t1.SHIPPED in", values, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedNotIn(List<String> values) {
            addCriterion("t1.SHIPPED not in", values, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedBetween(String value1, String value2) {
            addCriterion("t1.SHIPPED between", value1, value2, "shipped");
            return (Criteria) this;
        }

        public Criteria andShippedNotBetween(String value1, String value2) {
            addCriterion("t1.SHIPPED not between", value1, value2, "shipped");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdIsNull() {
            addCriterion("t1.C_TRANWAY_JZ_ID is null");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdIsNotNull() {
            addCriterion("t1.C_TRANWAY_JZ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdEqualTo(Long value) {
            addCriterion("t1.C_TRANWAY_JZ_ID =", value, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdNotEqualTo(Long value) {
            addCriterion("t1.C_TRANWAY_JZ_ID <>", value, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdGreaterThan(Long value) {
            addCriterion("t1.C_TRANWAY_JZ_ID >", value, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_TRANWAY_JZ_ID >=", value, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdLessThan(Long value) {
            addCriterion("t1.C_TRANWAY_JZ_ID <", value, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_TRANWAY_JZ_ID <=", value, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdIn(List<Long> values) {
            addCriterion("t1.C_TRANWAY_JZ_ID in", values, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdNotIn(List<Long> values) {
            addCriterion("t1.C_TRANWAY_JZ_ID not in", values, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_TRANWAY_JZ_ID between", value1, value2, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andCTranwayJzIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_TRANWAY_JZ_ID not between", value1, value2, "cTranwayJzId");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNull() {
            addCriterion("t1.PART_NO is null");
            return (Criteria) this;
        }

        public Criteria andPartNoIsNotNull() {
            addCriterion("t1.PART_NO is not null");
            return (Criteria) this;
        }

        public Criteria andPartNoEqualTo(String value) {
            addCriterion("t1.PART_NO =", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotEqualTo(String value) {
            addCriterion("t1.PART_NO <>", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThan(String value) {
            addCriterion("t1.PART_NO >", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.PART_NO >=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThan(String value) {
            addCriterion("t1.PART_NO <", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLessThanOrEqualTo(String value) {
            addCriterion("t1.PART_NO <=", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoLike(String value) {
            addCriterion("t1.PART_NO like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotLike(String value) {
            addCriterion("t1.PART_NO not like", value, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoIn(List<String> values) {
            addCriterion("t1.PART_NO in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotIn(List<String> values) {
            addCriterion("t1.PART_NO not in", values, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoBetween(String value1, String value2) {
            addCriterion("t1.PART_NO between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andPartNoNotBetween(String value1, String value2) {
            addCriterion("t1.PART_NO not between", value1, value2, "partNo");
            return (Criteria) this;
        }

        public Criteria andCBranchIdIsNull() {
            addCriterion("t1.C_BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCBranchIdIsNotNull() {
            addCriterion("t1.C_BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCBranchIdEqualTo(Long value) {
            addCriterion("t1.C_BRANCH_ID =", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdNotEqualTo(Long value) {
            addCriterion("t1.C_BRANCH_ID <>", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdGreaterThan(Long value) {
            addCriterion("t1.C_BRANCH_ID >", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_BRANCH_ID >=", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdLessThan(Long value) {
            addCriterion("t1.C_BRANCH_ID <", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_BRANCH_ID <=", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdIn(List<Long> values) {
            addCriterion("t1.C_BRANCH_ID in", values, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdNotIn(List<Long> values) {
            addCriterion("t1.C_BRANCH_ID not in", values, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_BRANCH_ID between", value1, value2, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_BRANCH_ID not between", value1, value2, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCancelstoreIsNull() {
            addCriterion("t1.CANCELSTORE is null");
            return (Criteria) this;
        }

        public Criteria andCancelstoreIsNotNull() {
            addCriterion("t1.CANCELSTORE is not null");
            return (Criteria) this;
        }

        public Criteria andCancelstoreEqualTo(String value) {
            addCriterion("t1.CANCELSTORE =", value, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreNotEqualTo(String value) {
            addCriterion("t1.CANCELSTORE <>", value, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreGreaterThan(String value) {
            addCriterion("t1.CANCELSTORE >", value, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CANCELSTORE >=", value, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreLessThan(String value) {
            addCriterion("t1.CANCELSTORE <", value, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreLessThanOrEqualTo(String value) {
            addCriterion("t1.CANCELSTORE <=", value, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreLike(String value) {
            addCriterion("t1.CANCELSTORE like", value, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreNotLike(String value) {
            addCriterion("t1.CANCELSTORE not like", value, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreIn(List<String> values) {
            addCriterion("t1.CANCELSTORE in", values, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreNotIn(List<String> values) {
            addCriterion("t1.CANCELSTORE not in", values, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreBetween(String value1, String value2) {
            addCriterion("t1.CANCELSTORE between", value1, value2, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andCancelstoreNotBetween(String value1, String value2) {
            addCriterion("t1.CANCELSTORE not between", value1, value2, "cancelstore");
            return (Criteria) this;
        }

        public Criteria andStorestatusIsNull() {
            addCriterion("t1.STORESTATUS is null");
            return (Criteria) this;
        }

        public Criteria andStorestatusIsNotNull() {
            addCriterion("t1.STORESTATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStorestatusEqualTo(String value) {
            addCriterion("t1.STORESTATUS =", value, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusNotEqualTo(String value) {
            addCriterion("t1.STORESTATUS <>", value, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusGreaterThan(String value) {
            addCriterion("t1.STORESTATUS >", value, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusGreaterThanOrEqualTo(String value) {
            addCriterion("t1.STORESTATUS >=", value, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusLessThan(String value) {
            addCriterion("t1.STORESTATUS <", value, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusLessThanOrEqualTo(String value) {
            addCriterion("t1.STORESTATUS <=", value, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusLike(String value) {
            addCriterion("t1.STORESTATUS like", value, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusNotLike(String value) {
            addCriterion("t1.STORESTATUS not like", value, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusIn(List<String> values) {
            addCriterion("t1.STORESTATUS in", values, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusNotIn(List<String> values) {
            addCriterion("t1.STORESTATUS not in", values, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusBetween(String value1, String value2) {
            addCriterion("t1.STORESTATUS between", value1, value2, "storestatus");
            return (Criteria) this;
        }

        public Criteria andStorestatusNotBetween(String value1, String value2) {
            addCriterion("t1.STORESTATUS not between", value1, value2, "storestatus");
            return (Criteria) this;
        }

        public Criteria andLeastqtyIsNull() {
            addCriterion("t1.LEASTQTY is null");
            return (Criteria) this;
        }

        public Criteria andLeastqtyIsNotNull() {
            addCriterion("t1.LEASTQTY is not null");
            return (Criteria) this;
        }

        public Criteria andLeastqtyEqualTo(Long value) {
            addCriterion("t1.LEASTQTY =", value, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyNotEqualTo(Long value) {
            addCriterion("t1.LEASTQTY <>", value, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyGreaterThan(Long value) {
            addCriterion("t1.LEASTQTY >", value, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.LEASTQTY >=", value, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyLessThan(Long value) {
            addCriterion("t1.LEASTQTY <", value, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyLessThanOrEqualTo(Long value) {
            addCriterion("t1.LEASTQTY <=", value, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyIn(List<Long> values) {
            addCriterion("t1.LEASTQTY in", values, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyNotIn(List<Long> values) {
            addCriterion("t1.LEASTQTY not in", values, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyBetween(Long value1, Long value2) {
            addCriterion("t1.LEASTQTY between", value1, value2, "leastqty");
            return (Criteria) this;
        }

        public Criteria andLeastqtyNotBetween(Long value1, Long value2) {
            addCriterion("t1.LEASTQTY not between", value1, value2, "leastqty");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNull() {
            addCriterion("t1.ISRECEIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIsNotNull() {
            addCriterion("t1.ISRECEIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsreceiveEqualTo(String value) {
            addCriterion("t1.ISRECEIVE =", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotEqualTo(String value) {
            addCriterion("t1.ISRECEIVE <>", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThan(String value) {
            addCriterion("t1.ISRECEIVE >", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISRECEIVE >=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThan(String value) {
            addCriterion("t1.ISRECEIVE <", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLessThanOrEqualTo(String value) {
            addCriterion("t1.ISRECEIVE <=", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveLike(String value) {
            addCriterion("t1.ISRECEIVE like", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotLike(String value) {
            addCriterion("t1.ISRECEIVE not like", value, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveIn(List<String> values) {
            addCriterion("t1.ISRECEIVE in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotIn(List<String> values) {
            addCriterion("t1.ISRECEIVE not in", values, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveBetween(String value1, String value2) {
            addCriterion("t1.ISRECEIVE between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andIsreceiveNotBetween(String value1, String value2) {
            addCriterion("t1.ISRECEIVE not between", value1, value2, "isreceive");
            return (Criteria) this;
        }

        public Criteria andShipaddrIsNull() {
            addCriterion("t1.SHIPADDR is null");
            return (Criteria) this;
        }

        public Criteria andShipaddrIsNotNull() {
            addCriterion("t1.SHIPADDR is not null");
            return (Criteria) this;
        }

        public Criteria andShipaddrEqualTo(String value) {
            addCriterion("t1.SHIPADDR =", value, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrNotEqualTo(String value) {
            addCriterion("t1.SHIPADDR <>", value, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrGreaterThan(String value) {
            addCriterion("t1.SHIPADDR >", value, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrGreaterThanOrEqualTo(String value) {
            addCriterion("t1.SHIPADDR >=", value, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrLessThan(String value) {
            addCriterion("t1.SHIPADDR <", value, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrLessThanOrEqualTo(String value) {
            addCriterion("t1.SHIPADDR <=", value, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrLike(String value) {
            addCriterion("t1.SHIPADDR like", value, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrNotLike(String value) {
            addCriterion("t1.SHIPADDR not like", value, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrIn(List<String> values) {
            addCriterion("t1.SHIPADDR in", values, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrNotIn(List<String> values) {
            addCriterion("t1.SHIPADDR not in", values, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrBetween(String value1, String value2) {
            addCriterion("t1.SHIPADDR between", value1, value2, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andShipaddrNotBetween(String value1, String value2) {
            addCriterion("t1.SHIPADDR not between", value1, value2, "shipaddr");
            return (Criteria) this;
        }

        public Criteria andIsonlycardIsNull() {
            addCriterion("t1.ISONLYCARD is null");
            return (Criteria) this;
        }

        public Criteria andIsonlycardIsNotNull() {
            addCriterion("t1.ISONLYCARD is not null");
            return (Criteria) this;
        }

        public Criteria andIsonlycardEqualTo(String value) {
            addCriterion("t1.ISONLYCARD =", value, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardNotEqualTo(String value) {
            addCriterion("t1.ISONLYCARD <>", value, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardGreaterThan(String value) {
            addCriterion("t1.ISONLYCARD >", value, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISONLYCARD >=", value, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardLessThan(String value) {
            addCriterion("t1.ISONLYCARD <", value, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardLessThanOrEqualTo(String value) {
            addCriterion("t1.ISONLYCARD <=", value, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardLike(String value) {
            addCriterion("t1.ISONLYCARD like", value, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardNotLike(String value) {
            addCriterion("t1.ISONLYCARD not like", value, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardIn(List<String> values) {
            addCriterion("t1.ISONLYCARD in", values, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardNotIn(List<String> values) {
            addCriterion("t1.ISONLYCARD not in", values, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardBetween(String value1, String value2) {
            addCriterion("t1.ISONLYCARD between", value1, value2, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIsonlycardNotBetween(String value1, String value2) {
            addCriterion("t1.ISONLYCARD not between", value1, value2, "isonlycard");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyIsNull() {
            addCriterion("t1.ISSAVEMONEY is null");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyIsNotNull() {
            addCriterion("t1.ISSAVEMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyEqualTo(String value) {
            addCriterion("t1.ISSAVEMONEY =", value, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyNotEqualTo(String value) {
            addCriterion("t1.ISSAVEMONEY <>", value, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyGreaterThan(String value) {
            addCriterion("t1.ISSAVEMONEY >", value, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISSAVEMONEY >=", value, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyLessThan(String value) {
            addCriterion("t1.ISSAVEMONEY <", value, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyLessThanOrEqualTo(String value) {
            addCriterion("t1.ISSAVEMONEY <=", value, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyLike(String value) {
            addCriterion("t1.ISSAVEMONEY like", value, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyNotLike(String value) {
            addCriterion("t1.ISSAVEMONEY not like", value, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyIn(List<String> values) {
            addCriterion("t1.ISSAVEMONEY in", values, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyNotIn(List<String> values) {
            addCriterion("t1.ISSAVEMONEY not in", values, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyBetween(String value1, String value2) {
            addCriterion("t1.ISSAVEMONEY between", value1, value2, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andIssavemoneyNotBetween(String value1, String value2) {
            addCriterion("t1.ISSAVEMONEY not between", value1, value2, "issavemoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNull() {
            addCriterion("t1.MAXMONEY is null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIsNotNull() {
            addCriterion("t1.MAXMONEY is not null");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyEqualTo(BigDecimal value) {
            addCriterion("t1.MAXMONEY =", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotEqualTo(BigDecimal value) {
            addCriterion("t1.MAXMONEY <>", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThan(BigDecimal value) {
            addCriterion("t1.MAXMONEY >", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.MAXMONEY >=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThan(BigDecimal value) {
            addCriterion("t1.MAXMONEY <", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.MAXMONEY <=", value, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyIn(List<BigDecimal> values) {
            addCriterion("t1.MAXMONEY in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotIn(List<BigDecimal> values) {
            addCriterion("t1.MAXMONEY not in", values, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.MAXMONEY between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andMaxmoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.MAXMONEY not between", value1, value2, "maxmoney");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineIsNull() {
            addCriterion("t1.WEBPOS_OFFLINE is null");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineIsNotNull() {
            addCriterion("t1.WEBPOS_OFFLINE is not null");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineEqualTo(String value) {
            addCriterion("t1.WEBPOS_OFFLINE =", value, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineNotEqualTo(String value) {
            addCriterion("t1.WEBPOS_OFFLINE <>", value, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineGreaterThan(String value) {
            addCriterion("t1.WEBPOS_OFFLINE >", value, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineGreaterThanOrEqualTo(String value) {
            addCriterion("t1.WEBPOS_OFFLINE >=", value, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineLessThan(String value) {
            addCriterion("t1.WEBPOS_OFFLINE <", value, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineLessThanOrEqualTo(String value) {
            addCriterion("t1.WEBPOS_OFFLINE <=", value, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineLike(String value) {
            addCriterion("t1.WEBPOS_OFFLINE like", value, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineNotLike(String value) {
            addCriterion("t1.WEBPOS_OFFLINE not like", value, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineIn(List<String> values) {
            addCriterion("t1.WEBPOS_OFFLINE in", values, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineNotIn(List<String> values) {
            addCriterion("t1.WEBPOS_OFFLINE not in", values, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineBetween(String value1, String value2) {
            addCriterion("t1.WEBPOS_OFFLINE between", value1, value2, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andWebposOfflineNotBetween(String value1, String value2) {
            addCriterion("t1.WEBPOS_OFFLINE not between", value1, value2, "webposOffline");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountIsNull() {
            addCriterion("t1.LOWEST_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountIsNotNull() {
            addCriterion("t1.LOWEST_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountEqualTo(String value) {
            addCriterion("t1.LOWEST_DISCOUNT =", value, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountNotEqualTo(String value) {
            addCriterion("t1.LOWEST_DISCOUNT <>", value, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountGreaterThan(String value) {
            addCriterion("t1.LOWEST_DISCOUNT >", value, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountGreaterThanOrEqualTo(String value) {
            addCriterion("t1.LOWEST_DISCOUNT >=", value, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountLessThan(String value) {
            addCriterion("t1.LOWEST_DISCOUNT <", value, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountLessThanOrEqualTo(String value) {
            addCriterion("t1.LOWEST_DISCOUNT <=", value, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountLike(String value) {
            addCriterion("t1.LOWEST_DISCOUNT like", value, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountNotLike(String value) {
            addCriterion("t1.LOWEST_DISCOUNT not like", value, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountIn(List<String> values) {
            addCriterion("t1.LOWEST_DISCOUNT in", values, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountNotIn(List<String> values) {
            addCriterion("t1.LOWEST_DISCOUNT not in", values, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountBetween(String value1, String value2) {
            addCriterion("t1.LOWEST_DISCOUNT between", value1, value2, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andLowestDiscountNotBetween(String value1, String value2) {
            addCriterion("t1.LOWEST_DISCOUNT not between", value1, value2, "lowestDiscount");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultIsNull() {
            addCriterion("t1.C_PAYWAY_DEFAULT is null");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultIsNotNull() {
            addCriterion("t1.C_PAYWAY_DEFAULT is not null");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultEqualTo(Long value) {
            addCriterion("t1.C_PAYWAY_DEFAULT =", value, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultNotEqualTo(Long value) {
            addCriterion("t1.C_PAYWAY_DEFAULT <>", value, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultGreaterThan(Long value) {
            addCriterion("t1.C_PAYWAY_DEFAULT >", value, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_PAYWAY_DEFAULT >=", value, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultLessThan(Long value) {
            addCriterion("t1.C_PAYWAY_DEFAULT <", value, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_PAYWAY_DEFAULT <=", value, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultIn(List<Long> values) {
            addCriterion("t1.C_PAYWAY_DEFAULT in", values, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultNotIn(List<Long> values) {
            addCriterion("t1.C_PAYWAY_DEFAULT not in", values, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultBetween(Long value1, Long value2) {
            addCriterion("t1.C_PAYWAY_DEFAULT between", value1, value2, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andCPaywayDefaultNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_PAYWAY_DEFAULT not between", value1, value2, "cPaywayDefault");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysIsNull() {
            addCriterion("t1.CHK_OVERDAYS is null");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysIsNotNull() {
            addCriterion("t1.CHK_OVERDAYS is not null");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysEqualTo(Long value) {
            addCriterion("t1.CHK_OVERDAYS =", value, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysNotEqualTo(Long value) {
            addCriterion("t1.CHK_OVERDAYS <>", value, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysGreaterThan(Long value) {
            addCriterion("t1.CHK_OVERDAYS >", value, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.CHK_OVERDAYS >=", value, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysLessThan(Long value) {
            addCriterion("t1.CHK_OVERDAYS <", value, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysLessThanOrEqualTo(Long value) {
            addCriterion("t1.CHK_OVERDAYS <=", value, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysIn(List<Long> values) {
            addCriterion("t1.CHK_OVERDAYS in", values, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysNotIn(List<Long> values) {
            addCriterion("t1.CHK_OVERDAYS not in", values, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysBetween(Long value1, Long value2) {
            addCriterion("t1.CHK_OVERDAYS between", value1, value2, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andChkOverdaysNotBetween(Long value1, Long value2) {
            addCriterion("t1.CHK_OVERDAYS not between", value1, value2, "chkOverdays");
            return (Criteria) this;
        }

        public Criteria andIsmoveIsNull() {
            addCriterion("t1.ISMOVE is null");
            return (Criteria) this;
        }

        public Criteria andIsmoveIsNotNull() {
            addCriterion("t1.ISMOVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsmoveEqualTo(String value) {
            addCriterion("t1.ISMOVE =", value, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveNotEqualTo(String value) {
            addCriterion("t1.ISMOVE <>", value, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveGreaterThan(String value) {
            addCriterion("t1.ISMOVE >", value, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISMOVE >=", value, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveLessThan(String value) {
            addCriterion("t1.ISMOVE <", value, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveLessThanOrEqualTo(String value) {
            addCriterion("t1.ISMOVE <=", value, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveLike(String value) {
            addCriterion("t1.ISMOVE like", value, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveNotLike(String value) {
            addCriterion("t1.ISMOVE not like", value, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveIn(List<String> values) {
            addCriterion("t1.ISMOVE in", values, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveNotIn(List<String> values) {
            addCriterion("t1.ISMOVE not in", values, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveBetween(String value1, String value2) {
            addCriterion("t1.ISMOVE between", value1, value2, "ismove");
            return (Criteria) this;
        }

        public Criteria andIsmoveNotBetween(String value1, String value2) {
            addCriterion("t1.ISMOVE not between", value1, value2, "ismove");
            return (Criteria) this;
        }

        public Criteria andPrintmesIsNull() {
            addCriterion("t1.PRINTMES is null");
            return (Criteria) this;
        }

        public Criteria andPrintmesIsNotNull() {
            addCriterion("t1.PRINTMES is not null");
            return (Criteria) this;
        }

        public Criteria andPrintmesEqualTo(String value) {
            addCriterion("t1.PRINTMES =", value, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesNotEqualTo(String value) {
            addCriterion("t1.PRINTMES <>", value, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesGreaterThan(String value) {
            addCriterion("t1.PRINTMES >", value, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesGreaterThanOrEqualTo(String value) {
            addCriterion("t1.PRINTMES >=", value, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesLessThan(String value) {
            addCriterion("t1.PRINTMES <", value, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesLessThanOrEqualTo(String value) {
            addCriterion("t1.PRINTMES <=", value, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesLike(String value) {
            addCriterion("t1.PRINTMES like", value, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesNotLike(String value) {
            addCriterion("t1.PRINTMES not like", value, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesIn(List<String> values) {
            addCriterion("t1.PRINTMES in", values, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesNotIn(List<String> values) {
            addCriterion("t1.PRINTMES not in", values, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesBetween(String value1, String value2) {
            addCriterion("t1.PRINTMES between", value1, value2, "printmes");
            return (Criteria) this;
        }

        public Criteria andPrintmesNotBetween(String value1, String value2) {
            addCriterion("t1.PRINTMES not between", value1, value2, "printmes");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdIsNull() {
            addCriterion("t1.C_MARKBALTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdIsNotNull() {
            addCriterion("t1.C_MARKBALTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdEqualTo(Long value) {
            addCriterion("t1.C_MARKBALTYPE_ID =", value, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdNotEqualTo(Long value) {
            addCriterion("t1.C_MARKBALTYPE_ID <>", value, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdGreaterThan(Long value) {
            addCriterion("t1.C_MARKBALTYPE_ID >", value, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_MARKBALTYPE_ID >=", value, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdLessThan(Long value) {
            addCriterion("t1.C_MARKBALTYPE_ID <", value, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_MARKBALTYPE_ID <=", value, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdIn(List<Long> values) {
            addCriterion("t1.C_MARKBALTYPE_ID in", values, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdNotIn(List<Long> values) {
            addCriterion("t1.C_MARKBALTYPE_ID not in", values, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_MARKBALTYPE_ID between", value1, value2, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andCMarkbaltypeIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_MARKBALTYPE_ID not between", value1, value2, "cMarkbaltypeId");
            return (Criteria) this;
        }

        public Criteria andIsvipintlIsNull() {
            addCriterion("t1.ISVIPINTL is null");
            return (Criteria) this;
        }

        public Criteria andIsvipintlIsNotNull() {
            addCriterion("t1.ISVIPINTL is not null");
            return (Criteria) this;
        }

        public Criteria andIsvipintlEqualTo(String value) {
            addCriterion("t1.ISVIPINTL =", value, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlNotEqualTo(String value) {
            addCriterion("t1.ISVIPINTL <>", value, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlGreaterThan(String value) {
            addCriterion("t1.ISVIPINTL >", value, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISVIPINTL >=", value, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlLessThan(String value) {
            addCriterion("t1.ISVIPINTL <", value, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlLessThanOrEqualTo(String value) {
            addCriterion("t1.ISVIPINTL <=", value, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlLike(String value) {
            addCriterion("t1.ISVIPINTL like", value, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlNotLike(String value) {
            addCriterion("t1.ISVIPINTL not like", value, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlIn(List<String> values) {
            addCriterion("t1.ISVIPINTL in", values, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlNotIn(List<String> values) {
            addCriterion("t1.ISVIPINTL not in", values, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlBetween(String value1, String value2) {
            addCriterion("t1.ISVIPINTL between", value1, value2, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipintlNotBetween(String value1, String value2) {
            addCriterion("t1.ISVIPINTL not between", value1, value2, "isvipintl");
            return (Criteria) this;
        }

        public Criteria andIsvipdisIsNull() {
            addCriterion("t1.ISVIPDIS is null");
            return (Criteria) this;
        }

        public Criteria andIsvipdisIsNotNull() {
            addCriterion("t1.ISVIPDIS is not null");
            return (Criteria) this;
        }

        public Criteria andIsvipdisEqualTo(String value) {
            addCriterion("t1.ISVIPDIS =", value, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisNotEqualTo(String value) {
            addCriterion("t1.ISVIPDIS <>", value, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisGreaterThan(String value) {
            addCriterion("t1.ISVIPDIS >", value, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISVIPDIS >=", value, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisLessThan(String value) {
            addCriterion("t1.ISVIPDIS <", value, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisLessThanOrEqualTo(String value) {
            addCriterion("t1.ISVIPDIS <=", value, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisLike(String value) {
            addCriterion("t1.ISVIPDIS like", value, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisNotLike(String value) {
            addCriterion("t1.ISVIPDIS not like", value, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisIn(List<String> values) {
            addCriterion("t1.ISVIPDIS in", values, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisNotIn(List<String> values) {
            addCriterion("t1.ISVIPDIS not in", values, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisBetween(String value1, String value2) {
            addCriterion("t1.ISVIPDIS between", value1, value2, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsvipdisNotBetween(String value1, String value2) {
            addCriterion("t1.ISVIPDIS not between", value1, value2, "isvipdis");
            return (Criteria) this;
        }

        public Criteria andIsRetIsNull() {
            addCriterion("t1.IS_RET is null");
            return (Criteria) this;
        }

        public Criteria andIsRetIsNotNull() {
            addCriterion("t1.IS_RET is not null");
            return (Criteria) this;
        }

        public Criteria andIsRetEqualTo(String value) {
            addCriterion("t1.IS_RET =", value, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetNotEqualTo(String value) {
            addCriterion("t1.IS_RET <>", value, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetGreaterThan(String value) {
            addCriterion("t1.IS_RET >", value, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IS_RET >=", value, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetLessThan(String value) {
            addCriterion("t1.IS_RET <", value, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetLessThanOrEqualTo(String value) {
            addCriterion("t1.IS_RET <=", value, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetLike(String value) {
            addCriterion("t1.IS_RET like", value, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetNotLike(String value) {
            addCriterion("t1.IS_RET not like", value, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetIn(List<String> values) {
            addCriterion("t1.IS_RET in", values, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetNotIn(List<String> values) {
            addCriterion("t1.IS_RET not in", values, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetBetween(String value1, String value2) {
            addCriterion("t1.IS_RET between", value1, value2, "isRet");
            return (Criteria) this;
        }

        public Criteria andIsRetNotBetween(String value1, String value2) {
            addCriterion("t1.IS_RET not between", value1, value2, "isRet");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyIsNull() {
            addCriterion("t1.ALIPAY_KEY is null");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyIsNotNull() {
            addCriterion("t1.ALIPAY_KEY is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyEqualTo(String value) {
            addCriterion("t1.ALIPAY_KEY =", value, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyNotEqualTo(String value) {
            addCriterion("t1.ALIPAY_KEY <>", value, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyGreaterThan(String value) {
            addCriterion("t1.ALIPAY_KEY >", value, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ALIPAY_KEY >=", value, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyLessThan(String value) {
            addCriterion("t1.ALIPAY_KEY <", value, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyLessThanOrEqualTo(String value) {
            addCriterion("t1.ALIPAY_KEY <=", value, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyLike(String value) {
            addCriterion("t1.ALIPAY_KEY like", value, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyNotLike(String value) {
            addCriterion("t1.ALIPAY_KEY not like", value, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyIn(List<String> values) {
            addCriterion("t1.ALIPAY_KEY in", values, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyNotIn(List<String> values) {
            addCriterion("t1.ALIPAY_KEY not in", values, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyBetween(String value1, String value2) {
            addCriterion("t1.ALIPAY_KEY between", value1, value2, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayKeyNotBetween(String value1, String value2) {
            addCriterion("t1.ALIPAY_KEY not between", value1, value2, "alipayKey");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridIsNull() {
            addCriterion("t1.ALIPAY_PARTNERID is null");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridIsNotNull() {
            addCriterion("t1.ALIPAY_PARTNERID is not null");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridEqualTo(String value) {
            addCriterion("t1.ALIPAY_PARTNERID =", value, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridNotEqualTo(String value) {
            addCriterion("t1.ALIPAY_PARTNERID <>", value, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridGreaterThan(String value) {
            addCriterion("t1.ALIPAY_PARTNERID >", value, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ALIPAY_PARTNERID >=", value, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridLessThan(String value) {
            addCriterion("t1.ALIPAY_PARTNERID <", value, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridLessThanOrEqualTo(String value) {
            addCriterion("t1.ALIPAY_PARTNERID <=", value, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridLike(String value) {
            addCriterion("t1.ALIPAY_PARTNERID like", value, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridNotLike(String value) {
            addCriterion("t1.ALIPAY_PARTNERID not like", value, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridIn(List<String> values) {
            addCriterion("t1.ALIPAY_PARTNERID in", values, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridNotIn(List<String> values) {
            addCriterion("t1.ALIPAY_PARTNERID not in", values, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridBetween(String value1, String value2) {
            addCriterion("t1.ALIPAY_PARTNERID between", value1, value2, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipayPartneridNotBetween(String value1, String value2) {
            addCriterion("t1.ALIPAY_PARTNERID not between", value1, value2, "alipayPartnerid");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailIsNull() {
            addCriterion("t1.ALIPAY_SELL_MAIL is null");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailIsNotNull() {
            addCriterion("t1.ALIPAY_SELL_MAIL is not null");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailEqualTo(String value) {
            addCriterion("t1.ALIPAY_SELL_MAIL =", value, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailNotEqualTo(String value) {
            addCriterion("t1.ALIPAY_SELL_MAIL <>", value, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailGreaterThan(String value) {
            addCriterion("t1.ALIPAY_SELL_MAIL >", value, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ALIPAY_SELL_MAIL >=", value, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailLessThan(String value) {
            addCriterion("t1.ALIPAY_SELL_MAIL <", value, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailLessThanOrEqualTo(String value) {
            addCriterion("t1.ALIPAY_SELL_MAIL <=", value, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailLike(String value) {
            addCriterion("t1.ALIPAY_SELL_MAIL like", value, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailNotLike(String value) {
            addCriterion("t1.ALIPAY_SELL_MAIL not like", value, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailIn(List<String> values) {
            addCriterion("t1.ALIPAY_SELL_MAIL in", values, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailNotIn(List<String> values) {
            addCriterion("t1.ALIPAY_SELL_MAIL not in", values, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailBetween(String value1, String value2) {
            addCriterion("t1.ALIPAY_SELL_MAIL between", value1, value2, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andAlipaySellMailNotBetween(String value1, String value2) {
            addCriterion("t1.ALIPAY_SELL_MAIL not between", value1, value2, "alipaySellMail");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdIsNull() {
            addCriterion("t1.C_AREABLOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdIsNotNull() {
            addCriterion("t1.C_AREABLOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdEqualTo(Long value) {
            addCriterion("t1.C_AREABLOCK_ID =", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdNotEqualTo(Long value) {
            addCriterion("t1.C_AREABLOCK_ID <>", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdGreaterThan(Long value) {
            addCriterion("t1.C_AREABLOCK_ID >", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_AREABLOCK_ID >=", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdLessThan(Long value) {
            addCriterion("t1.C_AREABLOCK_ID <", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_AREABLOCK_ID <=", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdIn(List<Long> values) {
            addCriterion("t1.C_AREABLOCK_ID in", values, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdNotIn(List<Long> values) {
            addCriterion("t1.C_AREABLOCK_ID not in", values, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_AREABLOCK_ID between", value1, value2, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_AREABLOCK_ID not between", value1, value2, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisIsNull() {
            addCriterion("t1.NC_TAX_DIS is null");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisIsNotNull() {
            addCriterion("t1.NC_TAX_DIS is not null");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisEqualTo(BigDecimal value) {
            addCriterion("t1.NC_TAX_DIS =", value, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisNotEqualTo(BigDecimal value) {
            addCriterion("t1.NC_TAX_DIS <>", value, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisGreaterThan(BigDecimal value) {
            addCriterion("t1.NC_TAX_DIS >", value, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.NC_TAX_DIS >=", value, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisLessThan(BigDecimal value) {
            addCriterion("t1.NC_TAX_DIS <", value, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.NC_TAX_DIS <=", value, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisIn(List<BigDecimal> values) {
            addCriterion("t1.NC_TAX_DIS in", values, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisNotIn(List<BigDecimal> values) {
            addCriterion("t1.NC_TAX_DIS not in", values, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.NC_TAX_DIS between", value1, value2, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andNcTaxDisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.NC_TAX_DIS not between", value1, value2, "ncTaxDis");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewIsNull() {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW is null");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewIsNotNull() {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewEqualTo(String value) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW =", value, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewNotEqualTo(String value) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW <>", value, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewGreaterThan(String value) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW >", value, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewGreaterThanOrEqualTo(String value) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW >=", value, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewLessThan(String value) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW <", value, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewLessThanOrEqualTo(String value) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW <=", value, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewLike(String value) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW like", value, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewNotLike(String value) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW not like", value, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewIn(List<String> values) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW in", values, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewNotIn(List<String> values) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW not in", values, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewBetween(String value1, String value2) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW between", value1, value2, "wechatCustomeridnew");
            return (Criteria) this;
        }

        public Criteria andWechatCustomeridnewNotBetween(String value1, String value2) {
            addCriterion("t1.WECHAT_CUSTOMERIDNEW not between", value1, value2, "wechatCustomeridnew");
            return (Criteria) this;
        }
        public Criteria andAreaNameEqualTo(String value) {
            addCriterion("t4.name =", value, "areaName");
            return (Criteria) this;
        }

        public Criteria andAreaNameLike(String value) {
            addCriterion("t4.name like", value, "areaName");
            return (Criteria) this;
        }
        public Criteria andBlockNameEqualTo(String value) {
            addCriterion("t3.name =", value, "blockName");
            return (Criteria) this;
        }

        public Criteria andBlockNameLike(String value) {
            addCriterion("t3.name like", value, "blockName");
            return (Criteria) this;
        }
        public Criteria andBranchNameEqualTo(String value) {
            addCriterion("t5.sname =", value, "branchName");
            return (Criteria) this;
        }

        public Criteria andBranchNameLike(String value) {
            addCriterion("t5.sname like", value, "branchName");
            return (Criteria) this;
        }
        public Criteria andSalerNameEqualTo(String value) {
            addCriterion("t6.name =", value, "salerName");
            return (Criteria) this;
        }

        public Criteria andSalerNameLike(String value) {
            addCriterion("t6.name like", value, "salerName");
            return (Criteria) this;
        }
        public Criteria andCustNameEqualTo(String value) {
            addCriterion("t2.name =", value, "custName");
            return (Criteria) this;
        }

        public Criteria andCustNameLike(String value) {
            addCriterion("t2.name like", value, "custName");
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

        public Criterion(String condition, Object value) {
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