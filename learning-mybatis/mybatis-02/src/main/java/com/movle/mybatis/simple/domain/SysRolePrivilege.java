package com.movle.mybatis.simple.domain;

/**
 * @ClassName SysRolePrivilege
 * @MethodDesc: 实体类
 * @Author Movle
 * @Date 2021/3/16 下午9:26
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class SysRolePrivilege {
    private Integer roleId;
    private Integer privilegeId;


    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getPrivilegeId() {
        return privilegeId;
    }

    public void setPrivilegeId(Integer privilegeId) {
        this.privilegeId = privilegeId;
    }
}
