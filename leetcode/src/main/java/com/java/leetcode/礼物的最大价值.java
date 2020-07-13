
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/10 11:50
 * @Version V1.0
 */
public class 礼物的最大价值 {

    public static int maxValue(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (j - 1 < 0 && i - 1 < 0) {
                    dp[i][j] = grid[i][j];
                } else if (j - 1 < 0) {
                    dp[i][j] = grid[i][j] + dp[i - 1][j];
                } else if (i - 1 < 0) {
                    dp[i][j] = grid[i][j] + dp[i][j - 1];
                } else {
                    dp[i][j] =  grid[i][j] + Math.max(dp[i][j - 1], dp[i - 1][j]);
                }
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        System.out.println(maxValue(new int[][]{{1,3,1},{1,5,1},{4,2,1}}));
    }
}
