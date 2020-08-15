package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

import com.asura.framework.commons.json.Json;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-12
 * Time: 16:42
 */
public class 二叉树的前序遍历 {


    public List<Integer> preorderTraversal(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> print = new LinkedList<>();
        if (root == null) {
            return print;
        }

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pollLast();
            print.add(node.val);
            if (node.right != null) {
                stack.add(node.right);
            }
            if (node.left != null) {
                stack.add(node.left);
            }
        }
        return print;
    }



    private void digui(TreeNode root , List<Integer> list) {
        if (root == null){
            return;
        }
        Integer value = root.val;
        list.add(value);
        digui(root.left,list);
        digui(root.right,list);
    }

    /**
     * 错误结果
     * @param root
     * @return
     */
    private List<Integer> diedai(TreeNode root) {
        LinkedList<TreeNode> stack = new LinkedList<>();
        LinkedList<Integer> print = new LinkedList<>();

        if (root == null) {
            return print;
        }
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pollFirst();
            print.add(node.val);
            if (node.left != null){
                stack.addFirst(node.left);
            }
            if (node.right != null){
                stack.addFirst(node.right);
            }
        }
        return print;
    }


}


class TreeNode{

     int val;
     TreeNode left;
     TreeNode right;
    public TreeNode(int value){
        this.val = value;
    }
}
