package stack;

import java.util.Stack;
import java.util.*;

public class PostfixEvaluation {
    public static void main(String[] args) {
        String expression = "6 2 3 + - 3 8 2 / + * 2 $ 3 +";
        Scanner sc = new Scanner(expression);
        Stack<Integer> operandStack = new Stack<>();
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                operandStack.push(sc.nextInt());
            } else {
                int operator2 = operandStack.pop();
                int operator1 = operandStack.pop();
                String operator = sc.next();
                switch (operator) {
                    case "+" -> operandStack.push(operator2 + operator1);
                    case "-" -> operandStack.push(operator1 - operator2);
                    case "*" -> operandStack.push(operator2 * operator1);
                    case "/" -> operandStack.push(operator1 / operator2);
                    case "$" -> operandStack.push((int) Math.pow(operator1, operator2));
                }
            }
        }
        System.out.println("Result = " + operandStack.pop());
    }
}
