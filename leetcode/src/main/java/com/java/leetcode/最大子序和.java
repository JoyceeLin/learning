/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 22:21
 * @Version V1.0
 */
public class 最大子序和 {
    public static int maxSubArray(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return Math.max(nums[0], 0);
        }

        int max = nums[0];
        int dp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            dp = Math.max(nums[i], dp + nums[i]);
            max = Math.max(dp, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] a = new int[]{6, -1, 2};
        System.out.println(maxSubArray(a));
    }
}
