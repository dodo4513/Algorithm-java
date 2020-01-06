package company.openTalk.Y191102;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author cyclamen on 11/9/19 https://leetcode.com/problems/relative-sort-array/
 */
public class RelativeSortArray {

  static int[] relativeSortArray(int[] arr1, int[] arr2) {
    List<Integer> result = new ArrayList<>();
    int[] arr2Store = new int[1001];
    List<Integer> otherStore = new ArrayList<>();
    List<Integer> key = Arrays.stream(arr2).boxed().collect(Collectors.toList());

    for (int n : arr1) {
      if (key.contains(n)) {
        arr2Store[n]++;
      } else {
        otherStore.add(n);
      }
    }

    for (Integer integer : key) {
      for (int k = 0; k < arr2Store[integer]; k++) {
        result.add(integer);
      }
    }

    Collections.sort(otherStore);
    result.addAll(otherStore);

    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  public static void main(String[] args) {
    int[] arr1 = {2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19};
    int[] arr2 = {2, 1, 4, 3, 9, 6};
    System.out.println(Arrays.toString(relativeSortArray(arr1, arr2)));
  }
}
