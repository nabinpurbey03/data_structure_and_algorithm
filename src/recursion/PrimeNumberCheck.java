package recursion;

//Write a java program to check if a number is a prime number or not using recursion.
public class PrimeNumberCheck {
    static boolean primeCheck(int num) {
        return primeCheckRecursion(num, 2);
    }

    static boolean primeCheckRecursion(int num, int divisor) {
        if (divisor * divisor > num) {
            return true;
        } else {
            int cur = num % divisor;
            if (cur == 0) {
                return false;
            } else {
                return primeCheckRecursion(num, divisor + 1);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(primeCheck(29));
    }
}
