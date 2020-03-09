/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/28 14:10
 * @Version V1.0
 */
public class 反转字符串 {

    public void reverseString(char[] s) {
        if (s == null || s.length <= 1) {
            return;
        }
        char temp;
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i];
            s[s.length - i] = temp;
        }
    }
}
