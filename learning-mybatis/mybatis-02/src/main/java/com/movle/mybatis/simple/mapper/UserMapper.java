package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.domain.SysRole;
import com.movle.mybatis.simple.domain.SysUser;

import java.util.List;

public interface UserMapper {
    SysUser selectById(Long id);

    List<SysUser> selectAll();

    List<SysRole> selectRolesByUserId(Long userId);

    int insertInto(SysUser sysUser);

    int insertInto2(SysUser sysUser);

    int insertInto3(SysUser sysUser);

}
