package queue;
import queue.QueueInterface.Queue;
class Node<T>{
    T info;
    Node<T> next;
}
class SimpleQueueForLinkedList<T> implements Queue<T>{

    Node<T> front, rear;
    @Override
    public void enqueue(T data) {
        Node<T> newNode = new Node<>();
        newNode.info = data;
        if(front == null){
            front = newNode;
        }else {
            rear.next = newNode;
        }
        rear = newNode;
    }

    @Override
    public T dequeue() {
        if(front == null){
            return null;
        }else {
            Node<T> temp = front;
            T item = temp.info;
            front = front.next;
            temp.next = null;
            return item;
        }
    }

    @Override
    public void view() {
        Node<T> temp = front;
        while (temp != null){
            System.out.print(temp.info+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class SimpleQueueUsingLinkedList {
    public static void main(String[] args) {
        SimpleQueueForLinkedList<Integer> queue = new SimpleQueueForLinkedList<>();
        queue.enqueue(85);
        queue.view();
        queue.enqueue(90);
        queue.view();
        System.out.println(queue.dequeue());
        queue.view();
        queue.enqueue(98);
        queue.enqueue(99);
        queue.view();
        System.out.println(queue.dequeue());
        queue.view();

    }
}
