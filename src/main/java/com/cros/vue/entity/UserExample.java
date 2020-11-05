package com.cros.vue.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class UserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public UserExample() {
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

        public Criteria andSupervisorIdIsNull() {
            addCriterion("SUPERVISOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIsNotNull() {
            addCriterion("SUPERVISOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdEqualTo(Long value) {
            addCriterion("SUPERVISOR_ID =", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotEqualTo(Long value) {
            addCriterion("SUPERVISOR_ID <>", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdGreaterThan(Long value) {
            addCriterion("SUPERVISOR_ID >", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdGreaterThanOrEqualTo(Long value) {
            addCriterion("SUPERVISOR_ID >=", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLessThan(Long value) {
            addCriterion("SUPERVISOR_ID <", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdLessThanOrEqualTo(Long value) {
            addCriterion("SUPERVISOR_ID <=", value, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdIn(List<Long> values) {
            addCriterion("SUPERVISOR_ID in", values, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotIn(List<Long> values) {
            addCriterion("SUPERVISOR_ID not in", values, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdBetween(Long value1, Long value2) {
            addCriterion("SUPERVISOR_ID between", value1, value2, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andSupervisorIdNotBetween(Long value1, Long value2) {
            addCriterion("SUPERVISOR_ID not between", value1, value2, "supervisorId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdIsNull() {
            addCriterion("PA_GOALPRIVATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdIsNotNull() {
            addCriterion("PA_GOALPRIVATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdEqualTo(Long value) {
            addCriterion("PA_GOALPRIVATE_ID =", value, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdNotEqualTo(Long value) {
            addCriterion("PA_GOALPRIVATE_ID <>", value, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdGreaterThan(Long value) {
            addCriterion("PA_GOALPRIVATE_ID >", value, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdGreaterThanOrEqualTo(Long value) {
            addCriterion("PA_GOALPRIVATE_ID >=", value, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdLessThan(Long value) {
            addCriterion("PA_GOALPRIVATE_ID <", value, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdLessThanOrEqualTo(Long value) {
            addCriterion("PA_GOALPRIVATE_ID <=", value, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdIn(List<Long> values) {
            addCriterion("PA_GOALPRIVATE_ID in", values, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdNotIn(List<Long> values) {
            addCriterion("PA_GOALPRIVATE_ID not in", values, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdBetween(Long value1, Long value2) {
            addCriterion("PA_GOALPRIVATE_ID between", value1, value2, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andPaGoalprivateIdNotBetween(Long value1, Long value2) {
            addCriterion("PA_GOALPRIVATE_ID not between", value1, value2, "paGoalprivateId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdIsNull() {
            addCriterion("C_BPARTNER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdIsNotNull() {
            addCriterion("C_BPARTNER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdEqualTo(Long value) {
            addCriterion("C_BPARTNER_ID =", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdNotEqualTo(Long value) {
            addCriterion("C_BPARTNER_ID <>", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdGreaterThan(Long value) {
            addCriterion("C_BPARTNER_ID >", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_BPARTNER_ID >=", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdLessThan(Long value) {
            addCriterion("C_BPARTNER_ID <", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdLessThanOrEqualTo(Long value) {
            addCriterion("C_BPARTNER_ID <=", value, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdIn(List<Long> values) {
            addCriterion("C_BPARTNER_ID in", values, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdNotIn(List<Long> values) {
            addCriterion("C_BPARTNER_ID not in", values, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdBetween(Long value1, Long value2) {
            addCriterion("C_BPARTNER_ID between", value1, value2, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerIdNotBetween(Long value1, Long value2) {
            addCriterion("C_BPARTNER_ID not between", value1, value2, "cBpartnerId");
            return (Criteria) this;
        }

        public Criteria andProcessingIsNull() {
            addCriterion("PROCESSING is null");
            return (Criteria) this;
        }

        public Criteria andProcessingIsNotNull() {
            addCriterion("PROCESSING is not null");
            return (Criteria) this;
        }

        public Criteria andProcessingEqualTo(String value) {
            addCriterion("PROCESSING =", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotEqualTo(String value) {
            addCriterion("PROCESSING <>", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingGreaterThan(String value) {
            addCriterion("PROCESSING >", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingGreaterThanOrEqualTo(String value) {
            addCriterion("PROCESSING >=", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLessThan(String value) {
            addCriterion("PROCESSING <", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLessThanOrEqualTo(String value) {
            addCriterion("PROCESSING <=", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingLike(String value) {
            addCriterion("PROCESSING like", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotLike(String value) {
            addCriterion("PROCESSING not like", value, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingIn(List<String> values) {
            addCriterion("PROCESSING in", values, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotIn(List<String> values) {
            addCriterion("PROCESSING not in", values, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingBetween(String value1, String value2) {
            addCriterion("PROCESSING between", value1, value2, "processing");
            return (Criteria) this;
        }

        public Criteria andProcessingNotBetween(String value1, String value2) {
            addCriterion("PROCESSING not between", value1, value2, "processing");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdIsNull() {
            addCriterion("C_BPARTNER_LOCATION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdIsNotNull() {
            addCriterion("C_BPARTNER_LOCATION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdEqualTo(Long value) {
            addCriterion("C_BPARTNER_LOCATION_ID =", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdNotEqualTo(Long value) {
            addCriterion("C_BPARTNER_LOCATION_ID <>", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdGreaterThan(Long value) {
            addCriterion("C_BPARTNER_LOCATION_ID >", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_BPARTNER_LOCATION_ID >=", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdLessThan(Long value) {
            addCriterion("C_BPARTNER_LOCATION_ID <", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdLessThanOrEqualTo(Long value) {
            addCriterion("C_BPARTNER_LOCATION_ID <=", value, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdIn(List<Long> values) {
            addCriterion("C_BPARTNER_LOCATION_ID in", values, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdNotIn(List<Long> values) {
            addCriterion("C_BPARTNER_LOCATION_ID not in", values, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdBetween(Long value1, Long value2) {
            addCriterion("C_BPARTNER_LOCATION_ID between", value1, value2, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCBpartnerLocationIdNotBetween(Long value1, Long value2) {
            addCriterion("C_BPARTNER_LOCATION_ID not between", value1, value2, "cBpartnerLocationId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdIsNull() {
            addCriterion("C_GREETING_ID is null");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdIsNotNull() {
            addCriterion("C_GREETING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdEqualTo(Long value) {
            addCriterion("C_GREETING_ID =", value, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdNotEqualTo(Long value) {
            addCriterion("C_GREETING_ID <>", value, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdGreaterThan(Long value) {
            addCriterion("C_GREETING_ID >", value, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_GREETING_ID >=", value, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdLessThan(Long value) {
            addCriterion("C_GREETING_ID <", value, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdLessThanOrEqualTo(Long value) {
            addCriterion("C_GREETING_ID <=", value, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdIn(List<Long> values) {
            addCriterion("C_GREETING_ID in", values, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdNotIn(List<Long> values) {
            addCriterion("C_GREETING_ID not in", values, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdBetween(Long value1, Long value2) {
            addCriterion("C_GREETING_ID between", value1, value2, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andCGreetingIdNotBetween(Long value1, Long value2) {
            addCriterion("C_GREETING_ID not between", value1, value2, "cGreetingId");
            return (Criteria) this;
        }

        public Criteria andLastcontactIsNull() {
            addCriterion("LASTCONTACT is null");
            return (Criteria) this;
        }

        public Criteria andLastcontactIsNotNull() {
            addCriterion("LASTCONTACT is not null");
            return (Criteria) this;
        }

        public Criteria andLastcontactEqualTo(Integer value) {
            addCriterion("LASTCONTACT =", value, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactNotEqualTo(Integer value) {
            addCriterion("LASTCONTACT <>", value, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactGreaterThan(Integer value) {
            addCriterion("LASTCONTACT >", value, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactGreaterThanOrEqualTo(Integer value) {
            addCriterion("LASTCONTACT >=", value, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactLessThan(Integer value) {
            addCriterion("LASTCONTACT <", value, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactLessThanOrEqualTo(Integer value) {
            addCriterion("LASTCONTACT <=", value, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactIn(List<Integer> values) {
            addCriterion("LASTCONTACT in", values, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactNotIn(List<Integer> values) {
            addCriterion("LASTCONTACT not in", values, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactBetween(Integer value1, Integer value2) {
            addCriterion("LASTCONTACT between", value1, value2, "lastcontact");
            return (Criteria) this;
        }

        public Criteria andLastcontactNotBetween(Integer value1, Integer value2) {
            addCriterion("LASTCONTACT not between", value1, value2, "lastcontact");
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

        public Criteria andAdOrgtrxIdIsNull() {
            addCriterion("AD_ORGTRX_ID is null");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdIsNotNull() {
            addCriterion("AD_ORGTRX_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdEqualTo(Long value) {
            addCriterion("AD_ORGTRX_ID =", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdNotEqualTo(Long value) {
            addCriterion("AD_ORGTRX_ID <>", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdGreaterThan(Long value) {
            addCriterion("AD_ORGTRX_ID >", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdGreaterThanOrEqualTo(Long value) {
            addCriterion("AD_ORGTRX_ID >=", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdLessThan(Long value) {
            addCriterion("AD_ORGTRX_ID <", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdLessThanOrEqualTo(Long value) {
            addCriterion("AD_ORGTRX_ID <=", value, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdIn(List<Long> values) {
            addCriterion("AD_ORGTRX_ID in", values, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdNotIn(List<Long> values) {
            addCriterion("AD_ORGTRX_ID not in", values, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdBetween(Long value1, Long value2) {
            addCriterion("AD_ORGTRX_ID between", value1, value2, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andAdOrgtrxIdNotBetween(Long value1, Long value2) {
            addCriterion("AD_ORGTRX_ID not between", value1, value2, "adOrgtrxId");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedIsNull() {
            addCriterion("ISLDAPAUTHORIZED is null");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedIsNotNull() {
            addCriterion("ISLDAPAUTHORIZED is not null");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedEqualTo(String value) {
            addCriterion("ISLDAPAUTHORIZED =", value, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedNotEqualTo(String value) {
            addCriterion("ISLDAPAUTHORIZED <>", value, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedGreaterThan(String value) {
            addCriterion("ISLDAPAUTHORIZED >", value, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedGreaterThanOrEqualTo(String value) {
            addCriterion("ISLDAPAUTHORIZED >=", value, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedLessThan(String value) {
            addCriterion("ISLDAPAUTHORIZED <", value, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedLessThanOrEqualTo(String value) {
            addCriterion("ISLDAPAUTHORIZED <=", value, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedLike(String value) {
            addCriterion("ISLDAPAUTHORIZED like", value, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedNotLike(String value) {
            addCriterion("ISLDAPAUTHORIZED not like", value, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedIn(List<String> values) {
            addCriterion("ISLDAPAUTHORIZED in", values, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedNotIn(List<String> values) {
            addCriterion("ISLDAPAUTHORIZED not in", values, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedBetween(String value1, String value2) {
            addCriterion("ISLDAPAUTHORIZED between", value1, value2, "isldapauthorized");
            return (Criteria) this;
        }

        public Criteria andIsldapauthorizedNotBetween(String value1, String value2) {
            addCriterion("ISLDAPAUTHORIZED not between", value1, value2, "isldapauthorized");
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

        public Criteria andPasswordhashIsNull() {
            addCriterion("PASSWORDHASH is null");
            return (Criteria) this;
        }

        public Criteria andPasswordhashIsNotNull() {
            addCriterion("PASSWORDHASH is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordhashEqualTo(String value) {
            addCriterion("PASSWORDHASH =", value, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashNotEqualTo(String value) {
            addCriterion("PASSWORDHASH <>", value, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashGreaterThan(String value) {
            addCriterion("PASSWORDHASH >", value, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORDHASH >=", value, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashLessThan(String value) {
            addCriterion("PASSWORDHASH <", value, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashLessThanOrEqualTo(String value) {
            addCriterion("PASSWORDHASH <=", value, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashLike(String value) {
            addCriterion("PASSWORDHASH like", value, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashNotLike(String value) {
            addCriterion("PASSWORDHASH not like", value, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashIn(List<String> values) {
            addCriterion("PASSWORDHASH in", values, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashNotIn(List<String> values) {
            addCriterion("PASSWORDHASH not in", values, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashBetween(String value1, String value2) {
            addCriterion("PASSWORDHASH between", value1, value2, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andPasswordhashNotBetween(String value1, String value2) {
            addCriterion("PASSWORDHASH not between", value1, value2, "passwordhash");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNull() {
            addCriterion("ISENABLED is null");
            return (Criteria) this;
        }

        public Criteria andIsenabledIsNotNull() {
            addCriterion("ISENABLED is not null");
            return (Criteria) this;
        }

        public Criteria andIsenabledEqualTo(Short value) {
            addCriterion("ISENABLED =", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotEqualTo(Short value) {
            addCriterion("ISENABLED <>", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThan(Short value) {
            addCriterion("ISENABLED >", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledGreaterThanOrEqualTo(Short value) {
            addCriterion("ISENABLED >=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThan(Short value) {
            addCriterion("ISENABLED <", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledLessThanOrEqualTo(Short value) {
            addCriterion("ISENABLED <=", value, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledIn(List<Short> values) {
            addCriterion("ISENABLED in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotIn(List<Short> values) {
            addCriterion("ISENABLED not in", values, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledBetween(Short value1, Short value2) {
            addCriterion("ISENABLED between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsenabledNotBetween(Short value1, Short value2) {
            addCriterion("ISENABLED not between", value1, value2, "isenabled");
            return (Criteria) this;
        }

        public Criteria andIsemployeeIsNull() {
            addCriterion("ISEMPLOYEE is null");
            return (Criteria) this;
        }

        public Criteria andIsemployeeIsNotNull() {
            addCriterion("ISEMPLOYEE is not null");
            return (Criteria) this;
        }

        public Criteria andIsemployeeEqualTo(Short value) {
            addCriterion("ISEMPLOYEE =", value, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeNotEqualTo(Short value) {
            addCriterion("ISEMPLOYEE <>", value, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeGreaterThan(Short value) {
            addCriterion("ISEMPLOYEE >", value, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeGreaterThanOrEqualTo(Short value) {
            addCriterion("ISEMPLOYEE >=", value, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeLessThan(Short value) {
            addCriterion("ISEMPLOYEE <", value, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeLessThanOrEqualTo(Short value) {
            addCriterion("ISEMPLOYEE <=", value, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeIn(List<Short> values) {
            addCriterion("ISEMPLOYEE in", values, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeNotIn(List<Short> values) {
            addCriterion("ISEMPLOYEE not in", values, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeBetween(Short value1, Short value2) {
            addCriterion("ISEMPLOYEE between", value1, value2, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsemployeeNotBetween(Short value1, Short value2) {
            addCriterion("ISEMPLOYEE not between", value1, value2, "isemployee");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNull() {
            addCriterion("ISADMIN is null");
            return (Criteria) this;
        }

        public Criteria andIsadminIsNotNull() {
            addCriterion("ISADMIN is not null");
            return (Criteria) this;
        }

        public Criteria andIsadminEqualTo(Short value) {
            addCriterion("ISADMIN =", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotEqualTo(Short value) {
            addCriterion("ISADMIN <>", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThan(Short value) {
            addCriterion("ISADMIN >", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminGreaterThanOrEqualTo(Short value) {
            addCriterion("ISADMIN >=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThan(Short value) {
            addCriterion("ISADMIN <", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminLessThanOrEqualTo(Short value) {
            addCriterion("ISADMIN <=", value, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminIn(List<Short> values) {
            addCriterion("ISADMIN in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotIn(List<Short> values) {
            addCriterion("ISADMIN not in", values, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminBetween(Short value1, Short value2) {
            addCriterion("ISADMIN between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andIsadminNotBetween(Short value1, Short value2) {
            addCriterion("ISADMIN not between", value1, value2, "isadmin");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNull() {
            addCriterion("USERTYPE is null");
            return (Criteria) this;
        }

        public Criteria andUsertypeIsNotNull() {
            addCriterion("USERTYPE is not null");
            return (Criteria) this;
        }

        public Criteria andUsertypeEqualTo(Short value) {
            addCriterion("USERTYPE =", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotEqualTo(Short value) {
            addCriterion("USERTYPE <>", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThan(Short value) {
            addCriterion("USERTYPE >", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeGreaterThanOrEqualTo(Short value) {
            addCriterion("USERTYPE >=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThan(Short value) {
            addCriterion("USERTYPE <", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeLessThanOrEqualTo(Short value) {
            addCriterion("USERTYPE <=", value, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeIn(List<Short> values) {
            addCriterion("USERTYPE in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotIn(List<Short> values) {
            addCriterion("USERTYPE not in", values, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeBetween(Short value1, Short value2) {
            addCriterion("USERTYPE between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andUsertypeNotBetween(Short value1, Short value2) {
            addCriterion("USERTYPE not between", value1, value2, "usertype");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNull() {
            addCriterion("TRUENAME is null");
            return (Criteria) this;
        }

        public Criteria andTruenameIsNotNull() {
            addCriterion("TRUENAME is not null");
            return (Criteria) this;
        }

        public Criteria andTruenameEqualTo(String value) {
            addCriterion("TRUENAME =", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotEqualTo(String value) {
            addCriterion("TRUENAME <>", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThan(String value) {
            addCriterion("TRUENAME >", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameGreaterThanOrEqualTo(String value) {
            addCriterion("TRUENAME >=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThan(String value) {
            addCriterion("TRUENAME <", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLessThanOrEqualTo(String value) {
            addCriterion("TRUENAME <=", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameLike(String value) {
            addCriterion("TRUENAME like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotLike(String value) {
            addCriterion("TRUENAME not like", value, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameIn(List<String> values) {
            addCriterion("TRUENAME in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotIn(List<String> values) {
            addCriterion("TRUENAME not in", values, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameBetween(String value1, String value2) {
            addCriterion("TRUENAME between", value1, value2, "truename");
            return (Criteria) this;
        }

        public Criteria andTruenameNotBetween(String value1, String value2) {
            addCriterion("TRUENAME not between", value1, value2, "truename");
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

        public Criteria andPasswordIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("PASSWORD =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("PASSWORD <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("PASSWORD like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("PASSWORD not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("PASSWORD in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "password");
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

        public Criteria andEmailuserIsNull() {
            addCriterion("EMAILUSER is null");
            return (Criteria) this;
        }

        public Criteria andEmailuserIsNotNull() {
            addCriterion("EMAILUSER is not null");
            return (Criteria) this;
        }

        public Criteria andEmailuserEqualTo(String value) {
            addCriterion("EMAILUSER =", value, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserNotEqualTo(String value) {
            addCriterion("EMAILUSER <>", value, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserGreaterThan(String value) {
            addCriterion("EMAILUSER >", value, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserGreaterThanOrEqualTo(String value) {
            addCriterion("EMAILUSER >=", value, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserLessThan(String value) {
            addCriterion("EMAILUSER <", value, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserLessThanOrEqualTo(String value) {
            addCriterion("EMAILUSER <=", value, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserLike(String value) {
            addCriterion("EMAILUSER like", value, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserNotLike(String value) {
            addCriterion("EMAILUSER not like", value, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserIn(List<String> values) {
            addCriterion("EMAILUSER in", values, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserNotIn(List<String> values) {
            addCriterion("EMAILUSER not in", values, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserBetween(String value1, String value2) {
            addCriterion("EMAILUSER between", value1, value2, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserNotBetween(String value1, String value2) {
            addCriterion("EMAILUSER not between", value1, value2, "emailuser");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwIsNull() {
            addCriterion("EMAILUSERPW is null");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwIsNotNull() {
            addCriterion("EMAILUSERPW is not null");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwEqualTo(String value) {
            addCriterion("EMAILUSERPW =", value, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwNotEqualTo(String value) {
            addCriterion("EMAILUSERPW <>", value, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwGreaterThan(String value) {
            addCriterion("EMAILUSERPW >", value, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwGreaterThanOrEqualTo(String value) {
            addCriterion("EMAILUSERPW >=", value, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwLessThan(String value) {
            addCriterion("EMAILUSERPW <", value, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwLessThanOrEqualTo(String value) {
            addCriterion("EMAILUSERPW <=", value, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwLike(String value) {
            addCriterion("EMAILUSERPW like", value, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwNotLike(String value) {
            addCriterion("EMAILUSERPW not like", value, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwIn(List<String> values) {
            addCriterion("EMAILUSERPW in", values, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwNotIn(List<String> values) {
            addCriterion("EMAILUSERPW not in", values, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwBetween(String value1, String value2) {
            addCriterion("EMAILUSERPW between", value1, value2, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andEmailuserpwNotBetween(String value1, String value2) {
            addCriterion("EMAILUSERPW not between", value1, value2, "emailuserpw");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("TITLE =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("TITLE <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("TITLE >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("TITLE <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("TITLE like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("TITLE not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("TITLE in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("TITLE not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNull() {
            addCriterion("COMMENTS is null");
            return (Criteria) this;
        }

        public Criteria andCommentsIsNotNull() {
            addCriterion("COMMENTS is not null");
            return (Criteria) this;
        }

        public Criteria andCommentsEqualTo(String value) {
            addCriterion("COMMENTS =", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotEqualTo(String value) {
            addCriterion("COMMENTS <>", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThan(String value) {
            addCriterion("COMMENTS >", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsGreaterThanOrEqualTo(String value) {
            addCriterion("COMMENTS >=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThan(String value) {
            addCriterion("COMMENTS <", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLessThanOrEqualTo(String value) {
            addCriterion("COMMENTS <=", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsLike(String value) {
            addCriterion("COMMENTS like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotLike(String value) {
            addCriterion("COMMENTS not like", value, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsIn(List<String> values) {
            addCriterion("COMMENTS in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotIn(List<String> values) {
            addCriterion("COMMENTS not in", values, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsBetween(String value1, String value2) {
            addCriterion("COMMENTS between", value1, value2, "comments");
            return (Criteria) this;
        }

        public Criteria andCommentsNotBetween(String value1, String value2) {
            addCriterion("COMMENTS not between", value1, value2, "comments");
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

        public Criteria andPhone2IsNull() {
            addCriterion("PHONE2 is null");
            return (Criteria) this;
        }

        public Criteria andPhone2IsNotNull() {
            addCriterion("PHONE2 is not null");
            return (Criteria) this;
        }

        public Criteria andPhone2EqualTo(String value) {
            addCriterion("PHONE2 =", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotEqualTo(String value) {
            addCriterion("PHONE2 <>", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThan(String value) {
            addCriterion("PHONE2 >", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2GreaterThanOrEqualTo(String value) {
            addCriterion("PHONE2 >=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThan(String value) {
            addCriterion("PHONE2 <", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2LessThanOrEqualTo(String value) {
            addCriterion("PHONE2 <=", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Like(String value) {
            addCriterion("PHONE2 like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotLike(String value) {
            addCriterion("PHONE2 not like", value, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2In(List<String> values) {
            addCriterion("PHONE2 in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotIn(List<String> values) {
            addCriterion("PHONE2 not in", values, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2Between(String value1, String value2) {
            addCriterion("PHONE2 between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andPhone2NotBetween(String value1, String value2) {
            addCriterion("PHONE2 not between", value1, value2, "phone2");
            return (Criteria) this;
        }

        public Criteria andFaxIsNull() {
            addCriterion("FAX is null");
            return (Criteria) this;
        }

        public Criteria andFaxIsNotNull() {
            addCriterion("FAX is not null");
            return (Criteria) this;
        }

        public Criteria andFaxEqualTo(String value) {
            addCriterion("FAX =", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotEqualTo(String value) {
            addCriterion("FAX <>", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThan(String value) {
            addCriterion("FAX >", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxGreaterThanOrEqualTo(String value) {
            addCriterion("FAX >=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThan(String value) {
            addCriterion("FAX <", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLessThanOrEqualTo(String value) {
            addCriterion("FAX <=", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxLike(String value) {
            addCriterion("FAX like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotLike(String value) {
            addCriterion("FAX not like", value, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxIn(List<String> values) {
            addCriterion("FAX in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotIn(List<String> values) {
            addCriterion("FAX not in", values, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxBetween(String value1, String value2) {
            addCriterion("FAX between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andFaxNotBetween(String value1, String value2) {
            addCriterion("FAX not between", value1, value2, "fax");
            return (Criteria) this;
        }

        public Criteria andLastresultIsNull() {
            addCriterion("LASTRESULT is null");
            return (Criteria) this;
        }

        public Criteria andLastresultIsNotNull() {
            addCriterion("LASTRESULT is not null");
            return (Criteria) this;
        }

        public Criteria andLastresultEqualTo(String value) {
            addCriterion("LASTRESULT =", value, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultNotEqualTo(String value) {
            addCriterion("LASTRESULT <>", value, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultGreaterThan(String value) {
            addCriterion("LASTRESULT >", value, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultGreaterThanOrEqualTo(String value) {
            addCriterion("LASTRESULT >=", value, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultLessThan(String value) {
            addCriterion("LASTRESULT <", value, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultLessThanOrEqualTo(String value) {
            addCriterion("LASTRESULT <=", value, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultLike(String value) {
            addCriterion("LASTRESULT like", value, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultNotLike(String value) {
            addCriterion("LASTRESULT not like", value, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultIn(List<String> values) {
            addCriterion("LASTRESULT in", values, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultNotIn(List<String> values) {
            addCriterion("LASTRESULT not in", values, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultBetween(String value1, String value2) {
            addCriterion("LASTRESULT between", value1, value2, "lastresult");
            return (Criteria) this;
        }

        public Criteria andLastresultNotBetween(String value1, String value2) {
            addCriterion("LASTRESULT not between", value1, value2, "lastresult");
            return (Criteria) this;
        }

        public Criteria andEmailverifyIsNull() {
            addCriterion("EMAILVERIFY is null");
            return (Criteria) this;
        }

        public Criteria andEmailverifyIsNotNull() {
            addCriterion("EMAILVERIFY is not null");
            return (Criteria) this;
        }

        public Criteria andEmailverifyEqualTo(String value) {
            addCriterion("EMAILVERIFY =", value, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyNotEqualTo(String value) {
            addCriterion("EMAILVERIFY <>", value, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyGreaterThan(String value) {
            addCriterion("EMAILVERIFY >", value, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyGreaterThanOrEqualTo(String value) {
            addCriterion("EMAILVERIFY >=", value, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyLessThan(String value) {
            addCriterion("EMAILVERIFY <", value, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyLessThanOrEqualTo(String value) {
            addCriterion("EMAILVERIFY <=", value, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyLike(String value) {
            addCriterion("EMAILVERIFY like", value, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyNotLike(String value) {
            addCriterion("EMAILVERIFY not like", value, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyIn(List<String> values) {
            addCriterion("EMAILVERIFY in", values, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyNotIn(List<String> values) {
            addCriterion("EMAILVERIFY not in", values, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyBetween(String value1, String value2) {
            addCriterion("EMAILVERIFY between", value1, value2, "emailverify");
            return (Criteria) this;
        }

        public Criteria andEmailverifyNotBetween(String value1, String value2) {
            addCriterion("EMAILVERIFY not between", value1, value2, "emailverify");
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

        public Criteria andLanguageIsNull() {
            addCriterion("LANGUAGE is null");
            return (Criteria) this;
        }

        public Criteria andLanguageIsNotNull() {
            addCriterion("LANGUAGE is not null");
            return (Criteria) this;
        }

        public Criteria andLanguageEqualTo(String value) {
            addCriterion("LANGUAGE =", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotEqualTo(String value) {
            addCriterion("LANGUAGE <>", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThan(String value) {
            addCriterion("LANGUAGE >", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageGreaterThanOrEqualTo(String value) {
            addCriterion("LANGUAGE >=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThan(String value) {
            addCriterion("LANGUAGE <", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLessThanOrEqualTo(String value) {
            addCriterion("LANGUAGE <=", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageLike(String value) {
            addCriterion("LANGUAGE like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotLike(String value) {
            addCriterion("LANGUAGE not like", value, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageIn(List<String> values) {
            addCriterion("LANGUAGE in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotIn(List<String> values) {
            addCriterion("LANGUAGE not in", values, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageBetween(String value1, String value2) {
            addCriterion("LANGUAGE between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andLanguageNotBetween(String value1, String value2) {
            addCriterion("LANGUAGE not between", value1, value2, "language");
            return (Criteria) this;
        }

        public Criteria andIsOtpIsNull() {
            addCriterion("IS_OTP is null");
            return (Criteria) this;
        }

        public Criteria andIsOtpIsNotNull() {
            addCriterion("IS_OTP is not null");
            return (Criteria) this;
        }

        public Criteria andIsOtpEqualTo(String value) {
            addCriterion("IS_OTP =", value, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpNotEqualTo(String value) {
            addCriterion("IS_OTP <>", value, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpGreaterThan(String value) {
            addCriterion("IS_OTP >", value, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OTP >=", value, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpLessThan(String value) {
            addCriterion("IS_OTP <", value, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpLessThanOrEqualTo(String value) {
            addCriterion("IS_OTP <=", value, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpLike(String value) {
            addCriterion("IS_OTP like", value, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpNotLike(String value) {
            addCriterion("IS_OTP not like", value, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpIn(List<String> values) {
            addCriterion("IS_OTP in", values, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpNotIn(List<String> values) {
            addCriterion("IS_OTP not in", values, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpBetween(String value1, String value2) {
            addCriterion("IS_OTP between", value1, value2, "isOtp");
            return (Criteria) this;
        }

        public Criteria andIsOtpNotBetween(String value1, String value2) {
            addCriterion("IS_OTP not between", value1, value2, "isOtp");
            return (Criteria) this;
        }

        public Criteria andOtpLengthIsNull() {
            addCriterion("OTP_LENGTH is null");
            return (Criteria) this;
        }

        public Criteria andOtpLengthIsNotNull() {
            addCriterion("OTP_LENGTH is not null");
            return (Criteria) this;
        }

        public Criteria andOtpLengthEqualTo(Short value) {
            addCriterion("OTP_LENGTH =", value, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthNotEqualTo(Short value) {
            addCriterion("OTP_LENGTH <>", value, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthGreaterThan(Short value) {
            addCriterion("OTP_LENGTH >", value, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthGreaterThanOrEqualTo(Short value) {
            addCriterion("OTP_LENGTH >=", value, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthLessThan(Short value) {
            addCriterion("OTP_LENGTH <", value, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthLessThanOrEqualTo(Short value) {
            addCriterion("OTP_LENGTH <=", value, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthIn(List<Short> values) {
            addCriterion("OTP_LENGTH in", values, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthNotIn(List<Short> values) {
            addCriterion("OTP_LENGTH not in", values, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthBetween(Short value1, Short value2) {
            addCriterion("OTP_LENGTH between", value1, value2, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpLengthNotBetween(Short value1, Short value2) {
            addCriterion("OTP_LENGTH not between", value1, value2, "otpLength");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsIsNull() {
            addCriterion("OTP_SECONDS is null");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsIsNotNull() {
            addCriterion("OTP_SECONDS is not null");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsEqualTo(Short value) {
            addCriterion("OTP_SECONDS =", value, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsNotEqualTo(Short value) {
            addCriterion("OTP_SECONDS <>", value, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsGreaterThan(Short value) {
            addCriterion("OTP_SECONDS >", value, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsGreaterThanOrEqualTo(Short value) {
            addCriterion("OTP_SECONDS >=", value, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsLessThan(Short value) {
            addCriterion("OTP_SECONDS <", value, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsLessThanOrEqualTo(Short value) {
            addCriterion("OTP_SECONDS <=", value, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsIn(List<Short> values) {
            addCriterion("OTP_SECONDS in", values, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsNotIn(List<Short> values) {
            addCriterion("OTP_SECONDS not in", values, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsBetween(Short value1, Short value2) {
            addCriterion("OTP_SECONDS between", value1, value2, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecondsNotBetween(Short value1, Short value2) {
            addCriterion("OTP_SECONDS not between", value1, value2, "otpSeconds");
            return (Criteria) this;
        }

        public Criteria andOtpSecretIsNull() {
            addCriterion("OTP_SECRET is null");
            return (Criteria) this;
        }

        public Criteria andOtpSecretIsNotNull() {
            addCriterion("OTP_SECRET is not null");
            return (Criteria) this;
        }

        public Criteria andOtpSecretEqualTo(String value) {
            addCriterion("OTP_SECRET =", value, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretNotEqualTo(String value) {
            addCriterion("OTP_SECRET <>", value, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretGreaterThan(String value) {
            addCriterion("OTP_SECRET >", value, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretGreaterThanOrEqualTo(String value) {
            addCriterion("OTP_SECRET >=", value, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretLessThan(String value) {
            addCriterion("OTP_SECRET <", value, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretLessThanOrEqualTo(String value) {
            addCriterion("OTP_SECRET <=", value, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretLike(String value) {
            addCriterion("OTP_SECRET like", value, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretNotLike(String value) {
            addCriterion("OTP_SECRET not like", value, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretIn(List<String> values) {
            addCriterion("OTP_SECRET in", values, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretNotIn(List<String> values) {
            addCriterion("OTP_SECRET not in", values, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretBetween(String value1, String value2) {
            addCriterion("OTP_SECRET between", value1, value2, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpSecretNotBetween(String value1, String value2) {
            addCriterion("OTP_SECRET not between", value1, value2, "otpSecret");
            return (Criteria) this;
        }

        public Criteria andOtpCounterIsNull() {
            addCriterion("OTP_COUNTER is null");
            return (Criteria) this;
        }

        public Criteria andOtpCounterIsNotNull() {
            addCriterion("OTP_COUNTER is not null");
            return (Criteria) this;
        }

        public Criteria andOtpCounterEqualTo(BigDecimal value) {
            addCriterion("OTP_COUNTER =", value, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterNotEqualTo(BigDecimal value) {
            addCriterion("OTP_COUNTER <>", value, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterGreaterThan(BigDecimal value) {
            addCriterion("OTP_COUNTER >", value, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("OTP_COUNTER >=", value, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterLessThan(BigDecimal value) {
            addCriterion("OTP_COUNTER <", value, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterLessThanOrEqualTo(BigDecimal value) {
            addCriterion("OTP_COUNTER <=", value, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterIn(List<BigDecimal> values) {
            addCriterion("OTP_COUNTER in", values, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterNotIn(List<BigDecimal> values) {
            addCriterion("OTP_COUNTER not in", values, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTP_COUNTER between", value1, value2, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andOtpCounterNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("OTP_COUNTER not between", value1, value2, "otpCounter");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyIsNull() {
            addCriterion("IS_OTP_ONLY is null");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyIsNotNull() {
            addCriterion("IS_OTP_ONLY is not null");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyEqualTo(String value) {
            addCriterion("IS_OTP_ONLY =", value, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyNotEqualTo(String value) {
            addCriterion("IS_OTP_ONLY <>", value, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyGreaterThan(String value) {
            addCriterion("IS_OTP_ONLY >", value, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OTP_ONLY >=", value, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyLessThan(String value) {
            addCriterion("IS_OTP_ONLY <", value, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyLessThanOrEqualTo(String value) {
            addCriterion("IS_OTP_ONLY <=", value, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyLike(String value) {
            addCriterion("IS_OTP_ONLY like", value, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyNotLike(String value) {
            addCriterion("IS_OTP_ONLY not like", value, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyIn(List<String> values) {
            addCriterion("IS_OTP_ONLY in", values, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyNotIn(List<String> values) {
            addCriterion("IS_OTP_ONLY not in", values, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyBetween(String value1, String value2) {
            addCriterion("IS_OTP_ONLY between", value1, value2, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andIsOtpOnlyNotBetween(String value1, String value2) {
            addCriterion("IS_OTP_ONLY not between", value1, value2, "isOtpOnly");
            return (Criteria) this;
        }

        public Criteria andOtpCdateIsNull() {
            addCriterion("OTP_CDATE is null");
            return (Criteria) this;
        }

        public Criteria andOtpCdateIsNotNull() {
            addCriterion("OTP_CDATE is not null");
            return (Criteria) this;
        }

        public Criteria andOtpCdateEqualTo(Date value) {
            addCriterion("OTP_CDATE =", value, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateNotEqualTo(Date value) {
            addCriterion("OTP_CDATE <>", value, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateGreaterThan(Date value) {
            addCriterion("OTP_CDATE >", value, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateGreaterThanOrEqualTo(Date value) {
            addCriterion("OTP_CDATE >=", value, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateLessThan(Date value) {
            addCriterion("OTP_CDATE <", value, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateLessThanOrEqualTo(Date value) {
            addCriterion("OTP_CDATE <=", value, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateIn(List<Date> values) {
            addCriterion("OTP_CDATE in", values, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateNotIn(List<Date> values) {
            addCriterion("OTP_CDATE not in", values, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateBetween(Date value1, Date value2) {
            addCriterion("OTP_CDATE between", value1, value2, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andOtpCdateNotBetween(Date value1, Date value2) {
            addCriterion("OTP_CDATE not between", value1, value2, "otpCdate");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleIsNull() {
            addCriterion("LOGIN_IP_RULE is null");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleIsNotNull() {
            addCriterion("LOGIN_IP_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleEqualTo(String value) {
            addCriterion("LOGIN_IP_RULE =", value, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleNotEqualTo(String value) {
            addCriterion("LOGIN_IP_RULE <>", value, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleGreaterThan(String value) {
            addCriterion("LOGIN_IP_RULE >", value, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleGreaterThanOrEqualTo(String value) {
            addCriterion("LOGIN_IP_RULE >=", value, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleLessThan(String value) {
            addCriterion("LOGIN_IP_RULE <", value, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleLessThanOrEqualTo(String value) {
            addCriterion("LOGIN_IP_RULE <=", value, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleLike(String value) {
            addCriterion("LOGIN_IP_RULE like", value, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleNotLike(String value) {
            addCriterion("LOGIN_IP_RULE not like", value, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleIn(List<String> values) {
            addCriterion("LOGIN_IP_RULE in", values, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleNotIn(List<String> values) {
            addCriterion("LOGIN_IP_RULE not in", values, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleBetween(String value1, String value2) {
            addCriterion("LOGIN_IP_RULE between", value1, value2, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andLoginIpRuleNotBetween(String value1, String value2) {
            addCriterion("LOGIN_IP_RULE not between", value1, value2, "loginIpRule");
            return (Criteria) this;
        }

        public Criteria andIssmsIsNull() {
            addCriterion("ISSMS is null");
            return (Criteria) this;
        }

        public Criteria andIssmsIsNotNull() {
            addCriterion("ISSMS is not null");
            return (Criteria) this;
        }

        public Criteria andIssmsEqualTo(String value) {
            addCriterion("ISSMS =", value, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsNotEqualTo(String value) {
            addCriterion("ISSMS <>", value, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsGreaterThan(String value) {
            addCriterion("ISSMS >", value, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsGreaterThanOrEqualTo(String value) {
            addCriterion("ISSMS >=", value, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsLessThan(String value) {
            addCriterion("ISSMS <", value, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsLessThanOrEqualTo(String value) {
            addCriterion("ISSMS <=", value, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsLike(String value) {
            addCriterion("ISSMS like", value, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsNotLike(String value) {
            addCriterion("ISSMS not like", value, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsIn(List<String> values) {
            addCriterion("ISSMS in", values, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsNotIn(List<String> values) {
            addCriterion("ISSMS not in", values, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsBetween(String value1, String value2) {
            addCriterion("ISSMS between", value1, value2, "issms");
            return (Criteria) this;
        }

        public Criteria andIssmsNotBetween(String value1, String value2) {
            addCriterion("ISSMS not between", value1, value2, "issms");
            return (Criteria) this;
        }

        public Criteria andIsOutIsNull() {
            addCriterion("IS_OUT is null");
            return (Criteria) this;
        }

        public Criteria andIsOutIsNotNull() {
            addCriterion("IS_OUT is not null");
            return (Criteria) this;
        }

        public Criteria andIsOutEqualTo(String value) {
            addCriterion("IS_OUT =", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotEqualTo(String value) {
            addCriterion("IS_OUT <>", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutGreaterThan(String value) {
            addCriterion("IS_OUT >", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutGreaterThanOrEqualTo(String value) {
            addCriterion("IS_OUT >=", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLessThan(String value) {
            addCriterion("IS_OUT <", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLessThanOrEqualTo(String value) {
            addCriterion("IS_OUT <=", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutLike(String value) {
            addCriterion("IS_OUT like", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotLike(String value) {
            addCriterion("IS_OUT not like", value, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutIn(List<String> values) {
            addCriterion("IS_OUT in", values, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotIn(List<String> values) {
            addCriterion("IS_OUT not in", values, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutBetween(String value1, String value2) {
            addCriterion("IS_OUT between", value1, value2, "isOut");
            return (Criteria) this;
        }

        public Criteria andIsOutNotBetween(String value1, String value2) {
            addCriterion("IS_OUT not between", value1, value2, "isOut");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdIsNull() {
            addCriterion("ASSIGNEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdIsNotNull() {
            addCriterion("ASSIGNEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdEqualTo(Long value) {
            addCriterion("ASSIGNEE_ID =", value, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdNotEqualTo(Long value) {
            addCriterion("ASSIGNEE_ID <>", value, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdGreaterThan(Long value) {
            addCriterion("ASSIGNEE_ID >", value, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("ASSIGNEE_ID >=", value, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdLessThan(Long value) {
            addCriterion("ASSIGNEE_ID <", value, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdLessThanOrEqualTo(Long value) {
            addCriterion("ASSIGNEE_ID <=", value, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdIn(List<Long> values) {
            addCriterion("ASSIGNEE_ID in", values, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdNotIn(List<Long> values) {
            addCriterion("ASSIGNEE_ID not in", values, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdBetween(Long value1, Long value2) {
            addCriterion("ASSIGNEE_ID between", value1, value2, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andAssigneeIdNotBetween(Long value1, Long value2) {
            addCriterion("ASSIGNEE_ID not between", value1, value2, "assigneeId");
            return (Criteria) this;
        }

        public Criteria andIssalerIsNull() {
            addCriterion("ISSALER is null");
            return (Criteria) this;
        }

        public Criteria andIssalerIsNotNull() {
            addCriterion("ISSALER is not null");
            return (Criteria) this;
        }

        public Criteria andIssalerEqualTo(String value) {
            addCriterion("ISSALER =", value, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerNotEqualTo(String value) {
            addCriterion("ISSALER <>", value, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerGreaterThan(String value) {
            addCriterion("ISSALER >", value, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerGreaterThanOrEqualTo(String value) {
            addCriterion("ISSALER >=", value, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerLessThan(String value) {
            addCriterion("ISSALER <", value, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerLessThanOrEqualTo(String value) {
            addCriterion("ISSALER <=", value, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerLike(String value) {
            addCriterion("ISSALER like", value, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerNotLike(String value) {
            addCriterion("ISSALER not like", value, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerIn(List<String> values) {
            addCriterion("ISSALER in", values, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerNotIn(List<String> values) {
            addCriterion("ISSALER not in", values, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerBetween(String value1, String value2) {
            addCriterion("ISSALER between", value1, value2, "issaler");
            return (Criteria) this;
        }

        public Criteria andIssalerNotBetween(String value1, String value2) {
            addCriterion("ISSALER not between", value1, value2, "issaler");
            return (Criteria) this;
        }

        public Criteria andCStoreIdIsNull() {
            addCriterion("C_STORE_ID is null");
            return (Criteria) this;
        }

        public Criteria andCStoreIdIsNotNull() {
            addCriterion("C_STORE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCStoreIdEqualTo(Long value) {
            addCriterion("C_STORE_ID =", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdNotEqualTo(Long value) {
            addCriterion("C_STORE_ID <>", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdGreaterThan(Long value) {
            addCriterion("C_STORE_ID >", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_STORE_ID >=", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdLessThan(Long value) {
            addCriterion("C_STORE_ID <", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdLessThanOrEqualTo(Long value) {
            addCriterion("C_STORE_ID <=", value, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdIn(List<Long> values) {
            addCriterion("C_STORE_ID in", values, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdNotIn(List<Long> values) {
            addCriterion("C_STORE_ID not in", values, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdBetween(Long value1, Long value2) {
            addCriterion("C_STORE_ID between", value1, value2, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andCStoreIdNotBetween(Long value1, Long value2) {
            addCriterion("C_STORE_ID not between", value1, value2, "cStoreId");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitIsNull() {
            addCriterion("DISCOUNTLIMIT is null");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitIsNotNull() {
            addCriterion("DISCOUNTLIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTLIMIT =", value, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitNotEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTLIMIT <>", value, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitGreaterThan(BigDecimal value) {
            addCriterion("DISCOUNTLIMIT >", value, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTLIMIT >=", value, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitLessThan(BigDecimal value) {
            addCriterion("DISCOUNTLIMIT <", value, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitLessThanOrEqualTo(BigDecimal value) {
            addCriterion("DISCOUNTLIMIT <=", value, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTLIMIT in", values, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitNotIn(List<BigDecimal> values) {
            addCriterion("DISCOUNTLIMIT not in", values, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTLIMIT between", value1, value2, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andDiscountlimitNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("DISCOUNTLIMIT not between", value1, value2, "discountlimit");
            return (Criteria) this;
        }

        public Criteria andIsoprIsNull() {
            addCriterion("ISOPR is null");
            return (Criteria) this;
        }

        public Criteria andIsoprIsNotNull() {
            addCriterion("ISOPR is not null");
            return (Criteria) this;
        }

        public Criteria andIsoprEqualTo(String value) {
            addCriterion("ISOPR =", value, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprNotEqualTo(String value) {
            addCriterion("ISOPR <>", value, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprGreaterThan(String value) {
            addCriterion("ISOPR >", value, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprGreaterThanOrEqualTo(String value) {
            addCriterion("ISOPR >=", value, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprLessThan(String value) {
            addCriterion("ISOPR <", value, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprLessThanOrEqualTo(String value) {
            addCriterion("ISOPR <=", value, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprLike(String value) {
            addCriterion("ISOPR like", value, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprNotLike(String value) {
            addCriterion("ISOPR not like", value, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprIn(List<String> values) {
            addCriterion("ISOPR in", values, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprNotIn(List<String> values) {
            addCriterion("ISOPR not in", values, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprBetween(String value1, String value2) {
            addCriterion("ISOPR between", value1, value2, "isopr");
            return (Criteria) this;
        }

        public Criteria andIsoprNotBetween(String value1, String value2) {
            addCriterion("ISOPR not between", value1, value2, "isopr");
            return (Criteria) this;
        }

        public Criteria andSaasvendorIsNull() {
            addCriterion("SAASVENDOR is null");
            return (Criteria) this;
        }

        public Criteria andSaasvendorIsNotNull() {
            addCriterion("SAASVENDOR is not null");
            return (Criteria) this;
        }

        public Criteria andSaasvendorEqualTo(String value) {
            addCriterion("SAASVENDOR =", value, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorNotEqualTo(String value) {
            addCriterion("SAASVENDOR <>", value, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorGreaterThan(String value) {
            addCriterion("SAASVENDOR >", value, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorGreaterThanOrEqualTo(String value) {
            addCriterion("SAASVENDOR >=", value, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorLessThan(String value) {
            addCriterion("SAASVENDOR <", value, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorLessThanOrEqualTo(String value) {
            addCriterion("SAASVENDOR <=", value, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorLike(String value) {
            addCriterion("SAASVENDOR like", value, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorNotLike(String value) {
            addCriterion("SAASVENDOR not like", value, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorIn(List<String> values) {
            addCriterion("SAASVENDOR in", values, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorNotIn(List<String> values) {
            addCriterion("SAASVENDOR not in", values, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorBetween(String value1, String value2) {
            addCriterion("SAASVENDOR between", value1, value2, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasvendorNotBetween(String value1, String value2) {
            addCriterion("SAASVENDOR not between", value1, value2, "saasvendor");
            return (Criteria) this;
        }

        public Criteria andSaasuserIsNull() {
            addCriterion("SAASUSER is null");
            return (Criteria) this;
        }

        public Criteria andSaasuserIsNotNull() {
            addCriterion("SAASUSER is not null");
            return (Criteria) this;
        }

        public Criteria andSaasuserEqualTo(String value) {
            addCriterion("SAASUSER =", value, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserNotEqualTo(String value) {
            addCriterion("SAASUSER <>", value, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserGreaterThan(String value) {
            addCriterion("SAASUSER >", value, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserGreaterThanOrEqualTo(String value) {
            addCriterion("SAASUSER >=", value, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserLessThan(String value) {
            addCriterion("SAASUSER <", value, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserLessThanOrEqualTo(String value) {
            addCriterion("SAASUSER <=", value, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserLike(String value) {
            addCriterion("SAASUSER like", value, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserNotLike(String value) {
            addCriterion("SAASUSER not like", value, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserIn(List<String> values) {
            addCriterion("SAASUSER in", values, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserNotIn(List<String> values) {
            addCriterion("SAASUSER not in", values, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserBetween(String value1, String value2) {
            addCriterion("SAASUSER between", value1, value2, "saasuser");
            return (Criteria) this;
        }

        public Criteria andSaasuserNotBetween(String value1, String value2) {
            addCriterion("SAASUSER not between", value1, value2, "saasuser");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdIsNull() {
            addCriterion("HR_EMPLOYEE_ID is null");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdIsNotNull() {
            addCriterion("HR_EMPLOYEE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdEqualTo(Long value) {
            addCriterion("HR_EMPLOYEE_ID =", value, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdNotEqualTo(Long value) {
            addCriterion("HR_EMPLOYEE_ID <>", value, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdGreaterThan(Long value) {
            addCriterion("HR_EMPLOYEE_ID >", value, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("HR_EMPLOYEE_ID >=", value, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdLessThan(Long value) {
            addCriterion("HR_EMPLOYEE_ID <", value, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdLessThanOrEqualTo(Long value) {
            addCriterion("HR_EMPLOYEE_ID <=", value, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdIn(List<Long> values) {
            addCriterion("HR_EMPLOYEE_ID in", values, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdNotIn(List<Long> values) {
            addCriterion("HR_EMPLOYEE_ID not in", values, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdBetween(Long value1, Long value2) {
            addCriterion("HR_EMPLOYEE_ID between", value1, value2, "hrEmployeeId");
            return (Criteria) this;
        }

        public Criteria andHrEmployeeIdNotBetween(Long value1, Long value2) {
            addCriterion("HR_EMPLOYEE_ID not between", value1, value2, "hrEmployeeId");
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

        public Criteria andSgradeIsNull() {
            addCriterion("SGRADE is null");
            return (Criteria) this;
        }

        public Criteria andSgradeIsNotNull() {
            addCriterion("SGRADE is not null");
            return (Criteria) this;
        }

        public Criteria andSgradeEqualTo(Short value) {
            addCriterion("SGRADE =", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotEqualTo(Short value) {
            addCriterion("SGRADE <>", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThan(Short value) {
            addCriterion("SGRADE >", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeGreaterThanOrEqualTo(Short value) {
            addCriterion("SGRADE >=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThan(Short value) {
            addCriterion("SGRADE <", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeLessThanOrEqualTo(Short value) {
            addCriterion("SGRADE <=", value, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeIn(List<Short> values) {
            addCriterion("SGRADE in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotIn(List<Short> values) {
            addCriterion("SGRADE not in", values, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeBetween(Short value1, Short value2) {
            addCriterion("SGRADE between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andSgradeNotBetween(Short value1, Short value2) {
            addCriterion("SGRADE not between", value1, value2, "sgrade");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdIsNull() {
            addCriterion("C_PRICEREGION_ID is null");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdIsNotNull() {
            addCriterion("C_PRICEREGION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdEqualTo(Long value) {
            addCriterion("C_PRICEREGION_ID =", value, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdNotEqualTo(Long value) {
            addCriterion("C_PRICEREGION_ID <>", value, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdGreaterThan(Long value) {
            addCriterion("C_PRICEREGION_ID >", value, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_PRICEREGION_ID >=", value, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdLessThan(Long value) {
            addCriterion("C_PRICEREGION_ID <", value, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdLessThanOrEqualTo(Long value) {
            addCriterion("C_PRICEREGION_ID <=", value, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdIn(List<Long> values) {
            addCriterion("C_PRICEREGION_ID in", values, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdNotIn(List<Long> values) {
            addCriterion("C_PRICEREGION_ID not in", values, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdBetween(Long value1, Long value2) {
            addCriterion("C_PRICEREGION_ID between", value1, value2, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCPriceregionIdNotBetween(Long value1, Long value2) {
            addCriterion("C_PRICEREGION_ID not between", value1, value2, "cPriceregionId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdIsNull() {
            addCriterion("C_SUPPLIER_ID is null");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdIsNotNull() {
            addCriterion("C_SUPPLIER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdEqualTo(Long value) {
            addCriterion("C_SUPPLIER_ID =", value, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdNotEqualTo(Long value) {
            addCriterion("C_SUPPLIER_ID <>", value, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdGreaterThan(Long value) {
            addCriterion("C_SUPPLIER_ID >", value, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_SUPPLIER_ID >=", value, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdLessThan(Long value) {
            addCriterion("C_SUPPLIER_ID <", value, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdLessThanOrEqualTo(Long value) {
            addCriterion("C_SUPPLIER_ID <=", value, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdIn(List<Long> values) {
            addCriterion("C_SUPPLIER_ID in", values, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdNotIn(List<Long> values) {
            addCriterion("C_SUPPLIER_ID not in", values, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdBetween(Long value1, Long value2) {
            addCriterion("C_SUPPLIER_ID between", value1, value2, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andCSupplierIdNotBetween(Long value1, Long value2) {
            addCriterion("C_SUPPLIER_ID not between", value1, value2, "cSupplierId");
            return (Criteria) this;
        }

        public Criteria andSubsystemsIsNull() {
            addCriterion("SUBSYSTEMS is null");
            return (Criteria) this;
        }

        public Criteria andSubsystemsIsNotNull() {
            addCriterion("SUBSYSTEMS is not null");
            return (Criteria) this;
        }

        public Criteria andSubsystemsEqualTo(String value) {
            addCriterion("SUBSYSTEMS =", value, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsNotEqualTo(String value) {
            addCriterion("SUBSYSTEMS <>", value, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsGreaterThan(String value) {
            addCriterion("SUBSYSTEMS >", value, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsGreaterThanOrEqualTo(String value) {
            addCriterion("SUBSYSTEMS >=", value, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsLessThan(String value) {
            addCriterion("SUBSYSTEMS <", value, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsLessThanOrEqualTo(String value) {
            addCriterion("SUBSYSTEMS <=", value, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsLike(String value) {
            addCriterion("SUBSYSTEMS like", value, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsNotLike(String value) {
            addCriterion("SUBSYSTEMS not like", value, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsIn(List<String> values) {
            addCriterion("SUBSYSTEMS in", values, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsNotIn(List<String> values) {
            addCriterion("SUBSYSTEMS not in", values, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsBetween(String value1, String value2) {
            addCriterion("SUBSYSTEMS between", value1, value2, "subsystems");
            return (Criteria) this;
        }

        public Criteria andSubsystemsNotBetween(String value1, String value2) {
            addCriterion("SUBSYSTEMS not between", value1, value2, "subsystems");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateIsNull() {
            addCriterion("PASSWORDEXPIRATIONDATE is null");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateIsNotNull() {
            addCriterion("PASSWORDEXPIRATIONDATE is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateEqualTo(Date value) {
            addCriterion("PASSWORDEXPIRATIONDATE =", value, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateNotEqualTo(Date value) {
            addCriterion("PASSWORDEXPIRATIONDATE <>", value, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateGreaterThan(Date value) {
            addCriterion("PASSWORDEXPIRATIONDATE >", value, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateGreaterThanOrEqualTo(Date value) {
            addCriterion("PASSWORDEXPIRATIONDATE >=", value, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateLessThan(Date value) {
            addCriterion("PASSWORDEXPIRATIONDATE <", value, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateLessThanOrEqualTo(Date value) {
            addCriterion("PASSWORDEXPIRATIONDATE <=", value, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateIn(List<Date> values) {
            addCriterion("PASSWORDEXPIRATIONDATE in", values, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateNotIn(List<Date> values) {
            addCriterion("PASSWORDEXPIRATIONDATE not in", values, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateBetween(Date value1, Date value2) {
            addCriterion("PASSWORDEXPIRATIONDATE between", value1, value2, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordexpirationdateNotBetween(Date value1, Date value2) {
            addCriterion("PASSWORDEXPIRATIONDATE not between", value1, value2, "passwordexpirationdate");
            return (Criteria) this;
        }

        public Criteria andPasswordresetIsNull() {
            addCriterion("PASSWORDRESET is null");
            return (Criteria) this;
        }

        public Criteria andPasswordresetIsNotNull() {
            addCriterion("PASSWORDRESET is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordresetEqualTo(String value) {
            addCriterion("PASSWORDRESET =", value, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetNotEqualTo(String value) {
            addCriterion("PASSWORDRESET <>", value, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetGreaterThan(String value) {
            addCriterion("PASSWORDRESET >", value, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORDRESET >=", value, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetLessThan(String value) {
            addCriterion("PASSWORDRESET <", value, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetLessThanOrEqualTo(String value) {
            addCriterion("PASSWORDRESET <=", value, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetLike(String value) {
            addCriterion("PASSWORDRESET like", value, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetNotLike(String value) {
            addCriterion("PASSWORDRESET not like", value, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetIn(List<String> values) {
            addCriterion("PASSWORDRESET in", values, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetNotIn(List<String> values) {
            addCriterion("PASSWORDRESET not in", values, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetBetween(String value1, String value2) {
            addCriterion("PASSWORDRESET between", value1, value2, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andPasswordresetNotBetween(String value1, String value2) {
            addCriterion("PASSWORDRESET not between", value1, value2, "passwordreset");
            return (Criteria) this;
        }

        public Criteria andIsretIsNull() {
            addCriterion("ISRET is null");
            return (Criteria) this;
        }

        public Criteria andIsretIsNotNull() {
            addCriterion("ISRET is not null");
            return (Criteria) this;
        }

        public Criteria andIsretEqualTo(String value) {
            addCriterion("ISRET =", value, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretNotEqualTo(String value) {
            addCriterion("ISRET <>", value, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretGreaterThan(String value) {
            addCriterion("ISRET >", value, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretGreaterThanOrEqualTo(String value) {
            addCriterion("ISRET >=", value, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretLessThan(String value) {
            addCriterion("ISRET <", value, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretLessThanOrEqualTo(String value) {
            addCriterion("ISRET <=", value, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretLike(String value) {
            addCriterion("ISRET like", value, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretNotLike(String value) {
            addCriterion("ISRET not like", value, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretIn(List<String> values) {
            addCriterion("ISRET in", values, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretNotIn(List<String> values) {
            addCriterion("ISRET not in", values, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretBetween(String value1, String value2) {
            addCriterion("ISRET between", value1, value2, "isret");
            return (Criteria) this;
        }

        public Criteria andIsretNotBetween(String value1, String value2) {
            addCriterion("ISRET not between", value1, value2, "isret");
            return (Criteria) this;
        }

        public Criteria andWebposPerIsNull() {
            addCriterion("WEBPOS_PER is null");
            return (Criteria) this;
        }

        public Criteria andWebposPerIsNotNull() {
            addCriterion("WEBPOS_PER is not null");
            return (Criteria) this;
        }

        public Criteria andWebposPerEqualTo(String value) {
            addCriterion("WEBPOS_PER =", value, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerNotEqualTo(String value) {
            addCriterion("WEBPOS_PER <>", value, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerGreaterThan(String value) {
            addCriterion("WEBPOS_PER >", value, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerGreaterThanOrEqualTo(String value) {
            addCriterion("WEBPOS_PER >=", value, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerLessThan(String value) {
            addCriterion("WEBPOS_PER <", value, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerLessThanOrEqualTo(String value) {
            addCriterion("WEBPOS_PER <=", value, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerLike(String value) {
            addCriterion("WEBPOS_PER like", value, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerNotLike(String value) {
            addCriterion("WEBPOS_PER not like", value, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerIn(List<String> values) {
            addCriterion("WEBPOS_PER in", values, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerNotIn(List<String> values) {
            addCriterion("WEBPOS_PER not in", values, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerBetween(String value1, String value2) {
            addCriterion("WEBPOS_PER between", value1, value2, "webposPer");
            return (Criteria) this;
        }

        public Criteria andWebposPerNotBetween(String value1, String value2) {
            addCriterion("WEBPOS_PER not between", value1, value2, "webposPer");
            return (Criteria) this;
        }

        public Criteria andIssysIsNull() {
            addCriterion("ISSYS is null");
            return (Criteria) this;
        }

        public Criteria andIssysIsNotNull() {
            addCriterion("ISSYS is not null");
            return (Criteria) this;
        }

        public Criteria andIssysEqualTo(String value) {
            addCriterion("ISSYS =", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotEqualTo(String value) {
            addCriterion("ISSYS <>", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysGreaterThan(String value) {
            addCriterion("ISSYS >", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysGreaterThanOrEqualTo(String value) {
            addCriterion("ISSYS >=", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLessThan(String value) {
            addCriterion("ISSYS <", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLessThanOrEqualTo(String value) {
            addCriterion("ISSYS <=", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysLike(String value) {
            addCriterion("ISSYS like", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotLike(String value) {
            addCriterion("ISSYS not like", value, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysIn(List<String> values) {
            addCriterion("ISSYS in", values, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotIn(List<String> values) {
            addCriterion("ISSYS not in", values, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysBetween(String value1, String value2) {
            addCriterion("ISSYS between", value1, value2, "issys");
            return (Criteria) this;
        }

        public Criteria andIssysNotBetween(String value1, String value2) {
            addCriterion("ISSYS not between", value1, value2, "issys");
            return (Criteria) this;
        }

        public Criteria andIsSysUserIsNull() {
            addCriterion("IS_SYS_USER is null");
            return (Criteria) this;
        }

        public Criteria andIsSysUserIsNotNull() {
            addCriterion("IS_SYS_USER is not null");
            return (Criteria) this;
        }

        public Criteria andIsSysUserEqualTo(String value) {
            addCriterion("IS_SYS_USER =", value, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserNotEqualTo(String value) {
            addCriterion("IS_SYS_USER <>", value, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserGreaterThan(String value) {
            addCriterion("IS_SYS_USER >", value, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserGreaterThanOrEqualTo(String value) {
            addCriterion("IS_SYS_USER >=", value, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserLessThan(String value) {
            addCriterion("IS_SYS_USER <", value, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserLessThanOrEqualTo(String value) {
            addCriterion("IS_SYS_USER <=", value, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserLike(String value) {
            addCriterion("IS_SYS_USER like", value, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserNotLike(String value) {
            addCriterion("IS_SYS_USER not like", value, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserIn(List<String> values) {
            addCriterion("IS_SYS_USER in", values, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserNotIn(List<String> values) {
            addCriterion("IS_SYS_USER not in", values, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserBetween(String value1, String value2) {
            addCriterion("IS_SYS_USER between", value1, value2, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andIsSysUserNotBetween(String value1, String value2) {
            addCriterion("IS_SYS_USER not between", value1, value2, "isSysUser");
            return (Criteria) this;
        }

        public Criteria andCBlockIdIsNull() {
            addCriterion("C_BLOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCBlockIdIsNotNull() {
            addCriterion("C_BLOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCBlockIdEqualTo(Long value) {
            addCriterion("C_BLOCK_ID =", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdNotEqualTo(Long value) {
            addCriterion("C_BLOCK_ID <>", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdGreaterThan(Long value) {
            addCriterion("C_BLOCK_ID >", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_BLOCK_ID >=", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdLessThan(Long value) {
            addCriterion("C_BLOCK_ID <", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdLessThanOrEqualTo(Long value) {
            addCriterion("C_BLOCK_ID <=", value, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdIn(List<Long> values) {
            addCriterion("C_BLOCK_ID in", values, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdNotIn(List<Long> values) {
            addCriterion("C_BLOCK_ID not in", values, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdBetween(Long value1, Long value2) {
            addCriterion("C_BLOCK_ID between", value1, value2, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andCBlockIdNotBetween(Long value1, Long value2) {
            addCriterion("C_BLOCK_ID not between", value1, value2, "cBlockId");
            return (Criteria) this;
        }

        public Criteria andIsscanneIsNull() {
            addCriterion("ISSCANNE is null");
            return (Criteria) this;
        }

        public Criteria andIsscanneIsNotNull() {
            addCriterion("ISSCANNE is not null");
            return (Criteria) this;
        }

        public Criteria andIsscanneEqualTo(String value) {
            addCriterion("ISSCANNE =", value, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneNotEqualTo(String value) {
            addCriterion("ISSCANNE <>", value, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneGreaterThan(String value) {
            addCriterion("ISSCANNE >", value, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneGreaterThanOrEqualTo(String value) {
            addCriterion("ISSCANNE >=", value, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneLessThan(String value) {
            addCriterion("ISSCANNE <", value, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneLessThanOrEqualTo(String value) {
            addCriterion("ISSCANNE <=", value, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneLike(String value) {
            addCriterion("ISSCANNE like", value, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneNotLike(String value) {
            addCriterion("ISSCANNE not like", value, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneIn(List<String> values) {
            addCriterion("ISSCANNE in", values, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneNotIn(List<String> values) {
            addCriterion("ISSCANNE not in", values, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneBetween(String value1, String value2) {
            addCriterion("ISSCANNE between", value1, value2, "isscanne");
            return (Criteria) this;
        }

        public Criteria andIsscanneNotBetween(String value1, String value2) {
            addCriterion("ISSCANNE not between", value1, value2, "isscanne");
            return (Criteria) this;
        }

        public Criteria andBoxflownoIsNull() {
            addCriterion("BOXFLOWNO is null");
            return (Criteria) this;
        }

        public Criteria andBoxflownoIsNotNull() {
            addCriterion("BOXFLOWNO is not null");
            return (Criteria) this;
        }

        public Criteria andBoxflownoEqualTo(String value) {
            addCriterion("BOXFLOWNO =", value, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoNotEqualTo(String value) {
            addCriterion("BOXFLOWNO <>", value, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoGreaterThan(String value) {
            addCriterion("BOXFLOWNO >", value, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoGreaterThanOrEqualTo(String value) {
            addCriterion("BOXFLOWNO >=", value, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoLessThan(String value) {
            addCriterion("BOXFLOWNO <", value, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoLessThanOrEqualTo(String value) {
            addCriterion("BOXFLOWNO <=", value, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoLike(String value) {
            addCriterion("BOXFLOWNO like", value, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoNotLike(String value) {
            addCriterion("BOXFLOWNO not like", value, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoIn(List<String> values) {
            addCriterion("BOXFLOWNO in", values, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoNotIn(List<String> values) {
            addCriterion("BOXFLOWNO not in", values, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoBetween(String value1, String value2) {
            addCriterion("BOXFLOWNO between", value1, value2, "boxflowno");
            return (Criteria) this;
        }

        public Criteria andBoxflownoNotBetween(String value1, String value2) {
            addCriterion("BOXFLOWNO not between", value1, value2, "boxflowno");
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

        public Criteria andIsnoteIsNull() {
            addCriterion("ISNOTE is null");
            return (Criteria) this;
        }

        public Criteria andIsnoteIsNotNull() {
            addCriterion("ISNOTE is not null");
            return (Criteria) this;
        }

        public Criteria andIsnoteEqualTo(String value) {
            addCriterion("ISNOTE =", value, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteNotEqualTo(String value) {
            addCriterion("ISNOTE <>", value, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteGreaterThan(String value) {
            addCriterion("ISNOTE >", value, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteGreaterThanOrEqualTo(String value) {
            addCriterion("ISNOTE >=", value, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteLessThan(String value) {
            addCriterion("ISNOTE <", value, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteLessThanOrEqualTo(String value) {
            addCriterion("ISNOTE <=", value, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteLike(String value) {
            addCriterion("ISNOTE like", value, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteNotLike(String value) {
            addCriterion("ISNOTE not like", value, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteIn(List<String> values) {
            addCriterion("ISNOTE in", values, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteNotIn(List<String> values) {
            addCriterion("ISNOTE not in", values, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteBetween(String value1, String value2) {
            addCriterion("ISNOTE between", value1, value2, "isnote");
            return (Criteria) this;
        }

        public Criteria andIsnoteNotBetween(String value1, String value2) {
            addCriterion("ISNOTE not between", value1, value2, "isnote");
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

        public Criteria andCAreablockIdIsNull() {
            addCriterion("C_AREABLOCK_ID is null");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdIsNotNull() {
            addCriterion("C_AREABLOCK_ID is not null");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdEqualTo(Long value) {
            addCriterion("C_AREABLOCK_ID =", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdNotEqualTo(Long value) {
            addCriterion("C_AREABLOCK_ID <>", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdGreaterThan(Long value) {
            addCriterion("C_AREABLOCK_ID >", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdGreaterThanOrEqualTo(Long value) {
            addCriterion("C_AREABLOCK_ID >=", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdLessThan(Long value) {
            addCriterion("C_AREABLOCK_ID <", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdLessThanOrEqualTo(Long value) {
            addCriterion("C_AREABLOCK_ID <=", value, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdIn(List<Long> values) {
            addCriterion("C_AREABLOCK_ID in", values, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdNotIn(List<Long> values) {
            addCriterion("C_AREABLOCK_ID not in", values, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdBetween(Long value1, Long value2) {
            addCriterion("C_AREABLOCK_ID between", value1, value2, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCAreablockIdNotBetween(Long value1, Long value2) {
            addCriterion("C_AREABLOCK_ID not between", value1, value2, "cAreablockId");
            return (Criteria) this;
        }

        public Criteria andCheckpriceIsNull() {
            addCriterion("CHECKPRICE is null");
            return (Criteria) this;
        }

        public Criteria andCheckpriceIsNotNull() {
            addCriterion("CHECKPRICE is not null");
            return (Criteria) this;
        }

        public Criteria andCheckpriceEqualTo(String value) {
            addCriterion("CHECKPRICE =", value, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceNotEqualTo(String value) {
            addCriterion("CHECKPRICE <>", value, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceGreaterThan(String value) {
            addCriterion("CHECKPRICE >", value, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceGreaterThanOrEqualTo(String value) {
            addCriterion("CHECKPRICE >=", value, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceLessThan(String value) {
            addCriterion("CHECKPRICE <", value, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceLessThanOrEqualTo(String value) {
            addCriterion("CHECKPRICE <=", value, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceLike(String value) {
            addCriterion("CHECKPRICE like", value, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceNotLike(String value) {
            addCriterion("CHECKPRICE not like", value, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceIn(List<String> values) {
            addCriterion("CHECKPRICE in", values, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceNotIn(List<String> values) {
            addCriterion("CHECKPRICE not in", values, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceBetween(String value1, String value2) {
            addCriterion("CHECKPRICE between", value1, value2, "checkprice");
            return (Criteria) this;
        }

        public Criteria andCheckpriceNotBetween(String value1, String value2) {
            addCriterion("CHECKPRICE not between", value1, value2, "checkprice");
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