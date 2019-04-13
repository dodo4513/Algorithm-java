package company.codeJam.Y2019.QualificationRound;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author doyoung hwang on 2019-04-06 11:47
 */
public class ForegoneSolution {

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    in.nextLine();
    for (int i = 1; i <= t; ++i) {
      String n = in.nextLine();
      int[] a = new int[200];
      int[] b = new int[200];

      for (int j = 0; j < n.length(); j++) {
        if (n.charAt(j) == '4') {
          a[j] = 2;
          b[j] = 2;
        } else {
          a[j] = n.charAt(j) - '0';
        }
      }

      System.out.print("Case #" + i + ": ");
      printArray(n, a);
      System.out.print(" ");
      printArray(n, b);
      System.out.println("");

    }
  }

  private static void printArray(String n, int[] a) {
    boolean flag = true;
    for (int j = 0; j < n.length(); j++) {
      if (a[j] == 0 && flag) {
        continue;
      }

      flag = false;
      System.out.print(a[j]);
    }
  }
}
