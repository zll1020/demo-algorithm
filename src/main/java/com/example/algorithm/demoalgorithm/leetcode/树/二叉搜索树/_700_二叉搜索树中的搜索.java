package com.example.algorithm.demoalgorithm.leetcode.树.二叉搜索树;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-31
 * Time: 21:13
 */
public class _700_二叉搜索树中的搜索 {
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || val == root.val) return root;

        return val < root.val ? searchBST(root.left, val) : searchBST(root.right, val);
    }

    public TreeNode searchBST1(TreeNode root, int val) {
        while (root != null && val != root.val)
            root = val < root.val ? root.left : root.right;
        return root;
    }

}
