
package com.java.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 21:11
 * @Version V1.0
 */
public class 相交链表 {

    /**
     * 1 hashset 保存，如重复则返回
     * 2 暴力法，两个for循环判断相等节点 n^2
     * 3 headA遍历完遍历headB，headB遍历完遍历headA，两个指针最终相交于一点，2n
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        while (temp != null) {
            ListNode node = temp;
            set.add(node);
            temp = temp.next;
        }
        temp = headB;
        while (temp != null) {
            if (set.contains(temp)) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

}
