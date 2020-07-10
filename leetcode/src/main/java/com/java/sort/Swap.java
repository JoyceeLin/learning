/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.sort;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 13:49
 * @Version V1.0
 */
public class Swap {

    public static void swap(int[] n, int i, int j) {
        if (i >= n.length || j >= n.length) {
            return;
        }
        int temp = n[i];
        n[i] = n[j];
        n[j] = temp;
    }

    public static void swap2(int[] n, int i, int j) {
        if (i == j) {
            return;
        }
        n[i] = n[i] + n[j];
        n[j] = n[i] - n[j];
        n[i] = n[i] - n[j];
    }

    public static void main(String[] args) {
        int[] n = new int[]{2,5,3};
        swap2(n, 2, 1);
        for (int i : n) {
            System.out.println(i);
        }
    }
}
