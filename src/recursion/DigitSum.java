package recursion;

//Write a java program to find the sum of digits of a number using recursion.
public class DigitSum {
    static int sumDigit(int n) {
        return n == 0 ? 0 : n % 10 + sumDigit(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumDigit(9));
    }
}
