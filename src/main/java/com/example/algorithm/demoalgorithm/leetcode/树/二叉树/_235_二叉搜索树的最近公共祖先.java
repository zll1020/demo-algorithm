package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

/**
 * Description:
 * 给定一个二叉搜索树, 找到该树中两个指定节点的最近公共祖先。
 *
 * 百度百科中最近公共祖先的定义为：“对于有根树 T 的两个结点 p、q，最近公共祖先表示为一个结点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * 例如，给定如下二叉搜索树:  root = [6,2,8,0,4,7,9,null,null,3,5]
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/lowest-common-ancestor-of-a-binary-search-tree
 *
 * 1 找到两个节点的 path
 *
 * 2 递归（二叉树）
 * findPorQ(root,p,q)
 * 找到p 返回 p
 * 找到q 返回 q
 * 都找到 返回任意一个
 * findPorQ(root.left,p,q)
 * findPorQ(root.right,p,q)
 *
 * 如果 p和q都不等于null 返回 root
 * 二叉搜索树由于有顺序
 * 判断两个节点是否都小于root 向左递归
 * 两个节点都大于root 向右递归
 *
 * 其他情况，返回 root 两个节点在root两边
 *
 * User: zhangll
 * Date: 2020-08-18
 * Time: 19:57
 */
public class _235_二叉搜索树的最近公共祖先 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return null;
    }
}

/*
class 236_二叉树的最近公共祖先 {

public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        return null;
        }
        }*/
