package com.movle.mybatis.simple.domain;

/**
 * @ClassName SysUserRole
 * @MethodDesc: 实体类
 * @Author Movle
 * @Date 2021/3/16 下午9:21
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class SysUserRole {
    private Long userId;
    private Long roleId;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
