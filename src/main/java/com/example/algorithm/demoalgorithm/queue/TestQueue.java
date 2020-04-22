package com.example.algorithm.demoalgorithm.queue;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-20
 * Time: 23:18
 */
public class TestQueue {

    public static void main(String[] args) {
        MyQueue<Integer> myQueue = new MyQueue();
        myQueue.enQueue(1);
        myQueue.enQueue(2);
        myQueue.enQueue(3);
        while (!myQueue.isEmpty()) {
            System.out.println(myQueue.deQueue());
        }
    }
}
