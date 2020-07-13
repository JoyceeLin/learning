
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 22:27
 * @Version V1.0
 */
public class 螺旋矩阵II {
    public static int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int i = 1;
        int t = 0;
        int b = n - 1;
        int r = n - 1;
        int l = 0;
        while (i <= n * n) {
            for (int z = l; z <= r; z++) {
                a[t][z] = i++;
            }
            t++;
            for (int z = t; z <= b; z++) {
                a[z][r] = i++;
            }
            r--;
            for (int z = r; z >= l; z--) {
                a[b][z] = i++;
            }
            b--;
            for (int z = b; z >= t; z--) {
                a[z][l] = i++;
            }
            l++;
        }
        return a;
    }

    public static void main(String[] args) {
        generateMatrix(3);
    }

}
