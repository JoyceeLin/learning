
package com.java.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/27 10:09
 * @Version V1.0
 */
public class 合并两个有序链表 {

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        ListNode temp = null;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                if (listNode == null) {
                    listNode = new ListNode(l1.val);
                    temp = listNode;
                } else {
                    temp.next = new ListNode(l1.val);
                    temp = temp.next;
                }
                l1 = l1.next;
            }
            if (l2 != null) {
                if (listNode == null) {
                    listNode = new ListNode(l2.val);
                    temp = listNode;
                } else {
                    temp.next = new ListNode(l2.val);
                    temp = temp.next;
                }
                l2 = l2.next;
            }
        }
        return listNode;
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode listNode = null;
        ListNode temp = l1;
        List<Integer> list = new ArrayList<>();
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        temp = l2;
        while(temp != null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.sort(list);
        for (Integer i : list) {
            if (listNode == null) {
                listNode = new ListNode(i);
                temp = listNode;
            } else {
                temp.next = new ListNode(i);
                temp = temp.next;
            }
        }
        return listNode;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(1);
        ListNode listNode5 = new ListNode(3);
        ListNode listNode6 = new ListNode(4);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode4.next = listNode5;
        listNode5.next = listNode6;
        System.out.println(mergeTwoLists2(listNode1, listNode4));
    }
}
