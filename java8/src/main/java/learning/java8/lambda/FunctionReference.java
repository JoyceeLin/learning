/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package learning.java8.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/1/8 22:06
 * @Version V1.0
 */
public class FunctionReference {
    public static List<Integer> strToInt(List<String> strs, Function<String, Integer> f) {
        List<Integer> result = new ArrayList<>();
        for (String s : strs) {
            result.add(f.apply(s));
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> numStrings = new ArrayList<>();
        numStrings.add("123");
        numStrings.add("234");
        numStrings.add("345");
        numStrings.add("456");
        numStrings.add("567");
        StrClass sc = new StrClass();
        List<Integer> ints = strToInt(numStrings, new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return sc.reverseInt(s);
            }
        });
        List<Integer> int1 = strToInt(numStrings, (String s) -> sc.reverseInt(s));
        List<Integer> ints2 = strToInt(numStrings, sc::reverseInt);
        System.out.println(ints);
    }
}

class StrClass {
    public int reverseInt(String s) {
        int n = Integer.parseInt(s);
        int result = 0;
        while (n > 0) {
            result *= 10;
            result += (n % 10);
            n /= 10;
        }
        return result;
    }
}
