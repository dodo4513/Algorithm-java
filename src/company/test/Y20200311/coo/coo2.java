package company.test.Y20200311.coo;

import java.util.Arrays;

/**
 * @author Do-young on 3/11/20
 */
public class coo2 {

    public static int solution(int[] paper) {
        Arrays.sort(paper);

        int sum = 0;
        int result = 0;
        for (int i = paper.length - 1; i >= 0; i--) {
            sum += paper[i];
            if (sum >= Math.pow(paper.length - i, 2)) {
                result = paper.length - i;
            } else {
                break;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 0, 0, 3, 0, 1}));
        System.out.println(solution(new int[]{1, 0, 0}));
        System.out.println(solution(new int[]{7, 5, 8, 10, 6, 9, 5}));
        System.out.println(solution(new int[]{3, 0, 3, 0, 3, 0}));
    }
}
