
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/3 21:00
 * @Version V1.0
 */
public class 删除排序数组中的重复项 {

    public int removeDuplicates(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int sameTimes = 0;
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if ((nums[i] ^ nums[i - 1]) == 0) {
                sameTimes++;
                removeIndex(i, nums);
                i--;
                n--;
            }
        }
        return nums.length - sameTimes;
    }

    public void removeIndex(int i, int[] nums) {
        for (; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
            nums[i + 1] = -Integer.MAX_VALUE;
        }
    }
}
