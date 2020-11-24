package com.cros.vue.mapper;

import com.cros.vue.entity.SlpriceadjpdtItem;
import com.cros.vue.entity.SlpriceadjpdtItemExample.Criteria;
import com.cros.vue.entity.SlpriceadjpdtItemExample.Criterion;
import com.cros.vue.entity.SlpriceadjpdtItemExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class SlpriceadjpdtItemSqlProvider {
    public String countByExample(SlpriceadjpdtItemExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("B_SLPRICEADJPDTITEM");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(SlpriceadjpdtItemExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("B_SLPRICEADJPDTITEM");
        applyWhere(sql, example, false);
        return sql.toString();
    }


    public String selectByExample(SlpriceadjpdtItemExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("t1.ID");
        } else {
            sql.SELECT("t1.ID");
        }
        sql.SELECT("t2.name mProductCode");
        sql.SELECT("t4.attribname year");
        sql.SELECT("t5.attribname season");
        sql.SELECT("t1.PRICEACTUAL");
        sql.SELECT("t1.PRICEDIS");
        sql.SELECT("t6.docno");
        sql.SELECT("to_date(t6.billdate,'yyyy-mm-dd') billdate");
        StringBuilder sb=new StringBuilder();
        sb.append("B_SLPRICEADJPDTITEM t1 inner join  M_PRODUCT t2 on t1.M_PRODUCT_ID =t2.id ");
        sb.append("left join M_DIM t4 on t2.M_DIM2_ID=t4.id left join M_DIM t5 on t2.M_DIM11_ID=t5.id ");
        sb.append("left join B_SLPRICEADJ t6 on t1.b_slpriceadj_id=t6.id ");
        sql.FROM(sb.toString());
        applyWhere(sql, example, false);
        //增加条件
        example.setOrderByClause("t1.MODIFIEDDATE desc");
        SlpriceadjpdtItemExample.Criteria criteria=example.getOredCriteria().get(0);
        criteria.andStatusEqualTo((short)2);
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        SlpriceadjpdtItem record = (SlpriceadjpdtItem) parameter.get("record");
        SlpriceadjpdtItemExample example = (SlpriceadjpdtItemExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("B_SLPRICEADJPDTITEM");
        
        if (record.getId() != null) {
            sql.SET("ID = #{record.id,jdbcType=NUMERIC}");
        }
        
        if (record.getAdClientId() != null) {
            sql.SET("AD_CLIENT_ID = #{record.adClientId,jdbcType=NUMERIC}");
        }
        
        if (record.getAdOrgId() != null) {
            sql.SET("AD_ORG_ID = #{record.adOrgId,jdbcType=NUMERIC}");
        }
        
        if (record.getbSlpriceadjId() != null) {
            sql.SET("B_SLPRICEADJ_ID = #{record.bSlpriceadjId,jdbcType=NUMERIC}");
        }
        
        if (record.getmProductId() != null) {
            sql.SET("M_PRODUCT_ID = #{record.mProductId,jdbcType=NUMERIC}");
        }
        
        if (record.getFirsaledis() != null) {
            sql.SET("FIRSALEDIS = #{record.firsaledis,jdbcType=NUMERIC}");
        }
        
        if (record.getSaledis() != null) {
            sql.SET("SALEDIS = #{record.saledis,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleretdis() != null) {
            sql.SET("SALERETDIS = #{record.saleretdis,jdbcType=NUMERIC}");
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
        
        if (record.getFirprice() != null) {
            sql.SET("FIRPRICE = #{record.firprice,jdbcType=NUMERIC}");
        }
        
        if (record.getSprice() != null) {
            sql.SET("SPRICE = #{record.sprice,jdbcType=NUMERIC}");
        }
        
        if (record.getSrprice() != null) {
            sql.SET("SRPRICE = #{record.srprice,jdbcType=NUMERIC}");
        }
        
        if (record.getPricelist() != null) {
            sql.SET("PRICELIST = #{record.pricelist,jdbcType=NUMERIC}");
        }
        
        if (record.getNowprice() != null) {
            sql.SET("NOWPRICE = #{record.nowprice,jdbcType=NUMERIC}");
        }
        
        if (record.getIsfree() != null) {
            sql.SET("ISFREE = #{record.isfree,jdbcType=CHAR}");
        }
        
        if (record.getIsagt() != null) {
            sql.SET("ISAGT = #{record.isagt,jdbcType=CHAR}");
        }
        
        if (record.getIsdisagt() != null) {
            sql.SET("ISDISAGT = #{record.isdisagt,jdbcType=CHAR}");
        }
        
        if (record.getPricedis() != null) {
            sql.SET("PRICEDIS = #{record.pricedis,jdbcType=NUMERIC}");
        }
        
        if (record.getPriceactual() != null) {
            sql.SET("PRICEACTUAL = #{record.priceactual,jdbcType=NUMERIC}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{record.status,jdbcType=NUMERIC}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("B_SLPRICEADJPDTITEM");
        
        sql.SET("ID = #{record.id,jdbcType=NUMERIC}");
        sql.SET("AD_CLIENT_ID = #{record.adClientId,jdbcType=NUMERIC}");
        sql.SET("AD_ORG_ID = #{record.adOrgId,jdbcType=NUMERIC}");
        sql.SET("B_SLPRICEADJ_ID = #{record.bSlpriceadjId,jdbcType=NUMERIC}");
        sql.SET("M_PRODUCT_ID = #{record.mProductId,jdbcType=NUMERIC}");
        sql.SET("FIRSALEDIS = #{record.firsaledis,jdbcType=NUMERIC}");
        sql.SET("SALEDIS = #{record.saledis,jdbcType=NUMERIC}");
        sql.SET("SALERETDIS = #{record.saleretdis,jdbcType=NUMERIC}");
        sql.SET("OWNERID = #{record.ownerid,jdbcType=NUMERIC}");
        sql.SET("MODIFIERID = #{record.modifierid,jdbcType=NUMERIC}");
        sql.SET("CREATIONDATE = #{record.creationdate,jdbcType=TIMESTAMP}");
        sql.SET("MODIFIEDDATE = #{record.modifieddate,jdbcType=TIMESTAMP}");
        sql.SET("ISACTIVE = #{record.isactive,jdbcType=CHAR}");
        sql.SET("FIRPRICE = #{record.firprice,jdbcType=NUMERIC}");
        sql.SET("SPRICE = #{record.sprice,jdbcType=NUMERIC}");
        sql.SET("SRPRICE = #{record.srprice,jdbcType=NUMERIC}");
        sql.SET("PRICELIST = #{record.pricelist,jdbcType=NUMERIC}");
        sql.SET("NOWPRICE = #{record.nowprice,jdbcType=NUMERIC}");
        sql.SET("ISFREE = #{record.isfree,jdbcType=CHAR}");
        sql.SET("ISAGT = #{record.isagt,jdbcType=CHAR}");
        sql.SET("ISDISAGT = #{record.isdisagt,jdbcType=CHAR}");
        sql.SET("PRICEDIS = #{record.pricedis,jdbcType=NUMERIC}");
        sql.SET("PRICEACTUAL = #{record.priceactual,jdbcType=NUMERIC}");
        sql.SET("STATUS = #{record.status,jdbcType=NUMERIC}");
        
        SlpriceadjpdtItemExample example = (SlpriceadjpdtItemExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(SlpriceadjpdtItem record) {
        SQL sql = new SQL();
        sql.UPDATE("B_SLPRICEADJPDTITEM");
        
        if (record.getAdClientId() != null) {
            sql.SET("AD_CLIENT_ID = #{adClientId,jdbcType=NUMERIC}");
        }
        
        if (record.getAdOrgId() != null) {
            sql.SET("AD_ORG_ID = #{adOrgId,jdbcType=NUMERIC}");
        }
        
        if (record.getbSlpriceadjId() != null) {
            sql.SET("B_SLPRICEADJ_ID = #{bSlpriceadjId,jdbcType=NUMERIC}");
        }
        
        if (record.getmProductId() != null) {
            sql.SET("M_PRODUCT_ID = #{mProductId,jdbcType=NUMERIC}");
        }
        
        if (record.getFirsaledis() != null) {
            sql.SET("FIRSALEDIS = #{firsaledis,jdbcType=NUMERIC}");
        }
        
        if (record.getSaledis() != null) {
            sql.SET("SALEDIS = #{saledis,jdbcType=NUMERIC}");
        }
        
        if (record.getSaleretdis() != null) {
            sql.SET("SALERETDIS = #{saleretdis,jdbcType=NUMERIC}");
        }
        
        if (record.getOwnerid() != null) {
            sql.SET("OWNERID = #{ownerid,jdbcType=NUMERIC}");
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
        
        if (record.getIsactive() != null) {
            sql.SET("ISACTIVE = #{isactive,jdbcType=CHAR}");
        }
        
        if (record.getFirprice() != null) {
            sql.SET("FIRPRICE = #{firprice,jdbcType=NUMERIC}");
        }
        
        if (record.getSprice() != null) {
            sql.SET("SPRICE = #{sprice,jdbcType=NUMERIC}");
        }
        
        if (record.getSrprice() != null) {
            sql.SET("SRPRICE = #{srprice,jdbcType=NUMERIC}");
        }
        
        if (record.getPricelist() != null) {
            sql.SET("PRICELIST = #{pricelist,jdbcType=NUMERIC}");
        }
        
        if (record.getNowprice() != null) {
            sql.SET("NOWPRICE = #{nowprice,jdbcType=NUMERIC}");
        }
        
        if (record.getIsfree() != null) {
            sql.SET("ISFREE = #{isfree,jdbcType=CHAR}");
        }
        
        if (record.getIsagt() != null) {
            sql.SET("ISAGT = #{isagt,jdbcType=CHAR}");
        }
        
        if (record.getIsdisagt() != null) {
            sql.SET("ISDISAGT = #{isdisagt,jdbcType=CHAR}");
        }
        
        if (record.getPricedis() != null) {
            sql.SET("PRICEDIS = #{pricedis,jdbcType=NUMERIC}");
        }
        
        if (record.getPriceactual() != null) {
            sql.SET("PRICEACTUAL = #{priceactual,jdbcType=NUMERIC}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("STATUS = #{status,jdbcType=NUMERIC}");
        }
        
        sql.WHERE("ID = #{id,jdbcType=NUMERIC}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, SlpriceadjpdtItemExample example, boolean includeExamplePhrase) {
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
                            sb.append(String.format(parmPhrase1+")", criterion.getCondition()+" upper(", i, j));
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