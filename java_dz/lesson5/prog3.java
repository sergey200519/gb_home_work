package java_dz.lesson5;

import java.util.Arrays;

public class prog3 {    
    public static void main(String args[]) {
        int[] arr = {152, 98, 70, 88, 1, 0, -5, -100, 20};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void heap(int[] arr, int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int largest = i;
        if (left < size && arr[left] > arr[i]) largest = left;
        if (right < size && arr[right] > arr[largest]) largest = right;
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
            heap(arr, largest, size);
        }
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        int i = (n - 2) / 2;
        while (i >= 0) {
            heap(arr, i--, n);
        }
        while (n > 0) {
            int top = 0;
            if (n <= 0) {
                arr[n -  1] = -1;
            } else {
                top = arr[0];
                arr[0] = arr[n-1];
                heap(arr, 0, n - 1);
            }

            arr[n - 1] = top;
            n--;
        }
    }
}
