package company.backjoon;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author doyoung hwang on 2019-06-30
 */
public class middleNumber {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int k = scan.nextInt();
    int[] arr = new int[250_000];

    for (int i = 0; i < n; i++) {
      arr[i] = scan.nextInt();
    }

    if (k == 0) {
      System.out.println(0);
      return;
    }

    Arrays.sort(arr, 0, n);
    long r = 0;
    int s = k % 2 == 0 ? (k / 2) - 1 : k / 2;
    for (int i = s; i < s + n - k + 1; i++) {
      r += arr[i];
    }

    System.out.println(r);
  }
}
/*
2 2
3
4
2 1
0
9

4-2+1


1 0 0
2 0 1
3 1 1
4 1 2
5 2 2
6 2 3
7 3 3
8 3 4
9 4 4
10 4


5 2
9
1
8
2
7


*/
