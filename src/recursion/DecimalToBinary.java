package recursion;

// Write a java program to convert a decimal number to binary using recursion.
public class DecimalToBinary {
    static void toBinary(int n) {
        if (n != 0) {
            toBinary(n / 2);
            System.out.print(n % 2);
        }
    }

    public static void main(String[] args) {
        toBinary(50);
    }
}
