package com.example.algorithm.demoalgorithm.array;

import java.util.Arrays;

/**
 * Description: 自定义动态数组
 * User: zhangll
 * Date: 2020-04-18
 * Time: 11:52
 */
public class MyArrayList<E> extends MyAbstractList<E>{

    /**
     * 所有元素
     */
    private E[] elements;

    /**
     * 默认初始长度是10
     */
    private static final int DEFAULT_CAPACITY = 10;


    public MyArrayList() {
        this(DEFAULT_CAPACITY);
    }

    public MyArrayList(int size) {
        // 如果传进来的值小于默认值，使用默认值
        size = size < DEFAULT_CAPACITY ? DEFAULT_CAPACITY : size;
        this.elements = (E[])new Object[size];
    }

    /**
     * 获取某个位置的元素
     * @param index
     * @return
     */
    @Override
    public E get (int index){
        rangeChange(index);
        return elements[index];
    }

    /**
     * 在指定位置替换元素
     * @param index
     * @param element
     * @return 原来的元素
     */
    @Override
    public E set(int index , E element){
        rangeChange(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }


    /**
     * 获取元素的所在位置
     * @param element
     * @return
     */
    @Override
    public int indexOf(E element){
        if (element == null){
            for (int i = 0 ; i< size ;i++){
                if (elements[i] == null){
                    return i;
                }
            }
        }else {
            for (int i = 0 ; i< size ;i++){
                if (element.equals(elements[i])){
                    return i;
                }
            }
        }
        return ELEMENT_NOT_FOUND;
    }


    /**
     * 在指定位置添加元素
     * @param
     * @param element
     */
    @Override
    public void add(int index ,E element){
        rangeCheckForAdd(index);

        // 确保容量
        ensureCapacity(size + 1);

        /*for (int i = size-1 ; i>= index ;i--){
            elements[i+1] = elements[i];
        }*/
        // 移动元素
        System.arraycopy(elements,index,elements,index+1,size-index);
        elements[index] = element;
        size++;

    }

    /**
     * 判断容量及扩容
     * @param capacity
     */
    private void ensureCapacity(int capacity) {
        int oldCapacity = elements.length;
        if (oldCapacity >= capacity){
            return;
        }else {
            // 新容量为旧容量的1.5倍
            int newCapacity = oldCapacity + oldCapacity >> 1;
            // 新建数组，将原有值转移到新数组
            E[] newElements = (E[])new Object[newCapacity];
            for (int i = 0 ;i < size ;i++){
                newElements[i] = elements[i];
            }
            // 指向新数组
            elements = newElements;
        }
    }

    /**
     * 移除某个位置的元素
     * @param index
     * @return 移除的元素
     */
    @Override
    public E remove(int index){
        rangeChange(index);
        E old = elements[index];
        for (int i = index+1 ; i< size ;i++){
            elements[i-1] = elements[i];
        }

        // 缩容
        trim();
        elements[--size] = null;
        return old;
    }

    /**
     * 当存储存储小于总容量的一半时，缩容
     * 扩容的倍数与缩容的倍数不能相等，否则出现复杂度震荡
     */
    private void trim() {
        int capacity = elements.length;
        int newCapacity =  capacity>>1;
        if (size >= newCapacity || capacity <= DEFAULT_CAPACITY){
            return;
        }

        E[] newElements = (E[])new Object[newCapacity];
        for (int i = 0 ;i < size ;i++){
            newElements[i] = elements[i];
        }
        // 指向新数组
        elements = newElements;
    }


    /**
     * 清除数组内元素
     * size=0,别人 get 就拿不到之前的元素了
     * 清掉浪费性能，又要垃圾回收，又需要重新创建
     */
    @Override
    public void clear(){
        for (int i = 0 ;i< size ;i++){
            elements[i] = null;
        }
        size = 0;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("size="+size+", elements=[");
        for (int i = 0;i<size;i++){
            if (i != 0){
                builder.append("," + elements[i] );
            }else {
                builder.append(elements[i]);
            }
        }
        builder.append("]");
        return builder.toString();
    }
}
