package com.example.algorithm.demoalgorithm.array;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-18
 * Time: 20:47
 */
public interface MyList<E> {
    static final int ELEMENT_NOT_FOUND = -1;

    /**
     * 获取某个位置的元素
     * @param index
     * @return
     */
    E get (int index);

    /**
     * 获取数组的长度
     * @return
     */
    int size();

    /**
     * 数组是否为空
     * @return
     */
    boolean isEmpty();

    /**
     * 获取元素的所在位置
     * @param element
     * @return
     */
    int indexOf(E element);

    /**
     * 判断是否包含该元素
     * @return
     */
    boolean contains(E element);

    /**
     * 添加元素
     * @param element
     */
    void add(E element);


    /**
     * 在指定位置添加元素
     * @param
     * @param element
     */
    void add(int index ,E element);


    E set(int index ,E element);


    /**
     * 移除某个位置的元素
     * @param index
     * @return 移除的元素
     */
    E remove(int index);

    void remove(E element);

    /**
     * 清除数组内元素
     */
    void clear();

}
