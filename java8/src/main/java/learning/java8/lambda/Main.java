/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.java8.lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/12/4 22:14
 * @Version V1.0
 */
public class Main {

    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(1, 1));
        apples.add(new Apple(2, 3));
        apples = filter(apples, (Apple apple) -> apple.getColor() == 1);
        System.out.println(apples);

        apples.sort((o1, o2) -> o1.getWeight() > o2.getWeight() ? 1 : 0);
    }

    private static <T> List<T> filter(List<T> apples, Predicate<T> predicate) {
        List<T> apples1 = new ArrayList<T>();
        for (T apple : apples) {
            if (predicate.test(apple)) {
                apples1.add(apple);
            }
        }
        return apples1;
    }
}
