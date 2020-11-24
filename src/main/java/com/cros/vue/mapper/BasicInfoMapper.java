package com.cros.vue.mapper;

import com.cros.vue.entity.BasicInfo;

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
public interface BasicInfoMapper {
    @Select({
        "select",
        "ID,VALUE, DESCRIPTION",
        "from AD_LIMITVALUE",
        "where AD_LIMITVALUE_GROUP_ID= #{groupId,jdbcType=NUMERIC} and ISACTIVE='Y' order by ORDERNO"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.NUMERIC, id=true),
        @Result(column="VALUE", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="DESCRIPTION", property="description", jdbcType=JdbcType.VARCHAR)
    })
    List<BasicInfo> listByLimitvalueGroupId(Long groupId);
}