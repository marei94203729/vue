package com.cros.vue.mapper;

import com.cros.vue.entity.User;
import com.cros.vue.entity.UserExample;
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
public interface UserMapper {
    @SelectProvider(type=UserSqlProvider.class, method="countByExample")
    long countByExample(UserExample example);

    @SelectProvider(type=UserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CREATIONDATE", property="creationdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PASSWORDHASH", property="passwordhash", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRUENAME", property="truename", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR)
    })
    List<User> selectByExample(UserExample example);

    @Select({
        "select",
        "ID, CREATIONDATE, PASSWORDHASH,",
        "TRUENAME, NAME",
        "from USERS",
        "where NAME = #{NAME,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="CREATIONDATE", property="creationdate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="PASSWORDHASH", property="passwordhash", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRUENAME", property="truename", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR)
    })
    User selectByName(String NAME);

}