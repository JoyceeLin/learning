/*
 *
 */
package learning.design.pattern.strategy;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 18:47
 * @Version V1.0
 */
public class MyTest {

    /**
     * 策略模式可以避免使用多重if-else语句，推荐算法（新旧可用此模式）
     */
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStratgy(10, 5));

        context = new Context(new OperationSubstract());
        System.out.println(context.executeStratgy(10, 5));

        context = new Context(new OperationMultiply());
        System.out.println(context.executeStratgy(10, 5));
    }
}
