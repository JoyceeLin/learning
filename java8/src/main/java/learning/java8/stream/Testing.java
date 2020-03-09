/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.java8.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/12/10 20:41
 * @Version V1.0
 */
public class Testing {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();
        test5();
    }

    private static void test1() {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        List<Integer> sq = integers.stream()
                .map(a -> a * a)
                .collect(Collectors.toList());
        System.out.println("===test1===");
        System.out.println(sq.toString());
        System.out.println("===test1===");
    }

    private static void test2() {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);

        List<int[]> ss = l1.stream()
                .flatMap(i -> l2.stream().map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        ss.forEach(a -> Arrays.stream(a).forEach(System.out::println));
    }

    private static void test3() {
        List<Integer> l1 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);

        List<Integer> l2 = new ArrayList<>();
        l2.add(3);
        l2.add(4);

        List<int[]> ss = l1.stream()
                .flatMap(i -> l2.stream().filter(j -> (i + j) % 3 == 0).map(j -> new int[]{i, j}))
                .collect(Collectors.toList());
        ss.forEach(a -> Arrays.stream(a).forEach(System.out::println));
    }

    private static void test4() {
        List<Trade> trades = new ArrayList<>();
        List<Trade> newTrades = trades.stream()
                .filter(t -> t.getYear() == 2011)
//                .sorted((o1, o2) -> o1.getPrice() > o2.getPrice() ? 1: 0)
                .sorted(Comparator.comparing(Trade::getPrice))
                .collect(Collectors.toList());
        List<String> newTrades2 = trades.stream()
                .map(Trade::getWorkCity)
                .distinct()
//                .collect(Collectors.groupingBy(Trade::getYear));
                .collect(Collectors.toList());
        System.out.println("===test4===");
        System.out.println(newTrades.toString());
        System.out.println(newTrades2.toString());
        System.out.println("===test4===");
    }

    private static void test5() {
        int value = Stream.of(1, 2, 3, 4).reduce(100, (sum, num) -> sum + num);
//        int value = Stream.of(1, 2, 3, 4).reduce(100, Integer::sum);
        System.out.println("===test5===");
        System.out.println(value);
        System.out.println("===test5===");
    }
}
