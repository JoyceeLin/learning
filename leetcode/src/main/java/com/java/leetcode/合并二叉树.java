/*
 * Copyright (C), 2005-2020, 深圳市珍爱网信息技术有限公司
 */
package com.java.leetcode;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/26 17:32
 * @Version V1.0
 */
public class 合并二叉树 {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode treeNode;
        if (t1 != null && t2 != null) {
            treeNode = new TreeNode(t1.val + t2.val);
            treeNode.left = mergeTrees(t1.left, t2.left);
            treeNode.right = mergeTrees(t1.right, t2.right);
        } else if (t1 != null) {
            treeNode = new TreeNode(t1.val);
            treeNode.left = mergeTrees(t1.left, null);
            treeNode.right = mergeTrees(t1.right, null);
        } else if (t2 != null) {
            treeNode = new TreeNode(t2.val);
            treeNode.left = mergeTrees(null, t2.left);
            treeNode.right = mergeTrees(null, t2.right);
        } else {
            treeNode = null;
        }
        return treeNode;
    }
}


