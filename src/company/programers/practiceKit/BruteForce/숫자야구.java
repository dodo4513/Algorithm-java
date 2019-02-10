package company.programers.practiceKit.BruteForce;

import java.util.HashSet;
import java.util.Set;

/**
 * @author cyclamen on 09/02/2019
 */
public class 숫자야구 {

  // 시작 12:10

  static final int[][] phone_book = {{123, 1, 1}, {356, 1, 0}, {327, 2, 0}, {489, 0, 1}};

  static int solution(int[][] baseball) {
    int r = 0;
    for (int i = 123; i < 999; i++) {
      String a = String.valueOf(i);
      Set<String> unique = new HashSet<>();
      for (char c : a.toCharArray()) {
        unique.add(String.valueOf(c));
      }

      if (!a.contains("0") && unique.size() == 3) {
        int j;
        for (j = 0; j < baseball.length; j++) {
          String b = String.valueOf(baseball[j][0]);
          int strike = baseball[j][1];
          int ball = baseball[j][2];
          int _strike = 0;
          int _ball = 0;

          for (int m = 0; m < 3; m++) {
            if (a.charAt(m) == b.charAt(m)) {
              _strike++;
            } else {
              for (int n = 0; n < 3; n++) {
                if (n != m) {
                  if (a.charAt(n) == b.charAt(m)) {
                    _ball++;
                  }
                }
              }
            }
          }

          if (_strike != strike || _ball != ball) {
            break;
          }

        }
        if (j == baseball.length) {
          r++;
        }
      }
    }
    return r;
  }

  public static void main(String args[]) {
    System.out.println(solution(phone_book));
  }
}

