/*
 *
 */
package learning.basic.reflect;

import java.lang.reflect.Field;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:13
 * @Version V1.0
 */
public class InstanceOperation2 {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");

        Dog dog = (Dog) dClazz.newInstance();
        Field nameField = dClazz.getDeclaredField("name");

        nameField.setAccessible(true);
        nameField.set(dog, "旺财");
        System.out.println(dog.getName());
    }
}
