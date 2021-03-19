package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.domain.SysUser;

import java.util.List;

public interface UserMapper {
    /**
     * 高级结果映射-一对一映射-使用自动映射处理一对一关系-根据用户id获取用户信息和用户的角色信息
     */
    SysUser selectUserAndRoleById(Long id);

    /**
     * 高级结果映射-一对一映射-使用resultMap配置一对一映射-根据用户id获取用户信息和用户的角色信息
     */
    SysUser selectUserAndRoleById2(Long id);

    /**
     * 高级结果映射-一对一映射-使用resultMap配置一对一映射-使用resultMap继承-根据用户id获取用户信息和用户的角色信息
     */
    SysUser selectUserAndRoleById3(Long id);

    /**
     * 高级结果映射-一对一映射-使用resultMap的association标签配置一对一映射-使用resultMap继承-根据用户id获取用户信息和用户的角色信息
     */
    SysUser selectUserAndRoleById4(Long id);

    /**
     * 高级结果映射-一对一映射-association标签的嵌套查询
     * @param id
     * @return
     */
    SysUser selectUserAndRoleByIdSelect(Long id);

    /**
     * 高级结果映射-一对多映射-collection集合的嵌套结果映射-获取所有的用户以及对应的角色
     * @return
     */
    List<SysUser> selectAllUserAndRoles();
}

