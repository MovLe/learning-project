package com.movle.mybatis.simple.test;

import com.movle.mybatis.simple.domain.SysRole;
import com.movle.mybatis.simple.domain.SysUser;
import com.movle.mybatis.simple.mapper.RoleMapper;
import com.movle.mybatis.simple.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Date;
import java.util.List;

/**
 * @ClassName AnnotationUserMapperTest
 * @MethodDesc: 使用注解的测试类
 * @Author Movle
 * @Date 2021/3/17 下午9:36
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class AnnotationUserMapperTest extends BaseMapperTest{

    @Test
    public void testSelectById(){
        SqlSession sqlSession = getSqlSession();

        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole sysRole = roleMapper.selectById2(1L);

            System.out.println("sysRole"+sysRole);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testSelectAll(){
        SqlSession sqlSession = getSqlSession();
        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);

            List<SysRole> sysRoles = roleMapper.annotationselectAll();

            for(SysRole s:sysRoles){
                System.out.println("s:"+s);
            }

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testInsert1(){
        SqlSession sqlSession =getSqlSession();
        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole sysRole=new SysRole();
            sysRole.setId(4L);
            sysRole.setRoleName("普通用户3");
            sysRole.setEnabled(1);
            sysRole.setCreateBy(1);
            sysRole.setCreateTime(new Date());

            int result = roleMapper.insert(sysRole);

            System.out.println("result:"+result);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }
    @Test
    public void testInsert2(){
        SqlSession sqlSession =getSqlSession();
        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole sysRole=new SysRole();
            sysRole.setId(5L);
            sysRole.setRoleName("普通用户4");
            sysRole.setEnabled(1);
            sysRole.setCreateBy(1);
            sysRole.setCreateTime(new Date());

            int result = roleMapper.insert2(sysRole);

            long id = sysRole.getId();
            System.out.println("result:"+result+" id:"+id);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testInsert3(){
        SqlSession sqlSession =getSqlSession();
        try{
            RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
            SysRole sysRole=new SysRole();
            sysRole.setRoleName("普通用户4");
            sysRole.setEnabled(1);
            sysRole.setCreateBy(1);
            sysRole.setCreateTime(new Date());

            int result = roleMapper.insert3(sysRole);

            long id = sysRole.getId();
            System.out.println("result:"+result+" id:"+id);
        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }

    @Test
    public void testUpdateById(){
        SqlSession sqlSession = getSqlSession();
        try{
            RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);

            int result = roleMapper.updateById("管理员2",2,2,new Date(),3L);

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
            RoleMapper roleMapper=sqlSession.getMapper(RoleMapper.class);


            int result = roleMapper.deleteById(5L);

            System.out.println("result:"+result);

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
