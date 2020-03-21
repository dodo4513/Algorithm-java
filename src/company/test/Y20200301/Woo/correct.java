package company.test.Y20200301.Woo;

import java.util.Arrays;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author cyclamen on 3/1/20
 */
public class correct {

    static int solution(int[] A, int[] B) {
        int n = A.length;
        int m = B.length;;
        Arrays.sort(A);
        Arrays.sort(B);
        int i = 0;
        for (int k = 0; k < n; k++) {
            while (i < m - 1 && B[i] < A[k])
                i += 1;
            if (A[k] == B[i])
                return A[k];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {4,5, 6, 9999,1000000000,1000000000,1000000000,1000000000, 999999999};
        int[] b = {1, 2, 60  ,1000000000,1000000000,1000000000, 999999999};
        System.out.println(solution(a, b));
    }

}
