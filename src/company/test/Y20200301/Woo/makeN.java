package company.test.Y20200301.Woo;

/**
 * @author cyclamen on 3/1/20
 */
public class makeN {

    private static final int MARKED = 1;
    private static final String IMPOSSIBLE = "IMPOSSIBLE";

    private static final int STATE_FULL = 2;
    private static final int STATE_HALF = 1;

    public static String solution(int U, int L, int[] C) {
        int[] upArray = new int[C.length];
        int[] downArray = new int[C.length];
        int upRowCount = U;
        int allSum = 0;

        for (int i = 0; i < C.length; i++) {
            if (C[i] == STATE_FULL) {
                upArray[i] = downArray[i] = MARKED;
                upRowCount--;
            }
            allSum += C[i];
        }

        if (allSum != U + L) {
            return IMPOSSIBLE;
        }

        for (int i = 0; i < C.length; i++) {
            if (C[i] != STATE_HALF) {
                continue;
            }
            if (upRowCount > 0) {
                upArray[i] = MARKED;
                upRowCount--;
            } else {
                downArray[i] = MARKED;
            }
        }

        return print(C.length, upArray, downArray);
    }

    private static String print(int size, int[] upArray, int[] downArray) {
        StringBuilder u = new StringBuilder();
        StringBuilder l = new StringBuilder();
        for (int i = 0; i < size; i++) {
            u.append(upArray[i]);
            l.append(downArray[i]);
        }
        return u + "," + l;
    }

    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(solution(1, 0, a));
    }
}
