
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/11 17:55
 * @Version V1.0
 */
public class 将数组分成和相等的三个部分 {

    /**
     * 划分为三份，sum/3为每份的和
     *
     * 计算有多少个和==sum的次数，大于3的为true
     *
     * 可用双指针法，头找一个，尾部找一个，中间的和应当为sum/3，否则返回false
     */
    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum += A[i];
        }

        sum = sum / 3;
        int tempSum = 0;
        int index = 0;
        for (int i = 0; i < A.length; i++) {
            tempSum += A[i];
            if (tempSum == sum) {
                index++;
                tempSum = 0;
            }
        }
        return index >= 3;
    }

    public static void main(String[] args) {
        System.out.println(canThreePartsEqualSum(new int[]{10,-10,10,-10,10,-10,10,-10}));
    }
}
