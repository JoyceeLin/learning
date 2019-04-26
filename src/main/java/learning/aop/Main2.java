/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/17 22:13
 * @Version V1.0
 */
public class Main2 {

    public static void main(String[] args) {
        Animal animal = (Animal) new DynamicProxy().bind(new Dog());
        animal.eat();
    }
}
