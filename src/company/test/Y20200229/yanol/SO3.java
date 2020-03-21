package company.test.Y20200229.yanol;

/**
 * @author cyclamen on 2/29/20
 */
public class SO3 {

    private final static char OPEN_BRACKET = '(';
    private final static char CLOSE_BRACKET = ')';

    public static int solution(String S) {
        int maxPossibleCloseBracket = 0;
        int currentOpenBracket = 0;

        for (char c : S.toCharArray()) {
            if (c == CLOSE_BRACKET) {
                maxPossibleCloseBracket++;
            }
        }

        // close bracket이 하나도 없다면 답은 반드시 0
        if (maxPossibleCloseBracket == 0) {
            return 0;
        }

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == OPEN_BRACKET) {
                currentOpenBracket++;
            } else {
                maxPossibleCloseBracket--;
            }

            if (currentOpenBracket == maxPossibleCloseBracket) {
                return i + 1;
            }
        }

        throw new IllegalStateException("Something strange!");
    }

    public static void main(String args[]) {
        System.out.println(solution("("));
        System.out.println(solution("(())"));
        System.out.println(solution("(())))("));
        System.out.println(solution("((((()))))"));
        System.out.println(solution(")"));

    }
}
