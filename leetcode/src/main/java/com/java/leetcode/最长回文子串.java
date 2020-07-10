/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/4 16:08
 * @Version V1.0
 */
public class 最长回文子串 {

    /**
     * 1 中心扩散法 + 双指针兼容基数偶数的回文串
     * <p>
     * 2 动态规划法
     * <p>
     * 3 Manacher算法
     */
    public static String longestPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }
        int left;
        int right;
        int len;
        int maxStart = 0;
        int maxLen = 0;
        for (int i = 0; i < s.length(); i++) {
            len = 1;
            left = i - 1;
            right = i + 1;
            while (left >= 0 && s.charAt(left) == s.charAt(i)) {
                len++;
                left--;
            }
            while (right < s.length() && s.charAt(right) == s.charAt(i)) {
                right++;
                len++;
            }
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                len += 2;
            }
            if (len > maxLen) {
                maxLen = len;
                maxStart = left;
            }
        }
        return s.substring(maxStart + 1, maxStart + maxLen + 1);
    }

    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }

    /**
     * 动态规划法
     */
    public String longestPalindrome2(String s) {
        if (s == null || s.length() == 0) {
            return s;
        }
        String ss = new StringBuilder(s).reverse().toString();
        char[] c = s.toCharArray();
        char[] cc = ss.toCharArray();
        int[][] dp = new int[s.length()][s.length()];
        int max = 0;
        int end = 0;
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < cc.length; j++) {
                if (c[i] == cc[j]) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    }
                }
                if (dp[i][j] > max && cc.length - 1 - j + dp[i][j] - 1 == i) {
                    max = dp[i][j];
                    end = i;
                }
            }
        }
        return s.substring(end - max + 1, end + 1);
    }
}
