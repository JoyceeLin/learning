/*
 *
 */
package learning.framework.spring.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/17 13:58
 * @Version V1.0
 */
public class Dog implements Animal {
    @Override
    public void eat() {

        System.out.println("dog eat");

    }

    @Override
    public void drink() {
        System.out.println("dog drink");
    }
}
