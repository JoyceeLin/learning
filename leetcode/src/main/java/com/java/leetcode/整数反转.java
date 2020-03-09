/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/3 22:02
 * @Version V1.0
 */
public class 整数反转 {
    public int reverse(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        if (x >= 0) {
            sb = sb.reverse();
        } else {
            sb = new StringBuilder(sb.toString().replace("-", ""));
            sb = sb.append("-").reverse();
        }
        String s = sb.toString();
        if (s.compareTo(String.valueOf(Integer.MAX_VALUE)) > 0 || s.compareTo(String.valueOf(-Integer.MAX_VALUE)) < 0) {
            return 0;
        }
        return Integer.parseInt(s);
    }

    public int reverse2(int x) {
        int rev = 0;
        while (x != 0) {
            int pop = x % 10;
            x /= 10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && pop > 7)) {
                return 0;
            }
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && pop < -8)) {
                return 0;
            }
            rev = rev * 10 + pop;
        }
        return rev;
    }
}
