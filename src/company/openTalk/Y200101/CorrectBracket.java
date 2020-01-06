package company.openTalk.Y200101;

/**
 * @author cyclamen on 1/1/20 https://programmers.co.kr/learn/courses/30/lessons/12909?language=java
 */
public class CorrectBracket {

  static boolean solution(String s) {
    boolean answer = true;
    int i = 0;
    for (char c : s.toCharArray()) {

      i = c == '(' ? i + 1 : i - 1;

      if (i < 0) {
        return false;
      }
    }

    return i == 0;
  }

  public static void main(String[] args) {
    System.out.println(solution("()()"));
    System.out.println(solution("(())()"));
    System.out.println(solution(")()("));
    System.out.println(solution("(()("));
  }

}
