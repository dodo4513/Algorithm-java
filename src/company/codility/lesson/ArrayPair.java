package company.codility.lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author doyoung hwang on 2019-06-03
 */
public class ArrayPair {


  public static void main(String[] args) {

    int[] r = {};
    int k = 3;
    System.out.print(Solution.solution(r, k));
  }

  static class Solution {

    public static int[] solution(int[] A, int K) {
      if (A.length == 0) {
        return A;
      }

      K = K % A.length;

      if (K == 0) {
        return A;
      }

      List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
      List<Integer> result = new ArrayList<>();
      result.addAll(list.subList(list.size() - K, list.size()));
      result.addAll(list.subList(0, list.size() - K));

      return result.stream().mapToInt(Integer::intValue).toArray();
    }
  }
}
