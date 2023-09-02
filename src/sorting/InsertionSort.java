package sorting;
import java.util.Arrays;
import java.util.Random;

public class InsertionSort {
    static int[] insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int key = a[i];
            int j = i - 1;
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }
        return a;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
        }
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
}
