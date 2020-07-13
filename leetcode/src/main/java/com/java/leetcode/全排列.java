
package com.java.leetcode;

import java.util.*;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/4 13:53
 * @Version V1.0
 */
public class 全排列 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new LinkedList<>();
        ArrayList<Integer> nums_list = new ArrayList<>();
        for (int num : nums) {
            nums_list.add(num);
        }
        int n = nums.length;
        backtrack(n, nums_list, output, 0);
        return output;
    }

    public void backtrack(int n, ArrayList<Integer> nums, List<List<Integer>> output, int first) {
        if (first == n) {
            output.add(new ArrayList<>(nums));
        }
        for (int i = first; i < n; i++) {
            Collections.swap(nums, first, i);
            backtrack(n, nums, output, first + 1);
            Collections.swap(nums, first, i);
        }
    }


}
