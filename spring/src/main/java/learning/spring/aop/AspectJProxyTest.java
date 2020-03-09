/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.aop;

import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/11/27 15:34
 * @Version V1.0
 */
public class AspectJProxyTest {

    public static void main(String[] args) {
        Waiter target = new NaiveWaiter();
        AspectJProxyFactory factory = new AspectJProxyFactory();
        factory.setTarget(target);
        factory.addAspect(PreGreetingAspect.class);
        Waiter proxy = factory.getProxy();
        proxy.greetTo("John");
        proxy.serveTo("John");
    }
}
