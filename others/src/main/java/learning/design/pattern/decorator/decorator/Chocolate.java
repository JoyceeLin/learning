/*
 *
 */
package learning.design.pattern.decorator.decorator;

import learning.design.pattern.decorator.component.Drink;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/29 10:09
 * @Version V1.0
 */
public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        super.setDescription("Chocolate");
        super.setPrice(1);
    }
}
