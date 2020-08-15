package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-13
 * Time: 11:36
 */
public class _104_二叉树的最大深度 {

    // 层序遍历，多少层多高
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        List<TreeNode> nodes = new LinkedList<>();
        nodes.add(root);
        int height = 0;
        while (!nodes.isEmpty()) {
            height ++;
            int size = nodes.size();
            for (int i = 0; i < size; i++) {
                TreeNode remove = nodes.remove(0);
                if (remove.left != null) {
                    nodes.add(remove.left);
                }
                if (remove.right != null) {
                    nodes.add(remove.right);
                }
            }
        }
        return height;
    }

    /**
     * 递归
     * @param root
     * @return
     */
    public int maxDepth1(TreeNode root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = maxDepth(root.left);
            int rightHeight = maxDepth(root.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

}
