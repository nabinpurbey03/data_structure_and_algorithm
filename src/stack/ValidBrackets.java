package stack;

import java.util.Stack;

public class ValidBrackets {
    static boolean bracketCheck(String str) {
        Stack<Character> ob = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char br1;
            char br2;
            if (ch == '(' || ch == '{' || ch == '[' || ch == '<') {
                ob.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']' || ch == '>') {
                if (ob.isEmpty())
                    return false;
                br1 = ob.pop();
                br2 = ch;
                if ((br1 == '(' && br2 != ')') || (br1 == '{' && br2 != '}') || (br1 == '[' && br2 != ']') || (br1 == '<' && br2 != '>')) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(bracketCheck("[nabin{purbey(BIM)}]"));
    }
}
