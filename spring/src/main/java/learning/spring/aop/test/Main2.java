/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.aop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 14:31
 * @Version V1.0
 */
public class Main2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beanFactoryTest.xml");
        Monkey monkey = (Monkey) context.getBean("monkey");
        try {
            monkey.stealPeaches2("孙大圣的大徒弟");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
