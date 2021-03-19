package com.movle.mybatis.simple.test;

import com.movle.mybatis.simple.domain.SysUser;
import com.movle.mybatis.simple.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

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


}
