package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Description: 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 * User: zhangll
 * Date: 2020-08-13
 * Time: 11:43
 */
public class _107_二叉树的层次遍历II {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {

        List<List<Integer>> print = new LinkedList<>();
        LinkedList<TreeNode> list = new LinkedList<>();
        if (root == null){
            return null;
        }
        list.add(root);
        while (!list.isEmpty()){
            int size = list.size();
            List<Integer> order = new LinkedList<>();
            for (int i = 0;i<size;i++){
                TreeNode node = list.pop();
                order.add(node.val);
                if (node.left!=null){
                    list.add(node.left);
                }
                if (node.right != null){
                    list.add(node.right);
                }
            }
            ((LinkedList<List<Integer>>) print).addFirst(order);
        }
        return print;

    }
}
