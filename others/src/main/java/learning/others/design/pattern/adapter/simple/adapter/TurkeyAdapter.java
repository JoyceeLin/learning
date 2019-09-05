/*
 *
 */
package learning.others.design.pattern.adapter.simple.adapter;

import learning.others.design.pattern.adapter.simple.duck.Duck;
import learning.others.design.pattern.adapter.simple.turkey.Turkey;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:00
 * @Version V1.0
 */
public class TurkeyAdapter implements Duck {

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
