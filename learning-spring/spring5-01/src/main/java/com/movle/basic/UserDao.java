package com.movle.basic;

/**
 * dao层
 */
public interface UserDao {
    public void save(User user);

    public void queryUserByNameAndPassword(String name,String password);

}
