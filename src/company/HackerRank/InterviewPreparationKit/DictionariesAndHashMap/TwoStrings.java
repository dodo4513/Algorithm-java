package company.HackerRank.InterviewPreparationKit.DictionariesAndHashMap;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cyclamen on 31/12/2018
 */
public class TwoStrings {

  static final String s1 = "hello";
  static final String s2 = "world";

  static String twoStrings() {
    Map<String, Boolean> dic = new HashMap<>();

    for (char t : s1.toCharArray()) {
      dic.put(String.valueOf(t), true);
    }

    for (char t : s2.toCharArray()) {
      if (dic.containsKey(String.valueOf(t))) {
        return "Yes";
      }
    }
    return "No";
  }

  public static void main(String[] args) {
    System.out.println(twoStrings());
  }

}
