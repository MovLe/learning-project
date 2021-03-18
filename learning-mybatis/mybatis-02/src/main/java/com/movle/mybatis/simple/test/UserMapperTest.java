package com.movle.mybatis.simple.test;

import com.movle.mybatis.simple.domain.SysRole;
import com.movle.mybatis.simple.domain.SysUser;
import com.movle.mybatis.simple.mapper.UserMapper;
import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
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

    @Test
    public void testInsert(){
        SqlSession sqlSession = getSqlSession();

        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
            sysUser.setUserName("test4");
            sysUser.setUserPassword("123456");
            sysUser.setUserEmail("test4@mybatis.tk");
            sysUser.setUserInfo("test4 info");
            sysUser.setHeadImg(new byte[]{1,2,3});
            sysUser.setCreateTime(new Date());

            int result = userMapper.insertInto(sysUser);
            System.out.println("result:"+result);

        }finally {
            //sqlSession.rollback();
            sqlSession.commit();

            sqlSession.close();
        }
    }
    @Test
    public void testInsert2(){
        SqlSession sqlSession = getSqlSession();

        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
            sysUser.setUserName("test5");
            sysUser.setUserPassword("123456");
            sysUser.setUserEmail("test5@mybatis.tk");
            sysUser.setUserInfo("test5 info");
            sysUser.setHeadImg(new byte[]{1,2,3});
            sysUser.setCreateTime(new Date());

            int result = userMapper.insertInto2(sysUser);
            Long id = sysUser.getId();

            System.out.println("result:"+result+" id:"+id);
        }finally {
            //sqlSession.rollback();
            sqlSession.commit();

            sqlSession.close();
        }
    }
    @Test
    public void testInsert3(){
        SqlSession sqlSession = getSqlSession();

        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
            sysUser.setUserName("test6");
            sysUser.setUserPassword("123456");
            sysUser.setUserEmail("test6@mybatis.tk");
            sysUser.setUserInfo("test6 info");
            sysUser.setHeadImg(new byte[]{1,2,3});
            sysUser.setCreateTime(new Date());

            int result = userMapper.insertInto3(sysUser);

            long id = sysUser.getId();
            System.out.println("result:"+result+" id:"+id);
        }finally {
            //sqlSession.rollback();
            sqlSession.commit();

            sqlSession.close();
        }
    }

    @Test
    public void testUpdateById(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

            SysUser user=userMapper.selectById(1L);

            user.setUserName("admin_test");
            user.setUserEmail("admin_test@mybatis.tk");

            int result = userMapper.updateById(user);

            System.out.println("result:"+result);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }
    @Test
    public void testDeleteById(){
        SqlSession sqlSession = getSqlSession();

        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

            int result = userMapper.deleteById(1005L);

            System.out.println("result:"+result);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testSelectRolesByUserIdAndRoleEnabled(){
        SqlSession sqlSession =getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<SysRole> userList =userMapper.selectRolesBuUserIdAndRoleAbled(1L,1);
            printList2(userList);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 动态sql-if-根据动态条件查询用户信息
     */
    @Test
    public void testSelectByUser(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
            sysUser.setUserName("est");
            sysUser.setUserEmail("test3@mybatis.tk");
            List<SysUser> sysUsers = userMapper.selectByUser(sysUser);

            printList(sysUsers);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 动态sql-if-根据主键更新
     */
    @Test
    public void testUpdateByIdSelective(){
        SqlSession sqlSession = getSqlSession();
        try{

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser=new SysUser();
            sysUser.setId(1007L);
            sysUser.setUserName("testXXX");

            int result = userMapper.updateByIdSelective(sysUser);

            System.out.println("result:"+result);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 动态sql-if-insert的动态插入
     */
    @Test
    public void testInsert2Selective(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
            sysUser.setUserName("testInsert2");
            sysUser.setUserPassword("1133333");
            sysUser.setUserInfo("insert动态sql的使用2");
            sysUser.setUserEmail("testInser2@mybatis.tk");
            sysUser.setHeadImg(new byte[]{1,2,2});
            sysUser.setCreateTime(new Date());

            int result = userMapper.insertInto4(sysUser);

            System.out.println("result:"+result);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 动态sql-choose-根据用户id或用户名查询
     */
    @Test
    public void testSelectByIdUserName(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
            //sysUser.setId(1L);
            sysUser.setUserName("testInsert");

            SysUser result = userMapper.selectByIdOrUserName(sysUser);

            System.out.println("result:"+result);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    /**
     * 动态sql-where-根据动态条件查询用户信息
     */
    @Test
    public void testSelectByUser2(){
        SqlSession sqlSession = getSqlSession();
        try{
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            SysUser sysUser = new SysUser();
//            sysUser.setUserName("est");
            sysUser.setUserEmail("test3@mybatis.tk");
            List<SysUser> sysUsers = userMapper.selectByUser2(sysUser);

            printList(sysUsers);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
