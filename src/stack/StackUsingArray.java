package stack;

import stack.StackInterface.Stack;


class MyStack implements Stack<Integer> {
    private final int stackSize = 5;
    private int top = -1;
    private final int[] stack = new int[stackSize];

    @Override
    public void push(Integer data) {
        if (top == stackSize - 1) {
            System.out.println("Stack overflow. ");
        } else {
            top++;
            stack[top] = data;
        }
    }

    @Override
    public Integer pop() {
        if (top == -1) {
            System.out.print("Stack underflow");
            return 0;
        } else {
            int item = stack[top];
            top--;
            return item;
        }
    }

    @Override
    public Integer peek() {
        return stack[top];
    }

    @Override
    public void view() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}

public class StackUsingArray {
    public static void main(String[] args) {
        MyStack ob = new MyStack();
        ob.push(1);
        ob.view();
        ob.push(2);
        ob.view();
        ob.push(3);
        ob.view();
        System.out.println(ob.pop());
        ob.view();
        System.out.println(ob.pop());
        System.out.println(ob.peek());
    }
}
