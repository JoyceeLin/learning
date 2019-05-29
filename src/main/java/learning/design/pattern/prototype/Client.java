/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.prototype;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 15:29
 * @Version V1.0
 */
public class Client {

    public static void main(String[] args) {
        ConcretePrototype concretePrototype = new ConcretePrototype();
        for (int i = 0; i < 10; i++) {
            ConcretePrototype cloneConcretePrototype = (ConcretePrototype) concretePrototype.clone();
            cloneConcretePrototype.show();
        }
    }
}
