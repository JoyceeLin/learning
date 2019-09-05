/*
 *
 */
package learning.others.design.pattern.decorator.component;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/29 10:03
 * @Version V1.0
 */
public class Decaf extends Drink {

    public Decaf() {
        super.setDescription("Decaf");
        super.setPrice(3);
    }

    @Override
    public double cost() {
        return getPrice();
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "-" + cost();
    }
}
