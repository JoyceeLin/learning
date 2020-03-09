/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/24 15:05
 * @Version V1.0
 */
public class 二进制链表转整数 {

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(0);
        listNode.next.next = new ListNode(1);
        System.out.println(getDecimalValue(listNode));
    }

    public static int getDecimalValue(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while (temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        if (list.size() == 0) {
            return 0;
        }
        int value = 0;
        int decimalValue = 1;
        for (int i = list.size() - 1; i >= 0; i--) {
            value += list.get(i) * decimalValue;
            decimalValue *= 2;
        }
        return value;
    }
}
