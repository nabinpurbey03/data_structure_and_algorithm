package stack;

import stack.StackInterface.Stack;

class Node<T> {
    T info;

    Node<T> prev;
}

class MyStackForLinkedList<T> implements Stack<T> {

    private Node<T> top;
    private int _size = 0;

    int size() {
        return _size;
    }

    @Override
    public void push(T data) {
        Node<T> newNode = new Node<>();
        newNode.info = data;
        if (top != null) {
            newNode.prev = top;
        }
        top = newNode;
        _size++;
    }

    @Override
    public T pop() {
        if (top == null) {
            return null;
        } else {
            T item = top.info;
            Node<T> temp = top;
            top = top.prev;
            temp.prev = null;
            _size--;
            return item;
        }
    }

    @Override
    public T peek() {
        if (top == null) {
            return null;
        } else {
            return top.info;
        }
    }

    @Override
    public void view() {
        if (top == null) {
            System.out.println("Empty stack");
        } else {
            Node<T> temp = top;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.prev;
            }
        }
        System.out.println();
    }
}

public class StackUsingLinkedList {
    public static void main(String[] args) {
        MyStackForLinkedList<Integer> list = new MyStackForLinkedList<>();
        list.view();
        list.push(8);
        list.push(16);
        System.out.println(list.size());
        list.view();
        System.out.println(list.pop());
        System.out.println(list.pop());
        MyStackForLinkedList<String> list1 = new MyStackForLinkedList<>();
        list1.push("Java");
        list1.push("Swing");
        list1.push("DSA");
        list1.view();
        System.out.println(list1.pop());
        list1.view();
        System.out.println(list1.peek());
        System.out.println(list1.size());
    }
}
