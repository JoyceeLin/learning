
package com.java.sort;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 18:02
 * @Version V1.0
 */
public class CountingSort {

    /**
     * 计数排序
     *
     * 通过索引下标来保存元素的次数，遍历输出即可
     * 要求输入的数据在特定的范围内
     */
    public static int[] countingSort(int[] m) {
        int[] n = new int[getMaxValue(m) + 1];
        int[] n2 = new int[getMaxValue(m) + 1];
        for (int value : m) {
            n[value]++;
        }
        int j = 0;
        for (int i = 0; i < n.length; i++) {
            while (n[i] > 0) {
                n2[j++] = i;
                n[i]--;
            }
        }
        return n2;
    }

    private static int getMaxValue(int[] arr) {
        int maxValue = arr[0];
        for (int value : arr) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static void main(String[] args) {
        for (int i : countingSort(new int[]{5, 6, 8, 10, 5, 2, 6, 4})) {
            System.out.println(i);
        }
    }
}
