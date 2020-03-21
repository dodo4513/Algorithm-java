package company.test.Y20200308.nepa;

import java.util.Arrays;

/**
 * @author Do-young on 3/8/20
 */
public class Find {

    private static boolean hasNotZero(int n) {
        while (n > 9) {
            if (n % 10 == 0) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static int[] solution(int N) {
        for (int i = 1; i < N; i++) {
            int b = N - i;

            if (hasNotZero(i) && hasNotZero(b)) {
                return new int[]{i, b};
            }
        }

        throw new RuntimeException("error!");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2)));
        System.out.println(Arrays.toString(solution(500000)));
    }
}
