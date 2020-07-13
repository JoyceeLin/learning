
package com.java.leetcode;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/6 14:01
 * @Version V1.0
 */
public class 合并两个有序数组 {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = 0; i < n; i++) {
            nums1[i + m] = nums2[i];
        }
        Arrays.sort(nums1);
    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m];
        for (int i = 0; i < m; i++) {
            nums3[i] = nums1[i];
        }
        int index1 = 0;
        int index2 = 0;
        int index3 = 0;
        while (index1 < nums1.length) {
            if (nums2[index2] < nums3[index3]) {
                nums1[index1++] = nums2[index2];
                index2++;
            } else {
                nums1[index1++] = nums3[index3];
                index3++;
            }
        }
    }

    public void merge3(int[] nums1, int m, int[] nums2, int n) {
        if (m <= 0 || n <= 0) {
            return;
        }
        for (int i = nums1.length - 1; i >= 0; i--) {
            if (m - 1 < 0 || (n - 1 >= 0 && nums2[n - 1] > nums1[m - 1])) {
                nums1[i] = nums2[n - 1];
                n--;
            } else {
                nums1[i] = nums1[m - 1];
                m--;
            }
        }
    }

    public static void main(String[] args) {
        int[] num = new int[]{1, 2, 3, 0, 0, 0};
        int[] num2 = new int[]{2, 5, 6};
        merge(num, 3, num2, 3);
        System.out.println(num);
    }
}
