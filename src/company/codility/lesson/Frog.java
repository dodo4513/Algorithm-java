package company.codility.lesson;

import java.util.Stack;

/**
 * @author doyoung hwang on 2019-06-03
 */
public class Frog {


  public static void main(String[] args) {

    int[] A = {4, 3, 2, 1, 5};
    int[] B = {0, 1, 0, 0, 0};

    System.out.print(Solution.solution(A, B));
  }

  static class Solution {

    public static int solution(int[] A, int[] B) {
      int ret = 0;
      Stack<Integer> stack = new Stack<>();

      for (int i = 0; i < B.length; i++) {
        if (stack.empty() && B[i] == 0) {
          ret++;
        } else if (B[i] == 1) {
          stack.push(A[i]);
        } else {
          // fight!
          while (!stack.isEmpty()) {
            int size = stack.pop();
            if (A[i] < size) {
              stack.push(size);
              break;
            }
          }
          if (stack.isEmpty()) {
            ret++;
          }
        }
      }
      return ret + stack.size();
    }
  }
}
