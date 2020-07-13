
package com.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/3 21:26
 * @Version V1.0
 */
public class 爬楼梯 {

    Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        if (map.get(n) != null) {
            return map.get(n);
        }
        int a = climbStairs(n - 1);
        int b = climbStairs(n - 2);
        map.put(n-1, a);
        map.put(n-2, b);
        return a + b;
    }

    public int climbStairs2(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return n;
        }
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }
        return dp[dp.length - 1];
    }
}
