package stack;
import java.util.Stack;
import java.util.*;

/**
 * The type Prefix evaluation.
 */
public class PrefixEvaluation {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        String expression = "* 2 3";
        StringBuilder toRev = new StringBuilder(expression);
        String revExp = toRev.reverse().toString();
        Scanner sc = new Scanner(revExp);
        Stack<Integer> operandStack = new Stack<>();
        while (sc.hasNext()){
            if(sc.hasNextInt()){
                operandStack.push(sc.nextInt());
            }else {
                int operand1 = operandStack.pop();
                int operand2 = operandStack.pop();
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
        System.out.println("Result = "+operandStack.pop());
    }
}
