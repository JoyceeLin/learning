/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/27 10:59
 * @Version V1.0
 */
public class 移动零 {

    public void moveZeroes(int[] nums) {
        int zeroIndex = -1;
        int length = nums.length;
//        int temp;
//        for (int i = 0; i < length; i++) {
//            if (nums[i] == 0) {
//                zeroIndex = i;
//            } else {
//                if (zeroIndex >= 0) {
//                    temp = nums[zeroIndex];
//                    nums[zeroIndex] = nums[i];
//                    nums[i] = temp;
//                    zeroIndex = i;
//                }
//            }
//        }

        for (int i = 0; i < length; i++) {
            if (nums[i] == 0 && zeroIndex < 0) {
                zeroIndex = i;
            } else if (nums[i] == 0 && zeroIndex >= 0) {
                int notZeroIndex = nextNotZeroIndex(nums, i);
                if (notZeroIndex < 0) {
                    break;
                } else {
                    swap(nums, zeroIndex, notZeroIndex);
                    zeroIndex = i;
                }
            } else {
                if (zeroIndex >= 0) {
                    swap(nums, zeroIndex, i);
                    zeroIndex = i;
                }
            }
        }
    }

    private int nextNotZeroIndex(int[] nums, int i) {
        for (int j = i + 1; j < nums.length; j++) {
            if (nums[j] != 0) {
                return j;
            }
        }
        return -1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp;
        temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
