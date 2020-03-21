package company.test.Y20200301.Woo;

import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * @author cyclamen on 3/1/20
 */
public class Double {

    public static int solution(int[] A) {
        NavigableMap<Integer, Boolean> positiveNumbers = new TreeMap<>(Comparator.reverseOrder());
        NavigableMap<Integer, Boolean> negativeNumbers = new TreeMap<>(Comparator.reverseOrder());

        for (int number : A) {
            if (number > 0) {
                positiveNumbers.put(number, true);
            } else {
                negativeNumbers.put(Math.abs(number), true);
            }
        }

        Collection<Integer> keys = positiveNumbers.keySet();

        for (int key : keys) {
            if (negativeNumbers.getOrDefault(key, false)) {
                return key;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, -2, 5, -3, -100000000};
        System.out.println(solution(a));
    }
}
