
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 20:35
 * @Version V1.0
 */
public class 翻转二叉树 {

    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if (root != null) {
            if (root.left != null || root.right != null) {
                temp = root.left;
                root.left = root.right;
                root.right = temp;
            }
            invertTree(root.left);
            invertTree(root.right);
        }
        return root;
    }
}
