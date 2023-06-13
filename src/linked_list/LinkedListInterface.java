package linked_list;

public class LinkedListInterface {
    interface LinkedList<T> {
        void insertFirst(T data);

        void insertLast(T data);

        void insertAt(int index, T data);

        void search(T data);

        T deleteFirst();

        T deleteLast();

        T deleteAt(int index);

        int getSize();

        void display();
    }
}
