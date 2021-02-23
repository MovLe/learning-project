package com.movle.basic;

/**
 * @ClassName UserDaoImpl
 * @MethodDesc: userDao接口实现
 * @Author Movle
 * @Date 2021/2/23 下午10:07
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class UserDaoImpl implements UserDao {
    @Override
    public void save(User user) {
        System.out.println("insert into user = "+user);
    }

    @Override
    public void queryUserByNameAndPassword(String name, String password) {

        System.out.println("query User name = "+name+" password = "+password);
    }
}
