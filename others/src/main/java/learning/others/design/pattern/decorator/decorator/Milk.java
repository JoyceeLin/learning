/*
 *
 */
package learning.others.design.pattern.decorator.decorator;

import learning.others.design.pattern.decorator.component.Drink;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/29 10:13
 * @Version V1.0
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        super.setDescription("Milk");
        super.setPrice(3);
    }
}
