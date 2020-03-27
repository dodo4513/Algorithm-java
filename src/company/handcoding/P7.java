package company.handcoding;

import java.util.Arrays;

/**
 * @author Do-young on 3/24/20
 */
public class P7 {

    public static void swap(int[] arr, int i, int j) {
        if (i == j) {
            return;
        }

        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[j] ^ arr[i];
        arr[i] = arr[i] ^ arr[j];
    }

    public static int partition(int arr[], int l, int r) {
        int pivot = arr[l];

        while (l < r) {
            while (arr[l] < pivot && l < r) l++;
            while (arr[r] > pivot && l < r) r--;

            if (l <= r) {
                swap(arr, l, r);
                l++; r--;
            }
        }

        return l;
    }

    public static void quickSort(int arr[], int l, int r) {

        if (l < r) {
            int pibotIndex = partition(arr, l, r);

            quickSort(arr, l, pibotIndex - 1);
            quickSort(arr, pibotIndex + 1, r);
        }

    }



    public static void main(String[] args) {
        int[] arr = {4, 3, 5, 2, 1, 9, 2};
//        int[] arr = { 69, 10, 30, 2, 16, 8, 31, 22 };
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
