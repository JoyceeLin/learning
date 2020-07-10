/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/10 10:16
 * @Version V1.0
 */
public class 连续子数组的最大和 {

    public static int maxSubArray(int[] nums) {
        int prevIndexMax = nums[0];
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            prevIndexMax = Math.max(nums[i], prevIndexMax + nums[i]);
            max = Math.max(prevIndexMax, max);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}
