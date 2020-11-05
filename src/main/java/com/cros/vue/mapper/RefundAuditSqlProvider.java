package com.cros.vue.mapper;

import com.cros.vue.entity.RefundAudit;
import com.cros.vue.entity.RefundAuditExample.Criteria;
import com.cros.vue.entity.RefundAuditExample.Criterion;
import com.cros.vue.entity.RefundAuditExample;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

public class RefundAuditSqlProvider {
    public String countByExample(RefundAuditExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("M_RET_SALECONF");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RefundAuditExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("M_RET_SALECONF");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(RefundAudit record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("M_RET_SALECONF");
        
        if (record.getId() != null) {
            sql.VALUES("ID", "#{id,jdbcType=NUMERIC}");
        }
        
        if (record.getAdClientId() != null) {
            sql.VALUES("AD_CLIENT_ID", "#{adClientId,jdbcType=NUMERIC}");
        }
        
        if (record.getAdOrgId() != null) {
            sql.VALUES("AD_ORG_ID", "#{adOrgId,jdbcType=NUMERIC}");
        }
        
        if (record.getOwnerid() != null) {
            sql.VALUES("OWNERID", "#{ownerid,jdbcType=NUMERIC}");
        }
        
        if (record.getModifierid() != null) {
            sql.VALUES("MODIFIERID", "#{modifierid,jdbcType=NUMERIC}");
        }
        
        if (record.getCreationdate() != null) {
            sql.VALUES("CREATIONDATE", "#{creationdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getModifieddate() != null) {
            sql.VALUES("MODIFIEDDATE", "#{modifieddate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getIsactive() != null) {
            sql.VALUES("ISACTIVE", "#{isactive,jdbcType=CHAR}");
        }
        
        if (record.getDocno() != null) {
            sql.VALUES("DOCNO", "#{docno,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctype() != null) {
            sql.VALUES("DOCTYPE", "#{doctype,jdbcType=CHAR}");
        }
        
        if (record.getBilldate() != null) {
            sql.VALUES("BILLDATE", "#{billdate,jdbcType=NUMERIC}");
        }
        
        if (record.getSalesrepId() != null) {
            sql.VALUES("SALESREP_ID", "#{salesrepId,jdbcType=NUMERIC}");
        }
        
        if (record.getcStoreId() != null) {
            sql.VALUES("C_STORE_ID", "#{cStoreId,jdbcType=NUMERIC}");
        }
        
        if (record.getcCustomerId() != null) {
            sql.VALUES("C_CUSTOMER_ID", "#{cCustomerId,jdbcType=NUMERIC}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getAuState() != null) {
            sql.VALUES("AU_STATE", "#{auState,jdbcType=CHAR}");
        }
        
        if (record.getAuPiId() != null) {
            sql.VALUES("AU_PI_ID", "#{auPiId,jdbcType=NUMERIC}");
        }
        
        if (record.getAvgDiscount() != null) {
            sql.VALUES("AVG_DISCOUNT", "#{avgDiscount,jdbcType=NUMERIC}");
        }
        
        if (record.getTotLines() != null) {
            sql.VALUES("TOT_LINES", "#{totLines,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQty() != null) {
            sql.VALUES("TOT_QTY", "#{totQty,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtList() != null) {
            sql.VALUES("TOT_AMT_LIST", "#{totAmtList,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtActual() != null) {
            sql.VALUES("TOT_AMT_ACTUAL", "#{totAmtActual,jdbcType=NUMERIC}");
        }
        
        if (record.getcPeriodId() != null) {
            sql.VALUES("C_PERIOD_ID", "#{cPeriodId,jdbcType=NUMERIC}");
        }
        
        if (record.getcOrigId() != null) {
            sql.VALUES("C_ORIG_ID", "#{cOrigId,jdbcType=NUMERIC}");
        }
        
        if (record.getOutStatus() != null) {
            sql.VALUES("OUT_STATUS", "#{outStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getInStatus() != null) {
            sql.VALUES("IN_STATUS", "#{inStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQtyout() != null) {
            sql.VALUES("TOT_QTYOUT", "#{totQtyout,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtoutList() != null) {
            sql.VALUES("TOT_AMTOUT_LIST", "#{totAmtoutList,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtoutActual() != null) {
            sql.VALUES("TOT_AMTOUT_ACTUAL", "#{totAmtoutActual,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQtyin() != null) {
            sql.VALUES("TOT_QTYIN", "#{totQtyin,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtinList() != null) {
            sql.VALUES("TOT_AMTIN_LIST", "#{totAmtinList,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtinActual() != null) {
            sql.VALUES("TOT_AMTIN_ACTUAL", "#{totAmtinActual,jdbcType=NUMERIC}");
        }
        
        if (record.getDiffreason() != null) {
            sql.VALUES("DIFFREASON", "#{diffreason,jdbcType=VARCHAR}");
        }
        
        if (record.getDateout() != null) {
            sql.VALUES("DATEOUT", "#{dateout,jdbcType=NUMERIC}");
        }
        
        if (record.getDatein() != null) {
            sql.VALUES("DATEIN", "#{datein,jdbcType=NUMERIC}");
        }
        
        if (record.getcCustomerupId() != null) {
            sql.VALUES("C_CUSTOMERUP_ID", "#{cCustomerupId,jdbcType=NUMERIC}");
        }
        
        if (record.getRetsaletype() != null) {
            sql.VALUES("RETSALETYPE", "#{retsaletype,jdbcType=CHAR}");
        }
        
        if (record.getRetsaletype1() != null) {
            sql.VALUES("RETSALETYPE1", "#{retsaletype1,jdbcType=CHAR}");
        }
        
        if (record.getStatuserid() != null) {
            sql.VALUES("STATUSERID", "#{statuserid,jdbcType=NUMERIC}");
        }
        
        if (record.getStatustime() != null) {
            sql.VALUES("STATUSTIME", "#{statustime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInerid() != null) {
            sql.VALUES("INERID", "#{inerid,jdbcType=NUMERIC}");
        }
        
        if (record.getIntime() != null) {
            sql.VALUES("INTIME", "#{intime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOuterid() != null) {
            sql.VALUES("OUTERID", "#{outerid,jdbcType=NUMERIC}");
        }
        
        if (record.getOuttime() != null) {
            sql.VALUES("OUTTIME", "#{outtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcRetSaletypeId() != null) {
            sql.VALUES("C_RET_SALETYPE_ID", "#{cRetSaletypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getBoxStatus() != null) {
            sql.VALUES("BOX_STATUS", "#{boxStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getcTranwayJzId() != null) {
            sql.VALUES("C_TRANWAY_JZ_ID", "#{cTranwayJzId,jdbcType=NUMERIC}");
        }
        
        if (record.getTranwayno() != null) {
            sql.VALUES("TRANWAYNO", "#{tranwayno,jdbcType=VARCHAR}");
        }
        
        if (record.getTranwayPay() != null) {
            sql.VALUES("TRANWAY_PAY", "#{tranwayPay,jdbcType=NUMERIC}");
        }
        
        if (record.getOperatoerid() != null) {
            sql.VALUES("OPERATOERID", "#{operatoerid,jdbcType=NUMERIC}");
        }
        
        if (record.getOperStatus() != null) {
            sql.VALUES("OPER_STATUS", "#{operStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getPickerid() != null) {
            sql.VALUES("PICKERID", "#{pickerid,jdbcType=NUMERIC}");
        }
        
        if (record.getIsuf() != null) {
            sql.VALUES("ISUF", "#{isuf,jdbcType=CHAR}");
        }
        
        if (record.getProcessMode() != null) {
            sql.VALUES("PROCESS_MODE", "#{processMode,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtPrecost() != null) {
            sql.VALUES("TOT_AMT_PRECOST", "#{totAmtPrecost,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtinPrecost() != null) {
            sql.VALUES("TOT_AMTIN_PRECOST", "#{totAmtinPrecost,jdbcType=NUMERIC}");
        }
        
        if (record.getDiscount() != null) {
            sql.VALUES("DISCOUNT", "#{discount,jdbcType=NUMERIC}");
        }
        
        if (record.getIsbox() != null) {
            sql.VALUES("ISBOX", "#{isbox,jdbcType=NUMERIC}");
        }
        
        if (record.getcSaledistypeId() != null) {
            sql.VALUES("C_SALEDISTYPE_ID", "#{cSaledistypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getImageurl() != null) {
            sql.VALUES("IMAGEURL", "#{imageurl,jdbcType=VARCHAR}");
        }
        
        if (record.getcCargotypeId() != null) {
            sql.VALUES("C_CARGOTYPE_ID", "#{cCargotypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getcStoreLocationId() != null) {
            sql.VALUES("C_STORE_LOCATION_ID", "#{cStoreLocationId,jdbcType=NUMERIC}");
        }
        
        if (record.getPrinttimes() != null) {
            sql.VALUES("PRINTTIMES", "#{printtimes,jdbcType=NUMERIC}");
        }
        
        if (record.getPrintouttimes() != null) {
            sql.VALUES("PRINTOUTTIMES", "#{printouttimes,jdbcType=NUMERIC}");
        }
        
        if (record.getPrintintimes() != null) {
            sql.VALUES("PRINTINTIMES", "#{printintimes,jdbcType=NUMERIC}");
        }
        
        if (record.getcCargointypeId() != null) {
            sql.VALUES("C_CARGOINTYPE_ID", "#{cCargointypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getScanstate() != null) {
            sql.VALUES("SCANSTATE", "#{scanstate,jdbcType=CHAR}");
        }
        
        if (record.getSendqty() != null) {
            sql.VALUES("SENDQTY", "#{sendqty,jdbcType=NUMERIC}");
        }
        
        if (record.getSubsendqty() != null) {
            sql.VALUES("SUBSENDQTY", "#{subsendqty,jdbcType=NUMERIC}");
        }
        
        if (record.getRealdate() != null) {
            sql.VALUES("REALDATE", "#{realdate,jdbcType=NUMERIC}");
        }
        
        if (record.getIfmove() != null) {
            sql.VALUES("IFMOVE", "#{ifmove,jdbcType=CHAR}");
        }
        
        if (record.getOutAuState() != null) {
            sql.VALUES("OUT_AU_STATE", "#{outAuState,jdbcType=CHAR}");
        }
        
        if (record.getOutAuPiId() != null) {
            sql.VALUES("OUT_AU_PI_ID", "#{outAuPiId,jdbcType=NUMERIC}");
        }
        
        if (record.getInAuState() != null) {
            sql.VALUES("IN_AU_STATE", "#{inAuState,jdbcType=CHAR}");
        }
        
        if (record.getInAuPiId() != null) {
            sql.VALUES("IN_AU_PI_ID", "#{inAuPiId,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtPrice() != null) {
            sql.VALUES("TOT_AMT_PRICE", "#{totAmtPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getAmtDeduction() != null) {
            sql.VALUES("AMT_DEDUCTION", "#{amtDeduction,jdbcType=NUMERIC}");
        }
        
        if (record.getPckStatus() != null) {
            sql.VALUES("PCK_STATUS", "#{pckStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getPcheckid() != null) {
            sql.VALUES("PCHECKID", "#{pcheckid,jdbcType=NUMERIC}");
        }
        
        if (record.getPchecktime() != null) {
            sql.VALUES("PCHECKTIME", "#{pchecktime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTotAmtinved() != null) {
            sql.VALUES("TOT_AMTINVED", "#{totAmtinved,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQtyinved() != null) {
            sql.VALUES("TOT_QTYINVED", "#{totQtyinved,jdbcType=NUMERIC}");
        }
        
        if (record.getmCroretsaleId() != null) {
            sql.VALUES("M_CRORETSALE_ID", "#{mCroretsaleId,jdbcType=NUMERIC}");
        }
        
        if (record.getIsMainRetsale() != null) {
            sql.VALUES("IS_MAIN_RETSALE", "#{isMainRetsale,jdbcType=CHAR}");
        }
        
        if (record.getIsCroretsalein() != null) {
            sql.VALUES("IS_CRORETSALEIN", "#{isCroretsalein,jdbcType=CHAR}");
        }
        
        if (record.getCarrier() != null) {
            sql.VALUES("CARRIER", "#{carrier,jdbcType=VARCHAR}");
        }
        
        if (record.getShippingRemark() != null) {
            sql.VALUES("SHIPPING_REMARK", "#{shippingRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getIsTowms() != null) {
            sql.VALUES("IS_TOWMS", "#{isTowms,jdbcType=CHAR}");
        }
        
        if (record.getDestAddr() != null) {
            sql.VALUES("DEST_ADDR", "#{destAddr,jdbcType=VARCHAR}");
        }
        
        if (record.getmBoxId() != null) {
            sql.VALUES("M_BOX_ID", "#{mBoxId,jdbcType=NUMERIC}");
        }
        
        if (record.getQtyBox() != null) {
            sql.VALUES("QTY_BOX", "#{qtyBox,jdbcType=NUMERIC}");
        }
        
        if (record.getTotTaxAmt() != null) {
            sql.VALUES("TOT_TAX_AMT", "#{totTaxAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getTotNotaxAmt() != null) {
            sql.VALUES("TOT_NOTAX_AMT", "#{totNotaxAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getTaxDis() != null) {
            sql.VALUES("TAX_DIS", "#{taxDis,jdbcType=NUMERIC}");
        }
        
        if (record.getPaymentstyle() != null) {
            sql.VALUES("PAYMENTSTYLE", "#{paymentstyle,jdbcType=CHAR}");
        }
        
        if (record.getScanStatus() != null) {
            sql.VALUES("SCAN_STATUS", "#{scanStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getBillkind() != null) {
            sql.VALUES("BILLKIND", "#{billkind,jdbcType=NUMERIC}");
        }
        
        if (record.getContractnoFile() != null) {
            sql.VALUES("CONTRACTNO_FILE", "#{contractnoFile,jdbcType=VARCHAR}");
        }
        
        if (record.getConfirmStatus() != null) {
            sql.VALUES("CONFIRM_STATUS", "#{confirmStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getConfirmStatustime() != null) {
            sql.VALUES("CONFIRM_STATUSTIME", "#{confirmStatustime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getConfirmStatuserid() != null) {
            sql.VALUES("CONFIRM_STATUSERID", "#{confirmStatuserid,jdbcType=NUMERIC}");
        }
        
        if (record.getBillno() != null) {
            sql.VALUES("BILLNO", "#{billno,jdbcType=VARCHAR}");
        }
        
        if (record.getFisno() != null) {
            sql.VALUES("FISNO", "#{fisno,jdbcType=VARCHAR}");
        }
        
        if (record.getByinStatus() != null) {
            sql.VALUES("BYIN_STATUS", "#{byinStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getScannerid() != null) {
            sql.VALUES("SCANNERID", "#{scannerid,jdbcType=NUMERIC}");
        }
        
        if (record.getcSalerId() != null) {
            sql.VALUES("C_SALER_ID", "#{cSalerId,jdbcType=NUMERIC}");
        }
        
        if (record.getScanIntime() != null) {
            sql.VALUES("SCAN_INTIME", "#{scanIntime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getConfirmIntime() != null) {
            sql.VALUES("CONFIRM_INTIME", "#{confirmIntime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliveryConfirmtime() != null) {
            sql.VALUES("DELIVERY_CONFIRMTIME", "#{deliveryConfirmtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getByoutStatus() != null) {
            sql.VALUES("BYOUT_STATUS", "#{byoutStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getUnpickStoreId() != null) {
            sql.VALUES("UNPICK_STORE_ID", "#{unpickStoreId,jdbcType=NUMERIC}");
        }
        
        if (record.getScaninStatus() != null) {
            sql.VALUES("SCANIN_STATUS", "#{scaninStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getBehalfRemark() != null) {
            sql.VALUES("BEHALF_REMARK", "#{behalfRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdefaultscan() != null) {
            sql.VALUES("ISDEFAULTSCAN", "#{isdefaultscan,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("STATUS", "#{status,jdbcType=NUMERIC}");
        }
        
        if (record.getRetinfo() != null) {
            sql.VALUES("RETINFO", "#{retinfo,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleType() != null) {
            sql.VALUES("SALE_TYPE", "#{saleType,jdbcType=NUMERIC}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RefundAuditExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("t1.ID");
        } else {
            sql.SELECT("t1.ID");
        }
        sql.SELECT("t1.AD_CLIENT_ID");
        sql.SELECT("t1.AD_ORG_ID");
        sql.SELECT("t1.OWNERID");
        sql.SELECT("t1.MODIFIERID");
        sql.SELECT("t1.CREATIONDATE");
        sql.SELECT("t1.MODIFIEDDATE");
        sql.SELECT("t1.ISACTIVE");
        sql.SELECT("t1.DOCNO");
        sql.SELECT("t1.DOCTYPE");
        sql.SELECT("to_date(t1.BILLDATE,'YYYY-MM-DD')");
        sql.SELECT("t1.SALESREP_ID");
        sql.SELECT("t1.C_STORE_ID");
        sql.SELECT("t1.C_CUSTOMER_ID");
        sql.SELECT("t1.DESCRIPTION");
        sql.SELECT("t1.AU_STATE");
        sql.SELECT("t1.AU_PI_ID");
        sql.SELECT("t1.AVG_DISCOUNT");
        sql.SELECT("t1.TOT_LINES");
        sql.SELECT("t1.TOT_QTY");
        sql.SELECT("t1.TOT_AMT_LIST");
        sql.SELECT("t1.TOT_AMT_ACTUAL");
        sql.SELECT("t1.C_PERIOD_ID");
        sql.SELECT("t1.C_ORIG_ID");
        sql.SELECT("t1.OUT_STATUS");
        sql.SELECT("t1.IN_STATUS");
        sql.SELECT("t1.TOT_QTYOUT");
        sql.SELECT("t1.TOT_AMTOUT_LIST");
        sql.SELECT("t1.TOT_AMTOUT_ACTUAL");
        sql.SELECT("t1.TOT_QTYIN");
        sql.SELECT("t1.TOT_AMTIN_LIST");
        sql.SELECT("t1.TOT_AMTIN_ACTUAL");
        sql.SELECT("t1.DIFFREASON");
        sql.SELECT("t1.DATEOUT");
        sql.SELECT("t1.DATEIN");
        sql.SELECT("t1.C_CUSTOMERUP_ID");
        sql.SELECT("t1.RETSALETYPE");
        sql.SELECT("t8.description retsaleName");
        sql.SELECT("t1.RETSALETYPE1");
        sql.SELECT("t1.STATUSERID");
        sql.SELECT("t1.STATUSTIME");
        sql.SELECT("t1.INERID");
        sql.SELECT("t1.INTIME");
        sql.SELECT("t1.OUTERID");
        sql.SELECT("t1.OUTTIME");
        sql.SELECT("t1.C_RET_SALETYPE_ID");
        sql.SELECT("t1.BOX_STATUS");
        sql.SELECT("t1.C_TRANWAY_JZ_ID");
        sql.SELECT("t1.TRANWAYNO");
        sql.SELECT("t1.TRANWAY_PAY");
        sql.SELECT("t1.OPERATOERID");
        sql.SELECT("t1.OPER_STATUS");
        sql.SELECT("t1.PICKERID");
        sql.SELECT("t1.ISUF");
        sql.SELECT("t1.PROCESS_MODE");
        sql.SELECT("t1.TOT_AMT_PRECOST");
        sql.SELECT("t1.TOT_AMTIN_PRECOST");
        sql.SELECT("t1.DISCOUNT");
        sql.SELECT("t1.ISBOX");
        sql.SELECT("t1.C_SALEDISTYPE_ID");
        sql.SELECT("t1.IMAGEURL");
        sql.SELECT("t1.C_CARGOTYPE_ID");
        sql.SELECT("t1.C_STORE_LOCATION_ID");
        sql.SELECT("t1.PRINTTIMES");
        sql.SELECT("t1.PRINTOUTTIMES");
        sql.SELECT("t1.PRINTINTIMES");
        sql.SELECT("t1.C_CARGOINTYPE_ID");
        sql.SELECT("t1.SCANSTATE");
        sql.SELECT("t1.SENDQTY");
        sql.SELECT("t1.SUBSENDQTY");
        sql.SELECT("t1.REALDATE");
        sql.SELECT("t1.IFMOVE");
        sql.SELECT("t1.OUT_AU_STATE");
        sql.SELECT("t1.OUT_AU_PI_ID");
        sql.SELECT("t1.IN_AU_STATE");
        sql.SELECT("t1.IN_AU_PI_ID");
        sql.SELECT("t1.TOT_AMT_PRICE");
        sql.SELECT("t1.AMT_DEDUCTION");
        sql.SELECT("t1.PCK_STATUS");
        sql.SELECT("t1.PCHECKID");
        sql.SELECT("t1.PCHECKTIME");
        sql.SELECT("t1.TOT_AMTINVED");
        sql.SELECT("t1.TOT_QTYINVED");
        sql.SELECT("t1.M_CRORETSALE_ID");
        sql.SELECT("t1.IS_MAIN_RETSALE");
        sql.SELECT("t1.IS_CRORETSALEIN");
        sql.SELECT("t1.CARRIER");
        sql.SELECT("t1.SHIPPING_REMARK");
        sql.SELECT("t1.IS_TOWMS");
        sql.SELECT("t1.DEST_ADDR");
        sql.SELECT("t1.M_BOX_ID");
        sql.SELECT("t1.QTY_BOX");
        sql.SELECT("t1.TOT_TAX_AMT");
        sql.SELECT("t1.TOT_NOTAX_AMT");
        sql.SELECT("t1.TAX_DIS");
        sql.SELECT("t1.PAYMENTSTYLE");
        sql.SELECT("t1.SCAN_STATUS");
        sql.SELECT("t1.BILLKIND");
        sql.SELECT("t9.description billName");
        sql.SELECT("t1.CONTRACTNO_FILE");
        sql.SELECT("t1.CONFIRM_STATUS");
        sql.SELECT("t1.CONFIRM_STATUSTIME");
        sql.SELECT("t1.CONFIRM_STATUSERID");
        sql.SELECT("t1.BILLNO");
        sql.SELECT("t1.FISNO");
        sql.SELECT("t1.BYIN_STATUS");
        sql.SELECT("t1.SCANNERID");
        sql.SELECT("t1.C_SALER_ID");
        sql.SELECT("t1.SCAN_INTIME");
        sql.SELECT("t1.CONFIRM_INTIME");
        sql.SELECT("t1.DELIVERY_CONFIRMTIME");
        sql.SELECT("t1.BYOUT_STATUS");
        sql.SELECT("t1.UNPICK_STORE_ID");
        sql.SELECT("t1.SCANIN_STATUS");
        sql.SELECT("t1.BEHALF_REMARK");
        sql.SELECT("t1.ISDEFAULTSCAN");
        sql.SELECT("t1.STATUS");
        sql.SELECT("t6.description statusName");
        sql.SELECT("t1.RETINFO");
        sql.SELECT("t1.SALE_TYPE");
        sql.SELECT("t2.name storeName");
        sql.SELECT("t2.code storeCode");
        sql.SELECT("t3.name blockName");
        sql.SELECT("t3.code blockCode");
        sql.SELECT("t4.code lcCode");
        sql.SELECT("t4.name lcName");
        sql.SELECT("t4.description lcDescription");
        sql.SELECT("t5.code custCode");
        sql.SELECT("t5.name custName");
        sql.SELECT("t5.description custDescription");
        StringBuilder sb=new StringBuilder("");
        sb.append("M_RET_SALECONF t1 inner join C_STORE t2  on t1.C_STORE_ID=t2.id ");
        sb.append("left join  C_BLOCK t3 on t2.C_BLOCK_ID=t3.id ");
        sb.append("inner join C_STORE t4 on t1.C_ORIG_ID=t4.id ");
        sb.append("inner join C_CUSTOMER t5 on t1.C_CUSTOMER_ID=t5.id ");
        sb.append("left join AD_LIMITVALUE t6 on t1.STATUS=t6.value and t6.ad_limitvalue_group_id=1609 ");
        sb.append("left join AD_LIMITVALUE t7 on t1.SALE_TYPE=t7.value and t7.ad_limitvalue_group_id=1728 ");
        sb.append("left join AD_LIMITVALUE t8 on trim(t1.RETSALETYPE)=t8.value and t8.ad_limitvalue_group_id=1529 ");
        sb.append("left join AD_LIMITVALUE t9 on t1.BILLKIND=t9.value and t9.ad_limitvalue_group_id=1522");
        sql.FROM(sb.toString());
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        RefundAudit record = (RefundAudit) parameter.get("record");
        RefundAuditExample example = (RefundAuditExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("M_RET_SALECONF");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=NUMERIC}");
        }
        
        if (record.getAdClientId() != null) {
            sql.SET("AD_CLIENT_ID = #{record.adClientId,jdbcType=NUMERIC}");
        }
        
        if (record.getAdOrgId() != null) {
            sql.SET("AD_ORG_ID = #{record.adOrgId,jdbcType=NUMERIC}");
        }
        
        if (record.getOwnerid() != null) {
            sql.SET("OWNERID = #{record.ownerid,jdbcType=NUMERIC}");
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
        
        if (record.getIsactive() != null) {
            sql.SET("ISACTIVE = #{record.isactive,jdbcType=CHAR}");
        }
        
        if (record.getDocno() != null) {
            sql.SET("DOCNO = #{record.docno,jdbcType=VARCHAR}");
        }
        
        if (record.getDoctype() != null) {
            sql.SET("DOCTYPE = #{record.doctype,jdbcType=CHAR}");
        }
        
        if (record.getBilldate() != null) {
            sql.SET("BILLDATE = #{record.billdate,jdbcType=NUMERIC}");
        }
        
        if (record.getSalesrepId() != null) {
            sql.SET("SALESREP_ID = #{record.salesrepId,jdbcType=NUMERIC}");
        }
        
        if (record.getcStoreId() != null) {
            sql.SET("C_STORE_ID = #{record.cStoreId,jdbcType=NUMERIC}");
        }
        
        if (record.getcCustomerId() != null) {
            sql.SET("C_CUSTOMER_ID = #{record.cCustomerId,jdbcType=NUMERIC}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getAuState() != null) {
            sql.SET("AU_STATE = #{record.auState,jdbcType=CHAR}");
        }
        
        if (record.getAuPiId() != null) {
            sql.SET("AU_PI_ID = #{record.auPiId,jdbcType=NUMERIC}");
        }
        
        if (record.getAvgDiscount() != null) {
            sql.SET("AVG_DISCOUNT = #{record.avgDiscount,jdbcType=NUMERIC}");
        }
        
        if (record.getTotLines() != null) {
            sql.SET("TOT_LINES = #{record.totLines,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQty() != null) {
            sql.SET("TOT_QTY = #{record.totQty,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtList() != null) {
            sql.SET("TOT_AMT_LIST = #{record.totAmtList,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtActual() != null) {
            sql.SET("TOT_AMT_ACTUAL = #{record.totAmtActual,jdbcType=NUMERIC}");
        }
        
        if (record.getcPeriodId() != null) {
            sql.SET("C_PERIOD_ID = #{record.cPeriodId,jdbcType=NUMERIC}");
        }
        
        if (record.getcOrigId() != null) {
            sql.SET("C_ORIG_ID = #{record.cOrigId,jdbcType=NUMERIC}");
        }
        
        if (record.getOutStatus() != null) {
            sql.SET("OUT_STATUS = #{record.outStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getInStatus() != null) {
            sql.SET("IN_STATUS = #{record.inStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQtyout() != null) {
            sql.SET("TOT_QTYOUT = #{record.totQtyout,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtoutList() != null) {
            sql.SET("TOT_AMTOUT_LIST = #{record.totAmtoutList,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtoutActual() != null) {
            sql.SET("TOT_AMTOUT_ACTUAL = #{record.totAmtoutActual,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQtyin() != null) {
            sql.SET("TOT_QTYIN = #{record.totQtyin,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtinList() != null) {
            sql.SET("TOT_AMTIN_LIST = #{record.totAmtinList,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtinActual() != null) {
            sql.SET("TOT_AMTIN_ACTUAL = #{record.totAmtinActual,jdbcType=NUMERIC}");
        }
        
        if (record.getDiffreason() != null) {
            sql.SET("DIFFREASON = #{record.diffreason,jdbcType=VARCHAR}");
        }
        
        if (record.getDateout() != null) {
            sql.SET("DATEOUT = #{record.dateout,jdbcType=NUMERIC}");
        }
        
        if (record.getDatein() != null) {
            sql.SET("DATEIN = #{record.datein,jdbcType=NUMERIC}");
        }
        
        if (record.getcCustomerupId() != null) {
            sql.SET("C_CUSTOMERUP_ID = #{record.cCustomerupId,jdbcType=NUMERIC}");
        }
        
        if (record.getRetsaletype() != null) {
            sql.SET("RETSALETYPE = #{record.retsaletype,jdbcType=CHAR}");
        }
        
        if (record.getRetsaletype1() != null) {
            sql.SET("RETSALETYPE1 = #{record.retsaletype1,jdbcType=CHAR}");
        }
        
        if (record.getStatuserid() != null) {
            sql.SET("STATUSERID = #{record.statuserid,jdbcType=NUMERIC}");
        }
        
        if (record.getStatustime() != null) {
            sql.SET("STATUSTIME = #{record.statustime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getInerid() != null) {
            sql.SET("INERID = #{record.inerid,jdbcType=NUMERIC}");
        }
        
        if (record.getIntime() != null) {
            sql.SET("INTIME = #{record.intime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOuterid() != null) {
            sql.SET("OUTERID = #{record.outerid,jdbcType=NUMERIC}");
        }
        
        if (record.getOuttime() != null) {
            sql.SET("OUTTIME = #{record.outtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getcRetSaletypeId() != null) {
            sql.SET("C_RET_SALETYPE_ID = #{record.cRetSaletypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getBoxStatus() != null) {
            sql.SET("BOX_STATUS = #{record.boxStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getcTranwayJzId() != null) {
            sql.SET("C_TRANWAY_JZ_ID = #{record.cTranwayJzId,jdbcType=NUMERIC}");
        }
        
        if (record.getTranwayno() != null) {
            sql.SET("TRANWAYNO = #{record.tranwayno,jdbcType=VARCHAR}");
        }
        
        if (record.getTranwayPay() != null) {
            sql.SET("TRANWAY_PAY = #{record.tranwayPay,jdbcType=NUMERIC}");
        }
        
        if (record.getOperatoerid() != null) {
            sql.SET("OPERATOERID = #{record.operatoerid,jdbcType=NUMERIC}");
        }
        
        if (record.getOperStatus() != null) {
            sql.SET("OPER_STATUS = #{record.operStatus,jdbcType=VARCHAR}");
        }
        
        if (record.getPickerid() != null) {
            sql.SET("PICKERID = #{record.pickerid,jdbcType=NUMERIC}");
        }
        
        if (record.getIsuf() != null) {
            sql.SET("ISUF = #{record.isuf,jdbcType=CHAR}");
        }
        
        if (record.getProcessMode() != null) {
            sql.SET("PROCESS_MODE = #{record.processMode,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtPrecost() != null) {
            sql.SET("TOT_AMT_PRECOST = #{record.totAmtPrecost,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtinPrecost() != null) {
            sql.SET("TOT_AMTIN_PRECOST = #{record.totAmtinPrecost,jdbcType=NUMERIC}");
        }
        
        if (record.getDiscount() != null) {
            sql.SET("DISCOUNT = #{record.discount,jdbcType=NUMERIC}");
        }
        
        if (record.getIsbox() != null) {
            sql.SET("ISBOX = #{record.isbox,jdbcType=NUMERIC}");
        }
        
        if (record.getcSaledistypeId() != null) {
            sql.SET("C_SALEDISTYPE_ID = #{record.cSaledistypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getImageurl() != null) {
            sql.SET("IMAGEURL = #{record.imageurl,jdbcType=VARCHAR}");
        }
        
        if (record.getcCargotypeId() != null) {
            sql.SET("C_CARGOTYPE_ID = #{record.cCargotypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getcStoreLocationId() != null) {
            sql.SET("C_STORE_LOCATION_ID = #{record.cStoreLocationId,jdbcType=NUMERIC}");
        }
        
        if (record.getPrinttimes() != null) {
            sql.SET("PRINTTIMES = #{record.printtimes,jdbcType=NUMERIC}");
        }
        
        if (record.getPrintouttimes() != null) {
            sql.SET("PRINTOUTTIMES = #{record.printouttimes,jdbcType=NUMERIC}");
        }
        
        if (record.getPrintintimes() != null) {
            sql.SET("PRINTINTIMES = #{record.printintimes,jdbcType=NUMERIC}");
        }
        
        if (record.getcCargointypeId() != null) {
            sql.SET("C_CARGOINTYPE_ID = #{record.cCargointypeId,jdbcType=NUMERIC}");
        }
        
        if (record.getScanstate() != null) {
            sql.SET("SCANSTATE = #{record.scanstate,jdbcType=CHAR}");
        }
        
        if (record.getSendqty() != null) {
            sql.SET("SENDQTY = #{record.sendqty,jdbcType=NUMERIC}");
        }
        
        if (record.getSubsendqty() != null) {
            sql.SET("SUBSENDQTY = #{record.subsendqty,jdbcType=NUMERIC}");
        }
        
        if (record.getRealdate() != null) {
            sql.SET("REALDATE = #{record.realdate,jdbcType=NUMERIC}");
        }
        
        if (record.getIfmove() != null) {
            sql.SET("IFMOVE = #{record.ifmove,jdbcType=CHAR}");
        }
        
        if (record.getOutAuState() != null) {
            sql.SET("OUT_AU_STATE = #{record.outAuState,jdbcType=CHAR}");
        }
        
        if (record.getOutAuPiId() != null) {
            sql.SET("OUT_AU_PI_ID = #{record.outAuPiId,jdbcType=NUMERIC}");
        }
        
        if (record.getInAuState() != null) {
            sql.SET("IN_AU_STATE = #{record.inAuState,jdbcType=CHAR}");
        }
        
        if (record.getInAuPiId() != null) {
            sql.SET("IN_AU_PI_ID = #{record.inAuPiId,jdbcType=NUMERIC}");
        }
        
        if (record.getTotAmtPrice() != null) {
            sql.SET("TOT_AMT_PRICE = #{record.totAmtPrice,jdbcType=NUMERIC}");
        }
        
        if (record.getAmtDeduction() != null) {
            sql.SET("AMT_DEDUCTION = #{record.amtDeduction,jdbcType=NUMERIC}");
        }
        
        if (record.getPckStatus() != null) {
            sql.SET("PCK_STATUS = #{record.pckStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getPcheckid() != null) {
            sql.SET("PCHECKID = #{record.pcheckid,jdbcType=NUMERIC}");
        }
        
        if (record.getPchecktime() != null) {
            sql.SET("PCHECKTIME = #{record.pchecktime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getTotAmtinved() != null) {
            sql.SET("TOT_AMTINVED = #{record.totAmtinved,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQtyinved() != null) {
            sql.SET("TOT_QTYINVED = #{record.totQtyinved,jdbcType=NUMERIC}");
        }
        
        if (record.getmCroretsaleId() != null) {
            sql.SET("M_CRORETSALE_ID = #{record.mCroretsaleId,jdbcType=NUMERIC}");
        }
        
        if (record.getIsMainRetsale() != null) {
            sql.SET("IS_MAIN_RETSALE = #{record.isMainRetsale,jdbcType=CHAR}");
        }
        
        if (record.getIsCroretsalein() != null) {
            sql.SET("IS_CRORETSALEIN = #{record.isCroretsalein,jdbcType=CHAR}");
        }
        
        if (record.getCarrier() != null) {
            sql.SET("CARRIER = #{record.carrier,jdbcType=VARCHAR}");
        }
        
        if (record.getShippingRemark() != null) {
            sql.SET("SHIPPING_REMARK = #{record.shippingRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getIsTowms() != null) {
            sql.SET("IS_TOWMS = #{record.isTowms,jdbcType=CHAR}");
        }
        
        if (record.getDestAddr() != null) {
            sql.SET("DEST_ADDR = #{record.destAddr,jdbcType=VARCHAR}");
        }
        
        if (record.getmBoxId() != null) {
            sql.SET("M_BOX_ID = #{record.mBoxId,jdbcType=NUMERIC}");
        }
        
        if (record.getQtyBox() != null) {
            sql.SET("QTY_BOX = #{record.qtyBox,jdbcType=NUMERIC}");
        }
        
        if (record.getTotTaxAmt() != null) {
            sql.SET("TOT_TAX_AMT = #{record.totTaxAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getTotNotaxAmt() != null) {
            sql.SET("TOT_NOTAX_AMT = #{record.totNotaxAmt,jdbcType=NUMERIC}");
        }
        
        if (record.getTaxDis() != null) {
            sql.SET("TAX_DIS = #{record.taxDis,jdbcType=NUMERIC}");
        }
        
        if (record.getPaymentstyle() != null) {
            sql.SET("PAYMENTSTYLE = #{record.paymentstyle,jdbcType=CHAR}");
        }
        
        if (record.getScanStatus() != null) {
            sql.SET("SCAN_STATUS = #{record.scanStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getBillkind() != null) {
            sql.SET("BILLKIND = #{record.billkind,jdbcType=NUMERIC}");
        }
        
        if (record.getContractnoFile() != null) {
            sql.SET("CONTRACTNO_FILE = #{record.contractnoFile,jdbcType=VARCHAR}");
        }
        
        if (record.getConfirmStatus() != null) {
            sql.SET("CONFIRM_STATUS = #{record.confirmStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getConfirmStatustime() != null) {
            sql.SET("CONFIRM_STATUSTIME = #{record.confirmStatustime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getConfirmStatuserid() != null) {
            sql.SET("CONFIRM_STATUSERID = #{record.confirmStatuserid,jdbcType=NUMERIC}");
        }
        
        if (record.getBillno() != null) {
            sql.SET("BILLNO = #{record.billno,jdbcType=VARCHAR}");
        }
        
        if (record.getFisno() != null) {
            sql.SET("FISNO = #{record.fisno,jdbcType=VARCHAR}");
        }
        
        if (record.getByinStatus() != null) {
            sql.SET("BYIN_STATUS = #{record.byinStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getScannerid() != null) {
            sql.SET("SCANNERID = #{record.scannerid,jdbcType=NUMERIC}");
        }
        
        if (record.getcSalerId() != null) {
            sql.SET("C_SALER_ID = #{record.cSalerId,jdbcType=NUMERIC}");
        }
        
        if (record.getScanIntime() != null) {
            sql.SET("SCAN_INTIME = #{record.scanIntime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getConfirmIntime() != null) {
            sql.SET("CONFIRM_INTIME = #{record.confirmIntime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getDeliveryConfirmtime() != null) {
            sql.SET("DELIVERY_CONFIRMTIME = #{record.deliveryConfirmtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getByoutStatus() != null) {
            sql.SET("BYOUT_STATUS = #{record.byoutStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getUnpickStoreId() != null) {
            sql.SET("UNPICK_STORE_ID = #{record.unpickStoreId,jdbcType=NUMERIC}");
        }
        
        if (record.getScaninStatus() != null) {
            sql.SET("SCANIN_STATUS = #{record.scaninStatus,jdbcType=NUMERIC}");
        }
        
        if (record.getBehalfRemark() != null) {
            sql.SET("BEHALF_REMARK = #{record.behalfRemark,jdbcType=VARCHAR}");
        }
        
        if (record.getIsdefaultscan() != null) {
            sql.SET("ISDEFAULTSCAN = #{record.isdefaultscan,jdbcType=CHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{record.status,jdbcType=NUMERIC}");
        }
        
        if (record.getRetinfo() != null) {
            sql.SET("RETINFO = #{record.retinfo,jdbcType=VARCHAR}");
        }
        
        if (record.getSaleType() != null) {
            sql.SET("SALE_TYPE = #{record.saleType,jdbcType=NUMERIC}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("M_RET_SALECONF");
        
        sql.SET("ID = #{record.id,jdbcType=NUMERIC}");
        sql.SET("AD_CLIENT_ID = #{record.adClientId,jdbcType=NUMERIC}");
        sql.SET("AD_ORG_ID = #{record.adOrgId,jdbcType=NUMERIC}");
        sql.SET("OWNERID = #{record.ownerid,jdbcType=NUMERIC}");
        sql.SET("MODIFIERID = #{record.modifierid,jdbcType=NUMERIC}");
        sql.SET("CREATIONDATE = #{record.creationdate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFIEDDATE = #{record.modifieddate,jdbcType=TIMESTAMP}");
        sql.SET("ISACTIVE = #{record.isactive,jdbcType=CHAR}");
        sql.SET("DOCNO = #{record.docno,jdbcType=VARCHAR}");
        sql.SET("DOCTYPE = #{record.doctype,jdbcType=CHAR}");
        sql.SET("BILLDATE = #{record.billdate,jdbcType=NUMERIC}");
        sql.SET("SALESREP_ID = #{record.salesrepId,jdbcType=NUMERIC}");
        sql.SET("C_STORE_ID = #{record.cStoreId,jdbcType=NUMERIC}");
        sql.SET("C_CUSTOMER_ID = #{record.cCustomerId,jdbcType=NUMERIC}");
        sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        sql.SET("AU_STATE = #{record.auState,jdbcType=CHAR}");
        sql.SET("AU_PI_ID = #{record.auPiId,jdbcType=NUMERIC}");
        sql.SET("AVG_DISCOUNT = #{record.avgDiscount,jdbcType=NUMERIC}");
        sql.SET("TOT_LINES = #{record.totLines,jdbcType=NUMERIC}");
        sql.SET("TOT_QTY = #{record.totQty,jdbcType=NUMERIC}");
        sql.SET("TOT_AMT_LIST = #{record.totAmtList,jdbcType=NUMERIC}");
        sql.SET("TOT_AMT_ACTUAL = #{record.totAmtActual,jdbcType=NUMERIC}");
        sql.SET("C_PERIOD_ID = #{record.cPeriodId,jdbcType=NUMERIC}");
        sql.SET("C_ORIG_ID = #{record.cOrigId,jdbcType=NUMERIC}");
        sql.SET("OUT_STATUS = #{record.outStatus,jdbcType=NUMERIC}");
        sql.SET("IN_STATUS = #{record.inStatus,jdbcType=NUMERIC}");
        sql.SET("TOT_QTYOUT = #{record.totQtyout,jdbcType=NUMERIC}");
        sql.SET("TOT_AMTOUT_LIST = #{record.totAmtoutList,jdbcType=NUMERIC}");
        sql.SET("TOT_AMTOUT_ACTUAL = #{record.totAmtoutActual,jdbcType=NUMERIC}");
        sql.SET("TOT_QTYIN = #{record.totQtyin,jdbcType=NUMERIC}");
        sql.SET("TOT_AMTIN_LIST = #{record.totAmtinList,jdbcType=NUMERIC}");
        sql.SET("TOT_AMTIN_ACTUAL = #{record.totAmtinActual,jdbcType=NUMERIC}");
        sql.SET("DIFFREASON = #{record.diffreason,jdbcType=VARCHAR}");
        sql.SET("DATEOUT = #{record.dateout,jdbcType=NUMERIC}");
        sql.SET("DATEIN = #{record.datein,jdbcType=NUMERIC}");
        sql.SET("C_CUSTOMERUP_ID = #{record.cCustomerupId,jdbcType=NUMERIC}");
        sql.SET("RETSALETYPE = #{record.retsaletype,jdbcType=CHAR}");
        sql.SET("RETSALETYPE1 = #{record.retsaletype1,jdbcType=CHAR}");
        sql.SET("STATUSERID = #{record.statuserid,jdbcType=NUMERIC}");
        sql.SET("STATUSTIME = #{record.statustime,jdbcType=TIMESTAMP}");
        sql.SET("INERID = #{record.inerid,jdbcType=NUMERIC}");
        sql.SET("INTIME = #{record.intime,jdbcType=TIMESTAMP}");
        sql.SET("OUTERID = #{record.outerid,jdbcType=NUMERIC}");
        sql.SET("OUTTIME = #{record.outtime,jdbcType=TIMESTAMP}");
        sql.SET("C_RET_SALETYPE_ID = #{record.cRetSaletypeId,jdbcType=NUMERIC}");
        sql.SET("BOX_STATUS = #{record.boxStatus,jdbcType=NUMERIC}");
        sql.SET("C_TRANWAY_JZ_ID = #{record.cTranwayJzId,jdbcType=NUMERIC}");
        sql.SET("TRANWAYNO = #{record.tranwayno,jdbcType=VARCHAR}");
        sql.SET("TRANWAY_PAY = #{record.tranwayPay,jdbcType=NUMERIC}");
        sql.SET("OPERATOERID = #{record.operatoerid,jdbcType=NUMERIC}");
        sql.SET("OPER_STATUS = #{record.operStatus,jdbcType=VARCHAR}");
        sql.SET("PICKERID = #{record.pickerid,jdbcType=NUMERIC}");
        sql.SET("ISUF = #{record.isuf,jdbcType=CHAR}");
        sql.SET("PROCESS_MODE = #{record.processMode,jdbcType=NUMERIC}");
        sql.SET("TOT_AMT_PRECOST = #{record.totAmtPrecost,jdbcType=NUMERIC}");
        sql.SET("TOT_AMTIN_PRECOST = #{record.totAmtinPrecost,jdbcType=NUMERIC}");
        sql.SET("DISCOUNT = #{record.discount,jdbcType=NUMERIC}");
        sql.SET("ISBOX = #{record.isbox,jdbcType=NUMERIC}");
        sql.SET("C_SALEDISTYPE_ID = #{record.cSaledistypeId,jdbcType=NUMERIC}");
        sql.SET("IMAGEURL = #{record.imageurl,jdbcType=VARCHAR}");
        sql.SET("C_CARGOTYPE_ID = #{record.cCargotypeId,jdbcType=NUMERIC}");
        sql.SET("C_STORE_LOCATION_ID = #{record.cStoreLocationId,jdbcType=NUMERIC}");
        sql.SET("PRINTTIMES = #{record.printtimes,jdbcType=NUMERIC}");
        sql.SET("PRINTOUTTIMES = #{record.printouttimes,jdbcType=NUMERIC}");
        sql.SET("PRINTINTIMES = #{record.printintimes,jdbcType=NUMERIC}");
        sql.SET("C_CARGOINTYPE_ID = #{record.cCargointypeId,jdbcType=NUMERIC}");
        sql.SET("SCANSTATE = #{record.scanstate,jdbcType=CHAR}");
        sql.SET("SENDQTY = #{record.sendqty,jdbcType=NUMERIC}");
        sql.SET("SUBSENDQTY = #{record.subsendqty,jdbcType=NUMERIC}");
        sql.SET("REALDATE = #{record.realdate,jdbcType=NUMERIC}");
        sql.SET("IFMOVE = #{record.ifmove,jdbcType=CHAR}");
        sql.SET("OUT_AU_STATE = #{record.outAuState,jdbcType=CHAR}");
        sql.SET("OUT_AU_PI_ID = #{record.outAuPiId,jdbcType=NUMERIC}");
        sql.SET("IN_AU_STATE = #{record.inAuState,jdbcType=CHAR}");
        sql.SET("IN_AU_PI_ID = #{record.inAuPiId,jdbcType=NUMERIC}");
        sql.SET("TOT_AMT_PRICE = #{record.totAmtPrice,jdbcType=NUMERIC}");
        sql.SET("AMT_DEDUCTION = #{record.amtDeduction,jdbcType=NUMERIC}");
        sql.SET("PCK_STATUS = #{record.pckStatus,jdbcType=NUMERIC}");
        sql.SET("PCHECKID = #{record.pcheckid,jdbcType=NUMERIC}");
        sql.SET("PCHECKTIME = #{record.pchecktime,jdbcType=TIMESTAMP}");
        sql.SET("TOT_AMTINVED = #{record.totAmtinved,jdbcType=NUMERIC}");
        sql.SET("TOT_QTYINVED = #{record.totQtyinved,jdbcType=NUMERIC}");
        sql.SET("M_CRORETSALE_ID = #{record.mCroretsaleId,jdbcType=NUMERIC}");
        sql.SET("IS_MAIN_RETSALE = #{record.isMainRetsale,jdbcType=CHAR}");
        sql.SET("IS_CRORETSALEIN = #{record.isCroretsalein,jdbcType=CHAR}");
        sql.SET("CARRIER = #{record.carrier,jdbcType=VARCHAR}");
        sql.SET("SHIPPING_REMARK = #{record.shippingRemark,jdbcType=VARCHAR}");
        sql.SET("IS_TOWMS = #{record.isTowms,jdbcType=CHAR}");
        sql.SET("DEST_ADDR = #{record.destAddr,jdbcType=VARCHAR}");
        sql.SET("M_BOX_ID = #{record.mBoxId,jdbcType=NUMERIC}");
        sql.SET("QTY_BOX = #{record.qtyBox,jdbcType=NUMERIC}");
        sql.SET("TOT_TAX_AMT = #{record.totTaxAmt,jdbcType=NUMERIC}");
        sql.SET("TOT_NOTAX_AMT = #{record.totNotaxAmt,jdbcType=NUMERIC}");
        sql.SET("TAX_DIS = #{record.taxDis,jdbcType=NUMERIC}");
        sql.SET("PAYMENTSTYLE = #{record.paymentstyle,jdbcType=CHAR}");
        sql.SET("SCAN_STATUS = #{record.scanStatus,jdbcType=NUMERIC}");
        sql.SET("BILLKIND = #{record.billkind,jdbcType=NUMERIC}");
        sql.SET("CONTRACTNO_FILE = #{record.contractnoFile,jdbcType=VARCHAR}");
        sql.SET("CONFIRM_STATUS = #{record.confirmStatus,jdbcType=NUMERIC}");
        sql.SET("CONFIRM_STATUSTIME = #{record.confirmStatustime,jdbcType=TIMESTAMP}");
        sql.SET("CONFIRM_STATUSERID = #{record.confirmStatuserid,jdbcType=NUMERIC}");
        sql.SET("BILLNO = #{record.billno,jdbcType=VARCHAR}");
        sql.SET("FISNO = #{record.fisno,jdbcType=VARCHAR}");
        sql.SET("BYIN_STATUS = #{record.byinStatus,jdbcType=NUMERIC}");
        sql.SET("SCANNERID = #{record.scannerid,jdbcType=NUMERIC}");
        sql.SET("C_SALER_ID = #{record.cSalerId,jdbcType=NUMERIC}");
        sql.SET("SCAN_INTIME = #{record.scanIntime,jdbcType=TIMESTAMP}");
        sql.SET("CONFIRM_INTIME = #{record.confirmIntime,jdbcType=TIMESTAMP}");
        sql.SET("DELIVERY_CONFIRMTIME = #{record.deliveryConfirmtime,jdbcType=TIMESTAMP}");
        sql.SET("BYOUT_STATUS = #{record.byoutStatus,jdbcType=NUMERIC}");
        sql.SET("UNPICK_STORE_ID = #{record.unpickStoreId,jdbcType=NUMERIC}");
        sql.SET("SCANIN_STATUS = #{record.scaninStatus,jdbcType=NUMERIC}");
        sql.SET("BEHALF_REMARK = #{record.behalfRemark,jdbcType=VARCHAR}");
        sql.SET("ISDEFAULTSCAN = #{record.isdefaultscan,jdbcType=CHAR}");
        sql.SET("STATUS = #{record.status,jdbcType=NUMERIC}");
        sql.SET("RETINFO = #{record.retinfo,jdbcType=VARCHAR}");
        sql.SET("SALE_TYPE = #{record.saleType,jdbcType=NUMERIC}");
        
        RefundAuditExample example = (RefundAuditExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RefundAuditExample example, boolean includeExamplePhrase) {
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
                            if(criterion.isHasDate()){
                                sb.append(String.format("%s"+parmPhrase1+"%s", criterion.getCondition(),"to_date(TO_CHAR(", i, j,",'YYYY-MM-DD hh24:mi:ss'),'YYYY-MM-DD hh24:mi:ss')"));
                            }else {
                                sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                            }
                        } else {
                            if(criterion.isHasDate()){
                                sb.append(String.format("%s"+parmPhrase1_th+"%s", criterion.getCondition(),"to_date(TO_CHAR(", i, j, criterion.getTypeHandler(),",'YYYY-MM-DD hh24:mi:ss'),'YYYY-MM-DD hh24:mi:ss')"));
                            }else {
                                sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j, criterion.getTypeHandler()));
                            }
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            if(criterion.isHasDate()) {
                                StringBuilder temp=new StringBuilder("");
                                temp.append(String.format("%s"+parmPhrase2+"%s", criterion.getCondition()," to_date(TO_CHAR(", i, j, i, j,",'YYYY-MM-DD hh24:mi:ss'),'YYYY-MM-DD hh24:mi:ss')"));
                                //替换and前后
                                sb.append(StringUtils.replace(temp.toString()," and ",",'YYYY-MM-DD hh24:mi:ss'),'YYYY-MM-DD hh24:mi:ss') and to_date(TO_CHAR("));
                            }else{
                                sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                            }
                        } else {
                            if(criterion.isHasDate()) {
                                StringBuilder temp=new StringBuilder("");
                                temp.append(String.format("%s"+parmPhrase2_th+"%s", criterion.getCondition()," to_date(TO_CHAR(", i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler(),",'YYYY-MM-DD hh24:mi:ss'),'YYYY-MM-DD hh24:mi:ss')"));
                                sb.append(StringUtils.replace(temp.toString()," and ",",'YYYY-MM-DD hh24:mi:ss'),'YYYY-MM-DD hh24:mi:ss') and to_date(TO_CHAR("));
                            }else{
                                sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                            }
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