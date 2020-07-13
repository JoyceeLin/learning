
package com.java.leetcode;

import java.util.Stack;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/3/2 20:46
 * @Version V1.0
 */
public class 最小栈 {
    class MinStack{
        private Stack<Integer> data;
        private Stack<Integer> minStack;

        public MinStack() {
            data = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int x) {
            data.push(x);
            if (getMin() >= x) {
                minStack.push(x);
            }
        }

        public void pop() {
            if (data.size() == 0) {
                return;
            }
            if (getMin() == data.pop()) {
                minStack.pop();
            }
        }

        public int top() {
            if (data.size() == 0) {
                return 0;
            }
            return data.peek();
        }

        public int getMin() {
            if (minStack.size() == 0) {
                return Integer.MAX_VALUE;
            }
            return minStack.peek();
        }
    }
}
