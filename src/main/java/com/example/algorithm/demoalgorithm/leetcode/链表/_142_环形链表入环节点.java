package com.example.algorithm.demoalgorithm.leetcode.链表;

/**
 * Description: 入环的位置等于相遇的节点到 入环的位置的
 * 一个节点从头开始走，一个节点从相遇节点开始走
 * User: zhangll
 * Date: 2020-08-17
 * Time: 20:14
 */
public class _142_环形链表入环节点 {

    public ListNode detectCycle(ListNode head) {

        if (head == null || head.next == null){
            return null;
        }
        ListNode slow = head;
        ListNode fast = head.next;
        while (fast != null && fast.next != null){
            if (slow == fast){
                //有环
                slow = slow.next;
                while (head != slow){
                    head = head.next;
                    slow = slow.next;
                }
                return head;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return null;
    }

}
