/*
 *
 */
package learning.basic.reflect;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 15:13
 * @Version V1.0
 */
public class InstanceOperation {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> dClazz = Class.forName("learning.basic.reflect.Dog");

        Dog dog = (Dog) dClazz.newInstance();
        dog.setName("旺财");
        dog.setId(101);

        System.out.println(dog.getName());
    }
}
