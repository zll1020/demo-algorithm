package com.example.algorithm.demoalgorithm.leetcode.树.平衡二叉树;

import javax.swing.tree.TreeNode;

/**
 * Description:
 * User: zhangll
 * Date: 2020-09-08
 * Time: 21:02
 */
public class _110_平衡二叉树 {

    // 自底向上的递归
    private class Solution {
        public boolean isBalanced(TreeNode root) {
            return height(root) >= 0;
        }

        public int height(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);
            if (leftHeight == -1 || rightHeight == -1 || Math.abs(leftHeight - rightHeight) > 1) {
                return -1;
            } else {
                return Math.max(leftHeight, rightHeight) + 1;
            }
        }
    }

}
