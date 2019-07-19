package company.backjoon;

import java.util.Scanner;

/**
 * @author doyoung hwang on 2019-07-14
 */
public class NewMember {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t = scanner.nextInt();

    for (int i = 0; i < t; i++) {
      int n = scanner.nextInt();
      int[] arr = new int[n + 1];

      for (int j = 0; j < n; j++) {
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        arr[x] = y;
      }

      int r = 1;
      int min = arr[1];
      for (int j = 2; j <= n; j++) {
        if (arr[j] < min) {
          r++;
          min = arr[j];
        }
      }

      System.out.println(r);
    }
  }
}


/*

1
7
3 6
7 3
4 2
1 4
5 7
2 5
6 1

* */
