package company.programers.checkSkill;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author doyoung hwang on 2019-11-01
 */
public class Problem2 {

  public static int[] solution(int brown, int red) {
    int[] answer = new int[2];

    List<Integer> baesus = new ArrayList<>();

    for (double i = 1; i <= red; i++) {
      if (red / i == Math.ceil(red / i)) {
        baesus.add((int) i);
      }
    }

    for (int i = 0; i < baesus.size(); i++) {
      int x = baesus.get(baesus.size() - 1 - i);
      int y = baesus.get(i);
      if (4 + y * 2 + x * 2 == brown) {
        answer[0] = x + 2;
        answer[1] = y + 2;
        return answer;
      }
    }

    return null;
  }


  public static void main(String[] args) {

    System.out.print(Arrays.toString(solution(8, 1)));
  }
}
