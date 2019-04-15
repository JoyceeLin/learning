/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.aop;

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
