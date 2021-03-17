package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.domain.SysRole;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface RoleMapper {
    @Results(id = "roleResultMap",value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "roleName",column = "role_name"),
            @Result(property = "enabled",column = "enabled"),
            @Result(property = "createBy",column = "create_by"),
            @Result(property = "createTime",column = "create_time")

    })
//    @ResultMap("roleResultMap")
    @Select({"select id,role_name,enabled,create_by,create_time from sys_role where id = #{id}"})
    SysRole selectById2(Long id);

    @Results(id = "roleResultMap",value = {
            @Result(property = "id",column = "id",id = true),
            @Result(property = "roleName",column = "role_name"),
            @Result(property = "enabled",column = "enabled"),
            @Result(property = "createBy",column = "create_by"),
            @Result(property = "createTime",column = "create_time")

    })
    @ResultMap("roleResultMap")
    @Select("select * from sys_role")
    List<SysRole> selectAll();
}
