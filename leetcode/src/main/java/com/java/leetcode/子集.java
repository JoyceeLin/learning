
package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/4 14:22
 * @Version V1.0
 */
public class 子集 {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> list = subsets(nums);
        for (List<Integer> list1 : list) {
            System.out.print("[");
            for (Integer l : list1) {
                System.out.print(l + ",");
            }
            System.out.print("]");
            System.out.println();
        }
    }

    /**
     * 给定一组不含重复元素的整数数组 nums，返回该数组所有可能的子集（幂集）。
     */
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> sub = new ArrayList<>();
        backtrack(0, nums, list, sub);
        return list;
    }

    public static void backtrack(int j, int[] nums, List<List<Integer>> list, List<Integer> sub) {
        list.add(new ArrayList<>(sub));
        for (int i = j; i < nums.length; i++) {
            sub.add(nums[i]);
            backtrack(i + 1, nums, list, sub);
            sub.remove(sub.size() - 1);
        }
    }
}
