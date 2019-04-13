package company.codeJam.Y2019.ronud1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

/**
 * @author doyoung hwang on 2019-04-06
 */
public class Pylons {

  private static int Y;
  private static int X;
  private static boolean[][] VISIT;
  private static int goal;
  private static Stack<Point> stack;
  private static boolean end;
  private static int tt;

  static void dfs(int y, int x) {
    if (goal == 0) {
      end = true;

      System.out.println("Case #" + tt + ": POSSIBLE");

      while (!stack.empty()) {
        Point p = stack.pop();
        System.out.println((p.y + 1) + " " + (p.x + 1));
      }

      return;
    }

    for (int i = 0; i < Y; i++) {
      for (int j = 0; j < X; j++) {
        if (!VISIT[i][j]) {
          if (i != y && j != x && i - j != y - x && i + j != y + x) {
            VISIT[i][j] = true;
            goal--;
            stack.add(new Point(i, j));
            dfs(i, j);
            if (end) {
              return;
            }
            VISIT[i][j] = false;
            stack.pop();
            goal++;
          }
        }
      }
    }
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (tt = 1; tt <= t; ++tt) {
      /* input */
      Y = in.nextInt();
      X = in.nextInt();
      VISIT = new boolean[Y][X];
      goal = Y * X;
      stack = new Stack<>();
      end = false;

      for (int j = 0; j < Y; j++) {
        for (int k = 0; k < X; k++) {
          if (!end) {
            VISIT[j][k] = true;
            goal--;
            stack.add(new Point(j, k));
            dfs(j, k);
            if (end) {
              break;
            }
            VISIT[j][k] = false;
            goal++;
            stack.pop();
          }
        }
      }

      if (!end) {
        System.out.println("Case #" + tt + ": IMPOSSIBLE");
      }

    }
  }

  static class Point {

    int x;
    int y;

    Point(int y, int x) {
      this.x = x;
      this.y = y;

    }
  }
}
