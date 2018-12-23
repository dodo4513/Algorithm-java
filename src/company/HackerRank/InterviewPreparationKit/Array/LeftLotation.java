package company.HackerRank.InterviewPreparationKit.Array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author cyclamen on 23/12/2018
 */
public class LeftLotation {

  static final int[] a = {1, 2, 3, 4, 5};
  static final int d = 4;

  static int[] rotLeft() {

    List<Integer> r = new ArrayList<>();

    for (int i = d; i < a.length; i++) {
      r.add(a[i]);
    }
    for (int i = 0; i < d; i++) {
      r.add(a[i]);
    }

    return r.stream().mapToInt(i -> i).toArray();
  }


  public static void main(String[] args) {
    System.out.println(rotLeft());
  }

}
