/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/27 9:43
 * @Version V1.0
 */
public class 多数元素 {

    /**
     * Hash表先存放每个元素的次数，获取最大次数的元素
     * 时间复杂度O(n)  --> 只迭代了一次nums[]
     *
     * 其它算法：
     * 1 可用排序排好，取num[n/2]位置的数值，因为多数元素是大于数组中的n/2的
     * 2 Boyer-Moore 投票算法，每个数值投自己一票 + 1，其它数值投 - 1 票，最后剩余的数值为众数
     */
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(nums.length);
        for (int n : nums) {
            if (map.get(n) != null) {
                // 可在此处判断 map.get(n) + 1 是否大于 n/2,是的话直接返回
                map.put(n, map.get(n) + 1);
            } else {
                map.put(n, 1);
            }
        }
        int maxTimes = 0;
        int maxTimesElement = -1;
        for (Integer m : map.keySet()) {
            if (map.get(m) > maxTimes && map.get(m) > nums.length / 2) {
                maxTimes = map.get(m);
                maxTimesElement = m;
            }
        }
        return maxTimesElement;
    }
}
