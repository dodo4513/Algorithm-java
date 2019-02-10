package company.programers.practiceKit.BruteForce;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 * @author cyclamen on 09/02/2019
 */
public class 소수찾기 {


  static final String phone_book = "011";

  static List<String> result = new LinkedList<>();
  static int maxNumberSize;
  static Set<Integer> resultSet = new HashSet<>();
  static String[] strings;
  static int limit = 9999999;
  static boolean[] sosu = new boolean[limit];
  static boolean[] history = new boolean[7];

  static int solution(String numbers) {

    Arrays.fill(sosu, true);
    sosu[0] = false;
    sosu[1] = false;

    for (int i = 2; i < limit; i++) {
      int j = i * 2;
      while (j < limit) {
        sosu[j] = false;
        j += i;
      }
    }

    maxNumberSize = numbers.length();
    strings = new String[numbers.length()];

    for (int i = 0; i < numbers.length(); i++) {
      strings[i] = String.valueOf(numbers.charAt(i));
    }

    for (int i = 0; i < numbers.length(); i++) {
      result.add(strings[i]);
      history[i] = true;
      dfs(0);
      result.remove(strings[i]);
      history[i] = false;
    }

    return resultSet.size();
  }

  private static void dfs(int step) {
    if (maxNumberSize == step + 1) {
      String rr = result.stream().reduce((t, s) -> t + s).get();
      if (sosu[Integer.valueOf(rr)]) {
        resultSet.add(Integer.valueOf(rr));
      }
      return;
    }

    //선택안함
    dfs(step + 1);

    for (int i = 0; i < maxNumberSize; i++) {
      if (!history[i]) {
        history[i] = true;
        result.add(strings[i]);
        dfs(step + 1);
        history[i] = false;
        result.remove(strings[i]);
      }
    }
  }


  public static void main(String args[]) {
    System.out.println(solution(phone_book));
  }
}

