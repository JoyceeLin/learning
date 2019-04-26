/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/17 13:58
 * @Version V1.0
 */
public class Dog implements Animal {
    @Override
    public void eat() {

        System.out.println("dog eat");

    }

    @Override
    public void drink() {
        System.out.println("dog drink");
    }
}
