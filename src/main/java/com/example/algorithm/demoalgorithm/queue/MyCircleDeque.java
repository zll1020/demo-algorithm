package com.example.algorithm.demoalgorithm.queue;

/**
 * Description: 双端循环队列
 * User: zhangll
 * Date: 2020-08-06
 * Time: 07:33
 */
public class MyCircleDeque<E> {

    //队头位置
    private int front;

    private E[] elements;


    // 头尾部入队

    // 头尾部出队

    /**
     * 获取真实位置
     * @param index
     * @return
     */
    public int index(int index){
        index += front;
        if (index < 0){
            index += elements.length;
        }
        return index % elements.length;
    }
}
