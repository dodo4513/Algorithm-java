package company.openTalk.Y200105;

import java.util.Arrays;

/**
 * @author cyclamen on 1/29/20 https://programmers.co.kr/learn/courses/30/lessons/12938
 */
public class BestSet {

  public static int[] solution(int n, int s) {
    int[] answer = new int[n];

    if (n > s) {
      return new int[]{-1};
    }

    int base = (int) Math.floor(s / (double) n);
    int mod = s - base * n;

    Arrays.fill(answer, 0, n - mod, base);
    if (mod != 0) {
      Arrays.fill(answer, n - mod, n, base + 1);
    }

    return answer;
  }

  public static void main(String[] args) {
    System.out.println(Arrays.toString(solution(2, 9)));
    System.out.println(Arrays.toString(solution(2, 1)));
    System.out.println(Arrays.toString(solution(2, 8)));
  }
}

