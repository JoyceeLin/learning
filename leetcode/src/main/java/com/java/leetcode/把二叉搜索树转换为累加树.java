
package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description: TODO
 * @Author: JingHui Lin
 * @Date: 2020/2/27 13:48
 * @Version V1.0
 */
public class 把二叉搜索树转换为累加树 {

    static int plusNum = 0;
    public static TreeNode convertBST(TreeNode root) {
        test(root);
        return root;
    }

    public TreeNode convertBST2(TreeNode root) {
        if (root != null) {
            convertBST(root.right);
            plusNum += root.val;
            root.val = plusNum;
            convertBST(root.left);
        }
        return root;
    }

    public static int test(TreeNode root) {
        if (root == null) {
            return plusNum;
        } else if (root.left == null && root.right == null) {
            root.val += plusNum;
            plusNum = root.val;
        } else {
            plusNum = test(root.right);
            root.val += plusNum;
            plusNum = root.val;
            test(root.left);
        }
        return plusNum;
    }

    private static List<Integer> inOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            return list;
        }
        List<Integer> list = inOrder(root.left);
        list.addAll(inOrder(root.right));
        list.add(root.val);
        return list;
    }

    private static List<Integer> inReverseOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        if (root.left == null && root.right == null) {
            List<Integer> list = new ArrayList<>();
            list.add(root.val);
            return list;
        }
        List<Integer> list = inOrder(root.right);
        list.add(root.val);
        list.addAll(inOrder(root.left));
        return list;
    }



//    private static List<Integer> inOrder(TreeNode root, List<Integer> inOrderList) {
//
//    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(0);
        TreeNode treeNode2 = new TreeNode(-1);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(-3);
        TreeNode treeNode5 = null;
        TreeNode treeNode6 = null;
        TreeNode treeNode7 = new TreeNode(4);
        treeNode.left = treeNode2;
        treeNode.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        System.out.println(convertBST(treeNode).toString());
    }
}
