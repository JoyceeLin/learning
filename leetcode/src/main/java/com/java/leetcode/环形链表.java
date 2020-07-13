
package com.java.leetcode;

import com.sun.org.apache.bcel.internal.generic.IF_ACMPEQ;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/5/14 14:13
 * @Version V1.0
 */
public class 环形链表 {

    public static void main(String[] args) {

    }

    /**
     * 解法一 Hash表
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> listNodes = new HashSet<>();
        ListNode temp = head;
        while (temp != null) {
            if (listNodes.contains(temp)) {
                return true;
            }
            listNodes.add(temp);
            temp = temp.next;
        }
        return false;
    }

    /**
     * 解法二 快慢指针
     */
    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode l1 = head.next, l2 = head.next.next;
        while (l2 != null && l2.next != null) {
            if (l1 == l2) {
                return true;
            }
            l1 = l1.next;
            l2 = l2.next.next;
        }
        return false;
    }
}
