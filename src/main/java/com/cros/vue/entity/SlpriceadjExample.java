package com.cros.vue.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SlpriceadjExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlpriceadjExample() {
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

        public Criteria andDocnoIsNull() {
            addCriterion("DOCNO is null");
            return (Criteria) this;
        }

        public Criteria andDocnoIsNotNull() {
            addCriterion("DOCNO is not null");
            return (Criteria) this;
        }

        public Criteria andDocnoEqualTo(String value) {
            addCriterion("DOCNO =", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotEqualTo(String value) {
            addCriterion("DOCNO <>", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoGreaterThan(String value) {
            addCriterion("DOCNO >", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoGreaterThanOrEqualTo(String value) {
            addCriterion("DOCNO >=", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLessThan(String value) {
            addCriterion("DOCNO <", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLessThanOrEqualTo(String value) {
            addCriterion("DOCNO <=", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLike(String value) {
            addCriterion("DOCNO like", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotLike(String value) {
            addCriterion("DOCNO not like", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoIn(List<String> values) {
            addCriterion("DOCNO in", values, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotIn(List<String> values) {
            addCriterion("DOCNO not in", values, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoBetween(String value1, String value2) {
            addCriterion("DOCNO between", value1, value2, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotBetween(String value1, String value2) {
            addCriterion("DOCNO not between", value1, value2, "docno");
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

        public Criteria andStatusIsNull() {
            addCriterion("STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatuseridIsNull() {
            addCriterion("STATUSERID is null");
            return (Criteria) this;
        }

        public Criteria andStatuseridIsNotNull() {
            addCriterion("STATUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andStatuseridEqualTo(Long value) {
            addCriterion("STATUSERID =", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridNotEqualTo(Long value) {
            addCriterion("STATUSERID <>", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridGreaterThan(Long value) {
            addCriterion("STATUSERID >", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("STATUSERID >=", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridLessThan(Long value) {
            addCriterion("STATUSERID <", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridLessThanOrEqualTo(Long value) {
            addCriterion("STATUSERID <=", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridIn(List<Long> values) {
            addCriterion("STATUSERID in", values, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridNotIn(List<Long> values) {
            addCriterion("STATUSERID not in", values, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridBetween(Long value1, Long value2) {
            addCriterion("STATUSERID between", value1, value2, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridNotBetween(Long value1, Long value2) {
            addCriterion("STATUSERID not between", value1, value2, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatustimeIsNull() {
            addCriterion("STATUSTIME is null");
            return (Criteria) this;
        }

        public Criteria andStatustimeIsNotNull() {
            addCriterion("STATUSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStatustimeEqualTo(Date value) {
            addCriterion("STATUSTIME =", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotEqualTo(Date value) {
            addCriterion("STATUSTIME <>", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeGreaterThan(Date value) {
            addCriterion("STATUSTIME >", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeGreaterThanOrEqualTo(Date value) {
            addCriterion("STATUSTIME >=", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeLessThan(Date value) {
            addCriterion("STATUSTIME <", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeLessThanOrEqualTo(Date value) {
            addCriterion("STATUSTIME <=", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeIn(List<Date> values) {
            addCriterion("STATUSTIME in", values, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotIn(List<Date> values) {
            addCriterion("STATUSTIME not in", values, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeBetween(Date value1, Date value2) {
            addCriterion("STATUSTIME between", value1, value2, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotBetween(Date value1, Date value2) {
            addCriterion("STATUSTIME not between", value1, value2, "statustime");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNull() {
            addCriterion("BEGINDATE is null");
            return (Criteria) this;
        }

        public Criteria andBegindateIsNotNull() {
            addCriterion("BEGINDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBegindateEqualTo(Integer value) {
            addCriterion("BEGINDATE =", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotEqualTo(Integer value) {
            addCriterion("BEGINDATE <>", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThan(Integer value) {
            addCriterion("BEGINDATE >", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateGreaterThanOrEqualTo(Integer value) {
            addCriterion("BEGINDATE >=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThan(Integer value) {
            addCriterion("BEGINDATE <", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateLessThanOrEqualTo(Integer value) {
            addCriterion("BEGINDATE <=", value, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateIn(List<Integer> values) {
            addCriterion("BEGINDATE in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotIn(List<Integer> values) {
            addCriterion("BEGINDATE not in", values, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateBetween(Integer value1, Integer value2) {
            addCriterion("BEGINDATE between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andBegindateNotBetween(Integer value1, Integer value2) {
            addCriterion("BEGINDATE not between", value1, value2, "begindate");
            return (Criteria) this;
        }

        public Criteria andClosedateIsNull() {
            addCriterion("CLOSEDATE is null");
            return (Criteria) this;
        }

        public Criteria andClosedateIsNotNull() {
            addCriterion("CLOSEDATE is not null");
            return (Criteria) this;
        }

        public Criteria andClosedateEqualTo(Integer value) {
            addCriterion("CLOSEDATE =", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateNotEqualTo(Integer value) {
            addCriterion("CLOSEDATE <>", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateGreaterThan(Integer value) {
            addCriterion("CLOSEDATE >", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateGreaterThanOrEqualTo(Integer value) {
            addCriterion("CLOSEDATE >=", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateLessThan(Integer value) {
            addCriterion("CLOSEDATE <", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateLessThanOrEqualTo(Integer value) {
            addCriterion("CLOSEDATE <=", value, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateIn(List<Integer> values) {
            addCriterion("CLOSEDATE in", values, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateNotIn(List<Integer> values) {
            addCriterion("CLOSEDATE not in", values, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateBetween(Integer value1, Integer value2) {
            addCriterion("CLOSEDATE between", value1, value2, "closedate");
            return (Criteria) this;
        }

        public Criteria andClosedateNotBetween(Integer value1, Integer value2) {
            addCriterion("CLOSEDATE not between", value1, value2, "closedate");
            return (Criteria) this;
        }

        public Criteria andGenerateDataIsNull() {
            addCriterion("GENERATE_DATA is null");
            return (Criteria) this;
        }

        public Criteria andGenerateDataIsNotNull() {
            addCriterion("GENERATE_DATA is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateDataEqualTo(String value) {
            addCriterion("GENERATE_DATA =", value, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataNotEqualTo(String value) {
            addCriterion("GENERATE_DATA <>", value, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataGreaterThan(String value) {
            addCriterion("GENERATE_DATA >", value, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataGreaterThanOrEqualTo(String value) {
            addCriterion("GENERATE_DATA >=", value, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataLessThan(String value) {
            addCriterion("GENERATE_DATA <", value, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataLessThanOrEqualTo(String value) {
            addCriterion("GENERATE_DATA <=", value, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataLike(String value) {
            addCriterion("GENERATE_DATA like", value, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataNotLike(String value) {
            addCriterion("GENERATE_DATA not like", value, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataIn(List<String> values) {
            addCriterion("GENERATE_DATA in", values, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataNotIn(List<String> values) {
            addCriterion("GENERATE_DATA not in", values, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataBetween(String value1, String value2) {
            addCriterion("GENERATE_DATA between", value1, value2, "generateData");
            return (Criteria) this;
        }

        public Criteria andGenerateDataNotBetween(String value1, String value2) {
            addCriterion("GENERATE_DATA not between", value1, value2, "generateData");
            return (Criteria) this;
        }

        public Criteria andSaletypeIsNull() {
            addCriterion("SALETYPE is null");
            return (Criteria) this;
        }

        public Criteria andSaletypeIsNotNull() {
            addCriterion("SALETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSaletypeEqualTo(String value) {
            addCriterion("SALETYPE =", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotEqualTo(String value) {
            addCriterion("SALETYPE <>", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeGreaterThan(String value) {
            addCriterion("SALETYPE >", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeGreaterThanOrEqualTo(String value) {
            addCriterion("SALETYPE >=", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLessThan(String value) {
            addCriterion("SALETYPE <", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLessThanOrEqualTo(String value) {
            addCriterion("SALETYPE <=", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeLike(String value) {
            addCriterion("SALETYPE like", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotLike(String value) {
            addCriterion("SALETYPE not like", value, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeIn(List<String> values) {
            addCriterion("SALETYPE in", values, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotIn(List<String> values) {
            addCriterion("SALETYPE not in", values, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeBetween(String value1, String value2) {
            addCriterion("SALETYPE between", value1, value2, "saletype");
            return (Criteria) this;
        }

        public Criteria andSaletypeNotBetween(String value1, String value2) {
            addCriterion("SALETYPE not between", value1, value2, "saletype");
            return (Criteria) this;
        }

        public Criteria andSqltypeIsNull() {
            addCriterion("SQLTYPE is null");
            return (Criteria) this;
        }

        public Criteria andSqltypeIsNotNull() {
            addCriterion("SQLTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSqltypeEqualTo(String value) {
            addCriterion("SQLTYPE =", value, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeNotEqualTo(String value) {
            addCriterion("SQLTYPE <>", value, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeGreaterThan(String value) {
            addCriterion("SQLTYPE >", value, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeGreaterThanOrEqualTo(String value) {
            addCriterion("SQLTYPE >=", value, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeLessThan(String value) {
            addCriterion("SQLTYPE <", value, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeLessThanOrEqualTo(String value) {
            addCriterion("SQLTYPE <=", value, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeLike(String value) {
            addCriterion("SQLTYPE like", value, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeNotLike(String value) {
            addCriterion("SQLTYPE not like", value, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeIn(List<String> values) {
            addCriterion("SQLTYPE in", values, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeNotIn(List<String> values) {
            addCriterion("SQLTYPE not in", values, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeBetween(String value1, String value2) {
            addCriterion("SQLTYPE between", value1, value2, "sqltype");
            return (Criteria) this;
        }

        public Criteria andSqltypeNotBetween(String value1, String value2) {
            addCriterion("SQLTYPE not between", value1, value2, "sqltype");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNull() {
            addCriterion("DISCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIsNotNull() {
            addCriterion("DISCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeEqualTo(String value) {
            addCriterion("DISCOUNT_TYPE =", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotEqualTo(String value) {
            addCriterion("DISCOUNT_TYPE <>", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThan(String value) {
            addCriterion("DISCOUNT_TYPE >", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_TYPE >=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThan(String value) {
            addCriterion("DISCOUNT_TYPE <", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLessThanOrEqualTo(String value) {
            addCriterion("DISCOUNT_TYPE <=", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeLike(String value) {
            addCriterion("DISCOUNT_TYPE like", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotLike(String value) {
            addCriterion("DISCOUNT_TYPE not like", value, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeIn(List<String> values) {
            addCriterion("DISCOUNT_TYPE in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotIn(List<String> values) {
            addCriterion("DISCOUNT_TYPE not in", values, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeBetween(String value1, String value2) {
            addCriterion("DISCOUNT_TYPE between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andDiscountTypeNotBetween(String value1, String value2) {
            addCriterion("DISCOUNT_TYPE not between", value1, value2, "discountType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIsNull() {
            addCriterion("ACTIVE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIsNotNull() {
            addCriterion("ACTIVE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andActiveTypeEqualTo(String value) {
            addCriterion("ACTIVE_TYPE =", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotEqualTo(String value) {
            addCriterion("ACTIVE_TYPE <>", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeGreaterThan(String value) {
            addCriterion("ACTIVE_TYPE >", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeGreaterThanOrEqualTo(String value) {
            addCriterion("ACTIVE_TYPE >=", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeLessThan(String value) {
            addCriterion("ACTIVE_TYPE <", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeLessThanOrEqualTo(String value) {
            addCriterion("ACTIVE_TYPE <=", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeLike(String value) {
            addCriterion("ACTIVE_TYPE like", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotLike(String value) {
            addCriterion("ACTIVE_TYPE not like", value, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeIn(List<String> values) {
            addCriterion("ACTIVE_TYPE in", values, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotIn(List<String> values) {
            addCriterion("ACTIVE_TYPE not in", values, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeBetween(String value1, String value2) {
            addCriterion("ACTIVE_TYPE between", value1, value2, "activeType");
            return (Criteria) this;
        }

        public Criteria andActiveTypeNotBetween(String value1, String value2) {
            addCriterion("ACTIVE_TYPE not between", value1, value2, "activeType");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNT >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("DISCOUNT <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNT <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNT not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNT not between", value1, value2, "discount");
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

        public Criteria andCSaledistypeIdIsNull() {
            addCriterion("C_SALEDISTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdIsNotNull() {
            addCriterion("C_SALEDISTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdEqualTo(Long value) {
            addCriterion("C_SALEDISTYPE_ID =", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdNotEqualTo(Long value) {
            addCriterion("C_SALEDISTYPE_ID <>", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdGreaterThan(Long value) {
            addCriterion("C_SALEDISTYPE_ID >", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_SALEDISTYPE_ID >=", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdLessThan(Long value) {
            addCriterion("C_SALEDISTYPE_ID <", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdLessThanOrEqualTo(Long value) {
            addCriterion("C_SALEDISTYPE_ID <=", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdIn(List<Long> values) {
            addCriterion("C_SALEDISTYPE_ID in", values, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdNotIn(List<Long> values) {
            addCriterion("C_SALEDISTYPE_ID not in", values, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdBetween(Long value1, Long value2) {
            addCriterion("C_SALEDISTYPE_ID between", value1, value2, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdNotBetween(Long value1, Long value2) {
            addCriterion("C_SALEDISTYPE_ID not between", value1, value2, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeIsNull() {
            addCriterion("DIS_DT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeIsNotNull() {
            addCriterion("DIS_DT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeEqualTo(String value) {
            addCriterion("DIS_DT_TYPE =", value, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeNotEqualTo(String value) {
            addCriterion("DIS_DT_TYPE <>", value, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeGreaterThan(String value) {
            addCriterion("DIS_DT_TYPE >", value, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeGreaterThanOrEqualTo(String value) {
            addCriterion("DIS_DT_TYPE >=", value, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeLessThan(String value) {
            addCriterion("DIS_DT_TYPE <", value, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeLessThanOrEqualTo(String value) {
            addCriterion("DIS_DT_TYPE <=", value, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeLike(String value) {
            addCriterion("DIS_DT_TYPE like", value, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeNotLike(String value) {
            addCriterion("DIS_DT_TYPE not like", value, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeIn(List<String> values) {
            addCriterion("DIS_DT_TYPE in", values, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeNotIn(List<String> values) {
            addCriterion("DIS_DT_TYPE not in", values, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeBetween(String value1, String value2) {
            addCriterion("DIS_DT_TYPE between", value1, value2, "disDtType");
            return (Criteria) this;
        }

        public Criteria andDisDtTypeNotBetween(String value1, String value2) {
            addCriterion("DIS_DT_TYPE not between", value1, value2, "disDtType");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdIsNull() {
            addCriterion("C_CUSTOMER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdIsNotNull() {
            addCriterion("C_CUSTOMER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdEqualTo(Long value) {
            addCriterion("C_CUSTOMER_ID =", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotEqualTo(Long value) {
            addCriterion("C_CUSTOMER_ID <>", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdGreaterThan(Long value) {
            addCriterion("C_CUSTOMER_ID >", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_CUSTOMER_ID >=", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdLessThan(Long value) {
            addCriterion("C_CUSTOMER_ID <", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdLessThanOrEqualTo(Long value) {
            addCriterion("C_CUSTOMER_ID <=", value, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdIn(List<Long> values) {
            addCriterion("C_CUSTOMER_ID in", values, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotIn(List<Long> values) {
            addCriterion("C_CUSTOMER_ID not in", values, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdBetween(Long value1, Long value2) {
            addCriterion("C_CUSTOMER_ID between", value1, value2, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCCustomerIdNotBetween(Long value1, Long value2) {
            addCriterion("C_CUSTOMER_ID not between", value1, value2, "cCustomerId");
            return (Criteria) this;
        }

        public Criteria andCloseStatusIsNull() {
            addCriterion("CLOSE_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andCloseStatusIsNotNull() {
            addCriterion("CLOSE_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andCloseStatusEqualTo(Short value) {
            addCriterion("CLOSE_STATUS =", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusNotEqualTo(Short value) {
            addCriterion("CLOSE_STATUS <>", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusGreaterThan(Short value) {
            addCriterion("CLOSE_STATUS >", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("CLOSE_STATUS >=", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusLessThan(Short value) {
            addCriterion("CLOSE_STATUS <", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusLessThanOrEqualTo(Short value) {
            addCriterion("CLOSE_STATUS <=", value, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusIn(List<Short> values) {
            addCriterion("CLOSE_STATUS in", values, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusNotIn(List<Short> values) {
            addCriterion("CLOSE_STATUS not in", values, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusBetween(Short value1, Short value2) {
            addCriterion("CLOSE_STATUS between", value1, value2, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseStatusNotBetween(Short value1, Short value2) {
            addCriterion("CLOSE_STATUS not between", value1, value2, "closeStatus");
            return (Criteria) this;
        }

        public Criteria andCloseridIsNull() {
            addCriterion("CLOSERID is null");
            return (Criteria) this;
        }

        public Criteria andCloseridIsNotNull() {
            addCriterion("CLOSERID is not null");
            return (Criteria) this;
        }

        public Criteria andCloseridEqualTo(Long value) {
            addCriterion("CLOSERID =", value, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridNotEqualTo(Long value) {
            addCriterion("CLOSERID <>", value, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridGreaterThan(Long value) {
            addCriterion("CLOSERID >", value, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridGreaterThanOrEqualTo(Long value) {
            addCriterion("CLOSERID >=", value, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridLessThan(Long value) {
            addCriterion("CLOSERID <", value, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridLessThanOrEqualTo(Long value) {
            addCriterion("CLOSERID <=", value, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridIn(List<Long> values) {
            addCriterion("CLOSERID in", values, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridNotIn(List<Long> values) {
            addCriterion("CLOSERID not in", values, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridBetween(Long value1, Long value2) {
            addCriterion("CLOSERID between", value1, value2, "closerid");
            return (Criteria) this;
        }

        public Criteria andCloseridNotBetween(Long value1, Long value2) {
            addCriterion("CLOSERID not between", value1, value2, "closerid");
            return (Criteria) this;
        }

        public Criteria andClosetimeIsNull() {
            addCriterion("CLOSETIME is null");
            return (Criteria) this;
        }

        public Criteria andClosetimeIsNotNull() {
            addCriterion("CLOSETIME is not null");
            return (Criteria) this;
        }

        public Criteria andClosetimeEqualTo(Date value) {
            addCriterion("CLOSETIME =", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotEqualTo(Date value) {
            addCriterion("CLOSETIME <>", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeGreaterThan(Date value) {
            addCriterion("CLOSETIME >", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("CLOSETIME >=", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeLessThan(Date value) {
            addCriterion("CLOSETIME <", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeLessThanOrEqualTo(Date value) {
            addCriterion("CLOSETIME <=", value, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeIn(List<Date> values) {
            addCriterion("CLOSETIME in", values, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotIn(List<Date> values) {
            addCriterion("CLOSETIME not in", values, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeBetween(Date value1, Date value2) {
            addCriterion("CLOSETIME between", value1, value2, "closetime");
            return (Criteria) this;
        }

        public Criteria andClosetimeNotBetween(Date value1, Date value2) {
            addCriterion("CLOSETIME not between", value1, value2, "closetime");
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

        public Criteria andBBathslpriceadjIdIsNull() {
            addCriterion("B_BATHSLPRICEADJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdIsNotNull() {
            addCriterion("B_BATHSLPRICEADJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdEqualTo(Long value) {
            addCriterion("B_BATHSLPRICEADJ_ID =", value, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdNotEqualTo(Long value) {
            addCriterion("B_BATHSLPRICEADJ_ID <>", value, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdGreaterThan(Long value) {
            addCriterion("B_BATHSLPRICEADJ_ID >", value, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdGreaterThanOrEqualTo(Long value) {
            addCriterion("B_BATHSLPRICEADJ_ID >=", value, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdLessThan(Long value) {
            addCriterion("B_BATHSLPRICEADJ_ID <", value, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdLessThanOrEqualTo(Long value) {
            addCriterion("B_BATHSLPRICEADJ_ID <=", value, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdIn(List<Long> values) {
            addCriterion("B_BATHSLPRICEADJ_ID in", values, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdNotIn(List<Long> values) {
            addCriterion("B_BATHSLPRICEADJ_ID not in", values, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdBetween(Long value1, Long value2) {
            addCriterion("B_BATHSLPRICEADJ_ID between", value1, value2, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBBathslpriceadjIdNotBetween(Long value1, Long value2) {
            addCriterion("B_BATHSLPRICEADJ_ID not between", value1, value2, "bBathslpriceadjId");
            return (Criteria) this;
        }

        public Criteria andSalewaysIsNull() {
            addCriterion("SALEWAYS is null");
            return (Criteria) this;
        }

        public Criteria andSalewaysIsNotNull() {
            addCriterion("SALEWAYS is not null");
            return (Criteria) this;
        }

        public Criteria andSalewaysEqualTo(Short value) {
            addCriterion("SALEWAYS =", value, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysNotEqualTo(Short value) {
            addCriterion("SALEWAYS <>", value, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysGreaterThan(Short value) {
            addCriterion("SALEWAYS >", value, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysGreaterThanOrEqualTo(Short value) {
            addCriterion("SALEWAYS >=", value, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysLessThan(Short value) {
            addCriterion("SALEWAYS <", value, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysLessThanOrEqualTo(Short value) {
            addCriterion("SALEWAYS <=", value, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysIn(List<Short> values) {
            addCriterion("SALEWAYS in", values, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysNotIn(List<Short> values) {
            addCriterion("SALEWAYS not in", values, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysBetween(Short value1, Short value2) {
            addCriterion("SALEWAYS between", value1, value2, "saleways");
            return (Criteria) this;
        }

        public Criteria andSalewaysNotBetween(Short value1, Short value2) {
            addCriterion("SALEWAYS not between", value1, value2, "saleways");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNull() {
            addCriterion("BILLDATE is null");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNotNull() {
            addCriterion("BILLDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBilldateEqualTo(Integer value) {
            addCriterion("BILLDATE =", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotEqualTo(Integer value) {
            addCriterion("BILLDATE <>", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThan(Integer value) {
            addCriterion("BILLDATE >", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThanOrEqualTo(Integer value) {
            addCriterion("BILLDATE >=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThan(Integer value) {
            addCriterion("BILLDATE <", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateLessThanOrEqualTo(Integer value) {
            addCriterion("BILLDATE <=", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateIn(List<Integer> values) {
            addCriterion("BILLDATE in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotIn(List<Integer> values) {
            addCriterion("BILLDATE not in", values, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateBetween(Integer value1, Integer value2) {
            addCriterion("BILLDATE between", value1, value2, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotBetween(Integer value1, Integer value2) {
            addCriterion("BILLDATE not between", value1, value2, "billdate");
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