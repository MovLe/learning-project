package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.domain.SysUser;

public interface UserMapper {
    /**
     * 高级结果映射-一对一映射-使用自动映射处理一对一关系-根据用户id获取用户信息和用户的角色信息
     */
    SysUser selectUserAndRoleById(Long id);

    /**
     * 高级结果映射-一对一映射-使用resultMap配置一对一映射-根据用户id获取用户信息和用户的角色信息
     */
    SysUser selectUserAndRoleById2(Long id);
}

