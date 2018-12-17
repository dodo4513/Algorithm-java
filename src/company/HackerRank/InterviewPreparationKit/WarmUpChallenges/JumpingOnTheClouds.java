package company.HackerRank.InterviewPreparationKit.WarmUpChallenges;

/**
 * @author dodo4513@nhnent.com
 * @since 2018-12-17
 */
public class JumpingOnTheClouds {

    static int[] c = {0, 0, 0, 1, 0, 0};

    static int jumpingOnClouds() {
        int r = 0;
        for (int i = 0; i < c.length - 1; i++) {
            r++;
            if (i + 2 != c.length && c[i + 2] == 0) {
                i++;
            }
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(jumpingOnClouds());
    }
}

// https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup