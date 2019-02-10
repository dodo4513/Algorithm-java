package company.programers.practiceKit.DFSBFS;

/**
 * @author cyclamen on 09/02/2019
 */
public class 타겟넘버 {

  static int[] n = {1, 1, 1, 1, 1};
  static int t = 3;
  static int c = 0;
  static int r = 0;

  static int solution(int[] numbers, int target) {

    dfs(0);

    return r;
  }

  static void dfs(int i) {
    if (i == n.length) {
      if (c == t) {
        r++;
      }
      return;
    }

    c += n[i];
    dfs(i + 1);
    c -= n[i] * 2;
    dfs(i + 1);
    c += n[i];
  }

  public static void main(String args[]) {
    System.out.println(solution(n, t));
  }
}

