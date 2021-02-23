package com.movle.basic;

/**
 * 用户功能接口
 */
public interface UserService {
    public void register(User user);
    public void login(String name,String password);

}
