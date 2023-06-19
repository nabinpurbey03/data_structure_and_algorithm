package recursion;

/**
 * The type Hailstone sequence.
 */
//Write a java program to find the Hailstone Sequence of a given number up to 1.
public class HailstoneSequence {
    /**
     * Hailstone.
     *
     * @param n the starting number
     */
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

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        hailstone(9);
    }
}
