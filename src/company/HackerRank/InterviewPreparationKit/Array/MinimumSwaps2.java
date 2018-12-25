package company.HackerRank.InterviewPreparationKit.Array;

/**
 * @author cyclamen on 25/12/2018
 */
public class MinimumSwaps2 {

//  static int[] arr = {4, 3, 1, 2};
//  static int[] arr = {3, 2, 1};
//  static int[] arr = {2, 3, 4, 1, 5};

    static int[] arr = {2, 31, 1, 38, 29, 5, 44, 6, 12, 18, 39, 9, 48, 49, 13, 11, 7, 27, 14, 33, 50,
      21, 46, 23, 15, 26, 8, 47, 40, 3, 32, 22, 34, 42, 16, 41, 24, 10, 4, 28, 36, 30, 37, 35, 20,
      17, 45, 43, 25, 19};
//  static int[] arr = {1, 3, 5, 2, 4, 6, 7};
//  static int[] arr = {1, 2};

  static int minimumSwaps() {
    int[] cache = new int[100001];

    int r = 0;
    for (int i = 0; i < arr.length - 1; i++) {

      if (arr[i] != i + 1) {

        int j = i + 1;

        if (cache[i + 1] != 0) {
          j = cache[i + 1];
        }

        for (; j < arr.length; j++) {

          if (arr[j] == i + 1) {
            r++;
            arr[i] = arr[j] + arr[i];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            break;
          }

          cache[arr[j]] = j;
        }
      }
    }

    return r;

  }


  public static void main(String[] args) {
    System.out.println(minimumSwaps());
  }

}

