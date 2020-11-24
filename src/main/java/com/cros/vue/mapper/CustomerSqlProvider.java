package com.cros.vue.mapper;

import com.cros.vue.entity.Customer;
import com.cros.vue.entity.CustomerExample.Criteria;
import com.cros.vue.entity.CustomerExample.Criterion;
import com.cros.vue.entity.CustomerExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class CustomerSqlProvider {
    public String countByExample(CustomerExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("C_CUSTOMER");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(CustomerExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("C_CUSTOMER");
        applyWhere(sql, example, false);
        return sql.toString();
    }



    public String selectByExample(CustomerExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ID");
        } else {
            sql.SELECT("ID");
        }
        sql.SELECT("ISACTIVE");
        sql.SELECT("NAME");
        sql.SELECT("DESCRIPTION");
        sql.FROM("C_CUSTOMER");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        Customer record = (Customer) parameter.get("record");
        CustomerExample example = (CustomerExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("C_CUSTOMER");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=NUMERIC}");
        }
        
        if (record.getAdClientId() != null) {
            sql.SET("AD_CLIENT_ID = #{record.adClientId,jdbcType=NUMERIC}");
        }
        
        if (record.getAdOrgId() != null) {
            sql.SET("AD_ORG_ID = #{record.adOrgId,jdbcType=NUMERIC}");
        }
        
        if (record.getModifierid() != null) {
            sql.SET("MODIFIERID = #{record.modifierid,jdbcType=NUMERIC}");
        }
        
        if (record.getCreationdate() != null) {
            sql.SET("CREATIONDATE = #{record.creationdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifieddate() != null) {
            sql.SET("MODIFIEDDATE = #{record.modifieddate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOwnerid() != null) {
            sql.SET("OWNERID = #{record.ownerid,jdbcType=NUMERIC}");
        }
        
        if (record.getIsactive() != null) {
            sql.SET("ISACTIVE = #{record.isactive,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getEnterdate() != null) {
            sql.SET("ENTERDATE = #{record.enterdate,jdbcType=NUMERIC}");
        }
        
        if (record.getIsstop() != null) {
            sql.SET("ISSTOP = #{record.isstop,jdbcType=CHAR}");
        }
        
        if (record.getContacter() != null) {
            sql.SET("CONTACTER = #{record.contacter,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("PHONE = #{record.phone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getPost() != null) {
            sql.SET("POST = #{record.post,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("ACCOUNT = #{record.account,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{record.remark,jdbcType=VARCHAR}");
        }
        
        if (record.getTaxno() != null) {
            sql.SET("TAXNO = #{record.taxno,jdbcType=VARCHAR}");
        }
        
        if (record.getFeeremain() != null) {
            sql.SET("FEEREMAIN = #{record.feeremain,jdbcType=NUMERIC}");
        }
        
        if (record.getFeesale() != null) {
            sql.SET("FEESALE = #{record.feesale,jdbcType=NUMERIC}");
        }
        
        if (record.getSaledis() != null) {
            sql.SET("SALEDIS = #{record.saledis,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleretdis() != null) {
            sql.SET("SALERETDIS = #{record.saleretdis,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusrankId() != null) {
            sql.SET("C_CUSRANK_ID = #{record.cCusrankId,jdbcType=NUMERIC}");
        }
        
        if (record.getcCustomerupId() != null) {
            sql.SET("C_CUSTOMERUP_ID = #{record.cCustomerupId,jdbcType=NUMERIC}");
        }
        
        if (record.getFirsaledis() != null) {
            sql.SET("FIRSALEDIS = #{record.firsaledis,jdbcType=NUMERIC}");
        }
        
        if (record.getFeelsale() != null) {
            sql.SET("FEELSALE = #{record.feelsale,jdbcType=NUMERIC}");
        }
        
        if (record.getFeeltake() != null) {
            sql.SET("FEELTAKE = #{record.feeltake,jdbcType=NUMERIC}");
        }
        
        if (record.getIsperiod() != null) {
            sql.SET("ISPERIOD = #{record.isperiod,jdbcType=CHAR}");
        }
        
        if (record.getAreamngId() != null) {
            sql.SET("AREAMNG_ID = #{record.areamngId,jdbcType=NUMERIC}");
        }
        
        if (record.getcCityId() != null) {
            sql.SET("C_CITY_ID = #{record.cCityId,jdbcType=NUMERIC}");
        }
        
        if (record.getIsautoin() != null) {
            sql.SET("ISAUTOIN = #{record.isautoin,jdbcType=CHAR}");
        }
        
        if (record.getOrderrate() != null) {
            sql.SET("ORDERRATE = #{record.orderrate,jdbcType=NUMERIC}");
        }
        
        if (record.getRetRate() != null) {
            sql.SET("RET_RATE = #{record.retRate,jdbcType=NUMERIC}");
        }
        
        if (record.getBigareamngId() != null) {
            sql.SET("BIGAREAMNG_ID = #{record.bigareamngId,jdbcType=NUMERIC}");
        }
        
        if (record.getIsgroup() != null) {
            sql.SET("ISGROUP = #{record.isgroup,jdbcType=CHAR}");
        }
        
        if (record.getIsaccount() != null) {
            sql.SET("ISACCOUNT = #{record.isaccount,jdbcType=CHAR}");
        }
        
        if (record.getcDepartmentId() != null) {
            sql.SET("C_DEPARTMENT_ID = #{record.cDepartmentId,jdbcType=NUMERIC}");
        }
        
        if (record.getcClasscodeId() != null) {
            sql.SET("C_CLASSCODE_ID = #{record.cClasscodeId,jdbcType=NUMERIC}");
        }
        
        if (record.getCode() != null) {
            sql.SET("CODE = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getcAreaId() != null) {
            sql.SET("C_AREA_ID = #{record.cAreaId,jdbcType=NUMERIC}");
        }
        
        if (record.getPriority() != null) {
            sql.SET("PRIORITY = #{record.priority,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus1Id() != null) {
            sql.SET("M_DIMCUS1_ID = #{record.mDimcus1Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus2Id() != null) {
            sql.SET("M_DIMCUS2_ID = #{record.mDimcus2Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus3Id() != null) {
            sql.SET("M_DIMCUS3_ID = #{record.mDimcus3Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus4Id() != null) {
            sql.SET("M_DIMCUS4_ID = #{record.mDimcus4Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus5Id() != null) {
            sql.SET("M_DIMCUS5_ID = #{record.mDimcus5Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus6Id() != null) {
            sql.SET("M_DIMCUS6_ID = #{record.mDimcus6Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus7Id() != null) {
            sql.SET("M_DIMCUS7_ID = #{record.mDimcus7Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus8Id() != null) {
            sql.SET("M_DIMCUS8_ID = #{record.mDimcus8Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus9Id() != null) {
            sql.SET("M_DIMCUS9_ID = #{record.mDimcus9Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus10Id() != null) {
            sql.SET("M_DIMCUS10_ID = #{record.mDimcus10Id,jdbcType=NUMERIC}");
        }
        
        if (record.getButsaledis() != null) {
            sql.SET("BUTSALEDIS = #{record.butsaledis,jdbcType=NUMERIC}");
        }
        
        if (record.getAgtsaledis() != null) {
            sql.SET("AGTSALEDIS = #{record.agtsaledis,jdbcType=NUMERIC}");
        }
        
        if (record.getFirsaleretdis() != null) {
            sql.SET("FIRSALERETDIS = #{record.firsaleretdis,jdbcType=NUMERIC}");
        }
        
        if (record.getAgtsaleretdis() != null) {
            sql.SET("AGTSALERETDIS = #{record.agtsaleretdis,jdbcType=NUMERIC}");
        }
        
        if (record.getTrandis() != null) {
            sql.SET("TRANDIS = #{record.trandis,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib1Id() != null) {
            sql.SET("C_CUSATTRIB1_ID = #{record.cCusattrib1Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib2Id() != null) {
            sql.SET("C_CUSATTRIB2_ID = #{record.cCusattrib2Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib3Id() != null) {
            sql.SET("C_CUSATTRIB3_ID = #{record.cCusattrib3Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib4Id() != null) {
            sql.SET("C_CUSATTRIB4_ID = #{record.cCusattrib4Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib5Id() != null) {
            sql.SET("C_CUSATTRIB5_ID = #{record.cCusattrib5Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib6Id() != null) {
            sql.SET("C_CUSATTRIB6_ID = #{record.cCusattrib6Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib7Id() != null) {
            sql.SET("C_CUSATTRIB7_ID = #{record.cCusattrib7Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib8Id() != null) {
            sql.SET("C_CUSATTRIB8_ID = #{record.cCusattrib8Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib9Id() != null) {
            sql.SET("C_CUSATTRIB9_ID = #{record.cCusattrib9Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib10Id() != null) {
            sql.SET("C_CUSATTRIB10_ID = #{record.cCusattrib10Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib11Id() != null) {
            sql.SET("C_CUSATTRIB11_ID = #{record.cCusattrib11Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib12Id() != null) {
            sql.SET("C_CUSATTRIB12_ID = #{record.cCusattrib12Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib13Id() != null) {
            sql.SET("C_CUSATTRIB13_ID = #{record.cCusattrib13Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib14Id() != null) {
            sql.SET("C_CUSATTRIB14_ID = #{record.cCusattrib14Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib15Id() != null) {
            sql.SET("C_CUSATTRIB15_ID = #{record.cCusattrib15Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib16Id() != null) {
            sql.SET("C_CUSATTRIB16_ID = #{record.cCusattrib16Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib17Id() != null) {
            sql.SET("C_CUSATTRIB17_ID = #{record.cCusattrib17Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib18Id() != null) {
            sql.SET("C_CUSATTRIB18_ID = #{record.cCusattrib18Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib19Id() != null) {
            sql.SET("C_CUSATTRIB19_ID = #{record.cCusattrib19Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib20Id() != null) {
            sql.SET("C_CUSATTRIB20_ID = #{record.cCusattrib20Id,jdbcType=NUMERIC}");
        }
        
        if (record.getCanButsale() != null) {
            sql.SET("CAN_BUTSALE = #{record.canButsale,jdbcType=CHAR}");
        }
        
        if (record.getCanNotbutsale() != null) {
            sql.SET("CAN_NOTBUTSALE = #{record.canNotbutsale,jdbcType=CHAR}");
        }
        
        if (record.getCanAgtsale() != null) {
            sql.SET("CAN_AGTSALE = #{record.canAgtsale,jdbcType=CHAR}");
        }
        
        if (record.getIscrefund() != null) {
            sql.SET("ISCREFUND = #{record.iscrefund,jdbcType=VARCHAR}");
        }
        
        if (record.getcCustypeId() != null) {
            sql.SET("C_CUSTYPE_ID = #{record.cCustypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getmDim1Id() != null) {
            sql.SET("M_DIM1_ID = #{record.mDim1Id,jdbcType=NUMERIC}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("MOBILE = #{record.mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getCalculation() != null) {
            sql.SET("CALCULATION = #{record.calculation,jdbcType=NUMERIC}");
        }
        
        if (record.getIskd() != null) {
            sql.SET("ISKD = #{record.iskd,jdbcType=CHAR}");
        }
        
        if (record.getLegalId() != null) {
            sql.SET("LEGAL_ID = #{record.legalId,jdbcType=NUMERIC}");
        }
        
        if (record.getFirretrate() != null) {
            sql.SET("FIRRETRATE = #{record.firretrate,jdbcType=NUMERIC}");
        }
        
        if (record.getRetrate() != null) {
            sql.SET("RETRATE = #{record.retrate,jdbcType=NUMERIC}");
        }
        
        if (record.getAgtretrate() != null) {
            sql.SET("AGTRETRATE = #{record.agtretrate,jdbcType=NUMERIC}");
        }
        
        if (record.getGlCompany() != null) {
            sql.SET("GL_COMPANY = #{record.glCompany,jdbcType=VARCHAR}");
        }
        
        if (record.getProfitcenter() != null) {
            sql.SET("PROFITCENTER = #{record.profitcenter,jdbcType=VARCHAR}");
        }
        
        if (record.getIsthird() != null) {
            sql.SET("ISTHIRD = #{record.isthird,jdbcType=CHAR}");
        }
        
        if (record.getLegal() != null) {
            sql.SET("LEGAL = #{record.legal,jdbcType=VARCHAR}");
        }
        
        if (record.getIsPck() != null) {
            sql.SET("IS_PCK = #{record.isPck,jdbcType=CHAR}");
        }
        
        if (record.getIsSalePck() != null) {
            sql.SET("IS_SALE_PCK = #{record.isSalePck,jdbcType=CHAR}");
        }
        
        if (record.getIsRetputPck() != null) {
            sql.SET("IS_RETPUT_PCK = #{record.isRetputPck,jdbcType=CHAR}");
        }
        
        if (record.getImgurl1() != null) {
            sql.SET("IMGURL1 = #{record.imgurl1,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl2() != null) {
            sql.SET("IMGURL2 = #{record.imgurl2,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl3() != null) {
            sql.SET("IMGURL3 = #{record.imgurl3,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl4() != null) {
            sql.SET("IMGURL4 = #{record.imgurl4,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl5() != null) {
            sql.SET("IMGURL5 = #{record.imgurl5,jdbcType=VARCHAR}");
        }
        
        if (record.getbCuscodeFormatId() != null) {
            sql.SET("B_CUSCODE_FORMAT_ID = #{record.bCuscodeFormatId,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleinvitem() != null) {
            sql.SET("SALEINVITEM = #{record.saleinvitem,jdbcType=CHAR}");
        }
        
        if (record.getcFranchiseeId() != null) {
            sql.SET("C_FRANCHISEE_ID = #{record.cFranchiseeId,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusgroupId() != null) {
            sql.SET("C_CUSGROUP_ID = #{record.cCusgroupId,jdbcType=NUMERIC}");
        }
        
        if (record.getBank() != null) {
            sql.SET("BANK = #{record.bank,jdbcType=VARCHAR}");
        }
        
        if (record.getcCurrencyId() != null) {
            sql.SET("C_CURRENCY_ID = #{record.cCurrencyId,jdbcType=NUMERIC}");
        }
        
        if (record.getPayway() != null) {
            sql.SET("PAYWAY = #{record.payway,jdbcType=CHAR}");
        }
        
        if (record.getTradeway() != null) {
            sql.SET("TRADEWAY = #{record.tradeway,jdbcType=CHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("BIRTHDAY = #{record.birthday,jdbcType=NUMERIC}");
        }
        
        if (record.getFranchiseeRelaship() != null) {
            sql.SET("FRANCHISEE_RELASHIP = #{record.franchiseeRelaship,jdbcType=CHAR}");
        }
        
        if (record.getOpenstoreType() != null) {
            sql.SET("OPENSTORE_TYPE = #{record.openstoreType,jdbcType=CHAR}");
        }
        
        if (record.getStopdate() != null) {
            sql.SET("STOPDATE = #{record.stopdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcBranchId() != null) {
            sql.SET("C_BRANCH_ID = #{record.cBranchId,jdbcType=NUMERIC}");
        }
        
        if (record.getcSalerId() != null) {
            sql.SET("C_SALER_ID = #{record.cSalerId,jdbcType=NUMERIC}");
        }
        
        if (record.getSalesrepId() != null) {
            sql.SET("SALESREP_ID = #{record.salesrepId,jdbcType=NUMERIC}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("C_CUSTOMER");
        
        sql.SET("ID = #{record.id,jdbcType=NUMERIC}");
        sql.SET("AD_CLIENT_ID = #{record.adClientId,jdbcType=NUMERIC}");
        sql.SET("AD_ORG_ID = #{record.adOrgId,jdbcType=NUMERIC}");
        sql.SET("MODIFIERID = #{record.modifierid,jdbcType=NUMERIC}");
        sql.SET("CREATIONDATE = #{record.creationdate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFIEDDATE = #{record.modifieddate,jdbcType=TIMESTAMP}");
        sql.SET("OWNERID = #{record.ownerid,jdbcType=NUMERIC}");
        sql.SET("ISACTIVE = #{record.isactive,jdbcType=CHAR}");
        sql.SET("NAME = #{record.name,jdbcType=VARCHAR}");
        sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        sql.SET("ENTERDATE = #{record.enterdate,jdbcType=NUMERIC}");
        sql.SET("ISSTOP = #{record.isstop,jdbcType=CHAR}");
        sql.SET("CONTACTER = #{record.contacter,jdbcType=VARCHAR}");
        sql.SET("PHONE = #{record.phone,jdbcType=VARCHAR}");
        sql.SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        sql.SET("POST = #{record.post,jdbcType=VARCHAR}");
        sql.SET("ACCOUNT = #{record.account,jdbcType=VARCHAR}");
        sql.SET("EMAIL = #{record.email,jdbcType=VARCHAR}");
        sql.SET("REMARK = #{record.remark,jdbcType=VARCHAR}");
        sql.SET("TAXNO = #{record.taxno,jdbcType=VARCHAR}");
        sql.SET("FEEREMAIN = #{record.feeremain,jdbcType=NUMERIC}");
        sql.SET("FEESALE = #{record.feesale,jdbcType=NUMERIC}");
        sql.SET("SALEDIS = #{record.saledis,jdbcType=NUMERIC}");
        sql.SET("SALERETDIS = #{record.saleretdis,jdbcType=NUMERIC}");
        sql.SET("C_CUSRANK_ID = #{record.cCusrankId,jdbcType=NUMERIC}");
        sql.SET("C_CUSTOMERUP_ID = #{record.cCustomerupId,jdbcType=NUMERIC}");
        sql.SET("FIRSALEDIS = #{record.firsaledis,jdbcType=NUMERIC}");
        sql.SET("FEELSALE = #{record.feelsale,jdbcType=NUMERIC}");
        sql.SET("FEELTAKE = #{record.feeltake,jdbcType=NUMERIC}");
        sql.SET("ISPERIOD = #{record.isperiod,jdbcType=CHAR}");
        sql.SET("AREAMNG_ID = #{record.areamngId,jdbcType=NUMERIC}");
        sql.SET("C_CITY_ID = #{record.cCityId,jdbcType=NUMERIC}");
        sql.SET("ISAUTOIN = #{record.isautoin,jdbcType=CHAR}");
        sql.SET("ORDERRATE = #{record.orderrate,jdbcType=NUMERIC}");
        sql.SET("RET_RATE = #{record.retRate,jdbcType=NUMERIC}");
        sql.SET("BIGAREAMNG_ID = #{record.bigareamngId,jdbcType=NUMERIC}");
        sql.SET("ISGROUP = #{record.isgroup,jdbcType=CHAR}");
        sql.SET("ISACCOUNT = #{record.isaccount,jdbcType=CHAR}");
        sql.SET("C_DEPARTMENT_ID = #{record.cDepartmentId,jdbcType=NUMERIC}");
        sql.SET("C_CLASSCODE_ID = #{record.cClasscodeId,jdbcType=NUMERIC}");
        sql.SET("CODE = #{record.code,jdbcType=VARCHAR}");
        sql.SET("C_AREA_ID = #{record.cAreaId,jdbcType=NUMERIC}");
        sql.SET("PRIORITY = #{record.priority,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS1_ID = #{record.mDimcus1Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS2_ID = #{record.mDimcus2Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS3_ID = #{record.mDimcus3Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS4_ID = #{record.mDimcus4Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS5_ID = #{record.mDimcus5Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS6_ID = #{record.mDimcus6Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS7_ID = #{record.mDimcus7Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS8_ID = #{record.mDimcus8Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS9_ID = #{record.mDimcus9Id,jdbcType=NUMERIC}");
        sql.SET("M_DIMCUS10_ID = #{record.mDimcus10Id,jdbcType=NUMERIC}");
        sql.SET("BUTSALEDIS = #{record.butsaledis,jdbcType=NUMERIC}");
        sql.SET("AGTSALEDIS = #{record.agtsaledis,jdbcType=NUMERIC}");
        sql.SET("FIRSALERETDIS = #{record.firsaleretdis,jdbcType=NUMERIC}");
        sql.SET("AGTSALERETDIS = #{record.agtsaleretdis,jdbcType=NUMERIC}");
        sql.SET("TRANDIS = #{record.trandis,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB1_ID = #{record.cCusattrib1Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB2_ID = #{record.cCusattrib2Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB3_ID = #{record.cCusattrib3Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB4_ID = #{record.cCusattrib4Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB5_ID = #{record.cCusattrib5Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB6_ID = #{record.cCusattrib6Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB7_ID = #{record.cCusattrib7Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB8_ID = #{record.cCusattrib8Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB9_ID = #{record.cCusattrib9Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB10_ID = #{record.cCusattrib10Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB11_ID = #{record.cCusattrib11Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB12_ID = #{record.cCusattrib12Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB13_ID = #{record.cCusattrib13Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB14_ID = #{record.cCusattrib14Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB15_ID = #{record.cCusattrib15Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB16_ID = #{record.cCusattrib16Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB17_ID = #{record.cCusattrib17Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB18_ID = #{record.cCusattrib18Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB19_ID = #{record.cCusattrib19Id,jdbcType=NUMERIC}");
        sql.SET("C_CUSATTRIB20_ID = #{record.cCusattrib20Id,jdbcType=NUMERIC}");
        sql.SET("CAN_BUTSALE = #{record.canButsale,jdbcType=CHAR}");
        sql.SET("CAN_NOTBUTSALE = #{record.canNotbutsale,jdbcType=CHAR}");
        sql.SET("CAN_AGTSALE = #{record.canAgtsale,jdbcType=CHAR}");
        sql.SET("ISCREFUND = #{record.iscrefund,jdbcType=VARCHAR}");
        sql.SET("C_CUSTYPE_ID = #{record.cCustypeId,jdbcType=NUMERIC}");
        sql.SET("M_DIM1_ID = #{record.mDim1Id,jdbcType=NUMERIC}");
        sql.SET("MOBILE = #{record.mobile,jdbcType=VARCHAR}");
        sql.SET("CALCULATION = #{record.calculation,jdbcType=NUMERIC}");
        sql.SET("ISKD = #{record.iskd,jdbcType=CHAR}");
        sql.SET("LEGAL_ID = #{record.legalId,jdbcType=NUMERIC}");
        sql.SET("FIRRETRATE = #{record.firretrate,jdbcType=NUMERIC}");
        sql.SET("RETRATE = #{record.retrate,jdbcType=NUMERIC}");
        sql.SET("AGTRETRATE = #{record.agtretrate,jdbcType=NUMERIC}");
        sql.SET("GL_COMPANY = #{record.glCompany,jdbcType=VARCHAR}");
        sql.SET("PROFITCENTER = #{record.profitcenter,jdbcType=VARCHAR}");
        sql.SET("ISTHIRD = #{record.isthird,jdbcType=CHAR}");
        sql.SET("LEGAL = #{record.legal,jdbcType=VARCHAR}");
        sql.SET("IS_PCK = #{record.isPck,jdbcType=CHAR}");
        sql.SET("IS_SALE_PCK = #{record.isSalePck,jdbcType=CHAR}");
        sql.SET("IS_RETPUT_PCK = #{record.isRetputPck,jdbcType=CHAR}");
        sql.SET("IMGURL1 = #{record.imgurl1,jdbcType=VARCHAR}");
        sql.SET("IMGURL2 = #{record.imgurl2,jdbcType=VARCHAR}");
        sql.SET("IMGURL3 = #{record.imgurl3,jdbcType=VARCHAR}");
        sql.SET("IMGURL4 = #{record.imgurl4,jdbcType=VARCHAR}");
        sql.SET("IMGURL5 = #{record.imgurl5,jdbcType=VARCHAR}");
        sql.SET("B_CUSCODE_FORMAT_ID = #{record.bCuscodeFormatId,jdbcType=NUMERIC}");
        sql.SET("SALEINVITEM = #{record.saleinvitem,jdbcType=CHAR}");
        sql.SET("C_FRANCHISEE_ID = #{record.cFranchiseeId,jdbcType=NUMERIC}");
        sql.SET("C_CUSGROUP_ID = #{record.cCusgroupId,jdbcType=NUMERIC}");
        sql.SET("BANK = #{record.bank,jdbcType=VARCHAR}");
        sql.SET("C_CURRENCY_ID = #{record.cCurrencyId,jdbcType=NUMERIC}");
        sql.SET("PAYWAY = #{record.payway,jdbcType=CHAR}");
        sql.SET("TRADEWAY = #{record.tradeway,jdbcType=CHAR}");
        sql.SET("BIRTHDAY = #{record.birthday,jdbcType=NUMERIC}");
        sql.SET("FRANCHISEE_RELASHIP = #{record.franchiseeRelaship,jdbcType=CHAR}");
        sql.SET("OPENSTORE_TYPE = #{record.openstoreType,jdbcType=CHAR}");
        sql.SET("STOPDATE = #{record.stopdate,jdbcType=TIMESTAMP}");
        sql.SET("C_BRANCH_ID = #{record.cBranchId,jdbcType=NUMERIC}");
        sql.SET("C_SALER_ID = #{record.cSalerId,jdbcType=NUMERIC}");
        sql.SET("SALESREP_ID = #{record.salesrepId,jdbcType=NUMERIC}");
        
        CustomerExample example = (CustomerExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(Customer record) {
        SQL sql = new SQL();
        sql.UPDATE("C_CUSTOMER");
        
        if (record.getAdClientId() != null) {
            sql.SET("AD_CLIENT_ID = #{adClientId,jdbcType=NUMERIC}");
        }
        
        if (record.getAdOrgId() != null) {
            sql.SET("AD_ORG_ID = #{adOrgId,jdbcType=NUMERIC}");
        }
        
        if (record.getModifierid() != null) {
            sql.SET("MODIFIERID = #{modifierid,jdbcType=NUMERIC}");
        }
        
        if (record.getCreationdate() != null) {
            sql.SET("CREATIONDATE = #{creationdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifieddate() != null) {
            sql.SET("MODIFIEDDATE = #{modifieddate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOwnerid() != null) {
            sql.SET("OWNERID = #{ownerid,jdbcType=NUMERIC}");
        }
        
        if (record.getIsactive() != null) {
            sql.SET("ISACTIVE = #{isactive,jdbcType=CHAR}");
        }
        
        if (record.getName() != null) {
            sql.SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{description,jdbcType=VARCHAR}");
        }
        
        if (record.getEnterdate() != null) {
            sql.SET("ENTERDATE = #{enterdate,jdbcType=NUMERIC}");
        }
        
        if (record.getIsstop() != null) {
            sql.SET("ISSTOP = #{isstop,jdbcType=CHAR}");
        }
        
        if (record.getContacter() != null) {
            sql.SET("CONTACTER = #{contacter,jdbcType=VARCHAR}");
        }
        
        if (record.getPhone() != null) {
            sql.SET("PHONE = #{phone,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            sql.SET("ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getPost() != null) {
            sql.SET("POST = #{post,jdbcType=VARCHAR}");
        }
        
        if (record.getAccount() != null) {
            sql.SET("ACCOUNT = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("EMAIL = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getRemark() != null) {
            sql.SET("REMARK = #{remark,jdbcType=VARCHAR}");
        }
        
        if (record.getTaxno() != null) {
            sql.SET("TAXNO = #{taxno,jdbcType=VARCHAR}");
        }
        
        if (record.getFeeremain() != null) {
            sql.SET("FEEREMAIN = #{feeremain,jdbcType=NUMERIC}");
        }
        
        if (record.getFeesale() != null) {
            sql.SET("FEESALE = #{feesale,jdbcType=NUMERIC}");
        }
        
        if (record.getSaledis() != null) {
            sql.SET("SALEDIS = #{saledis,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleretdis() != null) {
            sql.SET("SALERETDIS = #{saleretdis,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusrankId() != null) {
            sql.SET("C_CUSRANK_ID = #{cCusrankId,jdbcType=NUMERIC}");
        }
        
        if (record.getcCustomerupId() != null) {
            sql.SET("C_CUSTOMERUP_ID = #{cCustomerupId,jdbcType=NUMERIC}");
        }
        
        if (record.getFirsaledis() != null) {
            sql.SET("FIRSALEDIS = #{firsaledis,jdbcType=NUMERIC}");
        }
        
        if (record.getFeelsale() != null) {
            sql.SET("FEELSALE = #{feelsale,jdbcType=NUMERIC}");
        }
        
        if (record.getFeeltake() != null) {
            sql.SET("FEELTAKE = #{feeltake,jdbcType=NUMERIC}");
        }
        
        if (record.getIsperiod() != null) {
            sql.SET("ISPERIOD = #{isperiod,jdbcType=CHAR}");
        }
        
        if (record.getAreamngId() != null) {
            sql.SET("AREAMNG_ID = #{areamngId,jdbcType=NUMERIC}");
        }
        
        if (record.getcCityId() != null) {
            sql.SET("C_CITY_ID = #{cCityId,jdbcType=NUMERIC}");
        }
        
        if (record.getIsautoin() != null) {
            sql.SET("ISAUTOIN = #{isautoin,jdbcType=CHAR}");
        }
        
        if (record.getOrderrate() != null) {
            sql.SET("ORDERRATE = #{orderrate,jdbcType=NUMERIC}");
        }
        
        if (record.getRetRate() != null) {
            sql.SET("RET_RATE = #{retRate,jdbcType=NUMERIC}");
        }
        
        if (record.getBigareamngId() != null) {
            sql.SET("BIGAREAMNG_ID = #{bigareamngId,jdbcType=NUMERIC}");
        }
        
        if (record.getIsgroup() != null) {
            sql.SET("ISGROUP = #{isgroup,jdbcType=CHAR}");
        }
        
        if (record.getIsaccount() != null) {
            sql.SET("ISACCOUNT = #{isaccount,jdbcType=CHAR}");
        }
        
        if (record.getcDepartmentId() != null) {
            sql.SET("C_DEPARTMENT_ID = #{cDepartmentId,jdbcType=NUMERIC}");
        }
        
        if (record.getcClasscodeId() != null) {
            sql.SET("C_CLASSCODE_ID = #{cClasscodeId,jdbcType=NUMERIC}");
        }
        
        if (record.getCode() != null) {
            sql.SET("CODE = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getcAreaId() != null) {
            sql.SET("C_AREA_ID = #{cAreaId,jdbcType=NUMERIC}");
        }
        
        if (record.getPriority() != null) {
            sql.SET("PRIORITY = #{priority,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus1Id() != null) {
            sql.SET("M_DIMCUS1_ID = #{mDimcus1Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus2Id() != null) {
            sql.SET("M_DIMCUS2_ID = #{mDimcus2Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus3Id() != null) {
            sql.SET("M_DIMCUS3_ID = #{mDimcus3Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus4Id() != null) {
            sql.SET("M_DIMCUS4_ID = #{mDimcus4Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus5Id() != null) {
            sql.SET("M_DIMCUS5_ID = #{mDimcus5Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus6Id() != null) {
            sql.SET("M_DIMCUS6_ID = #{mDimcus6Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus7Id() != null) {
            sql.SET("M_DIMCUS7_ID = #{mDimcus7Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus8Id() != null) {
            sql.SET("M_DIMCUS8_ID = #{mDimcus8Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus9Id() != null) {
            sql.SET("M_DIMCUS9_ID = #{mDimcus9Id,jdbcType=NUMERIC}");
        }
        
        if (record.getmDimcus10Id() != null) {
            sql.SET("M_DIMCUS10_ID = #{mDimcus10Id,jdbcType=NUMERIC}");
        }
        
        if (record.getButsaledis() != null) {
            sql.SET("BUTSALEDIS = #{butsaledis,jdbcType=NUMERIC}");
        }
        
        if (record.getAgtsaledis() != null) {
            sql.SET("AGTSALEDIS = #{agtsaledis,jdbcType=NUMERIC}");
        }
        
        if (record.getFirsaleretdis() != null) {
            sql.SET("FIRSALERETDIS = #{firsaleretdis,jdbcType=NUMERIC}");
        }
        
        if (record.getAgtsaleretdis() != null) {
            sql.SET("AGTSALERETDIS = #{agtsaleretdis,jdbcType=NUMERIC}");
        }
        
        if (record.getTrandis() != null) {
            sql.SET("TRANDIS = #{trandis,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib1Id() != null) {
            sql.SET("C_CUSATTRIB1_ID = #{cCusattrib1Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib2Id() != null) {
            sql.SET("C_CUSATTRIB2_ID = #{cCusattrib2Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib3Id() != null) {
            sql.SET("C_CUSATTRIB3_ID = #{cCusattrib3Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib4Id() != null) {
            sql.SET("C_CUSATTRIB4_ID = #{cCusattrib4Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib5Id() != null) {
            sql.SET("C_CUSATTRIB5_ID = #{cCusattrib5Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib6Id() != null) {
            sql.SET("C_CUSATTRIB6_ID = #{cCusattrib6Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib7Id() != null) {
            sql.SET("C_CUSATTRIB7_ID = #{cCusattrib7Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib8Id() != null) {
            sql.SET("C_CUSATTRIB8_ID = #{cCusattrib8Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib9Id() != null) {
            sql.SET("C_CUSATTRIB9_ID = #{cCusattrib9Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib10Id() != null) {
            sql.SET("C_CUSATTRIB10_ID = #{cCusattrib10Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib11Id() != null) {
            sql.SET("C_CUSATTRIB11_ID = #{cCusattrib11Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib12Id() != null) {
            sql.SET("C_CUSATTRIB12_ID = #{cCusattrib12Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib13Id() != null) {
            sql.SET("C_CUSATTRIB13_ID = #{cCusattrib13Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib14Id() != null) {
            sql.SET("C_CUSATTRIB14_ID = #{cCusattrib14Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib15Id() != null) {
            sql.SET("C_CUSATTRIB15_ID = #{cCusattrib15Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib16Id() != null) {
            sql.SET("C_CUSATTRIB16_ID = #{cCusattrib16Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib17Id() != null) {
            sql.SET("C_CUSATTRIB17_ID = #{cCusattrib17Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib18Id() != null) {
            sql.SET("C_CUSATTRIB18_ID = #{cCusattrib18Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib19Id() != null) {
            sql.SET("C_CUSATTRIB19_ID = #{cCusattrib19Id,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusattrib20Id() != null) {
            sql.SET("C_CUSATTRIB20_ID = #{cCusattrib20Id,jdbcType=NUMERIC}");
        }
        
        if (record.getCanButsale() != null) {
            sql.SET("CAN_BUTSALE = #{canButsale,jdbcType=CHAR}");
        }
        
        if (record.getCanNotbutsale() != null) {
            sql.SET("CAN_NOTBUTSALE = #{canNotbutsale,jdbcType=CHAR}");
        }
        
        if (record.getCanAgtsale() != null) {
            sql.SET("CAN_AGTSALE = #{canAgtsale,jdbcType=CHAR}");
        }
        
        if (record.getIscrefund() != null) {
            sql.SET("ISCREFUND = #{iscrefund,jdbcType=VARCHAR}");
        }
        
        if (record.getcCustypeId() != null) {
            sql.SET("C_CUSTYPE_ID = #{cCustypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getmDim1Id() != null) {
            sql.SET("M_DIM1_ID = #{mDim1Id,jdbcType=NUMERIC}");
        }
        
        if (record.getMobile() != null) {
            sql.SET("MOBILE = #{mobile,jdbcType=VARCHAR}");
        }
        
        if (record.getCalculation() != null) {
            sql.SET("CALCULATION = #{calculation,jdbcType=NUMERIC}");
        }
        
        if (record.getIskd() != null) {
            sql.SET("ISKD = #{iskd,jdbcType=CHAR}");
        }
        
        if (record.getLegalId() != null) {
            sql.SET("LEGAL_ID = #{legalId,jdbcType=NUMERIC}");
        }
        
        if (record.getFirretrate() != null) {
            sql.SET("FIRRETRATE = #{firretrate,jdbcType=NUMERIC}");
        }
        
        if (record.getRetrate() != null) {
            sql.SET("RETRATE = #{retrate,jdbcType=NUMERIC}");
        }
        
        if (record.getAgtretrate() != null) {
            sql.SET("AGTRETRATE = #{agtretrate,jdbcType=NUMERIC}");
        }
        
        if (record.getGlCompany() != null) {
            sql.SET("GL_COMPANY = #{glCompany,jdbcType=VARCHAR}");
        }
        
        if (record.getProfitcenter() != null) {
            sql.SET("PROFITCENTER = #{profitcenter,jdbcType=VARCHAR}");
        }
        
        if (record.getIsthird() != null) {
            sql.SET("ISTHIRD = #{isthird,jdbcType=CHAR}");
        }
        
        if (record.getLegal() != null) {
            sql.SET("LEGAL = #{legal,jdbcType=VARCHAR}");
        }
        
        if (record.getIsPck() != null) {
            sql.SET("IS_PCK = #{isPck,jdbcType=CHAR}");
        }
        
        if (record.getIsSalePck() != null) {
            sql.SET("IS_SALE_PCK = #{isSalePck,jdbcType=CHAR}");
        }
        
        if (record.getIsRetputPck() != null) {
            sql.SET("IS_RETPUT_PCK = #{isRetputPck,jdbcType=CHAR}");
        }
        
        if (record.getImgurl1() != null) {
            sql.SET("IMGURL1 = #{imgurl1,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl2() != null) {
            sql.SET("IMGURL2 = #{imgurl2,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl3() != null) {
            sql.SET("IMGURL3 = #{imgurl3,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl4() != null) {
            sql.SET("IMGURL4 = #{imgurl4,jdbcType=VARCHAR}");
        }
        
        if (record.getImgurl5() != null) {
            sql.SET("IMGURL5 = #{imgurl5,jdbcType=VARCHAR}");
        }
        
        if (record.getbCuscodeFormatId() != null) {
            sql.SET("B_CUSCODE_FORMAT_ID = #{bCuscodeFormatId,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleinvitem() != null) {
            sql.SET("SALEINVITEM = #{saleinvitem,jdbcType=CHAR}");
        }
        
        if (record.getcFranchiseeId() != null) {
            sql.SET("C_FRANCHISEE_ID = #{cFranchiseeId,jdbcType=NUMERIC}");
        }
        
        if (record.getcCusgroupId() != null) {
            sql.SET("C_CUSGROUP_ID = #{cCusgroupId,jdbcType=NUMERIC}");
        }
        
        if (record.getBank() != null) {
            sql.SET("BANK = #{bank,jdbcType=VARCHAR}");
        }
        
        if (record.getcCurrencyId() != null) {
            sql.SET("C_CURRENCY_ID = #{cCurrencyId,jdbcType=NUMERIC}");
        }
        
        if (record.getPayway() != null) {
            sql.SET("PAYWAY = #{payway,jdbcType=CHAR}");
        }
        
        if (record.getTradeway() != null) {
            sql.SET("TRADEWAY = #{tradeway,jdbcType=CHAR}");
        }
        
        if (record.getBirthday() != null) {
            sql.SET("BIRTHDAY = #{birthday,jdbcType=NUMERIC}");
        }
        
        if (record.getFranchiseeRelaship() != null) {
            sql.SET("FRANCHISEE_RELASHIP = #{franchiseeRelaship,jdbcType=CHAR}");
        }
        
        if (record.getOpenstoreType() != null) {
            sql.SET("OPENSTORE_TYPE = #{openstoreType,jdbcType=CHAR}");
        }
        
        if (record.getStopdate() != null) {
            sql.SET("STOPDATE = #{stopdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcBranchId() != null) {
            sql.SET("C_BRANCH_ID = #{cBranchId,jdbcType=NUMERIC}");
        }
        
        if (record.getcSalerId() != null) {
            sql.SET("C_SALER_ID = #{cSalerId,jdbcType=NUMERIC}");
        }
        
        if (record.getSalesrepId() != null) {
            sql.SET("SALESREP_ID = #{salesrepId,jdbcType=NUMERIC}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=NUMERIC}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, CustomerExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}