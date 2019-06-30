package company.codility.lesson;

/**
 * @author doyoung hwang on 2019-06-03
 */
public class ArrayPair {


  public static void main(String[] args) {

    System.out.print(Solution.solution(1));
  }

  static class Solution {

    public static int solution(int N) {
      int count = -1;
      int maxCount = 0;
      while (N >= 1) {
        if (N % 2 == 0) {
          if (count != -1) {
            count++;
          }
        } else {
          maxCount = maxCount > count ? maxCount : count;
          count = 0;
        }
        N /= 2;
      }
      return maxCount;
    }
  }
}
