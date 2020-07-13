
package com.java.leetcode;

import java.util.Stack;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/6 17:45
 * @Version V1.0
 */
public class 有效的括号 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.empty()) {
                 if (isMathch(stack.peek(), s.charAt(i))) {
                     stack.pop();
                 } else {
                     stack.push(s.charAt(i));
                 }
            } else {
                stack.push(s.charAt(i));
            }
        }
        return stack.empty();
    }

    private static boolean isMathch(char c1, char c2) {
        if (c1 == '(' && c2 == ')') {
            return true;
        } else if (c1 == ')' && c2 == '(') {
            return true;
        } else if (c1 == '{' && c2 == '}') {
            return true;
        } else if (c1 == '}' && c2 == '{') {
            return true;
        } else if (c1 == '[' && c2 == ']') {
            return true;
        } else if (c1 == ']' && c2 == '[') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "()";
        System.out.println(isValid(s));
    }
}
