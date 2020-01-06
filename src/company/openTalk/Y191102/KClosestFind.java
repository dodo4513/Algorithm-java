package company.openTalk.Y191102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author cyclamen on 11/9/19
 */
public class KClosestFind {

  public static int[][] kClosest(int[][] points, int K) {

    List<K> ks = new ArrayList<>();

    for (int[] point : points) {
      ks.add(new K(point[0], point[1]));
    }

    Collections.sort(ks);

    return ks.subList(0, K).stream().map(k -> new int[]{k.y, k.x}).toArray(int[][]::new);
  }

  static class K implements Comparable<K> {

    int x;
    int y;

    K(int y, int x) {
      this.x = x;
      this.y = y;
    }

    @Override
    public int compareTo(K o) {

      return (x * x + y * y) - (o.x * o.x + o.y * o.y);
    }

    int[] toArray() {
      return new int[]{x, y};
    }
  }


  public static void main(String[] args) {
//    int[][] points = {{3, 3}, {5, -1}, {-2, 4}};
//    int k = 2;
    int[][] points = {{1, 3}, {-2, 2}};
    int k = 1;

    System.out.println(Arrays.deepToString(kClosest(points, k)));
  }

}
