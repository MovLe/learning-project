package com.movle.mybatis.simple.work;

/**
 * @ClassName TestDES
 * @MethodDesc: 测试加解密
 * @Author Movle
 * @Date 2021/4/9 下午3:12
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/


public class TestDES {
    public static void main(String[] args) throws Exception {
        String str = "shrm-taobaobao&&9000309118&&1276598765667";
        String t = "";
        System.out.println("加密后：" + (t = EncryUtil.encrypt(str)));
        System.out.println("解密后：" + EncryUtil.decrypt(t));
    }

}
