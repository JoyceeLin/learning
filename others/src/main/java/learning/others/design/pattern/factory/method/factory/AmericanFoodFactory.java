/*
 *
 */
package learning.others.design.pattern.factory.method.factory;

import learning.others.design.pattern.factory.method.products.AmericanFoodA;
import learning.others.design.pattern.factory.method.products.AmericanFoodB;
import learning.others.design.pattern.factory.method.products.Food;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/30 14:17
 * @Version V1.0
 */
public class AmericanFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if ("A".equals(name)) {
            return new AmericanFoodA();
        } else if ("B".equals(name)) {
            return new AmericanFoodB();
        } else {
            return null;
        }
    }
}
