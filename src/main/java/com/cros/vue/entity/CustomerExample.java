package com.cros.vue.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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
        protected List<Criterion> criteria;

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

        public Criteria andAdClientIdIsNull() {
            addCriterion("AD_CLIENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdClientIdIsNotNull() {
            addCriterion("AD_CLIENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdClientIdEqualTo(Long value) {
            addCriterion("AD_CLIENT_ID =", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotEqualTo(Long value) {
            addCriterion("AD_CLIENT_ID <>", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdGreaterThan(Long value) {
            addCriterion("AD_CLIENT_ID >", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AD_CLIENT_ID >=", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdLessThan(Long value) {
            addCriterion("AD_CLIENT_ID <", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdLessThanOrEqualTo(Long value) {
            addCriterion("AD_CLIENT_ID <=", value, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdIn(List<Long> values) {
            addCriterion("AD_CLIENT_ID in", values, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotIn(List<Long> values) {
            addCriterion("AD_CLIENT_ID not in", values, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdBetween(Long value1, Long value2) {
            addCriterion("AD_CLIENT_ID between", value1, value2, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdClientIdNotBetween(Long value1, Long value2) {
            addCriterion("AD_CLIENT_ID not between", value1, value2, "adClientId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIsNull() {
            addCriterion("AD_ORG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIsNotNull() {
            addCriterion("AD_ORG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdEqualTo(Long value) {
            addCriterion("AD_ORG_ID =", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotEqualTo(Long value) {
            addCriterion("AD_ORG_ID <>", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdGreaterThan(Long value) {
            addCriterion("AD_ORG_ID >", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AD_ORG_ID >=", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdLessThan(Long value) {
            addCriterion("AD_ORG_ID <", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdLessThanOrEqualTo(Long value) {
            addCriterion("AD_ORG_ID <=", value, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdIn(List<Long> values) {
            addCriterion("AD_ORG_ID in", values, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotIn(List<Long> values) {
            addCriterion("AD_ORG_ID not in", values, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdBetween(Long value1, Long value2) {
            addCriterion("AD_ORG_ID between", value1, value2, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andAdOrgIdNotBetween(Long value1, Long value2) {
            addCriterion("AD_ORG_ID not between", value1, value2, "adOrgId");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNull() {
            addCriterion("MODIFIERID is null");
            return (Criteria) this;
        }

        public Criteria andModifieridIsNotNull() {
            addCriterion("MODIFIERID is not null");
            return (Criteria) this;
        }

        public Criteria andModifieridEqualTo(Long value) {
            addCriterion("MODIFIERID =", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotEqualTo(Long value) {
            addCriterion("MODIFIERID <>", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThan(Long value) {
            addCriterion("MODIFIERID >", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridGreaterThanOrEqualTo(Long value) {
            addCriterion("MODIFIERID >=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThan(Long value) {
            addCriterion("MODIFIERID <", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridLessThanOrEqualTo(Long value) {
            addCriterion("MODIFIERID <=", value, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridIn(List<Long> values) {
            addCriterion("MODIFIERID in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotIn(List<Long> values) {
            addCriterion("MODIFIERID not in", values, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridBetween(Long value1, Long value2) {
            addCriterion("MODIFIERID between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andModifieridNotBetween(Long value1, Long value2) {
            addCriterion("MODIFIERID not between", value1, value2, "modifierid");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNull() {
            addCriterion("CREATIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andCreationdateIsNotNull() {
            addCriterion("CREATIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andCreationdateEqualTo(Date value) {
            addCriterion("CREATIONDATE =", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotEqualTo(Date value) {
            addCriterion("CREATIONDATE <>", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThan(Date value) {
            addCriterion("CREATIONDATE >", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("CREATIONDATE >=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThan(Date value) {
            addCriterion("CREATIONDATE <", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateLessThanOrEqualTo(Date value) {
            addCriterion("CREATIONDATE <=", value, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateIn(List<Date> values) {
            addCriterion("CREATIONDATE in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotIn(List<Date> values) {
            addCriterion("CREATIONDATE not in", values, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateBetween(Date value1, Date value2) {
            addCriterion("CREATIONDATE between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andCreationdateNotBetween(Date value1, Date value2) {
            addCriterion("CREATIONDATE not between", value1, value2, "creationdate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNull() {
            addCriterion("MODIFIEDDATE is null");
            return (Criteria) this;
        }

        public Criteria andModifieddateIsNotNull() {
            addCriterion("MODIFIEDDATE is not null");
            return (Criteria) this;
        }

        public Criteria andModifieddateEqualTo(Date value) {
            addCriterion("MODIFIEDDATE =", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotEqualTo(Date value) {
            addCriterion("MODIFIEDDATE <>", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThan(Date value) {
            addCriterion("MODIFIEDDATE >", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateGreaterThanOrEqualTo(Date value) {
            addCriterion("MODIFIEDDATE >=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThan(Date value) {
            addCriterion("MODIFIEDDATE <", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateLessThanOrEqualTo(Date value) {
            addCriterion("MODIFIEDDATE <=", value, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateIn(List<Date> values) {
            addCriterion("MODIFIEDDATE in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotIn(List<Date> values) {
            addCriterion("MODIFIEDDATE not in", values, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateBetween(Date value1, Date value2) {
            addCriterion("MODIFIEDDATE between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andModifieddateNotBetween(Date value1, Date value2) {
            addCriterion("MODIFIEDDATE not between", value1, value2, "modifieddate");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNull() {
            addCriterion("OWNERID is null");
            return (Criteria) this;
        }

        public Criteria andOwneridIsNotNull() {
            addCriterion("OWNERID is not null");
            return (Criteria) this;
        }

        public Criteria andOwneridEqualTo(Long value) {
            addCriterion("OWNERID =", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotEqualTo(Long value) {
            addCriterion("OWNERID <>", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThan(Long value) {
            addCriterion("OWNERID >", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridGreaterThanOrEqualTo(Long value) {
            addCriterion("OWNERID >=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThan(Long value) {
            addCriterion("OWNERID <", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridLessThanOrEqualTo(Long value) {
            addCriterion("OWNERID <=", value, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridIn(List<Long> values) {
            addCriterion("OWNERID in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotIn(List<Long> values) {
            addCriterion("OWNERID not in", values, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridBetween(Long value1, Long value2) {
            addCriterion("OWNERID between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andOwneridNotBetween(Long value1, Long value2) {
            addCriterion("OWNERID not between", value1, value2, "ownerid");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNull() {
            addCriterion("ISACTIVE is null");
            return (Criteria) this;
        }

        public Criteria andIsactiveIsNotNull() {
            addCriterion("ISACTIVE is not null");
            return (Criteria) this;
        }

        public Criteria andIsactiveEqualTo(String value) {
            addCriterion("ISACTIVE =", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotEqualTo(String value) {
            addCriterion("ISACTIVE <>", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThan(String value) {
            addCriterion("ISACTIVE >", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveGreaterThanOrEqualTo(String value) {
            addCriterion("ISACTIVE >=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThan(String value) {
            addCriterion("ISACTIVE <", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLessThanOrEqualTo(String value) {
            addCriterion("ISACTIVE <=", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveLike(String value) {
            addCriterion("ISACTIVE like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotLike(String value) {
            addCriterion("ISACTIVE not like", value, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveIn(List<String> values) {
            addCriterion("ISACTIVE in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotIn(List<String> values) {
            addCriterion("ISACTIVE not in", values, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveBetween(String value1, String value2) {
            addCriterion("ISACTIVE between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andIsactiveNotBetween(String value1, String value2) {
            addCriterion("ISACTIVE not between", value1, value2, "isactive");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("NAME =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("NAME <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("NAME >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("NAME <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("NAME like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("NAME not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("NAME in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("NAME not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("DESCRIPTION is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("DESCRIPTION is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("DESCRIPTION =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("DESCRIPTION <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("DESCRIPTION >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("DESCRIPTION <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("DESCRIPTION <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("DESCRIPTION like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("DESCRIPTION not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("DESCRIPTION in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("DESCRIPTION not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("DESCRIPTION between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("DESCRIPTION not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNull() {
            addCriterion("ENTERDATE is null");
            return (Criteria) this;
        }

        public Criteria andEnterdateIsNotNull() {
            addCriterion("ENTERDATE is not null");
            return (Criteria) this;
        }

        public Criteria andEnterdateEqualTo(Integer value) {
            addCriterion("ENTERDATE =", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotEqualTo(Integer value) {
            addCriterion("ENTERDATE <>", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThan(Integer value) {
            addCriterion("ENTERDATE >", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("ENTERDATE >=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThan(Integer value) {
            addCriterion("ENTERDATE <", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateLessThanOrEqualTo(Integer value) {
            addCriterion("ENTERDATE <=", value, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateIn(List<Integer> values) {
            addCriterion("ENTERDATE in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotIn(List<Integer> values) {
            addCriterion("ENTERDATE not in", values, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateBetween(Integer value1, Integer value2) {
            addCriterion("ENTERDATE between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andEnterdateNotBetween(Integer value1, Integer value2) {
            addCriterion("ENTERDATE not between", value1, value2, "enterdate");
            return (Criteria) this;
        }

        public Criteria andIsstopIsNull() {
            addCriterion("ISSTOP is null");
            return (Criteria) this;
        }

        public Criteria andIsstopIsNotNull() {
            addCriterion("ISSTOP is not null");
            return (Criteria) this;
        }

        public Criteria andIsstopEqualTo(String value) {
            addCriterion("ISSTOP =", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotEqualTo(String value) {
            addCriterion("ISSTOP <>", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopGreaterThan(String value) {
            addCriterion("ISSTOP >", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopGreaterThanOrEqualTo(String value) {
            addCriterion("ISSTOP >=", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopLessThan(String value) {
            addCriterion("ISSTOP <", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopLessThanOrEqualTo(String value) {
            addCriterion("ISSTOP <=", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopLike(String value) {
            addCriterion("ISSTOP like", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotLike(String value) {
            addCriterion("ISSTOP not like", value, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopIn(List<String> values) {
            addCriterion("ISSTOP in", values, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotIn(List<String> values) {
            addCriterion("ISSTOP not in", values, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopBetween(String value1, String value2) {
            addCriterion("ISSTOP between", value1, value2, "isstop");
            return (Criteria) this;
        }

        public Criteria andIsstopNotBetween(String value1, String value2) {
            addCriterion("ISSTOP not between", value1, value2, "isstop");
            return (Criteria) this;
        }

        public Criteria andContacterIsNull() {
            addCriterion("CONTACTER is null");
            return (Criteria) this;
        }

        public Criteria andContacterIsNotNull() {
            addCriterion("CONTACTER is not null");
            return (Criteria) this;
        }

        public Criteria andContacterEqualTo(String value) {
            addCriterion("CONTACTER =", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterNotEqualTo(String value) {
            addCriterion("CONTACTER <>", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterGreaterThan(String value) {
            addCriterion("CONTACTER >", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterGreaterThanOrEqualTo(String value) {
            addCriterion("CONTACTER >=", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterLessThan(String value) {
            addCriterion("CONTACTER <", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterLessThanOrEqualTo(String value) {
            addCriterion("CONTACTER <=", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterLike(String value) {
            addCriterion("CONTACTER like", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterNotLike(String value) {
            addCriterion("CONTACTER not like", value, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterIn(List<String> values) {
            addCriterion("CONTACTER in", values, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterNotIn(List<String> values) {
            addCriterion("CONTACTER not in", values, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterBetween(String value1, String value2) {
            addCriterion("CONTACTER between", value1, value2, "contacter");
            return (Criteria) this;
        }

        public Criteria andContacterNotBetween(String value1, String value2) {
            addCriterion("CONTACTER not between", value1, value2, "contacter");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("PHONE is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("PHONE =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("PHONE <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("PHONE >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("PHONE <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("PHONE <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("PHONE like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("PHONE not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("PHONE in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("PHONE not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("PHONE between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("PHONE not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("ADDRESS =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("ADDRESS <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("ADDRESS >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("ADDRESS >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("ADDRESS <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("ADDRESS <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("ADDRESS like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("ADDRESS not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("ADDRESS in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("ADDRESS not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("ADDRESS between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("ADDRESS not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andPostIsNull() {
            addCriterion("POST is null");
            return (Criteria) this;
        }

        public Criteria andPostIsNotNull() {
            addCriterion("POST is not null");
            return (Criteria) this;
        }

        public Criteria andPostEqualTo(String value) {
            addCriterion("POST =", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotEqualTo(String value) {
            addCriterion("POST <>", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThan(String value) {
            addCriterion("POST >", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostGreaterThanOrEqualTo(String value) {
            addCriterion("POST >=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThan(String value) {
            addCriterion("POST <", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLessThanOrEqualTo(String value) {
            addCriterion("POST <=", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostLike(String value) {
            addCriterion("POST like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotLike(String value) {
            addCriterion("POST not like", value, "post");
            return (Criteria) this;
        }

        public Criteria andPostIn(List<String> values) {
            addCriterion("POST in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotIn(List<String> values) {
            addCriterion("POST not in", values, "post");
            return (Criteria) this;
        }

        public Criteria andPostBetween(String value1, String value2) {
            addCriterion("POST between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andPostNotBetween(String value1, String value2) {
            addCriterion("POST not between", value1, value2, "post");
            return (Criteria) this;
        }

        public Criteria andAccountIsNull() {
            addCriterion("ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAccountIsNotNull() {
            addCriterion("ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAccountEqualTo(String value) {
            addCriterion("ACCOUNT =", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotEqualTo(String value) {
            addCriterion("ACCOUNT <>", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThan(String value) {
            addCriterion("ACCOUNT >", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountGreaterThanOrEqualTo(String value) {
            addCriterion("ACCOUNT >=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThan(String value) {
            addCriterion("ACCOUNT <", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLessThanOrEqualTo(String value) {
            addCriterion("ACCOUNT <=", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountLike(String value) {
            addCriterion("ACCOUNT like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotLike(String value) {
            addCriterion("ACCOUNT not like", value, "account");
            return (Criteria) this;
        }

        public Criteria andAccountIn(List<String> values) {
            addCriterion("ACCOUNT in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotIn(List<String> values) {
            addCriterion("ACCOUNT not in", values, "account");
            return (Criteria) this;
        }

        public Criteria andAccountBetween(String value1, String value2) {
            addCriterion("ACCOUNT between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andAccountNotBetween(String value1, String value2) {
            addCriterion("ACCOUNT not between", value1, value2, "account");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("EMAIL =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("EMAIL <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("EMAIL >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("EMAIL >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("EMAIL <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("EMAIL <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("EMAIL like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("EMAIL not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("EMAIL in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("EMAIL not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("EMAIL between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("EMAIL not between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("REMARK is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("REMARK =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("REMARK <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("REMARK >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("REMARK >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("REMARK <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("REMARK <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("REMARK like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("REMARK not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("REMARK in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("REMARK not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("REMARK between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("REMARK not between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNull() {
            addCriterion("TAXNO is null");
            return (Criteria) this;
        }

        public Criteria andTaxnoIsNotNull() {
            addCriterion("TAXNO is not null");
            return (Criteria) this;
        }

        public Criteria andTaxnoEqualTo(String value) {
            addCriterion("TAXNO =", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotEqualTo(String value) {
            addCriterion("TAXNO <>", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThan(String value) {
            addCriterion("TAXNO >", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoGreaterThanOrEqualTo(String value) {
            addCriterion("TAXNO >=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThan(String value) {
            addCriterion("TAXNO <", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLessThanOrEqualTo(String value) {
            addCriterion("TAXNO <=", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoLike(String value) {
            addCriterion("TAXNO like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotLike(String value) {
            addCriterion("TAXNO not like", value, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoIn(List<String> values) {
            addCriterion("TAXNO in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotIn(List<String> values) {
            addCriterion("TAXNO not in", values, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoBetween(String value1, String value2) {
            addCriterion("TAXNO between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andTaxnoNotBetween(String value1, String value2) {
            addCriterion("TAXNO not between", value1, value2, "taxno");
            return (Criteria) this;
        }

        public Criteria andFeeremainIsNull() {
            addCriterion("FEEREMAIN is null");
            return (Criteria) this;
        }

        public Criteria andFeeremainIsNotNull() {
            addCriterion("FEEREMAIN is not null");
            return (Criteria) this;
        }

        public Criteria andFeeremainEqualTo(BigDecimal value) {
            addCriterion("FEEREMAIN =", value, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainNotEqualTo(BigDecimal value) {
            addCriterion("FEEREMAIN <>", value, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainGreaterThan(BigDecimal value) {
            addCriterion("FEEREMAIN >", value, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEREMAIN >=", value, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainLessThan(BigDecimal value) {
            addCriterion("FEEREMAIN <", value, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEEREMAIN <=", value, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainIn(List<BigDecimal> values) {
            addCriterion("FEEREMAIN in", values, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainNotIn(List<BigDecimal> values) {
            addCriterion("FEEREMAIN not in", values, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEREMAIN between", value1, value2, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeeremainNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEEREMAIN not between", value1, value2, "feeremain");
            return (Criteria) this;
        }

        public Criteria andFeesaleIsNull() {
            addCriterion("FEESALE is null");
            return (Criteria) this;
        }

        public Criteria andFeesaleIsNotNull() {
            addCriterion("FEESALE is not null");
            return (Criteria) this;
        }

        public Criteria andFeesaleEqualTo(BigDecimal value) {
            addCriterion("FEESALE =", value, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleNotEqualTo(BigDecimal value) {
            addCriterion("FEESALE <>", value, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleGreaterThan(BigDecimal value) {
            addCriterion("FEESALE >", value, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEESALE >=", value, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleLessThan(BigDecimal value) {
            addCriterion("FEESALE <", value, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEESALE <=", value, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleIn(List<BigDecimal> values) {
            addCriterion("FEESALE in", values, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleNotIn(List<BigDecimal> values) {
            addCriterion("FEESALE not in", values, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEESALE between", value1, value2, "feesale");
            return (Criteria) this;
        }

        public Criteria andFeesaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEESALE not between", value1, value2, "feesale");
            return (Criteria) this;
        }

        public Criteria andSaledisIsNull() {
            addCriterion("SALEDIS is null");
            return (Criteria) this;
        }

        public Criteria andSaledisIsNotNull() {
            addCriterion("SALEDIS is not null");
            return (Criteria) this;
        }

        public Criteria andSaledisEqualTo(BigDecimal value) {
            addCriterion("SALEDIS =", value, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisNotEqualTo(BigDecimal value) {
            addCriterion("SALEDIS <>", value, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisGreaterThan(BigDecimal value) {
            addCriterion("SALEDIS >", value, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALEDIS >=", value, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisLessThan(BigDecimal value) {
            addCriterion("SALEDIS <", value, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALEDIS <=", value, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisIn(List<BigDecimal> values) {
            addCriterion("SALEDIS in", values, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisNotIn(List<BigDecimal> values) {
            addCriterion("SALEDIS not in", values, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALEDIS between", value1, value2, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaledisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALEDIS not between", value1, value2, "saledis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisIsNull() {
            addCriterion("SALERETDIS is null");
            return (Criteria) this;
        }

        public Criteria andSaleretdisIsNotNull() {
            addCriterion("SALERETDIS is not null");
            return (Criteria) this;
        }

        public Criteria andSaleretdisEqualTo(BigDecimal value) {
            addCriterion("SALERETDIS =", value, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisNotEqualTo(BigDecimal value) {
            addCriterion("SALERETDIS <>", value, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisGreaterThan(BigDecimal value) {
            addCriterion("SALERETDIS >", value, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SALERETDIS >=", value, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisLessThan(BigDecimal value) {
            addCriterion("SALERETDIS <", value, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SALERETDIS <=", value, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisIn(List<BigDecimal> values) {
            addCriterion("SALERETDIS in", values, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisNotIn(List<BigDecimal> values) {
            addCriterion("SALERETDIS not in", values, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALERETDIS between", value1, value2, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andSaleretdisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SALERETDIS not between", value1, value2, "saleretdis");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdIsNull() {
            addCriterion("C_CUSRANK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdIsNotNull() {
            addCriterion("C_CUSRANK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdEqualTo(Long value) {
            addCriterion("C_CUSRANK_ID =", value, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdNotEqualTo(Long value) {
            addCriterion("C_CUSRANK_ID <>", value, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdGreaterThan(Long value) {
            addCriterion("C_CUSRANK_ID >", value, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSRANK_ID >=", value, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdLessThan(Long value) {
            addCriterion("C_CUSRANK_ID <", value, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSRANK_ID <=", value, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdIn(List<Long> values) {
            addCriterion("C_CUSRANK_ID in", values, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdNotIn(List<Long> values) {
            addCriterion("C_CUSRANK_ID not in", values, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdBetween(Long value1, Long value2) {
            addCriterion("C_CUSRANK_ID between", value1, value2, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCusrankIdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSRANK_ID not between", value1, value2, "cCusrankId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdIsNull() {
            addCriterion("C_CUSTOMERUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdIsNotNull() {
            addCriterion("C_CUSTOMERUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdEqualTo(Long value) {
            addCriterion("C_CUSTOMERUP_ID =", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdNotEqualTo(Long value) {
            addCriterion("C_CUSTOMERUP_ID <>", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdGreaterThan(Long value) {
            addCriterion("C_CUSTOMERUP_ID >", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSTOMERUP_ID >=", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdLessThan(Long value) {
            addCriterion("C_CUSTOMERUP_ID <", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSTOMERUP_ID <=", value, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdIn(List<Long> values) {
            addCriterion("C_CUSTOMERUP_ID in", values, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdNotIn(List<Long> values) {
            addCriterion("C_CUSTOMERUP_ID not in", values, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdBetween(Long value1, Long value2) {
            addCriterion("C_CUSTOMERUP_ID between", value1, value2, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andCCustomerupIdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSTOMERUP_ID not between", value1, value2, "cCustomerupId");
            return (Criteria) this;
        }

        public Criteria andFirsaledisIsNull() {
            addCriterion("FIRSALEDIS is null");
            return (Criteria) this;
        }

        public Criteria andFirsaledisIsNotNull() {
            addCriterion("FIRSALEDIS is not null");
            return (Criteria) this;
        }

        public Criteria andFirsaledisEqualTo(BigDecimal value) {
            addCriterion("FIRSALEDIS =", value, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisNotEqualTo(BigDecimal value) {
            addCriterion("FIRSALEDIS <>", value, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisGreaterThan(BigDecimal value) {
            addCriterion("FIRSALEDIS >", value, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSALEDIS >=", value, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisLessThan(BigDecimal value) {
            addCriterion("FIRSALEDIS <", value, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSALEDIS <=", value, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisIn(List<BigDecimal> values) {
            addCriterion("FIRSALEDIS in", values, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisNotIn(List<BigDecimal> values) {
            addCriterion("FIRSALEDIS not in", values, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSALEDIS between", value1, value2, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaledisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSALEDIS not between", value1, value2, "firsaledis");
            return (Criteria) this;
        }

        public Criteria andFeelsaleIsNull() {
            addCriterion("FEELSALE is null");
            return (Criteria) this;
        }

        public Criteria andFeelsaleIsNotNull() {
            addCriterion("FEELSALE is not null");
            return (Criteria) this;
        }

        public Criteria andFeelsaleEqualTo(BigDecimal value) {
            addCriterion("FEELSALE =", value, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleNotEqualTo(BigDecimal value) {
            addCriterion("FEELSALE <>", value, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleGreaterThan(BigDecimal value) {
            addCriterion("FEELSALE >", value, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEELSALE >=", value, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleLessThan(BigDecimal value) {
            addCriterion("FEELSALE <", value, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEELSALE <=", value, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleIn(List<BigDecimal> values) {
            addCriterion("FEELSALE in", values, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleNotIn(List<BigDecimal> values) {
            addCriterion("FEELSALE not in", values, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEELSALE between", value1, value2, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeelsaleNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEELSALE not between", value1, value2, "feelsale");
            return (Criteria) this;
        }

        public Criteria andFeeltakeIsNull() {
            addCriterion("FEELTAKE is null");
            return (Criteria) this;
        }

        public Criteria andFeeltakeIsNotNull() {
            addCriterion("FEELTAKE is not null");
            return (Criteria) this;
        }

        public Criteria andFeeltakeEqualTo(BigDecimal value) {
            addCriterion("FEELTAKE =", value, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeNotEqualTo(BigDecimal value) {
            addCriterion("FEELTAKE <>", value, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeGreaterThan(BigDecimal value) {
            addCriterion("FEELTAKE >", value, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FEELTAKE >=", value, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeLessThan(BigDecimal value) {
            addCriterion("FEELTAKE <", value, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FEELTAKE <=", value, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeIn(List<BigDecimal> values) {
            addCriterion("FEELTAKE in", values, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeNotIn(List<BigDecimal> values) {
            addCriterion("FEELTAKE not in", values, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEELTAKE between", value1, value2, "feeltake");
            return (Criteria) this;
        }

        public Criteria andFeeltakeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FEELTAKE not between", value1, value2, "feeltake");
            return (Criteria) this;
        }

        public Criteria andIsperiodIsNull() {
            addCriterion("ISPERIOD is null");
            return (Criteria) this;
        }

        public Criteria andIsperiodIsNotNull() {
            addCriterion("ISPERIOD is not null");
            return (Criteria) this;
        }

        public Criteria andIsperiodEqualTo(String value) {
            addCriterion("ISPERIOD =", value, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodNotEqualTo(String value) {
            addCriterion("ISPERIOD <>", value, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodGreaterThan(String value) {
            addCriterion("ISPERIOD >", value, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodGreaterThanOrEqualTo(String value) {
            addCriterion("ISPERIOD >=", value, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodLessThan(String value) {
            addCriterion("ISPERIOD <", value, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodLessThanOrEqualTo(String value) {
            addCriterion("ISPERIOD <=", value, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodLike(String value) {
            addCriterion("ISPERIOD like", value, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodNotLike(String value) {
            addCriterion("ISPERIOD not like", value, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodIn(List<String> values) {
            addCriterion("ISPERIOD in", values, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodNotIn(List<String> values) {
            addCriterion("ISPERIOD not in", values, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodBetween(String value1, String value2) {
            addCriterion("ISPERIOD between", value1, value2, "isperiod");
            return (Criteria) this;
        }

        public Criteria andIsperiodNotBetween(String value1, String value2) {
            addCriterion("ISPERIOD not between", value1, value2, "isperiod");
            return (Criteria) this;
        }

        public Criteria andAreamngIdIsNull() {
            addCriterion("AREAMNG_ID is null");
            return (Criteria) this;
        }

        public Criteria andAreamngIdIsNotNull() {
            addCriterion("AREAMNG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAreamngIdEqualTo(Long value) {
            addCriterion("AREAMNG_ID =", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdNotEqualTo(Long value) {
            addCriterion("AREAMNG_ID <>", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdGreaterThan(Long value) {
            addCriterion("AREAMNG_ID >", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AREAMNG_ID >=", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdLessThan(Long value) {
            addCriterion("AREAMNG_ID <", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdLessThanOrEqualTo(Long value) {
            addCriterion("AREAMNG_ID <=", value, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdIn(List<Long> values) {
            addCriterion("AREAMNG_ID in", values, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdNotIn(List<Long> values) {
            addCriterion("AREAMNG_ID not in", values, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdBetween(Long value1, Long value2) {
            addCriterion("AREAMNG_ID between", value1, value2, "areamngId");
            return (Criteria) this;
        }

        public Criteria andAreamngIdNotBetween(Long value1, Long value2) {
            addCriterion("AREAMNG_ID not between", value1, value2, "areamngId");
            return (Criteria) this;
        }

        public Criteria andCCityIdIsNull() {
            addCriterion("C_CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCityIdIsNotNull() {
            addCriterion("C_CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCityIdEqualTo(Long value) {
            addCriterion("C_CITY_ID =", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotEqualTo(Long value) {
            addCriterion("C_CITY_ID <>", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdGreaterThan(Long value) {
            addCriterion("C_CITY_ID >", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CITY_ID >=", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLessThan(Long value) {
            addCriterion("C_CITY_ID <", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdLessThanOrEqualTo(Long value) {
            addCriterion("C_CITY_ID <=", value, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdIn(List<Long> values) {
            addCriterion("C_CITY_ID in", values, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotIn(List<Long> values) {
            addCriterion("C_CITY_ID not in", values, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdBetween(Long value1, Long value2) {
            addCriterion("C_CITY_ID between", value1, value2, "cCityId");
            return (Criteria) this;
        }

        public Criteria andCCityIdNotBetween(Long value1, Long value2) {
            addCriterion("C_CITY_ID not between", value1, value2, "cCityId");
            return (Criteria) this;
        }

        public Criteria andIsautoinIsNull() {
            addCriterion("ISAUTOIN is null");
            return (Criteria) this;
        }

        public Criteria andIsautoinIsNotNull() {
            addCriterion("ISAUTOIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsautoinEqualTo(String value) {
            addCriterion("ISAUTOIN =", value, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinNotEqualTo(String value) {
            addCriterion("ISAUTOIN <>", value, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinGreaterThan(String value) {
            addCriterion("ISAUTOIN >", value, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinGreaterThanOrEqualTo(String value) {
            addCriterion("ISAUTOIN >=", value, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinLessThan(String value) {
            addCriterion("ISAUTOIN <", value, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinLessThanOrEqualTo(String value) {
            addCriterion("ISAUTOIN <=", value, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinLike(String value) {
            addCriterion("ISAUTOIN like", value, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinNotLike(String value) {
            addCriterion("ISAUTOIN not like", value, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinIn(List<String> values) {
            addCriterion("ISAUTOIN in", values, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinNotIn(List<String> values) {
            addCriterion("ISAUTOIN not in", values, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinBetween(String value1, String value2) {
            addCriterion("ISAUTOIN between", value1, value2, "isautoin");
            return (Criteria) this;
        }

        public Criteria andIsautoinNotBetween(String value1, String value2) {
            addCriterion("ISAUTOIN not between", value1, value2, "isautoin");
            return (Criteria) this;
        }

        public Criteria andOrderrateIsNull() {
            addCriterion("ORDERRATE is null");
            return (Criteria) this;
        }

        public Criteria andOrderrateIsNotNull() {
            addCriterion("ORDERRATE is not null");
            return (Criteria) this;
        }

        public Criteria andOrderrateEqualTo(BigDecimal value) {
            addCriterion("ORDERRATE =", value, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateNotEqualTo(BigDecimal value) {
            addCriterion("ORDERRATE <>", value, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateGreaterThan(BigDecimal value) {
            addCriterion("ORDERRATE >", value, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERRATE >=", value, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateLessThan(BigDecimal value) {
            addCriterion("ORDERRATE <", value, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("ORDERRATE <=", value, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateIn(List<BigDecimal> values) {
            addCriterion("ORDERRATE in", values, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateNotIn(List<BigDecimal> values) {
            addCriterion("ORDERRATE not in", values, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERRATE between", value1, value2, "orderrate");
            return (Criteria) this;
        }

        public Criteria andOrderrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("ORDERRATE not between", value1, value2, "orderrate");
            return (Criteria) this;
        }

        public Criteria andRetRateIsNull() {
            addCriterion("RET_RATE is null");
            return (Criteria) this;
        }

        public Criteria andRetRateIsNotNull() {
            addCriterion("RET_RATE is not null");
            return (Criteria) this;
        }

        public Criteria andRetRateEqualTo(BigDecimal value) {
            addCriterion("RET_RATE =", value, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateNotEqualTo(BigDecimal value) {
            addCriterion("RET_RATE <>", value, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateGreaterThan(BigDecimal value) {
            addCriterion("RET_RATE >", value, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RET_RATE >=", value, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateLessThan(BigDecimal value) {
            addCriterion("RET_RATE <", value, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RET_RATE <=", value, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateIn(List<BigDecimal> values) {
            addCriterion("RET_RATE in", values, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateNotIn(List<BigDecimal> values) {
            addCriterion("RET_RATE not in", values, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RET_RATE between", value1, value2, "retRate");
            return (Criteria) this;
        }

        public Criteria andRetRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RET_RATE not between", value1, value2, "retRate");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdIsNull() {
            addCriterion("BIGAREAMNG_ID is null");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdIsNotNull() {
            addCriterion("BIGAREAMNG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdEqualTo(Long value) {
            addCriterion("BIGAREAMNG_ID =", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdNotEqualTo(Long value) {
            addCriterion("BIGAREAMNG_ID <>", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdGreaterThan(Long value) {
            addCriterion("BIGAREAMNG_ID >", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdGreaterThanOrEqualTo(Long value) {
            addCriterion("BIGAREAMNG_ID >=", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdLessThan(Long value) {
            addCriterion("BIGAREAMNG_ID <", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdLessThanOrEqualTo(Long value) {
            addCriterion("BIGAREAMNG_ID <=", value, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdIn(List<Long> values) {
            addCriterion("BIGAREAMNG_ID in", values, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdNotIn(List<Long> values) {
            addCriterion("BIGAREAMNG_ID not in", values, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdBetween(Long value1, Long value2) {
            addCriterion("BIGAREAMNG_ID between", value1, value2, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andBigareamngIdNotBetween(Long value1, Long value2) {
            addCriterion("BIGAREAMNG_ID not between", value1, value2, "bigareamngId");
            return (Criteria) this;
        }

        public Criteria andIsgroupIsNull() {
            addCriterion("ISGROUP is null");
            return (Criteria) this;
        }

        public Criteria andIsgroupIsNotNull() {
            addCriterion("ISGROUP is not null");
            return (Criteria) this;
        }

        public Criteria andIsgroupEqualTo(String value) {
            addCriterion("ISGROUP =", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotEqualTo(String value) {
            addCriterion("ISGROUP <>", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupGreaterThan(String value) {
            addCriterion("ISGROUP >", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupGreaterThanOrEqualTo(String value) {
            addCriterion("ISGROUP >=", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupLessThan(String value) {
            addCriterion("ISGROUP <", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupLessThanOrEqualTo(String value) {
            addCriterion("ISGROUP <=", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupLike(String value) {
            addCriterion("ISGROUP like", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotLike(String value) {
            addCriterion("ISGROUP not like", value, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupIn(List<String> values) {
            addCriterion("ISGROUP in", values, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotIn(List<String> values) {
            addCriterion("ISGROUP not in", values, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupBetween(String value1, String value2) {
            addCriterion("ISGROUP between", value1, value2, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsgroupNotBetween(String value1, String value2) {
            addCriterion("ISGROUP not between", value1, value2, "isgroup");
            return (Criteria) this;
        }

        public Criteria andIsaccountIsNull() {
            addCriterion("ISACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andIsaccountIsNotNull() {
            addCriterion("ISACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andIsaccountEqualTo(String value) {
            addCriterion("ISACCOUNT =", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountNotEqualTo(String value) {
            addCriterion("ISACCOUNT <>", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountGreaterThan(String value) {
            addCriterion("ISACCOUNT >", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountGreaterThanOrEqualTo(String value) {
            addCriterion("ISACCOUNT >=", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountLessThan(String value) {
            addCriterion("ISACCOUNT <", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountLessThanOrEqualTo(String value) {
            addCriterion("ISACCOUNT <=", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountLike(String value) {
            addCriterion("ISACCOUNT like", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountNotLike(String value) {
            addCriterion("ISACCOUNT not like", value, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountIn(List<String> values) {
            addCriterion("ISACCOUNT in", values, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountNotIn(List<String> values) {
            addCriterion("ISACCOUNT not in", values, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountBetween(String value1, String value2) {
            addCriterion("ISACCOUNT between", value1, value2, "isaccount");
            return (Criteria) this;
        }

        public Criteria andIsaccountNotBetween(String value1, String value2) {
            addCriterion("ISACCOUNT not between", value1, value2, "isaccount");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdIsNull() {
            addCriterion("C_DEPARTMENT_ID is null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdIsNotNull() {
            addCriterion("C_DEPARTMENT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdEqualTo(Long value) {
            addCriterion("C_DEPARTMENT_ID =", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdNotEqualTo(Long value) {
            addCriterion("C_DEPARTMENT_ID <>", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdGreaterThan(Long value) {
            addCriterion("C_DEPARTMENT_ID >", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_DEPARTMENT_ID >=", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdLessThan(Long value) {
            addCriterion("C_DEPARTMENT_ID <", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdLessThanOrEqualTo(Long value) {
            addCriterion("C_DEPARTMENT_ID <=", value, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdIn(List<Long> values) {
            addCriterion("C_DEPARTMENT_ID in", values, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdNotIn(List<Long> values) {
            addCriterion("C_DEPARTMENT_ID not in", values, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdBetween(Long value1, Long value2) {
            addCriterion("C_DEPARTMENT_ID between", value1, value2, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCDepartmentIdNotBetween(Long value1, Long value2) {
            addCriterion("C_DEPARTMENT_ID not between", value1, value2, "cDepartmentId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdIsNull() {
            addCriterion("C_CLASSCODE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdIsNotNull() {
            addCriterion("C_CLASSCODE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdEqualTo(Long value) {
            addCriterion("C_CLASSCODE_ID =", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdNotEqualTo(Long value) {
            addCriterion("C_CLASSCODE_ID <>", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdGreaterThan(Long value) {
            addCriterion("C_CLASSCODE_ID >", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CLASSCODE_ID >=", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdLessThan(Long value) {
            addCriterion("C_CLASSCODE_ID <", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdLessThanOrEqualTo(Long value) {
            addCriterion("C_CLASSCODE_ID <=", value, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdIn(List<Long> values) {
            addCriterion("C_CLASSCODE_ID in", values, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdNotIn(List<Long> values) {
            addCriterion("C_CLASSCODE_ID not in", values, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdBetween(Long value1, Long value2) {
            addCriterion("C_CLASSCODE_ID between", value1, value2, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCClasscodeIdNotBetween(Long value1, Long value2) {
            addCriterion("C_CLASSCODE_ID not between", value1, value2, "cClasscodeId");
            return (Criteria) this;
        }

        public Criteria andCodeIsNull() {
            addCriterion("CODE is null");
            return (Criteria) this;
        }

        public Criteria andCodeIsNotNull() {
            addCriterion("CODE is not null");
            return (Criteria) this;
        }

        public Criteria andCodeEqualTo(String value) {
            addCriterion("CODE =", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotEqualTo(String value) {
            addCriterion("CODE <>", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThan(String value) {
            addCriterion("CODE >", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeGreaterThanOrEqualTo(String value) {
            addCriterion("CODE >=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThan(String value) {
            addCriterion("CODE <", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLessThanOrEqualTo(String value) {
            addCriterion("CODE <=", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeLike(String value) {
            addCriterion("CODE like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotLike(String value) {
            addCriterion("CODE not like", value, "code");
            return (Criteria) this;
        }

        public Criteria andCodeIn(List<String> values) {
            addCriterion("CODE in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotIn(List<String> values) {
            addCriterion("CODE not in", values, "code");
            return (Criteria) this;
        }

        public Criteria andCodeBetween(String value1, String value2) {
            addCriterion("CODE between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCodeNotBetween(String value1, String value2) {
            addCriterion("CODE not between", value1, value2, "code");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIsNull() {
            addCriterion("C_AREA_ID is null");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIsNotNull() {
            addCriterion("C_AREA_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCAreaIdEqualTo(Long value) {
            addCriterion("C_AREA_ID =", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotEqualTo(Long value) {
            addCriterion("C_AREA_ID <>", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdGreaterThan(Long value) {
            addCriterion("C_AREA_ID >", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_AREA_ID >=", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdLessThan(Long value) {
            addCriterion("C_AREA_ID <", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdLessThanOrEqualTo(Long value) {
            addCriterion("C_AREA_ID <=", value, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdIn(List<Long> values) {
            addCriterion("C_AREA_ID in", values, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotIn(List<Long> values) {
            addCriterion("C_AREA_ID not in", values, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdBetween(Long value1, Long value2) {
            addCriterion("C_AREA_ID between", value1, value2, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andCAreaIdNotBetween(Long value1, Long value2) {
            addCriterion("C_AREA_ID not between", value1, value2, "cAreaId");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNull() {
            addCriterion("PRIORITY is null");
            return (Criteria) this;
        }

        public Criteria andPriorityIsNotNull() {
            addCriterion("PRIORITY is not null");
            return (Criteria) this;
        }

        public Criteria andPriorityEqualTo(Long value) {
            addCriterion("PRIORITY =", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotEqualTo(Long value) {
            addCriterion("PRIORITY <>", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThan(Long value) {
            addCriterion("PRIORITY >", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityGreaterThanOrEqualTo(Long value) {
            addCriterion("PRIORITY >=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThan(Long value) {
            addCriterion("PRIORITY <", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityLessThanOrEqualTo(Long value) {
            addCriterion("PRIORITY <=", value, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityIn(List<Long> values) {
            addCriterion("PRIORITY in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotIn(List<Long> values) {
            addCriterion("PRIORITY not in", values, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityBetween(Long value1, Long value2) {
            addCriterion("PRIORITY between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andPriorityNotBetween(Long value1, Long value2) {
            addCriterion("PRIORITY not between", value1, value2, "priority");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdIsNull() {
            addCriterion("M_DIMCUS1_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdIsNotNull() {
            addCriterion("M_DIMCUS1_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdEqualTo(Long value) {
            addCriterion("M_DIMCUS1_ID =", value, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS1_ID <>", value, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS1_ID >", value, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS1_ID >=", value, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdLessThan(Long value) {
            addCriterion("M_DIMCUS1_ID <", value, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS1_ID <=", value, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdIn(List<Long> values) {
            addCriterion("M_DIMCUS1_ID in", values, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS1_ID not in", values, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS1_ID between", value1, value2, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus1IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS1_ID not between", value1, value2, "mDimcus1Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdIsNull() {
            addCriterion("M_DIMCUS2_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdIsNotNull() {
            addCriterion("M_DIMCUS2_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdEqualTo(Long value) {
            addCriterion("M_DIMCUS2_ID =", value, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS2_ID <>", value, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS2_ID >", value, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS2_ID >=", value, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdLessThan(Long value) {
            addCriterion("M_DIMCUS2_ID <", value, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS2_ID <=", value, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdIn(List<Long> values) {
            addCriterion("M_DIMCUS2_ID in", values, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS2_ID not in", values, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS2_ID between", value1, value2, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus2IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS2_ID not between", value1, value2, "mDimcus2Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdIsNull() {
            addCriterion("M_DIMCUS3_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdIsNotNull() {
            addCriterion("M_DIMCUS3_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdEqualTo(Long value) {
            addCriterion("M_DIMCUS3_ID =", value, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS3_ID <>", value, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS3_ID >", value, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS3_ID >=", value, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdLessThan(Long value) {
            addCriterion("M_DIMCUS3_ID <", value, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS3_ID <=", value, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdIn(List<Long> values) {
            addCriterion("M_DIMCUS3_ID in", values, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS3_ID not in", values, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS3_ID between", value1, value2, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus3IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS3_ID not between", value1, value2, "mDimcus3Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdIsNull() {
            addCriterion("M_DIMCUS4_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdIsNotNull() {
            addCriterion("M_DIMCUS4_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdEqualTo(Long value) {
            addCriterion("M_DIMCUS4_ID =", value, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS4_ID <>", value, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS4_ID >", value, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS4_ID >=", value, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdLessThan(Long value) {
            addCriterion("M_DIMCUS4_ID <", value, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS4_ID <=", value, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdIn(List<Long> values) {
            addCriterion("M_DIMCUS4_ID in", values, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS4_ID not in", values, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS4_ID between", value1, value2, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus4IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS4_ID not between", value1, value2, "mDimcus4Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdIsNull() {
            addCriterion("M_DIMCUS5_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdIsNotNull() {
            addCriterion("M_DIMCUS5_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdEqualTo(Long value) {
            addCriterion("M_DIMCUS5_ID =", value, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS5_ID <>", value, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS5_ID >", value, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS5_ID >=", value, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdLessThan(Long value) {
            addCriterion("M_DIMCUS5_ID <", value, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS5_ID <=", value, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdIn(List<Long> values) {
            addCriterion("M_DIMCUS5_ID in", values, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS5_ID not in", values, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS5_ID between", value1, value2, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus5IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS5_ID not between", value1, value2, "mDimcus5Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdIsNull() {
            addCriterion("M_DIMCUS6_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdIsNotNull() {
            addCriterion("M_DIMCUS6_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdEqualTo(Long value) {
            addCriterion("M_DIMCUS6_ID =", value, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS6_ID <>", value, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS6_ID >", value, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS6_ID >=", value, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdLessThan(Long value) {
            addCriterion("M_DIMCUS6_ID <", value, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS6_ID <=", value, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdIn(List<Long> values) {
            addCriterion("M_DIMCUS6_ID in", values, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS6_ID not in", values, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS6_ID between", value1, value2, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus6IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS6_ID not between", value1, value2, "mDimcus6Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdIsNull() {
            addCriterion("M_DIMCUS7_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdIsNotNull() {
            addCriterion("M_DIMCUS7_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdEqualTo(Long value) {
            addCriterion("M_DIMCUS7_ID =", value, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS7_ID <>", value, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS7_ID >", value, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS7_ID >=", value, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdLessThan(Long value) {
            addCriterion("M_DIMCUS7_ID <", value, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS7_ID <=", value, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdIn(List<Long> values) {
            addCriterion("M_DIMCUS7_ID in", values, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS7_ID not in", values, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS7_ID between", value1, value2, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus7IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS7_ID not between", value1, value2, "mDimcus7Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdIsNull() {
            addCriterion("M_DIMCUS8_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdIsNotNull() {
            addCriterion("M_DIMCUS8_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdEqualTo(Long value) {
            addCriterion("M_DIMCUS8_ID =", value, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS8_ID <>", value, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS8_ID >", value, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS8_ID >=", value, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdLessThan(Long value) {
            addCriterion("M_DIMCUS8_ID <", value, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS8_ID <=", value, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdIn(List<Long> values) {
            addCriterion("M_DIMCUS8_ID in", values, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS8_ID not in", values, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS8_ID between", value1, value2, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus8IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS8_ID not between", value1, value2, "mDimcus8Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdIsNull() {
            addCriterion("M_DIMCUS9_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdIsNotNull() {
            addCriterion("M_DIMCUS9_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdEqualTo(Long value) {
            addCriterion("M_DIMCUS9_ID =", value, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS9_ID <>", value, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS9_ID >", value, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS9_ID >=", value, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdLessThan(Long value) {
            addCriterion("M_DIMCUS9_ID <", value, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS9_ID <=", value, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdIn(List<Long> values) {
            addCriterion("M_DIMCUS9_ID in", values, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS9_ID not in", values, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS9_ID between", value1, value2, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus9IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS9_ID not between", value1, value2, "mDimcus9Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdIsNull() {
            addCriterion("M_DIMCUS10_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdIsNotNull() {
            addCriterion("M_DIMCUS10_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdEqualTo(Long value) {
            addCriterion("M_DIMCUS10_ID =", value, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdNotEqualTo(Long value) {
            addCriterion("M_DIMCUS10_ID <>", value, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdGreaterThan(Long value) {
            addCriterion("M_DIMCUS10_ID >", value, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS10_ID >=", value, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdLessThan(Long value) {
            addCriterion("M_DIMCUS10_ID <", value, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIMCUS10_ID <=", value, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdIn(List<Long> values) {
            addCriterion("M_DIMCUS10_ID in", values, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdNotIn(List<Long> values) {
            addCriterion("M_DIMCUS10_ID not in", values, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS10_ID between", value1, value2, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andMDimcus10IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIMCUS10_ID not between", value1, value2, "mDimcus10Id");
            return (Criteria) this;
        }

        public Criteria andButsaledisIsNull() {
            addCriterion("BUTSALEDIS is null");
            return (Criteria) this;
        }

        public Criteria andButsaledisIsNotNull() {
            addCriterion("BUTSALEDIS is not null");
            return (Criteria) this;
        }

        public Criteria andButsaledisEqualTo(BigDecimal value) {
            addCriterion("BUTSALEDIS =", value, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisNotEqualTo(BigDecimal value) {
            addCriterion("BUTSALEDIS <>", value, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisGreaterThan(BigDecimal value) {
            addCriterion("BUTSALEDIS >", value, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTSALEDIS >=", value, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisLessThan(BigDecimal value) {
            addCriterion("BUTSALEDIS <", value, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("BUTSALEDIS <=", value, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisIn(List<BigDecimal> values) {
            addCriterion("BUTSALEDIS in", values, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisNotIn(List<BigDecimal> values) {
            addCriterion("BUTSALEDIS not in", values, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTSALEDIS between", value1, value2, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andButsaledisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("BUTSALEDIS not between", value1, value2, "butsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisIsNull() {
            addCriterion("AGTSALEDIS is null");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisIsNotNull() {
            addCriterion("AGTSALEDIS is not null");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisEqualTo(BigDecimal value) {
            addCriterion("AGTSALEDIS =", value, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisNotEqualTo(BigDecimal value) {
            addCriterion("AGTSALEDIS <>", value, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisGreaterThan(BigDecimal value) {
            addCriterion("AGTSALEDIS >", value, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGTSALEDIS >=", value, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisLessThan(BigDecimal value) {
            addCriterion("AGTSALEDIS <", value, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGTSALEDIS <=", value, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisIn(List<BigDecimal> values) {
            addCriterion("AGTSALEDIS in", values, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisNotIn(List<BigDecimal> values) {
            addCriterion("AGTSALEDIS not in", values, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGTSALEDIS between", value1, value2, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andAgtsaledisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGTSALEDIS not between", value1, value2, "agtsaledis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisIsNull() {
            addCriterion("FIRSALERETDIS is null");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisIsNotNull() {
            addCriterion("FIRSALERETDIS is not null");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisEqualTo(BigDecimal value) {
            addCriterion("FIRSALERETDIS =", value, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisNotEqualTo(BigDecimal value) {
            addCriterion("FIRSALERETDIS <>", value, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisGreaterThan(BigDecimal value) {
            addCriterion("FIRSALERETDIS >", value, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSALERETDIS >=", value, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisLessThan(BigDecimal value) {
            addCriterion("FIRSALERETDIS <", value, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRSALERETDIS <=", value, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisIn(List<BigDecimal> values) {
            addCriterion("FIRSALERETDIS in", values, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisNotIn(List<BigDecimal> values) {
            addCriterion("FIRSALERETDIS not in", values, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSALERETDIS between", value1, value2, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andFirsaleretdisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRSALERETDIS not between", value1, value2, "firsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisIsNull() {
            addCriterion("AGTSALERETDIS is null");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisIsNotNull() {
            addCriterion("AGTSALERETDIS is not null");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisEqualTo(BigDecimal value) {
            addCriterion("AGTSALERETDIS =", value, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisNotEqualTo(BigDecimal value) {
            addCriterion("AGTSALERETDIS <>", value, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisGreaterThan(BigDecimal value) {
            addCriterion("AGTSALERETDIS >", value, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGTSALERETDIS >=", value, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisLessThan(BigDecimal value) {
            addCriterion("AGTSALERETDIS <", value, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGTSALERETDIS <=", value, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisIn(List<BigDecimal> values) {
            addCriterion("AGTSALERETDIS in", values, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisNotIn(List<BigDecimal> values) {
            addCriterion("AGTSALERETDIS not in", values, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGTSALERETDIS between", value1, value2, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andAgtsaleretdisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGTSALERETDIS not between", value1, value2, "agtsaleretdis");
            return (Criteria) this;
        }

        public Criteria andTrandisIsNull() {
            addCriterion("TRANDIS is null");
            return (Criteria) this;
        }

        public Criteria andTrandisIsNotNull() {
            addCriterion("TRANDIS is not null");
            return (Criteria) this;
        }

        public Criteria andTrandisEqualTo(BigDecimal value) {
            addCriterion("TRANDIS =", value, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisNotEqualTo(BigDecimal value) {
            addCriterion("TRANDIS <>", value, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisGreaterThan(BigDecimal value) {
            addCriterion("TRANDIS >", value, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANDIS >=", value, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisLessThan(BigDecimal value) {
            addCriterion("TRANDIS <", value, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("TRANDIS <=", value, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisIn(List<BigDecimal> values) {
            addCriterion("TRANDIS in", values, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisNotIn(List<BigDecimal> values) {
            addCriterion("TRANDIS not in", values, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANDIS between", value1, value2, "trandis");
            return (Criteria) this;
        }

        public Criteria andTrandisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("TRANDIS not between", value1, value2, "trandis");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdIsNull() {
            addCriterion("C_CUSATTRIB1_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdIsNotNull() {
            addCriterion("C_CUSATTRIB1_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB1_ID =", value, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB1_ID <>", value, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB1_ID >", value, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB1_ID >=", value, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB1_ID <", value, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB1_ID <=", value, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB1_ID in", values, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB1_ID not in", values, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB1_ID between", value1, value2, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib1IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB1_ID not between", value1, value2, "cCusattrib1Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdIsNull() {
            addCriterion("C_CUSATTRIB2_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdIsNotNull() {
            addCriterion("C_CUSATTRIB2_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB2_ID =", value, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB2_ID <>", value, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB2_ID >", value, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB2_ID >=", value, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB2_ID <", value, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB2_ID <=", value, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB2_ID in", values, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB2_ID not in", values, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB2_ID between", value1, value2, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib2IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB2_ID not between", value1, value2, "cCusattrib2Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdIsNull() {
            addCriterion("C_CUSATTRIB3_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdIsNotNull() {
            addCriterion("C_CUSATTRIB3_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB3_ID =", value, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB3_ID <>", value, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB3_ID >", value, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB3_ID >=", value, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB3_ID <", value, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB3_ID <=", value, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB3_ID in", values, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB3_ID not in", values, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB3_ID between", value1, value2, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib3IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB3_ID not between", value1, value2, "cCusattrib3Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdIsNull() {
            addCriterion("C_CUSATTRIB4_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdIsNotNull() {
            addCriterion("C_CUSATTRIB4_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB4_ID =", value, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB4_ID <>", value, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB4_ID >", value, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB4_ID >=", value, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB4_ID <", value, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB4_ID <=", value, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB4_ID in", values, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB4_ID not in", values, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB4_ID between", value1, value2, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib4IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB4_ID not between", value1, value2, "cCusattrib4Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdIsNull() {
            addCriterion("C_CUSATTRIB5_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdIsNotNull() {
            addCriterion("C_CUSATTRIB5_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB5_ID =", value, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB5_ID <>", value, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB5_ID >", value, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB5_ID >=", value, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB5_ID <", value, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB5_ID <=", value, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB5_ID in", values, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB5_ID not in", values, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB5_ID between", value1, value2, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib5IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB5_ID not between", value1, value2, "cCusattrib5Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdIsNull() {
            addCriterion("C_CUSATTRIB6_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdIsNotNull() {
            addCriterion("C_CUSATTRIB6_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB6_ID =", value, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB6_ID <>", value, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB6_ID >", value, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB6_ID >=", value, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB6_ID <", value, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB6_ID <=", value, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB6_ID in", values, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB6_ID not in", values, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB6_ID between", value1, value2, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib6IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB6_ID not between", value1, value2, "cCusattrib6Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdIsNull() {
            addCriterion("C_CUSATTRIB7_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdIsNotNull() {
            addCriterion("C_CUSATTRIB7_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB7_ID =", value, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB7_ID <>", value, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB7_ID >", value, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB7_ID >=", value, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB7_ID <", value, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB7_ID <=", value, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB7_ID in", values, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB7_ID not in", values, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB7_ID between", value1, value2, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib7IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB7_ID not between", value1, value2, "cCusattrib7Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdIsNull() {
            addCriterion("C_CUSATTRIB8_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdIsNotNull() {
            addCriterion("C_CUSATTRIB8_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB8_ID =", value, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB8_ID <>", value, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB8_ID >", value, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB8_ID >=", value, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB8_ID <", value, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB8_ID <=", value, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB8_ID in", values, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB8_ID not in", values, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB8_ID between", value1, value2, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib8IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB8_ID not between", value1, value2, "cCusattrib8Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdIsNull() {
            addCriterion("C_CUSATTRIB9_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdIsNotNull() {
            addCriterion("C_CUSATTRIB9_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB9_ID =", value, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB9_ID <>", value, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB9_ID >", value, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB9_ID >=", value, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB9_ID <", value, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB9_ID <=", value, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB9_ID in", values, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB9_ID not in", values, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB9_ID between", value1, value2, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib9IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB9_ID not between", value1, value2, "cCusattrib9Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdIsNull() {
            addCriterion("C_CUSATTRIB10_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdIsNotNull() {
            addCriterion("C_CUSATTRIB10_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB10_ID =", value, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB10_ID <>", value, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB10_ID >", value, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB10_ID >=", value, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB10_ID <", value, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB10_ID <=", value, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB10_ID in", values, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB10_ID not in", values, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB10_ID between", value1, value2, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib10IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB10_ID not between", value1, value2, "cCusattrib10Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdIsNull() {
            addCriterion("C_CUSATTRIB11_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdIsNotNull() {
            addCriterion("C_CUSATTRIB11_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB11_ID =", value, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB11_ID <>", value, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB11_ID >", value, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB11_ID >=", value, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB11_ID <", value, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB11_ID <=", value, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB11_ID in", values, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB11_ID not in", values, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB11_ID between", value1, value2, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib11IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB11_ID not between", value1, value2, "cCusattrib11Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdIsNull() {
            addCriterion("C_CUSATTRIB12_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdIsNotNull() {
            addCriterion("C_CUSATTRIB12_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB12_ID =", value, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB12_ID <>", value, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB12_ID >", value, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB12_ID >=", value, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB12_ID <", value, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB12_ID <=", value, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB12_ID in", values, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB12_ID not in", values, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB12_ID between", value1, value2, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib12IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB12_ID not between", value1, value2, "cCusattrib12Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdIsNull() {
            addCriterion("C_CUSATTRIB13_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdIsNotNull() {
            addCriterion("C_CUSATTRIB13_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB13_ID =", value, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB13_ID <>", value, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB13_ID >", value, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB13_ID >=", value, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB13_ID <", value, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB13_ID <=", value, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB13_ID in", values, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB13_ID not in", values, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB13_ID between", value1, value2, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib13IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB13_ID not between", value1, value2, "cCusattrib13Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdIsNull() {
            addCriterion("C_CUSATTRIB14_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdIsNotNull() {
            addCriterion("C_CUSATTRIB14_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB14_ID =", value, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB14_ID <>", value, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB14_ID >", value, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB14_ID >=", value, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB14_ID <", value, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB14_ID <=", value, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB14_ID in", values, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB14_ID not in", values, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB14_ID between", value1, value2, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib14IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB14_ID not between", value1, value2, "cCusattrib14Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdIsNull() {
            addCriterion("C_CUSATTRIB15_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdIsNotNull() {
            addCriterion("C_CUSATTRIB15_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB15_ID =", value, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB15_ID <>", value, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB15_ID >", value, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB15_ID >=", value, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB15_ID <", value, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB15_ID <=", value, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB15_ID in", values, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB15_ID not in", values, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB15_ID between", value1, value2, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib15IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB15_ID not between", value1, value2, "cCusattrib15Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdIsNull() {
            addCriterion("C_CUSATTRIB16_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdIsNotNull() {
            addCriterion("C_CUSATTRIB16_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB16_ID =", value, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB16_ID <>", value, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB16_ID >", value, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB16_ID >=", value, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB16_ID <", value, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB16_ID <=", value, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB16_ID in", values, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB16_ID not in", values, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB16_ID between", value1, value2, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib16IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB16_ID not between", value1, value2, "cCusattrib16Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdIsNull() {
            addCriterion("C_CUSATTRIB17_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdIsNotNull() {
            addCriterion("C_CUSATTRIB17_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB17_ID =", value, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB17_ID <>", value, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB17_ID >", value, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB17_ID >=", value, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB17_ID <", value, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB17_ID <=", value, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB17_ID in", values, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB17_ID not in", values, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB17_ID between", value1, value2, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib17IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB17_ID not between", value1, value2, "cCusattrib17Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdIsNull() {
            addCriterion("C_CUSATTRIB18_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdIsNotNull() {
            addCriterion("C_CUSATTRIB18_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB18_ID =", value, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB18_ID <>", value, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB18_ID >", value, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB18_ID >=", value, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB18_ID <", value, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB18_ID <=", value, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB18_ID in", values, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB18_ID not in", values, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB18_ID between", value1, value2, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib18IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB18_ID not between", value1, value2, "cCusattrib18Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdIsNull() {
            addCriterion("C_CUSATTRIB19_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdIsNotNull() {
            addCriterion("C_CUSATTRIB19_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB19_ID =", value, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB19_ID <>", value, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB19_ID >", value, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB19_ID >=", value, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB19_ID <", value, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB19_ID <=", value, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB19_ID in", values, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB19_ID not in", values, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB19_ID between", value1, value2, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib19IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB19_ID not between", value1, value2, "cCusattrib19Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdIsNull() {
            addCriterion("C_CUSATTRIB20_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdIsNotNull() {
            addCriterion("C_CUSATTRIB20_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdEqualTo(Long value) {
            addCriterion("C_CUSATTRIB20_ID =", value, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdNotEqualTo(Long value) {
            addCriterion("C_CUSATTRIB20_ID <>", value, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdGreaterThan(Long value) {
            addCriterion("C_CUSATTRIB20_ID >", value, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB20_ID >=", value, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdLessThan(Long value) {
            addCriterion("C_CUSATTRIB20_ID <", value, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSATTRIB20_ID <=", value, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdIn(List<Long> values) {
            addCriterion("C_CUSATTRIB20_ID in", values, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdNotIn(List<Long> values) {
            addCriterion("C_CUSATTRIB20_ID not in", values, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB20_ID between", value1, value2, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCCusattrib20IdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSATTRIB20_ID not between", value1, value2, "cCusattrib20Id");
            return (Criteria) this;
        }

        public Criteria andCanButsaleIsNull() {
            addCriterion("CAN_BUTSALE is null");
            return (Criteria) this;
        }

        public Criteria andCanButsaleIsNotNull() {
            addCriterion("CAN_BUTSALE is not null");
            return (Criteria) this;
        }

        public Criteria andCanButsaleEqualTo(String value) {
            addCriterion("CAN_BUTSALE =", value, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleNotEqualTo(String value) {
            addCriterion("CAN_BUTSALE <>", value, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleGreaterThan(String value) {
            addCriterion("CAN_BUTSALE >", value, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleGreaterThanOrEqualTo(String value) {
            addCriterion("CAN_BUTSALE >=", value, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleLessThan(String value) {
            addCriterion("CAN_BUTSALE <", value, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleLessThanOrEqualTo(String value) {
            addCriterion("CAN_BUTSALE <=", value, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleLike(String value) {
            addCriterion("CAN_BUTSALE like", value, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleNotLike(String value) {
            addCriterion("CAN_BUTSALE not like", value, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleIn(List<String> values) {
            addCriterion("CAN_BUTSALE in", values, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleNotIn(List<String> values) {
            addCriterion("CAN_BUTSALE not in", values, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleBetween(String value1, String value2) {
            addCriterion("CAN_BUTSALE between", value1, value2, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanButsaleNotBetween(String value1, String value2) {
            addCriterion("CAN_BUTSALE not between", value1, value2, "canButsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleIsNull() {
            addCriterion("CAN_NOTBUTSALE is null");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleIsNotNull() {
            addCriterion("CAN_NOTBUTSALE is not null");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleEqualTo(String value) {
            addCriterion("CAN_NOTBUTSALE =", value, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleNotEqualTo(String value) {
            addCriterion("CAN_NOTBUTSALE <>", value, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleGreaterThan(String value) {
            addCriterion("CAN_NOTBUTSALE >", value, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleGreaterThanOrEqualTo(String value) {
            addCriterion("CAN_NOTBUTSALE >=", value, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleLessThan(String value) {
            addCriterion("CAN_NOTBUTSALE <", value, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleLessThanOrEqualTo(String value) {
            addCriterion("CAN_NOTBUTSALE <=", value, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleLike(String value) {
            addCriterion("CAN_NOTBUTSALE like", value, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleNotLike(String value) {
            addCriterion("CAN_NOTBUTSALE not like", value, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleIn(List<String> values) {
            addCriterion("CAN_NOTBUTSALE in", values, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleNotIn(List<String> values) {
            addCriterion("CAN_NOTBUTSALE not in", values, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleBetween(String value1, String value2) {
            addCriterion("CAN_NOTBUTSALE between", value1, value2, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanNotbutsaleNotBetween(String value1, String value2) {
            addCriterion("CAN_NOTBUTSALE not between", value1, value2, "canNotbutsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleIsNull() {
            addCriterion("CAN_AGTSALE is null");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleIsNotNull() {
            addCriterion("CAN_AGTSALE is not null");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleEqualTo(String value) {
            addCriterion("CAN_AGTSALE =", value, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleNotEqualTo(String value) {
            addCriterion("CAN_AGTSALE <>", value, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleGreaterThan(String value) {
            addCriterion("CAN_AGTSALE >", value, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleGreaterThanOrEqualTo(String value) {
            addCriterion("CAN_AGTSALE >=", value, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleLessThan(String value) {
            addCriterion("CAN_AGTSALE <", value, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleLessThanOrEqualTo(String value) {
            addCriterion("CAN_AGTSALE <=", value, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleLike(String value) {
            addCriterion("CAN_AGTSALE like", value, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleNotLike(String value) {
            addCriterion("CAN_AGTSALE not like", value, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleIn(List<String> values) {
            addCriterion("CAN_AGTSALE in", values, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleNotIn(List<String> values) {
            addCriterion("CAN_AGTSALE not in", values, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleBetween(String value1, String value2) {
            addCriterion("CAN_AGTSALE between", value1, value2, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andCanAgtsaleNotBetween(String value1, String value2) {
            addCriterion("CAN_AGTSALE not between", value1, value2, "canAgtsale");
            return (Criteria) this;
        }

        public Criteria andIscrefundIsNull() {
            addCriterion("ISCREFUND is null");
            return (Criteria) this;
        }

        public Criteria andIscrefundIsNotNull() {
            addCriterion("ISCREFUND is not null");
            return (Criteria) this;
        }

        public Criteria andIscrefundEqualTo(String value) {
            addCriterion("ISCREFUND =", value, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundNotEqualTo(String value) {
            addCriterion("ISCREFUND <>", value, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundGreaterThan(String value) {
            addCriterion("ISCREFUND >", value, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundGreaterThanOrEqualTo(String value) {
            addCriterion("ISCREFUND >=", value, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundLessThan(String value) {
            addCriterion("ISCREFUND <", value, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundLessThanOrEqualTo(String value) {
            addCriterion("ISCREFUND <=", value, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundLike(String value) {
            addCriterion("ISCREFUND like", value, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundNotLike(String value) {
            addCriterion("ISCREFUND not like", value, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundIn(List<String> values) {
            addCriterion("ISCREFUND in", values, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundNotIn(List<String> values) {
            addCriterion("ISCREFUND not in", values, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundBetween(String value1, String value2) {
            addCriterion("ISCREFUND between", value1, value2, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andIscrefundNotBetween(String value1, String value2) {
            addCriterion("ISCREFUND not between", value1, value2, "iscrefund");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdIsNull() {
            addCriterion("C_CUSTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdIsNotNull() {
            addCriterion("C_CUSTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdEqualTo(Long value) {
            addCriterion("C_CUSTYPE_ID =", value, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdNotEqualTo(Long value) {
            addCriterion("C_CUSTYPE_ID <>", value, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdGreaterThan(Long value) {
            addCriterion("C_CUSTYPE_ID >", value, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSTYPE_ID >=", value, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdLessThan(Long value) {
            addCriterion("C_CUSTYPE_ID <", value, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSTYPE_ID <=", value, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdIn(List<Long> values) {
            addCriterion("C_CUSTYPE_ID in", values, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdNotIn(List<Long> values) {
            addCriterion("C_CUSTYPE_ID not in", values, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdBetween(Long value1, Long value2) {
            addCriterion("C_CUSTYPE_ID between", value1, value2, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andCCustypeIdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSTYPE_ID not between", value1, value2, "cCustypeId");
            return (Criteria) this;
        }

        public Criteria andMDim1IdIsNull() {
            addCriterion("M_DIM1_ID is null");
            return (Criteria) this;
        }

        public Criteria andMDim1IdIsNotNull() {
            addCriterion("M_DIM1_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMDim1IdEqualTo(Long value) {
            addCriterion("M_DIM1_ID =", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdNotEqualTo(Long value) {
            addCriterion("M_DIM1_ID <>", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdGreaterThan(Long value) {
            addCriterion("M_DIM1_ID >", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_DIM1_ID >=", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdLessThan(Long value) {
            addCriterion("M_DIM1_ID <", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdLessThanOrEqualTo(Long value) {
            addCriterion("M_DIM1_ID <=", value, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdIn(List<Long> values) {
            addCriterion("M_DIM1_ID in", values, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdNotIn(List<Long> values) {
            addCriterion("M_DIM1_ID not in", values, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdBetween(Long value1, Long value2) {
            addCriterion("M_DIM1_ID between", value1, value2, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMDim1IdNotBetween(Long value1, Long value2) {
            addCriterion("M_DIM1_ID not between", value1, value2, "mDim1Id");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("MOBILE is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("MOBILE is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("MOBILE =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("MOBILE <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("MOBILE >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("MOBILE >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("MOBILE <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("MOBILE <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("MOBILE like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("MOBILE not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("MOBILE in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("MOBILE not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("MOBILE between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("MOBILE not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andCalculationIsNull() {
            addCriterion("CALCULATION is null");
            return (Criteria) this;
        }

        public Criteria andCalculationIsNotNull() {
            addCriterion("CALCULATION is not null");
            return (Criteria) this;
        }

        public Criteria andCalculationEqualTo(Long value) {
            addCriterion("CALCULATION =", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationNotEqualTo(Long value) {
            addCriterion("CALCULATION <>", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationGreaterThan(Long value) {
            addCriterion("CALCULATION >", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationGreaterThanOrEqualTo(Long value) {
            addCriterion("CALCULATION >=", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationLessThan(Long value) {
            addCriterion("CALCULATION <", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationLessThanOrEqualTo(Long value) {
            addCriterion("CALCULATION <=", value, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationIn(List<Long> values) {
            addCriterion("CALCULATION in", values, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationNotIn(List<Long> values) {
            addCriterion("CALCULATION not in", values, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationBetween(Long value1, Long value2) {
            addCriterion("CALCULATION between", value1, value2, "calculation");
            return (Criteria) this;
        }

        public Criteria andCalculationNotBetween(Long value1, Long value2) {
            addCriterion("CALCULATION not between", value1, value2, "calculation");
            return (Criteria) this;
        }

        public Criteria andIskdIsNull() {
            addCriterion("ISKD is null");
            return (Criteria) this;
        }

        public Criteria andIskdIsNotNull() {
            addCriterion("ISKD is not null");
            return (Criteria) this;
        }

        public Criteria andIskdEqualTo(String value) {
            addCriterion("ISKD =", value, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdNotEqualTo(String value) {
            addCriterion("ISKD <>", value, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdGreaterThan(String value) {
            addCriterion("ISKD >", value, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdGreaterThanOrEqualTo(String value) {
            addCriterion("ISKD >=", value, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdLessThan(String value) {
            addCriterion("ISKD <", value, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdLessThanOrEqualTo(String value) {
            addCriterion("ISKD <=", value, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdLike(String value) {
            addCriterion("ISKD like", value, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdNotLike(String value) {
            addCriterion("ISKD not like", value, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdIn(List<String> values) {
            addCriterion("ISKD in", values, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdNotIn(List<String> values) {
            addCriterion("ISKD not in", values, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdBetween(String value1, String value2) {
            addCriterion("ISKD between", value1, value2, "iskd");
            return (Criteria) this;
        }

        public Criteria andIskdNotBetween(String value1, String value2) {
            addCriterion("ISKD not between", value1, value2, "iskd");
            return (Criteria) this;
        }

        public Criteria andLegalIdIsNull() {
            addCriterion("LEGAL_ID is null");
            return (Criteria) this;
        }

        public Criteria andLegalIdIsNotNull() {
            addCriterion("LEGAL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andLegalIdEqualTo(Long value) {
            addCriterion("LEGAL_ID =", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdNotEqualTo(Long value) {
            addCriterion("LEGAL_ID <>", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdGreaterThan(Long value) {
            addCriterion("LEGAL_ID >", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdGreaterThanOrEqualTo(Long value) {
            addCriterion("LEGAL_ID >=", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdLessThan(Long value) {
            addCriterion("LEGAL_ID <", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdLessThanOrEqualTo(Long value) {
            addCriterion("LEGAL_ID <=", value, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdIn(List<Long> values) {
            addCriterion("LEGAL_ID in", values, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdNotIn(List<Long> values) {
            addCriterion("LEGAL_ID not in", values, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdBetween(Long value1, Long value2) {
            addCriterion("LEGAL_ID between", value1, value2, "legalId");
            return (Criteria) this;
        }

        public Criteria andLegalIdNotBetween(Long value1, Long value2) {
            addCriterion("LEGAL_ID not between", value1, value2, "legalId");
            return (Criteria) this;
        }

        public Criteria andFirretrateIsNull() {
            addCriterion("FIRRETRATE is null");
            return (Criteria) this;
        }

        public Criteria andFirretrateIsNotNull() {
            addCriterion("FIRRETRATE is not null");
            return (Criteria) this;
        }

        public Criteria andFirretrateEqualTo(BigDecimal value) {
            addCriterion("FIRRETRATE =", value, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateNotEqualTo(BigDecimal value) {
            addCriterion("FIRRETRATE <>", value, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateGreaterThan(BigDecimal value) {
            addCriterion("FIRRETRATE >", value, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRRETRATE >=", value, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateLessThan(BigDecimal value) {
            addCriterion("FIRRETRATE <", value, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRRETRATE <=", value, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateIn(List<BigDecimal> values) {
            addCriterion("FIRRETRATE in", values, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateNotIn(List<BigDecimal> values) {
            addCriterion("FIRRETRATE not in", values, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRRETRATE between", value1, value2, "firretrate");
            return (Criteria) this;
        }

        public Criteria andFirretrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRRETRATE not between", value1, value2, "firretrate");
            return (Criteria) this;
        }

        public Criteria andRetrateIsNull() {
            addCriterion("RETRATE is null");
            return (Criteria) this;
        }

        public Criteria andRetrateIsNotNull() {
            addCriterion("RETRATE is not null");
            return (Criteria) this;
        }

        public Criteria andRetrateEqualTo(BigDecimal value) {
            addCriterion("RETRATE =", value, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateNotEqualTo(BigDecimal value) {
            addCriterion("RETRATE <>", value, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateGreaterThan(BigDecimal value) {
            addCriterion("RETRATE >", value, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("RETRATE >=", value, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateLessThan(BigDecimal value) {
            addCriterion("RETRATE <", value, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("RETRATE <=", value, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateIn(List<BigDecimal> values) {
            addCriterion("RETRATE in", values, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateNotIn(List<BigDecimal> values) {
            addCriterion("RETRATE not in", values, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETRATE between", value1, value2, "retrate");
            return (Criteria) this;
        }

        public Criteria andRetrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("RETRATE not between", value1, value2, "retrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateIsNull() {
            addCriterion("AGTRETRATE is null");
            return (Criteria) this;
        }

        public Criteria andAgtretrateIsNotNull() {
            addCriterion("AGTRETRATE is not null");
            return (Criteria) this;
        }

        public Criteria andAgtretrateEqualTo(BigDecimal value) {
            addCriterion("AGTRETRATE =", value, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateNotEqualTo(BigDecimal value) {
            addCriterion("AGTRETRATE <>", value, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateGreaterThan(BigDecimal value) {
            addCriterion("AGTRETRATE >", value, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("AGTRETRATE >=", value, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateLessThan(BigDecimal value) {
            addCriterion("AGTRETRATE <", value, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("AGTRETRATE <=", value, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateIn(List<BigDecimal> values) {
            addCriterion("AGTRETRATE in", values, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateNotIn(List<BigDecimal> values) {
            addCriterion("AGTRETRATE not in", values, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGTRETRATE between", value1, value2, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andAgtretrateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("AGTRETRATE not between", value1, value2, "agtretrate");
            return (Criteria) this;
        }

        public Criteria andGlCompanyIsNull() {
            addCriterion("GL_COMPANY is null");
            return (Criteria) this;
        }

        public Criteria andGlCompanyIsNotNull() {
            addCriterion("GL_COMPANY is not null");
            return (Criteria) this;
        }

        public Criteria andGlCompanyEqualTo(String value) {
            addCriterion("GL_COMPANY =", value, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyNotEqualTo(String value) {
            addCriterion("GL_COMPANY <>", value, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyGreaterThan(String value) {
            addCriterion("GL_COMPANY >", value, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("GL_COMPANY >=", value, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyLessThan(String value) {
            addCriterion("GL_COMPANY <", value, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyLessThanOrEqualTo(String value) {
            addCriterion("GL_COMPANY <=", value, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyLike(String value) {
            addCriterion("GL_COMPANY like", value, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyNotLike(String value) {
            addCriterion("GL_COMPANY not like", value, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyIn(List<String> values) {
            addCriterion("GL_COMPANY in", values, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyNotIn(List<String> values) {
            addCriterion("GL_COMPANY not in", values, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyBetween(String value1, String value2) {
            addCriterion("GL_COMPANY between", value1, value2, "glCompany");
            return (Criteria) this;
        }

        public Criteria andGlCompanyNotBetween(String value1, String value2) {
            addCriterion("GL_COMPANY not between", value1, value2, "glCompany");
            return (Criteria) this;
        }

        public Criteria andProfitcenterIsNull() {
            addCriterion("PROFITCENTER is null");
            return (Criteria) this;
        }

        public Criteria andProfitcenterIsNotNull() {
            addCriterion("PROFITCENTER is not null");
            return (Criteria) this;
        }

        public Criteria andProfitcenterEqualTo(String value) {
            addCriterion("PROFITCENTER =", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterNotEqualTo(String value) {
            addCriterion("PROFITCENTER <>", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterGreaterThan(String value) {
            addCriterion("PROFITCENTER >", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterGreaterThanOrEqualTo(String value) {
            addCriterion("PROFITCENTER >=", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterLessThan(String value) {
            addCriterion("PROFITCENTER <", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterLessThanOrEqualTo(String value) {
            addCriterion("PROFITCENTER <=", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterLike(String value) {
            addCriterion("PROFITCENTER like", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterNotLike(String value) {
            addCriterion("PROFITCENTER not like", value, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterIn(List<String> values) {
            addCriterion("PROFITCENTER in", values, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterNotIn(List<String> values) {
            addCriterion("PROFITCENTER not in", values, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterBetween(String value1, String value2) {
            addCriterion("PROFITCENTER between", value1, value2, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andProfitcenterNotBetween(String value1, String value2) {
            addCriterion("PROFITCENTER not between", value1, value2, "profitcenter");
            return (Criteria) this;
        }

        public Criteria andIsthirdIsNull() {
            addCriterion("ISTHIRD is null");
            return (Criteria) this;
        }

        public Criteria andIsthirdIsNotNull() {
            addCriterion("ISTHIRD is not null");
            return (Criteria) this;
        }

        public Criteria andIsthirdEqualTo(String value) {
            addCriterion("ISTHIRD =", value, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdNotEqualTo(String value) {
            addCriterion("ISTHIRD <>", value, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdGreaterThan(String value) {
            addCriterion("ISTHIRD >", value, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdGreaterThanOrEqualTo(String value) {
            addCriterion("ISTHIRD >=", value, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdLessThan(String value) {
            addCriterion("ISTHIRD <", value, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdLessThanOrEqualTo(String value) {
            addCriterion("ISTHIRD <=", value, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdLike(String value) {
            addCriterion("ISTHIRD like", value, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdNotLike(String value) {
            addCriterion("ISTHIRD not like", value, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdIn(List<String> values) {
            addCriterion("ISTHIRD in", values, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdNotIn(List<String> values) {
            addCriterion("ISTHIRD not in", values, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdBetween(String value1, String value2) {
            addCriterion("ISTHIRD between", value1, value2, "isthird");
            return (Criteria) this;
        }

        public Criteria andIsthirdNotBetween(String value1, String value2) {
            addCriterion("ISTHIRD not between", value1, value2, "isthird");
            return (Criteria) this;
        }

        public Criteria andLegalIsNull() {
            addCriterion("LEGAL is null");
            return (Criteria) this;
        }

        public Criteria andLegalIsNotNull() {
            addCriterion("LEGAL is not null");
            return (Criteria) this;
        }

        public Criteria andLegalEqualTo(String value) {
            addCriterion("LEGAL =", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotEqualTo(String value) {
            addCriterion("LEGAL <>", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalGreaterThan(String value) {
            addCriterion("LEGAL >", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalGreaterThanOrEqualTo(String value) {
            addCriterion("LEGAL >=", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLessThan(String value) {
            addCriterion("LEGAL <", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLessThanOrEqualTo(String value) {
            addCriterion("LEGAL <=", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalLike(String value) {
            addCriterion("LEGAL like", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotLike(String value) {
            addCriterion("LEGAL not like", value, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalIn(List<String> values) {
            addCriterion("LEGAL in", values, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotIn(List<String> values) {
            addCriterion("LEGAL not in", values, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalBetween(String value1, String value2) {
            addCriterion("LEGAL between", value1, value2, "legal");
            return (Criteria) this;
        }

        public Criteria andLegalNotBetween(String value1, String value2) {
            addCriterion("LEGAL not between", value1, value2, "legal");
            return (Criteria) this;
        }

        public Criteria andIsPckIsNull() {
            addCriterion("IS_PCK is null");
            return (Criteria) this;
        }

        public Criteria andIsPckIsNotNull() {
            addCriterion("IS_PCK is not null");
            return (Criteria) this;
        }

        public Criteria andIsPckEqualTo(String value) {
            addCriterion("IS_PCK =", value, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckNotEqualTo(String value) {
            addCriterion("IS_PCK <>", value, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckGreaterThan(String value) {
            addCriterion("IS_PCK >", value, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_PCK >=", value, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckLessThan(String value) {
            addCriterion("IS_PCK <", value, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckLessThanOrEqualTo(String value) {
            addCriterion("IS_PCK <=", value, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckLike(String value) {
            addCriterion("IS_PCK like", value, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckNotLike(String value) {
            addCriterion("IS_PCK not like", value, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckIn(List<String> values) {
            addCriterion("IS_PCK in", values, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckNotIn(List<String> values) {
            addCriterion("IS_PCK not in", values, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckBetween(String value1, String value2) {
            addCriterion("IS_PCK between", value1, value2, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsPckNotBetween(String value1, String value2) {
            addCriterion("IS_PCK not between", value1, value2, "isPck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckIsNull() {
            addCriterion("IS_SALE_PCK is null");
            return (Criteria) this;
        }

        public Criteria andIsSalePckIsNotNull() {
            addCriterion("IS_SALE_PCK is not null");
            return (Criteria) this;
        }

        public Criteria andIsSalePckEqualTo(String value) {
            addCriterion("IS_SALE_PCK =", value, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckNotEqualTo(String value) {
            addCriterion("IS_SALE_PCK <>", value, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckGreaterThan(String value) {
            addCriterion("IS_SALE_PCK >", value, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SALE_PCK >=", value, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckLessThan(String value) {
            addCriterion("IS_SALE_PCK <", value, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckLessThanOrEqualTo(String value) {
            addCriterion("IS_SALE_PCK <=", value, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckLike(String value) {
            addCriterion("IS_SALE_PCK like", value, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckNotLike(String value) {
            addCriterion("IS_SALE_PCK not like", value, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckIn(List<String> values) {
            addCriterion("IS_SALE_PCK in", values, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckNotIn(List<String> values) {
            addCriterion("IS_SALE_PCK not in", values, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckBetween(String value1, String value2) {
            addCriterion("IS_SALE_PCK between", value1, value2, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsSalePckNotBetween(String value1, String value2) {
            addCriterion("IS_SALE_PCK not between", value1, value2, "isSalePck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckIsNull() {
            addCriterion("IS_RETPUT_PCK is null");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckIsNotNull() {
            addCriterion("IS_RETPUT_PCK is not null");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckEqualTo(String value) {
            addCriterion("IS_RETPUT_PCK =", value, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckNotEqualTo(String value) {
            addCriterion("IS_RETPUT_PCK <>", value, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckGreaterThan(String value) {
            addCriterion("IS_RETPUT_PCK >", value, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckGreaterThanOrEqualTo(String value) {
            addCriterion("IS_RETPUT_PCK >=", value, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckLessThan(String value) {
            addCriterion("IS_RETPUT_PCK <", value, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckLessThanOrEqualTo(String value) {
            addCriterion("IS_RETPUT_PCK <=", value, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckLike(String value) {
            addCriterion("IS_RETPUT_PCK like", value, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckNotLike(String value) {
            addCriterion("IS_RETPUT_PCK not like", value, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckIn(List<String> values) {
            addCriterion("IS_RETPUT_PCK in", values, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckNotIn(List<String> values) {
            addCriterion("IS_RETPUT_PCK not in", values, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckBetween(String value1, String value2) {
            addCriterion("IS_RETPUT_PCK between", value1, value2, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andIsRetputPckNotBetween(String value1, String value2) {
            addCriterion("IS_RETPUT_PCK not between", value1, value2, "isRetputPck");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNull() {
            addCriterion("IMGURL1 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl1IsNotNull() {
            addCriterion("IMGURL1 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl1EqualTo(String value) {
            addCriterion("IMGURL1 =", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotEqualTo(String value) {
            addCriterion("IMGURL1 <>", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThan(String value) {
            addCriterion("IMGURL1 >", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL1 >=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThan(String value) {
            addCriterion("IMGURL1 <", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1LessThanOrEqualTo(String value) {
            addCriterion("IMGURL1 <=", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Like(String value) {
            addCriterion("IMGURL1 like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotLike(String value) {
            addCriterion("IMGURL1 not like", value, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1In(List<String> values) {
            addCriterion("IMGURL1 in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotIn(List<String> values) {
            addCriterion("IMGURL1 not in", values, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1Between(String value1, String value2) {
            addCriterion("IMGURL1 between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl1NotBetween(String value1, String value2) {
            addCriterion("IMGURL1 not between", value1, value2, "imgurl1");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNull() {
            addCriterion("IMGURL2 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl2IsNotNull() {
            addCriterion("IMGURL2 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl2EqualTo(String value) {
            addCriterion("IMGURL2 =", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotEqualTo(String value) {
            addCriterion("IMGURL2 <>", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThan(String value) {
            addCriterion("IMGURL2 >", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL2 >=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThan(String value) {
            addCriterion("IMGURL2 <", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2LessThanOrEqualTo(String value) {
            addCriterion("IMGURL2 <=", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Like(String value) {
            addCriterion("IMGURL2 like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotLike(String value) {
            addCriterion("IMGURL2 not like", value, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2In(List<String> values) {
            addCriterion("IMGURL2 in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotIn(List<String> values) {
            addCriterion("IMGURL2 not in", values, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2Between(String value1, String value2) {
            addCriterion("IMGURL2 between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl2NotBetween(String value1, String value2) {
            addCriterion("IMGURL2 not between", value1, value2, "imgurl2");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNull() {
            addCriterion("IMGURL3 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl3IsNotNull() {
            addCriterion("IMGURL3 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl3EqualTo(String value) {
            addCriterion("IMGURL3 =", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotEqualTo(String value) {
            addCriterion("IMGURL3 <>", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThan(String value) {
            addCriterion("IMGURL3 >", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL3 >=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThan(String value) {
            addCriterion("IMGURL3 <", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3LessThanOrEqualTo(String value) {
            addCriterion("IMGURL3 <=", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Like(String value) {
            addCriterion("IMGURL3 like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotLike(String value) {
            addCriterion("IMGURL3 not like", value, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3In(List<String> values) {
            addCriterion("IMGURL3 in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotIn(List<String> values) {
            addCriterion("IMGURL3 not in", values, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3Between(String value1, String value2) {
            addCriterion("IMGURL3 between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl3NotBetween(String value1, String value2) {
            addCriterion("IMGURL3 not between", value1, value2, "imgurl3");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNull() {
            addCriterion("IMGURL4 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl4IsNotNull() {
            addCriterion("IMGURL4 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl4EqualTo(String value) {
            addCriterion("IMGURL4 =", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotEqualTo(String value) {
            addCriterion("IMGURL4 <>", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThan(String value) {
            addCriterion("IMGURL4 >", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL4 >=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThan(String value) {
            addCriterion("IMGURL4 <", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4LessThanOrEqualTo(String value) {
            addCriterion("IMGURL4 <=", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Like(String value) {
            addCriterion("IMGURL4 like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotLike(String value) {
            addCriterion("IMGURL4 not like", value, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4In(List<String> values) {
            addCriterion("IMGURL4 in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotIn(List<String> values) {
            addCriterion("IMGURL4 not in", values, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4Between(String value1, String value2) {
            addCriterion("IMGURL4 between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl4NotBetween(String value1, String value2) {
            addCriterion("IMGURL4 not between", value1, value2, "imgurl4");
            return (Criteria) this;
        }

        public Criteria andImgurl5IsNull() {
            addCriterion("IMGURL5 is null");
            return (Criteria) this;
        }

        public Criteria andImgurl5IsNotNull() {
            addCriterion("IMGURL5 is not null");
            return (Criteria) this;
        }

        public Criteria andImgurl5EqualTo(String value) {
            addCriterion("IMGURL5 =", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotEqualTo(String value) {
            addCriterion("IMGURL5 <>", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5GreaterThan(String value) {
            addCriterion("IMGURL5 >", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5GreaterThanOrEqualTo(String value) {
            addCriterion("IMGURL5 >=", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5LessThan(String value) {
            addCriterion("IMGURL5 <", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5LessThanOrEqualTo(String value) {
            addCriterion("IMGURL5 <=", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5Like(String value) {
            addCriterion("IMGURL5 like", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotLike(String value) {
            addCriterion("IMGURL5 not like", value, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5In(List<String> values) {
            addCriterion("IMGURL5 in", values, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotIn(List<String> values) {
            addCriterion("IMGURL5 not in", values, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5Between(String value1, String value2) {
            addCriterion("IMGURL5 between", value1, value2, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andImgurl5NotBetween(String value1, String value2) {
            addCriterion("IMGURL5 not between", value1, value2, "imgurl5");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdIsNull() {
            addCriterion("B_CUSCODE_FORMAT_ID is null");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdIsNotNull() {
            addCriterion("B_CUSCODE_FORMAT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdEqualTo(Long value) {
            addCriterion("B_CUSCODE_FORMAT_ID =", value, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdNotEqualTo(Long value) {
            addCriterion("B_CUSCODE_FORMAT_ID <>", value, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdGreaterThan(Long value) {
            addCriterion("B_CUSCODE_FORMAT_ID >", value, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdGreaterThanOrEqualTo(Long value) {
            addCriterion("B_CUSCODE_FORMAT_ID >=", value, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdLessThan(Long value) {
            addCriterion("B_CUSCODE_FORMAT_ID <", value, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdLessThanOrEqualTo(Long value) {
            addCriterion("B_CUSCODE_FORMAT_ID <=", value, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdIn(List<Long> values) {
            addCriterion("B_CUSCODE_FORMAT_ID in", values, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdNotIn(List<Long> values) {
            addCriterion("B_CUSCODE_FORMAT_ID not in", values, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdBetween(Long value1, Long value2) {
            addCriterion("B_CUSCODE_FORMAT_ID between", value1, value2, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andBCuscodeFormatIdNotBetween(Long value1, Long value2) {
            addCriterion("B_CUSCODE_FORMAT_ID not between", value1, value2, "bCuscodeFormatId");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemIsNull() {
            addCriterion("SALEINVITEM is null");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemIsNotNull() {
            addCriterion("SALEINVITEM is not null");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemEqualTo(String value) {
            addCriterion("SALEINVITEM =", value, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemNotEqualTo(String value) {
            addCriterion("SALEINVITEM <>", value, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemGreaterThan(String value) {
            addCriterion("SALEINVITEM >", value, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemGreaterThanOrEqualTo(String value) {
            addCriterion("SALEINVITEM >=", value, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemLessThan(String value) {
            addCriterion("SALEINVITEM <", value, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemLessThanOrEqualTo(String value) {
            addCriterion("SALEINVITEM <=", value, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemLike(String value) {
            addCriterion("SALEINVITEM like", value, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemNotLike(String value) {
            addCriterion("SALEINVITEM not like", value, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemIn(List<String> values) {
            addCriterion("SALEINVITEM in", values, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemNotIn(List<String> values) {
            addCriterion("SALEINVITEM not in", values, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemBetween(String value1, String value2) {
            addCriterion("SALEINVITEM between", value1, value2, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andSaleinvitemNotBetween(String value1, String value2) {
            addCriterion("SALEINVITEM not between", value1, value2, "saleinvitem");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdIsNull() {
            addCriterion("C_FRANCHISEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdIsNotNull() {
            addCriterion("C_FRANCHISEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdEqualTo(Long value) {
            addCriterion("C_FRANCHISEE_ID =", value, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdNotEqualTo(Long value) {
            addCriterion("C_FRANCHISEE_ID <>", value, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdGreaterThan(Long value) {
            addCriterion("C_FRANCHISEE_ID >", value, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_FRANCHISEE_ID >=", value, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdLessThan(Long value) {
            addCriterion("C_FRANCHISEE_ID <", value, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdLessThanOrEqualTo(Long value) {
            addCriterion("C_FRANCHISEE_ID <=", value, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdIn(List<Long> values) {
            addCriterion("C_FRANCHISEE_ID in", values, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdNotIn(List<Long> values) {
            addCriterion("C_FRANCHISEE_ID not in", values, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdBetween(Long value1, Long value2) {
            addCriterion("C_FRANCHISEE_ID between", value1, value2, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCFranchiseeIdNotBetween(Long value1, Long value2) {
            addCriterion("C_FRANCHISEE_ID not between", value1, value2, "cFranchiseeId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdIsNull() {
            addCriterion("C_CUSGROUP_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdIsNotNull() {
            addCriterion("C_CUSGROUP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdEqualTo(Long value) {
            addCriterion("C_CUSGROUP_ID =", value, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdNotEqualTo(Long value) {
            addCriterion("C_CUSGROUP_ID <>", value, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdGreaterThan(Long value) {
            addCriterion("C_CUSGROUP_ID >", value, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSGROUP_ID >=", value, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdLessThan(Long value) {
            addCriterion("C_CUSGROUP_ID <", value, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSGROUP_ID <=", value, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdIn(List<Long> values) {
            addCriterion("C_CUSGROUP_ID in", values, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdNotIn(List<Long> values) {
            addCriterion("C_CUSGROUP_ID not in", values, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdBetween(Long value1, Long value2) {
            addCriterion("C_CUSGROUP_ID between", value1, value2, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andCCusgroupIdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSGROUP_ID not between", value1, value2, "cCusgroupId");
            return (Criteria) this;
        }

        public Criteria andBankIsNull() {
            addCriterion("BANK is null");
            return (Criteria) this;
        }

        public Criteria andBankIsNotNull() {
            addCriterion("BANK is not null");
            return (Criteria) this;
        }

        public Criteria andBankEqualTo(String value) {
            addCriterion("BANK =", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotEqualTo(String value) {
            addCriterion("BANK <>", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThan(String value) {
            addCriterion("BANK >", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankGreaterThanOrEqualTo(String value) {
            addCriterion("BANK >=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThan(String value) {
            addCriterion("BANK <", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLessThanOrEqualTo(String value) {
            addCriterion("BANK <=", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankLike(String value) {
            addCriterion("BANK like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotLike(String value) {
            addCriterion("BANK not like", value, "bank");
            return (Criteria) this;
        }

        public Criteria andBankIn(List<String> values) {
            addCriterion("BANK in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotIn(List<String> values) {
            addCriterion("BANK not in", values, "bank");
            return (Criteria) this;
        }

        public Criteria andBankBetween(String value1, String value2) {
            addCriterion("BANK between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andBankNotBetween(String value1, String value2) {
            addCriterion("BANK not between", value1, value2, "bank");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdIsNull() {
            addCriterion("C_CURRENCY_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdIsNotNull() {
            addCriterion("C_CURRENCY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdEqualTo(Long value) {
            addCriterion("C_CURRENCY_ID =", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdNotEqualTo(Long value) {
            addCriterion("C_CURRENCY_ID <>", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdGreaterThan(Long value) {
            addCriterion("C_CURRENCY_ID >", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CURRENCY_ID >=", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdLessThan(Long value) {
            addCriterion("C_CURRENCY_ID <", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdLessThanOrEqualTo(Long value) {
            addCriterion("C_CURRENCY_ID <=", value, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdIn(List<Long> values) {
            addCriterion("C_CURRENCY_ID in", values, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdNotIn(List<Long> values) {
            addCriterion("C_CURRENCY_ID not in", values, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdBetween(Long value1, Long value2) {
            addCriterion("C_CURRENCY_ID between", value1, value2, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andCCurrencyIdNotBetween(Long value1, Long value2) {
            addCriterion("C_CURRENCY_ID not between", value1, value2, "cCurrencyId");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNull() {
            addCriterion("PAYWAY is null");
            return (Criteria) this;
        }

        public Criteria andPaywayIsNotNull() {
            addCriterion("PAYWAY is not null");
            return (Criteria) this;
        }

        public Criteria andPaywayEqualTo(String value) {
            addCriterion("PAYWAY =", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotEqualTo(String value) {
            addCriterion("PAYWAY <>", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThan(String value) {
            addCriterion("PAYWAY >", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayGreaterThanOrEqualTo(String value) {
            addCriterion("PAYWAY >=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThan(String value) {
            addCriterion("PAYWAY <", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLessThanOrEqualTo(String value) {
            addCriterion("PAYWAY <=", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayLike(String value) {
            addCriterion("PAYWAY like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotLike(String value) {
            addCriterion("PAYWAY not like", value, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayIn(List<String> values) {
            addCriterion("PAYWAY in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotIn(List<String> values) {
            addCriterion("PAYWAY not in", values, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayBetween(String value1, String value2) {
            addCriterion("PAYWAY between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andPaywayNotBetween(String value1, String value2) {
            addCriterion("PAYWAY not between", value1, value2, "payway");
            return (Criteria) this;
        }

        public Criteria andTradewayIsNull() {
            addCriterion("TRADEWAY is null");
            return (Criteria) this;
        }

        public Criteria andTradewayIsNotNull() {
            addCriterion("TRADEWAY is not null");
            return (Criteria) this;
        }

        public Criteria andTradewayEqualTo(String value) {
            addCriterion("TRADEWAY =", value, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayNotEqualTo(String value) {
            addCriterion("TRADEWAY <>", value, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayGreaterThan(String value) {
            addCriterion("TRADEWAY >", value, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayGreaterThanOrEqualTo(String value) {
            addCriterion("TRADEWAY >=", value, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayLessThan(String value) {
            addCriterion("TRADEWAY <", value, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayLessThanOrEqualTo(String value) {
            addCriterion("TRADEWAY <=", value, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayLike(String value) {
            addCriterion("TRADEWAY like", value, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayNotLike(String value) {
            addCriterion("TRADEWAY not like", value, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayIn(List<String> values) {
            addCriterion("TRADEWAY in", values, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayNotIn(List<String> values) {
            addCriterion("TRADEWAY not in", values, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayBetween(String value1, String value2) {
            addCriterion("TRADEWAY between", value1, value2, "tradeway");
            return (Criteria) this;
        }

        public Criteria andTradewayNotBetween(String value1, String value2) {
            addCriterion("TRADEWAY not between", value1, value2, "tradeway");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Integer value) {
            addCriterion("BIRTHDAY =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Integer value) {
            addCriterion("BIRTHDAY <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Integer value) {
            addCriterion("BIRTHDAY >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Integer value) {
            addCriterion("BIRTHDAY >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Integer value) {
            addCriterion("BIRTHDAY <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Integer value) {
            addCriterion("BIRTHDAY <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Integer> values) {
            addCriterion("BIRTHDAY in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Integer> values) {
            addCriterion("BIRTHDAY not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Integer value1, Integer value2) {
            addCriterion("BIRTHDAY between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Integer value1, Integer value2) {
            addCriterion("BIRTHDAY not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipIsNull() {
            addCriterion("FRANCHISEE_RELASHIP is null");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipIsNotNull() {
            addCriterion("FRANCHISEE_RELASHIP is not null");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipEqualTo(String value) {
            addCriterion("FRANCHISEE_RELASHIP =", value, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipNotEqualTo(String value) {
            addCriterion("FRANCHISEE_RELASHIP <>", value, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipGreaterThan(String value) {
            addCriterion("FRANCHISEE_RELASHIP >", value, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipGreaterThanOrEqualTo(String value) {
            addCriterion("FRANCHISEE_RELASHIP >=", value, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipLessThan(String value) {
            addCriterion("FRANCHISEE_RELASHIP <", value, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipLessThanOrEqualTo(String value) {
            addCriterion("FRANCHISEE_RELASHIP <=", value, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipLike(String value) {
            addCriterion("FRANCHISEE_RELASHIP like", value, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipNotLike(String value) {
            addCriterion("FRANCHISEE_RELASHIP not like", value, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipIn(List<String> values) {
            addCriterion("FRANCHISEE_RELASHIP in", values, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipNotIn(List<String> values) {
            addCriterion("FRANCHISEE_RELASHIP not in", values, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipBetween(String value1, String value2) {
            addCriterion("FRANCHISEE_RELASHIP between", value1, value2, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andFranchiseeRelashipNotBetween(String value1, String value2) {
            addCriterion("FRANCHISEE_RELASHIP not between", value1, value2, "franchiseeRelaship");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeIsNull() {
            addCriterion("OPENSTORE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeIsNotNull() {
            addCriterion("OPENSTORE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeEqualTo(String value) {
            addCriterion("OPENSTORE_TYPE =", value, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeNotEqualTo(String value) {
            addCriterion("OPENSTORE_TYPE <>", value, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeGreaterThan(String value) {
            addCriterion("OPENSTORE_TYPE >", value, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeGreaterThanOrEqualTo(String value) {
            addCriterion("OPENSTORE_TYPE >=", value, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeLessThan(String value) {
            addCriterion("OPENSTORE_TYPE <", value, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeLessThanOrEqualTo(String value) {
            addCriterion("OPENSTORE_TYPE <=", value, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeLike(String value) {
            addCriterion("OPENSTORE_TYPE like", value, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeNotLike(String value) {
            addCriterion("OPENSTORE_TYPE not like", value, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeIn(List<String> values) {
            addCriterion("OPENSTORE_TYPE in", values, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeNotIn(List<String> values) {
            addCriterion("OPENSTORE_TYPE not in", values, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeBetween(String value1, String value2) {
            addCriterion("OPENSTORE_TYPE between", value1, value2, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andOpenstoreTypeNotBetween(String value1, String value2) {
            addCriterion("OPENSTORE_TYPE not between", value1, value2, "openstoreType");
            return (Criteria) this;
        }

        public Criteria andStopdateIsNull() {
            addCriterion("STOPDATE is null");
            return (Criteria) this;
        }

        public Criteria andStopdateIsNotNull() {
            addCriterion("STOPDATE is not null");
            return (Criteria) this;
        }

        public Criteria andStopdateEqualTo(Date value) {
            addCriterion("STOPDATE =", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateNotEqualTo(Date value) {
            addCriterion("STOPDATE <>", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateGreaterThan(Date value) {
            addCriterion("STOPDATE >", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateGreaterThanOrEqualTo(Date value) {
            addCriterion("STOPDATE >=", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateLessThan(Date value) {
            addCriterion("STOPDATE <", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateLessThanOrEqualTo(Date value) {
            addCriterion("STOPDATE <=", value, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateIn(List<Date> values) {
            addCriterion("STOPDATE in", values, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateNotIn(List<Date> values) {
            addCriterion("STOPDATE not in", values, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateBetween(Date value1, Date value2) {
            addCriterion("STOPDATE between", value1, value2, "stopdate");
            return (Criteria) this;
        }

        public Criteria andStopdateNotBetween(Date value1, Date value2) {
            addCriterion("STOPDATE not between", value1, value2, "stopdate");
            return (Criteria) this;
        }

        public Criteria andCBranchIdIsNull() {
            addCriterion("C_BRANCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andCBranchIdIsNotNull() {
            addCriterion("C_BRANCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCBranchIdEqualTo(Long value) {
            addCriterion("C_BRANCH_ID =", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdNotEqualTo(Long value) {
            addCriterion("C_BRANCH_ID <>", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdGreaterThan(Long value) {
            addCriterion("C_BRANCH_ID >", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_BRANCH_ID >=", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdLessThan(Long value) {
            addCriterion("C_BRANCH_ID <", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdLessThanOrEqualTo(Long value) {
            addCriterion("C_BRANCH_ID <=", value, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdIn(List<Long> values) {
            addCriterion("C_BRANCH_ID in", values, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdNotIn(List<Long> values) {
            addCriterion("C_BRANCH_ID not in", values, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdBetween(Long value1, Long value2) {
            addCriterion("C_BRANCH_ID between", value1, value2, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCBranchIdNotBetween(Long value1, Long value2) {
            addCriterion("C_BRANCH_ID not between", value1, value2, "cBranchId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdIsNull() {
            addCriterion("C_SALER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCSalerIdIsNotNull() {
            addCriterion("C_SALER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCSalerIdEqualTo(Long value) {
            addCriterion("C_SALER_ID =", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdNotEqualTo(Long value) {
            addCriterion("C_SALER_ID <>", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdGreaterThan(Long value) {
            addCriterion("C_SALER_ID >", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_SALER_ID >=", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdLessThan(Long value) {
            addCriterion("C_SALER_ID <", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdLessThanOrEqualTo(Long value) {
            addCriterion("C_SALER_ID <=", value, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdIn(List<Long> values) {
            addCriterion("C_SALER_ID in", values, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdNotIn(List<Long> values) {
            addCriterion("C_SALER_ID not in", values, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdBetween(Long value1, Long value2) {
            addCriterion("C_SALER_ID between", value1, value2, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andCSalerIdNotBetween(Long value1, Long value2) {
            addCriterion("C_SALER_ID not between", value1, value2, "cSalerId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIsNull() {
            addCriterion("SALESREP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIsNotNull() {
            addCriterion("SALESREP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdEqualTo(Long value) {
            addCriterion("SALESREP_ID =", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotEqualTo(Long value) {
            addCriterion("SALESREP_ID <>", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdGreaterThan(Long value) {
            addCriterion("SALESREP_ID >", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SALESREP_ID >=", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdLessThan(Long value) {
            addCriterion("SALESREP_ID <", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdLessThanOrEqualTo(Long value) {
            addCriterion("SALESREP_ID <=", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIn(List<Long> values) {
            addCriterion("SALESREP_ID in", values, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotIn(List<Long> values) {
            addCriterion("SALESREP_ID not in", values, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdBetween(Long value1, Long value2) {
            addCriterion("SALESREP_ID between", value1, value2, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotBetween(Long value1, Long value2) {
            addCriterion("SALESREP_ID not between", value1, value2, "salesrepId");
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