package sorting;

import java.util.Arrays;

public class QuickSort {
    static int partition(int[] a, int l, int h){
        int pivot = a[l];
        int i=l, j=h;
        while (i<j){
            do {
                i++;
            }while (a[i]<pivot);
            do {
                j--;
            }while (a[j]>pivot);
            if(i<j){
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int temp = a[l];
        a[l] = a[j];
        a[j] = temp;

        return j;
    }

    static int[] quicksort(int[] a, int l, int h) {
        if (l < h) {
            int j = partition(a, l, h);
            quicksort(a, l, j);
            quicksort(a, j + 1, h);
        }
        return a;
    }

    static int[] quicksort(int[] a) {
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
        int[] a = {99,88,77,55,11,22,33,66,44,55};
        System.out.println(Arrays.toString(quicksort(a)));
    }
}
