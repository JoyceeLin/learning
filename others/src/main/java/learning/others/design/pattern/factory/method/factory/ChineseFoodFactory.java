/*
 *
 */
package learning.others.design.pattern.factory.method.factory;

import learning.others.design.pattern.factory.method.products.ChineseFoodA;
import learning.others.design.pattern.factory.method.products.ChineseFoodB;
import learning.others.design.pattern.factory.method.products.Food;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/30 14:17
 * @Version V1.0
 */
public class ChineseFoodFactory implements FoodFactory {

    @Override
    public Food makeFood(String name) {
        if (name.equals("A")) {
            return new ChineseFoodA();
        }
        else if (name.equals("B")) {
            return new ChineseFoodB();
        } else {
            return null;
        }
    }
}
