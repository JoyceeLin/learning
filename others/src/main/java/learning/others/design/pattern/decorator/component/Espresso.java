/*
 *
 */
package learning.others.design.pattern.decorator.component;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/29 10:06
 * @Version V1.0
 */
public class Espresso extends Drink {

    public Espresso() {
        super.setDescription("Espresso");
        super.setPrice(4);
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
