package recursion;

public class Multiplication {
    static int multiply(int num1, int num2) {
        if (num2 == 0) {
            return num2;
        } else {
            return num1 + multiply(num1, num2 - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(multiply(5, 8));
    }
}
