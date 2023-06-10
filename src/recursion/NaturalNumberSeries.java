package recursion;

//Write a java program to print the first 50 natural numbers using recursion.
public class NaturalNumberSeries {
    static void numberSeries(int n) {
        if (n != 0) {
            numberSeries(n - 1);
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args) {
        numberSeries(50);
    }
}
