package com.cros.vue.mapper;

import com.cros.vue.entity.SaleItem;
import com.cros.vue.entity.SaleItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface SaleItemMapper {
    @SelectProvider(type=SaleItemSqlProvider.class, method="selectByExample")
    @Results({
            @Result(column="C_DEST_ID", property="cDestId", jdbcType=JdbcType.VARCHAR),
            @Result(column="mProductName", property="mProductName", jdbcType=JdbcType.VARCHAR),
            @Result(column="billDate", property="billDate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="docno", property="docon", jdbcType=JdbcType.VARCHAR),
            @Result(column="qtyOut", property="qtyOut", jdbcType=JdbcType.NUMERIC),
            @Result(column="priceActual", property="priceActual", jdbcType=JdbcType.NUMERIC),
            @Result(column="saleWaysName", property="saleWaysName", jdbcType=JdbcType.VARCHAR)
    })
    List<SaleItem> selectByExample(SaleItemExample example);

    @Select({
        "select  t1.name mProductName,docno,to_date(BILLDATE,'YYYY-MM-DD') billDate,t1.PRICEACTUAL priceActual,description saleWaysName,sum(t1.qtyout) qtyOut",
        "from",
            "(select t5.docno,t5.BILLDATE ,SUBSTR(t3.no,length(t3.no)-1) sku,t2.name,t1.qty,t1.qtyout,t1.PRICEACTUAL,t1.saleways,t4.description from M_SALEITEM t1 inner join m_product t2 on t1.M_PRODUCT_ID =t2.id inner join M_PRODUCT_ALIAS t3 on t1.M_PRODUCTALIAS_ID=t3.id",
            "left join AD_LIMITVALUE t4 on t4.AD_LIMITVALUE_group_id=1544 and t1.saleways=t4.value",
            "inner join M_SALE t5 on t1.m_sale_id =t5.id",
            "where t5.C_DEST_ID in(select id from c_store where C_CUSTOMER_ID=(select C_CUSTOMER_ID from M_RET_SALECONF where id=#{storeid,jdbcType=NUMERIC})) and t5.OUTTIME is not null and t5.ISACTIVE='Y' and t5.C_STORE_ID in (select id from  c_store where  C_STORETYPE_JZ_ID in (select id from C_STORETYPE_JZ where no in('01','02','03','061','05','060')))) t1",
        "where t1.name = #{productName,jdbcType=VARCHAR} group by t1.name,docno,BILLDATE,t1.PRICEACTUAL,description order by t1.PRICEACTUAL"
    })
    @Results({
        @Result(column="mProductName", property="mProductName", jdbcType=JdbcType.VARCHAR),
        @Result(column="billDate", property="billDate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="docno", property="docon", jdbcType=JdbcType.VARCHAR),
        @Result(column="qtyOut", property="qtyOut", jdbcType=JdbcType.NUMERIC),
        @Result(column="priceActual", property="priceActual", jdbcType=JdbcType.NUMERIC),
        @Result(column="saleWaysName", property="saleWaysName", jdbcType=JdbcType.VARCHAR)
    })
    List<SaleItem> listByInfo(String productName,Long storeid);
}