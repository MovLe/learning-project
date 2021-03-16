package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.domain.SysUser;

import java.util.List;

public interface UserMapper {
    SysUser selectById(Long id);

    List<SysUser> selectAll();
}
