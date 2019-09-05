/*
 *
 */
package learning.others.framework.spring.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/17 22:13
 * @Version V1.0
 */
public class Main2 {

    public static void main(String[] args) {
        Animal animal = (Animal) new DynamicProxy().bind(new Dog());
        animal.eat();
    }
}
