
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/24 14:27
 * @Version V1.0
 */
public class 将数字变成0的操作次数 {

    public static void main(String[] args) {
        System.out.println(numberOfSteps(8));
        System.out.println(numberOfSteps(14));
        System.out.println(numberOfSteps(123));
    }

    private static int numberOfSteps (int num) {
        int i = 0;
        while(num > 0) {
            num = num % 2 == 0 ? num / 2 : num -1;
            i++;
        }
        return i;
    }
}
