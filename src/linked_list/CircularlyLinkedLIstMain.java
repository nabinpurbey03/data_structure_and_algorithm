package linked_list;

import linked_list.LinkedListInterface.LinkedList;

/**
 * Circularly Linked List node class
 */
class CLLNode<T> {
    T info;

    public CLLNode(T info) {
        this.info = info;
    }

    CLLNode<T> next;
}

class CircularlyLinkedList<T> implements LinkedList<T> {
    private CLLNode<T> first, last;
    private int size = 0;

    @Override
    public void insertFirst(T data) {
        CLLNode<T> newNode = new CLLNode<>(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        last.next = first;
        size++;
    }

    @Override
    public void insertLast(T data) {
        CLLNode<T> newNode = new CLLNode<>(data);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        last.next = first;
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
            CLLNode<T> temp = first;
            CLLNode<T> newNode = new CLLNode<>(data);
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    @Override
    public void search(T data) {
        int position = 0;
        boolean isFound = false;
        CLLNode<T> temp = first;
        for (int i = 0; i < size; i++) {
            if (temp.info == data) {
                System.out.println("Search successful: " + temp.info + " found at index " + position);
                isFound = true;
                break;
            }
            position++;
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
            CLLNode<T> temp = first;
            first = temp.next;
            temp.next = null;
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
            CLLNode<T> temp = first;
            while (temp.next != last) {
                temp = temp.next;
            }
            last.next = null;
            temp.next = first;
            last = temp;
            size--;
            return deletedItem;
        }
    }

    @Override
    public T deleteAt(int index) {
        if (index > size || index < 0) {
            System.out.println("Cannot delete data. Please input right index [from 0 to " + (size - 1) + "].");
            return null;
        }
        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        } else {
            CLLNode<T> temp = first;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            CLLNode<T> delNode = temp.next;
            T deletedItem = delNode.info;
            temp.next = temp.next.next;
            delNode.next = null;
            last.next = first;
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
            CLLNode<T> temp = first;
            while (temp != last) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println(temp.info);
        }
    }
}

public class CircularlyLinkedLIstMain {
    public static void main(String[] args) {
        CircularlyLinkedList<String> list = new CircularlyLinkedList<>();
        list.insertFirst("Nabin");
        list.insertLast("Purbey");
        list.display();
        System.out.println(list.getSize());
        list.insertFirst("BIM");
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        list.insertAt(1, "CSIT");
        list.insertAt(1, "Swing");
        list.display();
        System.out.println(list.getSize());
        System.out.println(list.deleteAt(1));
        list.display();
        list.search("CSIT");
    }
}
