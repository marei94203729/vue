package com.cros.vue.mapper;

import com.cros.vue.entity.SlpriceadjpdtItem;
import com.cros.vue.entity.SlpriceadjpdtItemExample;
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
public interface SlpriceadjpdtItemMapper {

    @SelectProvider(type=SlpriceadjpdtItemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
            @Result(column="mProductCode", property="mProductCode", jdbcType=JdbcType.VARCHAR),
            @Result(column="year", property="year", jdbcType=JdbcType.VARCHAR),
            @Result(column="season", property="season", jdbcType=JdbcType.VARCHAR),
            @Result(column="PRICEACTUAL", property="priceactual", jdbcType=JdbcType.NUMERIC),
            @Result(column="PRICEDIS", property="pricedis", jdbcType=JdbcType.NUMERIC),
            @Result(column="docno", property="isactive", jdbcType=JdbcType.VARCHAR),
            @Result(column="billdate", property="creationdate", jdbcType=JdbcType.TIMESTAMP)
    })
    List<SlpriceadjpdtItem> selectByExample(SlpriceadjpdtItemExample example);

    @Select({
        "select",
        "ID, AD_CLIENT_ID, AD_ORG_ID, B_SLPRICEADJ_ID, M_PRODUCT_ID, FIRSALEDIS, SALEDIS, ",
        "SALERETDIS, OWNERID, MODIFIERID, CREATIONDATE, MODIFIEDDATE, ISACTIVE, FIRPRICE, ",
        "SPRICE, SRPRICE, PRICELIST, NOWPRICE, ISFREE, ISAGT, ISDISAGT, PRICEDIS, PRICEACTUAL, ",
        "STATUS",
        "from B_SLPRICEADJPDTITEM",
        "where ID = #{id,jdbcType=NUMERIC}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="AD_CLIENT_ID", property="adClientId", jdbcType=JdbcType.NUMERIC),
        @Result(column="AD_ORG_ID", property="adOrgId", jdbcType=JdbcType.NUMERIC),
        @Result(column="B_SLPRICEADJ_ID", property="bSlpriceadjId", jdbcType=JdbcType.NUMERIC),
        @Result(column="M_PRODUCT_ID", property="mProductId", jdbcType=JdbcType.NUMERIC),
        @Result(column="FIRSALEDIS", property="firsaledis", jdbcType=JdbcType.NUMERIC),
        @Result(column="SALEDIS", property="saledis", jdbcType=JdbcType.NUMERIC),
        @Result(column="SALERETDIS", property="saleretdis", jdbcType=JdbcType.NUMERIC),
        @Result(column="OWNERID", property="ownerid", jdbcType=JdbcType.NUMERIC),
        @Result(column="MODIFIERID", property="modifierid", jdbcType=JdbcType.NUMERIC),
        @Result(column="CREATIONDATE", property="creationdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFIEDDATE", property="modifieddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ISACTIVE", property="isactive", jdbcType=JdbcType.CHAR),
        @Result(column="FIRPRICE", property="firprice", jdbcType=JdbcType.NUMERIC),
        @Result(column="SPRICE", property="sprice", jdbcType=JdbcType.NUMERIC),
        @Result(column="SRPRICE", property="srprice", jdbcType=JdbcType.NUMERIC),
        @Result(column="PRICELIST", property="pricelist", jdbcType=JdbcType.NUMERIC),
        @Result(column="NOWPRICE", property="nowprice", jdbcType=JdbcType.NUMERIC),
        @Result(column="ISFREE", property="isfree", jdbcType=JdbcType.CHAR),
        @Result(column="ISAGT", property="isagt", jdbcType=JdbcType.CHAR),
        @Result(column="ISDISAGT", property="isdisagt", jdbcType=JdbcType.CHAR),
        @Result(column="PRICEDIS", property="pricedis", jdbcType=JdbcType.NUMERIC),
        @Result(column="PRICEACTUAL", property="priceactual", jdbcType=JdbcType.NUMERIC),
        @Result(column="STATUS", property="status", jdbcType=JdbcType.NUMERIC)
    })
    SlpriceadjpdtItem selectByPrimaryKey(Long id);

    @UpdateProvider(type=SlpriceadjpdtItemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") SlpriceadjpdtItem record, @Param("example") SlpriceadjpdtItemExample example);

    @UpdateProvider(type=SlpriceadjpdtItemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") SlpriceadjpdtItem record, @Param("example") SlpriceadjpdtItemExample example);

    @UpdateProvider(type=SlpriceadjpdtItemSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(SlpriceadjpdtItem record);

    @Update({
        "update B_SLPRICEADJPDTITEM",
        "set AD_CLIENT_ID = #{adClientId,jdbcType=NUMERIC},",
          "AD_ORG_ID = #{adOrgId,jdbcType=NUMERIC},",
          "B_SLPRICEADJ_ID = #{bSlpriceadjId,jdbcType=NUMERIC},",
          "M_PRODUCT_ID = #{mProductId,jdbcType=NUMERIC},",
          "FIRSALEDIS = #{firsaledis,jdbcType=NUMERIC},",
          "SALEDIS = #{saledis,jdbcType=NUMERIC},",
          "SALERETDIS = #{saleretdis,jdbcType=NUMERIC},",
          "OWNERID = #{ownerid,jdbcType=NUMERIC},",
          "MODIFIERID = #{modifierid,jdbcType=NUMERIC},",
          "CREATIONDATE = #{creationdate,jdbcType=TIMESTAMP},",
          "MODIFIEDDATE = #{modifieddate,jdbcType=TIMESTAMP},",
          "ISACTIVE = #{isactive,jdbcType=CHAR},",
          "FIRPRICE = #{firprice,jdbcType=NUMERIC},",
          "SPRICE = #{sprice,jdbcType=NUMERIC},",
          "SRPRICE = #{srprice,jdbcType=NUMERIC},",
          "PRICELIST = #{pricelist,jdbcType=NUMERIC},",
          "NOWPRICE = #{nowprice,jdbcType=NUMERIC},",
          "ISFREE = #{isfree,jdbcType=CHAR},",
          "ISAGT = #{isagt,jdbcType=CHAR},",
          "ISDISAGT = #{isdisagt,jdbcType=CHAR},",
          "PRICEDIS = #{pricedis,jdbcType=NUMERIC},",
          "PRICEACTUAL = #{priceactual,jdbcType=NUMERIC},",
          "STATUS = #{status,jdbcType=NUMERIC}",
        "where ID = #{id,jdbcType=NUMERIC}"
    })
    int updateByPrimaryKey(SlpriceadjpdtItem record);
}