package com.movle.mybatis.simple.test;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.BeforeClass;

import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName BaseMapperTest
 * @MethodDesc: 测试用例
 * @Author Movle
 * @Date 2021/3/16 下午9:54
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class BaseMapperTest {
    private static SqlSessionFactory sqlSessionFactory;

    @BeforeClass
    public static void init(){
        try{
            Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            reader.close();
        }catch (IOException ignore){
            ignore.printStackTrace();

        }
    }

    public SqlSession getSqlSession(){
        return sqlSessionFactory.openSession();
    }
}
