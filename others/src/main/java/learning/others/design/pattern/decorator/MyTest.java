/*
 *
 */
package learning.others.design.pattern.decorator;

import learning.others.design.pattern.decorator.component.Decaf;
import learning.others.design.pattern.decorator.component.Drink;
import learning.others.design.pattern.decorator.decorator.Chocolate;
import learning.others.design.pattern.decorator.decorator.Milk;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/29 10:25
 * @Version V1.0
 */
public class MyTest {

    /**
     * 装饰者模式，例子：Java的IO
     *
     * @param args
     */

    public static void main(String[] args) {
        Drink order = new Decaf();
        System.out.println("order description : " + order.getDescription());
        System.out.println("order price : " + order.getPrice());
        System.out.println("----------------加了调料的----------------");
        order = new Milk(order);
        order = new Chocolate(order);
        order = new Chocolate(order);
        System.out.println("order description : " + order.getDescription());
        System.out.println("order price : " + order.cost());
    }
}
