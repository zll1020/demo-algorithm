package com.example.algorithm.demoalgorithm.list;

import com.example.algorithm.demoalgorithm.array.MyAbstractList;
import com.example.algorithm.demoalgorithm.array.MyList;

/**
 * Description:
 * User: zhangll
 * Date: 2020-04-18
 * Time: 20:42
 */
public class MyLinkedList<E> extends MyAbstractList<E> {

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
            first = new Node<>(element,first);
        }else {
            Node<E> previous = getNode(index-1);
            previous.next = new Node<>(element,previous.next);
        }
        size++;
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
    public E remove(int index) {
        rangeChange(index);
        Node<E> old = first;
        if (index == 0){
            first = first.next;
        }else {
            Node<E> previous = getNode(index-1);
            old = previous.next;
            previous.next = old.next;
        }
        size--;
        return old.element;

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
