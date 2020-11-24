package com.cros.vue.mapper;


import com.cros.vue.entity.SaleItemExample;
import org.apache.ibatis.jdbc.SQL;

public class SaleItemSqlProvider {
    public String selectByExample(SaleItemExample example) {
        SQL sql = new SQL();
        sql.SELECT("C_DEST_ID,t1.name mProductName,docno,to_date(BILLDATE,'YYYY-MM-DD') billDate,t1.PRICEACTUAL priceActual,description saleWaysName,sum(t1.qtyout) qtyOut");
        StringBuilder sb=new StringBuilder();
        sb.append("(select t5.docno,C_DEST_ID,t5.BILLDATE ,SUBSTR(t3.no,length(t3.no)-1) sku,t2.name,t1.qty,t1.qtyout,t1.PRICEACTUAL,t1.saleways,t4.description ");
        sb.append("from M_SALEITEM t1 inner join m_product t2 on t1.M_PRODUCT_ID =t2.id ");
        sb.append("inner join M_PRODUCT_ALIAS t3 on t1.M_PRODUCTALIAS_ID=t3.id ");
        sb.append("left join AD_LIMITVALUE t4 on t4.AD_LIMITVALUE_group_id=1544 and t1.saleways=t4.value ");
        sb.append("inner join M_SALE t5 on t1.m_sale_id =t5.id ");
        sb.append("where t5.OUTTIME is not null and t5.ISACTIVE='Y' ");
        sb.append("and t5.C_STORE_ID in (select id from c_store where C_STORETYPE_JZ_ID in (select id from C_STORETYPE_JZ where no in('01','02','03','061','05','060')))) t1");
        sql.FROM(sb.toString());
        StringBuilder sb1=new StringBuilder();
        //循环配置集合值
        example.getCusts().forEach(c->{
            sb1.append(String.format("%s,",c));
        });
        //去掉最后一个逗号关闭)

        sql.WHERE("C_DEST_ID in (select id from c_store where C_CUSTOMER_ID in("+sb1.toString().substring(0,sb1.toString().length()-1)+")) and t1.name =#{productName,jdbcType=VARCHAR}");
        sql.GROUP_BY("C_DEST_ID,t1.name,docno,BILLDATE,t1.PRICEACTUAL,description order by t1.PRICEACTUAL");
        return sql.toString();
    }

}