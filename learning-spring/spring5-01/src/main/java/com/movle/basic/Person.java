package com.movle.basic;

import java.util.*;

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
    private Set<String> tels;
    private List<String> address;
    private Map<String,String> qqs;

    private Properties p;

    public Properties getP() {
        return p;
    }

    public void setP(Properties p) {
        this.p = p;
    }

    public Map<String, String> getQqs() {
        return qqs;
    }

    public void setQqs(Map<String, String> qqs) {
        this.qqs = qqs;
    }

    public List<String> getAddress() {
        return address;
    }

    public void setAddress(List<String> address) {
        this.address = address;
    }

    public Set<String> getTels() {
        return tels;
    }

    public void setTels(Set<String> tels) {
        this.tels = tels;
    }

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
                ", tels=" + tels +
                '}';
    }
}
