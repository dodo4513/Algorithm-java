package company.programers.checkSkill;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cyclamen on 11/9/19 05:30
 */
public class P191110 {

  public static String solution(String number, int k) {
    String answer = "";
    List<Character> result = new ArrayList<>();
    char[] origin = number.toCharArray();
    int originSize = origin.length;
    int preMaxIndex = 0;

    if (originSize == k) {
      return "0";
    }

    while (k > 0) {
      if (originSize - preMaxIndex == k) {
        break;
      }

      int maxIndex = -1;
      int maxValue = -1;
      for (int i = preMaxIndex; i <= preMaxIndex + k; i++) {
        if (origin[i] > maxValue) {
          maxValue = origin[i];
          maxIndex = i;
        }
      }
      result.add(origin[maxIndex]);

      k -= maxIndex - preMaxIndex;
      preMaxIndex = maxIndex + 1;

    }

    if (originSize - preMaxIndex != k) {
      for (int i = preMaxIndex; i < originSize; i++) {
        result.add(origin[i]);
      }
    }

    return result.stream().map(Object::toString).collect(Collectors.joining());
  }

  public static void main(String[] args) {
    String a = "90";
    int k = 1;
    System.out.println(solution(a, k));
//    a = "1231234";
//    k = 3;
//    solution(a, k);
    a = "4177252841";
    k = 4;
    System.out.println(solution(a, k));
  }

}
