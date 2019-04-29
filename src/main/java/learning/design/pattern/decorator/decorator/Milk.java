/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.decorator.decorator;

import learning.design.pattern.decorator.component.Drink;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/29 10:13
 * @Version V1.0
 */
public class Milk extends Decorator{

    public Milk(Drink drink) {
        super(drink);
        super.setDescription("Milk");
        super.setPrice(3);
    }
}
