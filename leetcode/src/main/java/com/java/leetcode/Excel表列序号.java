
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/6/24 15:22
 * @Version V1.0
 */
public class Excel表列序号 {

    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int sum = 0;
        int mul = 1;
        for (int i = c.length - 1; i > 0; i--) {
            sum += (c[i] - 64) * mul;
            mul *= 26;
        }
        return sum;
    }
}
