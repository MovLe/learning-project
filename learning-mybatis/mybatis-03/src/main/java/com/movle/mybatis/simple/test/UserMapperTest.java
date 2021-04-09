package com.movle.mybatis.simple.test;

import com.movle.mybatis.simple.domain.SysUser;
import com.movle.mybatis.simple.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @ClassName UserMapperTest
 * @MethodDesc: 用于测试mybatis高级查询
 * @Author Movle
 * @Date 2021/3/19 上午9:58
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class UserMapperTest extends BaseMapperTest{

    /**
     * 高级结果映射-一对一映射-使用自动映射处理一对一关系-根据用户id获取用户信息和用户的角色信息
     */
    @Test
    public void testSelectUserAndRoleById(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = userMapper.selectUserAndRoleById(1001L);

            System.out.println("sysUser:"+sysUser);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 高级结果映射-一对一映射-使用resultMap配置一对一映射-根据用户id获取用户信息和用户的角色信息
     */
    @Test
    public void testSelectUserAndRoleById2(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = userMapper.selectUserAndRoleById2(1001L);

            System.out.println("修改resultMap实现:sysUser:"+sysUser);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 高级结果映射-一对一映射-使用resultMap配置一对一映射-使用resultMap继承-根据用户id获取用户信息和用户的角色信息
     */
    @Test
    public void testSelectUserAndRoleById3(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = userMapper.selectUserAndRoleById3(1001L);

            System.out.println("resultMap继承实现:sysUser:"+sysUser);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 高级结果映射-一对一映射-使用resultMap的association标签配置一对一映射-使用resultMap继承-根据用户id获取用户信息和用户的角色信息
     */
    @Test
    public void testSelectUserAndRoleById4(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = userMapper.selectUserAndRoleById4(1001L);

            System.out.println("resultMap的association标签配置实现:sysUser:"+sysUser);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 高级结果映射-一对一映射-association标签的嵌套查询
     */
    @Test
    public void testSelectUserAndRoleByIdSelect(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = userMapper.selectUserAndRoleByIdSelect(1001L);
            System.out.println("association标签的嵌套查询:sysUser:"+sysUser);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }
    /**
     * 高级结果映射-一对多映射-collection集合的嵌套结果映射-获取所有的用户以及对应的角色
     */
    @Test
    public void testSelectAllUserAndRoles(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            List<SysUser> userList = userMapper.selectAllUserAndRoles();

            printList(userList);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    public void printList(List<SysUser> sysUsers){
        for (SysUser s:sysUsers) {
            System.out.println("s:"+s);
        }
    }


    @Test
    public void test333(){
        String dateStr = "Wed Sep 16 11:26:23 CST 2009";
        SimpleDateFormat sdf = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy", Locale.US);

        //java.util.Date对象
        Date date = null;
        try {
            date = (Date) sdf.parse(dateStr);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        //2009-09-16
        String formatStr = new SimpleDateFormat("yyyy-MM-dd").format(date);
        System.out.println(formatStr);

        //2009-09-16 11:26:23
        String formatStr2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
        System.out.println(formatStr2);
    }

    @Test
    public void test4(){
        double rondom = (Math.random()*100);

        String b= "test"+rondom;

        System.out.println(b);
    }
}
