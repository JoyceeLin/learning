/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/14 12:12
 * @Version V1.0
 */
public class DyncProxyHello1 implements InvocationHandler {

    /** 调用对象 */
    private Object proxy;
    /** 目标对象 */
    private Object target;

    public Object bind(Object target, Object proxy) {
        this.target = target;
        this.proxy = proxy;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        // 操作者的实例
        Class clazz = this.proxy.getClass();
        // 得到操作者的start方法
        Method start = clazz.getDeclaredMethod("start", Method.class);
        start.invoke(this.proxy, new Object[]{method});
        method.invoke(this.target, args);
        Method end = clazz.getDeclaredMethod("end", Method.class);
        end.invoke(this.proxy, new Object[]{method});
        return result;
    }
}
