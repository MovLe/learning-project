package com.movle.basic;

/**
 * @ClassName User
 * @MethodDesc: TODO User功能介绍
 * @Author Movle
 * @Date 2021/2/23 下午10:09
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class User {
    private String name;
    private String password;

    public User() {
    }

    public User(String name, String password) {

        this.name=name;
        this.password=password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
