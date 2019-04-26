/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.basic.reflect;

import java.lang.reflect.Constructor;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:57
 * @Version V1.0
 */
public class ReflectConstructor {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");

        // 注意没有获取到私有的那个构造方法 private Dog(String name)
        Constructor<?>[] constructors = dClazz.getConstructors();
        for (Constructor<?> c : constructors) {
            System.out.println(c);
        }

        System.out.println("------------------");

        // 这里可以获取到当前类的所有方法(包括private)
        Constructor<?>[] declaredConstructors = dClazz.getDeclaredConstructors();
        for (Constructor<?> dc : declaredConstructors) {
            System.out.println(dc);
        }
    }
}
