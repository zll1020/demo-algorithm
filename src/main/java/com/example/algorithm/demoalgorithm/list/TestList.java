package com.example.algorithm.demoalgorithm.list;

import com.example.algorithm.demoalgorithm.array.MyList;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-18
 * Time: 22:08
 */
public class TestList {
    public static void main(String[] args) {
        MyList<Integer> list = new MyLinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list.toString());
        list.remove(2);
        System.out.println(list.toString());
        list.add(2,40);
        System.out.println(list.toString());
    }
}
