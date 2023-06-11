package queue;

import queue.QueueInterface.Queue;

class SimpleQueue implements Queue<Integer> {

    private final int QSize = 5;
    private final int[] queue = new int[QSize];
    private int front = -1, rear = -1;

    @Override
    public void enqueue(Integer data) {
        if (rear == QSize - 1) {
            System.out.println("Queue overflow");
        } else if (front == -1) {
            front++;
            rear++;
            queue[rear] = data;
        } else {
            rear++;
            queue[rear] = data;
        }
    }

    @Override
    public Integer dequeue() {
        if (front == -1) {
            System.out.println("Queue underflow");
            return 0;
        } else {
            int item = queue[front];
            front++;
            return item;
        }
    }

    @Override
    public void view() {
        if (front == -1) {
            System.out.println("Empty queue");
        } else {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }
}

public class SimpleQueueUsingArray {
    public static void main(String[] args) {
        SimpleQueue queue = new SimpleQueue();
        queue.enqueue(8);
        queue.enqueue(9);
        queue.view();
        System.out.println(queue.dequeue());
        queue.view();
        queue.enqueue(10);
        queue.view();
        queue.enqueue(12);
        System.out.println(queue.dequeue());
        queue.enqueue(15);
        queue.view();
        queue.enqueue(23);
        System.out.println(queue.dequeue());
    }
}
