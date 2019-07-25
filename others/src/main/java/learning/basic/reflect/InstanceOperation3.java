/*
 *
 */
package learning.basic.reflect;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:13
 * @Version V1.0
 */
public class InstanceOperation3 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");

        Dog dog = (Dog) dClazz.newInstance();
        Method method = dClazz.getDeclaredMethod("privateMethod");

        method.setAccessible(true);
        method.invoke(dog, null);

        Method pmethod2 = dClazz.getDeclaredMethod("privateMethod2", String.class);
        pmethod2.setAccessible(true);
        pmethod2.invoke(dog, "旺财");
    }
}
