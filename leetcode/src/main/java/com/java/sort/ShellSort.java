
package com.java.sort;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 14:10
 * @Version V1.0
 */
public class ShellSort {

    /**
     * 希尔排序
     *
     * 在插入排序的基础上，加上一个gap常量，来区分多个子序列，
     * 分别对多个子序列先进行插入排序
     * 最后对整个数据进行插入排序，减少交换元素的次数
     */
    public static int[] shellSort(int[] m) {
        int[] n = Arrays.copyOf(m, m.length);
        for (int gap = n.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n.length; i++) {
                int j = i;
                while (j - gap >= 0 && n[j] < n[j - gap]) {
                    Swap.swap2(n, j, j - gap);
                    j -= gap;
                }
            }
        }
        return n;
    }

    public static int[] shellSort2(int[] m) {
        int[] n = Arrays.copyOf(m, m.length);
        for (int gap = n.length; gap > 0; gap /= 2) {
            for (int i = gap; i < n.length; i++) {
                int temp = n[i];
                int j;
                for (j = i - gap; j >= 0 && temp < n[j]; j-= gap) {
                    n[j + gap] = n[j];
                }
                n[j + gap] = temp;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        for (int i : shellSort2(new int[]{5, 6, 8, 10, 5, 2, 6, 4})) {
            System.out.println(i);
        }
    }
}
