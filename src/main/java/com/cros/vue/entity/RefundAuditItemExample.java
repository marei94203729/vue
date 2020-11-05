package com.cros.vue.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundAuditItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundAuditItemExample() {
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
            addCriterion("t1.ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("t1.ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Short value) {
            addCriterion("t1.ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Short value) {
            addCriterion("t1.ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Short value) {
            addCriterion("t1.ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Short value) {
            addCriterion("t1.ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Short value) {
            addCriterion("t1.ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Short> values) {
            addCriterion("t1.ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Short> values) {
            addCriterion("t1.ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Short value1, Short value2) {
            addCriterion("t1.ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Short value1, Short value2) {
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

        public Criteria andShownameIsNull() {
            addCriterion("t1.SHOWNAME is null");
            return (Criteria) this;
        }

        public Criteria andShownameIsNotNull() {
            addCriterion("t1.SHOWNAME is not null");
            return (Criteria) this;
        }

        public Criteria andShownameEqualTo(String value) {
            addCriterion("t1.SHOWNAME =", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotEqualTo(String value) {
            addCriterion("t1.SHOWNAME <>", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThan(String value) {
            addCriterion("t1.SHOWNAME >", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameGreaterThanOrEqualTo(String value) {
            addCriterion("t1.SHOWNAME >=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThan(String value) {
            addCriterion("t1.SHOWNAME <", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLessThanOrEqualTo(String value) {
            addCriterion("t1.SHOWNAME <=", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameLike(String value) {
            addCriterion("t1.SHOWNAME like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotLike(String value) {
            addCriterion("t1.SHOWNAME not like", value, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameIn(List<String> values) {
            addCriterion("t1.SHOWNAME in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotIn(List<String> values) {
            addCriterion("t1.SHOWNAME not in", values, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameBetween(String value1, String value2) {
            addCriterion("t1.SHOWNAME between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andShownameNotBetween(String value1, String value2) {
            addCriterion("t1.SHOWNAME not between", value1, value2, "showname");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdIsNull() {
            addCriterion("t1.M_RET_SALE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdIsNotNull() {
            addCriterion("t1.M_RET_SALE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdEqualTo(Long value) {
            addCriterion("t1.M_RET_SALE_ID =", value, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdNotEqualTo(Long value) {
            addCriterion("t1.M_RET_SALE_ID <>", value, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdGreaterThan(Long value) {
            addCriterion("t1.M_RET_SALE_ID >", value, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.M_RET_SALE_ID >=", value, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdLessThan(Long value) {
            addCriterion("t1.M_RET_SALE_ID <", value, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.M_RET_SALE_ID <=", value, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdIn(List<Long> values) {
            addCriterion("t1.M_RET_SALE_ID in", values, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdNotIn(List<Long> values) {
            addCriterion("t1.M_RET_SALE_ID not in", values, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdBetween(Long value1, Long value2) {
            addCriterion("t1.M_RET_SALE_ID between", value1, value2, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMRetSaleIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.M_RET_SALE_ID not between", value1, value2, "mRetSaleId");
            return (Criteria) this;
        }

        public Criteria andMProductIdIsNull() {
            addCriterion("t1.M_PRODUCT_ID is null");
            return (Criteria) this;
        }

        public Criteria andMProductIdIsNotNull() {
            addCriterion("t1.M_PRODUCT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMProductIdEqualTo(Long value) {
            addCriterion("t1.M_PRODUCT_ID =", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotEqualTo(Long value) {
            addCriterion("t1.M_PRODUCT_ID <>", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdGreaterThan(Long value) {
            addCriterion("t1.M_PRODUCT_ID >", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.M_PRODUCT_ID >=", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdLessThan(Long value) {
            addCriterion("t1.M_PRODUCT_ID <", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.M_PRODUCT_ID <=", value, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdIn(List<Long> values) {
            addCriterion("t1.M_PRODUCT_ID in", values, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotIn(List<Long> values) {
            addCriterion("t1.M_PRODUCT_ID not in", values, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdBetween(Long value1, Long value2) {
            addCriterion("t1.M_PRODUCT_ID between", value1, value2, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProductIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.M_PRODUCT_ID not between", value1, value2, "mProductId");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdIsNull() {
            addCriterion("t1.M_PRODUCT2_ID is null");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdIsNotNull() {
            addCriterion("t1.M_PRODUCT2_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdEqualTo(Short value) {
            addCriterion("t1.M_PRODUCT2_ID =", value, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdNotEqualTo(Short value) {
            addCriterion("t1.M_PRODUCT2_ID <>", value, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdGreaterThan(Short value) {
            addCriterion("t1.M_PRODUCT2_ID >", value, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.M_PRODUCT2_ID >=", value, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdLessThan(Short value) {
            addCriterion("t1.M_PRODUCT2_ID <", value, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdLessThanOrEqualTo(Short value) {
            addCriterion("t1.M_PRODUCT2_ID <=", value, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdIn(List<Short> values) {
            addCriterion("t1.M_PRODUCT2_ID in", values, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdNotIn(List<Short> values) {
            addCriterion("t1.M_PRODUCT2_ID not in", values, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdBetween(Short value1, Short value2) {
            addCriterion("t1.M_PRODUCT2_ID between", value1, value2, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMProduct2IdNotBetween(Short value1, Short value2) {
            addCriterion("t1.M_PRODUCT2_ID not between", value1, value2, "mProduct2Id");
            return (Criteria) this;
        }

        public Criteria andMx1IsNull() {
            addCriterion("t1.MX1 is null");
            return (Criteria) this;
        }

        public Criteria andMx1IsNotNull() {
            addCriterion("t1.MX1 is not null");
            return (Criteria) this;
        }

        public Criteria andMx1EqualTo(Short value) {
            addCriterion("t1.MX1 =", value, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1NotEqualTo(Short value) {
            addCriterion("t1.MX1 <>", value, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1GreaterThan(Short value) {
            addCriterion("t1.MX1 >", value, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX1 >=", value, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1LessThan(Short value) {
            addCriterion("t1.MX1 <", value, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX1 <=", value, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1In(List<Short> values) {
            addCriterion("t1.MX1 in", values, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1NotIn(List<Short> values) {
            addCriterion("t1.MX1 not in", values, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1Between(Short value1, Short value2) {
            addCriterion("t1.MX1 between", value1, value2, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx1NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX1 not between", value1, value2, "mx1");
            return (Criteria) this;
        }

        public Criteria andMx2IsNull() {
            addCriterion("t1.MX2 is null");
            return (Criteria) this;
        }

        public Criteria andMx2IsNotNull() {
            addCriterion("t1.MX2 is not null");
            return (Criteria) this;
        }

        public Criteria andMx2EqualTo(Short value) {
            addCriterion("t1.MX2 =", value, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2NotEqualTo(Short value) {
            addCriterion("t1.MX2 <>", value, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2GreaterThan(Short value) {
            addCriterion("t1.MX2 >", value, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX2 >=", value, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2LessThan(Short value) {
            addCriterion("t1.MX2 <", value, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX2 <=", value, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2In(List<Short> values) {
            addCriterion("t1.MX2 in", values, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2NotIn(List<Short> values) {
            addCriterion("t1.MX2 not in", values, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2Between(Short value1, Short value2) {
            addCriterion("t1.MX2 between", value1, value2, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx2NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX2 not between", value1, value2, "mx2");
            return (Criteria) this;
        }

        public Criteria andMx3IsNull() {
            addCriterion("t1.MX3 is null");
            return (Criteria) this;
        }

        public Criteria andMx3IsNotNull() {
            addCriterion("t1.MX3 is not null");
            return (Criteria) this;
        }

        public Criteria andMx3EqualTo(Short value) {
            addCriterion("t1.MX3 =", value, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3NotEqualTo(Short value) {
            addCriterion("t1.MX3 <>", value, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3GreaterThan(Short value) {
            addCriterion("t1.MX3 >", value, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX3 >=", value, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3LessThan(Short value) {
            addCriterion("t1.MX3 <", value, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX3 <=", value, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3In(List<Short> values) {
            addCriterion("t1.MX3 in", values, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3NotIn(List<Short> values) {
            addCriterion("t1.MX3 not in", values, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3Between(Short value1, Short value2) {
            addCriterion("t1.MX3 between", value1, value2, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx3NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX3 not between", value1, value2, "mx3");
            return (Criteria) this;
        }

        public Criteria andMx4IsNull() {
            addCriterion("t1.MX4 is null");
            return (Criteria) this;
        }

        public Criteria andMx4IsNotNull() {
            addCriterion("t1.MX4 is not null");
            return (Criteria) this;
        }

        public Criteria andMx4EqualTo(Short value) {
            addCriterion("t1.MX4 =", value, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4NotEqualTo(Short value) {
            addCriterion("t1.MX4 <>", value, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4GreaterThan(Short value) {
            addCriterion("t1.MX4 >", value, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX4 >=", value, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4LessThan(Short value) {
            addCriterion("t1.MX4 <", value, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX4 <=", value, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4In(List<Short> values) {
            addCriterion("t1.MX4 in", values, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4NotIn(List<Short> values) {
            addCriterion("t1.MX4 not in", values, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4Between(Short value1, Short value2) {
            addCriterion("t1.MX4 between", value1, value2, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx4NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX4 not between", value1, value2, "mx4");
            return (Criteria) this;
        }

        public Criteria andMx5IsNull() {
            addCriterion("t1.MX5 is null");
            return (Criteria) this;
        }

        public Criteria andMx5IsNotNull() {
            addCriterion("t1.MX5 is not null");
            return (Criteria) this;
        }

        public Criteria andMx5EqualTo(Short value) {
            addCriterion("t1.MX5 =", value, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5NotEqualTo(Short value) {
            addCriterion("t1.MX5 <>", value, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5GreaterThan(Short value) {
            addCriterion("t1.MX5 >", value, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX5 >=", value, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5LessThan(Short value) {
            addCriterion("t1.MX5 <", value, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX5 <=", value, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5In(List<Short> values) {
            addCriterion("t1.MX5 in", values, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5NotIn(List<Short> values) {
            addCriterion("t1.MX5 not in", values, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5Between(Short value1, Short value2) {
            addCriterion("t1.MX5 between", value1, value2, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx5NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX5 not between", value1, value2, "mx5");
            return (Criteria) this;
        }

        public Criteria andMx6IsNull() {
            addCriterion("t1.MX6 is null");
            return (Criteria) this;
        }

        public Criteria andMx6IsNotNull() {
            addCriterion("t1.MX6 is not null");
            return (Criteria) this;
        }

        public Criteria andMx6EqualTo(Short value) {
            addCriterion("t1.MX6 =", value, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6NotEqualTo(Short value) {
            addCriterion("t1.MX6 <>", value, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6GreaterThan(Short value) {
            addCriterion("t1.MX6 >", value, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX6 >=", value, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6LessThan(Short value) {
            addCriterion("t1.MX6 <", value, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX6 <=", value, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6In(List<Short> values) {
            addCriterion("t1.MX6 in", values, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6NotIn(List<Short> values) {
            addCriterion("t1.MX6 not in", values, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6Between(Short value1, Short value2) {
            addCriterion("t1.MX6 between", value1, value2, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx6NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX6 not between", value1, value2, "mx6");
            return (Criteria) this;
        }

        public Criteria andMx7IsNull() {
            addCriterion("t1.MX7 is null");
            return (Criteria) this;
        }

        public Criteria andMx7IsNotNull() {
            addCriterion("t1.MX7 is not null");
            return (Criteria) this;
        }

        public Criteria andMx7EqualTo(Short value) {
            addCriterion("t1.MX7 =", value, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7NotEqualTo(Short value) {
            addCriterion("t1.MX7 <>", value, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7GreaterThan(Short value) {
            addCriterion("t1.MX7 >", value, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX7 >=", value, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7LessThan(Short value) {
            addCriterion("t1.MX7 <", value, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX7 <=", value, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7In(List<Short> values) {
            addCriterion("t1.MX7 in", values, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7NotIn(List<Short> values) {
            addCriterion("t1.MX7 not in", values, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7Between(Short value1, Short value2) {
            addCriterion("t1.MX7 between", value1, value2, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx7NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX7 not between", value1, value2, "mx7");
            return (Criteria) this;
        }

        public Criteria andMx8IsNull() {
            addCriterion("t1.MX8 is null");
            return (Criteria) this;
        }

        public Criteria andMx8IsNotNull() {
            addCriterion("t1.MX8 is not null");
            return (Criteria) this;
        }

        public Criteria andMx8EqualTo(Short value) {
            addCriterion("t1.MX8 =", value, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8NotEqualTo(Short value) {
            addCriterion("t1.MX8 <>", value, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8GreaterThan(Short value) {
            addCriterion("t1.MX8 >", value, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX8 >=", value, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8LessThan(Short value) {
            addCriterion("t1.MX8 <", value, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX8 <=", value, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8In(List<Short> values) {
            addCriterion("t1.MX8 in", values, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8NotIn(List<Short> values) {
            addCriterion("t1.MX8 not in", values, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8Between(Short value1, Short value2) {
            addCriterion("t1.MX8 between", value1, value2, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx8NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX8 not between", value1, value2, "mx8");
            return (Criteria) this;
        }

        public Criteria andMx9IsNull() {
            addCriterion("t1.MX9 is null");
            return (Criteria) this;
        }

        public Criteria andMx9IsNotNull() {
            addCriterion("t1.MX9 is not null");
            return (Criteria) this;
        }

        public Criteria andMx9EqualTo(Short value) {
            addCriterion("t1.MX9 =", value, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9NotEqualTo(Short value) {
            addCriterion("t1.MX9 <>", value, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9GreaterThan(Short value) {
            addCriterion("t1.MX9 >", value, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX9 >=", value, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9LessThan(Short value) {
            addCriterion("t1.MX9 <", value, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX9 <=", value, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9In(List<Short> values) {
            addCriterion("t1.MX9 in", values, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9NotIn(List<Short> values) {
            addCriterion("t1.MX9 not in", values, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9Between(Short value1, Short value2) {
            addCriterion("t1.MX9 between", value1, value2, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx9NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX9 not between", value1, value2, "mx9");
            return (Criteria) this;
        }

        public Criteria andMx10IsNull() {
            addCriterion("t1.MX10 is null");
            return (Criteria) this;
        }

        public Criteria andMx10IsNotNull() {
            addCriterion("t1.MX10 is not null");
            return (Criteria) this;
        }

        public Criteria andMx10EqualTo(Short value) {
            addCriterion("t1.MX10 =", value, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10NotEqualTo(Short value) {
            addCriterion("t1.MX10 <>", value, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10GreaterThan(Short value) {
            addCriterion("t1.MX10 >", value, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX10 >=", value, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10LessThan(Short value) {
            addCriterion("t1.MX10 <", value, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX10 <=", value, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10In(List<Short> values) {
            addCriterion("t1.MX10 in", values, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10NotIn(List<Short> values) {
            addCriterion("t1.MX10 not in", values, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10Between(Short value1, Short value2) {
            addCriterion("t1.MX10 between", value1, value2, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx10NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX10 not between", value1, value2, "mx10");
            return (Criteria) this;
        }

        public Criteria andMx11IsNull() {
            addCriterion("t1.MX11 is null");
            return (Criteria) this;
        }

        public Criteria andMx11IsNotNull() {
            addCriterion("t1.MX11 is not null");
            return (Criteria) this;
        }

        public Criteria andMx11EqualTo(Short value) {
            addCriterion("t1.MX11 =", value, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11NotEqualTo(Short value) {
            addCriterion("t1.MX11 <>", value, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11GreaterThan(Short value) {
            addCriterion("t1.MX11 >", value, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX11 >=", value, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11LessThan(Short value) {
            addCriterion("t1.MX11 <", value, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX11 <=", value, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11In(List<Short> values) {
            addCriterion("t1.MX11 in", values, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11NotIn(List<Short> values) {
            addCriterion("t1.MX11 not in", values, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11Between(Short value1, Short value2) {
            addCriterion("t1.MX11 between", value1, value2, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx11NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX11 not between", value1, value2, "mx11");
            return (Criteria) this;
        }

        public Criteria andMx12IsNull() {
            addCriterion("t1.MX12 is null");
            return (Criteria) this;
        }

        public Criteria andMx12IsNotNull() {
            addCriterion("t1.MX12 is not null");
            return (Criteria) this;
        }

        public Criteria andMx12EqualTo(Short value) {
            addCriterion("t1.MX12 =", value, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12NotEqualTo(Short value) {
            addCriterion("t1.MX12 <>", value, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12GreaterThan(Short value) {
            addCriterion("t1.MX12 >", value, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX12 >=", value, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12LessThan(Short value) {
            addCriterion("t1.MX12 <", value, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX12 <=", value, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12In(List<Short> values) {
            addCriterion("t1.MX12 in", values, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12NotIn(List<Short> values) {
            addCriterion("t1.MX12 not in", values, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12Between(Short value1, Short value2) {
            addCriterion("t1.MX12 between", value1, value2, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx12NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX12 not between", value1, value2, "mx12");
            return (Criteria) this;
        }

        public Criteria andMx13IsNull() {
            addCriterion("t1.MX13 is null");
            return (Criteria) this;
        }

        public Criteria andMx13IsNotNull() {
            addCriterion("t1.MX13 is not null");
            return (Criteria) this;
        }

        public Criteria andMx13EqualTo(Short value) {
            addCriterion("t1.MX13 =", value, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13NotEqualTo(Short value) {
            addCriterion("t1.MX13 <>", value, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13GreaterThan(Short value) {
            addCriterion("t1.MX13 >", value, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX13 >=", value, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13LessThan(Short value) {
            addCriterion("t1.MX13 <", value, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX13 <=", value, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13In(List<Short> values) {
            addCriterion("t1.MX13 in", values, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13NotIn(List<Short> values) {
            addCriterion("t1.MX13 not in", values, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13Between(Short value1, Short value2) {
            addCriterion("t1.MX13 between", value1, value2, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx13NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX13 not between", value1, value2, "mx13");
            return (Criteria) this;
        }

        public Criteria andMx14IsNull() {
            addCriterion("t1.MX14 is null");
            return (Criteria) this;
        }

        public Criteria andMx14IsNotNull() {
            addCriterion("t1.MX14 is not null");
            return (Criteria) this;
        }

        public Criteria andMx14EqualTo(Short value) {
            addCriterion("t1.MX14 =", value, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14NotEqualTo(Short value) {
            addCriterion("t1.MX14 <>", value, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14GreaterThan(Short value) {
            addCriterion("t1.MX14 >", value, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX14 >=", value, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14LessThan(Short value) {
            addCriterion("t1.MX14 <", value, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX14 <=", value, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14In(List<Short> values) {
            addCriterion("t1.MX14 in", values, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14NotIn(List<Short> values) {
            addCriterion("t1.MX14 not in", values, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14Between(Short value1, Short value2) {
            addCriterion("t1.MX14 between", value1, value2, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx14NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX14 not between", value1, value2, "mx14");
            return (Criteria) this;
        }

        public Criteria andMx15IsNull() {
            addCriterion("t1.MX15 is null");
            return (Criteria) this;
        }

        public Criteria andMx15IsNotNull() {
            addCriterion("t1.MX15 is not null");
            return (Criteria) this;
        }

        public Criteria andMx15EqualTo(Short value) {
            addCriterion("t1.MX15 =", value, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15NotEqualTo(Short value) {
            addCriterion("t1.MX15 <>", value, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15GreaterThan(Short value) {
            addCriterion("t1.MX15 >", value, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX15 >=", value, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15LessThan(Short value) {
            addCriterion("t1.MX15 <", value, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX15 <=", value, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15In(List<Short> values) {
            addCriterion("t1.MX15 in", values, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15NotIn(List<Short> values) {
            addCriterion("t1.MX15 not in", values, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15Between(Short value1, Short value2) {
            addCriterion("t1.MX15 between", value1, value2, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx15NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX15 not between", value1, value2, "mx15");
            return (Criteria) this;
        }

        public Criteria andMx16IsNull() {
            addCriterion("t1.MX16 is null");
            return (Criteria) this;
        }

        public Criteria andMx16IsNotNull() {
            addCriterion("t1.MX16 is not null");
            return (Criteria) this;
        }

        public Criteria andMx16EqualTo(Short value) {
            addCriterion("t1.MX16 =", value, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16NotEqualTo(Short value) {
            addCriterion("t1.MX16 <>", value, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16GreaterThan(Short value) {
            addCriterion("t1.MX16 >", value, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX16 >=", value, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16LessThan(Short value) {
            addCriterion("t1.MX16 <", value, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX16 <=", value, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16In(List<Short> values) {
            addCriterion("t1.MX16 in", values, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16NotIn(List<Short> values) {
            addCriterion("t1.MX16 not in", values, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16Between(Short value1, Short value2) {
            addCriterion("t1.MX16 between", value1, value2, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx16NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX16 not between", value1, value2, "mx16");
            return (Criteria) this;
        }

        public Criteria andMx17IsNull() {
            addCriterion("t1.MX17 is null");
            return (Criteria) this;
        }

        public Criteria andMx17IsNotNull() {
            addCriterion("t1.MX17 is not null");
            return (Criteria) this;
        }

        public Criteria andMx17EqualTo(Short value) {
            addCriterion("t1.MX17 =", value, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17NotEqualTo(Short value) {
            addCriterion("t1.MX17 <>", value, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17GreaterThan(Short value) {
            addCriterion("t1.MX17 >", value, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX17 >=", value, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17LessThan(Short value) {
            addCriterion("t1.MX17 <", value, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX17 <=", value, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17In(List<Short> values) {
            addCriterion("t1.MX17 in", values, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17NotIn(List<Short> values) {
            addCriterion("t1.MX17 not in", values, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17Between(Short value1, Short value2) {
            addCriterion("t1.MX17 between", value1, value2, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx17NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX17 not between", value1, value2, "mx17");
            return (Criteria) this;
        }

        public Criteria andMx18IsNull() {
            addCriterion("t1.MX18 is null");
            return (Criteria) this;
        }

        public Criteria andMx18IsNotNull() {
            addCriterion("t1.MX18 is not null");
            return (Criteria) this;
        }

        public Criteria andMx18EqualTo(Short value) {
            addCriterion("t1.MX18 =", value, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18NotEqualTo(Short value) {
            addCriterion("t1.MX18 <>", value, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18GreaterThan(Short value) {
            addCriterion("t1.MX18 >", value, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX18 >=", value, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18LessThan(Short value) {
            addCriterion("t1.MX18 <", value, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX18 <=", value, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18In(List<Short> values) {
            addCriterion("t1.MX18 in", values, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18NotIn(List<Short> values) {
            addCriterion("t1.MX18 not in", values, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18Between(Short value1, Short value2) {
            addCriterion("t1.MX18 between", value1, value2, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx18NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX18 not between", value1, value2, "mx18");
            return (Criteria) this;
        }

        public Criteria andMx19IsNull() {
            addCriterion("t1.MX19 is null");
            return (Criteria) this;
        }

        public Criteria andMx19IsNotNull() {
            addCriterion("t1.MX19 is not null");
            return (Criteria) this;
        }

        public Criteria andMx19EqualTo(Short value) {
            addCriterion("t1.MX19 =", value, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19NotEqualTo(Short value) {
            addCriterion("t1.MX19 <>", value, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19GreaterThan(Short value) {
            addCriterion("t1.MX19 >", value, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX19 >=", value, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19LessThan(Short value) {
            addCriterion("t1.MX19 <", value, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX19 <=", value, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19In(List<Short> values) {
            addCriterion("t1.MX19 in", values, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19NotIn(List<Short> values) {
            addCriterion("t1.MX19 not in", values, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19Between(Short value1, Short value2) {
            addCriterion("t1.MX19 between", value1, value2, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx19NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX19 not between", value1, value2, "mx19");
            return (Criteria) this;
        }

        public Criteria andMx20IsNull() {
            addCriterion("t1.MX20 is null");
            return (Criteria) this;
        }

        public Criteria andMx20IsNotNull() {
            addCriterion("t1.MX20 is not null");
            return (Criteria) this;
        }

        public Criteria andMx20EqualTo(Short value) {
            addCriterion("t1.MX20 =", value, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20NotEqualTo(Short value) {
            addCriterion("t1.MX20 <>", value, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20GreaterThan(Short value) {
            addCriterion("t1.MX20 >", value, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX20 >=", value, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20LessThan(Short value) {
            addCriterion("t1.MX20 <", value, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX20 <=", value, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20In(List<Short> values) {
            addCriterion("t1.MX20 in", values, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20NotIn(List<Short> values) {
            addCriterion("t1.MX20 not in", values, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20Between(Short value1, Short value2) {
            addCriterion("t1.MX20 between", value1, value2, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx20NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX20 not between", value1, value2, "mx20");
            return (Criteria) this;
        }

        public Criteria andMx21IsNull() {
            addCriterion("t1.MX21 is null");
            return (Criteria) this;
        }

        public Criteria andMx21IsNotNull() {
            addCriterion("t1.MX21 is not null");
            return (Criteria) this;
        }

        public Criteria andMx21EqualTo(Short value) {
            addCriterion("t1.MX21 =", value, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21NotEqualTo(Short value) {
            addCriterion("t1.MX21 <>", value, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21GreaterThan(Short value) {
            addCriterion("t1.MX21 >", value, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX21 >=", value, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21LessThan(Short value) {
            addCriterion("t1.MX21 <", value, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX21 <=", value, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21In(List<Short> values) {
            addCriterion("t1.MX21 in", values, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21NotIn(List<Short> values) {
            addCriterion("t1.MX21 not in", values, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21Between(Short value1, Short value2) {
            addCriterion("t1.MX21 between", value1, value2, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx21NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX21 not between", value1, value2, "mx21");
            return (Criteria) this;
        }

        public Criteria andMx22IsNull() {
            addCriterion("t1.MX22 is null");
            return (Criteria) this;
        }

        public Criteria andMx22IsNotNull() {
            addCriterion("t1.MX22 is not null");
            return (Criteria) this;
        }

        public Criteria andMx22EqualTo(Short value) {
            addCriterion("t1.MX22 =", value, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22NotEqualTo(Short value) {
            addCriterion("t1.MX22 <>", value, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22GreaterThan(Short value) {
            addCriterion("t1.MX22 >", value, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX22 >=", value, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22LessThan(Short value) {
            addCriterion("t1.MX22 <", value, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX22 <=", value, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22In(List<Short> values) {
            addCriterion("t1.MX22 in", values, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22NotIn(List<Short> values) {
            addCriterion("t1.MX22 not in", values, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22Between(Short value1, Short value2) {
            addCriterion("t1.MX22 between", value1, value2, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx22NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX22 not between", value1, value2, "mx22");
            return (Criteria) this;
        }

        public Criteria andMx23IsNull() {
            addCriterion("t1.MX23 is null");
            return (Criteria) this;
        }

        public Criteria andMx23IsNotNull() {
            addCriterion("t1.MX23 is not null");
            return (Criteria) this;
        }

        public Criteria andMx23EqualTo(Short value) {
            addCriterion("t1.MX23 =", value, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23NotEqualTo(Short value) {
            addCriterion("t1.MX23 <>", value, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23GreaterThan(Short value) {
            addCriterion("t1.MX23 >", value, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX23 >=", value, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23LessThan(Short value) {
            addCriterion("t1.MX23 <", value, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX23 <=", value, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23In(List<Short> values) {
            addCriterion("t1.MX23 in", values, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23NotIn(List<Short> values) {
            addCriterion("t1.MX23 not in", values, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23Between(Short value1, Short value2) {
            addCriterion("t1.MX23 between", value1, value2, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx23NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX23 not between", value1, value2, "mx23");
            return (Criteria) this;
        }

        public Criteria andMx24IsNull() {
            addCriterion("t1.MX24 is null");
            return (Criteria) this;
        }

        public Criteria andMx24IsNotNull() {
            addCriterion("t1.MX24 is not null");
            return (Criteria) this;
        }

        public Criteria andMx24EqualTo(Short value) {
            addCriterion("t1.MX24 =", value, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24NotEqualTo(Short value) {
            addCriterion("t1.MX24 <>", value, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24GreaterThan(Short value) {
            addCriterion("t1.MX24 >", value, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.MX24 >=", value, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24LessThan(Short value) {
            addCriterion("t1.MX24 <", value, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24LessThanOrEqualTo(Short value) {
            addCriterion("t1.MX24 <=", value, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24In(List<Short> values) {
            addCriterion("t1.MX24 in", values, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24NotIn(List<Short> values) {
            addCriterion("t1.MX24 not in", values, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24Between(Short value1, Short value2) {
            addCriterion("t1.MX24 between", value1, value2, "mx24");
            return (Criteria) this;
        }

        public Criteria andMx24NotBetween(Short value1, Short value2) {
            addCriterion("t1.MX24 not between", value1, value2, "mx24");
            return (Criteria) this;
        }

        public Criteria andTotQtyIsNull() {
            addCriterion("t1.TOT_QTY is null");
            return (Criteria) this;
        }

        public Criteria andTotQtyIsNotNull() {
            addCriterion("t1.TOT_QTY is not null");
            return (Criteria) this;
        }

        public Criteria andTotQtyEqualTo(Short value) {
            addCriterion("t1.TOT_QTY =", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotEqualTo(Short value) {
            addCriterion("t1.TOT_QTY <>", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyGreaterThan(Short value) {
            addCriterion("t1.TOT_QTY >", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.TOT_QTY >=", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyLessThan(Short value) {
            addCriterion("t1.TOT_QTY <", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyLessThanOrEqualTo(Short value) {
            addCriterion("t1.TOT_QTY <=", value, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyIn(List<Short> values) {
            addCriterion("t1.TOT_QTY in", values, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotIn(List<Short> values) {
            addCriterion("t1.TOT_QTY not in", values, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyBetween(Short value1, Short value2) {
            addCriterion("t1.TOT_QTY between", value1, value2, "totQty");
            return (Criteria) this;
        }

        public Criteria andTotQtyNotBetween(Short value1, Short value2) {
            addCriterion("t1.TOT_QTY not between", value1, value2, "totQty");
            return (Criteria) this;
        }

        public Criteria andRnIsNull() {
            addCriterion("t1.RN is null");
            return (Criteria) this;
        }

        public Criteria andRnIsNotNull() {
            addCriterion("t1.RN is not null");
            return (Criteria) this;
        }

        public Criteria andRnEqualTo(Short value) {
            addCriterion("t1.RN =", value, "rn");
            return (Criteria) this;
        }

        public Criteria andRnNotEqualTo(Short value) {
            addCriterion("t1.RN <>", value, "rn");
            return (Criteria) this;
        }

        public Criteria andRnGreaterThan(Short value) {
            addCriterion("t1.RN >", value, "rn");
            return (Criteria) this;
        }

        public Criteria andRnGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.RN >=", value, "rn");
            return (Criteria) this;
        }

        public Criteria andRnLessThan(Short value) {
            addCriterion("t1.RN <", value, "rn");
            return (Criteria) this;
        }

        public Criteria andRnLessThanOrEqualTo(Short value) {
            addCriterion("t1.RN <=", value, "rn");
            return (Criteria) this;
        }

        public Criteria andRnIn(List<Short> values) {
            addCriterion("t1.RN in", values, "rn");
            return (Criteria) this;
        }

        public Criteria andRnNotIn(List<Short> values) {
            addCriterion("t1.RN not in", values, "rn");
            return (Criteria) this;
        }

        public Criteria andRnBetween(Short value1, Short value2) {
            addCriterion("t1.RN between", value1, value2, "rn");
            return (Criteria) this;
        }

        public Criteria andRnNotBetween(Short value1, Short value2) {
            addCriterion("t1.RN not between", value1, value2, "rn");
            return (Criteria) this;
        }

        public Criteria andAmtActualIsNull() {
            addCriterion("t1.AMT_ACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andAmtActualIsNotNull() {
            addCriterion("t1.AMT_ACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andAmtActualEqualTo(Short value) {
            addCriterion("t1.AMT_ACTUAL =", value, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualNotEqualTo(Short value) {
            addCriterion("t1.AMT_ACTUAL <>", value, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualGreaterThan(Short value) {
            addCriterion("t1.AMT_ACTUAL >", value, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.AMT_ACTUAL >=", value, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualLessThan(Short value) {
            addCriterion("t1.AMT_ACTUAL <", value, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualLessThanOrEqualTo(Short value) {
            addCriterion("t1.AMT_ACTUAL <=", value, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualIn(List<Short> values) {
            addCriterion("t1.AMT_ACTUAL in", values, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualNotIn(List<Short> values) {
            addCriterion("t1.AMT_ACTUAL not in", values, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualBetween(Short value1, Short value2) {
            addCriterion("t1.AMT_ACTUAL between", value1, value2, "amtActual");
            return (Criteria) this;
        }

        public Criteria andAmtActualNotBetween(Short value1, Short value2) {
            addCriterion("t1.AMT_ACTUAL not between", value1, value2, "amtActual");
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

        public Criteria andIsmodifyIsNull() {
            addCriterion("t1.ISMODIFY is null");
            return (Criteria) this;
        }

        public Criteria andIsmodifyIsNotNull() {
            addCriterion("t1.ISMODIFY is not null");
            return (Criteria) this;
        }

        public Criteria andIsmodifyEqualTo(String value) {
            addCriterion("t1.ISMODIFY =", value, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyNotEqualTo(String value) {
            addCriterion("t1.ISMODIFY <>", value, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyGreaterThan(String value) {
            addCriterion("t1.ISMODIFY >", value, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISMODIFY >=", value, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyLessThan(String value) {
            addCriterion("t1.ISMODIFY <", value, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyLessThanOrEqualTo(String value) {
            addCriterion("t1.ISMODIFY <=", value, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyLike(String value) {
            addCriterion("t1.ISMODIFY like", value, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyNotLike(String value) {
            addCriterion("t1.ISMODIFY not like", value, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyIn(List<String> values) {
            addCriterion("t1.ISMODIFY in", values, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyNotIn(List<String> values) {
            addCriterion("t1.ISMODIFY not in", values, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyBetween(String value1, String value2) {
            addCriterion("t1.ISMODIFY between", value1, value2, "ismodify");
            return (Criteria) this;
        }

        public Criteria andIsmodifyNotBetween(String value1, String value2) {
            addCriterion("t1.ISMODIFY not between", value1, value2, "ismodify");
            return (Criteria) this;
        }

        public Criteria andQty1IsNull() {
            addCriterion("t1.QTY1 is null");
            return (Criteria) this;
        }

        public Criteria andQty1IsNotNull() {
            addCriterion("t1.QTY1 is not null");
            return (Criteria) this;
        }

        public Criteria andQty1EqualTo(Short value) {
            addCriterion("t1.QTY1 =", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotEqualTo(Short value) {
            addCriterion("t1.QTY1 <>", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1GreaterThan(Short value) {
            addCriterion("t1.QTY1 >", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1GreaterThanOrEqualTo(Short value) {
            addCriterion("t1.QTY1 >=", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1LessThan(Short value) {
            addCriterion("t1.QTY1 <", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1LessThanOrEqualTo(Short value) {
            addCriterion("t1.QTY1 <=", value, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1In(List<Short> values) {
            addCriterion("t1.QTY1 in", values, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotIn(List<Short> values) {
            addCriterion("t1.QTY1 not in", values, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1Between(Short value1, Short value2) {
            addCriterion("t1.QTY1 between", value1, value2, "qty1");
            return (Criteria) this;
        }

        public Criteria andQty1NotBetween(Short value1, Short value2) {
            addCriterion("t1.QTY1 not between", value1, value2, "qty1");
            return (Criteria) this;
        }

        public Criteria andQtycanIsNull() {
            addCriterion("t1.QTYCAN is null");
            return (Criteria) this;
        }

        public Criteria andQtycanIsNotNull() {
            addCriterion("t1.QTYCAN is not null");
            return (Criteria) this;
        }

        public Criteria andQtycanEqualTo(Short value) {
            addCriterion("t1.QTYCAN =", value, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanNotEqualTo(Short value) {
            addCriterion("t1.QTYCAN <>", value, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanGreaterThan(Short value) {
            addCriterion("t1.QTYCAN >", value, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.QTYCAN >=", value, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanLessThan(Short value) {
            addCriterion("t1.QTYCAN <", value, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanLessThanOrEqualTo(Short value) {
            addCriterion("t1.QTYCAN <=", value, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanIn(List<Short> values) {
            addCriterion("t1.QTYCAN in", values, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanNotIn(List<Short> values) {
            addCriterion("t1.QTYCAN not in", values, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanBetween(Short value1, Short value2) {
            addCriterion("t1.QTYCAN between", value1, value2, "qtycan");
            return (Criteria) this;
        }

        public Criteria andQtycanNotBetween(Short value1, Short value2) {
            addCriterion("t1.QTYCAN not between", value1, value2, "qtycan");
            return (Criteria) this;
        }

        public Criteria andMColorIdIsNull() {
            addCriterion("t1.M_COLOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andMColorIdIsNotNull() {
            addCriterion("t1.M_COLOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMColorIdEqualTo(Long value) {
            addCriterion("t1.M_COLOR_ID =", value, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdNotEqualTo(Long value) {
            addCriterion("t1.M_COLOR_ID <>", value, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdGreaterThan(Long value) {
            addCriterion("t1.M_COLOR_ID >", value, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.M_COLOR_ID >=", value, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdLessThan(Long value) {
            addCriterion("t1.M_COLOR_ID <", value, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.M_COLOR_ID <=", value, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdIn(List<Long> values) {
            addCriterion("t1.M_COLOR_ID in", values, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdNotIn(List<Long> values) {
            addCriterion("t1.M_COLOR_ID not in", values, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdBetween(Long value1, Long value2) {
            addCriterion("t1.M_COLOR_ID between", value1, value2, "mColorId");
            return (Criteria) this;
        }

        public Criteria andMColorIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.M_COLOR_ID not between", value1, value2, "mColorId");
            return (Criteria) this;
        }

        public Criteria andPriceactual2IsNull() {
            addCriterion("t1.PRICEACTUAL2 is null");
            return (Criteria) this;
        }

        public Criteria andPriceactual2IsNotNull() {
            addCriterion("t1.PRICEACTUAL2 is not null");
            return (Criteria) this;
        }

        public Criteria andPriceactual2EqualTo(BigDecimal value) {
            addCriterion("t1.PRICEACTUAL2 =", value, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2NotEqualTo(BigDecimal value) {
            addCriterion("t1.PRICEACTUAL2 <>", value, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2GreaterThan(BigDecimal value) {
            addCriterion("t1.PRICEACTUAL2 >", value, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2GreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.PRICEACTUAL2 >=", value, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2LessThan(BigDecimal value) {
            addCriterion("t1.PRICEACTUAL2 <", value, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2LessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.PRICEACTUAL2 <=", value, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2In(List<BigDecimal> values) {
            addCriterion("t1.PRICEACTUAL2 in", values, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2NotIn(List<BigDecimal> values) {
            addCriterion("t1.PRICEACTUAL2 not in", values, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2Between(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.PRICEACTUAL2 between", value1, value2, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andPriceactual2NotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.PRICEACTUAL2 not between", value1, value2, "priceactual2");
            return (Criteria) this;
        }

        public Criteria andRetReasonIsNull() {
            addCriterion("t1.RET_REASON is null");
            return (Criteria) this;
        }

        public Criteria andRetReasonIsNotNull() {
            addCriterion("t1.RET_REASON is not null");
            return (Criteria) this;
        }

        public Criteria andRetReasonEqualTo(Short value) {
            addCriterion("t1.RET_REASON =", value, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonNotEqualTo(Short value) {
            addCriterion("t1.RET_REASON <>", value, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonGreaterThan(Short value) {
            addCriterion("t1.RET_REASON >", value, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.RET_REASON >=", value, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonLessThan(Short value) {
            addCriterion("t1.RET_REASON <", value, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonLessThanOrEqualTo(Short value) {
            addCriterion("t1.RET_REASON <=", value, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonIn(List<Short> values) {
            addCriterion("t1.RET_REASON in", values, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonNotIn(List<Short> values) {
            addCriterion("t1.RET_REASON not in", values, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonBetween(Short value1, Short value2) {
            addCriterion("t1.RET_REASON between", value1, value2, "retReason");
            return (Criteria) this;
        }

        public Criteria andRetReasonNotBetween(Short value1, Short value2) {
            addCriterion("t1.RET_REASON not between", value1, value2, "retReason");
            return (Criteria) this;
        }

        public Criteria andPriceactualIsNull() {
            addCriterion("t1.PRICEACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andPriceactualIsNotNull() {
            addCriterion("t1.PRICEACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andPriceactualEqualTo(Short value) {
            addCriterion("t1.PRICEACTUAL =", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotEqualTo(Short value) {
            addCriterion("t1.PRICEACTUAL <>", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualGreaterThan(Short value) {
            addCriterion("t1.PRICEACTUAL >", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.PRICEACTUAL >=", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualLessThan(Short value) {
            addCriterion("t1.PRICEACTUAL <", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualLessThanOrEqualTo(Short value) {
            addCriterion("t1.PRICEACTUAL <=", value, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualIn(List<Short> values) {
            addCriterion("t1.PRICEACTUAL in", values, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotIn(List<Short> values) {
            addCriterion("t1.PRICEACTUAL not in", values, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualBetween(Short value1, Short value2) {
            addCriterion("t1.PRICEACTUAL between", value1, value2, "priceactual");
            return (Criteria) this;
        }

        public Criteria andPriceactualNotBetween(Short value1, Short value2) {
            addCriterion("t1.PRICEACTUAL not between", value1, value2, "priceactual");
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