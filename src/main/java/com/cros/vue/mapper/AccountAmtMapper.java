package com.cros.vue.mapper;

import com.cros.vue.entity.AccountAmt;
import com.cros.vue.entity.AccountAmtExample;

import java.util.Date;
import java.util.List;

import com.cros.vue.entity.AccountAmtOne;
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
public interface AccountAmtMapper {

    @SelectProvider(type=AccountAmtSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.NUMERIC),
        @Result(column="code", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="qcye", property="qcye", jdbcType=JdbcType.NUMERIC),
        @Result(column="saleamt", property="saleamt", jdbcType=JdbcType.NUMERIC),
        @Result(column="retsaleamt", property="retsaleamt", jdbcType=JdbcType.NUMERIC),
        @Result(column="qtamt", property="qtamt", jdbcType=JdbcType.NUMERIC),
        @Result(column="custamt", property="custamt", jdbcType=JdbcType.NUMERIC),
        @Result(column="ysamt", property="ysamt", jdbcType=JdbcType.NUMERIC)
    })
    List<AccountAmt> selectByExample(AccountAmtExample example);

    @SelectProvider(type=AccountAmtSqlProvider.class, method="selectRecableAmount")
    @Results({
            @Result(column="areaname", property="areaname", jdbcType=JdbcType.VARCHAR),
            @Result(column="branchName", property="branchName", jdbcType=JdbcType.VARCHAR),
            @Result(column="a", property="a", jdbcType=JdbcType.NUMERIC),
            @Result(column="b", property="b", jdbcType=JdbcType.NUMERIC),
            @Result(column="c", property="c", jdbcType=JdbcType.NUMERIC),
            @Result(column="d", property="d", jdbcType=JdbcType.NUMERIC),
            @Result(column="total", property="total", jdbcType=JdbcType.NUMERIC)
    })
    List<AccountAmtOne> selectRecableAmount(AccountAmtExample example);

    @SelectProvider(type=AccountAmtSqlProvider.class, method="listStores")
    @Results({
            @Result(column="area", property="areaname", jdbcType=JdbcType.VARCHAR),
            @Result(column="branch", property="branchName", jdbcType=JdbcType.VARCHAR),
            @Result(column="three", property="a", jdbcType=JdbcType.NUMERIC),
            @Result(column="two", property="b", jdbcType=JdbcType.NUMERIC),
            @Result(column="neiku", property="c", jdbcType=JdbcType.NUMERIC),
            @Result(column="dadiku", property="d", jdbcType=JdbcType.NUMERIC),
            @Result(column="wazi", property="e", jdbcType=JdbcType.NUMERIC),
            @Result(column="tejiawazi", property="f", jdbcType=JdbcType.NUMERIC),
            @Result(column="total", property="total", jdbcType=JdbcType.NUMERIC)
    })
    List<AccountAmtOne> listStores(Date beginDate, Date endDate,Boolean flag);
}