package stack;

import stack.StackInterface.Stack;

import java.util.ArrayList;

class MyStackForArrayList<T> implements Stack<T> {

    private final ArrayList<T> stack = new ArrayList<>();

    @Override
    public void push(T data) {
        stack.add(data);
    }

    @Override
    public T pop() {
        if (stack.isEmpty()) {
            return null;
        } else {
            return stack.remove(stack.size() - 1);
        }
    }

    @Override
    public T peek() {
        if (stack.isEmpty()) {
            return null;
        } else {
            return stack.get(stack.size() - 1);
        }
    }

    @Override
    public void view() {
        for (T t : stack) {
            System.out.print(t + " ");
        }
        System.out.println();
    }
}

public class StackUsingArrayList {
    public static void main(String[] args) {
        MyStackForArrayList<String> ob = new MyStackForArrayList<>();
        ob.push("Online");
        ob.push("Java");
        ob.push("Swing");
        ob.view();
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.pop());
        System.out.println(ob.peek());
        MyStackForArrayList<Integer> ob1 = new MyStackForArrayList<>();
        ob1.push(5);
        ob1.view();

    }
}
