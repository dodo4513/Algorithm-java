package company.programers.practiceKit.Sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cyclamen on 09/02/2019
 */
public class k번째수 {

  //  static final String[] phone_book = {"119", "97674223", "1195524421"};
  static final String[] phone_book = {"123", "456", "789"};
  static int[] array = {1, 5, 2, 6, 3, 7, 4};
  static int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

  static int[] solution(int[] array, int[][] commands) {
    List<Integer> arrays = Arrays.stream(array).boxed().collect(Collectors.toList());
    List<Integer> result = new ArrayList<>();

    for (int[] command : commands) {

      List<Integer> a = arrays.subList(command[0] - 1, command[1]).stream()
          .sorted(Comparator.comparingInt(o -> o))
          .collect(Collectors.toList());

      result.add(a.get(command[2] - 1));
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String args[]) {
    System.out.println(solution(array, commands));
  }
}

