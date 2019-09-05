/*
 *
 */
package learning.others.design.pattern.factory.simple;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 10:52
 * @Version V1.0
 */
public class SimpleFactory {

    public Product createProduct(int type) {
        if (type == 1) {
            return new ConcreteProduct();
        } else if (type == 2) {
            return new ConcreteProduct1();
        }
        return new ConcreteProduct2();
    }
}
