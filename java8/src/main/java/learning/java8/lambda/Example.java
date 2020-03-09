package learning.java8.lambda;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Example {

    public static void main(String[] args) {
        Comparator<Apple> byWeight = new Comparator<Apple>() {
            @Override
            public int compare(Apple a1, Apple a2) {
                return a1.getWeight().compareTo(a2.getWeight());
            }
        };

        Comparator<Apple> byWeight2 = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

        Comparator<Apple> byWeight22 = (Apple a1, Apple a2) -> a1.getWeight().compareTo(a2.getWeight());

//        Comparator<Apple> byWeight33 = Apple::getWeight

        String b = "";
        Test test = new Test();
        String a = Optional.ofNullable(b).map(test::test2).orElse("");

        Comparator<Apple> byWeight3 = Comparator.comparing(Apple::getWeight);

        List<Integer> aa = map(Arrays.asList("", "", ""), String::length);

        Predicate<Apple> p = (apple) -> apple.getWeight() > 10;

    }

    public static <T, R> List<R> map(List<T> list, Function<T, R> f) {
        List<R> result = new ArrayList<>();
        for (T s : list) {
            result.add(f.apply(s));
        }
        return result;
    }

    public static void test2() {
        List<Fruit> listA = new ArrayList<Fruit>();
        List<String> fruitName =
                listA.stream()
                        .filter(a -> a.getPrice() > 10)
                        .sorted(Comparator.comparing(Fruit::getPrice))
                        .map(Fruit::getName)
                        .collect(Collectors.toList());
    }

    public static void test3() {
        List<Integer> test = new ArrayList<>();
        Consumer<Integer> testComsumer = test::add;
    }

    @AllArgsConstructor
    @Data
    @NoArgsConstructor
    class Fruit {
        private Integer price;
        private String name;
    }
}
