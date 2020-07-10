/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.sort;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 11:48
 * @Version V1.0
 */
public class InsertionSort {

    /**
     * 插入排序
     *
     * 类似扑克牌依次摸牌时的插入方式，
     * 依次遍历数组中的元素，遍历每个元素时，与前面的元素进行比对，如顺序不对进行对换
     * 局部有序的算法
     * O（n*n）
     */
    public static int[] insertionSort(int[] m) {
        int[] n = Arrays.copyOf(m, m.length);
        for (int i = 0; i < n.length; i++) {
            int j = i + 1;
            int k = i;
            while (k >= 0 && j < n.length && n[j] < n[k]) {
                Swap.swap(n, k, j);
                j--;
                k--;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        for (int i : insertionSort(new int[]{5, 6, 8, 10, 5, 2, 6, 4})) {
            System.out.println(i);
        }
    }
}
