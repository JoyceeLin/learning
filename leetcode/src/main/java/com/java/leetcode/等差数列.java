/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/5/18 16:58
 * @Version V1.0
 */
public class 等差数列 {

    /**
     * A = [1, 2, 3, 4]
     *
     * 返回: 3, A 中有三个子等差数组: [1, 2, 3], [2, 3, 4] 以及自身 [1, 2, 3, 4]。
     */

    public static void main(String[] args) {

    }

    public static int numberOfArithmeticSlices(int[] A) {
        int diff = A[1] - A[0];
        for (int i = 2; i < A.length; i++) {
            if (A[i] - A[i - 1] != diff) {
                return 0;
            }
        }
        return 1;
    }
}
