package com.example.algorithm.demoalgorithm.leetcode.树.N叉树;

import java.util.List;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-13
 * Time: 12:45
 */
public class _589_N叉树的前序遍历 {

    public List<Integer> preorder(Node root) {
        return null;
    }

}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
