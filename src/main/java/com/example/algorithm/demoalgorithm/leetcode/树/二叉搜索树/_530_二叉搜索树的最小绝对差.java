package com.example.algorithm.demoalgorithm.leetcode.树.二叉搜索树;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-31
 * Time: 21:25
 */
public class _530_二叉搜索树的最小绝对差 {
    List<Integer> list = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        inOrderTransfer(root);
        int[] a = new int[list.size()];
        for (int i = 0; i < a.length; i++) {
            a[i] = list.get(i);
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < a.length - 1; i++) {
            min = Math.min(min, a[i + 1] - a[i]);
        }
        return min;
    }

    private void inOrderTransfer(TreeNode root) {
        if (root == null) return;
        inOrderTransfer(root.left);
        list.add(root.val);
        inOrderTransfer(root.right);
    }


    private TreeNode preNode = null;
    private int min = Integer.MAX_VALUE;
    public int getMinimumDifference1(TreeNode root) {
        inOrder(root);
        return min;
    }
    private void inOrder(TreeNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        if (preNode != null) {
            min = Math.min(min, Math.abs(preNode.val - node.val));
        }
        preNode = node;
        inOrder(node.right);
    }
}
