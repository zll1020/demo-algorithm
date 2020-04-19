package com.example.algorithm.demoalgorithm.leetcode.链表;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-19
 * Time: 10:26
 */
public class _203_移除链表元素 {

    /**
     * 删除链表中等于给定值 val 的所有节点。
     *
     * 示例:
     *
     * 输入: 1->2->6->3->4->5->6, val = 6
     * 输出: 1->2->3->4->5
     * @param head
     * @param val
     * @return
     */
    public ListNode removeElements(ListNode head, int val) {

        // 虚拟头节点
        ListNode newHead = new ListNode(-1);
        newHead.next = head;

        ListNode left = newHead;
        while (left.next != null){
            if (left.next.val == val){
                left.next = left.next.next;
            }else {
                left = left.next;
            }
        }
        return newHead.next;
    }

}
