package sorting;

import java.util.Arrays;

public class BubbleSort {
    static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {8, 9, 6, 7, 1, 10, 2, 5, 4};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
}
