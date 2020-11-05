package com.cros.vue.mapper;

import com.cros.vue.entity.RefundAuditItem;
import com.cros.vue.entity.RefundAuditItemExample.Criteria;
import com.cros.vue.entity.RefundAuditItemExample.Criterion;
import com.cros.vue.entity.RefundAuditItemExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class RefundAuditItemSqlProvider {
    public String countByExample(RefundAuditItemExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("M_RET_SALECONF_MATRIX");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(RefundAuditItemExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("M_RET_SALECONF_MATRIX");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(RefundAuditItem record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("M_RET_SALECONF_MATRIX");
        
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
        
        if (record.getShowname() != null) {
            sql.VALUES("SHOWNAME", "#{showname,jdbcType=CHAR}");
        }
        
        if (record.getmRetSaleId() != null) {
            sql.VALUES("M_RET_SALE_ID", "#{mRetSaleId,jdbcType=NUMERIC}");
        }
        
        if (record.getmProductId() != null) {
            sql.VALUES("M_PRODUCT_ID", "#{mProductId,jdbcType=NUMERIC}");
        }
        
        if (record.getmProduct2Id() != null) {
            sql.VALUES("M_PRODUCT2_ID", "#{mProduct2Id,jdbcType=NUMERIC}");
        }
        
        if (record.getMx1() != null) {
            sql.VALUES("MX1", "#{mx1,jdbcType=NUMERIC}");
        }
        
        if (record.getMx2() != null) {
            sql.VALUES("MX2", "#{mx2,jdbcType=NUMERIC}");
        }
        
        if (record.getMx3() != null) {
            sql.VALUES("MX3", "#{mx3,jdbcType=NUMERIC}");
        }
        
        if (record.getMx4() != null) {
            sql.VALUES("MX4", "#{mx4,jdbcType=NUMERIC}");
        }
        
        if (record.getMx5() != null) {
            sql.VALUES("MX5", "#{mx5,jdbcType=NUMERIC}");
        }
        
        if (record.getMx6() != null) {
            sql.VALUES("MX6", "#{mx6,jdbcType=NUMERIC}");
        }
        
        if (record.getMx7() != null) {
            sql.VALUES("MX7", "#{mx7,jdbcType=NUMERIC}");
        }
        
        if (record.getMx8() != null) {
            sql.VALUES("MX8", "#{mx8,jdbcType=NUMERIC}");
        }
        
        if (record.getMx9() != null) {
            sql.VALUES("MX9", "#{mx9,jdbcType=NUMERIC}");
        }
        
        if (record.getMx10() != null) {
            sql.VALUES("MX10", "#{mx10,jdbcType=NUMERIC}");
        }
        
        if (record.getMx11() != null) {
            sql.VALUES("MX11", "#{mx11,jdbcType=NUMERIC}");
        }
        
        if (record.getMx12() != null) {
            sql.VALUES("MX12", "#{mx12,jdbcType=NUMERIC}");
        }
        
        if (record.getMx13() != null) {
            sql.VALUES("MX13", "#{mx13,jdbcType=NUMERIC}");
        }
        
        if (record.getMx14() != null) {
            sql.VALUES("MX14", "#{mx14,jdbcType=NUMERIC}");
        }
        
        if (record.getMx15() != null) {
            sql.VALUES("MX15", "#{mx15,jdbcType=NUMERIC}");
        }
        
        if (record.getMx16() != null) {
            sql.VALUES("MX16", "#{mx16,jdbcType=NUMERIC}");
        }
        
        if (record.getMx17() != null) {
            sql.VALUES("MX17", "#{mx17,jdbcType=NUMERIC}");
        }
        
        if (record.getMx18() != null) {
            sql.VALUES("MX18", "#{mx18,jdbcType=NUMERIC}");
        }
        
        if (record.getMx19() != null) {
            sql.VALUES("MX19", "#{mx19,jdbcType=NUMERIC}");
        }
        
        if (record.getMx20() != null) {
            sql.VALUES("MX20", "#{mx20,jdbcType=NUMERIC}");
        }
        
        if (record.getMx21() != null) {
            sql.VALUES("MX21", "#{mx21,jdbcType=NUMERIC}");
        }
        
        if (record.getMx22() != null) {
            sql.VALUES("MX22", "#{mx22,jdbcType=NUMERIC}");
        }
        
        if (record.getMx23() != null) {
            sql.VALUES("MX23", "#{mx23,jdbcType=NUMERIC}");
        }
        
        if (record.getMx24() != null) {
            sql.VALUES("MX24", "#{mx24,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQty() != null) {
            sql.VALUES("TOT_QTY", "#{totQty,jdbcType=NUMERIC}");
        }
        
        if (record.getRn() != null) {
            sql.VALUES("RN", "#{rn,jdbcType=NUMERIC}");
        }
        
        if (record.getAmtActual() != null) {
            sql.VALUES("AMT_ACTUAL", "#{amtActual,jdbcType=NUMERIC}");
        }
        
        if (record.getDescription() != null) {
            sql.VALUES("DESCRIPTION", "#{description,jdbcType=VARCHAR}");
        }
        
        if (record.getIsmodify() != null) {
            sql.VALUES("ISMODIFY", "#{ismodify,jdbcType=VARCHAR}");
        }
        
        if (record.getQty1() != null) {
            sql.VALUES("QTY1", "#{qty1,jdbcType=NUMERIC}");
        }
        
        if (record.getQtycan() != null) {
            sql.VALUES("QTYCAN", "#{qtycan,jdbcType=NUMERIC}");
        }
        
        if (record.getmColorId() != null) {
            sql.VALUES("M_COLOR_ID", "#{mColorId,jdbcType=NUMERIC}");
        }
        
        if (record.getPriceactual2() != null) {
            sql.VALUES("PRICEACTUAL2", "#{priceactual2,jdbcType=NUMERIC}");
        }
        
        if (record.getRetReason() != null) {
            sql.VALUES("RET_REASON", "#{retReason,jdbcType=NUMERIC}");
        }
        
        if (record.getPriceactual() != null) {
            sql.VALUES("PRICEACTUAL", "#{priceactual,jdbcType=NUMERIC}");
        }
        
        return sql.toString();
    }

    public String selectByExample(RefundAuditItemExample example) {
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
        sql.SELECT("t1.SHOWNAME");
        sql.SELECT("t1.M_RET_SALE_ID");
        sql.SELECT("t1.M_PRODUCT_ID");
        sql.SELECT("t1.M_PRODUCT2_ID");
        sql.SELECT("t1.MX1");
        sql.SELECT("t1.MX2");
        sql.SELECT("t1.MX3");
        sql.SELECT("t1.MX4");
        sql.SELECT("t1.MX5");
        sql.SELECT("t1.MX6");
        sql.SELECT("t1.MX7");
        sql.SELECT("t1.MX8");
        sql.SELECT("t1.MX9");
        sql.SELECT("t1.MX10");
        sql.SELECT("t1.MX11");
        sql.SELECT("t1.MX12");
        sql.SELECT("t1.MX13");
        sql.SELECT("t1.MX14");
        sql.SELECT("t1.MX15");
        sql.SELECT("t1.MX16");
        sql.SELECT("t1.MX17");
        sql.SELECT("t1.MX18");
        sql.SELECT("t1.MX19");
        sql.SELECT("t1.MX20");
        sql.SELECT("t1.MX21");
        sql.SELECT("t1.MX22");
        sql.SELECT("t1.MX23");
        sql.SELECT("t1.MX24");
        sql.SELECT("t1.TOT_QTY");
        sql.SELECT("t1.RN");
        sql.SELECT("t1.AMT_ACTUAL");
        sql.SELECT("t1.DESCRIPTION");
        sql.SELECT("t1.ISMODIFY");
        sql.SELECT("t1.QTY1");
        sql.SELECT("t1.QTYCAN");
        sql.SELECT("t1.M_COLOR_ID");
        sql.SELECT("t1.PRICEACTUAL2");
        sql.SELECT("t1.RET_REASON");
        sql.SELECT("t1.PRICEACTUAL");
        sql.SELECT("t2.name mProductCode");
        sql.SELECT("t3.name retReasonName");
        sql.FROM("M_RET_SALECONF_MATRIX t1 left join M_PRODUCT t2 on t1.m_product_id=t2.id left join C_RET_QTYPE t3 on t1.RET_REASON=t3.id");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        RefundAuditItem record = (RefundAuditItem) parameter.get("record");
        RefundAuditItemExample example = (RefundAuditItemExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("M_RET_SALECONF_MATRIX");
        
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
        
        if (record.getShowname() != null) {
            sql.SET("SHOWNAME = #{record.showname,jdbcType=CHAR}");
        }
        
        if (record.getmRetSaleId() != null) {
            sql.SET("M_RET_SALE_ID = #{record.mRetSaleId,jdbcType=NUMERIC}");
        }
        
        if (record.getmProductId() != null) {
            sql.SET("M_PRODUCT_ID = #{record.mProductId,jdbcType=NUMERIC}");
        }
        
        if (record.getmProduct2Id() != null) {
            sql.SET("M_PRODUCT2_ID = #{record.mProduct2Id,jdbcType=NUMERIC}");
        }
        
        if (record.getMx1() != null) {
            sql.SET("MX1 = #{record.mx1,jdbcType=NUMERIC}");
        }
        
        if (record.getMx2() != null) {
            sql.SET("MX2 = #{record.mx2,jdbcType=NUMERIC}");
        }
        
        if (record.getMx3() != null) {
            sql.SET("MX3 = #{record.mx3,jdbcType=NUMERIC}");
        }
        
        if (record.getMx4() != null) {
            sql.SET("MX4 = #{record.mx4,jdbcType=NUMERIC}");
        }
        
        if (record.getMx5() != null) {
            sql.SET("MX5 = #{record.mx5,jdbcType=NUMERIC}");
        }
        
        if (record.getMx6() != null) {
            sql.SET("MX6 = #{record.mx6,jdbcType=NUMERIC}");
        }
        
        if (record.getMx7() != null) {
            sql.SET("MX7 = #{record.mx7,jdbcType=NUMERIC}");
        }
        
        if (record.getMx8() != null) {
            sql.SET("MX8 = #{record.mx8,jdbcType=NUMERIC}");
        }
        
        if (record.getMx9() != null) {
            sql.SET("MX9 = #{record.mx9,jdbcType=NUMERIC}");
        }
        
        if (record.getMx10() != null) {
            sql.SET("MX10 = #{record.mx10,jdbcType=NUMERIC}");
        }
        
        if (record.getMx11() != null) {
            sql.SET("MX11 = #{record.mx11,jdbcType=NUMERIC}");
        }
        
        if (record.getMx12() != null) {
            sql.SET("MX12 = #{record.mx12,jdbcType=NUMERIC}");
        }
        
        if (record.getMx13() != null) {
            sql.SET("MX13 = #{record.mx13,jdbcType=NUMERIC}");
        }
        
        if (record.getMx14() != null) {
            sql.SET("MX14 = #{record.mx14,jdbcType=NUMERIC}");
        }
        
        if (record.getMx15() != null) {
            sql.SET("MX15 = #{record.mx15,jdbcType=NUMERIC}");
        }
        
        if (record.getMx16() != null) {
            sql.SET("MX16 = #{record.mx16,jdbcType=NUMERIC}");
        }
        
        if (record.getMx17() != null) {
            sql.SET("MX17 = #{record.mx17,jdbcType=NUMERIC}");
        }
        
        if (record.getMx18() != null) {
            sql.SET("MX18 = #{record.mx18,jdbcType=NUMERIC}");
        }
        
        if (record.getMx19() != null) {
            sql.SET("MX19 = #{record.mx19,jdbcType=NUMERIC}");
        }
        
        if (record.getMx20() != null) {
            sql.SET("MX20 = #{record.mx20,jdbcType=NUMERIC}");
        }
        
        if (record.getMx21() != null) {
            sql.SET("MX21 = #{record.mx21,jdbcType=NUMERIC}");
        }
        
        if (record.getMx22() != null) {
            sql.SET("MX22 = #{record.mx22,jdbcType=NUMERIC}");
        }
        
        if (record.getMx23() != null) {
            sql.SET("MX23 = #{record.mx23,jdbcType=NUMERIC}");
        }
        
        if (record.getMx24() != null) {
            sql.SET("MX24 = #{record.mx24,jdbcType=NUMERIC}");
        }
        
        if (record.getTotQty() != null) {
            sql.SET("TOT_QTY = #{record.totQty,jdbcType=NUMERIC}");
        }
        
        if (record.getRn() != null) {
            sql.SET("RN = #{record.rn,jdbcType=NUMERIC}");
        }
        
        if (record.getAmtActual() != null) {
            sql.SET("AMT_ACTUAL = #{record.amtActual,jdbcType=NUMERIC}");
        }
        
        if (record.getDescription() != null) {
            sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        }
        
        if (record.getIsmodify() != null) {
            sql.SET("ISMODIFY = #{record.ismodify,jdbcType=VARCHAR}");
        }
        
        if (record.getQty1() != null) {
            sql.SET("QTY1 = #{record.qty1,jdbcType=NUMERIC}");
        }
        
        if (record.getQtycan() != null) {
            sql.SET("QTYCAN = #{record.qtycan,jdbcType=NUMERIC}");
        }
        
        if (record.getmColorId() != null) {
            sql.SET("M_COLOR_ID = #{record.mColorId,jdbcType=NUMERIC}");
        }
        
        if (record.getPriceactual2() != null) {
            sql.SET("PRICEACTUAL2 = #{record.priceactual2,jdbcType=NUMERIC}");
        }
        
        if (record.getRetReason() != null) {
            sql.SET("RET_REASON = #{record.retReason,jdbcType=NUMERIC}");
        }
        
        if (record.getPriceactual() != null) {
            sql.SET("PRICEACTUAL = #{record.priceactual,jdbcType=NUMERIC}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("M_RET_SALECONF_MATRIX");
        
        sql.SET("ID = #{record.id,jdbcType=NUMERIC}");
        sql.SET("AD_CLIENT_ID = #{record.adClientId,jdbcType=NUMERIC}");
        sql.SET("AD_ORG_ID = #{record.adOrgId,jdbcType=NUMERIC}");
        sql.SET("OWNERID = #{record.ownerid,jdbcType=NUMERIC}");
        sql.SET("MODIFIERID = #{record.modifierid,jdbcType=NUMERIC}");
        sql.SET("CREATIONDATE = #{record.creationdate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFIEDDATE = #{record.modifieddate,jdbcType=TIMESTAMP}");
        sql.SET("ISACTIVE = #{record.isactive,jdbcType=CHAR}");
        sql.SET("SHOWNAME = #{record.showname,jdbcType=CHAR}");
        sql.SET("M_RET_SALE_ID = #{record.mRetSaleId,jdbcType=NUMERIC}");
        sql.SET("M_PRODUCT_ID = #{record.mProductId,jdbcType=NUMERIC}");
        sql.SET("M_PRODUCT2_ID = #{record.mProduct2Id,jdbcType=NUMERIC}");
        sql.SET("MX1 = #{record.mx1,jdbcType=NUMERIC}");
        sql.SET("MX2 = #{record.mx2,jdbcType=NUMERIC}");
        sql.SET("MX3 = #{record.mx3,jdbcType=NUMERIC}");
        sql.SET("MX4 = #{record.mx4,jdbcType=NUMERIC}");
        sql.SET("MX5 = #{record.mx5,jdbcType=NUMERIC}");
        sql.SET("MX6 = #{record.mx6,jdbcType=NUMERIC}");
        sql.SET("MX7 = #{record.mx7,jdbcType=NUMERIC}");
        sql.SET("MX8 = #{record.mx8,jdbcType=NUMERIC}");
        sql.SET("MX9 = #{record.mx9,jdbcType=NUMERIC}");
        sql.SET("MX10 = #{record.mx10,jdbcType=NUMERIC}");
        sql.SET("MX11 = #{record.mx11,jdbcType=NUMERIC}");
        sql.SET("MX12 = #{record.mx12,jdbcType=NUMERIC}");
        sql.SET("MX13 = #{record.mx13,jdbcType=NUMERIC}");
        sql.SET("MX14 = #{record.mx14,jdbcType=NUMERIC}");
        sql.SET("MX15 = #{record.mx15,jdbcType=NUMERIC}");
        sql.SET("MX16 = #{record.mx16,jdbcType=NUMERIC}");
        sql.SET("MX17 = #{record.mx17,jdbcType=NUMERIC}");
        sql.SET("MX18 = #{record.mx18,jdbcType=NUMERIC}");
        sql.SET("MX19 = #{record.mx19,jdbcType=NUMERIC}");
        sql.SET("MX20 = #{record.mx20,jdbcType=NUMERIC}");
        sql.SET("MX21 = #{record.mx21,jdbcType=NUMERIC}");
        sql.SET("MX22 = #{record.mx22,jdbcType=NUMERIC}");
        sql.SET("MX23 = #{record.mx23,jdbcType=NUMERIC}");
        sql.SET("MX24 = #{record.mx24,jdbcType=NUMERIC}");
        sql.SET("TOT_QTY = #{record.totQty,jdbcType=NUMERIC}");
        sql.SET("RN = #{record.rn,jdbcType=NUMERIC}");
        sql.SET("AMT_ACTUAL = #{record.amtActual,jdbcType=NUMERIC}");
        sql.SET("DESCRIPTION = #{record.description,jdbcType=VARCHAR}");
        sql.SET("ISMODIFY = #{record.ismodify,jdbcType=VARCHAR}");
        sql.SET("QTY1 = #{record.qty1,jdbcType=NUMERIC}");
        sql.SET("QTYCAN = #{record.qtycan,jdbcType=NUMERIC}");
        sql.SET("M_COLOR_ID = #{record.mColorId,jdbcType=NUMERIC}");
        sql.SET("PRICEACTUAL2 = #{record.priceactual2,jdbcType=NUMERIC}");
        sql.SET("RET_REASON = #{record.retReason,jdbcType=NUMERIC}");
        sql.SET("PRICEACTUAL = #{record.priceactual,jdbcType=NUMERIC}");
        
        RefundAuditItemExample example = (RefundAuditItemExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    protected void applyWhere(SQL sql, RefundAuditItemExample example, boolean includeExamplePhrase) {
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