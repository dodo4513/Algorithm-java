package company.backjoon;

import java.util.Scanner;

/**
 * @author doyoung hwang on 2019-06-30
 */
public class JinSoo {

  public static void main(String[] args) {

    String[] arr1 = {"0", "1", "10", "11", "100", "101", "110", "111"};
    String[] arr2 = {"000", "001", "010", "011", "100", "101", "110", "111"};

    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();

    char[] chars = s.toCharArray();
    System.out.print(arr1[chars[0] - 48]);
    for (int i = 1; i < chars.length; i++) {
      System.out.print(arr2[chars[i] - 48]);
    }
  }
}
