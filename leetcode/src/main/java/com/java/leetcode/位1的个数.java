/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/6/24 15:07
 * @Version V1.0
 */
public class 位1的个数 {

    public static void main(String[] args) {
        System.out.println(hammingWeight(00000000000000000000000000001011));
    }

    public static int hammingWeight(int n) {
        int i = 0;
        int mask = 1;
        for (int j = 0; j < 32; j++) {
            i = (n & mask) != 0 ? i + 1 : i;
            mask <<= 1;
        }
        return i;
    }
}
