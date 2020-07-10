/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/10 10:40
 * @Version V1.0
 */
public class 使用最小花费爬楼梯 {

    public static int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 1];
        for (int i = 0; i <= cost.length; i++) {
            if (i - 1 < 0 || i - 2 < 0) {
                dp[i] = cost[i];
            } else if (i == cost.length){
                dp[i] = Math.min(dp[i - 1], dp[i - 2]);
            } else {
                dp[i] = cost[i] + Math.min(dp[i - 1], dp[i - 2]);
            }
        }
        return dp[dp.length - 1];
    }

    public static int minCostClimbingStairs2(int[] cost) {
        return minCostClimbingStairs(cost, cost.length);
    }

    public static int minCostClimbingStairs(int[] cost, int i) {
        if (i < 0) {
            return 0;
        }
        if (i <= 1) {
            return cost[i];
        }
        if (i > cost.length - 1) {
            return Math.min(minCostClimbingStairs(cost, i - 1), minCostClimbingStairs(cost, i - 2));
        }
        return cost[i] + Math.min(minCostClimbingStairs(cost, i - 1), minCostClimbingStairs(cost, i - 2));
    }

    public static void main(String[] args) {
        System.out.println(minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        System.out.println(minCostClimbingStairs(new int[]{0, 1, 2, 2}));
    }
}
