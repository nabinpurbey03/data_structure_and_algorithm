package sorting_algorithm;

import java.util.Arrays;

public class SelectionSort {
    static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {5, 10, 8, 9, 3, 1, 4, 6, 7};
        System.out.println(Arrays.toString(selectionSort(a)));
    }
}
