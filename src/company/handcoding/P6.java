package company.handcoding;

import java.util.Arrays;

/**
 * @author Do-young on 3/24/20
 */
public class P6 {

    public static int[] sort(int[] arr) {

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            int j = i - 1;
            for (; j >= 0 && arr[j] > temp; j--) {
                arr[j + 1] = arr[j];
            }
            arr[j + 1] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {

        int[] arr = {4, 3, 5, 2, 1};

        System.out.println(Arrays.toString(sort(arr)));
    }
}
