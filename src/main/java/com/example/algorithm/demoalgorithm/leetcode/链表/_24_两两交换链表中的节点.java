package com.example.algorithm.demoalgorithm.leetcode.链表;

/**
 * Description:
 * User: zhangll
 * Date: 2020-08-17
 * Time: 19:36
 */
public class _24_两两交换链表中的节点 {

    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null){
            return head;
        }
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }

    public ListNode swapPairs2(ListNode head) {

        ListNode newNode = new ListNode(0);
        newNode.next = head;
        ListNode temp = newNode;
        while (newNode.next != null || newNode.next != null){
            ListNode start = newNode.next;
            ListNode end = newNode.next.next;
            temp = end;
            start.next = end.next;
            end.next = start;
            temp = start;
        }
        return newNode.next;
    }

}
