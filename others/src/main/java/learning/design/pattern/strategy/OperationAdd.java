/*
 *
 */
package learning.design.pattern.strategy;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 18:28
 * @Version V1.0
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
