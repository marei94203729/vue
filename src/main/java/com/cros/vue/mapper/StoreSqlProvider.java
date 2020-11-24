package com.cros.vue.mapper;

import com.cros.vue.entity.StoreExample.Criteria;
import com.cros.vue.entity.StoreExample.Criterion;
import com.cros.vue.entity.StoreExample;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

public class StoreSqlProvider {



    public String selectByExample(StoreExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("t1.ID");
        } else {
            sql.SELECT("t1.ID");
        }
        sql.SELECT("t1.ISACTIVE");
        sql.SELECT("t1.NAME");
        sql.SELECT("t1.PART_NO");
        sql.SELECT("t1.DESCRIPTION");
        sql.SELECT("t1.C_AREA_ID");
        sql.SELECT("t1.ISSTOP");
        sql.SELECT("t1.C_CUSTOMER_ID");
        sql.SELECT("t1.CODE");
        sql.SELECT("t1.C_BLOCK_ID");
        sql.SELECT("t1.C_SALER_ID");
        sql.SELECT("t1.C_BRANCH_ID");
        sql.SELECT("t2.code custCode");
        sql.SELECT("t2.name custName");
        sql.SELECT("t3.code blockCode");
        sql.SELECT("t3.name blockName");
        sql.SELECT("t4.name areaName");
        sql.SELECT("t5.sname branchName");
        sql.SELECT("t6.name salerName");
        StringBuilder sb=new StringBuilder("");
        sb.append("c_store t1 left join c_customer t2 on t1.c_customer_id=t2.id ");
        sb.append("left join c_block t3 on t1.c_block_id=t3.id ");
        sb.append("left join c_area t4 on t1.c_area_id=t4.id ");
        sb.append("left join c_branch t5 on t1.c_branch_id=t5.id ");
        sb.append("left join hr_employee t6 on t1.c_saler_id=t6.id ");
        sql.FROM(sb.toString());
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }




    protected void applyWhere(SQL sql, StoreExample example, boolean includeExamplePhrase) {
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
            sql.WHERE("t1.ISACTIVE = 'Y'  AND t1.C_STORETYPE='01' "+ (StringUtils.isBlank(sb.toString())?"":"and "+sb.toString()));
        }else{
            sql.WHERE("t1.ISACTIVE = 'Y'  AND t1.C_STORETYPE='01' ");
        }
    }
}