/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.strategy;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/26 18:45
 * @Version V1.0
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStratgy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }
}