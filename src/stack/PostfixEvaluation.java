package stack;

import java.util.Stack;
import java.util.*;

/**
 * The type Postfix evaluation.
 */
public class PostfixEvaluation {
    /**
     * The entry point of application.
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String expression = "6 2 3 + - 3 8 2 / + * 2 $ 3 +";
        Scanner sc = new Scanner(expression);
        Stack<Integer> operandStack = new Stack<>();
        while (sc.hasNext()) {
            if (sc.hasNextInt()) {
                operandStack.push(sc.nextInt());
            } else {
                int operand2 = operandStack.pop();
                int operand1 = operandStack.pop();
                String operator = sc.next();
                switch (operator) {
                    case "+" -> operandStack.push(operand1 + operand2);
                    case "-" -> operandStack.push(operand1 - operand2);
                    case "*" -> operandStack.push(operand1 * operand2);
                    case "/" -> operandStack.push(operand1 / operand2);
                    case "$" -> operandStack.push((int) Math.pow(operand1, operand2));
                }
            }
        }
        System.out.println("Result = " + operandStack.pop());
    }
}
