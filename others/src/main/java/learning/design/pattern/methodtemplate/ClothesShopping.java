/*
 *
 */
package learning.design.pattern.methodtemplate;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 17:59
 * @Version V1.0
 */
public class ClothesShopping extends AbstractShopping {

    @Override
    public void buy() {
        System.out.println("买衣服");
    }

    @Override
    public void pay() {
        System.out.println("使用支付宝支付");
    }
}
