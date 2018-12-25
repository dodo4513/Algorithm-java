package company.HackerRank.InterviewPreparationKit.Array;

/**
 * @author cyclamen on 26/12/2018
 */
public class ArrayManipulation {

  static final int n = 5;
  static final int[][] queries =
      {
          {
              1, 2, 100
          },
          {
              2, 5, 100
          },
          {
              3, 4, 100
          }
      };

  static long arrayManipulation() {

    long arr[] = new long[n + 2];

    for (int i = 0; i < queries.length; i++) {
      arr[queries[i][0]] += queries[i][2];
      arr[queries[i][1] + 1] -= queries[i][2];
    }

    long r = 0;
    long max = -1;
    for (int i=1; i<=n ; i++) {
      r += arr[i];
      max = max > r ? max : r;
    }

    return max;
  }

  public static void main(String[] args) {
    System.out.println(arrayManipulation());
  }

}
