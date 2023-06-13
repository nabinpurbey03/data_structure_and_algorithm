package recursion;

public class OddEven {
    static void showOddEven(int n) {
        if (n != 0) {
            if(n%2==0){
                System.out.println(n);
            }
            showOddEven(n-1);
        }
    }

    public static void main(String[] args) {
        showOddEven(10);
    }
}
