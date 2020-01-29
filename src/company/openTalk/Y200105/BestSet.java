package company.openTalk.Y200105;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author cyclamen on 1/29/20
 */
public class BestSet {

  public static int[] solution(int n, int s) {
    List<Integer> answer = new ArrayList<>();

    if (n > s) {
      return new int[]{-1};
    }

    int base = (int) Math.floor(s / (double) n);
    int mod = s - base * n;

    for (int i = 0; i < n; i++) {

      answer.add(base + (mod-- > 0 ? 1 : 0));
    }

    Collections.reverse(answer);
    return answer.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(2, 9)));
    System.out.println(Arrays.toString(solution(2, 1)));
    System.out.println(Arrays.toString(solution(2, 8)));
  }
}

