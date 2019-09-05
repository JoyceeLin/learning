/*
 *
 */
package learning.others.basic.reflect;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 16:00
 * @Version V1.0
 */
public class ReflectSupClass {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> dClazz = Class.forName("learning.others.basic.reflect.Dog");

        Class<?> superClass = dClazz.getSuperclass();
        System.out.println(superClass);
    }
}
