package com.cros.vue.mapper;

import com.cros.vue.entity.Slpriceadj;
import com.cros.vue.entity.SlpriceadjExample;


import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import com.cros.vue.entity.SlpriceadjpdtItem;
import org.apache.ibatis.annotations.*;

import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface SlpriceadjMapper {


    @Select({
        "select",
        "ID, DOCNO,to_date(BILLDATE,'YYYY-MM-DD') BILLDATE,substr(STORE_FILTER,15,instr(STORE_FILTER,')')-14) STORE_FILTER, MODIFIEDDATE",
        "from B_SLPRICEADJ",
        "where STATUS ='1' and ISACTIVE ='Y' and to_date(BILLDATE,'YYYY-MM-DD hh24:mi:ss')  between #{begindate,jdbcType=TIMESTAMP} and #{enddate,jdbcType=TIMESTAMP}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="DOCNO", property="docno", jdbcType=JdbcType.VARCHAR),
        @Result(column="MODIFIEDDATE", property="modifieddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="BILLDATE", property="billdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="STORE_FILTER", property="storefilter", jdbcType=JdbcType.CLOB,javaType=String.class )
    })
    List<Slpriceadj> listByDates(Date begindate,Date enddate);

    @Select({
            "select",
            "ID, DOCNO,to_date(BILLDATE,'YYYY-MM-DD') BILLDATE,substr(STORE_FILTER,15,instr(STORE_FILTER,')')-14) STORE_FILTER, MODIFIEDDATE",
            "from B_SLPRICEADJ",
            "where STATUS ='1' and ISACTIVE ='Y' and id= #{id,jdbcType=NUMERIC}"
    })
    @Results({
            @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
            @Result(column="DOCNO", property="docno", jdbcType=JdbcType.VARCHAR),
            @Result(column="MODIFIEDDATE", property="modifieddate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="BILLDATE", property="billdate", jdbcType=JdbcType.TIMESTAMP),
            @Result(column="STORE_FILTER", property="storefilter", jdbcType=JdbcType.CLOB,javaType=String.class ),
            @Result(column="ID", property="items", javaType = List.class,many = @Many(select = "listById")),
    })
    Slpriceadj selectByPrimaryKey(Long id);

    @Select({
            "select",
            "t1.ID,t2.name mProductCode,t4.attribname year,t5.attribname season,t1.PRICEACTUAL ,nvl(t1.PRICEDIS,0) PRICEDIS",
            "from B_SLPRICEADJPDTITEM t1 inner join  M_PRODUCT t2 on t1.M_PRODUCT_ID =t2.id",
            "left join M_DIM t4 on t2.M_DIM2_ID=t4.id left join M_DIM t5 on t2.M_DIM11_ID=t5.id",
            "where t1.B_SLPRICEADJ_ID= #{id,jdbcType=NUMERIC}"
    })
    @Results({
            @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
            @Result(column="mProductCode", property="mProductCode", jdbcType=JdbcType.VARCHAR),
            @Result(column="year", property="year", jdbcType=JdbcType.VARCHAR),
            @Result(column="season", property="season", jdbcType=JdbcType.VARCHAR),
            @Result(column="PRICEACTUAL", property="priceactual", jdbcType=JdbcType.NUMERIC),
            @Result(column="PRICEDIS", property="pricedis", jdbcType=JdbcType.NUMERIC)
    })
    List<SlpriceadjpdtItem> listById(Long id);

    @Update({
            "update B_SLPRICEADJPDTITEM set PRICEDIS=#{price,jdbcType=NUMERIC}",
            "where ID = #{id,jdbcType=NUMERIC} and B_SLPRICEADJ_ID=(select ID from B_SLPRICEADJ where STATUS ='1' and ISACTIVE ='Y' and ID=#{sid,jdbcType=NUMERIC})"
    })
    int updateItemByInfo(Long id, BigDecimal price,Long sid);
}