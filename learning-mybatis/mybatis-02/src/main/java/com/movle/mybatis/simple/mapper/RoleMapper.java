package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.domain.SysRole;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface RoleMapper {

    @Select({"select id,role_name,enabled,create_by,create_time from sys_role where id = #{id}"})
    SysRole selectById2(Long id);

    @Results(id = "roleResultMap",value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "roleName",column = "role_name"),
            @Result(property = "enabled",column = "enabled"),
            @Result(property = "createBy",column = "create_by"),
            @Result(property = "createTime",column = "create_time")

    })
//    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole> annotationselectAll();

    @Insert({"insert into sys_role(id,role_name,enabled,create_by,create_time)","values(#{id},#{roleName},#{enabled},#{createBy},","#{createTime,jdbcType=TIMESTAMP})"})
    int insert(SysRole sysRole);

    @Insert({"insert into sys_role(id,role_name,enabled,create_by,create_time)","values(#{id},#{roleName},#{enabled},#{createBy},","#{createTime,jdbcType=TIMESTAMP})"})
    @Options(useGeneratedKeys = true,keyProperty = "id")
    int insert2(SysRole sysRole);

    @Insert({"insert into sys_role(id,role_name,enabled,create_by,create_time)","values(#{id},#{roleName},#{enabled},#{createBy},","#{createTime,jdbcType=TIMESTAMP})"})
    @SelectKey(statement ="SELECT LAST_INSERT_ID()",keyProperty = "id",resultType = Long.class,before = false)
    int insert3(SysRole sysRole);


}
