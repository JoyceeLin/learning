/*
 *
 */
package learning.others.design.pattern.factory.method;

import learning.others.design.pattern.factory.method.factory.ChineseFoodFactory;
import learning.others.design.pattern.factory.method.factory.FoodFactory;
import learning.others.design.pattern.factory.method.products.Food;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/5 10:07
 * @Version V1.0
 */
public class MyTest {

    /**
     * 符合开闭原则，如果需要增加新的国家的食物，
     * 重新写一个Factory实现接口即可
     */
    public static void main(String[] args) {
        FoodFactory factory = new ChineseFoodFactory();
        Food food = factory.makeFood("B");
        System.out.println(food);
    }
}
