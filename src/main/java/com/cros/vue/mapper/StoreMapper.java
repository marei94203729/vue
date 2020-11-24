package com.cros.vue.mapper;

import com.cros.vue.entity.Store;
import com.cros.vue.entity.StoreExample;
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
public interface StoreMapper {





    @SelectProvider(type=StoreSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="ISACTIVE", property="isactive", jdbcType=JdbcType.CHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_AREA_ID", property="cAreaId", jdbcType=JdbcType.NUMERIC),
        @Result(column="areaName", property="areaName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ISSTOP", property="isStop", jdbcType=JdbcType.CHAR),
        @Result(column="C_CUSTOMER_ID", property="cCustomerId", jdbcType=JdbcType.NUMERIC),
        @Result(column="custCode", property="custCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="custName", property="custName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_BLOCK_ID", property="cBlockId", jdbcType=JdbcType.NUMERIC),
        @Result(column="blockCode", property="blockCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="blockName", property="blockName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_BRANCH_ID", property="cBranchId", jdbcType=JdbcType.NUMERIC),
        @Result(column="branchName", property="branchName", jdbcType=JdbcType.VARCHAR),
        @Result(column="salerName", property="salerName", jdbcType=JdbcType.VARCHAR),
        @Result(column="C_SALER_ID", property="cSalerId", jdbcType=JdbcType.NUMERIC),
        @Result(column="PART_NO", property="partNo", jdbcType=JdbcType.VARCHAR)
    })
    List<Store> selectByExample(StoreExample example);

}