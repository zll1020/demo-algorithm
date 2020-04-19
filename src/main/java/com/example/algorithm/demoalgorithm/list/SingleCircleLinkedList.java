package com.example.algorithm.demoalgorithm.list;

import com.example.algorithm.demoalgorithm.array.MyAbstractList;

/**
 * Description: 单向循环链表
 * User: zhangll
 * Date: 2020-04-18
 * Time: 20:42
 */
public class SingleCircleLinkedList<E> extends MyAbstractList<E> {

    private Node<E> first;

    @Override
    public E get(int index) {
        return getNode(index).element;
    }

    @Override
    public int indexOf(E element) {
        Node<E> node = first;
        if (element == null){
            for (int i = 0 ; i< size ;i++){
                if (node.element == null){
                    return i;
                }
                node = node.next;
            }
        }else {
            for (int i = 0 ; i< size ;i++){
                if (element.equals(node.element)){
                    return i;
                }
                node = node.next;
            }
        }
        return ELEMENT_NOT_FOUND;
    }

    @Override
    public void add(int index, E element) {
        if (index == 0){
            Node<E> newFirst = new Node<>(element,first);
            // 拿到最后的节点
            Node<E> last = size == 0 ? newFirst : getNode(size-1);
            last.next = newFirst;
            first = newFirst;
        }else {
            Node<E> previous = getNode(index-1);
            previous.next = new Node<>(element,previous.next);
        }
        size++;
    }

    @Override
    public E remove(int index) {
        rangeChange(index);
        Node<E> old = first;
        if (index == 0){
            if (size == 1){
                first = null;
            }else {
                // 需要先拿节点，与下一步变更first不能调换
                Node<E> last = size == 0 ? first : getNode(size-1);
                first = first.next;
                last.next = first;
            }
        }else {
            Node<E> previous = getNode(index-1);
            old = previous.next;
            previous.next = old.next;
        }
        size--;
        return old.element;

    }

    @Override
    public E set(int index,E element){
        Node<E> node = getNode(index);
        E old = node.element;
        node.element = element;
        return old;
    }

    /**
     * 获取index节点对象
     * @param index 从0开始
     * @return
     */
    private Node<E> getNode(int index){
        rangeChange(index);
        Node<E> node = first;
        for (int i = 0;i<index ; i++){
            node = node.next;
        }
        return node;
    }

    @Override
    public void clear() {
        size = 0;
        first = null;
    }


    // 节点
    private static class Node<E>{
        E element;
        Node<E> next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "size=" + size +
                ", first=" + first +
                '}';
    }
}
