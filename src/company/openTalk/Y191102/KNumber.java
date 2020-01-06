package company.openTalk.Y191102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cyclamen on 11/7/19 12:14
 */
public class KNumber {

  public static int[] solution(int[] array, int[][] commands) {
    int commandSize = commands.length;
    int[] answer = new int[commandSize];
    List<Integer> list = Arrays.stream(array).boxed().collect(Collectors.toList());

    for (int i = 0; i < commands.length; i++) {
      int[] command = commands[i];
      List<Integer> subList = new ArrayList<>(list.subList(command[0] - 1, command[1]));
      Collections.sort(subList);
      answer[i] = subList.get(command[2] - 1);
    }

    return answer;
  }

  public static void main(String[] args) {

    int[] a = {1, 5, 2, 6, 3, 7, 4};
    int[][] b = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    System.out.println(Arrays.toString(solution(a, b)));
  }

}
