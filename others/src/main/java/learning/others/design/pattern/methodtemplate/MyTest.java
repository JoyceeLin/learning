/*
 *
 */
package learning.others.design.pattern.methodtemplate;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 18:00
 * @Version V1.0
 */
public class MyTest {

    public static void main(String[] args) {
        AbstractShopping shoesShopping = new ShoeShopping();
        AbstractShopping clothesShopping = new ClothesShopping();

        shoesShopping.buyGoods();
        System.out.println("-----------------------");
        clothesShopping.buyGoods();
    }
}
