package com.movle.mybatis.simple.domain;

/**
 * @ClassName SysPrivilege
 * @MethodDesc: 实体类
 * @Author Movle
 * @Date 2021/3/16 下午9:24
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class SysPrivilege {
    private Long id;
    private String privilegeName;
    private String privilegeUrl;

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPrivilegeName() {
        return privilegeName;
    }

    public void setPrivilegeName(String privilegeName) {
        this.privilegeName = privilegeName;
    }

    public String getPrivilegeUrl() {
        return privilegeUrl;
    }

    public void setPrivilegeUrl(String privilegeUrl) {
        this.privilegeUrl = privilegeUrl;
    }
}
