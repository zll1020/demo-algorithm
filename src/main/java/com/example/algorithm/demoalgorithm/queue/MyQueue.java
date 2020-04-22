package com.example.algorithm.demoalgorithm.queue;

import com.example.algorithm.demoalgorithm.array.MyList;
import com.example.algorithm.demoalgorithm.list.TwoWayLinkedList;


/**
 * Description:队列
 * User: zhangll
 * Date: 2020-04-20
 * Time: 23:17
 */
public class MyQueue<E> {

    private MyList<E> list = new TwoWayLinkedList();

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public void enQueue(E element){
        list.add(element);
    }

    public E deQueue(){
        return list.remove(0);
    }

    /**
     * 获取队头
     * @return
     */
    public E front(){
        return list.get(0);
    }

    public void clear(){
        list.clear();
    }
}
