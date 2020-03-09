/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.spring.aop.test;

import org.aspectj.lang.annotation.Aspect;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 14:29
 * @Version V1.0
 */
public class Monkey {

    @TestAnno(key = "aaa")
    public void stealPeaches(String name) {
        System.out.println("【猴子】" + name + "正在偷桃...");
    }

    @TestAnno(key = "aaa")
    public Object stealPeaches2(String name) {
        System.out.println("【猴子】" + name + "正在偷桃...");
        return 1;
    }

}
