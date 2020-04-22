package com.example.algorithm.demoalgorithm.queue;

import com.example.algorithm.demoalgorithm.array.MyList;
import com.example.algorithm.demoalgorithm.list.TwoWayLinkedList;

/**
 * Description:双端队列
 * User: zhangll
 * Date: 2020-04-20
 * Time: 23:52
 */
public class MyDeque<E> {

    private MyList<E> list = new TwoWayLinkedList();

    public int size(){
        return list.size();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    /**
     * 队尾增加
     * @param element
     */
    public void enQueueRear(E element){
        list.add(element);
    }

    /**
     * 队头增加
     * @param element
     */
    public void enQueueFront(E element){
        list.add(0,element);
    }

    /**
     * 队尾删除
     * @return
     */
    public E deQueueRear(){
        return list.remove(list.size()-1);
    }

    /**
     * 队头删除
     * @return
     */
    public E deQueueFront(){
        return list.remove(0);
    }


    /**
     * 获取队尾
     * @return
     */
    public E rear(){
        return list.get(list.size()-1);
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

