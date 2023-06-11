package recursion;

public class LargestElement {
    static int max(int[] arr) {
        return maxRecursion(arr, 0);
    }

    static int maxRecursion(int[] arr, int index) {
        if (index == arr.length - 1) {
            return arr[arr.length - 1];
        } else {
            int currentData = arr[index];
            int greater = maxRecursion(arr, index + 1);
            return Math.max(currentData, greater);
        }
    }

    public static void main(String[] args) {
        int[] a = {32, 2, 56, 12, 6, 8};
        System.out.println("Largest element = " + max(a));
    }
}
