package company.codility.test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author doyoung hwang on 2019-06-03
 */
public class Grade {


  public static void main(String[] args) {

    int[] A = {3, 4, 3, 0, 2, 2, 3, 0, 0};
//    int[] A = {4,2,0};
//    int[] A = {4, 4, 3, 3, 1, 0};
//    int[] A = {1000000000, 1000000000 - 1};
    System.out.print(Solution.solution(A) + "\n");
  }

  static class Solution {

    public static int solution(int[] ranks) {
      Map<Integer, Integer> map = new HashMap<>(ranks.length);

      for (int rank : ranks) {
        map.merge(rank, 1, Integer::sum);
      }

      return map.keySet()
          .parallelStream()
          .filter(m -> map.containsKey(m + 1))
          .map(map::get)
          .reduce(0, Integer::sum);
    }
  }
}
