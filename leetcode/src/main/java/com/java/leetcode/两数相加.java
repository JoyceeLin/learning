
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/4 18:25
 * @Version V1.0
 */
public class 两数相加 {

    /**
     * 每个节点进行相加，用一个参数标识是否需要进位
     */
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, curr = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            curr.next = new ListNode(sum % 10);
            curr = curr.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(2);
        ListNode listNode11 = new ListNode(4);
        ListNode listNode12 = new ListNode(3);
        ListNode listNode2 = new ListNode(5);
        ListNode listNode21 = new ListNode(6);
        ListNode listNode22 = new ListNode(4);

        listNode1.next = listNode11;
        listNode11.next = listNode12;
        listNode2.next = listNode21;
        listNode21.next = listNode22;
        System.out.println(addTwoNumbers(listNode1, listNode2).toString());
    }

}
