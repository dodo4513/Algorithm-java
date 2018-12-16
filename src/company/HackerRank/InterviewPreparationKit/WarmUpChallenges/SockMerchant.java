package company.HackerRank.InterviewPreparationKit.WarmUpChallenges;

import java.util.Arrays;

public class SockMerchant {

    static int n = 9;
    static int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};


    static int sockMerchant(int n, int[] ar) {

        int[] socks = new int[101];

        Arrays.stream(ar).forEach(a -> socks[a]++);

        return Arrays.stream(socks).reduce(0, (t, a) -> t + a / 2);

    }

    public static void main(String args[]) {

        System.out.println(sockMerchant(n, ar));
    }
}

// https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
