
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/24 14:54
 * @Version V1.0
 */
public class 猜数字 {
    public static void main(String[] args) {

    }

    public static int game(int[] guess, int[] answer) {
        if (guess.length != answer.length) {
            return 0;
        }
        int success = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                success++;
            }
        }
        return success;
    }
}
