package java_dz.lesson3;

import java.util.Arrays;

public class prog1 {
    public static void main(String[] args) {
        int[] arr = {100, 4, 90, 1600, 135, 1};
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }
    public static int[] sort(int[] sortArr) {
        int[] arr1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] arr2 = new int[sortArr.length];
        int[] result = sortInner(arr1, arr2, 0, sortArr.length);
        return result;
    }

    public static int[] sortInner(int[] arr1, int[] arr2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return arr1;
        }
        int middle = startIndex + (endIndex - startIndex) / 2;
        int p1 = startIndex;
        int p2 = middle;
        int[] sort1 = sortInner(arr1, arr2, startIndex, middle);
        int[] sort2 = sortInner(arr1, arr2, middle, endIndex);
        int destIndex = startIndex;
        int[] result = sort1 == arr1 ? arr2 : arr1;
        while (p1 < middle && p2 < endIndex) {
            result[destIndex++] = sort1[p1] < sort2[p2] ? sort1[p1++] : sort2[p2++];
        }
        while (p1 < middle) {
            result[destIndex++] = sort1[p1++];
        }
        while (p2 < endIndex) {
            result[destIndex++] = sort2[p2++];
        }
        return result;
    }
}