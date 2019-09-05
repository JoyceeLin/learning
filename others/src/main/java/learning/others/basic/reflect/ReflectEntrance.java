/*
 *
 */
package learning.others.basic.reflect;


/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:06
 * @Version V1.0
 */
public class ReflectEntrance {

    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> dClazz = Class.forName("learning.others.basic.reflect.Dog");
        System.out.println(dClazz);

        Class<Dog> dClazz2 = Dog.class;
        System.out.println(dClazz2);

        Dog dog = new Dog();
        Class<?> dClazz3 = dog.getClass();
        System.out.println(dClazz3);
    }
}
