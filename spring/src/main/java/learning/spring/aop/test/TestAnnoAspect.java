/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.aop.test;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 15:11
 * @Version V1.0
 */
@Aspect
public class TestAnnoAspect {

    @Pointcut("@annotation(learning.spring.aop.test.TestAnno) && execution(* *.*(..))")
    public void pointcut() {

    }
//
//    @Before("pointcut() && @annotation(testAnno)")
//    public void beforeAspect(TestAnno testAnno) {
//        System.out.println("aspect before ====");
//        System.out.println(testAnno.key());
//    }
//
//    @After("pointcut() && @annotation(testAnno)")
//    public void afterAspect(TestAnno testAnno) {
//        System.out.println("aspect after ====");
//        System.out.println(testAnno.key());
//    }

    @Around("@annotation(learning.spring.aop.test.TestAnno) && execution(Object *.*(..)) && @annotation(testAnno)")
    public Object aroundAspect(ProceedingJoinPoint joinPoint, TestAnno testAnno) {
        System.out.println("around around1 ====");
        System.out.println(testAnno.key());
        try {
            return joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("around around2 ====");
        }
        return null;
    }

    @Around("@annotation(learning.spring.aop.test.TestAnno) && execution(void *.*(..)) && @annotation(testAnno)")
    public Object aroundAspect2(ProceedingJoinPoint joinPoint, TestAnno testAnno) {
        System.out.println("around around11 ====");
        System.out.println(testAnno.key());
        try {
            joinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        } finally {
            System.out.println("around around22 ====");
        }
        return null;
    }
}
