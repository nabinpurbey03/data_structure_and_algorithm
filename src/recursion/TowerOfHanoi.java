package recursion;

/**
 * The type Tower of hanoi.
 * @author Nabin Purbey
 */
public class TowerOfHanoi {
    /**
     * Toh.
     *
     * @param n the number of discs
     * @param a the name of tower
     * @param b the name of tower
     * @param c the name of tower
     */
    static void TOH(int n, char a, char b, char c) {
        if (n != 0) {
            TOH(n - 1, a, c, b);
            System.out.print(a + "->" + c + "  ");
            TOH(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        TOH(3, 'A', 'B', 'C');
    }
}
