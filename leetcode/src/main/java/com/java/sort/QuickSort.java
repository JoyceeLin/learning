
package com.java.sort;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 16:26
 * @Version V1.0
 */
public class QuickSort {

    /**
     * 快速排序
     *
     * 分治思想，用partition值，数组从左右两端进行遍历，大于part的值交换到右边，小于的值交换到左边
     * 最后part值与最后一个小于该值的元素交换，得到此次part的索引值
     *
     * 对索引值左边和右边进行递归快排
     */
    public static int[] quickSort(int[] m) {
        int[] n = Arrays.copyOf(m, m.length);
        quickSort(n, 0, n.length - 1);
        return n;
    }

    public static void quickSort(int[] n, int l, int r) {
        if (l >= r) {
            return;
        }
        int m = partition(n, l, r);
        quickSort(n, l, m - 1);
        quickSort(n, m + 1, r);
    }

    public static int partition(int[] n, int l, int r) {
        int pivot = n[l];
        int i = l;
        while (i < r) {
            // 需从右边开始找出第一个小于temp的索引值
            while (n[r] >= pivot && r > i) {
                r--;
            }
            while (n[i] <= pivot && r > i) {
                i++;
            }
            Swap.swap2(n, i, r);
        }
        Swap.swap2(n, i, l);
        return i;
    }

    public static void main(String[] args) {
        for (int i : quickSort(new int[]{5, 6, 8, 10, 5, 2, 6, 4})) {
            System.out.println(i);
        }
    }
}
