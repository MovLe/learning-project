package com.movle.mybatis.simple.test;

import com.movle.mybatis.simple.domain.SysRole;
import com.movle.mybatis.simple.domain.SysUser;
import com.movle.mybatis.simple.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * @ClassName UserMapperTest
 * @MethodDesc: 第一个测试
 * @Author Movle
 * @Date 2021/3/16 下午10:13
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class UserMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        SqlSession sqlSession=getSqlSession();

        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            SysUser sysUser = userMapper.selectById(1L);
            System.out.println(sysUser);

        }finally {
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll(){

        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            List<SysUser> sysUsers = userMapper.selectAll();
            printList(sysUsers);

        }finally {
            sqlSession.close();
        }

    }

    public void printList(List<SysUser> sysUsers){
        for (SysUser s:sysUsers) {
            System.out.println(s);
        }
    }

    public void printList2(List<SysRole> sysRoles){
        for (SysRole s:sysRoles) {
            System.out.println(s);
        }
    }
    @Test
    public void fileTest(){
        String filePath="/docker/image/linux/test.txt";

        String[] filePath1 = filePath.split("/");

        int length = filePath1.length;
        String lastPath = filePath1[filePath1.length-1];
        System.out.println("lastPath:"+lastPath);
    }

    @Test
    public void testSelectRolesByUserId(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            List<SysRole> roleList = userMapper.selectRolesByUserId(1L);
            printList2(roleList);
        }finally {
            sqlSession.close();
        }
    }
}
