/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.java8.lambda;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/12/4 22:14
 * @Version V1.0
 */
@FunctionalInterface
public interface Predicate<T> {

    boolean test(T apple);
}
