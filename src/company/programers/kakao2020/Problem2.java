package company.programers.kakao2020;

import java.util.Stack;

/**
 * @author doyoung hwang on 2019-10-03
 */
public class Problem2 {

  static class Solution {

    public String solution(String w) {
      String answer = "";

      if (w.length() > 0) {
        String u, v;
        int i = getUWIndex(w);
        u = w.substring(0, i);
        v = w.substring(i);

        if (isCurrent(u)) {
          return u + solution(v);
        } else {
          return "(" + solution(v) + ")" + getReverse(u);
        }
      }

      return answer;
    }

    private String getReverse(String u) {
      String s = u.substring(1, u.length() - 1);
      StringBuilder r = new StringBuilder();

      for (char c : s.toCharArray()) {
        if (c == ')') {
          r.append("(");
        } else {
          r.append(")");
        }
      }
      return r.toString();
    }

    private boolean isCurrent(String u) {
      Stack<String> stack = new Stack<>();

      for (char c : u.toCharArray()) {
        if (c == '(') {
          stack.push(String.valueOf(c));
        } else {
          if (stack.isEmpty()) {
            return false;
          }

          String s = stack.pop();
          if (s.equals(")")) {
            return false;
          }
        }
      }

      return true;
    }

    private int getUWIndex(String p) {
      int ic = 0, oc = 0;
      int i = 0;
      for (; i < p.length(); i++) {
        char c = p.charAt(i);
        if (c == '(') {
          ic++;
        } else {
          oc++;
        }
        if (ic == oc) {
          break;
        }
      }
      return i + 1;
    }
  }

  public static void main(String[] args) {
    Solution solution = new Solution();
    System.out.println(solution.solution("()))((()"));
  }
}
