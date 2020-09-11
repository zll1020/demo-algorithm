package com.example.algorithm.demoalgorithm.leetcode.树.二叉搜索树;

import java.util.ArrayList;

/**
 * Description:
 * User: zhangll
 * Date: 2020-09-09
 * Time: 09:39
 */
public class _230_二叉搜索树中第K小的元素 {
    private class Solution {
        public ArrayList<Integer> inorder(TreeNode root, ArrayList<Integer> arr) {
            if (root == null) return arr;
            inorder(root.left, arr);
            arr.add(root.val);
            inorder(root.right, arr);
            return arr;
        }

        public int kthSmallest(TreeNode root, int k) {
            ArrayList<Integer> nums = inorder(root, new ArrayList<Integer>());
            return nums.get(k - 1);
        }
    }

}
