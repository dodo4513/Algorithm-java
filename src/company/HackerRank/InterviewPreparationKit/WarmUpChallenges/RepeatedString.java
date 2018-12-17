package company.HackerRank.InterviewPreparationKit.WarmUpChallenges;

/**
 * @author dodo4513@nhnent.com
 * @since 2018-12-17
 */
public class RepeatedString {

    static final String s = "a";
    static final long n = 1000000000000L;

    static long repeatedString() {

        long r = 0;
        for (char c : s.toCharArray()) {
            if (c == 'a') {
                r++;
            }
        }

        r = (n / s.length()) * r;

        for (int i = 0; i < (n % s.length()); i++) {
            if (s.charAt(i) == 'a') {
                r++;
            }
        }

        return r;
    }

    public static void main(String[] args) {
        System.out.println(repeatedString());
    }
}

// https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen