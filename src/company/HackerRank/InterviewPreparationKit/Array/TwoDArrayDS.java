package company.HackerRank.InterviewPreparationKit.Array;

import java.util.Arrays;

/**
 * @author cyclamen on 20/12/2018
 */
public class TwoDArrayDS {

    static int[][] arr = {{1, 1, 1, 0},
            {0, 1, 0, 0},
            {1, 1, 1, 0},
            {0, 0, 0, 0}};

    static int hourglassSum() {
        int x, y, max = -999, t;
        if (arr.length < 3 || Arrays.stream(arr).anyMatch(arr -> arr.length < 3)) {
            return 0;
        }

        x = arr.length;
        y = arr[0].length;

        for (int i = 0; i < y - 3; i++) {
            for (int j = 0; j < x - 3; j++) {
                t = sumProcess(i, j, arr);
                max = max > t ? max : t;
            }
        }

        return max;
    }

    static int[][] cordinate = {{0, 0}, {0, 1}, {0, 2}, {1, 1}, {2, 0}, {2, 1}, {2, 2}};

    static int sumProcess(int y, int x, int[][] arr) {
        int result = 0;
        for (int i = 0; i < 7; i++) {
            result += arr[y + cordinate[i][0]][x + cordinate[i][1]];
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(hourglassSum());
    }
}
