/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/24 14:31
 * @Version V1.0
 */
public class 解压缩编码列表 {

    public static void main(String[] args) {
        int out[] = decompressRLElist(new int[]{1, 2, 3, 4});
        for (int o : out) {
            System.out.println(o);
        }
    }

    public static int[] decompressRLElist(int[] nums) {
        if (nums.length % 2 != 0) {
            return new int[]{};
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i = i + 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }
        int[] out = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            out[i] = list.get(i);
        }
        return out;
    }
}
