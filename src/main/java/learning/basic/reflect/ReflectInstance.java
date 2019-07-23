/*
 *
 */
package learning.basic.reflect;

import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:13
 * @Version V1.0
 */
public class ReflectInstance {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");

        Dog dog = (Dog) dClazz.newInstance();
        System.out.println(dog);
        dog.eat();
    }
}
