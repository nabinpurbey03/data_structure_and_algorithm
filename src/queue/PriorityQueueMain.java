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
            front++;
            rear++;
            queue[rear] = data;
        } else {
            queue[front] = data;
            rear++;
        }
    }

    @Override
    public Integer dequeue() {
        return null;
    }

    @Override
    public void view() {

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

    }
}
