package com.movle.mybatis.simple.mapper;


import com.movle.mybatis.simple.domain.SysRole;

public interface RoleMapper {

    SysRole selectRoleById(Long id);

}
