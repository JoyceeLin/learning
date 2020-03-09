/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 22:41
 * @Version V1.0
 */
public class 只出现一次的数字 {

    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i == nums.length - 1) {
                break;
            }
            nums[i+1] = nums[i] ^ nums[i+1];
        }
        return nums[nums.length - 1];
    }
}
