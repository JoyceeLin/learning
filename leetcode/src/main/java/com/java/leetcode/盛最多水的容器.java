/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/6 15:23
 * @Version V1.0
 */
public class 盛最多水的容器 {
    public int maxArea(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length; i ++) {
            for (int j = i + 1; j < height.length; j++) {
                max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            }
        }
        return max;
    }

    public int maxArea2(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int max = 0;
        while (start < end) {
            if (Math.min(height[start], height[end]) * (end - start) > max) {
                max = Math.min(height[start], height[end]) * (end - start);
            }
            if (height[start] > height[end]) {
                end --;
            } else {
                start++;
            }
        }
        return max;
    }
}
