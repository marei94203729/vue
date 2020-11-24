package com.cros.vue.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SlpriceadjpdtItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SlpriceadjpdtItemExample() {
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

        public Criteria andBSlpriceadjIdIsNull() {
            addCriterion("B_SLPRICEADJ_ID is null");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdIsNotNull() {
            addCriterion("B_SLPRICEADJ_ID is not null");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdEqualTo(Long value) {
            addCriterion("B_SLPRICEADJ_ID =", value, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdNotEqualTo(Long value) {
            addCriterion("B_SLPRICEADJ_ID <>", value, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdGreaterThan(Long value) {
            addCriterion("B_SLPRICEADJ_ID >", value, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdGreaterThanOrEqualTo(Long value) {
            addCriterion("B_SLPRICEADJ_ID >=", value, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdLessThan(Long value) {
            addCriterion("B_SLPRICEADJ_ID <", value, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdLessThanOrEqualTo(Long value) {
            addCriterion("B_SLPRICEADJ_ID <=", value, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdIn(List<Long> values) {
            addCriterion("B_SLPRICEADJ_ID in", values, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdNotIn(List<Long> values) {
            addCriterion("B_SLPRICEADJ_ID not in", values, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdBetween(Long value1, Long value2) {
            addCriterion("B_SLPRICEADJ_ID between", value1, value2, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andBSlpriceadjIdNotBetween(Long value1, Long value2) {
            addCriterion("B_SLPRICEADJ_ID not between", value1, value2, "bSlpriceadjId");
            return (Criteria) this;
        }

        public Criteria andMProductIdIsNull() {
            addCriterion("M_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMProductIdIsNotNull() {
            addCriterion("M_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMProductIdEqualTo(Long value) {
            addCriterion("M_PRODUCT_ID =", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotEqualTo(Long value) {
            addCriterion("M_PRODUCT_ID <>", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdGreaterThan(Long value) {
            addCriterion("M_PRODUCT_ID >", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("M_PRODUCT_ID >=", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdLessThan(Long value) {
            addCriterion("M_PRODUCT_ID <", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdLessThanOrEqualTo(Long value) {
            addCriterion("M_PRODUCT_ID <=", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdIn(List<Long> values) {
            addCriterion("M_PRODUCT_ID in", values, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotIn(List<Long> values) {
            addCriterion("M_PRODUCT_ID not in", values, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdBetween(Long value1, Long value2) {
            addCriterion("M_PRODUCT_ID between", value1, value2, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotBetween(Long value1, Long value2) {
            addCriterion("M_PRODUCT_ID not between", value1, value2, "mProductId");
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

        public Criteria andFirpriceIsNull() {
            addCriterion("FIRPRICE is null");
            return (Criteria) this;
        }

        public Criteria andFirpriceIsNotNull() {
            addCriterion("FIRPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andFirpriceEqualTo(BigDecimal value) {
            addCriterion("FIRPRICE =", value, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceNotEqualTo(BigDecimal value) {
            addCriterion("FIRPRICE <>", value, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceGreaterThan(BigDecimal value) {
            addCriterion("FIRPRICE >", value, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRPRICE >=", value, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceLessThan(BigDecimal value) {
            addCriterion("FIRPRICE <", value, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("FIRPRICE <=", value, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceIn(List<BigDecimal> values) {
            addCriterion("FIRPRICE in", values, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceNotIn(List<BigDecimal> values) {
            addCriterion("FIRPRICE not in", values, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRPRICE between", value1, value2, "firprice");
            return (Criteria) this;
        }

        public Criteria andFirpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("FIRPRICE not between", value1, value2, "firprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNull() {
            addCriterion("SPRICE is null");
            return (Criteria) this;
        }

        public Criteria andSpriceIsNotNull() {
            addCriterion("SPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSpriceEqualTo(BigDecimal value) {
            addCriterion("SPRICE =", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotEqualTo(BigDecimal value) {
            addCriterion("SPRICE <>", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThan(BigDecimal value) {
            addCriterion("SPRICE >", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SPRICE >=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThan(BigDecimal value) {
            addCriterion("SPRICE <", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SPRICE <=", value, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceIn(List<BigDecimal> values) {
            addCriterion("SPRICE in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotIn(List<BigDecimal> values) {
            addCriterion("SPRICE not in", values, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPRICE between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SPRICE not between", value1, value2, "sprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceIsNull() {
            addCriterion("SRPRICE is null");
            return (Criteria) this;
        }

        public Criteria andSrpriceIsNotNull() {
            addCriterion("SRPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andSrpriceEqualTo(BigDecimal value) {
            addCriterion("SRPRICE =", value, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceNotEqualTo(BigDecimal value) {
            addCriterion("SRPRICE <>", value, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceGreaterThan(BigDecimal value) {
            addCriterion("SRPRICE >", value, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("SRPRICE >=", value, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceLessThan(BigDecimal value) {
            addCriterion("SRPRICE <", value, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("SRPRICE <=", value, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceIn(List<BigDecimal> values) {
            addCriterion("SRPRICE in", values, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceNotIn(List<BigDecimal> values) {
            addCriterion("SRPRICE not in", values, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SRPRICE between", value1, value2, "srprice");
            return (Criteria) this;
        }

        public Criteria andSrpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("SRPRICE not between", value1, value2, "srprice");
            return (Criteria) this;
        }

        public Criteria andPricelistIsNull() {
            addCriterion("PRICELIST is null");
            return (Criteria) this;
        }

        public Criteria andPricelistIsNotNull() {
            addCriterion("PRICELIST is not null");
            return (Criteria) this;
        }

        public Criteria andPricelistEqualTo(BigDecimal value) {
            addCriterion("PRICELIST =", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistNotEqualTo(BigDecimal value) {
            addCriterion("PRICELIST <>", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistGreaterThan(BigDecimal value) {
            addCriterion("PRICELIST >", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICELIST >=", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistLessThan(BigDecimal value) {
            addCriterion("PRICELIST <", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICELIST <=", value, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistIn(List<BigDecimal> values) {
            addCriterion("PRICELIST in", values, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistNotIn(List<BigDecimal> values) {
            addCriterion("PRICELIST not in", values, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICELIST between", value1, value2, "pricelist");
            return (Criteria) this;
        }

        public Criteria andPricelistNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICELIST not between", value1, value2, "pricelist");
            return (Criteria) this;
        }

        public Criteria andNowpriceIsNull() {
            addCriterion("NOWPRICE is null");
            return (Criteria) this;
        }

        public Criteria andNowpriceIsNotNull() {
            addCriterion("NOWPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNowpriceEqualTo(BigDecimal value) {
            addCriterion("NOWPRICE =", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceNotEqualTo(BigDecimal value) {
            addCriterion("NOWPRICE <>", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceGreaterThan(BigDecimal value) {
            addCriterion("NOWPRICE >", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NOWPRICE >=", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceLessThan(BigDecimal value) {
            addCriterion("NOWPRICE <", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NOWPRICE <=", value, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceIn(List<BigDecimal> values) {
            addCriterion("NOWPRICE in", values, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceNotIn(List<BigDecimal> values) {
            addCriterion("NOWPRICE not in", values, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOWPRICE between", value1, value2, "nowprice");
            return (Criteria) this;
        }

        public Criteria andNowpriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NOWPRICE not between", value1, value2, "nowprice");
            return (Criteria) this;
        }

        public Criteria andIsfreeIsNull() {
            addCriterion("ISFREE is null");
            return (Criteria) this;
        }

        public Criteria andIsfreeIsNotNull() {
            addCriterion("ISFREE is not null");
            return (Criteria) this;
        }

        public Criteria andIsfreeEqualTo(String value) {
            addCriterion("ISFREE =", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotEqualTo(String value) {
            addCriterion("ISFREE <>", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThan(String value) {
            addCriterion("ISFREE >", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeGreaterThanOrEqualTo(String value) {
            addCriterion("ISFREE >=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThan(String value) {
            addCriterion("ISFREE <", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLessThanOrEqualTo(String value) {
            addCriterion("ISFREE <=", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeLike(String value) {
            addCriterion("ISFREE like", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotLike(String value) {
            addCriterion("ISFREE not like", value, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeIn(List<String> values) {
            addCriterion("ISFREE in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotIn(List<String> values) {
            addCriterion("ISFREE not in", values, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeBetween(String value1, String value2) {
            addCriterion("ISFREE between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsfreeNotBetween(String value1, String value2) {
            addCriterion("ISFREE not between", value1, value2, "isfree");
            return (Criteria) this;
        }

        public Criteria andIsagtIsNull() {
            addCriterion("ISAGT is null");
            return (Criteria) this;
        }

        public Criteria andIsagtIsNotNull() {
            addCriterion("ISAGT is not null");
            return (Criteria) this;
        }

        public Criteria andIsagtEqualTo(String value) {
            addCriterion("ISAGT =", value, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtNotEqualTo(String value) {
            addCriterion("ISAGT <>", value, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtGreaterThan(String value) {
            addCriterion("ISAGT >", value, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtGreaterThanOrEqualTo(String value) {
            addCriterion("ISAGT >=", value, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtLessThan(String value) {
            addCriterion("ISAGT <", value, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtLessThanOrEqualTo(String value) {
            addCriterion("ISAGT <=", value, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtLike(String value) {
            addCriterion("ISAGT like", value, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtNotLike(String value) {
            addCriterion("ISAGT not like", value, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtIn(List<String> values) {
            addCriterion("ISAGT in", values, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtNotIn(List<String> values) {
            addCriterion("ISAGT not in", values, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtBetween(String value1, String value2) {
            addCriterion("ISAGT between", value1, value2, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsagtNotBetween(String value1, String value2) {
            addCriterion("ISAGT not between", value1, value2, "isagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtIsNull() {
            addCriterion("ISDISAGT is null");
            return (Criteria) this;
        }

        public Criteria andIsdisagtIsNotNull() {
            addCriterion("ISDISAGT is not null");
            return (Criteria) this;
        }

        public Criteria andMProductCodeEqualTo(String value) {
            addCriterion("t2.name =", value, "mProductCode");
            return (Criteria) this;
        }

        public Criteria andIsdisagtNotEqualTo(String value) {
            addCriterion("ISDISAGT <>", value, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtGreaterThan(String value) {
            addCriterion("ISDISAGT >", value, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtGreaterThanOrEqualTo(String value) {
            addCriterion("ISDISAGT >=", value, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtLessThan(String value) {
            addCriterion("ISDISAGT <", value, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtLessThanOrEqualTo(String value) {
            addCriterion("ISDISAGT <=", value, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andMProductCodeLike(String value) {
            addCriterion("t2.name like", value, "mProductCode");
            return (Criteria) this;
        }

        public Criteria andIsdisagtNotLike(String value) {
            addCriterion("ISDISAGT not like", value, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtIn(List<String> values) {
            addCriterion("ISDISAGT in", values, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtNotIn(List<String> values) {
            addCriterion("ISDISAGT not in", values, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtBetween(String value1, String value2) {
            addCriterion("ISDISAGT between", value1, value2, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andIsdisagtNotBetween(String value1, String value2) {
            addCriterion("ISDISAGT not between", value1, value2, "isdisagt");
            return (Criteria) this;
        }

        public Criteria andPricedisIsNull() {
            addCriterion("PRICEDIS is null");
            return (Criteria) this;
        }

        public Criteria andPricedisIsNotNull() {
            addCriterion("PRICEDIS is not null");
            return (Criteria) this;
        }

        public Criteria andPricedisEqualTo(BigDecimal value) {
            addCriterion("PRICEDIS =", value, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisNotEqualTo(BigDecimal value) {
            addCriterion("PRICEDIS <>", value, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisGreaterThan(BigDecimal value) {
            addCriterion("PRICEDIS >", value, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEDIS >=", value, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisLessThan(BigDecimal value) {
            addCriterion("PRICEDIS <", value, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEDIS <=", value, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisIn(List<BigDecimal> values) {
            addCriterion("PRICEDIS in", values, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisNotIn(List<BigDecimal> values) {
            addCriterion("PRICEDIS not in", values, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEDIS between", value1, value2, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPricedisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEDIS not between", value1, value2, "pricedis");
            return (Criteria) this;
        }

        public Criteria andPriceactualIsNull() {
            addCriterion("PRICEACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andPriceactualIsNotNull() {
            addCriterion("PRICEACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andPriceactualEqualTo(BigDecimal value) {
            addCriterion("PRICEACTUAL =", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotEqualTo(BigDecimal value) {
            addCriterion("PRICEACTUAL <>", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualGreaterThan(BigDecimal value) {
            addCriterion("PRICEACTUAL >", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEACTUAL >=", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualLessThan(BigDecimal value) {
            addCriterion("PRICEACTUAL <", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("PRICEACTUAL <=", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualIn(List<BigDecimal> values) {
            addCriterion("PRICEACTUAL in", values, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotIn(List<BigDecimal> values) {
            addCriterion("PRICEACTUAL not in", values, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEACTUAL between", value1, value2, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("PRICEACTUAL not between", value1, value2, "priceactual");
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