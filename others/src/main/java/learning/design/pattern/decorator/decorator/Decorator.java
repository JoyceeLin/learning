/*
 *
 */
package learning.design.pattern.decorator.decorator;

import learning.design.pattern.decorator.component.Drink;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/29 10:07
 * @Version V1.0
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double cost() {
        return super.getPrice() + drink.cost();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "-" + super.getPrice() + " && " + drink.getDescription();
    }
}
