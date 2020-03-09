/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 14:45
 * @Version V1.0
 */
public class 最长公共前缀 {

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length < 1) {
            return "";
        }
        int minSize = Integer.MAX_VALUE;
        for (String s : strs) {
            if (s.length() < minSize) {
                minSize = s.length();
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < minSize; i++) {
            char temp = ' ';
            for (int j = 0; j < strs.length; j++) {
                if (j == 0) {
                    temp = strs[j].charAt(i);
                } else if (temp != strs[j].charAt(i)) {
                    return sb.toString();
                }
                if (j == strs.length -1) {
                    sb.append(temp);
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String[] s = new String[]{"aca","cba"};
        System.out.println(longestCommonPrefix(s));
    }
}
