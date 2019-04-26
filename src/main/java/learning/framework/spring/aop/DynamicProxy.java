/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.framework.spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/17 22:08
 * @Version V1.0
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public Object bind(Object object) {
        this.target = object;
        return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        beforeInvoke();
        Object invoke = method.invoke(target, args);
        afterInvoke();
        return invoke;
    }

    private void beforeInvoke() {
        System.out.println("before invoke()");
    }

    private void afterInvoke() {
        System.out.println("after invoke()");
    }
}
