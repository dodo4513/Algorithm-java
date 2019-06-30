package company.codeJam.Y2019.ronud1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author doyoung hwang on 2019-04-06
 */
public class Alien {

  private static int tt;
  private static List<String> arr;


  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    in.nextLine();
    for (tt = 1; tt <= t; ++tt) {
      int n = in.nextInt();
      in.nextLine();
      arr = new ArrayList<>();

      for (int i = 0; i < n; i++) {
        arr.add(in.nextLine());
      }

      arr = arr.stream().map(a -> new StringBuffer(a).reverse().toString())
          .sorted(String::compareTo).collect(
              Collectors.toList());

      System.out.print(1);

    }
  }

  static class Point {

    int x;
    int y;

    Point(int y, int x) {
      this.x = x;
      this.y = y;

    }
  }
}

/**
 *
1
6
CODEJAM
HAM
JAM
NALAM
HUM
NOLOM
 */
