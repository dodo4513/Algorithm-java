package company.programers.practiceKit.Hash;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cyclamen on 09/02/2019
 */
public class 위장 {


  static final String[][] phone_book = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"},
      {"green_turban", "headgear"}};

  static int solution(String[][] clothes) {
    Map<String, Integer> dic = new HashMap<>();

    for (String[] clothe : clothes) {
      dic.put(clothe[1], dic.getOrDefault(clothe[1], 0) + 1);
    }

    return dic.values().stream().reduce(1, (t, v) -> t * (v + 1)) - 1;

  }

  public static void main(String args[]) {
    System.out.println(solution(phone_book));
  }
}

