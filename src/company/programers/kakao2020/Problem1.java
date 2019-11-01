package company.programers.kakao2020;

/**
 * @author doyoung hwang on 2019-10-03
 */
public class Problem1 {

  static class Solution {

    public int solution(String s) {
      int answer = 1001;
      for (int d = 1; d <= s.length(); d++) {

        String pre = s.substring(0, d);
        String cur = pre;
        int count = 1;
        int req = 0;

        for (int i = d; i < s.length(); i += d) {
          //input
          if (i + d < s.length()) {
            cur = s.substring(i, i + d);
          } else {
            cur = s.substring(i);
          }

          //process
          if (pre.equals(cur)) {
            count++;
          } else {
            req = getCount(pre, count, req);
            count = 1;
            pre = cur;
          }
        }
        req = getCount(cur, count, req);

        answer = answer > req ? req : answer;
      }

      return answer;
    }

    private int getCount(String cur, int count, int req) {
      req += cur.length();
      if (count > 1) {
        req += String.valueOf(count).length();
      }
      return req;
    }
  }


  public static void main(String[] args) {
    Solution solution = new Solution();
    int a = solution.solution("xababcdcdababcdcd");
    System.out.println("a:" + a);
  }
}
