package queue;
import queue.QueueInterface.Queue;

class CircularQueue implements Queue<Integer>{
    private int QSize = 5;
    private int[] queue = new int[QSize];
    private int front =-1, rear = -1;
    @Override
    public void enqueue(Integer data) {
        if(rear == QSize - 1 && front ==0){
            System.out.println("Queue overflow");
            return;
        }
        if(front == rear){
            front = 0;
        }
        rear = (rear + 1) % QSize;
        queue[rear] = data;
    }

    @Override
    public Integer dequeue() {
        return null;
    }

    @Override
    public void view() {

    }
}
public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(8);
        queue.enqueue(10);
        queue.enqueue(12);
        queue.view();

    }
}
