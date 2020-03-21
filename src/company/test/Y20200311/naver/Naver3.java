package company.test.Y20200311.naver;

/**
 * @author Do-young on 3/11/20
 */
public class Naver3 {

    // 5 삽입 문제
    // 양수는 뒤에서부터 앞으로
    // 음수는 앞에서부터 뒤로
    public static int solution(int N) {
        boolean positive = N < 0;
        if (!positive) {
            N *= -1;
        }

        String numberString = String.valueOf(N);
        int index = 0;
        char[] charArray = numberString.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char c = charArray[i];
            if (positive && c <= '5') {
                index = i;
            } else if (!positive && c >= '5') {
                index = i;
            }
        }

        if (positive) {
            return Integer.parseInt(numberString.substring(0, index) + "5" + numberString.substring(index));
        } else {
            return Integer.parseInt(numberString.substring(0, index) + "5" + numberString.substring(index)) * -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(59585));
        System.out.println(solution(-3559));
        System.out.println(solution(-3554));
        System.out.println(solution(672));
        System.out.println(solution(-672));
        System.out.println(solution(268));
        System.out.println(solution(0));
    }
}

//3559
//
//    53559 35595 35559
