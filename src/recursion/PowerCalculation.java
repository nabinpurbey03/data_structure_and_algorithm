package recursion;
// Write a java program to calculate the power of any number using recursion

/**
 * The type Power calculation.
 */
public class PowerCalculation {
    /**
     * Power int.
     *
     * @param num the number
     * @param exp the exponent
     * @return the int
     */
    static int power(int num, int exp) {
        if (exp == 1) {
            return num;
        } else {
            return num * power(num, exp - 1);
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        System.out.println(power(2, 6));
    }
}
