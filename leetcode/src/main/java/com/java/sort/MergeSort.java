
package com.java.sort;

import java.util.Arrays;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/9 15:42
 * @Version V1.0
 */
public class MergeSort {

    /**
     * 归并排序
     *
     * 用两个数组保存两组数据，
     * 拿出arr1[0]和arr2[0]进行比较，显然是arr2[0]比较小，因此将arr2[0]放入大数组中，同时arr2指针往后一格
     * 依次遍历
     *
     * 使用的额外空间
     */
    public static int[] mergeSort(int[] m) {
        int[] n = Arrays.copyOf(m, m.length);
        // 递归 n 数组左边元素和右边元素
        // 分别保存在两个数组中，双指针分别指向a数组和b数组的开头，
        // 获取两数组最小的元素（递归到最后会有2个数进行判断），放在另一个数组中，对应的指针后移，依次遍历完，填充新数组
        return  n;
    }
}
