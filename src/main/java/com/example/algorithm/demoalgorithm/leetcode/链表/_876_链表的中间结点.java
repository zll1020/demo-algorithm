package com.example.algorithm.demoalgorithm.leetcode.链表;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-19
 * Time: 11:05
 */
public class _876_链表的中间结点 {

    /**
     * 给定一个带有头结点 head 的非空单链表，返回链表的中间结点。
     *
     * 如果有两个中间结点，则返回第二个中间结点。
     * @param head
     * @return
     */
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

}

