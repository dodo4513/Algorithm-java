package company.test.Y20200229.yanol;

/**
 * @author cyclamen on 2/29/20
 */
public class SO2 {

    private enum Direction {
        UP,
        DOWN,
        NONE
    }

    public static int solution(int[] A) {
        int castleCount = 1; // 최소 1개는 무조건 지을 수 있음.
        Direction preDirection = Direction.NONE;

        for (int i = 1; i < A.length; i++) {
            int preGround = A[i - 1];
            int currentGround = A[i];

            // 같은 높이는 체크 안함.
            if (preGround != currentGround) {
                Direction currentDirection = preGround > currentGround ? Direction.DOWN : Direction.UP;

                // 방향이 달라져야 골짜기 혹은 언덕이 됨.
                if (preDirection != currentDirection) {
                    castleCount++;
                }

                preDirection = currentDirection;
            }
        }

        return castleCount;
    }

    public static void main(String[] args) {
        int[] A = new int[]{2, 1, 1, 2};
        System.out.println(solution(A));

        A = new int[]{-2, -2, -3, -4, -3, -3, -2, -2, -1, -1, -2};
        System.out.println(solution(A));
        A = new int[]{-3, -3};
        System.out.println(solution(A));
        A = new int[]{-3, 3};
        System.out.println(solution(A));
        A = new int[]{3};
        System.out.println(solution(A));
    }
}
