/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.framework.spring.aop;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/17 14:00
 * @Version V1.0
 */
public class AnimalStaticProxy implements Animal {

    private Animal targetAnimal;

    public void setTargetAnimal(Animal animal) {
        this.targetAnimal = animal;
    }

    public AnimalStaticProxy(Animal animal) {
        this.targetAnimal = animal;
    }

    @Override
    public void eat() {
        beforeEat();
        targetAnimal.eat();
        afterEat();
    }

    @Override
    public void drink() {
        targetAnimal.drink();
    }

    private void beforeEat() {
        System.out.println("beforeEat " + targetAnimal.getClass().getName());
    }

    private void afterEat() {
        System.out.println("afterEat " + targetAnimal.getClass().getName());
    }
}
