package company.HackerRank.InterviewPreparationKit.WarmUpChallenges;


public class CountingValleys {

    static String s = "DDUDDUUDUU";

    static int countingValleys() {
        int result = 0;
        int level = 0;
        int preLevel;

        for (int i = 0; i < s.length(); i++) {
            preLevel = level;
            switch (s.charAt(i)) {
                case 'U':
                    level++;
                    break;

                case 'D':
                    level--;
            }
            if (level == -1 && preLevel == 0) {
                result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(countingValleys());
    }
}

// https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
