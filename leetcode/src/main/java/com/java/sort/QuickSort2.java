/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.sort;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 17:11
 * @Version V1.0
 */
public class QuickSort2 {

    public static void quickSort(int[] n) {


    }

    public static void quickSort(int[] n, int l, int r) {
        if (l >= r) {
            return;
        }
        int index = partition(n, l, r);
        quickSort(n, l, index - 1);
        quickSort(n, index + 1, r);
    }

    public static int partition(int[] n, int l, int r) {
        int temp = n[l];
        int i = l;
        while (l < r) {
            while (n[r] > temp && l < r) {
                r--;
            }
            while (n[l] < temp && l < r) {
                l++;
            }
            Swap.swap2(n, l, r);
        }
        Swap.swap2(n, l, i);
        return l;
    }
}
