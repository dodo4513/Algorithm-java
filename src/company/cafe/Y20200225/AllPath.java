package company.cafe.Y20200225;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author cyclamen on 2/26/20
 */
public class AllPath {

  // [[1,2], [3], [3], []]
  static Stack<Integer> result = new Stack<>();
  static List<List<Integer>> r = new LinkedList<>();

  public static void dfs(int next, int[][] graph) {

    if (next == graph.length - 1) {
      r.add(new ArrayList<>(result));
      return;
    }

    for (int i = 0; i < graph[next].length; i++) {
      result.push(graph[next][i]);
      dfs(graph[next][i], graph);
      result.pop();
    }
  }

  public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {

    result.push(0);
    for (int i = 0; i < graph[0].length; i++) {
      result.push(graph[0][i]);
      dfs(graph[0][i], graph);
      result.pop();
    }
    return r;
  }

  public static void main(String[] args) {
    int[][] a = {
        {1, 2},
        {3},
        {3},
        {}
    };
    System.out.println(allPathsSourceTarget(a));
  }
}
