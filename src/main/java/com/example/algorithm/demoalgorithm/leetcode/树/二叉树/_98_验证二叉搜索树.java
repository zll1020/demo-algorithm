package com.example.algorithm.demoalgorithm.leetcode.树.二叉树;

/**
 * Description: 给定一个二叉树，判断其是否是一个有效的二叉搜索树。
 *
 * 假设一个二叉搜索树具有如下特征：
 *
 * 节点的左子树只包含小于当前节点的数。
 * 节点的右子树只包含大于当前节点的数。
 * 所有左子树和右子树自身必须也是二叉搜索树。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/validate-binary-search-tree
 *
 * 1 中序遍历
 * 2 递归 找左子树的最大值，又子树的最小值
 *  左子树的最大值 < root < 右子树的最小值
 * User: zhangll
 * Date: 2020-08-18
 * Time: 19:44
 */
public class _98_验证二叉搜索树 {
}
