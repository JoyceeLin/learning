
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 20:48
 * @Version V1.0
 */
public class 二叉树的最大深度 {

    private int maxDepth = 0;

    public int maxDepth(TreeNode root) {
        //[0,2,4,1,null,3,-1,5,1,null,6,null,8].
        int tempDepth = 0;
        if (root == null) {
            return 0;
        } else if (root.left == null && root.right == null) {
            return 1;
        } else {
            int leftMax = 1 + maxDepth(root.left);
            int rightMax = 1 + maxDepth(root.right);
            tempDepth = leftMax > tempDepth ? leftMax : tempDepth;
            tempDepth = rightMax > tempDepth ? rightMax : tempDepth;
            return tempDepth;
        }
    }

    public int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int righHeight = maxDepth(root.right);
            return java.lang.Math.max(leftHeight, righHeight) + 1;
        }
    }
}
