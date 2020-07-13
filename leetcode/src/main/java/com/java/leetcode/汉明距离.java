
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 18:27
 * @Version V1.0
 */
public class 汉明距离 {
    public int hammingDistance(int x, int y) {
        StringBuilder xx = new StringBuilder();
        StringBuilder yy = new StringBuilder();
        while (x / 2 != 0 || x % 2 != 0) {
            xx.append(x % 2);
            x /= 2;
        }

        while (y / 2 != 0 || y % 2 != 0) {
            yy.append(y % 2);
            y /= 2;
        }
        int lengthDiff = xx.length() - yy.length();
        if (lengthDiff > 0) {
            for (int i = 0; i < lengthDiff; i++) {
                yy.append("0");
            }
        } else if (lengthDiff < 0){
            for (int i = 0; i < -lengthDiff; i++) {
                xx.append("0");
            }
        }
        char[] xxx = xx.toString().toCharArray();
        char[] yyy = yy.toString().toCharArray();
        int max = Math.max(xxx.length, yyy.length);
        int diff = 0;
        for (int i = 0; i < max; i++) {
            if (xxx[i] != yyy[i]) {
                diff++;
            }
        }
        return diff;
    }

    /**
     * 取异或值
     *
     * 9：  1 0 0 1
     * 7：  0 1 1 1
     * 9^7  1 1 1 0
     */
    public int bestSolution(int x, int y) {
        int a = x ^ y;
        int diff = 0;
        // 计算位数为1的个数
        while (a != 0) {
            diff++;
            a &= a - 1;
        }
        return diff;
    }
}
