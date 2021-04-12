package com.movle.mybatis.simple.work;

/**
 * @ClassName EncryUtil
 * @MethodDesc: DES加解密工具类
 * @Author Movle
 * @Date 2021/4/9 下午3:11
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class EncryUtil {
    /**
     * 使用默认密钥进行DES加密
     */
    public static String encrypt(String plainText) {
        try {
            return new DesEncryption().encrypt(plainText);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 使用指定密钥进行DES解密
     */
    public static String encrypt(String plainText, String key) {
        try {
            return new DesEncryption(key).encrypt(plainText);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 使用默认密钥进行DES解密
     */
    public static String decrypt(String plainText) {
        try {
            return new DesEncryption().decrypt(plainText);
        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 使用指定密钥进行DES解密
     */
    public static String decrypt(String plainText, String key) {
        try {
            return new DesEncryption(key).decrypt(plainText);
        } catch (Exception e) {
            return null;
        }
    }


}
