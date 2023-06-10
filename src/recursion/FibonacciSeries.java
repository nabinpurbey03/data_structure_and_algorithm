package recursion;

//Write a java program to print the Fibonacci Series using recursion.
public class FibonacciSeries {
    static int fibo(int n) {
        return n <= 1 ? n : fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
