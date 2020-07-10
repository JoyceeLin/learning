/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.aop.proxy;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;
import org.springframework.aop.framework.ProxyFactory;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.NameMatchMethodPointcutAdvisor;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.util.StopWatch;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/4/7 10:42
 * @Version V1.0
 */
public class Main {

    public static void main(String[] args) {
        ProInterface proInterface = new ProInterfaceImpl();
        ProInterface actuallyProInterface = new ProInterfaceImplProxy(proInterface);
        actuallyProInterface.test();
        System.out.println("================");

        ProxyFactory weaver = new ProxyFactory(new Test());
        NameMatchMethodPointcutAdvisor advisor = new NameMatchMethodPointcutAdvisor();
        advisor.setMappedName("execute");
        advisor.setAdvice(new PerformanceMonitorInterceptor());
        weaver.addAdvisor(advisor);
        weaver.setOptimize(true);
        weaver.setProxyTargetClass(true);
        TestInterface testProxy = (TestInterface) weaver.getProxy();
        testProxy.execute();
        System.out.println(testProxy.getClass());
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setInterceptorNames();
        System.out.println("================");

        AspectJProxyFactory proxyFactory = new AspectJProxyFactory();
        proxyFactory.setProxyTargetClass(true);
        proxyFactory.setTarget(new Test());
        proxyFactory.addAspect(PerformanceTraceAspect.class);
        TestInterface test = proxyFactory.getProxy();
        test.execute();
    }

    interface TestInterface {
        void execute();
    }


    @Aspect
    static class PerformanceTraceAspect {

        @Pointcut("execution(public void *.execute())")
        public void pointcutName() {}

        @Around("pointcutName()")
        public Object performanceTrace(ProceedingJoinPoint joinPoint) throws Throwable {
            StopWatch watch = new StopWatch();
            try {
                System.out.println("execute before performanceTrace");
                watch.start();
                return joinPoint.proceed();
            } finally {
                watch.stop();
                System.out.println("execute after performanceTrace");
            }
        }
    }

    static class Test implements TestInterface{
        @Override
        public void execute() {
            System.out.println("execute test");
        }
    }

    static class PerformanceMonitorInterceptor implements MethodInterceptor {

        @Override
        public Object invoke(MethodInvocation invocation) throws Throwable {
            StopWatch watch = new StopWatch();
            try {
                watch.start();
                return invocation.proceed();
            } finally {
                watch.stop();
                System.out.println(watch.toString());
            }
        }
    }
}
