package com.example.algorithm.demoalgorithm.leetcode.树.N叉树;

import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-13
 * Time: 12:47
 */
public class _559_N叉树的最大深度 {

    public int maxDepth(Node root) {
        if (root == null){
            return 0;
        }
        List<Node> children = root.children;

        List<Integer> depths = new LinkedList<>();
        if (!children.isEmpty()){
            for (int i = 0 ; i< children.size();i++){
                depths.add(maxDepth(children.get(i)));
            }
        }
        return 0;
    }
}
