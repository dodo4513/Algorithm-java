package company.programers.practiceKit.BruteForce;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cyclamen on 09/02/2019
 */
public class 모의고사 {


  //  static final int[] phone_book = {1, 3, 2, 4, 2};
  static final int[] phone_book = {1, 2, 1, 1};
//  static final int[] phone_book = {1,2,3,4,5};


  static int[] ap = {1, 2, 3, 4, 5};
  static int[] bp = {2, 1, 2, 3, 2, 4, 2, 5};
  static int[] cp = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};

  static int[] solution(int[] answers) {
    int ai = 0, bi = 0, ci = 0;
    int[] arr = new int[3];
    for (int r : answers) {
      arr[0] += ap[ai] == r ? 1 : 0;
      arr[1] += bp[bi] == r ? 1 : 0;
      arr[2] += cp[ci] == r ? 1 : 0;
      ai++;
      bi++;
      ci++;
      ai %= ap.length;
      bi %= bp.length;
      ci %= cp.length;
    }

    List<Integer> resultList = new ArrayList<>();
    int max = -1;
    for (int i = 0; i < 3; i++) {
      if (arr[i] == max) {
        resultList.add(i + 1);
      } else if (arr[i] > max) {
        max = arr[i];
        resultList = new ArrayList<>();
        resultList.add(i + 1);
      }
    }
    return resultList.stream().mapToInt(i -> i).toArray();
  }

  public static void main(String args[]) {
    System.out.println(solution(phone_book));
  }
}

