/*
 * Copyright (C), 2005-2019, 深圳市珍爱网信息技术有限公司
 */
package learning.java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2019/12/10 20:12
 * @Version V1.0
 */
public class FlatMap {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("Hello", "World");
        List<String> tt = words.stream()
                .map(word -> word.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
        System.out.println(tt.toString());

        Thread thread = new Thread(() -> System.out.println(111));
        thread.start();
    }
}
