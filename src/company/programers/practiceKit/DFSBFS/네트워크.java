package company.programers.practiceKit.DFSBFS;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author cyclamen on 10/02/2019
 */
public class 네트워크 {

  static int[][] computers = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
  static int n = 3;


  int[] history;
  int color = 0;
  Queue<Point> queue = new LinkedList<>();

  int solution(int n, int[][] computers) {
    history = new int[computers.length];
    for (int i = 0; i < computers.length; i++) {
      if (history[i] == 0) {
        queue.add(new Point(i, color++));
        while (queue.size() != 0) {
          bfs(queue.poll(), computers);
        }
      }
    }

    return color;
  }

  void bfs(Point p, int[][] computers) {
    history[p.x] = color;

    for (int i = 0; i < computers.length; i++) {
      if (computers[p.x][i] == 1 && history[i] == 0) {
        queue.add(new Point(i, color));
      }
    }
  }

  class Point {

    int x;
    int color;

    Point(int x, int color) {
      this.x = x;
      this.color = color;
    }
  }

  public static void main(String args[]) {
    네트워크 a = new 네트워크();
    System.out.println(a.solution(n, computers));

    String aa = new String("a");
    String bb = new String("a");
    System.out.println(aa == bb);
    System.out.println(aa.equals(bb));

    Map<String, Boolean> m = new HashMap<>();
    m.put(aa, true);
    m.put(bb, true);

    System.out.println(aa.hashCode());
    System.out.println(bb.hashCode());

    System.out.println(m);
  }
}
