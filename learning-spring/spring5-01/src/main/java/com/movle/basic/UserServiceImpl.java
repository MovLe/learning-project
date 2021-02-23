package com.movle.basic;

/**
 * @ClassName UserServiceImpl
 * @MethodDesc: 用户功能实现
 * @Author Movle
 * @Date 2021/2/23 下午10:06
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void register(User user) {
        userDao.save(user);
    }

    @Override
    public void login(String name, String password) {

        userDao.queryUserByNameAndPassword(name,password);
    }
}
