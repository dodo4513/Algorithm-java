package company.codility.test;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * @author doyoung hwang on 2019-06-03
 */
public class Machine {


  public static void main(String[] args) {

//    String A = "13 DUP 4 POP 5 DUP + DUP + -";
//    String A = "5 6 + -";
//    String A = "3 DUP 5 - -";
    String A = "10 DUP + 10 -";

    System.out.print(Solution.solution(A) + "\n");
  }

  static class Solution {

    private static final int MAX_UNSIGNED20 = (int) (Math.pow(2, 20) - 1);
    private static final int MIN_UNSIGNED20 = 0;

    public static int solution(String S) {
      String[] words = S.split(" ");
      Stack<Integer> stack = new Stack<>();

      int firstNumber, secondNumber, calculateResult;

      try {
        for (String word : words) {
          switch (word) {
            case "DUP":
              stack.push(stack.peek());
              break;
            case "POP":
              stack.pop();
              break;
            case "+":
              firstNumber = stack.pop();
              secondNumber = stack.pop();
              calculateResult = firstNumber + secondNumber;
              if (calculateResult > MAX_UNSIGNED20) {
                throw new IllegalArgumentException();
              }
              stack.push(calculateResult);
              break;
            case "-":
              firstNumber = stack.pop();
              secondNumber = stack.pop();
              calculateResult = firstNumber - secondNumber;
              if (calculateResult < MIN_UNSIGNED20) {
                throw new IllegalArgumentException();
              }
              stack.push(calculateResult);
              break;
            default:
              stack.push(Integer.parseInt(word));
          }
        }
      } catch (EmptyStackException | IllegalArgumentException e) {
        return -1;
      }

      return stack.pop();
    }
  }
}
