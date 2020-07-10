/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.sort;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 11:25
 * @Version V1.0
 */
public class SelectionSort {

    /**
     * 选择排序
     *
     * 每次选出数组中第n小的值，并交换数组n的位置，直至末尾
     */
    public static int[] selectionSort(int[] m) {
        int[] n = Arrays.copyOf(m, m.length);
        int minIndex;
        int temp;
        for (int i = 0; i < n.length; i++) {
            minIndex = i;
            for (int j = i + 1; j < n.length; j++) {
                if (n[minIndex] > n[j]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                temp = n[minIndex];
                n[minIndex] = n[i];
                n[i] = temp;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        for (int i : selectionSort(new int[]{5, 6, 8, 10, 5, 2, 6, 4})) {
            System.out.println(i);
        }
    }
}
