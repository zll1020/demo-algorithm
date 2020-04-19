package com.example.algorithm.demoalgorithm.array;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-18
 * Time: 21:02
 */
public abstract class MyAbstractList<E> implements MyList<E> {

    protected int size;

    /**
     * 获取数组的长度
     * @return
     */
    @Override
    public int size(){
        return size;
    }

    /**
     * 数组是否为空
     * @return
     */
    @Override
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 判断是否包含该元素
     * @return
     */
    @Override
    public boolean contains(E element){
        return indexOf(element) != ELEMENT_NOT_FOUND;
    }

    /**
     * 添加元素
     * @param element
     */
    @Override
    public void add(E element){
        add(size,element);
    }

    @Override
    public void remove(E element) {
        remove(indexOf(element));
    }

    private void outOfBounds(int index){
        throw new IndexOutOfBoundsException("index:" + index + ", size:" + size);
    }


    protected void rangeChange(int index){
        if (index < 0 || index >= size){
            outOfBounds(index);
        }
    }

    protected void rangeCheckForAdd(int index){
        if (index < 0 || index > size){
            outOfBounds(index);
        }
    }
}
