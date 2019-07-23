/*
 *
 */
package learning.basic.reflect;

import java.lang.reflect.Field;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:44
 * @Version V1.0
 */
public class ReflectField {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");

        Field[] fields = dClazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        System.out.println("------------------");
        Field[] fields1 = dClazz.getDeclaredFields();
        for (Field field : fields1) {
            System.out.println(field);
        }
    }
}
