package queue;

import queue.QueueInterface.Queue;

/**
 * The type Priority queue.
 */
class PriorityQueue implements Queue<Integer> {
    private final int QSize = 5;
    private final int[] queue = new int[QSize];
    private int front = -1, rear = -1;

    @Override
    public void enqueue(Integer data) {
        if (rear == QSize - 1) {
            System.out.println("Queue overflow");
            return;
        }
        if (front == -1) {
            front = 0;
        }
        rear++;
        queue[rear] = data;
    }

    @Override
    public Integer dequeue() {
        return null;
    }

    @Override
    public void view() {
        if (front == -1) {
            System.out.println("Empty queue");
            return;
        }
//        int max = queue[front];
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}

/**
 * The type Priority queue main.
 */
public class PriorityQueueMain {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        PriorityQueue queue = new PriorityQueue();
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(12);
        queue.view();
    }
}
