/*
 *
 */
package learning.framework.spring.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/14 12:50
 * @Version V1.0
 */
public class DynaTest {
    public static void main(String[] args) {
        IHello iHello = (IHello) new DyncProxyHello1().bind(new Hello(), new DLogger());
        iHello.sayHello("aaaaa");
    }
}
