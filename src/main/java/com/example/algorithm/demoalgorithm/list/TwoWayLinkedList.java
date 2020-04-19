package com.example.algorithm.demoalgorithm.list;

import com.example.algorithm.demoalgorithm.array.MyAbstractList;

/**
 * Description:双向链表
 * User: zhangll
 * Date: 2020-04-19
 * Time: 17:26
 */
public class TwoWayLinkedList<E> extends MyAbstractList<E> {

    private Node<E> first;
    private Node<E> last;

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
        return ELEMENT_NOT_FOUND;    }

    @Override
    public void add(int index, E element) {
        if (index == size){
            Node<E> oldLast = last;
            last = new Node<>(element,oldLast,null);
            if (oldLast == null){
                // 第一个元素
                first = last;
            }else {
                oldLast.next = last;
            }
        }else {
            Node<E> current = getNode(index);
            Node<E> newNode = new Node<>(element,current.prev,current);
            current.prev = newNode;
            if (current.prev == null){
                first = newNode;
            }else {
                current.prev.next=newNode;
            }
        }
        size ++;
    }

    @Override
    public E set(int index, E element) {
        Node<E> current = getNode(index);
        Node<E> old = current;
        current.element = element;
        return old.element;
    }

    @Override
    public E remove(int index) {
        Node<E> current = getNode(index);
        if (index == 0){
            first = first.next;
            first.prev = null;
        }else if (index == size -1){
            last = last.prev;
            last.next = null;
        }else {
            current.prev.next = current.next;
            current.next.prev = current.prev;
        }
        size --;
        return current.element;
    }

    @Override
    public void clear() {
        first = null;
        last = null;
        size = 0;
    }

    private Node<E> getNode(int index){
        rangeChange(index);
        Node<E> current = null;
        if (index < size >> 1){
            current = first;
            for (int i = 0 ;i < index ;i++){
                current = current.next;
            }
        }else {
            current = last;
            for (int i = size-1 ;i > index ;i--){
                current = last.prev;
            }
        }
        return current;
    }

    static class Node<E>{
        private E element;

        private Node prev;

        private Node next;

        public Node(E element, Node prev, Node next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "element=" + element +
                    ", prev=" + prev +
                    ", next=" + next +
                    '}';
        }
    }

    @Override
    public String toString() {
        // 容易栈溢出
        StringBuilder builder = new StringBuilder();
        builder.append("size:" + size + "elements:");
        Node<E> current = first;
        for (int i = 0 ;i< size;i++){
            builder.append(current.element.toString()+"，");
            current = current.next;
        }
        return builder.toString();
    }
}
