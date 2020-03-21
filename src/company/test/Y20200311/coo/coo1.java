package company.test.Y20200311.coo;

/**
 * @author Do-young on 3/11/20
 */
public class coo1 {

    private final static int ALPHABET_LENGTH = 26;

    public static int solution(String S) {
        boolean[] cache = new boolean[ALPHABET_LENGTH];
        int result = 0;

        for (char c : S.toCharArray()) {
            if (cache[c - 'a']) {
                cache[c - 'a'] = false;
                result--;
            } else {
                cache[c - 'a'] = true;
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(solution("abac"));
        System.out.println(solution(""));
        System.out.println(solution("abc"));
    }
}
