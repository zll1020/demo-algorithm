package com.example.algorithm.demoalgorithm.leetcode.链表;

/**
 * Description:https://leetcode-cn.com/problems/reverse-linked-list/
 * User: zhangll
 * Date: 2020-04-18
 * Time: 22:28
 */
public class _206_反转链表 {

    /**
     * 反转一个单链表。
     *
     * 示例:
     *
     * 输入: 1->2->3->4->5->NULL
     * 输出: 5->4->3->2->1->NULL
     * @param args
     */
    public static void main(String[] args) {
        reverseList(new ListNode(1));
    }

    // 递归
    public static ListNode reverseList(ListNode head) {
        if (head == null ||head.next == null ){
            return head;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    // 非递归
    public static ListNode reverseList2(ListNode head) {
        ListNode newHead = null;
        while (head != null){
            ListNode tmp = head.next;
            head.next = newHead;
            newHead = head;
            head = tmp;
        }
        return newHead;
    }


}
