package com.movle.mybatis.simple.test;

import com.movle.mybatis.simple.domain.SysRole;
import com.movle.mybatis.simple.mapper.RoleMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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

            List<SysRole> sysRoles = roleMapper.selectAll();

            for(SysRole s:sysRoles){
                System.out.println("s:"+s);
            }

        }finally {
            sqlSession.commit();
            sqlSession.close();
        }
    }
}
