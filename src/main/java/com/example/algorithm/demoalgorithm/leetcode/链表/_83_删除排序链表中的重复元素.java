package com.example.algorithm.demoalgorithm.leetcode.链表;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-19
 * Time: 11:01
 */
public class _83_删除排序链表中的重复元素 {

    /**
     * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
     *
     * 示例 1:
     *
     * 输入: 1->1->2
     * 输出: 1->2
     * @param head
     * @return
     */
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode left = head;
        while (left.next != null){
            if (left.val == left.next.val){
                left.next = left.next.next;
            }else {
                left = left.next;
            }
        }
        return head;
    }
}
