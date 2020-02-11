package company.HackerRank.Y20200211;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cyclamen on 2/11/20
 */
public class SoSimple {

  class Solution {

    public List<String> fizzBuzz(int n) {
      List<String> a = new ArrayList<>();

      for (int i = 1; i <= n; i++) {
        String w = "";
        if (i % 3 == 0) {
          w += "Fizz";
        }
        if (i % 5 == 0) {
          w += "Buzz";
        }

        if ("".equals(w)) {
          w = String.valueOf(i);
        }

        a.add(w);
      }

      return a;
    }
  }

}
