package com.movle.mybatis.simple.model;

/**
 * @ClassName Country
 * @MethodDesc: 实体类
 * @Author Movle
 * @Date 2021/3/16 下午3:50
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class Country {
    private Long id;
    private String countryname;
    private String countrycode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
