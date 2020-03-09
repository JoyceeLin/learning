/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

import java.util.Scanner;

/**
 * @Description: https://leetcode-cn.com/problems/zuo-xuan-zhuan-zi-fu-chuan-lcof/
 * @Author: JingHui Lin
 * @Date: 2020/2/24 14:06
 * @Version V1.0
 */
public class LeftRotatedString {

    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        String in;
        int size;
        String out;
        while(scanner.hasNext()) {
            in = scanner.nextLine();
            size = scanner.nextInt();
            out = leftRotated(in, size);
            System.out.println(out);
        }
    }

    private static String leftRotated(String in, int size) {
        if (in.length() < size) {
            return in;
        }
        char[] charArray = in.toCharArray();
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            if (i < size) {
                a.append(charArray[i]);
            } else {
                b.append(charArray[i]);
            }
        }
        return b.append(a).toString();
    }
}
