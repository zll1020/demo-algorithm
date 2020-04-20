package com.example.algorithm.demoalgorithm.stack;

import com.example.algorithm.demoalgorithm.array.MyArrayList;
import com.example.algorithm.demoalgorithm.array.MyList;

/**
 * Description: 栈
 *
 * 栈的应用
 *  浏览器的前进和后退
 *  软件的撤销和恢复（上一步/下一步）
 * User: zhangll
 * Date: 2020-04-20
 * Time: 01:32
 */
public class MyStack<E>  {

    // 使用组合 代替 继承，屏蔽不需要的方法
    private MyList<E> list = new MyArrayList<>();


    public void push(E element){
        list.add(element);
    }

    public E pop(){
        return list.remove(list.size()-1);
    }

    public E top(){
        return list.get(list.size() -1);
    }

    public void clear(){
        list.clear();
    }

}
