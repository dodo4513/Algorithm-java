package company.programers.practiceKit.sort;

import java.util.Arrays;

/**
 * @author cyclamen on 09/02/2019
 */
public class 가장큰수 {

  static int[] numbers = {0, 0, 0, 0};

  static String solution(int[] numbers) {

    String r = Arrays.stream(numbers).mapToObj(String::valueOf).sorted(
        (o1, o2) -> Integer.valueOf(o2 + o1) - Integer.valueOf(o1 + o2))
        .reduce((t, s) -> t + s).get();

    while (r.length() - 1 > 0 && r.charAt(0) == '0') {
      r = r.substring(1);
    }
    return r;
  }

  public static void main(String args[]) {
    System.out.println(solution(numbers));
  }
}

