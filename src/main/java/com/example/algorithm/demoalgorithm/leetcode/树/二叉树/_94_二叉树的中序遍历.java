package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-12
 * Time: 17:16
 */
public class _94_二叉树的中序遍历 {

    public List<Integer> inorderTraversal(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        LinkedList<Integer> print = new LinkedList<>();

        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            print.add(curr.val);
            curr = curr.right;
        }
        return print;
    }
}
