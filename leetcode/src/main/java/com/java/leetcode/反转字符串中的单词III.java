/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

import java.util.Stack;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 14:16
 * @Version V1.0
 */
public class 反转字符串中的单词III {

    public String reverseWords(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                sb.append(popAll(stack)).append(' ');
            } else {
                stack.push(c);
            }
        }
        sb.append(popAll(stack));
        return sb.toString();
    }

    public String popAll(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();
        while (!stack.empty()) {
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}
