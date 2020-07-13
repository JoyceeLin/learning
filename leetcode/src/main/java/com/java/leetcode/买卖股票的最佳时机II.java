
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 9:35
 * @Version V1.0
 */
public class 买卖股票的最佳时机II {

    /**
     * 贪心法，判断第二天比第一天是否赚钱，是的话买入，否则不操作
     */
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0) {
            return 0;
        }
        int profile = 0;
        for (int i = 0; i < prices.length; i++) {
            if (i > 0 && prices[i] - prices[i - 1] > 0) {
                profile += prices[i] - prices[i - 1];
            }
        }
        return profile;
    }

    /**
     * 动态规划法，dp[][]数组 保存现金、股票状态值
     */
    public int maxProfit2(int[] prices) {
        if (prices.length < 2) {
            return 0;
        }

        int[][] dp = new int[prices.length][2];
        dp[0][0] = 0;
        dp[0][1] = -prices[0];

        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] + prices[i]);
            dp[i][1] = Math.max(dp[i - 1][0] - prices[i], dp[i - 1][1]);
        }
        return dp[prices.length - 1][0];
    }


}
