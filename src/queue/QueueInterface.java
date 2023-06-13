package queue;

public class QueueInterface {
    interface Queue<T> {
        void enqueue(T data);

        T dequeue();

        void view();
    }
}
