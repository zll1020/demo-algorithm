package com.example.algorithm.demoalgorithm.leetcode.队列;

import java.util.Stack;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-20
 * Time: 23:37
 */
public class _232_用栈实现队列 {

    private Stack<Integer> inputStack;

    private Stack<Integer> outputStack;

    /**
     * 使用栈实现队列的下列操作：
     *
     * push(x) -- 将一个元素放入队列的尾部。
     * pop() -- 从队列首部移除元素。
     * peek() -- 返回队列首部的元素。
     * empty() -- 返回队列是否为空。
     */

    /** Initialize your data structure here. */
    public _232_用栈实现队列() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        while (!outputStack.isEmpty()){
            inputStack.push(outputStack.pop());
        }

        inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        while (!inputStack.isEmpty()){
            outputStack.push(inputStack.pop());
        }
        return outputStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        while (!inputStack.isEmpty()){
            outputStack.push(inputStack.pop());
        }
        return outputStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
