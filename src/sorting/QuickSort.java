package sorting;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    private static int partition(int[] a, int low, int high) {
        int pivot = a[low];
        int i = low, j = high;
        while (i < j) {

            do {
                i++;
            } while (a[i] < pivot);

            do {
                j--;
            } while (a[j] > pivot);

            if (i < j)
                swap(a, i, j);
        }
        swap(a, low, j);

        return j;
    }

    private static int[] quicksort(int[] a, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(a, low, high);
            quicksort(a, low, partitionIndex);
            quicksort(a, partitionIndex + 1, high);
        }
        return a;
    }

    private static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    private static int[] quicksort(int[] a) {
        int[] b = new int[a.length + 1];
        for (int i = 0; i < b.length; i++) {
            if (i == b.length - 1) {
                b[i] = Integer.MAX_VALUE;
            } else {
                b[i] = a[i];
            }
        }
        a = quicksort(b, 0, b.length - 1);
        int[] c = new int[a.length - 1];
        System.arraycopy(a, 0, c, 0, a.length - 1);
        return c;
    }

    public static void main(String[] args) {
        Random ran = new Random();
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(100);
        }
        System.out.println();
//        int[] a = {99,88,77,55,11,22,33,66,44,55};
        System.out.println(Arrays.toString(quicksort(a)));
    }
}
