package company.test.Y20200229.kaen;

import java.util.Arrays;
import java.util.List;

/**
 * @author cyclamen on 2/29/20
 */
public class SubArray {

    public static int splitIntoTwo(List<Integer> arr) {
        int rightSum = arr.stream().mapToInt(Integer::intValue).sum();
        int result = 0, leftSum = 0;

        for (int i = 0; i < arr.size() - 1; i++) {
            leftSum += arr.get(i);
            rightSum -= arr.get(i);

            if (leftSum > rightSum) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(splitIntoTwo(Arrays.asList(10, 4, -8, 7)));
        System.out.println(splitIntoTwo(Arrays.asList(-3, -2, 10, 20, -30)));
        System.out.println(splitIntoTwo(Arrays.asList(1, -1)));
        System.out.println(splitIntoTwo(Arrays.asList(1, -1, 1)));
        System.out.println(splitIntoTwo(Arrays.asList(1, -1, 1, -1)));
    }

}
