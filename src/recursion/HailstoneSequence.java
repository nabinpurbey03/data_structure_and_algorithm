package recursion;

public class HailstoneSequence {
    static void hailstone(int n) {
        if (n <= 1) {
            System.out.print(n + " ");
        } else {
            if (n % 2 == 0) {
                System.out.print(n + " ");
                hailstone(n / 2);
            } else {
                System.out.print(n + " ");
                hailstone((3 * n) + 1);
            }
        }
    }

    public static void main(String[] args) {
        hailstone(9);
    }
}
