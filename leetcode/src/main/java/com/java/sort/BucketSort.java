/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.sort;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 20:49
 * @Version V1.0
 */
public class BucketSort {

    /**
     * 桶排序
     *
     * 基于计数排序的优化方案，int[][] 二维数组保存桶的个数和每个桶里存放的值，
     * 对每个桶里存放的值进行选择排序（适合小体量的排序）
     * 最后按顺序输出每个桶里排序完的元素即可
     */
    public static int[] bucketSort(int[] m) {
        int[] n = Arrays.copyOf(m, m.length);
        int bucketSize = 5;

        int bucketCount = (int) Math.floor((getMax(n) - getMin(n)) / bucketSize) + 1;
        int[][] buckets = new int[bucketCount][0];
        for (int i = 0; i < n.length; i++) {
            int index = (int) Math.floor((n[i] - getMin(n)) / bucketSize);
            buckets[index] = arrAppend(buckets[index], n[i]);
        }
        int i = 0;
        for (int[] b : buckets) {
            b = InsertionSort.insertionSort(b);
            for (int j : b) {
                n[i++] = j;
            }
        }
        return n;
    }

    private static int[] arrAppend(int[] n, int value) {
        int[] newN = Arrays.copyOf(n, n.length + 1);
        newN[newN.length - 1] = value;
        return newN;
    }

    private static int getMin(int[] n) {
        int min = n[0];
        for (int i = 1; i < n.length; i++) {
            if (min > n[i]) {
                min = n[i];
            }
        }
        return min;
    }

    private static int getMax(int[] n) {
        int max = n[0];
        for (int i = 1; i < n.length; i++) {
            if (max < n[i]) {
                max = n[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        for (int i : bucketSort(new int[]{5, 6, 8, 10, 5, 2, 6, 4})) {
            System.out.println(i);
        }
    }
}
