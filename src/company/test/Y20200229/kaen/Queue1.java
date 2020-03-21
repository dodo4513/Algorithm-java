package company.test.Y20200229.kaen;

import java.util.Arrays;
import java.util.List;

/**
 * @author cyclamen on 2/29/20
 */
public class Queue1 {

    public static int requestsServed(List<Integer> timestamp, List<Integer> tops) {
        int[] timeStampBySecond = new int[61];
        int result = 0;
        for (Integer t : timestamp) {
            timeStampBySecond[t]++;
        }

        for (int top : tops) {
            int remainProcessRequest = 5;

            while (remainProcessRequest > 0) {
                if (top < 0) {
                    break;
                }

                int removeCount = Math.min(remainProcessRequest, timeStampBySecond[top]);
                remainProcessRequest -= removeCount;
                timeStampBySecond[top] -= removeCount;
                top--;
            }

            result += 5 - remainProcessRequest;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(requestsServed(Arrays.asList(2, 2, 4, 8, 11, 30, 28), Arrays.asList(0, 5, 5, 15)));
    }

}
