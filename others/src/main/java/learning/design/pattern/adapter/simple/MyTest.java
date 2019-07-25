/*
 *
 */
package learning.design.pattern.adapter.simple;


import learning.design.pattern.adapter.simple.adapter.TurkeyAdapter;
import learning.design.pattern.adapter.simple.turkey.WildTurkey;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 15:59
 * @Version V1.0
 */
public class MyTest {

    /**
     * 1.适配器模式可用于实现方和调用方接口不匹配的问题
     * 2.此实例为对象适配器模式，Turkey对象作为参数在Adapter里
     * 3.也有另一种适配器模式为类适配器，继承Quack类，实现Turkey方法也可以
     */
    public static void main(String[] args) {
        WildTurkey wildTurkey = new WildTurkey();
        TurkeyAdapter turkeyAdapter = new TurkeyAdapter(wildTurkey);
        turkeyAdapter.quack();
        turkeyAdapter.fly();
    }
}
