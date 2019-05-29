/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.design.pattern.factory.method.factory;

import learning.design.pattern.factory.method.products.Food;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/4/30 14:17
 * @Version V1.0
 */
public interface FoodFactory {

    Food makeFood(String name);
}
