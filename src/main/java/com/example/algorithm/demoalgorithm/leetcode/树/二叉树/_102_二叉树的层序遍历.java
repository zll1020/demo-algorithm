package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-12
 * Time: 17:45
 */
public class _102_二叉树的层序遍历 {

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> print = new LinkedList<>();
        if (root == null) {
            return print;
        }
        LinkedList<Integer> printOrder = new LinkedList<>();
        printOrder.add(root.val);
        print.add(printOrder);
        LinkedList<TreeNode> printOrderNode = new LinkedList<>();
        printOrderNode.add(root);

        while (printOrderNode != null &&printOrderNode.size() != 0) {
            LinkedList<TreeNode> printOrderNodeCopy = printOrderNode;
            printOrder = new LinkedList<>();
            printOrderNode = new LinkedList<>();
            while (printOrderNodeCopy != null && printOrderNodeCopy.size() !=0 ) {
                TreeNode node = printOrderNodeCopy.pop();
                if (node.left != null) {
                    printOrder.add(node.left.val);
                    printOrderNode.add(node.left);
                }
                if (node.right != null) {
                    printOrder.add(node.right.val);
                    printOrderNode.add(node.right);
                }
            }
            if (printOrder.size() != 0) {
                print.add(printOrder);
            }
        }
        return print;
    }

    /**
     * 可改为LinkedList
     * @param root
     * @return
     */
    public List<List<Integer>> levelOrder1(TreeNode root) {
        //按层遍历即可
        //1.
        List<List<Integer>> lists = new ArrayList<>();
        if (root == null) {
            return lists;
        }
        //2.
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        while (!nodes.isEmpty()) {
            int size = nodes.size();
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                list.add(remove.val);
                if (remove.left != null) {
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    nodes.add(remove.right);
                }
            }
            lists.add(list);
        }
        return lists;
    }

}
