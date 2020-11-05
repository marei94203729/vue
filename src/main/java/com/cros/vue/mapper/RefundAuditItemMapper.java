package com.cros.vue.mapper;

import com.cros.vue.entity.RefundAuditItem;
import com.cros.vue.entity.RefundAuditItemExample;
import java.util.List;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundAuditItemMapper {
    @SelectProvider(type=RefundAuditItemSqlProvider.class, method="countByExample")
    long countByExample(RefundAuditItemExample example);

    @DeleteProvider(type=RefundAuditItemSqlProvider.class, method="deleteByExample")
    int deleteByExample(RefundAuditItemExample example);

    @Insert({
        "insert into M_RET_SALECONF_MATRIX (ID, AD_CLIENT_ID, ",
        "AD_ORG_ID, OWNERID, ",
        "MODIFIERID, CREATIONDATE, ",
        "MODIFIEDDATE, ISACTIVE, ",
        "SHOWNAME, M_RET_SALE_ID, ",
        "M_PRODUCT_ID, M_PRODUCT2_ID, ",
        "MX1, MX2, MX3, ",
        "MX4, MX5, MX6, ",
        "MX7, MX8, MX9, ",
        "MX10, MX11, MX12, ",
        "MX13, MX14, MX15, ",
        "MX16, MX17, MX18, ",
        "MX19, MX20, MX21, ",
        "MX22, MX23, MX24, ",
        "TOT_QTY, RN, AMT_ACTUAL, ",
        "DESCRIPTION, ISMODIFY, ",
        "QTY1, QTYCAN, M_COLOR_ID, ",
        "PRICEACTUAL2, RET_REASON, ",
        "PRICEACTUAL)",
        "values (#{id,jdbcType=NUMERIC}, #{adClientId,jdbcType=NUMERIC}, ",
        "#{adOrgId,jdbcType=NUMERIC}, #{ownerid,jdbcType=NUMERIC}, ",
        "#{modifierid,jdbcType=NUMERIC}, #{creationdate,jdbcType=TIMESTAMP}, ",
        "#{modifieddate,jdbcType=TIMESTAMP}, #{isactive,jdbcType=CHAR}, ",
        "#{showname,jdbcType=CHAR}, #{mRetSaleId,jdbcType=NUMERIC}, ",
        "#{mProductId,jdbcType=NUMERIC}, #{mProduct2Id,jdbcType=NUMERIC}, ",
        "#{mx1,jdbcType=NUMERIC}, #{mx2,jdbcType=NUMERIC}, #{mx3,jdbcType=NUMERIC}, ",
        "#{mx4,jdbcType=NUMERIC}, #{mx5,jdbcType=NUMERIC}, #{mx6,jdbcType=NUMERIC}, ",
        "#{mx7,jdbcType=NUMERIC}, #{mx8,jdbcType=NUMERIC}, #{mx9,jdbcType=NUMERIC}, ",
        "#{mx10,jdbcType=NUMERIC}, #{mx11,jdbcType=NUMERIC}, #{mx12,jdbcType=NUMERIC}, ",
        "#{mx13,jdbcType=NUMERIC}, #{mx14,jdbcType=NUMERIC}, #{mx15,jdbcType=NUMERIC}, ",
        "#{mx16,jdbcType=NUMERIC}, #{mx17,jdbcType=NUMERIC}, #{mx18,jdbcType=NUMERIC}, ",
        "#{mx19,jdbcType=NUMERIC}, #{mx20,jdbcType=NUMERIC}, #{mx21,jdbcType=NUMERIC}, ",
        "#{mx22,jdbcType=NUMERIC}, #{mx23,jdbcType=NUMERIC}, #{mx24,jdbcType=NUMERIC}, ",
        "#{totQty,jdbcType=NUMERIC}, #{rn,jdbcType=NUMERIC}, #{amtActual,jdbcType=NUMERIC}, ",
        "#{description,jdbcType=VARCHAR}, #{ismodify,jdbcType=VARCHAR}, ",
        "#{qty1,jdbcType=NUMERIC}, #{qtycan,jdbcType=NUMERIC}, #{mColorId,jdbcType=NUMERIC}, ",
        "#{priceactual2,jdbcType=NUMERIC}, #{retReason,jdbcType=NUMERIC}, ",
        "#{priceactual,jdbcType=NUMERIC})"
    })
    int insert(RefundAuditItem record);

    @InsertProvider(type=RefundAuditItemSqlProvider.class, method="insertSelective")
    int insertSelective(RefundAuditItem record);

    @SelectProvider(type=RefundAuditItemSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC),
        @Result(column="AD_CLIENT_ID", property="adClientId", jdbcType=JdbcType.NUMERIC),
        @Result(column="AD_ORG_ID", property="adOrgId", jdbcType=JdbcType.NUMERIC),
        @Result(column="OWNERID", property="ownerid", jdbcType=JdbcType.NUMERIC),
        @Result(column="MODIFIERID", property="modifierid", jdbcType=JdbcType.NUMERIC),
        @Result(column="CREATIONDATE", property="creationdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="MODIFIEDDATE", property="modifieddate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ISACTIVE", property="isactive", jdbcType=JdbcType.CHAR),
        @Result(column="SHOWNAME", property="showname", jdbcType=JdbcType.CHAR),
        @Result(column="M_RET_SALE_ID", property="mRetSaleId", jdbcType=JdbcType.NUMERIC),
        @Result(column="M_PRODUCT_ID", property="mProductId", jdbcType=JdbcType.NUMERIC),
        @Result(column="M_PRODUCT2_ID", property="mProduct2Id", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX1", property="mx1", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX2", property="mx2", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX3", property="mx3", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX4", property="mx4", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX5", property="mx5", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX6", property="mx6", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX7", property="mx7", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX8", property="mx8", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX9", property="mx9", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX10", property="mx10", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX11", property="mx11", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX12", property="mx12", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX13", property="mx13", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX14", property="mx14", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX15", property="mx15", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX16", property="mx16", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX17", property="mx17", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX18", property="mx18", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX19", property="mx19", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX20", property="mx20", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX21", property="mx21", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX22", property="mx22", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX23", property="mx23", jdbcType=JdbcType.NUMERIC),
        @Result(column="MX24", property="mx24", jdbcType=JdbcType.NUMERIC),
        @Result(column="TOT_QTY", property="totQty", jdbcType=JdbcType.NUMERIC),
        @Result(column="RN", property="rn", jdbcType=JdbcType.NUMERIC),
        @Result(column="AMT_ACTUAL", property="amtActual", jdbcType=JdbcType.NUMERIC),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISMODIFY", property="ismodify", jdbcType=JdbcType.VARCHAR),
        @Result(column="QTY1", property="qty1", jdbcType=JdbcType.NUMERIC),
        @Result(column="QTYCAN", property="qtycan", jdbcType=JdbcType.NUMERIC),
        @Result(column="M_COLOR_ID", property="mColorId", jdbcType=JdbcType.NUMERIC),
        @Result(column="PRICEACTUAL2", property="priceactual2", jdbcType=JdbcType.NUMERIC),
        @Result(column="RET_REASON", property="retReason", jdbcType=JdbcType.NUMERIC),
        @Result(column="PRICEACTUAL", property="priceactual", jdbcType=JdbcType.NUMERIC),
        @Result(column="retReasonName", property="retReasonName", jdbcType=JdbcType.VARCHAR),
        @Result(column="mProductCode", property="mProductCode", jdbcType=JdbcType.VARCHAR)
    })
    List<RefundAuditItem> selectByExample(RefundAuditItemExample example);

    @UpdateProvider(type=RefundAuditItemSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") RefundAuditItem record, @Param("example") RefundAuditItemExample example);

    @UpdateProvider(type=RefundAuditItemSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") RefundAuditItem record, @Param("example") RefundAuditItemExample example);
}