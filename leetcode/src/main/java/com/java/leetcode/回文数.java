/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/28 15:02
 * @Version V1.0
 */
public class 回文数 {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);
        char[] c = s.toCharArray();
        for(int i = 0; i < s.length() / 2; i++) {
            if (c[i] != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindrome2(int x) {
        if (x < 0) {
            return false;
        }
        int div = 1;
        if (x / div > 0) {
            div *= 10;
        }
        while (x > 0) {
            int left = x / div;
            int right = x % 10;
            if (left != right) {
                return false;
            }
            x = (x % div) / 10;
            div /= 100;
        }
        return true;
    }
}
