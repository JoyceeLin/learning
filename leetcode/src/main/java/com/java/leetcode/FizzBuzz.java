/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/6/24 15:48
 * @Version V1.0
 */
public class FizzBuzz {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        int i = 1;
        while (n >= i) {
            if (i % 15 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
            i++;
        }
        return list;
    }
}
