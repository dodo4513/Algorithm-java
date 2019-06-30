package company.codility.test;

/**
 * @author doyoung hwang on 2019-06-03
 */
public class Jump {


  public static void main(String[] args) {

    int[] A = {-1};

    System.out.print(Solution.solution(A) + "\n");
  }

  static class Solution {

    public static int solution(int[] A) {
      int currentIndex = 0;
      int resultCount = 1;
      while (A[currentIndex] != -1) {
        resultCount++;
        currentIndex = A[currentIndex];
      }
      return resultCount;
    }
  }
}
