package com.example.algorithm.demoalgorithm.array;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-18
 * Time: 12:10
 */
public class Test {
    public static void main(String[] args) {
        //int[] list = new int[]{11,22,33};

        MyArrayList arrayList = new MyArrayList();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        System.out.println(arrayList.toString());
        arrayList.remove(1);
        System.out.println(arrayList.toString());
        arrayList.add(0,33);
        arrayList.add(arrayList.size(),66);
        System.out.println(arrayList.toString());

    }
}
