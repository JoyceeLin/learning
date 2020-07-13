
package com.java.leetcode;

import java.util.Stack;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 21:34
 * @Version V1.0
 */
public class 反转链表 {

    public static ListNode reverseList(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while(head != null) {
            stack.push(head.val);
            head = head.next;
        }
        ListNode listNode = null;
        ListNode temp = null;
        while (!stack.empty()) {
            if (listNode == null) {
                listNode = new ListNode(stack.pop());
                temp = listNode;
            } else {
                temp.next = new ListNode(stack.pop());
                temp = temp.next;
            }
        }
        return listNode;
    }

    static ListNode listNode = null;
    static ListNode temp = listNode;
    public static ListNode reverseList2(ListNode head) {
        reverse(head);
        return listNode;
    }

    public static ListNode reverse(ListNode head) {
        if (head.next != null) {
            temp = reverse(head.next);
            temp.next = new ListNode(head.val);
            temp = temp.next;
            return temp;
        } else {
            listNode = head;
            return listNode;
        }
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(3);
        ListNode listNode4 = new ListNode(4);
        ListNode listNode5 = new ListNode(5);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        listNode3.next = listNode4;
        listNode4.next = listNode5;
        ListNode listNode = reverseList2(listNode1);
        System.out.println(listNode.toString());
    }
}
