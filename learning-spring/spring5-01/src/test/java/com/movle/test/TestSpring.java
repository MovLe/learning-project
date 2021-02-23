package com.movle.test;

import com.movle.basic.Person;
import com.movle.basic.User;
import com.movle.basic.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

/**
 * @ClassName TestSpring
 * @MethodDesc: 用于spring的功能测试
 * @Author Movle
 * @Date 2021/2/22 下午10:59
 * @Version 1.0
 * @Email movle_xjk@foxmail.com
 **/
public class TestSpring {
    /**
     * 用于测试：Spring的第一个程序
     */
    @Test
    public void test1() {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("/applicationContext.xml");

        Person person = (Person) ctx.getBean("person");

        System.out.println("person:"+person);
    }

    /**
     * 用于测试：Spring工厂提供的其他方法
     */
    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        Person person = ctx.getBean("person",Person.class);

        System.out.println("person:"+person);

    }

    /**
     * 用于测试：Spring工厂提供的其他方法
     * 直接用类型创建，注意这种类型在bean标签中只能有一个
     */
    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        Person person = ctx.getBean(Person.class);

        System.out.println("person:"+person);
    }

    /**
     * 用于测试：Spring工厂提供的其他方法
     * 取得bean的id，获取的是Spring工厂配置文件中的所有bean标签的id值
     */
    @Test
    public void test4(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        String[] beanDefinitionNames = ctx.getBeanDefinitionNames();

        for (String beanDefinitionName:beanDefinitionNames) {
            System.out.println("beanDefinitionName="+beanDefinitionName);
        }

    }

    /**
     * 用于测试：Spring工厂提供的其他方法
     * 根据类型获得Spring配置文件中对应的id值
     */
    @Test
    public void test5(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        String[] beanNamesForType= ctx.getBeanNamesForType(Person.class);

        for (String id:beanNamesForType) {
            System.out.println("id="+id);
        }

    }
    /**
     * 用于测试：Spring工厂提供的其他方法
     * 用于判断是否存在指定id值的bean
     */
    @Test
    public void test6(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        if(ctx.containsBeanDefinition("person")){
            System.out.println("true="+true);
        }else{
            System.out.println("false="+false);
        }

    }
    /**
     * 用于测试：Spring工厂提供的其他方法
     * 用于判断是否存在指定id值的bean
     */
    @Test
    public void test7(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        if(ctx.containsBean("person")){
            System.out.println("true="+true);
        }else{
            System.out.println("false="+false);
        }

    }
    /**
     * 用于测试：通过spring的配置文件进行赋值
     */
    @Test
    public void test8(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        Person person = (Person) ctx.getBean("person");

        System.out.println("person="+person);
    }

    /**
     * 用于测试：JDK类型成员遍历的赋值：数组，set，list，map,properties
     */
    @Test
    public void test9(){

        ApplicationContext ctx = new ClassPathXmlApplicationContext("/applicationContext.xml");

        Person person = (Person) ctx.getBean("person4");

        System.out.println("-----------数组------------");
        String [] emails = person.getEmails();
        for (String email:emails) {
            System.out.println("email="+email);
        }

        System.out.println("------------set-----------");

        Set<String> tels = person.getTels();

        for (String tel:tels) {
            System.out.println("tel="+tel);
        }

        System.out.println("--------list---------------");

        List<String> address = person.getAddress();

        for (String adress1:address) {
            System.out.println("adress1="+adress1);
        }

        System.out.println("----------map-------------");
        Map<String,String> qqs=person.getQqs();
        Set<String> keys=qqs.keySet();
        for (String key:keys) {
            System.out.println("key = "+key+" and value = "+qqs.get(key));
        }

        System.out.println("-----------properties-------------");
        Properties p =person.getP();
        System.out.println("key is key1 "+"and values is "+p.getProperty("key1"));
        System.out.println("key is key2 "+"and values is "+p.getProperty("key2"));

    }

    /**
     * 用于测试：用户自定义类型成员变量赋值：普通和ref两种方式
     */
    @Test
    public void test10(){

        ApplicationContext ctx= new ClassPathXmlApplicationContext("/applicationContext.xml");
        UserService userService = (UserService) ctx.getBean("userService");

        userService.register(new User("movle","123456"));
        userService.login("xiaoming","32323234");


        System.out.println("--------分割-----------");
        UserService userService1 = (UserService) ctx.getBean("userService1");

        userService1.register(new User("movle1","123456"));
        userService1.login("xiaoming1","32323234");


    }
}

