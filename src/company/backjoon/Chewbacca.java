package company.backjoon;

import java.util.Scanner;

/**
 * @author doyoung hwang on 2019-07-08
 */
public class Chewbacca {

  private static long getParent(long n, int k) {
    return (long) Math.ceil((n - 1) / (double) k);
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    long n = s.nextLong();
    int k = s.nextInt();
    int q = s.nextInt();
    long result;
    long x, y, max, min;

    for (long i = 0; i < q; i++) {
      x = s.nextLong();
      y = s.nextLong();
      result = 0;

      if (k == 1) {
        System.out.println(Math.abs(x - y));
      } else {
        max = Math.max(x, y);
        min = Math.min(x, y);
        while (max != min) {
          result++;

          x = getParent(max, k);
          y = min;

          max = Math.max(x, y);
          min = Math.min(x, y);
        }

        System.out.println(result);
      }
    }
  }
}
