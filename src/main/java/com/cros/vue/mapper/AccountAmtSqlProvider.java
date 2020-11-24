package com.cros.vue.mapper;


import com.cros.vue.entity.AccountAmtExample;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.jdbc.SQL;

import java.util.Date;

public class AccountAmtSqlProvider {


    public String selectByExample(AccountAmtExample example) {
        SQL sql = new SQL();
        sql.SELECT("id ,code,name,description,nvl(t.qcye, 0) qcye,nvl(t.saleamt, 0) saleamt,nvl(t.retsaleamt, 0) retsaleamt,nvl(t.qtamt, 0) qtamt,nvl(t.custamt, 0) custamt");
        sql.SELECT("(nvl(t.qcye, 0) +nvl(t.saleamt, 0) + nvl(t.retsaleamt, 0) +nvl(t.qtamt, 0) - nvl(t.custamt, 0)) ysamt");
        StringBuilder sb=new StringBuilder();
        sb.append("select t1.id, t1.code,t1.name,t1.description , ");
        sb.append("nvl(-(SELECT -sum(b.tot_amt_actual) ");
        sb.append("FROM b_receivable b, c_feetype c ");
        sb.append("WHERE b.c_feetype_id = c.id ");
        sb.append("AND b.c_customer_id = t1.id ");
        sb.append("AND c.NAME = '期初设置' ");
        sb.append("AND b.status = 2),0) + ");
        sb.append("(SELECT nvl(SUM(dd.aa), 0) + nvl(SUM(dd.bb), 0) + ");
        sb.append("nvl(SUM(dd.cc), 0) ");
        sb.append(" FROM (SELECT b.c_customer_id, ");
        sb.append("decode(b.doctype, 'RAS', ");
        sb.append("  nvl(SUM(b.tot_amt_actual), 0)) aa, ");
        sb.append("decode(b.doctype, 'RAR', ");
        sb.append("  nvl(SUM(b.tot_amt_actual), 0)) bb, ");
        sb.append("decode(b.doctype, 'ROT', ");
        sb.append("  nvl(SUM(b.tot_amt_actual), 0)) cc ");
        sb.append("FROM b_receivable b, c_feetype c ");
        sb.append("WHERE b.c_feetype_id = c.id ");
        sb.append("AND b.status = 2 ");
        sb.append("AND b.billdate < #{beginDateStr,jdbcType=VARCHAR} ");
        sb.append("AND c.NAME ！ = '期初设置' ");
        sb.append("GROUP BY b.c_customer_id, b.doctype ");
        sb.append("ORDER BY b.c_customer_id) dd ");
        sb.append(" WHERE dd.c_customer_id = t1.id ");
        sb.append(" AND dd.c_customer_id = t1.id) + ");
        sb.append("- nvl((SELECT SUM(tot_amt_recable) ");
        sb.append("FROM b_receive b ");
        sb.append("WHERE t1.id = b.c_customer_id ");
        sb.append("AND b.billdate < #{beginDateStr,jdbcType=VARCHAR} ");
        sb.append("AND b.status = 2), 0) qcye, ");
        sb.append("(SELECT SUM(dd.aa) ");
        sb.append(" FROM (SELECT b.c_customer_id, ");
        sb.append(" decode(b.doctype, 'RAS', ");
        sb.append("nvl(SUM(b.tot_amt_actual), ");
        sb.append("0)) aa ");
        sb.append("FROM b_receivable b, c_feetype c ");
        sb.append("WHERE b.c_feetype_id = c.id ");
        sb.append("AND b.status = 2 ");
        sb.append("AND b.billdate >= #{beginDateStr,jdbcType=VARCHAR} ");
        sb.append("AND b.billdate <=#{endDateStr,jdbcType=VARCHAR} ");
        sb.append("AND c.NAME ！ = '期初设置' ");
        sb.append("GROUP BY b.c_customer_id, b.doctype ");
        sb.append("ORDER BY b.c_customer_id) dd ");
        sb.append("WHERE dd.c_customer_id = t1.id) saleamt, ");
        sb.append("(SELECT SUM(dd.bb) ");
        sb.append("FROM (SELECT b.c_customer_id, ");
        sb.append("decode(b.doctype, 'RAR', ");
        sb.append("nvl(SUM(b.tot_amt_actual), ");
        sb.append("0)) bb ");
        sb.append("FROM b_receivable b, c_feetype c ");
        sb.append("WHERE b.c_feetype_id = c.id ");
        sb.append("AND b.status = 2 ");
        sb.append("AND b.billdate >= #{beginDateStr,jdbcType=VARCHAR} ");
        sb.append("AND b.billdate <=#{endDateStr,jdbcType=VARCHAR} ");
        sb.append("AND c.NAME ！ = '期初设置' ");
        sb.append("GROUP BY b.c_customer_id, b.doctype ");
        sb.append("ORDER BY b.c_customer_id) dd ");
        sb.append("WHERE dd.c_customer_id = t1.id) retsaleamt, ");
        sb.append("(SELECT SUM(dd.cc) ");
        sb.append("FROM (SELECT b.c_customer_id, ");
        sb.append("decode(b.doctype, 'ROT', ");
        sb.append("nvl(SUM(b.tot_amt_actual), ");
        sb.append("0)) cc ");
        sb.append("FROM b_receivable b, c_feetype c ");
        sb.append("WHERE b.c_feetype_id = c.id ");
        sb.append("AND b.status = 2 ");
        sb.append("AND b.billdate >= #{beginDateStr,jdbcType=VARCHAR} ");
        sb.append("AND b.billdate <=#{endDateStr,jdbcType=VARCHAR} ");
        sb.append("AND c.NAME ！ = '期初设置' ");
        sb.append("GROUP BY b.c_customer_id, b.doctype ");
        sb.append("ORDER BY b.c_customer_id) dd ");
        sb.append("WHERE dd.c_customer_id = t1.id) qtamt, ");
        sb.append("(SELECT SUM(nvl(tot_amt_recable, 0)) ");
        sb.append("FROM b_receive b ");
        sb.append("WHERE t1.id = b.c_customer_id ");
        sb.append("AND b.billdate >= #{beginDateStr,jdbcType=VARCHAR} ");
        sb.append("AND b.billdate <= #{endDateStr,jdbcType=VARCHAR} ");
        sb.append("AND b.status = 2) custamt ");
        sb.append("from c_customer t1 ");

        if(StringUtils.isNotEmpty(example.getCustIdChars())&&StringUtils.isNotEmpty(example.getStoreIdChars())) {
            sb.append("where t1.id in(" + example.getCustIdChars() + ") and t1.ISACTIVE = 'Y' ");
            sb.append("and t1.id in(SELECT C_CUSTOMER_ID FROM C_STORE WHERE C_STORE.ISACTIVE = 'Y' and  C_STORE.C_STORETYPE='01' and C_STORE.ID IN(" + example.getStoreIdChars() + ")) ");
        }else{
            if(StringUtils.isNotEmpty(example.getCustIdChars())){
                sb.append("where t1.id in(" + example.getCustIdChars() + ")  and t1.ISACTIVE = 'Y' ");
            }else if(StringUtils.isNotEmpty(example.getStoreIdChars())){
                sb.append("where t1.id in(SELECT C_CUSTOMER_ID FROM C_STORE WHERE C_STORE.ISACTIVE = 'Y' and  C_STORE.C_STORETYPE='01' and C_STORE.ID IN(" + example.getStoreIdChars() + ")) ");
            }else{
                sb.append("where t1.ISACTIVE = 'Y' ");
                //sb.append("and t1.id in(SELECT C_CUSTOMER_ID FROM C_STORE WHERE C_STORE.ISACTIVE = 'Y' and  C_STORE.C_STORETYPE='01') ");
            }
        }
        sql.FROM("("+sb.toString()+")t");
        return sql.toString();
    }

    /**
     * 查询指定日期区间大区及分公司汇款数据
     * @param example
     * @return
     */
    public String selectRecableAmount(AccountAmtExample example){
       StringBuilder sb=new StringBuilder();
        sb.append("with d(areaname,branchName,storetype,amount) as( ");
        sb.append("select  t4.name areaname,t5.sname branchName,t7.name storetype,dd.amount ");
        sb.append("from(select code,name,description,amount, ");
        sb.append("(select id from c_store   where id=(select  max(id) from c_store s where s.c_customer_id=t.id and s.C_STORETYPE='01')) storeid ");
        sb.append("from(SELECT c.code,c.name,c.description,c.id,SUM(nvl(tot_amt_recable, 0)) amount ");
        sb.append("FROM b_receive b inner join c_customer c on b.c_customer_id=c.id ");
        sb.append("WHERE b.billdate >= #{beginDateStr,jdbcType=VARCHAR} ");
        sb.append("AND b.billdate <= #{endDateStr,jdbcType=VARCHAR} ");
        sb.append("AND b.status = 2 ");
        sb.append("group by c.code,c.name,c.description,c.id)t)dd left join c_store t1 on dd.storeid=t1.id left join c_block t3 on t1.c_block_id=t3.id left join c_area t4 on t1.c_area_id=t4.id left join c_branch t5 on t1.c_branch_id=t5.id left join hr_employee t6 on t1.c_saler_id=t6.id ");
        sb.append("left join C_STOREKIND t7 on t1.C_STOREKIND_ID=t7.id),pt as( ");
        sb.append("select * from d ");
        sb.append("pivot ( ");
        sb.append("sum(amount) ");
        sb.append("for storetype ");
        sb.append("in ('加盟店'a, '直营店'b, '联营店'c, '联销店'd)) ");
        sb.append(") ");
        sb.append("select coalesce(areaname, '大区合计') areaname, ");
        sb.append("coalesce(branchName, '分公司合计') branchName, ");
        sb.append("sum(a)a,sum(b)b,sum(c)c,sum(d)d,sum(nvl(a,0)+nvl(b,0)+nvl(c,0)+nvl(d,0)) total ");
        sb.append("from pt ");
        sb.append("group by rollup(areaname,branchName) ");
       // sb.append("order by areaname,branchName ");
       return sb.toString();
    }
    public String listStores(Date beginDate,Date endDate,Boolean flag){
        StringBuilder sb=new StringBuilder();
        sb.append("with sa as(select t1.DOCNO,t8.name block,t9.name area,t10.sname branch,t6.code storecode,t6.name storename,t3.code lccode,t3.name lcname,t4.name producename,t4.id,t11.description saletype,SUBSTR(t5.no,length(t5.no)-1) fsize,t2.qtyout,t2.PRICEACTUAL,t7.description saleways,(t2.qtyout*t2.PRICEACTUAL)TOT_AMTOUT_ACTUAL ");
        sb.append("from m_sale t1 inner join m_saleitem t2 on t1.id=t2.m_sale_id ");
        sb.append("inner join c_store t3 on t1.C_DEST_ID=t3.id  ");
        sb.append("inner join m_product t4 on t2.m_product_id=t4.id ");
        sb.append("inner join M_PRODUCT_ALIAS t5 on t2.m_productalias_id=t5.id ");
        sb.append("inner join c_store t6 on t1.c_store_id=t6.id ");
        sb.append("left join AD_LIMITVALUE t7 on t7.AD_LIMITVALUE_group_id=1544 and t2.saleways=t7.value ");
        sb.append("left join c_block t8 on t3.c_block_id=t8.id  ");
        sb.append("left join c_area t9 on t3.c_area_id=t9.id  ");
        sb.append("left join c_branch t10 on t3.c_branch_id=t10.id ");
        sb.append("left join AD_LIMITVALUE t11 on t11.AD_LIMITVALUE_group_id=1728 and t1.SALE_TYPE =t11.value ");
        sb.append("where  t1.is_merge='N' and t1.c_store_id in(select id from c_store where c_storetype='02' and c_storetype_jz_id in (select id from c_storetype_jz where  no in('01','02','03','05','060','061'))) ");
        sb.append("and t1.outtime between #{beginDate,jdbcType=TIMESTAMP} and #{endDate,jdbcType=TIMESTAMP} and t4.M_DIM3_ID in (5541,5540) ");
        if(flag==null){

        }else if(flag){
            sb.append("and t3.C_STOREKIND_ID in(30) ");
        }else{
            sb.append("and t3.C_STOREKIND_ID in(27,29) ");
        }
        sb.append("),ret as (select t1.DOCNO,t8.name block,t9.name area,t10.sname branch,t6.code storecode,t6.name storename,t3.code lccode,t3.name lcname,t4.name producename,t4.id,t11.description saletype,t12.description retsaletype,SUBSTR(t5.no,length(t5.no)-1) fsize,t2.qtyin,t2.PRICEACTUAL,t7.name REASON,(t2.qtyin*t2.PRICEACTUAL)TOT_AMT_PRICE ");
        sb.append("from M_RET_SALE t1 inner join m_ret_saleitem t2 on t1.id=t2.m_ret_sale_id ");
        sb.append("inner join c_store t3 on t1.C_ORIG_ID =t3.id  ");
        sb.append("inner join m_product t4 on t2.m_product_id=t4.id ");
        sb.append("inner join M_PRODUCT_ALIAS t5 on t2.m_productalias_id=t5.id ");
        sb.append("inner join c_store t6 on t1.c_store_id=t6.id ");
        sb.append("left join C_RET_QTYPE t7 on t2.RET_REASON=t7.id ");
        sb.append("left join c_block t8 on t3.c_block_id=t8.id  ");
        sb.append("left join c_area t9 on t3.c_area_id=t9.id  ");
        sb.append("left join c_branch t10 on t3.c_branch_id=t10.id ");
        sb.append("left join AD_LIMITVALUE t11 on t11.AD_LIMITVALUE_group_id=1728 and t1.SALE_TYPE =t11.value ");
        sb.append("left join AD_LIMITVALUE t12 on t12.AD_LIMITVALUE_group_id=1529 and trim(t1.RETSALETYPE) =t12.value ");
        sb.append("where t1.c_store_id in (select id from c_store where c_storetype='02' and c_storetype_jz_id in (select id from c_storetype_jz where  no in('01','02','03','05','060','061'))) ");
        sb.append("and t1.status=2 and t1.in_status=2 and t1.intime between #{beginDate,jdbcType=TIMESTAMP} and #{endDate,jdbcType=TIMESTAMP} ");
        sb.append(" and t4.M_DIM3_ID in (5541,5540) ");
        if(flag==null){

        }else if(flag){
            sb.append("and t3.C_STOREKIND_ID in(30) ");
        }else{
            sb.append("and t3.C_STOREKIND_ID in(27,29) ");
        }
        sb.append("), un as( ");
        sb.append("select nvl(area,' ')area,nvl(branch,' ')branch,producename,id,qtyout,PRICEACTUAl from sa ");
        sb.append("union all ");
        sb.append("select nvl(area,' ')area,nvl(branch,' ')branch,producename,id,-qtyin,PRICEACTUAl from ret) ");
        sb.append("select coalesce(area,'合计') area,coalesce(branch,'小计') branch,sum(qtyout)total,sum(case when upper(substr(t4.name,1,2)) in('DW','DY','DZ') then nvl(qtyout,0) else 0 end) three,sum(case when upper(substr(t4.name,1,2)) in('DJ','DP') then nvl(qtyout,0) else 0 end) two, ");
        sb.append("sum(case when t4.m_dim4_id in (6301,6306) then  nvl(qtyout,0) else 0 end) neiku,sum(case when t4.m_dim5_id =5579 and t4.PRICELIST<=100 then  nvl(qtyout,0) else 0 end) dadiku,sum(case when t4.m_dim4_id in (5554,5555) then  nvl(qtyout,0) else 0 end) wazi,sum(case when t4.m_dim4_id in (5554,5555)and t4.PRICELIST=10 then  nvl(qtyout,0) else 0 end) tejiawazi ");
        sb.append("from un t1 inner join m_product t4 on t1.id=t4.id ");
        sb.append("left join M_DIM t7 on t4.M_DIM4_ID=t7.id ");
        sb.append("left join M_DIM t8 on t4.M_DIM5_ID=t8.id ");
        sb.append("group by rollup(area,branch) ");
        return sb.toString();
    }
}