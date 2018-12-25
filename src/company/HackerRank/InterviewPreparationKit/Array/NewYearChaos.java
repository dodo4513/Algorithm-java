package company.HackerRank.InterviewPreparationKit.Array;

/**
 * @author cyclamen on 25/12/2018
 */
public class NewYearChaos {

    static int[] q = {2, 5, 1, 3, 4};
//  static int[] q = {2, 1, 5, 3, 4};

  static void minimumBribes() {
    int r = 0;

    for (int i = q.length - 1; i > 0; i--) {
      if (i + 1 != q[i]) {
        int rr = 0;
        boolean findFlag = false;
        for (int j = i - 2; j < i; j++) {
          if (j < 0 || q[j] != i + 1) {
            continue;
          }
          findFlag = true;
          rr++;
          q[j + 1] = q[j] + q[j + 1];
          q[j] = q[j + 1] - q[j];
          q[j + 1] = q[j + 1] - q[j];
        }
        if (rr > 2 || !findFlag) {
          System.out.println("Too chaotic");
          return;
        }
        r += rr;
      }
    }

    System.out.println(String.valueOf(r));
  }

  public static void main(String[] args) {
    minimumBribes();
  }

}

// 2 5 1 3 4
//2 5 1 3 4



