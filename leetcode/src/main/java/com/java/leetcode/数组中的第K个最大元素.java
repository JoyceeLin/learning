/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 13:38
 * @Version V1.0
 */
public class 数组中的第K个最大元素 {

    /**
     * 1 排序取数组中 第k大的值
     */
    public static int findKthLargest(Integer[] nums, int k) {
        Arrays.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        return nums[nums.length - 1 - k];
    }

    /**
     * 2 最小堆，取第一位
     */
    public static int findKthLargest2(int[] nums, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.comparingInt(o -> o));
        for (int n : nums) {
            // 入列
            heap.add(n);
            if (heap.size() > k) {
                // 出列
                heap.poll();
            }
        }
        return heap.poll() != null ? heap.poll() : 0;
    }

    /**
     * 3 快速选择法
     * 随机选取一个值，遍历数组进行划分，大于该值在右边，小于该值在左边，得出n-k在左边还是右边，递归遍历，找到第k大的值为止
     */

    public static void main(String[] args) {
        Integer[] nums = new Integer[5];
        nums[0] = 1;
        nums[1] = 3;
        nums[2] = 5;
        nums[3] = 2;
        nums[4] = 1;
        System.out.println(findKthLargest(nums, 3));
    }
}
