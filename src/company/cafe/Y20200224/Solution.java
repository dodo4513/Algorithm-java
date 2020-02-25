package company.cafe.Y20200224;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {


  static int[] used = new int[8];
  static String[] history = new String[10];
  static Set<String> result = new HashSet<>();

  static void dfs(int step, char[] tiles) {

    if (step == tiles.length - 1) {

      result.add(Arrays.stream(history).filter(Objects::nonNull).collect(Collectors.joining()).trim());

      return;
    }

    for (int i = 0; i < tiles.length; i++) {

      history[i] = String.valueOf(tiles[i]);
      dfs(step + 1, tiles);
      history[i] = "";

    }
  }


  public static int numTilePossibilities(String tiles) {

    tiles += " ";

    dfs(0, tiles.toCharArray());

    System.out.println(result);

    return result.size();
  }

  public static void main(String[] args) {
    numTilePossibilities("AAB");
  }
}
