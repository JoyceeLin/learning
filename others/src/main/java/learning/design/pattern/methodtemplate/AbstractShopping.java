/*
 *
 */
package learning.design.pattern.methodtemplate;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 17:57
 * @Version V1.0
 */
public abstract class AbstractShopping {

    public void buyGoods() {
        userLogin();
        buy();
        pay();
    }

    public final void userLogin() {
        System.out.println("登录");
    }

    public abstract void buy();

    public void pay() {
        System.out.println("使用银联支付");
    }
}
