package company.programers.practiceKit.Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author cyclamen on 09/02/2019
 */
public class 완주하지못한선수 {

  static final String[] magazine = {"mislav", "stanko", "mislav", "ana"};
  static final String[] note = {"stanko", "ana", "mislav"};

  private static String solution(String[] participant, String[] completion) {
    String answer = "";

    Map<String, Integer> dic = new HashMap<>();

    for (String s : participant) {
      if (dic.containsKey(s)) {
        dic.put(s, dic.get(s) + 1);
      } else {
        dic.put(s, 1);
      }
    }

    for (String s : completion) {
      dic.put(s, dic.get(s) - 1);
    }

    return dic.keySet().stream().filter(k -> dic.get(k) != 0).collect(Collectors.toList()).get(0);
  }

  public static void main(String args[]) {
    System.out.println(solution(magazine, note));
  }
}
