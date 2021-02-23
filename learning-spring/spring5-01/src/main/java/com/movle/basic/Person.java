package com.movle.basic;

import java.util.Arrays;

/**
 * @ClassName Person
 * @MethodDesc: TODO Person功能介绍
 * @Author Movle
 * @Date 2021/2/22 下午10:57
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/
public class Person {

    private Integer id;
    private String name;

    private String [] emails;

    public String[] getEmails() {
        return emails;
    }

    public void setEmails(String[] emails) {
        this.emails = emails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", emails=" + Arrays.toString(emails) +
                '}';
    }
}
