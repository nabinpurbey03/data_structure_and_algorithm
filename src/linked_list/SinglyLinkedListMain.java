package linked_list;

/**
 * Singly Linked List node class
 */
class SLLNode<T> {
    T info;

    public SLLNode(T info) {
        this.info = info;
    }

    SLLNode<T> next;
}

class SinglyLinkedList<T> implements LinkedListInterface.LinkedList<T> {
    private SLLNode<T> first, last;
    private int size = 0;

    @Override
    public void insertFirst(T data) {
        SLLNode<T> newNode = new SLLNode<>(data);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            newNode.next = first;
            first = newNode;
        }
        size++;
    }

    @Override
    public void insertLast(T data) {
        SLLNode<T> newNode = new SLLNode<>(data);
        if (first == null) {
            first = newNode;
        } else {
            last.next = newNode;
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
            SLLNode<T> newNode = new SLLNode<>(data);
            SLLNode<T> temp = first;
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
        SLLNode<T> temp = first;
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
            SLLNode<T> temp = first;
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
            T deletedItem = first.info;
            first = null;
            last = null;
            size--;
            return deletedItem;
        } else {
            T deletedItem = last.info;
            SLLNode<T> temp = first;
            while (temp.next != last) {
                temp = temp.next;
            }
            last = temp;
            last.next = null;
            size--;
            return deletedItem;
        }
    }

    @Override
    public T deleteAt(int index) {
        if (index > size - 1 || index < 0) {
            System.out.println("Cannot insert data. Please input right index [from 0 to " + (size - 1) + "].");
            return null;
        }
        if (index == 0) {
            return deleteFirst();
        } else if (index == size - 1) {
            return deleteLast();
        } else {
            SLLNode<T> temp = first;
            for (int i = 1; i < index; i++) {
                temp = temp.next;
            }
            SLLNode<T> delNode = temp.next;
            T deletedItem = delNode.info;
            temp.next = temp.next.next;
            delNode.next = null;
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
            SLLNode<T> temp = first;
            while (temp != null) {
                System.out.print(temp.info + " ");
                temp = temp.next;
            }
            System.out.println();
        }
    }
}

public class SinglyLinkedListMain {
    public static void main(String[] args) {
        SinglyLinkedList<Integer> list = new SinglyLinkedList<>();
        list.insertFirst(8);
        list.insertLast(10);
        list.insertLast(20);
        list.insertLast(30);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        list.insertAt(1, 52);
        list.display();
        list.insertAt(0, 25);
        list.display();
        list.insertAt(3, 25);
        list.display();
        list.insertAt(2, 25);
        list.display();
        System.out.println(list.deleteAt(0));
        list.display();
        System.out.println(list.deleteAt(4));
        list.display();
        System.out.println(list.deleteAt(1));
        list.display();
        list.search(8);
        list.search(25);
        System.out.println(list.getSize());
    }
}
