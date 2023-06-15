package linked_list;

import linked_list.LinkedListInterface.LinkedList;

/**
 * Doubly Linked List node class
 */
class DLLNode<T> {
    T info;

    public DLLNode(T info) {
        this.info = info;
    }

    DLLNode<T> next, prev;
}

class DoublyLinkedList<T> implements LinkedList<T> {
    private DLLNode<T> first, last;
    private int size = 0;

    @Override
    public void insertFirst(T data) {
        DLLNode<T> newNode = new DLLNode<>(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first.prev = newNode;
            first = newNode;
        }
        size++;
    }

    @Override
    public void insertLast(T data) {
        DLLNode<T> newNode = new DLLNode<>(data);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
            newNode.prev = last;
        }
        last = newNode;
        size++;
    }

    @Override
    public void insertAt(int index, T data) {

    }

    @Override
    public void search(T data) {
        int index = 0;
        boolean isFound = false;
        DLLNode<T> temp = first;
        for (int i = 0; i < size; i++) {
            if (temp.info == data) {
                System.out.println("Search successful: " + temp.info + " found at index " + index);
                isFound = true;
                break;
            }
            index++;
            temp = temp.next;
        }
        if (!isFound) {
            System.out.println("Sorry! could not find the data " + data);
        }

    }

    @Override
    public T deleteFirst() {
        if (first == null) {
            return null;
        } else if (first == last) {
            T deletedItem = first.info;
            first = null;
            last = null;
            size--;
            return deletedItem;
        } else {
            T deletedItem = first.info;
            first = first.next;
            first.prev = null;
            size--;
            return deletedItem;
        }
    }

    @Override
    public T deleteLast() {
        if (first == null) {
            return null;
        } else if (first == last) {
            T deletedItem = last.info;
            first = null;
            last = null;
            size--;
            return deletedItem;
        } else {
            T deletedItem = last.info;
            last = last.prev;
            last.next = null;
            size--;
            return deletedItem;
        }
    }

    @Override
    public T deleteAt(int index) {
        return null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void display() {
        if (first == null) {
            System.out.println("Empty list");
        } else {
            DLLNode<T> temp = first;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class DoublyLinkedListMain {
    public static void main(String[] args) {
        DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
        list.insertFirst(80);
        list.insertFirst(80);
        list.display();
        list.insertLast(50);
        list.insertLast(50);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        list.search(50);
    }
}
