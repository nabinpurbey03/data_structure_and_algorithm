package recursion;

//Write a java program to calculate the sum of numbers from 1 to n using recursion.
public class SumOfNumbers {
    static int sum(int n) {
        return n == 0 ? 0 : n + sum(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
