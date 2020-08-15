package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-12
 * Time: 17:10
 */
public class _226_翻转二叉树 {

    public TreeNode invertTree(TreeNode root) {
        if (root == null){
            return null;
        }
        TreeNode left = root.left;
        root.left = root.right;
        root.right = left;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

}

