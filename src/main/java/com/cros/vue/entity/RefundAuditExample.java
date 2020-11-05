package com.cros.vue.entity;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.time.DateUtils;

import javax.xml.crypto.Data;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RefundAuditExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RefundAuditExample() {
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
        //传入日期字段
        protected void addCriterion(String condition, Object value, String property,boolean isDate) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value,isDate));
        }
        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }
        //between 传入日期
        protected void addCriterion(String condition, Object value1, Object value2, String property,boolean isDate) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2,isDate));
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

        public Criteria andDocnoIsNull() {
            addCriterion("t1.DOCNO is null");
            return (Criteria) this;
        }

        public Criteria andDocnoIsNotNull() {
            addCriterion("t1.DOCNO is not null");
            return (Criteria) this;
        }

        public Criteria andDocnoEqualTo(String value) {
            addCriterion("t1.DOCNO =", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotEqualTo(String value) {
            addCriterion("t1.DOCNO <>", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoGreaterThan(String value) {
            addCriterion("t1.DOCNO >", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.DOCNO >=", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLessThan(String value) {
            addCriterion("t1.DOCNO <", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLessThanOrEqualTo(String value) {
            addCriterion("t1.DOCNO <=", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoLike(String value) {
            addCriterion("t1.DOCNO like", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotLike(String value) {
            addCriterion("t1.DOCNO not like", value, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoIn(List<String> values) {
            addCriterion("t1.DOCNO in", values, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotIn(List<String> values) {
            addCriterion("t1.DOCNO not in", values, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoBetween(String value1, String value2) {
            addCriterion("t1.DOCNO between", value1, value2, "docno");
            return (Criteria) this;
        }

        public Criteria andDocnoNotBetween(String value1, String value2) {
            addCriterion("t1.DOCNO not between", value1, value2, "docno");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNull() {
            addCriterion("t1.DOCTYPE is null");
            return (Criteria) this;
        }

        public Criteria andDoctypeIsNotNull() {
            addCriterion("t1.DOCTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andDoctypeEqualTo(String value) {
            addCriterion("t1.DOCTYPE =", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotEqualTo(String value) {
            addCriterion("t1.DOCTYPE <>", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThan(String value) {
            addCriterion("t1.DOCTYPE >", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.DOCTYPE >=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThan(String value) {
            addCriterion("t1.DOCTYPE <", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLessThanOrEqualTo(String value) {
            addCriterion("t1.DOCTYPE <=", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeLike(String value) {
            addCriterion("t1.DOCTYPE like", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotLike(String value) {
            addCriterion("t1.DOCTYPE not like", value, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeIn(List<String> values) {
            addCriterion("t1.DOCTYPE in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotIn(List<String> values) {
            addCriterion("t1.DOCTYPE not in", values, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeBetween(String value1, String value2) {
            addCriterion("t1.DOCTYPE between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andDoctypeNotBetween(String value1, String value2) {
            addCriterion("t1.DOCTYPE not between", value1, value2, "doctype");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNull() {
            addCriterion("t1.BILLDATE is null");
            return (Criteria) this;
        }

        public Criteria andBilldateIsNotNull() {
            addCriterion("t1.BILLDATE is not null");
            return (Criteria) this;
        }

        public Criteria andBilldateEqualTo(Data value) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') =", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateNotEqualTo(Date value) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') <>",value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThan(Date value) {
            //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') >", value, "billdate");
            return (Criteria) this;
        }

        public Criteria andBilldateGreaterThanOrEqualTo(Date value) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') >=", value, "billdate",true);
            return (Criteria) this;
        }

        public Criteria andBilldateLessThan(Date value) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') <", value, "billdate",true);
            return (Criteria) this;
        }

        public Criteria andBilldateLessThanOrEqualTo(Date value) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') <=", value, "billdate",true);
            return (Criteria) this;
        }

        public Criteria andBilldateIn(List<Date> values) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') in", values, "billdate",true);
            return (Criteria) this;
        }

        public Criteria andBilldateNotIn(List<Date> values) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') not in", values, "billdate",true);
            return (Criteria) this;
        }

        public Criteria andBilldateBetween(Date value1, Date value2) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') between", value1, value2, "billdate",true);
            return (Criteria) this;
        }

        public Criteria andBilldateNotBetween(Date value1, Date value2) {
            addCriterion("to_date(t1.BILLDATE,'YYYY-MM-DD hh24:mi:ss') not between", value1, value2, "billdate",true);
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIsNull() {
            addCriterion("t1.SALESREP_ID is null");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIsNotNull() {
            addCriterion("t1.SALESREP_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdEqualTo(Long value) {
            addCriterion("t1.SALESREP_ID =", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotEqualTo(Long value) {
            addCriterion("t1.SALESREP_ID <>", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdGreaterThan(Long value) {
            addCriterion("t1.SALESREP_ID >", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.SALESREP_ID >=", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdLessThan(Long value) {
            addCriterion("t1.SALESREP_ID <", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.SALESREP_ID <=", value, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdIn(List<Long> values) {
            addCriterion("t1.SALESREP_ID in", values, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotIn(List<Long> values) {
            addCriterion("t1.SALESREP_ID not in", values, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdBetween(Long value1, Long value2) {
            addCriterion("t1.SALESREP_ID between", value1, value2, "salesrepId");
            return (Criteria) this;
        }

        public Criteria andSalesrepIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.SALESREP_ID not between", value1, value2, "salesrepId");
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

        public Criteria andAuStateIsNull() {
            addCriterion("t1.AU_STATE is null");
            return (Criteria) this;
        }

        public Criteria andAuStateIsNotNull() {
            addCriterion("t1.AU_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andAuStateEqualTo(String value) {
            addCriterion("t1.AU_STATE =", value, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateNotEqualTo(String value) {
            addCriterion("t1.AU_STATE <>", value, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateGreaterThan(String value) {
            addCriterion("t1.AU_STATE >", value, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateGreaterThanOrEqualTo(String value) {
            addCriterion("t1.AU_STATE >=", value, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateLessThan(String value) {
            addCriterion("t1.AU_STATE <", value, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateLessThanOrEqualTo(String value) {
            addCriterion("t1.AU_STATE <=", value, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateLike(String value) {
            addCriterion("t1.AU_STATE like", value, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateNotLike(String value) {
            addCriterion("t1.AU_STATE not like", value, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateIn(List<String> values) {
            addCriterion("t1.AU_STATE in", values, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateNotIn(List<String> values) {
            addCriterion("t1.AU_STATE not in", values, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateBetween(String value1, String value2) {
            addCriterion("t1.AU_STATE between", value1, value2, "auState");
            return (Criteria) this;
        }

        public Criteria andAuStateNotBetween(String value1, String value2) {
            addCriterion("t1.AU_STATE not between", value1, value2, "auState");
            return (Criteria) this;
        }

        public Criteria andAuPiIdIsNull() {
            addCriterion("t1.AU_PI_ID is null");
            return (Criteria) this;
        }

        public Criteria andAuPiIdIsNotNull() {
            addCriterion("t1.AU_PI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAuPiIdEqualTo(Long value) {
            addCriterion("t1.AU_PI_ID =", value, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdNotEqualTo(Long value) {
            addCriterion("t1.AU_PI_ID <>", value, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdGreaterThan(Long value) {
            addCriterion("t1.AU_PI_ID >", value, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.AU_PI_ID >=", value, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdLessThan(Long value) {
            addCriterion("t1.AU_PI_ID <", value, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.AU_PI_ID <=", value, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdIn(List<Long> values) {
            addCriterion("t1.AU_PI_ID in", values, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdNotIn(List<Long> values) {
            addCriterion("t1.AU_PI_ID not in", values, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdBetween(Long value1, Long value2) {
            addCriterion("t1.AU_PI_ID between", value1, value2, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAuPiIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.AU_PI_ID not between", value1, value2, "auPiId");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountIsNull() {
            addCriterion("t1.AVG_DISCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountIsNotNull() {
            addCriterion("t1.AVG_DISCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountEqualTo(BigDecimal value) {
            addCriterion("t1.AVG_DISCOUNT =", value, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountNotEqualTo(BigDecimal value) {
            addCriterion("t1.AVG_DISCOUNT <>", value, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountGreaterThan(BigDecimal value) {
            addCriterion("t1.AVG_DISCOUNT >", value, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.AVG_DISCOUNT >=", value, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountLessThan(BigDecimal value) {
            addCriterion("t1.AVG_DISCOUNT <", value, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.AVG_DISCOUNT <=", value, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountIn(List<BigDecimal> values) {
            addCriterion("t1.AVG_DISCOUNT in", values, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountNotIn(List<BigDecimal> values) {
            addCriterion("t1.AVG_DISCOUNT not in", values, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.AVG_DISCOUNT between", value1, value2, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andAvgDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.AVG_DISCOUNT not between", value1, value2, "avgDiscount");
            return (Criteria) this;
        }

        public Criteria andTotLinesIsNull() {
            addCriterion("t1.TOT_LINES is null");
            return (Criteria) this;
        }

        public Criteria andTotLinesIsNotNull() {
            addCriterion("t1.TOT_LINES is not null");
            return (Criteria) this;
        }

        public Criteria andTotLinesEqualTo(Long value) {
            addCriterion("t1.TOT_LINES =", value, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesNotEqualTo(Long value) {
            addCriterion("t1.TOT_LINES <>", value, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesGreaterThan(Long value) {
            addCriterion("t1.TOT_LINES >", value, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.TOT_LINES >=", value, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesLessThan(Long value) {
            addCriterion("t1.TOT_LINES <", value, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesLessThanOrEqualTo(Long value) {
            addCriterion("t1.TOT_LINES <=", value, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesIn(List<Long> values) {
            addCriterion("t1.TOT_LINES in", values, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesNotIn(List<Long> values) {
            addCriterion("t1.TOT_LINES not in", values, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesBetween(Long value1, Long value2) {
            addCriterion("t1.TOT_LINES between", value1, value2, "totLines");
            return (Criteria) this;
        }

        public Criteria andTotLinesNotBetween(Long value1, Long value2) {
            addCriterion("t1.TOT_LINES not between", value1, value2, "totLines");
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

        public Criteria andTotAmtListIsNull() {
            addCriterion("t1.TOT_AMT_LIST is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtListIsNotNull() {
            addCriterion("t1.TOT_AMT_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtListEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_LIST =", value, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_LIST <>", value, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMT_LIST >", value, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_LIST >=", value, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMT_LIST <", value, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_LIST <=", value, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMT_LIST in", values, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMT_LIST not in", values, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMT_LIST between", value1, value2, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtListNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMT_LIST not between", value1, value2, "totAmtList");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualIsNull() {
            addCriterion("t1.TOT_AMT_ACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualIsNotNull() {
            addCriterion("t1.TOT_AMT_ACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualEqualTo(Short value) {
            addCriterion("t1.TOT_AMT_ACTUAL =", value, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualNotEqualTo(Short value) {
            addCriterion("t1.TOT_AMT_ACTUAL <>", value, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualGreaterThan(Short value) {
            addCriterion("t1.TOT_AMT_ACTUAL >", value, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.TOT_AMT_ACTUAL >=", value, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualLessThan(Short value) {
            addCriterion("t1.TOT_AMT_ACTUAL <", value, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualLessThanOrEqualTo(Short value) {
            addCriterion("t1.TOT_AMT_ACTUAL <=", value, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualIn(List<Short> values) {
            addCriterion("t1.TOT_AMT_ACTUAL in", values, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualNotIn(List<Short> values) {
            addCriterion("t1.TOT_AMT_ACTUAL not in", values, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualBetween(Short value1, Short value2) {
            addCriterion("t1.TOT_AMT_ACTUAL between", value1, value2, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtActualNotBetween(Short value1, Short value2) {
            addCriterion("t1.TOT_AMT_ACTUAL not between", value1, value2, "totAmtActual");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdIsNull() {
            addCriterion("t1.C_PERIOD_ID is null");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdIsNotNull() {
            addCriterion("t1.C_PERIOD_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdEqualTo(Long value) {
            addCriterion("t1.C_PERIOD_ID =", value, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdNotEqualTo(Long value) {
            addCriterion("t1.C_PERIOD_ID <>", value, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdGreaterThan(Long value) {
            addCriterion("t1.C_PERIOD_ID >", value, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_PERIOD_ID >=", value, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdLessThan(Long value) {
            addCriterion("t1.C_PERIOD_ID <", value, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_PERIOD_ID <=", value, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdIn(List<Long> values) {
            addCriterion("t1.C_PERIOD_ID in", values, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdNotIn(List<Long> values) {
            addCriterion("t1.C_PERIOD_ID not in", values, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_PERIOD_ID between", value1, value2, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCPeriodIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_PERIOD_ID not between", value1, value2, "cPeriodId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdIsNull() {
            addCriterion("t1.C_ORIG_ID is null");
            return (Criteria) this;
        }

        public Criteria andCOrigIdIsNotNull() {
            addCriterion("t1.C_ORIG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCOrigIdEqualTo(Long value) {
            addCriterion("t1.C_ORIG_ID =", value, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdNotEqualTo(Long value) {
            addCriterion("t1.C_ORIG_ID <>", value, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdGreaterThan(Long value) {
            addCriterion("t1.C_ORIG_ID >", value, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_ORIG_ID >=", value, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdLessThan(Long value) {
            addCriterion("t1.C_ORIG_ID <", value, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_ORIG_ID <=", value, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdIn(List<Long> values) {
            addCriterion("t1.C_ORIG_ID in", values, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdNotIn(List<Long> values) {
            addCriterion("t1.C_ORIG_ID not in", values, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_ORIG_ID between", value1, value2, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andCOrigIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_ORIG_ID not between", value1, value2, "cOrigId");
            return (Criteria) this;
        }

        public Criteria andOutStatusIsNull() {
            addCriterion("t1.OUT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOutStatusIsNotNull() {
            addCriterion("t1.OUT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOutStatusEqualTo(Short value) {
            addCriterion("t1.OUT_STATUS =", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotEqualTo(Short value) {
            addCriterion("t1.OUT_STATUS <>", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThan(Short value) {
            addCriterion("t1.OUT_STATUS >", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.OUT_STATUS >=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThan(Short value) {
            addCriterion("t1.OUT_STATUS <", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.OUT_STATUS <=", value, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusIn(List<Short> values) {
            addCriterion("t1.OUT_STATUS in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotIn(List<Short> values) {
            addCriterion("t1.OUT_STATUS not in", values, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusBetween(Short value1, Short value2) {
            addCriterion("t1.OUT_STATUS between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andOutStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.OUT_STATUS not between", value1, value2, "outStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusIsNull() {
            addCriterion("t1.IN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andInStatusIsNotNull() {
            addCriterion("t1.IN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andInStatusEqualTo(Short value) {
            addCriterion("t1.IN_STATUS =", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusNotEqualTo(Short value) {
            addCriterion("t1.IN_STATUS <>", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusGreaterThan(Short value) {
            addCriterion("t1.IN_STATUS >", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.IN_STATUS >=", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusLessThan(Short value) {
            addCriterion("t1.IN_STATUS <", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.IN_STATUS <=", value, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusIn(List<Short> values) {
            addCriterion("t1.IN_STATUS in", values, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusNotIn(List<Short> values) {
            addCriterion("t1.IN_STATUS not in", values, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusBetween(Short value1, Short value2) {
            addCriterion("t1.IN_STATUS between", value1, value2, "inStatus");
            return (Criteria) this;
        }

        public Criteria andInStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.IN_STATUS not between", value1, value2, "inStatus");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutIsNull() {
            addCriterion("t1.TOT_QTYOUT is null");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutIsNotNull() {
            addCriterion("t1.TOT_QTYOUT is not null");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutEqualTo(Long value) {
            addCriterion("t1.TOT_QTYOUT =", value, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutNotEqualTo(Long value) {
            addCriterion("t1.TOT_QTYOUT <>", value, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutGreaterThan(Long value) {
            addCriterion("t1.TOT_QTYOUT >", value, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.TOT_QTYOUT >=", value, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutLessThan(Long value) {
            addCriterion("t1.TOT_QTYOUT <", value, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutLessThanOrEqualTo(Long value) {
            addCriterion("t1.TOT_QTYOUT <=", value, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutIn(List<Long> values) {
            addCriterion("t1.TOT_QTYOUT in", values, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutNotIn(List<Long> values) {
            addCriterion("t1.TOT_QTYOUT not in", values, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutBetween(Long value1, Long value2) {
            addCriterion("t1.TOT_QTYOUT between", value1, value2, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotQtyoutNotBetween(Long value1, Long value2) {
            addCriterion("t1.TOT_QTYOUT not between", value1, value2, "totQtyout");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListIsNull() {
            addCriterion("t1.TOT_AMTOUT_LIST is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListIsNotNull() {
            addCriterion("t1.TOT_AMTOUT_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_LIST =", value, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_LIST <>", value, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_LIST >", value, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_LIST >=", value, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_LIST <", value, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_LIST <=", value, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTOUT_LIST in", values, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTOUT_LIST not in", values, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTOUT_LIST between", value1, value2, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutListNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTOUT_LIST not between", value1, value2, "totAmtoutList");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualIsNull() {
            addCriterion("t1.TOT_AMTOUT_ACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualIsNotNull() {
            addCriterion("t1.TOT_AMTOUT_ACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL =", value, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL <>", value, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL >", value, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL >=", value, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL <", value, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL <=", value, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL in", values, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL not in", values, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL between", value1, value2, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtoutActualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTOUT_ACTUAL not between", value1, value2, "totAmtoutActual");
            return (Criteria) this;
        }

        public Criteria andTotQtyinIsNull() {
            addCriterion("t1.TOT_QTYIN is null");
            return (Criteria) this;
        }

        public Criteria andTotQtyinIsNotNull() {
            addCriterion("t1.TOT_QTYIN is not null");
            return (Criteria) this;
        }

        public Criteria andTotQtyinEqualTo(Long value) {
            addCriterion("t1.TOT_QTYIN =", value, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinNotEqualTo(Long value) {
            addCriterion("t1.TOT_QTYIN <>", value, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinGreaterThan(Long value) {
            addCriterion("t1.TOT_QTYIN >", value, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.TOT_QTYIN >=", value, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinLessThan(Long value) {
            addCriterion("t1.TOT_QTYIN <", value, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinLessThanOrEqualTo(Long value) {
            addCriterion("t1.TOT_QTYIN <=", value, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinIn(List<Long> values) {
            addCriterion("t1.TOT_QTYIN in", values, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinNotIn(List<Long> values) {
            addCriterion("t1.TOT_QTYIN not in", values, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinBetween(Long value1, Long value2) {
            addCriterion("t1.TOT_QTYIN between", value1, value2, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotQtyinNotBetween(Long value1, Long value2) {
            addCriterion("t1.TOT_QTYIN not between", value1, value2, "totQtyin");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListIsNull() {
            addCriterion("t1.TOT_AMTIN_LIST is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListIsNotNull() {
            addCriterion("t1.TOT_AMTIN_LIST is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_LIST =", value, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_LIST <>", value, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_LIST >", value, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_LIST >=", value, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_LIST <", value, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_LIST <=", value, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTIN_LIST in", values, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTIN_LIST not in", values, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTIN_LIST between", value1, value2, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinListNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTIN_LIST not between", value1, value2, "totAmtinList");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualIsNull() {
            addCriterion("t1.TOT_AMTIN_ACTUAL is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualIsNotNull() {
            addCriterion("t1.TOT_AMTIN_ACTUAL is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_ACTUAL =", value, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_ACTUAL <>", value, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_ACTUAL >", value, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_ACTUAL >=", value, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_ACTUAL <", value, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_ACTUAL <=", value, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTIN_ACTUAL in", values, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTIN_ACTUAL not in", values, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTIN_ACTUAL between", value1, value2, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andTotAmtinActualNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTIN_ACTUAL not between", value1, value2, "totAmtinActual");
            return (Criteria) this;
        }

        public Criteria andDiffreasonIsNull() {
            addCriterion("t1.DIFFREASON is null");
            return (Criteria) this;
        }

        public Criteria andDiffreasonIsNotNull() {
            addCriterion("t1.DIFFREASON is not null");
            return (Criteria) this;
        }

        public Criteria andDiffreasonEqualTo(String value) {
            addCriterion("t1.DIFFREASON =", value, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonNotEqualTo(String value) {
            addCriterion("t1.DIFFREASON <>", value, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonGreaterThan(String value) {
            addCriterion("t1.DIFFREASON >", value, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonGreaterThanOrEqualTo(String value) {
            addCriterion("t1.DIFFREASON >=", value, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonLessThan(String value) {
            addCriterion("t1.DIFFREASON <", value, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonLessThanOrEqualTo(String value) {
            addCriterion("t1.DIFFREASON <=", value, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonLike(String value) {
            addCriterion("t1.DIFFREASON like", value, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonNotLike(String value) {
            addCriterion("t1.DIFFREASON not like", value, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonIn(List<String> values) {
            addCriterion("t1.DIFFREASON in", values, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonNotIn(List<String> values) {
            addCriterion("t1.DIFFREASON not in", values, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonBetween(String value1, String value2) {
            addCriterion("t1.DIFFREASON between", value1, value2, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDiffreasonNotBetween(String value1, String value2) {
            addCriterion("t1.DIFFREASON not between", value1, value2, "diffreason");
            return (Criteria) this;
        }

        public Criteria andDateoutIsNull() {
            addCriterion("t1.DATEOUT is null");
            return (Criteria) this;
        }

        public Criteria andDateoutIsNotNull() {
            addCriterion("t1.DATEOUT is not null");
            return (Criteria) this;
        }

        public Criteria andDateoutEqualTo(Integer value) {
            addCriterion("t1.DATEOUT =", value, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutNotEqualTo(Integer value) {
            addCriterion("t1.DATEOUT <>", value, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutGreaterThan(Integer value) {
            addCriterion("t1.DATEOUT >", value, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.DATEOUT >=", value, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutLessThan(Integer value) {
            addCriterion("t1.DATEOUT <", value, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutLessThanOrEqualTo(Integer value) {
            addCriterion("t1.DATEOUT <=", value, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutIn(List<Integer> values) {
            addCriterion("t1.DATEOUT in", values, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutNotIn(List<Integer> values) {
            addCriterion("t1.DATEOUT not in", values, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutBetween(Integer value1, Integer value2) {
            addCriterion("t1.DATEOUT between", value1, value2, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateoutNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.DATEOUT not between", value1, value2, "dateout");
            return (Criteria) this;
        }

        public Criteria andDateinIsNull() {
            addCriterion("t1.DATEIN is null");
            return (Criteria) this;
        }

        public Criteria andDateinIsNotNull() {
            addCriterion("t1.DATEIN is not null");
            return (Criteria) this;
        }

        public Criteria andDateinEqualTo(Integer value) {
            addCriterion("t1.DATEIN =", value, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinNotEqualTo(Integer value) {
            addCriterion("t1.DATEIN <>", value, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinGreaterThan(Integer value) {
            addCriterion("t1.DATEIN >", value, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.DATEIN >=", value, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinLessThan(Integer value) {
            addCriterion("t1.DATEIN <", value, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinLessThanOrEqualTo(Integer value) {
            addCriterion("t1.DATEIN <=", value, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinIn(List<Integer> values) {
            addCriterion("t1.DATEIN in", values, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinNotIn(List<Integer> values) {
            addCriterion("t1.DATEIN not in", values, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinBetween(Integer value1, Integer value2) {
            addCriterion("t1.DATEIN between", value1, value2, "datein");
            return (Criteria) this;
        }

        public Criteria andDateinNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.DATEIN not between", value1, value2, "datein");
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

        public Criteria andRetsaletypeIsNull() {
            addCriterion("t1.RETSALETYPE is null");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeIsNotNull() {
            addCriterion("t1.RETSALETYPE is not null");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeEqualTo(String value) {
            addCriterion("t1.RETSALETYPE =", value, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeNotEqualTo(String value) {
            addCriterion("t1.RETSALETYPE <>", value, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeGreaterThan(String value) {
            addCriterion("t1.RETSALETYPE >", value, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeGreaterThanOrEqualTo(String value) {
            addCriterion("t1.RETSALETYPE >=", value, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeLessThan(String value) {
            addCriterion("t1.RETSALETYPE <", value, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeLessThanOrEqualTo(String value) {
            addCriterion("t1.RETSALETYPE <=", value, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeLike(String value) {
            addCriterion("t1.RETSALETYPE like", value, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeNotLike(String value) {
            addCriterion("t1.RETSALETYPE not like", value, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeIn(List<String> values) {
            addCriterion("t1.RETSALETYPE in", values, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeNotIn(List<String> values) {
            addCriterion("t1.RETSALETYPE not in", values, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeBetween(String value1, String value2) {
            addCriterion("t1.RETSALETYPE between", value1, value2, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletypeNotBetween(String value1, String value2) {
            addCriterion("t1.RETSALETYPE not between", value1, value2, "retsaletype");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1IsNull() {
            addCriterion("t1.RETSALETYPE1 is null");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1IsNotNull() {
            addCriterion("t1.RETSALETYPE1 is not null");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1EqualTo(String value) {
            addCriterion("t1.RETSALETYPE1 =", value, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1NotEqualTo(String value) {
            addCriterion("t1.RETSALETYPE1 <>", value, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1GreaterThan(String value) {
            addCriterion("t1.RETSALETYPE1 >", value, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1GreaterThanOrEqualTo(String value) {
            addCriterion("t1.RETSALETYPE1 >=", value, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1LessThan(String value) {
            addCriterion("t1.RETSALETYPE1 <", value, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1LessThanOrEqualTo(String value) {
            addCriterion("t1.RETSALETYPE1 <=", value, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1Like(String value) {
            addCriterion("t1.RETSALETYPE1 like", value, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1NotLike(String value) {
            addCriterion("t1.RETSALETYPE1 not like", value, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1In(List<String> values) {
            addCriterion("t1.RETSALETYPE1 in", values, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1NotIn(List<String> values) {
            addCriterion("t1.RETSALETYPE1 not in", values, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1Between(String value1, String value2) {
            addCriterion("t1.RETSALETYPE1 between", value1, value2, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andRetsaletype1NotBetween(String value1, String value2) {
            addCriterion("t1.RETSALETYPE1 not between", value1, value2, "retsaletype1");
            return (Criteria) this;
        }

        public Criteria andStatuseridIsNull() {
            addCriterion("t1.STATUSERID is null");
            return (Criteria) this;
        }

        public Criteria andStatuseridIsNotNull() {
            addCriterion("t1.STATUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andStatuseridEqualTo(Long value) {
            addCriterion("t1.STATUSERID =", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridNotEqualTo(Long value) {
            addCriterion("t1.STATUSERID <>", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridGreaterThan(Long value) {
            addCriterion("t1.STATUSERID >", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.STATUSERID >=", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridLessThan(Long value) {
            addCriterion("t1.STATUSERID <", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridLessThanOrEqualTo(Long value) {
            addCriterion("t1.STATUSERID <=", value, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridIn(List<Long> values) {
            addCriterion("t1.STATUSERID in", values, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridNotIn(List<Long> values) {
            addCriterion("t1.STATUSERID not in", values, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridBetween(Long value1, Long value2) {
            addCriterion("t1.STATUSERID between", value1, value2, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatuseridNotBetween(Long value1, Long value2) {
            addCriterion("t1.STATUSERID not between", value1, value2, "statuserid");
            return (Criteria) this;
        }

        public Criteria andStatustimeIsNull() {
            addCriterion("t1.STATUSTIME is null");
            return (Criteria) this;
        }

        public Criteria andStatustimeIsNotNull() {
            addCriterion("t1.STATUSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andStatustimeEqualTo(Date value) {
            addCriterion("t1.STATUSTIME =", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotEqualTo(Date value) {
            addCriterion("t1.STATUSTIME <>", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeGreaterThan(Date value) {
            addCriterion("t1.STATUSTIME >", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.STATUSTIME >=", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeLessThan(Date value) {
            addCriterion("t1.STATUSTIME <", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeLessThanOrEqualTo(Date value) {
            addCriterion("t1.STATUSTIME <=", value, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeIn(List<Date> values) {
            addCriterion("t1.STATUSTIME in", values, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotIn(List<Date> values) {
            addCriterion("t1.STATUSTIME not in", values, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeBetween(Date value1, Date value2) {
            addCriterion("t1.STATUSTIME between", value1, value2, "statustime");
            return (Criteria) this;
        }

        public Criteria andStatustimeNotBetween(Date value1, Date value2) {
            addCriterion("t1.STATUSTIME not between", value1, value2, "statustime");
            return (Criteria) this;
        }

        public Criteria andIneridIsNull() {
            addCriterion("t1.INERID is null");
            return (Criteria) this;
        }

        public Criteria andIneridIsNotNull() {
            addCriterion("t1.INERID is not null");
            return (Criteria) this;
        }

        public Criteria andIneridEqualTo(Long value) {
            addCriterion("t1.INERID =", value, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridNotEqualTo(Long value) {
            addCriterion("t1.INERID <>", value, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridGreaterThan(Long value) {
            addCriterion("t1.INERID >", value, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.INERID >=", value, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridLessThan(Long value) {
            addCriterion("t1.INERID <", value, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridLessThanOrEqualTo(Long value) {
            addCriterion("t1.INERID <=", value, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridIn(List<Long> values) {
            addCriterion("t1.INERID in", values, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridNotIn(List<Long> values) {
            addCriterion("t1.INERID not in", values, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridBetween(Long value1, Long value2) {
            addCriterion("t1.INERID between", value1, value2, "inerid");
            return (Criteria) this;
        }

        public Criteria andIneridNotBetween(Long value1, Long value2) {
            addCriterion("t1.INERID not between", value1, value2, "inerid");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNull() {
            addCriterion("t1.INTIME is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("t1.INTIME is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(Date value) {
            addCriterion("t1.INTIME =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(Date value) {
            addCriterion("t1.INTIME <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(Date value) {
            addCriterion("t1.INTIME >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.INTIME >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(Date value) {
            addCriterion("t1.INTIME <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(Date value) {
            addCriterion("t1.INTIME <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<Date> values) {
            addCriterion("t1.INTIME in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<Date> values) {
            addCriterion("t1.INTIME not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(Date value1, Date value2) {
            addCriterion("t1.INTIME between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(Date value1, Date value2) {
            addCriterion("t1.INTIME not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andOuteridIsNull() {
            addCriterion("t1.OUTERID is null");
            return (Criteria) this;
        }

        public Criteria andOuteridIsNotNull() {
            addCriterion("t1.OUTERID is not null");
            return (Criteria) this;
        }

        public Criteria andOuteridEqualTo(Long value) {
            addCriterion("t1.OUTERID =", value, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridNotEqualTo(Long value) {
            addCriterion("t1.OUTERID <>", value, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridGreaterThan(Long value) {
            addCriterion("t1.OUTERID >", value, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.OUTERID >=", value, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridLessThan(Long value) {
            addCriterion("t1.OUTERID <", value, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridLessThanOrEqualTo(Long value) {
            addCriterion("t1.OUTERID <=", value, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridIn(List<Long> values) {
            addCriterion("t1.OUTERID in", values, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridNotIn(List<Long> values) {
            addCriterion("t1.OUTERID not in", values, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridBetween(Long value1, Long value2) {
            addCriterion("t1.OUTERID between", value1, value2, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuteridNotBetween(Long value1, Long value2) {
            addCriterion("t1.OUTERID not between", value1, value2, "outerid");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNull() {
            addCriterion("t1.OUTTIME is null");
            return (Criteria) this;
        }

        public Criteria andOuttimeIsNotNull() {
            addCriterion("t1.OUTTIME is not null");
            return (Criteria) this;
        }

        public Criteria andOuttimeEqualTo(Date value) {
            addCriterion("t1.OUTTIME =", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotEqualTo(Date value) {
            addCriterion("t1.OUTTIME <>", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThan(Date value) {
            addCriterion("t1.OUTTIME >", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.OUTTIME >=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThan(Date value) {
            addCriterion("t1.OUTTIME <", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeLessThanOrEqualTo(Date value) {
            addCriterion("t1.OUTTIME <=", value, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeIn(List<Date> values) {
            addCriterion("t1.OUTTIME in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotIn(List<Date> values) {
            addCriterion("t1.OUTTIME not in", values, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeBetween(Date value1, Date value2) {
            addCriterion("t1.OUTTIME between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andOuttimeNotBetween(Date value1, Date value2) {
            addCriterion("t1.OUTTIME not between", value1, value2, "outtime");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdIsNull() {
            addCriterion("t1.C_RET_SALETYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdIsNotNull() {
            addCriterion("t1.C_RET_SALETYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdEqualTo(Long value) {
            addCriterion("t1.C_RET_SALETYPE_ID =", value, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdNotEqualTo(Long value) {
            addCriterion("t1.C_RET_SALETYPE_ID <>", value, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdGreaterThan(Long value) {
            addCriterion("t1.C_RET_SALETYPE_ID >", value, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_RET_SALETYPE_ID >=", value, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdLessThan(Long value) {
            addCriterion("t1.C_RET_SALETYPE_ID <", value, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_RET_SALETYPE_ID <=", value, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdIn(List<Long> values) {
            addCriterion("t1.C_RET_SALETYPE_ID in", values, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdNotIn(List<Long> values) {
            addCriterion("t1.C_RET_SALETYPE_ID not in", values, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_RET_SALETYPE_ID between", value1, value2, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andCRetSaletypeIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_RET_SALETYPE_ID not between", value1, value2, "cRetSaletypeId");
            return (Criteria) this;
        }

        public Criteria andBoxStatusIsNull() {
            addCriterion("t1.BOX_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andBoxStatusIsNotNull() {
            addCriterion("t1.BOX_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andBoxStatusEqualTo(Short value) {
            addCriterion("t1.BOX_STATUS =", value, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusNotEqualTo(Short value) {
            addCriterion("t1.BOX_STATUS <>", value, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusGreaterThan(Short value) {
            addCriterion("t1.BOX_STATUS >", value, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.BOX_STATUS >=", value, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusLessThan(Short value) {
            addCriterion("t1.BOX_STATUS <", value, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.BOX_STATUS <=", value, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusIn(List<Short> values) {
            addCriterion("t1.BOX_STATUS in", values, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusNotIn(List<Short> values) {
            addCriterion("t1.BOX_STATUS not in", values, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusBetween(Short value1, Short value2) {
            addCriterion("t1.BOX_STATUS between", value1, value2, "boxStatus");
            return (Criteria) this;
        }

        public Criteria andBoxStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.BOX_STATUS not between", value1, value2, "boxStatus");
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

        public Criteria andTranwaynoIsNull() {
            addCriterion("t1.TRANWAYNO is null");
            return (Criteria) this;
        }

        public Criteria andTranwaynoIsNotNull() {
            addCriterion("t1.TRANWAYNO is not null");
            return (Criteria) this;
        }

        public Criteria andTranwaynoEqualTo(String value) {
            addCriterion("t1.TRANWAYNO =", value, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoNotEqualTo(String value) {
            addCriterion("t1.TRANWAYNO <>", value, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoGreaterThan(String value) {
            addCriterion("t1.TRANWAYNO >", value, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.TRANWAYNO >=", value, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoLessThan(String value) {
            addCriterion("t1.TRANWAYNO <", value, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoLessThanOrEqualTo(String value) {
            addCriterion("t1.TRANWAYNO <=", value, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoLike(String value) {
            addCriterion("t1.TRANWAYNO like", value, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoNotLike(String value) {
            addCriterion("t1.TRANWAYNO not like", value, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoIn(List<String> values) {
            addCriterion("t1.TRANWAYNO in", values, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoNotIn(List<String> values) {
            addCriterion("t1.TRANWAYNO not in", values, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoBetween(String value1, String value2) {
            addCriterion("t1.TRANWAYNO between", value1, value2, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwaynoNotBetween(String value1, String value2) {
            addCriterion("t1.TRANWAYNO not between", value1, value2, "tranwayno");
            return (Criteria) this;
        }

        public Criteria andTranwayPayIsNull() {
            addCriterion("t1.TRANWAY_PAY is null");
            return (Criteria) this;
        }

        public Criteria andTranwayPayIsNotNull() {
            addCriterion("t1.TRANWAY_PAY is not null");
            return (Criteria) this;
        }

        public Criteria andTranwayPayEqualTo(BigDecimal value) {
            addCriterion("t1.TRANWAY_PAY =", value, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayNotEqualTo(BigDecimal value) {
            addCriterion("t1.TRANWAY_PAY <>", value, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayGreaterThan(BigDecimal value) {
            addCriterion("t1.TRANWAY_PAY >", value, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TRANWAY_PAY >=", value, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayLessThan(BigDecimal value) {
            addCriterion("t1.TRANWAY_PAY <", value, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TRANWAY_PAY <=", value, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayIn(List<BigDecimal> values) {
            addCriterion("t1.TRANWAY_PAY in", values, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayNotIn(List<BigDecimal> values) {
            addCriterion("t1.TRANWAY_PAY not in", values, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TRANWAY_PAY between", value1, value2, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andTranwayPayNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TRANWAY_PAY not between", value1, value2, "tranwayPay");
            return (Criteria) this;
        }

        public Criteria andOperatoeridIsNull() {
            addCriterion("t1.OPERATOERID is null");
            return (Criteria) this;
        }

        public Criteria andOperatoeridIsNotNull() {
            addCriterion("t1.OPERATOERID is not null");
            return (Criteria) this;
        }

        public Criteria andOperatoeridEqualTo(Long value) {
            addCriterion("t1.OPERATOERID =", value, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridNotEqualTo(Long value) {
            addCriterion("t1.OPERATOERID <>", value, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridGreaterThan(Long value) {
            addCriterion("t1.OPERATOERID >", value, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.OPERATOERID >=", value, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridLessThan(Long value) {
            addCriterion("t1.OPERATOERID <", value, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridLessThanOrEqualTo(Long value) {
            addCriterion("t1.OPERATOERID <=", value, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridIn(List<Long> values) {
            addCriterion("t1.OPERATOERID in", values, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridNotIn(List<Long> values) {
            addCriterion("t1.OPERATOERID not in", values, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridBetween(Long value1, Long value2) {
            addCriterion("t1.OPERATOERID between", value1, value2, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperatoeridNotBetween(Long value1, Long value2) {
            addCriterion("t1.OPERATOERID not between", value1, value2, "operatoerid");
            return (Criteria) this;
        }

        public Criteria andOperStatusIsNull() {
            addCriterion("t1.OPER_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andOperStatusIsNotNull() {
            addCriterion("t1.OPER_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andOperStatusEqualTo(String value) {
            addCriterion("t1.OPER_STATUS =", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusNotEqualTo(String value) {
            addCriterion("t1.OPER_STATUS <>", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusGreaterThan(String value) {
            addCriterion("t1.OPER_STATUS >", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusGreaterThanOrEqualTo(String value) {
            addCriterion("t1.OPER_STATUS >=", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusLessThan(String value) {
            addCriterion("t1.OPER_STATUS <", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusLessThanOrEqualTo(String value) {
            addCriterion("t1.OPER_STATUS <=", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusLike(String value) {
            addCriterion("t1.OPER_STATUS like", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusNotLike(String value) {
            addCriterion("t1.OPER_STATUS not like", value, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusIn(List<String> values) {
            addCriterion("t1.OPER_STATUS in", values, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusNotIn(List<String> values) {
            addCriterion("t1.OPER_STATUS not in", values, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusBetween(String value1, String value2) {
            addCriterion("t1.OPER_STATUS between", value1, value2, "operStatus");
            return (Criteria) this;
        }

        public Criteria andOperStatusNotBetween(String value1, String value2) {
            addCriterion("t1.OPER_STATUS not between", value1, value2, "operStatus");
            return (Criteria) this;
        }

        public Criteria andPickeridIsNull() {
            addCriterion("t1.PICKERID is null");
            return (Criteria) this;
        }

        public Criteria andPickeridIsNotNull() {
            addCriterion("t1.PICKERID is not null");
            return (Criteria) this;
        }

        public Criteria andPickeridEqualTo(Long value) {
            addCriterion("t1.PICKERID =", value, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridNotEqualTo(Long value) {
            addCriterion("t1.PICKERID <>", value, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridGreaterThan(Long value) {
            addCriterion("t1.PICKERID >", value, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.PICKERID >=", value, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridLessThan(Long value) {
            addCriterion("t1.PICKERID <", value, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridLessThanOrEqualTo(Long value) {
            addCriterion("t1.PICKERID <=", value, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridIn(List<Long> values) {
            addCriterion("t1.PICKERID in", values, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridNotIn(List<Long> values) {
            addCriterion("t1.PICKERID not in", values, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridBetween(Long value1, Long value2) {
            addCriterion("t1.PICKERID between", value1, value2, "pickerid");
            return (Criteria) this;
        }

        public Criteria andPickeridNotBetween(Long value1, Long value2) {
            addCriterion("t1.PICKERID not between", value1, value2, "pickerid");
            return (Criteria) this;
        }

        public Criteria andIsufIsNull() {
            addCriterion("t1.ISUF is null");
            return (Criteria) this;
        }

        public Criteria andIsufIsNotNull() {
            addCriterion("t1.ISUF is not null");
            return (Criteria) this;
        }

        public Criteria andIsufEqualTo(String value) {
            addCriterion("t1.ISUF =", value, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufNotEqualTo(String value) {
            addCriterion("t1.ISUF <>", value, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufGreaterThan(String value) {
            addCriterion("t1.ISUF >", value, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISUF >=", value, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufLessThan(String value) {
            addCriterion("t1.ISUF <", value, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufLessThanOrEqualTo(String value) {
            addCriterion("t1.ISUF <=", value, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufLike(String value) {
            addCriterion("t1.ISUF like", value, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufNotLike(String value) {
            addCriterion("t1.ISUF not like", value, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufIn(List<String> values) {
            addCriterion("t1.ISUF in", values, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufNotIn(List<String> values) {
            addCriterion("t1.ISUF not in", values, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufBetween(String value1, String value2) {
            addCriterion("t1.ISUF between", value1, value2, "isuf");
            return (Criteria) this;
        }

        public Criteria andIsufNotBetween(String value1, String value2) {
            addCriterion("t1.ISUF not between", value1, value2, "isuf");
            return (Criteria) this;
        }

        public Criteria andProcessModeIsNull() {
            addCriterion("t1.PROCESS_MODE is null");
            return (Criteria) this;
        }

        public Criteria andProcessModeIsNotNull() {
            addCriterion("t1.PROCESS_MODE is not null");
            return (Criteria) this;
        }

        public Criteria andProcessModeEqualTo(Short value) {
            addCriterion("t1.PROCESS_MODE =", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeNotEqualTo(Short value) {
            addCriterion("t1.PROCESS_MODE <>", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeGreaterThan(Short value) {
            addCriterion("t1.PROCESS_MODE >", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.PROCESS_MODE >=", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeLessThan(Short value) {
            addCriterion("t1.PROCESS_MODE <", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeLessThanOrEqualTo(Short value) {
            addCriterion("t1.PROCESS_MODE <=", value, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeIn(List<Short> values) {
            addCriterion("t1.PROCESS_MODE in", values, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeNotIn(List<Short> values) {
            addCriterion("t1.PROCESS_MODE not in", values, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeBetween(Short value1, Short value2) {
            addCriterion("t1.PROCESS_MODE between", value1, value2, "processMode");
            return (Criteria) this;
        }

        public Criteria andProcessModeNotBetween(Short value1, Short value2) {
            addCriterion("t1.PROCESS_MODE not between", value1, value2, "processMode");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostIsNull() {
            addCriterion("t1.TOT_AMT_PRECOST is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostIsNotNull() {
            addCriterion("t1.TOT_AMT_PRECOST is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRECOST =", value, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRECOST <>", value, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRECOST >", value, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRECOST >=", value, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRECOST <", value, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRECOST <=", value, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMT_PRECOST in", values, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMT_PRECOST not in", values, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMT_PRECOST between", value1, value2, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtPrecostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMT_PRECOST not between", value1, value2, "totAmtPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostIsNull() {
            addCriterion("t1.TOT_AMTIN_PRECOST is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostIsNotNull() {
            addCriterion("t1.TOT_AMTIN_PRECOST is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_PRECOST =", value, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_PRECOST <>", value, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_PRECOST >", value, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_PRECOST >=", value, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_PRECOST <", value, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTIN_PRECOST <=", value, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTIN_PRECOST in", values, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTIN_PRECOST not in", values, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTIN_PRECOST between", value1, value2, "totAmtinPrecost");
            return (Criteria) this;
        }

        public Criteria andTotAmtinPrecostNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTIN_PRECOST not between", value1, value2, "totAmtinPrecost");
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

        public Criteria andIsboxIsNull() {
            addCriterion("t1.ISBOX is null");
            return (Criteria) this;
        }

        public Criteria andIsboxIsNotNull() {
            addCriterion("t1.ISBOX is not null");
            return (Criteria) this;
        }

        public Criteria andIsboxEqualTo(Short value) {
            addCriterion("t1.ISBOX =", value, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxNotEqualTo(Short value) {
            addCriterion("t1.ISBOX <>", value, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxGreaterThan(Short value) {
            addCriterion("t1.ISBOX >", value, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.ISBOX >=", value, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxLessThan(Short value) {
            addCriterion("t1.ISBOX <", value, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxLessThanOrEqualTo(Short value) {
            addCriterion("t1.ISBOX <=", value, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxIn(List<Short> values) {
            addCriterion("t1.ISBOX in", values, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxNotIn(List<Short> values) {
            addCriterion("t1.ISBOX not in", values, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxBetween(Short value1, Short value2) {
            addCriterion("t1.ISBOX between", value1, value2, "isbox");
            return (Criteria) this;
        }

        public Criteria andIsboxNotBetween(Short value1, Short value2) {
            addCriterion("t1.ISBOX not between", value1, value2, "isbox");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdIsNull() {
            addCriterion("t1.C_SALEDISTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdIsNotNull() {
            addCriterion("t1.C_SALEDISTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdEqualTo(Long value) {
            addCriterion("t1.C_SALEDISTYPE_ID =", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdNotEqualTo(Long value) {
            addCriterion("t1.C_SALEDISTYPE_ID <>", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdGreaterThan(Long value) {
            addCriterion("t1.C_SALEDISTYPE_ID >", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_SALEDISTYPE_ID >=", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdLessThan(Long value) {
            addCriterion("t1.C_SALEDISTYPE_ID <", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_SALEDISTYPE_ID <=", value, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdIn(List<Long> values) {
            addCriterion("t1.C_SALEDISTYPE_ID in", values, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdNotIn(List<Long> values) {
            addCriterion("t1.C_SALEDISTYPE_ID not in", values, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_SALEDISTYPE_ID between", value1, value2, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andCSaledistypeIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_SALEDISTYPE_ID not between", value1, value2, "cSaledistypeId");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNull() {
            addCriterion("t1.IMAGEURL is null");
            return (Criteria) this;
        }

        public Criteria andImageurlIsNotNull() {
            addCriterion("t1.IMAGEURL is not null");
            return (Criteria) this;
        }

        public Criteria andImageurlEqualTo(String value) {
            addCriterion("t1.IMAGEURL =", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotEqualTo(String value) {
            addCriterion("t1.IMAGEURL <>", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThan(String value) {
            addCriterion("t1.IMAGEURL >", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IMAGEURL >=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThan(String value) {
            addCriterion("t1.IMAGEURL <", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLessThanOrEqualTo(String value) {
            addCriterion("t1.IMAGEURL <=", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlLike(String value) {
            addCriterion("t1.IMAGEURL like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotLike(String value) {
            addCriterion("t1.IMAGEURL not like", value, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlIn(List<String> values) {
            addCriterion("t1.IMAGEURL in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotIn(List<String> values) {
            addCriterion("t1.IMAGEURL not in", values, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlBetween(String value1, String value2) {
            addCriterion("t1.IMAGEURL between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andImageurlNotBetween(String value1, String value2) {
            addCriterion("t1.IMAGEURL not between", value1, value2, "imageurl");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdIsNull() {
            addCriterion("t1.C_CARGOTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdIsNotNull() {
            addCriterion("t1.C_CARGOTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdEqualTo(Long value) {
            addCriterion("t1.C_CARGOTYPE_ID =", value, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdNotEqualTo(Long value) {
            addCriterion("t1.C_CARGOTYPE_ID <>", value, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdGreaterThan(Long value) {
            addCriterion("t1.C_CARGOTYPE_ID >", value, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_CARGOTYPE_ID >=", value, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdLessThan(Long value) {
            addCriterion("t1.C_CARGOTYPE_ID <", value, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_CARGOTYPE_ID <=", value, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdIn(List<Long> values) {
            addCriterion("t1.C_CARGOTYPE_ID in", values, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdNotIn(List<Long> values) {
            addCriterion("t1.C_CARGOTYPE_ID not in", values, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_CARGOTYPE_ID between", value1, value2, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCCargotypeIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_CARGOTYPE_ID not between", value1, value2, "cCargotypeId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdIsNull() {
            addCriterion("t1.C_STORE_LOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdIsNotNull() {
            addCriterion("t1.C_STORE_LOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdEqualTo(Long value) {
            addCriterion("t1.C_STORE_LOCATION_ID =", value, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdNotEqualTo(Long value) {
            addCriterion("t1.C_STORE_LOCATION_ID <>", value, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdGreaterThan(Long value) {
            addCriterion("t1.C_STORE_LOCATION_ID >", value, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_STORE_LOCATION_ID >=", value, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdLessThan(Long value) {
            addCriterion("t1.C_STORE_LOCATION_ID <", value, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_STORE_LOCATION_ID <=", value, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdIn(List<Long> values) {
            addCriterion("t1.C_STORE_LOCATION_ID in", values, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdNotIn(List<Long> values) {
            addCriterion("t1.C_STORE_LOCATION_ID not in", values, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_STORE_LOCATION_ID between", value1, value2, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andCStoreLocationIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_STORE_LOCATION_ID not between", value1, value2, "cStoreLocationId");
            return (Criteria) this;
        }

        public Criteria andPrinttimesIsNull() {
            addCriterion("t1.PRINTTIMES is null");
            return (Criteria) this;
        }

        public Criteria andPrinttimesIsNotNull() {
            addCriterion("t1.PRINTTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andPrinttimesEqualTo(Long value) {
            addCriterion("t1.PRINTTIMES =", value, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesNotEqualTo(Long value) {
            addCriterion("t1.PRINTTIMES <>", value, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesGreaterThan(Long value) {
            addCriterion("t1.PRINTTIMES >", value, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.PRINTTIMES >=", value, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesLessThan(Long value) {
            addCriterion("t1.PRINTTIMES <", value, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesLessThanOrEqualTo(Long value) {
            addCriterion("t1.PRINTTIMES <=", value, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesIn(List<Long> values) {
            addCriterion("t1.PRINTTIMES in", values, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesNotIn(List<Long> values) {
            addCriterion("t1.PRINTTIMES not in", values, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesBetween(Long value1, Long value2) {
            addCriterion("t1.PRINTTIMES between", value1, value2, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrinttimesNotBetween(Long value1, Long value2) {
            addCriterion("t1.PRINTTIMES not between", value1, value2, "printtimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesIsNull() {
            addCriterion("t1.PRINTOUTTIMES is null");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesIsNotNull() {
            addCriterion("t1.PRINTOUTTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesEqualTo(Long value) {
            addCriterion("t1.PRINTOUTTIMES =", value, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesNotEqualTo(Long value) {
            addCriterion("t1.PRINTOUTTIMES <>", value, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesGreaterThan(Long value) {
            addCriterion("t1.PRINTOUTTIMES >", value, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.PRINTOUTTIMES >=", value, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesLessThan(Long value) {
            addCriterion("t1.PRINTOUTTIMES <", value, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesLessThanOrEqualTo(Long value) {
            addCriterion("t1.PRINTOUTTIMES <=", value, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesIn(List<Long> values) {
            addCriterion("t1.PRINTOUTTIMES in", values, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesNotIn(List<Long> values) {
            addCriterion("t1.PRINTOUTTIMES not in", values, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesBetween(Long value1, Long value2) {
            addCriterion("t1.PRINTOUTTIMES between", value1, value2, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintouttimesNotBetween(Long value1, Long value2) {
            addCriterion("t1.PRINTOUTTIMES not between", value1, value2, "printouttimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesIsNull() {
            addCriterion("t1.PRINTINTIMES is null");
            return (Criteria) this;
        }

        public Criteria andPrintintimesIsNotNull() {
            addCriterion("t1.PRINTINTIMES is not null");
            return (Criteria) this;
        }

        public Criteria andPrintintimesEqualTo(Long value) {
            addCriterion("t1.PRINTINTIMES =", value, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesNotEqualTo(Long value) {
            addCriterion("t1.PRINTINTIMES <>", value, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesGreaterThan(Long value) {
            addCriterion("t1.PRINTINTIMES >", value, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.PRINTINTIMES >=", value, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesLessThan(Long value) {
            addCriterion("t1.PRINTINTIMES <", value, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesLessThanOrEqualTo(Long value) {
            addCriterion("t1.PRINTINTIMES <=", value, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesIn(List<Long> values) {
            addCriterion("t1.PRINTINTIMES in", values, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesNotIn(List<Long> values) {
            addCriterion("t1.PRINTINTIMES not in", values, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesBetween(Long value1, Long value2) {
            addCriterion("t1.PRINTINTIMES between", value1, value2, "printintimes");
            return (Criteria) this;
        }

        public Criteria andPrintintimesNotBetween(Long value1, Long value2) {
            addCriterion("t1.PRINTINTIMES not between", value1, value2, "printintimes");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdIsNull() {
            addCriterion("t1.C_CARGOINTYPE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdIsNotNull() {
            addCriterion("t1.C_CARGOINTYPE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdEqualTo(Long value) {
            addCriterion("t1.C_CARGOINTYPE_ID =", value, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdNotEqualTo(Long value) {
            addCriterion("t1.C_CARGOINTYPE_ID <>", value, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdGreaterThan(Long value) {
            addCriterion("t1.C_CARGOINTYPE_ID >", value, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.C_CARGOINTYPE_ID >=", value, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdLessThan(Long value) {
            addCriterion("t1.C_CARGOINTYPE_ID <", value, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.C_CARGOINTYPE_ID <=", value, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdIn(List<Long> values) {
            addCriterion("t1.C_CARGOINTYPE_ID in", values, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdNotIn(List<Long> values) {
            addCriterion("t1.C_CARGOINTYPE_ID not in", values, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdBetween(Long value1, Long value2) {
            addCriterion("t1.C_CARGOINTYPE_ID between", value1, value2, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andCCargointypeIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.C_CARGOINTYPE_ID not between", value1, value2, "cCargointypeId");
            return (Criteria) this;
        }

        public Criteria andScanstateIsNull() {
            addCriterion("t1.SCANSTATE is null");
            return (Criteria) this;
        }

        public Criteria andScanstateIsNotNull() {
            addCriterion("t1.SCANSTATE is not null");
            return (Criteria) this;
        }

        public Criteria andScanstateEqualTo(String value) {
            addCriterion("t1.SCANSTATE =", value, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateNotEqualTo(String value) {
            addCriterion("t1.SCANSTATE <>", value, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateGreaterThan(String value) {
            addCriterion("t1.SCANSTATE >", value, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateGreaterThanOrEqualTo(String value) {
            addCriterion("t1.SCANSTATE >=", value, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateLessThan(String value) {
            addCriterion("t1.SCANSTATE <", value, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateLessThanOrEqualTo(String value) {
            addCriterion("t1.SCANSTATE <=", value, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateLike(String value) {
            addCriterion("t1.SCANSTATE like", value, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateNotLike(String value) {
            addCriterion("t1.SCANSTATE not like", value, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateIn(List<String> values) {
            addCriterion("t1.SCANSTATE in", values, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateNotIn(List<String> values) {
            addCriterion("t1.SCANSTATE not in", values, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateBetween(String value1, String value2) {
            addCriterion("t1.SCANSTATE between", value1, value2, "scanstate");
            return (Criteria) this;
        }

        public Criteria andScanstateNotBetween(String value1, String value2) {
            addCriterion("t1.SCANSTATE not between", value1, value2, "scanstate");
            return (Criteria) this;
        }

        public Criteria andSendqtyIsNull() {
            addCriterion("t1.SENDQTY is null");
            return (Criteria) this;
        }

        public Criteria andSendqtyIsNotNull() {
            addCriterion("t1.SENDQTY is not null");
            return (Criteria) this;
        }

        public Criteria andSendqtyEqualTo(Long value) {
            addCriterion("t1.SENDQTY =", value, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyNotEqualTo(Long value) {
            addCriterion("t1.SENDQTY <>", value, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyGreaterThan(Long value) {
            addCriterion("t1.SENDQTY >", value, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.SENDQTY >=", value, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyLessThan(Long value) {
            addCriterion("t1.SENDQTY <", value, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyLessThanOrEqualTo(Long value) {
            addCriterion("t1.SENDQTY <=", value, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyIn(List<Long> values) {
            addCriterion("t1.SENDQTY in", values, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyNotIn(List<Long> values) {
            addCriterion("t1.SENDQTY not in", values, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyBetween(Long value1, Long value2) {
            addCriterion("t1.SENDQTY between", value1, value2, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSendqtyNotBetween(Long value1, Long value2) {
            addCriterion("t1.SENDQTY not between", value1, value2, "sendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyIsNull() {
            addCriterion("t1.SUBSENDQTY is null");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyIsNotNull() {
            addCriterion("t1.SUBSENDQTY is not null");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyEqualTo(Long value) {
            addCriterion("t1.SUBSENDQTY =", value, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyNotEqualTo(Long value) {
            addCriterion("t1.SUBSENDQTY <>", value, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyGreaterThan(Long value) {
            addCriterion("t1.SUBSENDQTY >", value, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.SUBSENDQTY >=", value, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyLessThan(Long value) {
            addCriterion("t1.SUBSENDQTY <", value, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyLessThanOrEqualTo(Long value) {
            addCriterion("t1.SUBSENDQTY <=", value, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyIn(List<Long> values) {
            addCriterion("t1.SUBSENDQTY in", values, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyNotIn(List<Long> values) {
            addCriterion("t1.SUBSENDQTY not in", values, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyBetween(Long value1, Long value2) {
            addCriterion("t1.SUBSENDQTY between", value1, value2, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andSubsendqtyNotBetween(Long value1, Long value2) {
            addCriterion("t1.SUBSENDQTY not between", value1, value2, "subsendqty");
            return (Criteria) this;
        }

        public Criteria andRealdateIsNull() {
            addCriterion("t1.REALDATE is null");
            return (Criteria) this;
        }

        public Criteria andRealdateIsNotNull() {
            addCriterion("t1.REALDATE is not null");
            return (Criteria) this;
        }

        public Criteria andRealdateEqualTo(Integer value) {
            addCriterion("t1.REALDATE =", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotEqualTo(Integer value) {
            addCriterion("t1.REALDATE <>", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateGreaterThan(Integer value) {
            addCriterion("t1.REALDATE >", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateGreaterThanOrEqualTo(Integer value) {
            addCriterion("t1.REALDATE >=", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateLessThan(Integer value) {
            addCriterion("t1.REALDATE <", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateLessThanOrEqualTo(Integer value) {
            addCriterion("t1.REALDATE <=", value, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateIn(List<Integer> values) {
            addCriterion("t1.REALDATE in", values, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotIn(List<Integer> values) {
            addCriterion("t1.REALDATE not in", values, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateBetween(Integer value1, Integer value2) {
            addCriterion("t1.REALDATE between", value1, value2, "realdate");
            return (Criteria) this;
        }

        public Criteria andRealdateNotBetween(Integer value1, Integer value2) {
            addCriterion("t1.REALDATE not between", value1, value2, "realdate");
            return (Criteria) this;
        }

        public Criteria andIfmoveIsNull() {
            addCriterion("t1.IFMOVE is null");
            return (Criteria) this;
        }

        public Criteria andIfmoveIsNotNull() {
            addCriterion("t1.IFMOVE is not null");
            return (Criteria) this;
        }

        public Criteria andIfmoveEqualTo(String value) {
            addCriterion("t1.IFMOVE =", value, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveNotEqualTo(String value) {
            addCriterion("t1.IFMOVE <>", value, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveGreaterThan(String value) {
            addCriterion("t1.IFMOVE >", value, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IFMOVE >=", value, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveLessThan(String value) {
            addCriterion("t1.IFMOVE <", value, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveLessThanOrEqualTo(String value) {
            addCriterion("t1.IFMOVE <=", value, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveLike(String value) {
            addCriterion("t1.IFMOVE like", value, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveNotLike(String value) {
            addCriterion("t1.IFMOVE not like", value, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveIn(List<String> values) {
            addCriterion("t1.IFMOVE in", values, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveNotIn(List<String> values) {
            addCriterion("t1.IFMOVE not in", values, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveBetween(String value1, String value2) {
            addCriterion("t1.IFMOVE between", value1, value2, "ifmove");
            return (Criteria) this;
        }

        public Criteria andIfmoveNotBetween(String value1, String value2) {
            addCriterion("t1.IFMOVE not between", value1, value2, "ifmove");
            return (Criteria) this;
        }

        public Criteria andOutAuStateIsNull() {
            addCriterion("t1.OUT_AU_STATE is null");
            return (Criteria) this;
        }

        public Criteria andOutAuStateIsNotNull() {
            addCriterion("t1.OUT_AU_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andOutAuStateEqualTo(String value) {
            addCriterion("t1.OUT_AU_STATE =", value, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateNotEqualTo(String value) {
            addCriterion("t1.OUT_AU_STATE <>", value, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateGreaterThan(String value) {
            addCriterion("t1.OUT_AU_STATE >", value, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateGreaterThanOrEqualTo(String value) {
            addCriterion("t1.OUT_AU_STATE >=", value, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateLessThan(String value) {
            addCriterion("t1.OUT_AU_STATE <", value, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateLessThanOrEqualTo(String value) {
            addCriterion("t1.OUT_AU_STATE <=", value, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateLike(String value) {
            addCriterion("t1.OUT_AU_STATE like", value, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateNotLike(String value) {
            addCriterion("t1.OUT_AU_STATE not like", value, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateIn(List<String> values) {
            addCriterion("t1.OUT_AU_STATE in", values, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateNotIn(List<String> values) {
            addCriterion("t1.OUT_AU_STATE not in", values, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateBetween(String value1, String value2) {
            addCriterion("t1.OUT_AU_STATE between", value1, value2, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuStateNotBetween(String value1, String value2) {
            addCriterion("t1.OUT_AU_STATE not between", value1, value2, "outAuState");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdIsNull() {
            addCriterion("t1.OUT_AU_PI_ID is null");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdIsNotNull() {
            addCriterion("t1.OUT_AU_PI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdEqualTo(Long value) {
            addCriterion("t1.OUT_AU_PI_ID =", value, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdNotEqualTo(Long value) {
            addCriterion("t1.OUT_AU_PI_ID <>", value, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdGreaterThan(Long value) {
            addCriterion("t1.OUT_AU_PI_ID >", value, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.OUT_AU_PI_ID >=", value, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdLessThan(Long value) {
            addCriterion("t1.OUT_AU_PI_ID <", value, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.OUT_AU_PI_ID <=", value, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdIn(List<Long> values) {
            addCriterion("t1.OUT_AU_PI_ID in", values, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdNotIn(List<Long> values) {
            addCriterion("t1.OUT_AU_PI_ID not in", values, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdBetween(Long value1, Long value2) {
            addCriterion("t1.OUT_AU_PI_ID between", value1, value2, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andOutAuPiIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.OUT_AU_PI_ID not between", value1, value2, "outAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuStateIsNull() {
            addCriterion("t1.IN_AU_STATE is null");
            return (Criteria) this;
        }

        public Criteria andInAuStateIsNotNull() {
            addCriterion("t1.IN_AU_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andInAuStateEqualTo(String value) {
            addCriterion("t1.IN_AU_STATE =", value, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateNotEqualTo(String value) {
            addCriterion("t1.IN_AU_STATE <>", value, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateGreaterThan(String value) {
            addCriterion("t1.IN_AU_STATE >", value, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IN_AU_STATE >=", value, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateLessThan(String value) {
            addCriterion("t1.IN_AU_STATE <", value, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateLessThanOrEqualTo(String value) {
            addCriterion("t1.IN_AU_STATE <=", value, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateLike(String value) {
            addCriterion("t1.IN_AU_STATE like", value, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateNotLike(String value) {
            addCriterion("t1.IN_AU_STATE not like", value, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateIn(List<String> values) {
            addCriterion("t1.IN_AU_STATE in", values, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateNotIn(List<String> values) {
            addCriterion("t1.IN_AU_STATE not in", values, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateBetween(String value1, String value2) {
            addCriterion("t1.IN_AU_STATE between", value1, value2, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuStateNotBetween(String value1, String value2) {
            addCriterion("t1.IN_AU_STATE not between", value1, value2, "inAuState");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdIsNull() {
            addCriterion("t1.IN_AU_PI_ID is null");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdIsNotNull() {
            addCriterion("t1.IN_AU_PI_ID is not null");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdEqualTo(Long value) {
            addCriterion("t1.IN_AU_PI_ID =", value, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdNotEqualTo(Long value) {
            addCriterion("t1.IN_AU_PI_ID <>", value, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdGreaterThan(Long value) {
            addCriterion("t1.IN_AU_PI_ID >", value, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.IN_AU_PI_ID >=", value, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdLessThan(Long value) {
            addCriterion("t1.IN_AU_PI_ID <", value, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.IN_AU_PI_ID <=", value, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdIn(List<Long> values) {
            addCriterion("t1.IN_AU_PI_ID in", values, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdNotIn(List<Long> values) {
            addCriterion("t1.IN_AU_PI_ID not in", values, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdBetween(Long value1, Long value2) {
            addCriterion("t1.IN_AU_PI_ID between", value1, value2, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andInAuPiIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.IN_AU_PI_ID not between", value1, value2, "inAuPiId");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceIsNull() {
            addCriterion("t1.TOT_AMT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceIsNotNull() {
            addCriterion("t1.TOT_AMT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRICE =", value, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRICE <>", value, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRICE >", value, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRICE >=", value, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRICE <", value, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMT_PRICE <=", value, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMT_PRICE in", values, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMT_PRICE not in", values, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMT_PRICE between", value1, value2, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andTotAmtPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMT_PRICE not between", value1, value2, "totAmtPrice");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionIsNull() {
            addCriterion("t1.AMT_DEDUCTION is null");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionIsNotNull() {
            addCriterion("t1.AMT_DEDUCTION is not null");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionEqualTo(BigDecimal value) {
            addCriterion("t1.AMT_DEDUCTION =", value, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionNotEqualTo(BigDecimal value) {
            addCriterion("t1.AMT_DEDUCTION <>", value, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionGreaterThan(BigDecimal value) {
            addCriterion("t1.AMT_DEDUCTION >", value, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.AMT_DEDUCTION >=", value, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionLessThan(BigDecimal value) {
            addCriterion("t1.AMT_DEDUCTION <", value, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.AMT_DEDUCTION <=", value, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionIn(List<BigDecimal> values) {
            addCriterion("t1.AMT_DEDUCTION in", values, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionNotIn(List<BigDecimal> values) {
            addCriterion("t1.AMT_DEDUCTION not in", values, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.AMT_DEDUCTION between", value1, value2, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andAmtDeductionNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.AMT_DEDUCTION not between", value1, value2, "amtDeduction");
            return (Criteria) this;
        }

        public Criteria andPckStatusIsNull() {
            addCriterion("t1.PCK_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andPckStatusIsNotNull() {
            addCriterion("t1.PCK_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andPckStatusEqualTo(Short value) {
            addCriterion("t1.PCK_STATUS =", value, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusNotEqualTo(Short value) {
            addCriterion("t1.PCK_STATUS <>", value, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusGreaterThan(Short value) {
            addCriterion("t1.PCK_STATUS >", value, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.PCK_STATUS >=", value, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusLessThan(Short value) {
            addCriterion("t1.PCK_STATUS <", value, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.PCK_STATUS <=", value, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusIn(List<Short> values) {
            addCriterion("t1.PCK_STATUS in", values, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusNotIn(List<Short> values) {
            addCriterion("t1.PCK_STATUS not in", values, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusBetween(Short value1, Short value2) {
            addCriterion("t1.PCK_STATUS between", value1, value2, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPckStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.PCK_STATUS not between", value1, value2, "pckStatus");
            return (Criteria) this;
        }

        public Criteria andPcheckidIsNull() {
            addCriterion("t1.PCHECKID is null");
            return (Criteria) this;
        }

        public Criteria andPcheckidIsNotNull() {
            addCriterion("t1.PCHECKID is not null");
            return (Criteria) this;
        }

        public Criteria andPcheckidEqualTo(Long value) {
            addCriterion("t1.PCHECKID =", value, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidNotEqualTo(Long value) {
            addCriterion("t1.PCHECKID <>", value, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidGreaterThan(Long value) {
            addCriterion("t1.PCHECKID >", value, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.PCHECKID >=", value, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidLessThan(Long value) {
            addCriterion("t1.PCHECKID <", value, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidLessThanOrEqualTo(Long value) {
            addCriterion("t1.PCHECKID <=", value, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidIn(List<Long> values) {
            addCriterion("t1.PCHECKID in", values, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidNotIn(List<Long> values) {
            addCriterion("t1.PCHECKID not in", values, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidBetween(Long value1, Long value2) {
            addCriterion("t1.PCHECKID between", value1, value2, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPcheckidNotBetween(Long value1, Long value2) {
            addCriterion("t1.PCHECKID not between", value1, value2, "pcheckid");
            return (Criteria) this;
        }

        public Criteria andPchecktimeIsNull() {
            addCriterion("t1.PCHECKTIME is null");
            return (Criteria) this;
        }

        public Criteria andPchecktimeIsNotNull() {
            addCriterion("t1.PCHECKTIME is not null");
            return (Criteria) this;
        }

        public Criteria andPchecktimeEqualTo(Date value) {
            addCriterion("t1.PCHECKTIME =", value, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeNotEqualTo(Date value) {
            addCriterion("t1.PCHECKTIME <>", value, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeGreaterThan(Date value) {
            addCriterion("t1.PCHECKTIME >", value, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.PCHECKTIME >=", value, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeLessThan(Date value) {
            addCriterion("t1.PCHECKTIME <", value, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeLessThanOrEqualTo(Date value) {
            addCriterion("t1.PCHECKTIME <=", value, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeIn(List<Date> values) {
            addCriterion("t1.PCHECKTIME in", values, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeNotIn(List<Date> values) {
            addCriterion("t1.PCHECKTIME not in", values, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeBetween(Date value1, Date value2) {
            addCriterion("t1.PCHECKTIME between", value1, value2, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andPchecktimeNotBetween(Date value1, Date value2) {
            addCriterion("t1.PCHECKTIME not between", value1, value2, "pchecktime");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedIsNull() {
            addCriterion("t1.TOT_AMTINVED is null");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedIsNotNull() {
            addCriterion("t1.TOT_AMTINVED is not null");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTINVED =", value, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTINVED <>", value, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTINVED >", value, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTINVED >=", value, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedLessThan(BigDecimal value) {
            addCriterion("t1.TOT_AMTINVED <", value, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_AMTINVED <=", value, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTINVED in", values, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_AMTINVED not in", values, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTINVED between", value1, value2, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotAmtinvedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_AMTINVED not between", value1, value2, "totAmtinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedIsNull() {
            addCriterion("t1.TOT_QTYINVED is null");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedIsNotNull() {
            addCriterion("t1.TOT_QTYINVED is not null");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedEqualTo(Long value) {
            addCriterion("t1.TOT_QTYINVED =", value, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedNotEqualTo(Long value) {
            addCriterion("t1.TOT_QTYINVED <>", value, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedGreaterThan(Long value) {
            addCriterion("t1.TOT_QTYINVED >", value, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.TOT_QTYINVED >=", value, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedLessThan(Long value) {
            addCriterion("t1.TOT_QTYINVED <", value, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedLessThanOrEqualTo(Long value) {
            addCriterion("t1.TOT_QTYINVED <=", value, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedIn(List<Long> values) {
            addCriterion("t1.TOT_QTYINVED in", values, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedNotIn(List<Long> values) {
            addCriterion("t1.TOT_QTYINVED not in", values, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedBetween(Long value1, Long value2) {
            addCriterion("t1.TOT_QTYINVED between", value1, value2, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andTotQtyinvedNotBetween(Long value1, Long value2) {
            addCriterion("t1.TOT_QTYINVED not between", value1, value2, "totQtyinved");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdIsNull() {
            addCriterion("t1.M_CRORETSALE_ID is null");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdIsNotNull() {
            addCriterion("t1.M_CRORETSALE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdEqualTo(Long value) {
            addCriterion("t1.M_CRORETSALE_ID =", value, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdNotEqualTo(Long value) {
            addCriterion("t1.M_CRORETSALE_ID <>", value, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdGreaterThan(Long value) {
            addCriterion("t1.M_CRORETSALE_ID >", value, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.M_CRORETSALE_ID >=", value, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdLessThan(Long value) {
            addCriterion("t1.M_CRORETSALE_ID <", value, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.M_CRORETSALE_ID <=", value, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdIn(List<Long> values) {
            addCriterion("t1.M_CRORETSALE_ID in", values, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdNotIn(List<Long> values) {
            addCriterion("t1.M_CRORETSALE_ID not in", values, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdBetween(Long value1, Long value2) {
            addCriterion("t1.M_CRORETSALE_ID between", value1, value2, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andMCroretsaleIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.M_CRORETSALE_ID not between", value1, value2, "mCroretsaleId");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleIsNull() {
            addCriterion("t1.IS_MAIN_RETSALE is null");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleIsNotNull() {
            addCriterion("t1.IS_MAIN_RETSALE is not null");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleEqualTo(String value) {
            addCriterion("t1.IS_MAIN_RETSALE =", value, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleNotEqualTo(String value) {
            addCriterion("t1.IS_MAIN_RETSALE <>", value, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleGreaterThan(String value) {
            addCriterion("t1.IS_MAIN_RETSALE >", value, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IS_MAIN_RETSALE >=", value, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleLessThan(String value) {
            addCriterion("t1.IS_MAIN_RETSALE <", value, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleLessThanOrEqualTo(String value) {
            addCriterion("t1.IS_MAIN_RETSALE <=", value, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleLike(String value) {
            addCriterion("t1.IS_MAIN_RETSALE like", value, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleNotLike(String value) {
            addCriterion("t1.IS_MAIN_RETSALE not like", value, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleIn(List<String> values) {
            addCriterion("t1.IS_MAIN_RETSALE in", values, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleNotIn(List<String> values) {
            addCriterion("t1.IS_MAIN_RETSALE not in", values, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleBetween(String value1, String value2) {
            addCriterion("t1.IS_MAIN_RETSALE between", value1, value2, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsMainRetsaleNotBetween(String value1, String value2) {
            addCriterion("t1.IS_MAIN_RETSALE not between", value1, value2, "isMainRetsale");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinIsNull() {
            addCriterion("t1.IS_CRORETSALEIN is null");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinIsNotNull() {
            addCriterion("t1.IS_CRORETSALEIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinEqualTo(String value) {
            addCriterion("t1.IS_CRORETSALEIN =", value, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinNotEqualTo(String value) {
            addCriterion("t1.IS_CRORETSALEIN <>", value, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinGreaterThan(String value) {
            addCriterion("t1.IS_CRORETSALEIN >", value, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinGreaterThanOrEqualTo(String value) {
            addCriterion("t1.IS_CRORETSALEIN >=", value, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinLessThan(String value) {
            addCriterion("t1.IS_CRORETSALEIN <", value, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinLessThanOrEqualTo(String value) {
            addCriterion("t1.IS_CRORETSALEIN <=", value, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinLike(String value) {
            addCriterion("t1.IS_CRORETSALEIN like", value, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinNotLike(String value) {
            addCriterion("t1.IS_CRORETSALEIN not like", value, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinIn(List<String> values) {
            addCriterion("t1.IS_CRORETSALEIN in", values, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinNotIn(List<String> values) {
            addCriterion("t1.IS_CRORETSALEIN not in", values, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinBetween(String value1, String value2) {
            addCriterion("t1.IS_CRORETSALEIN between", value1, value2, "isCroretsalein");
            return (Criteria) this;
        }

        public Criteria andIsCroretsaleinNotBetween(String value1, String value2) {
            addCriterion("t1.IS_CRORETSALEIN not between", value1, value2, "isCroretsalein");
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

        public Criteria andShippingRemarkIsNull() {
            addCriterion("t1.SHIPPING_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkIsNotNull() {
            addCriterion("t1.SHIPPING_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkEqualTo(String value) {
            addCriterion("t1.SHIPPING_REMARK =", value, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkNotEqualTo(String value) {
            addCriterion("t1.SHIPPING_REMARK <>", value, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkGreaterThan(String value) {
            addCriterion("t1.SHIPPING_REMARK >", value, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("t1.SHIPPING_REMARK >=", value, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkLessThan(String value) {
            addCriterion("t1.SHIPPING_REMARK <", value, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkLessThanOrEqualTo(String value) {
            addCriterion("t1.SHIPPING_REMARK <=", value, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkLike(String value) {
            addCriterion("t1.SHIPPING_REMARK like", value, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkNotLike(String value) {
            addCriterion("t1.SHIPPING_REMARK not like", value, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkIn(List<String> values) {
            addCriterion("t1.SHIPPING_REMARK in", values, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkNotIn(List<String> values) {
            addCriterion("t1.SHIPPING_REMARK not in", values, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkBetween(String value1, String value2) {
            addCriterion("t1.SHIPPING_REMARK between", value1, value2, "shippingRemark");
            return (Criteria) this;
        }

        public Criteria andShippingRemarkNotBetween(String value1, String value2) {
            addCriterion("t1.SHIPPING_REMARK not between", value1, value2, "shippingRemark");
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

        public Criteria andDestAddrIsNull() {
            addCriterion("t1.DEST_ADDR is null");
            return (Criteria) this;
        }

        public Criteria andDestAddrIsNotNull() {
            addCriterion("t1.DEST_ADDR is not null");
            return (Criteria) this;
        }

        public Criteria andDestAddrEqualTo(String value) {
            addCriterion("t1.DEST_ADDR =", value, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrNotEqualTo(String value) {
            addCriterion("t1.DEST_ADDR <>", value, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrGreaterThan(String value) {
            addCriterion("t1.DEST_ADDR >", value, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrGreaterThanOrEqualTo(String value) {
            addCriterion("t1.DEST_ADDR >=", value, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrLessThan(String value) {
            addCriterion("t1.DEST_ADDR <", value, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrLessThanOrEqualTo(String value) {
            addCriterion("t1.DEST_ADDR <=", value, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrLike(String value) {
            addCriterion("t1.DEST_ADDR like", value, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrNotLike(String value) {
            addCriterion("t1.DEST_ADDR not like", value, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrIn(List<String> values) {
            addCriterion("t1.DEST_ADDR in", values, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrNotIn(List<String> values) {
            addCriterion("t1.DEST_ADDR not in", values, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrBetween(String value1, String value2) {
            addCriterion("t1.DEST_ADDR between", value1, value2, "destAddr");
            return (Criteria) this;
        }

        public Criteria andDestAddrNotBetween(String value1, String value2) {
            addCriterion("t1.DEST_ADDR not between", value1, value2, "destAddr");
            return (Criteria) this;
        }

        public Criteria andMBoxIdIsNull() {
            addCriterion("t1.M_BOX_ID is null");
            return (Criteria) this;
        }

        public Criteria andMBoxIdIsNotNull() {
            addCriterion("t1.M_BOX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andMBoxIdEqualTo(Long value) {
            addCriterion("t1.M_BOX_ID =", value, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdNotEqualTo(Long value) {
            addCriterion("t1.M_BOX_ID <>", value, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdGreaterThan(Long value) {
            addCriterion("t1.M_BOX_ID >", value, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.M_BOX_ID >=", value, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdLessThan(Long value) {
            addCriterion("t1.M_BOX_ID <", value, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.M_BOX_ID <=", value, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdIn(List<Long> values) {
            addCriterion("t1.M_BOX_ID in", values, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdNotIn(List<Long> values) {
            addCriterion("t1.M_BOX_ID not in", values, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdBetween(Long value1, Long value2) {
            addCriterion("t1.M_BOX_ID between", value1, value2, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andMBoxIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.M_BOX_ID not between", value1, value2, "mBoxId");
            return (Criteria) this;
        }

        public Criteria andQtyBoxIsNull() {
            addCriterion("t1.QTY_BOX is null");
            return (Criteria) this;
        }

        public Criteria andQtyBoxIsNotNull() {
            addCriterion("t1.QTY_BOX is not null");
            return (Criteria) this;
        }

        public Criteria andQtyBoxEqualTo(Long value) {
            addCriterion("t1.QTY_BOX =", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxNotEqualTo(Long value) {
            addCriterion("t1.QTY_BOX <>", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxGreaterThan(Long value) {
            addCriterion("t1.QTY_BOX >", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.QTY_BOX >=", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxLessThan(Long value) {
            addCriterion("t1.QTY_BOX <", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxLessThanOrEqualTo(Long value) {
            addCriterion("t1.QTY_BOX <=", value, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxIn(List<Long> values) {
            addCriterion("t1.QTY_BOX in", values, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxNotIn(List<Long> values) {
            addCriterion("t1.QTY_BOX not in", values, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxBetween(Long value1, Long value2) {
            addCriterion("t1.QTY_BOX between", value1, value2, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andQtyBoxNotBetween(Long value1, Long value2) {
            addCriterion("t1.QTY_BOX not between", value1, value2, "qtyBox");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtIsNull() {
            addCriterion("t1.TOT_TAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtIsNotNull() {
            addCriterion("t1.TOT_TAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_TAX_AMT =", value, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_TAX_AMT <>", value, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_TAX_AMT >", value, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_TAX_AMT >=", value, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtLessThan(BigDecimal value) {
            addCriterion("t1.TOT_TAX_AMT <", value, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_TAX_AMT <=", value, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_TAX_AMT in", values, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_TAX_AMT not in", values, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_TAX_AMT between", value1, value2, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotTaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_TAX_AMT not between", value1, value2, "totTaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtIsNull() {
            addCriterion("t1.TOT_NOTAX_AMT is null");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtIsNotNull() {
            addCriterion("t1.TOT_NOTAX_AMT is not null");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_NOTAX_AMT =", value, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtNotEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_NOTAX_AMT <>", value, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtGreaterThan(BigDecimal value) {
            addCriterion("t1.TOT_NOTAX_AMT >", value, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_NOTAX_AMT >=", value, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtLessThan(BigDecimal value) {
            addCriterion("t1.TOT_NOTAX_AMT <", value, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TOT_NOTAX_AMT <=", value, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_NOTAX_AMT in", values, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtNotIn(List<BigDecimal> values) {
            addCriterion("t1.TOT_NOTAX_AMT not in", values, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_NOTAX_AMT between", value1, value2, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTotNotaxAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TOT_NOTAX_AMT not between", value1, value2, "totNotaxAmt");
            return (Criteria) this;
        }

        public Criteria andTaxDisIsNull() {
            addCriterion("t1.TAX_DIS is null");
            return (Criteria) this;
        }

        public Criteria andTaxDisIsNotNull() {
            addCriterion("t1.TAX_DIS is not null");
            return (Criteria) this;
        }

        public Criteria andTaxDisEqualTo(BigDecimal value) {
            addCriterion("t1.TAX_DIS =", value, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisNotEqualTo(BigDecimal value) {
            addCriterion("t1.TAX_DIS <>", value, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisGreaterThan(BigDecimal value) {
            addCriterion("t1.TAX_DIS >", value, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TAX_DIS >=", value, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisLessThan(BigDecimal value) {
            addCriterion("t1.TAX_DIS <", value, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisLessThanOrEqualTo(BigDecimal value) {
            addCriterion("t1.TAX_DIS <=", value, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisIn(List<BigDecimal> values) {
            addCriterion("t1.TAX_DIS in", values, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisNotIn(List<BigDecimal> values) {
            addCriterion("t1.TAX_DIS not in", values, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TAX_DIS between", value1, value2, "taxDis");
            return (Criteria) this;
        }

        public Criteria andTaxDisNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("t1.TAX_DIS not between", value1, value2, "taxDis");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleIsNull() {
            addCriterion("t1.PAYMENTSTYLE is null");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleIsNotNull() {
            addCriterion("t1.PAYMENTSTYLE is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleEqualTo(String value) {
            addCriterion("t1.PAYMENTSTYLE =", value, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleNotEqualTo(String value) {
            addCriterion("t1.PAYMENTSTYLE <>", value, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleGreaterThan(String value) {
            addCriterion("t1.PAYMENTSTYLE >", value, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleGreaterThanOrEqualTo(String value) {
            addCriterion("t1.PAYMENTSTYLE >=", value, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleLessThan(String value) {
            addCriterion("t1.PAYMENTSTYLE <", value, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleLessThanOrEqualTo(String value) {
            addCriterion("t1.PAYMENTSTYLE <=", value, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleLike(String value) {
            addCriterion("t1.PAYMENTSTYLE like", value, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleNotLike(String value) {
            addCriterion("t1.PAYMENTSTYLE not like", value, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleIn(List<String> values) {
            addCriterion("t1.PAYMENTSTYLE in", values, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleNotIn(List<String> values) {
            addCriterion("t1.PAYMENTSTYLE not in", values, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleBetween(String value1, String value2) {
            addCriterion("t1.PAYMENTSTYLE between", value1, value2, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andPaymentstyleNotBetween(String value1, String value2) {
            addCriterion("t1.PAYMENTSTYLE not between", value1, value2, "paymentstyle");
            return (Criteria) this;
        }

        public Criteria andScanStatusIsNull() {
            addCriterion("t1.SCAN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andScanStatusIsNotNull() {
            addCriterion("t1.SCAN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andScanStatusEqualTo(Short value) {
            addCriterion("t1.SCAN_STATUS =", value, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusNotEqualTo(Short value) {
            addCriterion("t1.SCAN_STATUS <>", value, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusGreaterThan(Short value) {
            addCriterion("t1.SCAN_STATUS >", value, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.SCAN_STATUS >=", value, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusLessThan(Short value) {
            addCriterion("t1.SCAN_STATUS <", value, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.SCAN_STATUS <=", value, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusIn(List<Short> values) {
            addCriterion("t1.SCAN_STATUS in", values, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusNotIn(List<Short> values) {
            addCriterion("t1.SCAN_STATUS not in", values, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusBetween(Short value1, Short value2) {
            addCriterion("t1.SCAN_STATUS between", value1, value2, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andScanStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.SCAN_STATUS not between", value1, value2, "scanStatus");
            return (Criteria) this;
        }

        public Criteria andBillkindIsNull() {
            addCriterion("t1.BILLKIND is null");
            return (Criteria) this;
        }

        public Criteria andBillkindIsNotNull() {
            addCriterion("t1.BILLKIND is not null");
            return (Criteria) this;
        }

        public Criteria andBillkindEqualTo(Short value) {
            addCriterion("t1.BILLKIND =", value, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindNotEqualTo(Short value) {
            addCriterion("t1.BILLKIND <>", value, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindGreaterThan(Short value) {
            addCriterion("t1.BILLKIND >", value, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.BILLKIND >=", value, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindLessThan(Short value) {
            addCriterion("t1.BILLKIND <", value, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindLessThanOrEqualTo(Short value) {
            addCriterion("t1.BILLKIND <=", value, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindIn(List<Short> values) {
            addCriterion("t1.BILLKIND in", values, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindNotIn(List<Short> values) {
            addCriterion("t1.BILLKIND not in", values, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindBetween(Short value1, Short value2) {
            addCriterion("t1.BILLKIND between", value1, value2, "billkind");
            return (Criteria) this;
        }

        public Criteria andBillkindNotBetween(Short value1, Short value2) {
            addCriterion("t1.BILLKIND not between", value1, value2, "billkind");
            return (Criteria) this;
        }

        public Criteria andContractnoFileIsNull() {
            addCriterion("t1.CONTRACTNO_FILE is null");
            return (Criteria) this;
        }

        public Criteria andContractnoFileIsNotNull() {
            addCriterion("t1.CONTRACTNO_FILE is not null");
            return (Criteria) this;
        }

        public Criteria andContractnoFileEqualTo(String value) {
            addCriterion("t1.CONTRACTNO_FILE =", value, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileNotEqualTo(String value) {
            addCriterion("t1.CONTRACTNO_FILE <>", value, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileGreaterThan(String value) {
            addCriterion("t1.CONTRACTNO_FILE >", value, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileGreaterThanOrEqualTo(String value) {
            addCriterion("t1.CONTRACTNO_FILE >=", value, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileLessThan(String value) {
            addCriterion("t1.CONTRACTNO_FILE <", value, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileLessThanOrEqualTo(String value) {
            addCriterion("t1.CONTRACTNO_FILE <=", value, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileLike(String value) {
            addCriterion("t1.CONTRACTNO_FILE like", value, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileNotLike(String value) {
            addCriterion("t1.CONTRACTNO_FILE not like", value, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileIn(List<String> values) {
            addCriterion("t1.CONTRACTNO_FILE in", values, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileNotIn(List<String> values) {
            addCriterion("t1.CONTRACTNO_FILE not in", values, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileBetween(String value1, String value2) {
            addCriterion("t1.CONTRACTNO_FILE between", value1, value2, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andContractnoFileNotBetween(String value1, String value2) {
            addCriterion("t1.CONTRACTNO_FILE not between", value1, value2, "contractnoFile");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNull() {
            addCriterion("t1.CONFIRM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIsNotNull() {
            addCriterion("t1.CONFIRM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusEqualTo(Short value) {
            addCriterion("t1.CONFIRM_STATUS =", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotEqualTo(Short value) {
            addCriterion("t1.CONFIRM_STATUS <>", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThan(Short value) {
            addCriterion("t1.CONFIRM_STATUS >", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.CONFIRM_STATUS >=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThan(Short value) {
            addCriterion("t1.CONFIRM_STATUS <", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.CONFIRM_STATUS <=", value, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusIn(List<Short> values) {
            addCriterion("t1.CONFIRM_STATUS in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotIn(List<Short> values) {
            addCriterion("t1.CONFIRM_STATUS not in", values, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusBetween(Short value1, Short value2) {
            addCriterion("t1.CONFIRM_STATUS between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.CONFIRM_STATUS not between", value1, value2, "confirmStatus");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeIsNull() {
            addCriterion("t1.CONFIRM_STATUSTIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeIsNotNull() {
            addCriterion("t1.CONFIRM_STATUSTIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeEqualTo(Date value) {
            addCriterion("t1.CONFIRM_STATUSTIME =", value, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeNotEqualTo(Date value) {
            addCriterion("t1.CONFIRM_STATUSTIME <>", value, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeGreaterThan(Date value) {
            addCriterion("t1.CONFIRM_STATUSTIME >", value, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.CONFIRM_STATUSTIME >=", value, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeLessThan(Date value) {
            addCriterion("t1.CONFIRM_STATUSTIME <", value, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeLessThanOrEqualTo(Date value) {
            addCriterion("t1.CONFIRM_STATUSTIME <=", value, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeIn(List<Date> values) {
            addCriterion("t1.CONFIRM_STATUSTIME in", values, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeNotIn(List<Date> values) {
            addCriterion("t1.CONFIRM_STATUSTIME not in", values, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeBetween(Date value1, Date value2) {
            addCriterion("t1.CONFIRM_STATUSTIME between", value1, value2, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatustimeNotBetween(Date value1, Date value2) {
            addCriterion("t1.CONFIRM_STATUSTIME not between", value1, value2, "confirmStatustime");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridIsNull() {
            addCriterion("t1.CONFIRM_STATUSERID is null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridIsNotNull() {
            addCriterion("t1.CONFIRM_STATUSERID is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridEqualTo(Long value) {
            addCriterion("t1.CONFIRM_STATUSERID =", value, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridNotEqualTo(Long value) {
            addCriterion("t1.CONFIRM_STATUSERID <>", value, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridGreaterThan(Long value) {
            addCriterion("t1.CONFIRM_STATUSERID >", value, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.CONFIRM_STATUSERID >=", value, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridLessThan(Long value) {
            addCriterion("t1.CONFIRM_STATUSERID <", value, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridLessThanOrEqualTo(Long value) {
            addCriterion("t1.CONFIRM_STATUSERID <=", value, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridIn(List<Long> values) {
            addCriterion("t1.CONFIRM_STATUSERID in", values, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridNotIn(List<Long> values) {
            addCriterion("t1.CONFIRM_STATUSERID not in", values, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridBetween(Long value1, Long value2) {
            addCriterion("t1.CONFIRM_STATUSERID between", value1, value2, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andConfirmStatuseridNotBetween(Long value1, Long value2) {
            addCriterion("t1.CONFIRM_STATUSERID not between", value1, value2, "confirmStatuserid");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNull() {
            addCriterion("t1.BILLNO is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("t1.BILLNO is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("t1.BILLNO =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("t1.BILLNO <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("t1.BILLNO >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.BILLNO >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("t1.BILLNO <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("t1.BILLNO <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("t1.BILLNO like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("t1.BILLNO not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("t1.BILLNO in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("t1.BILLNO not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("t1.BILLNO between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("t1.BILLNO not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andFisnoIsNull() {
            addCriterion("t1.FISNO is null");
            return (Criteria) this;
        }

        public Criteria andFisnoIsNotNull() {
            addCriterion("t1.FISNO is not null");
            return (Criteria) this;
        }

        public Criteria andFisnoEqualTo(String value) {
            addCriterion("t1.FISNO =", value, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoNotEqualTo(String value) {
            addCriterion("t1.FISNO <>", value, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoGreaterThan(String value) {
            addCriterion("t1.FISNO >", value, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.FISNO >=", value, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoLessThan(String value) {
            addCriterion("t1.FISNO <", value, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoLessThanOrEqualTo(String value) {
            addCriterion("t1.FISNO <=", value, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoLike(String value) {
            addCriterion("t1.FISNO like", value, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoNotLike(String value) {
            addCriterion("t1.FISNO not like", value, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoIn(List<String> values) {
            addCriterion("t1.FISNO in", values, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoNotIn(List<String> values) {
            addCriterion("t1.FISNO not in", values, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoBetween(String value1, String value2) {
            addCriterion("t1.FISNO between", value1, value2, "fisno");
            return (Criteria) this;
        }

        public Criteria andFisnoNotBetween(String value1, String value2) {
            addCriterion("t1.FISNO not between", value1, value2, "fisno");
            return (Criteria) this;
        }

        public Criteria andByinStatusIsNull() {
            addCriterion("t1.BYIN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andByinStatusIsNotNull() {
            addCriterion("t1.BYIN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andByinStatusEqualTo(Short value) {
            addCriterion("t1.BYIN_STATUS =", value, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusNotEqualTo(Short value) {
            addCriterion("t1.BYIN_STATUS <>", value, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusGreaterThan(Short value) {
            addCriterion("t1.BYIN_STATUS >", value, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.BYIN_STATUS >=", value, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusLessThan(Short value) {
            addCriterion("t1.BYIN_STATUS <", value, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.BYIN_STATUS <=", value, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusIn(List<Short> values) {
            addCriterion("t1.BYIN_STATUS in", values, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusNotIn(List<Short> values) {
            addCriterion("t1.BYIN_STATUS not in", values, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusBetween(Short value1, Short value2) {
            addCriterion("t1.BYIN_STATUS between", value1, value2, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andByinStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.BYIN_STATUS not between", value1, value2, "byinStatus");
            return (Criteria) this;
        }

        public Criteria andScanneridIsNull() {
            addCriterion("t1.SCANNERID is null");
            return (Criteria) this;
        }

        public Criteria andScanneridIsNotNull() {
            addCriterion("t1.SCANNERID is not null");
            return (Criteria) this;
        }

        public Criteria andScanneridEqualTo(Long value) {
            addCriterion("t1.SCANNERID =", value, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridNotEqualTo(Long value) {
            addCriterion("t1.SCANNERID <>", value, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridGreaterThan(Long value) {
            addCriterion("t1.SCANNERID >", value, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.SCANNERID >=", value, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridLessThan(Long value) {
            addCriterion("t1.SCANNERID <", value, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridLessThanOrEqualTo(Long value) {
            addCriterion("t1.SCANNERID <=", value, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridIn(List<Long> values) {
            addCriterion("t1.SCANNERID in", values, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridNotIn(List<Long> values) {
            addCriterion("t1.SCANNERID not in", values, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridBetween(Long value1, Long value2) {
            addCriterion("t1.SCANNERID between", value1, value2, "scannerid");
            return (Criteria) this;
        }

        public Criteria andScanneridNotBetween(Long value1, Long value2) {
            addCriterion("t1.SCANNERID not between", value1, value2, "scannerid");
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

        public Criteria andScanIntimeIsNull() {
            addCriterion("t1.SCAN_INTIME is null");
            return (Criteria) this;
        }

        public Criteria andScanIntimeIsNotNull() {
            addCriterion("t1.SCAN_INTIME is not null");
            return (Criteria) this;
        }

        public Criteria andScanIntimeEqualTo(Date value) {
            addCriterion("t1.SCAN_INTIME =", value, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeNotEqualTo(Date value) {
            addCriterion("t1.SCAN_INTIME <>", value, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeGreaterThan(Date value) {
            addCriterion("t1.SCAN_INTIME >", value, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.SCAN_INTIME >=", value, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeLessThan(Date value) {
            addCriterion("t1.SCAN_INTIME <", value, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeLessThanOrEqualTo(Date value) {
            addCriterion("t1.SCAN_INTIME <=", value, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeIn(List<Date> values) {
            addCriterion("t1.SCAN_INTIME in", values, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeNotIn(List<Date> values) {
            addCriterion("t1.SCAN_INTIME not in", values, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeBetween(Date value1, Date value2) {
            addCriterion("t1.SCAN_INTIME between", value1, value2, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andScanIntimeNotBetween(Date value1, Date value2) {
            addCriterion("t1.SCAN_INTIME not between", value1, value2, "scanIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeIsNull() {
            addCriterion("t1.CONFIRM_INTIME is null");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeIsNotNull() {
            addCriterion("t1.CONFIRM_INTIME is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeEqualTo(Date value) {
            addCriterion("t1.CONFIRM_INTIME =", value, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeNotEqualTo(Date value) {
            addCriterion("t1.CONFIRM_INTIME <>", value, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeGreaterThan(Date value) {
            addCriterion("t1.CONFIRM_INTIME >", value, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.CONFIRM_INTIME >=", value, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeLessThan(Date value) {
            addCriterion("t1.CONFIRM_INTIME <", value, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeLessThanOrEqualTo(Date value) {
            addCriterion("t1.CONFIRM_INTIME <=", value, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeIn(List<Date> values) {
            addCriterion("t1.CONFIRM_INTIME in", values, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeNotIn(List<Date> values) {
            addCriterion("t1.CONFIRM_INTIME not in", values, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeBetween(Date value1, Date value2) {
            addCriterion("t1.CONFIRM_INTIME between", value1, value2, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andConfirmIntimeNotBetween(Date value1, Date value2) {
            addCriterion("t1.CONFIRM_INTIME not between", value1, value2, "confirmIntime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeIsNull() {
            addCriterion("t1.DELIVERY_CONFIRMTIME is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeIsNotNull() {
            addCriterion("t1.DELIVERY_CONFIRMTIME is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeEqualTo(Date value) {
            addCriterion("t1.DELIVERY_CONFIRMTIME =", value, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeNotEqualTo(Date value) {
            addCriterion("t1.DELIVERY_CONFIRMTIME <>", value, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeGreaterThan(Date value) {
            addCriterion("t1.DELIVERY_CONFIRMTIME >", value, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("t1.DELIVERY_CONFIRMTIME >=", value, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeLessThan(Date value) {
            addCriterion("t1.DELIVERY_CONFIRMTIME <", value, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeLessThanOrEqualTo(Date value) {
            addCriterion("t1.DELIVERY_CONFIRMTIME <=", value, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeIn(List<Date> values) {
            addCriterion("t1.DELIVERY_CONFIRMTIME in", values, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeNotIn(List<Date> values) {
            addCriterion("t1.DELIVERY_CONFIRMTIME not in", values, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeBetween(Date value1, Date value2) {
            addCriterion("t1.DELIVERY_CONFIRMTIME between", value1, value2, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andDeliveryConfirmtimeNotBetween(Date value1, Date value2) {
            addCriterion("t1.DELIVERY_CONFIRMTIME not between", value1, value2, "deliveryConfirmtime");
            return (Criteria) this;
        }

        public Criteria andByoutStatusIsNull() {
            addCriterion("t1.BYOUT_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andByoutStatusIsNotNull() {
            addCriterion("t1.BYOUT_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andByoutStatusEqualTo(Short value) {
            addCriterion("t1.BYOUT_STATUS =", value, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusNotEqualTo(Short value) {
            addCriterion("t1.BYOUT_STATUS <>", value, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusGreaterThan(Short value) {
            addCriterion("t1.BYOUT_STATUS >", value, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.BYOUT_STATUS >=", value, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusLessThan(Short value) {
            addCriterion("t1.BYOUT_STATUS <", value, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.BYOUT_STATUS <=", value, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusIn(List<Short> values) {
            addCriterion("t1.BYOUT_STATUS in", values, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusNotIn(List<Short> values) {
            addCriterion("t1.BYOUT_STATUS not in", values, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusBetween(Short value1, Short value2) {
            addCriterion("t1.BYOUT_STATUS between", value1, value2, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andByoutStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.BYOUT_STATUS not between", value1, value2, "byoutStatus");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdIsNull() {
            addCriterion("t1.UNPICK_STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdIsNotNull() {
            addCriterion("t1.UNPICK_STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdEqualTo(Long value) {
            addCriterion("t1.UNPICK_STORE_ID =", value, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdNotEqualTo(Long value) {
            addCriterion("t1.UNPICK_STORE_ID <>", value, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdGreaterThan(Long value) {
            addCriterion("t1.UNPICK_STORE_ID >", value, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("t1.UNPICK_STORE_ID >=", value, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdLessThan(Long value) {
            addCriterion("t1.UNPICK_STORE_ID <", value, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("t1.UNPICK_STORE_ID <=", value, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdIn(List<Long> values) {
            addCriterion("t1.UNPICK_STORE_ID in", values, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdNotIn(List<Long> values) {
            addCriterion("t1.UNPICK_STORE_ID not in", values, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdBetween(Long value1, Long value2) {
            addCriterion("t1.UNPICK_STORE_ID between", value1, value2, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andUnpickStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("t1.UNPICK_STORE_ID not between", value1, value2, "unpickStoreId");
            return (Criteria) this;
        }

        public Criteria andScaninStatusIsNull() {
            addCriterion("t1.SCANIN_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andScaninStatusIsNotNull() {
            addCriterion("t1.SCANIN_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andScaninStatusEqualTo(Short value) {
            addCriterion("t1.SCANIN_STATUS =", value, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusNotEqualTo(Short value) {
            addCriterion("t1.SCANIN_STATUS <>", value, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusGreaterThan(Short value) {
            addCriterion("t1.SCANIN_STATUS >", value, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.SCANIN_STATUS >=", value, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusLessThan(Short value) {
            addCriterion("t1.SCANIN_STATUS <", value, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.SCANIN_STATUS <=", value, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusIn(List<Short> values) {
            addCriterion("t1.SCANIN_STATUS in", values, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusNotIn(List<Short> values) {
            addCriterion("t1.SCANIN_STATUS not in", values, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusBetween(Short value1, Short value2) {
            addCriterion("t1.SCANIN_STATUS between", value1, value2, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andScaninStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.SCANIN_STATUS not between", value1, value2, "scaninStatus");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkIsNull() {
            addCriterion("t1.BEHALF_REMARK is null");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkIsNotNull() {
            addCriterion("t1.BEHALF_REMARK is not null");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkEqualTo(String value) {
            addCriterion("t1.BEHALF_REMARK =", value, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkNotEqualTo(String value) {
            addCriterion("t1.BEHALF_REMARK <>", value, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkGreaterThan(String value) {
            addCriterion("t1.BEHALF_REMARK >", value, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("t1.BEHALF_REMARK >=", value, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkLessThan(String value) {
            addCriterion("t1.BEHALF_REMARK <", value, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkLessThanOrEqualTo(String value) {
            addCriterion("t1.BEHALF_REMARK <=", value, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkLike(String value) {
            addCriterion("t1.BEHALF_REMARK like", value, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkNotLike(String value) {
            addCriterion("t1.BEHALF_REMARK not like", value, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkIn(List<String> values) {
            addCriterion("t1.BEHALF_REMARK in", values, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkNotIn(List<String> values) {
            addCriterion("t1.BEHALF_REMARK not in", values, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkBetween(String value1, String value2) {
            addCriterion("t1.BEHALF_REMARK between", value1, value2, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andBehalfRemarkNotBetween(String value1, String value2) {
            addCriterion("t1.BEHALF_REMARK not between", value1, value2, "behalfRemark");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanIsNull() {
            addCriterion("t1.ISDEFAULTSCAN is null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanIsNotNull() {
            addCriterion("t1.ISDEFAULTSCAN is not null");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanEqualTo(String value) {
            addCriterion("t1.ISDEFAULTSCAN =", value, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanNotEqualTo(String value) {
            addCriterion("t1.ISDEFAULTSCAN <>", value, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanGreaterThan(String value) {
            addCriterion("t1.ISDEFAULTSCAN >", value, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanGreaterThanOrEqualTo(String value) {
            addCriterion("t1.ISDEFAULTSCAN >=", value, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanLessThan(String value) {
            addCriterion("t1.ISDEFAULTSCAN <", value, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanLessThanOrEqualTo(String value) {
            addCriterion("t1.ISDEFAULTSCAN <=", value, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanLike(String value) {
            addCriterion("t1.ISDEFAULTSCAN like", value, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanNotLike(String value) {
            addCriterion("t1.ISDEFAULTSCAN not like", value, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanIn(List<String> values) {
            addCriterion("t1.ISDEFAULTSCAN in", values, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanNotIn(List<String> values) {
            addCriterion("t1.ISDEFAULTSCAN not in", values, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanBetween(String value1, String value2) {
            addCriterion("t1.ISDEFAULTSCAN between", value1, value2, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andIsdefaultscanNotBetween(String value1, String value2) {
            addCriterion("t1.ISDEFAULTSCAN not between", value1, value2, "isdefaultscan");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("t1.STATUS is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("t1.STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Short value) {
            addCriterion("t1.STATUS =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Short value) {
            addCriterion("t1.STATUS <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Short value) {
            addCriterion("t1.STATUS >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.STATUS >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Short value) {
            addCriterion("t1.STATUS <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Short value) {
            addCriterion("t1.STATUS <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Short> values) {
            addCriterion("t1.STATUS in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Short> values) {
            addCriterion("t1.STATUS not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Short value1, Short value2) {
            addCriterion("t1.STATUS between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Short value1, Short value2) {
            addCriterion("t1.STATUS not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andRetinfoIsNull() {
            addCriterion("t1.RETINFO is null");
            return (Criteria) this;
        }

        public Criteria andRetinfoIsNotNull() {
            addCriterion("t1.RETINFO is not null");
            return (Criteria) this;
        }

        public Criteria andRetinfoEqualTo(String value) {
            addCriterion("t1.RETINFO =", value, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoNotEqualTo(String value) {
            addCriterion("t1.RETINFO <>", value, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoGreaterThan(String value) {
            addCriterion("t1.RETINFO >", value, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoGreaterThanOrEqualTo(String value) {
            addCriterion("t1.RETINFO >=", value, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoLessThan(String value) {
            addCriterion("t1.RETINFO <", value, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoLessThanOrEqualTo(String value) {
            addCriterion("t1.RETINFO <=", value, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoLike(String value) {
            addCriterion("t1.RETINFO like", value, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoNotLike(String value) {
            addCriterion("t1.RETINFO not like", value, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoIn(List<String> values) {
            addCriterion("t1.RETINFO in", values, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoNotIn(List<String> values) {
            addCriterion("t1.RETINFO not in", values, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoBetween(String value1, String value2) {
            addCriterion("t1.RETINFO between", value1, value2, "retinfo");
            return (Criteria) this;
        }

        public Criteria andRetinfoNotBetween(String value1, String value2) {
            addCriterion("t1.RETINFO not between", value1, value2, "retinfo");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNull() {
            addCriterion("t1.SALE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIsNotNull() {
            addCriterion("t1.SALE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andSaleTypeEqualTo(Short value) {
            addCriterion("t1.SALE_TYPE =", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotEqualTo(Short value) {
            addCriterion("t1.SALE_TYPE <>", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThan(Short value) {
            addCriterion("t1.SALE_TYPE >", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeGreaterThanOrEqualTo(Short value) {
            addCriterion("t1.SALE_TYPE >=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThan(Short value) {
            addCriterion("t1.SALE_TYPE <", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeLessThanOrEqualTo(Short value) {
            addCriterion("t1.SALE_TYPE <=", value, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeIn(List<Short> values) {
            addCriterion("t1.SALE_TYPE in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotIn(List<Short> values) {
            addCriterion("t1.SALE_TYPE not in", values, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeBetween(Short value1, Short value2) {
            addCriterion("t1.SALE_TYPE between", value1, value2, "saleType");
            return (Criteria) this;
        }

        public Criteria andSaleTypeNotBetween(Short value1, Short value2) {
            addCriterion("t1.SALE_TYPE not between", value1, value2, "saleType");
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
        @Getter
        @Setter
        private boolean hasDate;
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
        //传入是否是日期字段构造函数
        protected Criterion(String condition, Object value,boolean isDate) {
            this(condition, value, null);
            this.hasDate=isDate;
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
        protected Criterion(String condition, Object value, Object secondValue,boolean isDate) {
            this(condition, value, secondValue, null);
            this.hasDate=isDate;
        }
    }
}