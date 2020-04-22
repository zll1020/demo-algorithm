package com.example.algorithm.demoalgorithm.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Description:循环队列
 * User: zhangll
 * Date: 2020-04-21
 * Time: 00:03
 */
public class MyCircleQueue<E> {

    private int index;

    private int size;

    private E[] elements;

    public MyCircleQueue() {
        elements = (E[]) new Object[10];
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void enQueue(E element){
        elements[(size + index) % elements.length] = element;
        size++;
    }

    public E deQueue(){
        E old = elements[index];
        elements[index] = null;
        index = (index + 1) % elements.length ;
        size--;
        return old;
    }

    /**
     * 获取队头
     * @return
     */
    public E front(){
        return elements[index];
    }

    public void clear(){
        elements = null;
        size = 0;
    }
}
