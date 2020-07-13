
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/28 14:20
 * @Version V1.0
 */
public class Nim游戏 {

    public boolean canWinNim(int n) {
        return n <= 3 || n % 3 != 1;
    }
}
