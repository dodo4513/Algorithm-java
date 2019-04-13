package company.codeJam.Y2019.QualificationRound;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @author doyoung hwang on 2019-04-06 11:47
 */
public class YouCanGoYourOnwWay {

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();  // Scanner has functions to read ints, longs, strings, chars, etc.
    in.nextLine();
    for (int i = 1; i <= t; ++i) {
      in.nextLine();
      String n = in.nextLine();
      int e = 0;
      int s = 0;
      int sindex = -1;
      System.out.print("Case #" + i + ": ");
      for (int j = 0; j < n.length(); j++) {
        if (n.charAt(j) == 'E') {
          e++;
        } else {
          s++;
        }
        if (e == s) {
          for (int k = j; k >= sindex + 1; k--) {
            System.out.print(n.charAt(k));
          }
          sindex = j;
        }
      }
      System.out.println("");
    }
  }
}

//  eesssese
//
//  seeesses
