package recursion;

// Write a java program to find the GCD of two numbers using recursion.
public class GCD {
    static int HCF(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        } else if (num1 == 0) {
            return num2;
        } else {
            return HCF(num2, num1 % num2);
        }
    }

    public static void main(String[] args) {
        System.out.println(HCF(20, 25));
    }
}
