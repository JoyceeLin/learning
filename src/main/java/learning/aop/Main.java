/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/17 14:02
 * @Version V1.0
 */
public class Main {

    public static void main(String[] args) {
        AnimalStaticProxy animalStaticProxy = new AnimalStaticProxy(new Dog());
        animalStaticProxy.eat();
        animalStaticProxy.drink();
    }
}
