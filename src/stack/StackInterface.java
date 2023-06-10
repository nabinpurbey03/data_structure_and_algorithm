package stack;

public class StackInterface {
    interface Stack<T> {
        void push(T data);

        T pop();

        T peek();

        void view();
    }
}
