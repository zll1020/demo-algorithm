package com.example.algorithm.demoalgorithm.leetcode.链表;

/**
 * Description: https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * User: zhangll
 * Date: 2020-04-18
 * Time: 22:21
 */
public class _237_删除链表中的节点 {

    /**
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
     */
    public static void main(String[] args) {
        deleteNode(new ListNode(1));
    }

    public static void deleteNode(ListNode node) {
        // 未校验末尾节点
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
