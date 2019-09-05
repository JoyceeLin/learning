/*
 *
 */
package learning.others.framework.spring.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/17 14:02
 * @Version V1.0
 */
public class Main {

    public static void main(String[] args) {
        AnimalStaticProxy animalStaticProxy = new AnimalStaticProxy(new Dog());
        animalStaticProxy.eat();
        animalStaticProxy.drink();
    }
}
