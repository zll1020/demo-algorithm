package com.example.algorithm.demoalgorithm.leetcode.树.二叉搜索树;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-31
 * Time: 21:15
 */
public class _701_二叉搜索树中的插入操作 {

    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);

        // insert into the right subtree
        if (val > root.val) root.right = insertIntoBST(root.right, val);
            // insert into the left subtree
        else root.left = insertIntoBST(root.left, val);
        return root;
    }

    public TreeNode insertIntoBST1(TreeNode root, int val) {
        TreeNode node = root;
        while (node != null) {
            // insert into the right subtree
            if (val > node.val) {
                // insert right now
                if (node.right == null) {
                    node.right = new TreeNode(val);
                    return root;
                }
                else node = node.right;
            }
            // insert into the left subtree
            else {
                // insert right now
                if (node.left == null) {
                    node.left = new TreeNode(val);
                    return root;
                }
                else node = node.left;
            }
        }
        return new TreeNode(val);
    }

}
