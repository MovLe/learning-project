package com.movle.mybatis.simple.mapper;

import com.movle.mybatis.simple.model.Country;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * @ClassName CountryMapperTest
 * @MethodDesc: mybatis 功能测试
 * @Author Movle
 * @Date 2021/3/16 下午4:03
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class CountryMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            List<Country> countryList = sqlSession.selectList("selectAll");

            printCountryList(countryList);
        }finally {
            sqlSession.close();
        }
    }

    public void printCountryList(List<Country> countryList){

        for (Country c:countryList) {
            System.out.println("结果："+c.getId()+c.getCountryname()+c.getCountrycode());
        }
    }

}
