/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.adapter.simple.turkey;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/5/29 16:02
 * @Version V1.0
 */
public class WildTurkey implements Turkey {
    @Override
    public void gobble() {
        System.out.println("Go Go");
    }

    @Override
    public void fly() {
        System.out.println("fly fly");
    }
}
