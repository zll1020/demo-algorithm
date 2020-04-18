package com.example.algorithm.demoalgorithm.array;

import java.util.Arrays;

/**
 * Description: 自定义动态数组
 * User: zhangll
 * Date: 2020-04-18
 * Time: 11:52
 */
public class MyArrayList<E> {

    /**
     * 元素的数量
     */
    private int size;

    /**
     * 所有元素
     */
    private E[] elements;

    /**
     * 默认初始长度是10
     */
    private static final int DEFAULT_CAPACITY = 10;

    private static final int ELEMENT_NOT_FOUND = -1;

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
    public E set(int index , E element){
        rangeChange(index);
        E old = elements[index];
        elements[index] = element;
        return old;
    }

    /**
     * 获取数组的长度
     * @return
     */
    public int size(){
        return size;
    }

    /**
     * 数组是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 获取元素的所在位置
     * @param element
     * @return
     */
    public int indexOf(E element){
        for (int i = 0 ; i< size ;i++){
            if (elements[i].equals(element)){
                return i;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    /**
     * 判断是否包含该元素
     * @return
     */
    public boolean contains(E element){
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /**
     * 添加元素
     * @param element
     */
    public void add(E element){
        add(size,element);
    }


    /**
     * 在指定位置添加元素
     * @param
     * @param element
     */
    public void add(int index ,E element){
        rangeCheckForAdd(index);

        // 确保容量
        ensureCapacity(size + 1);

        for (int i = size-1 ; i>= index ;i--){
            elements[i+1] = elements[i];
        }
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

    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", size:" + size);
    }


    private void rangeChange(int index){
        if (index < 0 || index >= size){
            outOfBounds(index);
        }
    }

    private void rangeCheckForAdd(int index){
        if (index < 0 || index > size){
            outOfBounds(index);
        }
    }

    /**
     * 移除某个位置的元素
     * @param index
     * @return 移除的元素
     */
    public E remove(int index){
        rangeChange(index);
        E old = elements[index];
        for (int i = index+1 ; i< size ;i++){
            elements[i-1] = elements[i];
        }
        size--;
        return old;
    }

    /**
     * 清除数组内元素
     * size=0,别人 get 就拿不到之前的元素了
     * 清掉浪费性能，又要垃圾回收，又需要重新创建
     */
    public void clean(){
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
