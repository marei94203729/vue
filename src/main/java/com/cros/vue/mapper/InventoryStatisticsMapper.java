package com.cros.vue.mapper;

import com.cros.vue.entity.BasicInfo;
import com.cros.vue.entity.InventoryStatistics;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author MaLei
 * @description: InventoryStatistics实体映射接口
 * @create 2020/11/20
 */
@Repository
public interface InventoryStatisticsMapper {
    @SelectProvider(type=InventoryStatisticsSqlProvider.class, method="listInventoryStatisticssByIdp")
    @Results({
            @Result(column="year", property="year", jdbcType= JdbcType.VARCHAR),
            @Result(column="chun", property="chun", jdbcType=JdbcType.NUMERIC),
            @Result(column="xia", property="xia", jdbcType=JdbcType.NUMERIC),
            @Result(column="chunxia", property="chunxia", jdbcType=JdbcType.NUMERIC),
            @Result(column="sum1", property="sum1", jdbcType=JdbcType.NUMERIC),
            @Result(column="qiu", property="qiu", jdbcType=JdbcType.NUMERIC),
            @Result(column="dong", property="dong", jdbcType=JdbcType.NUMERIC),
            @Result(column="qiudong", property="qiudong", jdbcType=JdbcType.NUMERIC),
            @Result(column="sum2", property="sum2", jdbcType=JdbcType.NUMERIC),
            @Result(column="other", property="other", jdbcType=JdbcType.NUMERIC),
            @Result(column="qita", property="qita", jdbcType=JdbcType.NUMERIC),
            @Result(column="total", property="total", jdbcType=JdbcType.NUMERIC)
    })
    List<InventoryStatistics> listInventoryStatisticssByIdp(Long idp);

    @Select({
            "Select",
            "ID,",
            "attribcode,",
            "attribname",
            "from M_DIM where dimflag='DIM3'"
    })
    @Results({
            @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
            @Result(column="attribcode", property="value", jdbcType=JdbcType.VARCHAR),
            @Result(column="attribname", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<BasicInfo> listIdps();
}
