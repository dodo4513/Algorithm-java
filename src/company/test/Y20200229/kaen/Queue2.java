package company.test.Y20200229.kaen;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author cyclamen on 2/29/20
 */
public class Queue2 {

    public static int getBIndex(List<Integer> list, int key) {
        int i = Collections.binarySearch(list, key);

        if (i >= 0) {
            while (i + 1 < list.size() && list.get(i).equals(list.get(i + 1))) {
                i++;
            }

            return i;
        }

        return i * -1 - 2;
    }

    public static int requestsServed(List<Integer> timestamp, List<Integer> tops) {

        int r = 0;
        for (int top : tops) {
            int deleteTargetIndex = getBIndex(timestamp, top);


            int deleteIndex = deleteTargetIndex > 4 ? deleteTargetIndex - 4 : 0;
            int deleteTime = deleteTargetIndex > 4 ? 5 : deleteTargetIndex + 1;

            while (deleteTime > 0) {
                timestamp.remove(deleteIndex);
                deleteTime--;
                r++;
            }
        }

        return r;
    }

    public static void main(String[] args) {

        System.out.println(getBIndex(Arrays.asList(0,1,3,4,5), 1));
        System.out.println(getBIndex(Arrays.asList(0,1,3,4,5), 0));

        System.out.println(requestsServed(new ArrayList<>(Arrays.asList(0)), new ArrayList<>(Arrays.asList(0))));
        System.out.println(requestsServed(new ArrayList<>(Arrays.asList(2)), new ArrayList<>(Arrays.asList(2))));
    }

}
