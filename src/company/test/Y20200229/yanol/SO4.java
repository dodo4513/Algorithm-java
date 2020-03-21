package company.test.Y20200229.yanol;

/**
 * @author cyclamen on 2/29/20
 */
public class SO4 {

    public static int solution(int[] A) {
        int[] possibleMinNumber = new int[A.length];

        // 역순으로 가능한 가장 작은 수를 계산
        possibleMinNumber[A.length - 2] = A[A.length - 2];
        for (int i = A.length - 3; i >= 0; i--) {
            possibleMinNumber[i] = Math.min(possibleMinNumber[i + 1], A[i]);
        }

        int result = Integer.MAX_VALUE;
        for (int i = 1; i < A.length - 3; i++) {
            // A[i] 기준으로 선택할 수 있는 최적은 A[i] + possibleMinNumber[i + 2]
            result = Math.min(result, A[i] + possibleMinNumber[i + 2]);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5, 2, 4, 6, 3, 7};
        System.out.println(solution(a));
        a = new int[]{5, 100, 90, 90, 80, 7};
        System.out.println(solution(a));

        a = new int[]{-123123, 100, 90, 0, 8, -123123};
        a = new int[]{1,1,1,2,1};
        a = new int[]{1,1,0,1,0,1};
        System.out.println(solution(a));

        //        a = new int[]{5, 2, 4, 6, 3, 7};
        //        System.out.println(solution(a));

    }
}
