
package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/6/24 15:30
 * @Version V1.0
 */
public class 杨辉三角 {

    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        int row = 1;
        while (row <= numRows) {
            List<Integer> inList = new ArrayList<>(row);
            inList.add(0, 1);
            for (int i = 1; i < row - 1; i++) {
                inList.add(i, list.get(row - 2).get(i - 1) + list.get(row - 2).get(i));
            }
            if (row > 1) {
                inList.add(row - 1, 1);
            }
            list.add(inList);
            row ++;
        }
        return list;
    }
}
