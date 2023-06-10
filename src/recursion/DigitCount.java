package recursion;

public class DigitCount {
    static int countDigit(int n) {
        return n == 0 ? 0 : 1 + countDigit(n / 10);
    }

    public static void main(String[] args) {
        System.out.println(countDigit(977));
    }
}
