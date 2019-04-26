/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.basic.reflect;

import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:13
 * @Version V1.0
 */
public class ReflectMethod {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");

        // 所有public,所有关联的方法，如接口、父类方法
        Method[] methods = dClazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        System.out.println("------------------");
        // 所有本类的方法
        Method[] methods1 = dClazz.getDeclaredMethods();
        for (Method method : methods1) {
            System.out.println(method.getName());
        }
    }
}
