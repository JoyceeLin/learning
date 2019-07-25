/*
 *
 */
package learning.design.pattern.factory.simple;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 10:50
 * @Version V1.0
 */
public class MyTest {

    //违反开闭原则，如果有需要增加Product需要在Factory里修改
    //开闭原则：允许扩展，不允许修改
//    public static void main(String[] args) {
//        int type = 1;
//        Product product;
//        if (type == 1) {
//            product = new ConcreteProduct();
//        } else if (type == 2) {
//            product = new ConcreteProduct1();
//        } else {
//            product = new ConcreteProduct2();
//        }
//    }
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        Product product = simpleFactory.createProduct(1);
    }
}
