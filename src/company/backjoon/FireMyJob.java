package company.backjoon;

import java.util.Scanner;

/**
 * @author doyoung hwang on 2019-07-07
 */
public class FireMyJob {

  private static final int T = 0;
  private static final int P = 1;
  private static int n = 0;
  private static int maximumMoney = -1;

  static void dfs(int[][] array, int day, boolean[] visited, int money) {
    if (day == n) {
      if (money > maximumMoney) {
        maximumMoney = money;
      }
      return;
    }

    dfs(array, day + 1, visited, money);

    if (!visited[day] && array[day][T] > 0) {
      for (int i = day; i < day + array[day][T]; i++) {
        visited[i] = true;
      }
      dfs(array, day + 1, visited, money + array[day][P]);
      for (int i = day; i < day + array[day][T]; i++) {
        visited[i] = false;
      }
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int[][] array = new int[15][2];
    boolean[] visited = new boolean[15];
    n = scanner.nextInt();
    for (int i = 0; i < n; i++) {
      int t = scanner.nextInt();
      int p = scanner.nextInt();
      if (i + t <= n) {
        array[i][T] = t;
        array[i][P] = p;
      }
    }
    dfs(array, 0, visited, 0);

    System.out.println(maximumMoney);
  }
}
