
package com.java.sort;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 11:01
 * @Version V1.0
 */
public class BubbleSort {

    /**
     * 冒泡排序思想
     * <p>
     * 比较前后两个数值的大小，大的移到后面，直到数组不需要调整顺序位置
     * 不需要占用额外的空间
     * O(n*n)
     */
    public static int[] bubbleSort(int[] m) {
        int[] n = Arrays.copyOf(m, m.length);
        int temp;
        boolean flag;
        for (int i = 0; i < n.length; i++) {
            flag = true;
            for (int j = i + 1; j < n.length; j++) {
                if (n[i] > n[j]) {
                    temp = n[j];
                    n[j] = n[i];
                    n[i] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 6, 8, 10, 5, 2, 6, 4};
        int[] b = bubbleSort(a);
        for (int i : a) {
            System.out.println(i);
        }
        for (int i : b) {
            System.out.println(i);
        }
    }
}
