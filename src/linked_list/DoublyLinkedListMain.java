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
        if (index > size || index < 0) {
            System.out.println("Cannot insert data. Please input right index [from 0 to " + size + "].");
            return;
        }
        if (index == 0) {
            insertFirst(data);
        } else if (index == size) {
            insertLast(data);
        } else {
            DLLNode<T> newNode = new DLLNode<>(data);
            DLLNode<T> temp = first;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            newNode.prev = temp;
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            size++;
        }
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
        if (index < 0 || index > size - 1) {
            System.out.println("Cannot delete data. Please input right index [from 0 to " + (size - 1) + "].");
            return null;
        }
        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        } else {
            DLLNode<T> temp = first;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            T deletedItem = temp.info;
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
            size--;
            return deletedItem;
        }
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
        list.insertFirst(90);
        list.display();
        list.insertLast(50);
        list.insertLast(60);
        list.display();
        System.out.println(list.deleteFirst());
        System.out.println(list.deleteLast());
        list.display();
        list.search(50);
        list.insertAt(1, 20);
        list.insertAt(2, 30);
        list.display();
        System.out.println(list.deleteAt(2));
    }
}
