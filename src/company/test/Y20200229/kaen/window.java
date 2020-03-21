package company.test.Y20200229.kaen;

import java.util.Arrays;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * @author cyclamen on 2/29/20
 */
public class window {

    public static int segment(int x, List<Integer> arr) {
        NavigableMap<Integer, Integer> map = new TreeMap<>();

        // 첫 윈도우
        for (int i = 0; i < x; i++) {
            map.merge(arr.get(i), 1, Integer::sum);
        }
        int max = map.firstKey();

        // 한 칸씩 이동
        for (int i = 0; i < arr.size() - x; i++) {
            map.compute(arr.get(i), (k, v) -> v == 1 ? null : v - 1);
            map.merge(arr.get(i + x), 1, Integer::sum);
            max = Math.max(max, map.firstKey());
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.println(segment(1, Arrays.asList(1, 2, 3, 1, 2)));
    }
}

//    public static int segment(int x, List<Integer> arr) {
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i <= arr.size() - x; i++) {
//            int min = Integer.MAX_VALUE;
//            for (int j = i; j < x + i; j++) {
//                min = Math.min(min, arr.get(j));
//            }
//            max = Math.max(max, min);
//        }
//
//        return max;
//    }
