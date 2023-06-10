package recursion;

// Write a java program to print the array elements using recursion.
public class ArrayElement {
    static void viewElement(int[] arr) {
        viewElementRecursion(arr, arr.length - 1);
    }

    static void viewElementRecursion(int[] arr, int n) {
        if (n == 0) {
            System.out.print(arr[0] + " ");
        } else {
            viewElementRecursion(arr, n - 1);
            System.out.print(arr[n] + " ");
        }
    }

    public static void main(String[] args) {
        int[] data = {1, 5, 4, 6, 3};
        viewElement(data);
    }
}
