package company.test.Y20200311.naver;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Do-young on 3/11/20
 */
public class Naver2 {

    public boolean solution(int[] A) {
        Map<Integer, Integer> cache = new HashMap<>(A.length);
        for (int i : A) {
            cache.merge(i, 1, Integer::sum);
        }

        return cache.values().stream().noneMatch(v -> v % 2 == 1);
    }

    public static void main(String[] args) {

    }
}
