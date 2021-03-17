package com.movle.mybatis.simple.domain;

import java.util.Date;

/**
 * @ClassName SysRole
 * @MethodDesc: 实体类
 * @Author Movle
 * @Date 2021/3/16 下午9:22
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class SysRole {
    private Long id;
    private String roleName;
    private Integer enabled;
    private Integer createBy;
    private Date createTime;

    private SysUser user;

    public SysUser getUser() {
        return user;
    }

    public void setUser(SysUser user) {
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getEnabled() {
        return enabled;
    }

    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
