package company.backjoon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author doyoung hwang on 2019-06-30
 */
public class WordSorting {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int caseCount = Integer.valueOf(scan.nextLine());
    List<String> strings = new ArrayList<>();
    for (int i = 0; i < caseCount; i++) {
      strings.add(scan.nextLine());
    }
    List<String> sortedStrings = strings.stream().distinct().sorted((o1, o2) -> {
      if (o1.length() != o2.length()) {
        return o1.length() - o2.length();
      } else {
        for (int i = 0; i < o1.length(); i++) {
          if (o1.charAt(i) != o2.charAt(i)) {
            return o1.charAt(i) - o2.charAt(i);
          }
        }
        return 1;
      }
    }).collect(Collectors.toList());

    for (String s : sortedStrings) {
      System.out.println(s);
    }
  }
}
