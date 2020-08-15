package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

import java.util.*;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-13
 * Time: 11:54
 */
public class _662_二叉树最大宽度 {

    int ans;
    Map<Integer, Integer> left;

    public int widthOfBinaryTree(TreeNode root) {
        ans = 0;
        left = new HashMap();
        dfs(root, 0, 0);
        return ans;
    }
    // 按照深度优先的顺序，我们记录每个节点的 position 。对于每一个深度，第一个到达的位置会被记录在 left[depth] 中。
    // 然后对于每一个节点，它对应这一层的可能宽度是 pos - left[depth] + 1 。我们将每一层这些可能的宽度去一个最大值就是答案。
    public void dfs(TreeNode root, int depth, int pos) {
        if (root == null) {
            return;
        }
        // lambda过不来，暂时注释
        //left.computeIfAbsent(depth, x-> pos);
        ans = Math.max(ans, pos - left.get(depth) + 1);
        dfs(root.left, depth + 1, 2 * pos);
        dfs(root.right, depth + 1, 2 * pos + 1);
    }

    public int widthOfBinaryTree1(TreeNode root) {
        if(root == null) {
            return 0;
        }
        Queue<TreeNode> q = new LinkedList<>();
        LinkedList<Integer> list = new LinkedList<>();
        q.offer(root);
        list.add(1);
        int res = 1;
        while (!q.isEmpty()) {
            int count = q.size();
            for(int i =count; i> 0; i--) {
                TreeNode cur = q.poll();
                Integer curIndex = list.removeFirst();
                if(cur.left != null) {
                    q.offer(cur.left);
                    list.add(curIndex * 2);
                }
                if(cur.right != null) {
                    q.offer(cur.right);
                    list.add(curIndex * 2 +1);
                }
            }
            // list 中 size 为 1 的情况下，宽度也为 1，没有必要计算。
            if(list.size() >= 2) {
                res = Math.max(res, list.getLast() - list.getFirst() + 1);
            }
        }

        return res;
    }


}
