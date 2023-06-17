package queue;

import queue.QueueInterface.Queue;

class CircularQueue implements Queue<Integer> {
    private final int QSize = 5;
    private final int[] queue = new int[QSize];
    private int front = -1, rear = -1;

    @Override
    public void enqueue(Integer data) {
        if (rear == QSize - 1 && front == 0) {
            System.out.println("Queue overflow");
            return;
        }
        if (front == rear) {
            front = 0;
        }
        rear = (rear + 1) % QSize;
        queue[rear] = data;
    }

    @Override
    public Integer dequeue() {
        if (front == -1) {
            return null;
        } else {
            int deletedItem = queue[front];
            queue[front] = 0; //optional
            front++;
            if (front == 4) {
                front = 0;
            }
            return deletedItem;
        }
    }

    @Override
    public void view() {
        if (front == -1) {
            System.out.println("Empty queue");
            return;
        }
        if (front <= rear) {
            for (int i = front; i <= rear; i++) {
                System.out.print(queue[i] + " ");
            }
        } else {
            for (int i = front; i < QSize; i++) {
                System.out.print(queue[i] + " ");
            }
            for (int i = rear; i <= front; i++) {
                System.out.print(queue[i] + " ");
            }
        }
        System.out.println();
    }
}

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(12);
        queue.enqueue(12);
        queue.enqueue(12);
        queue.view();
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(12);
        queue.enqueue(14);
        queue.enqueue(18);
        System.out.println(queue.dequeue());
        queue.view();
    }
}
