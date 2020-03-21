package company.test.Y20200229.yanol;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author cyclamen on 2/29/20
 */
public class SO1 {

    private final static Map<Integer, String> dictionary = new LinkedHashMap<>();
    {
        dictionary.put(2, "Codility");
        dictionary.put(3, "Test");
        dictionary.put(5, "Coders");
    }

    public void solution(int N) {
        Collection<Integer> order = dictionary.keySet();

        for (int i = 1; i <= N; i++) {
            StringBuilder result = new StringBuilder();

            for (Integer integer : order) {
                if (i % integer == 0) {
                    result.append(dictionary.get(integer));
                }
            }

            System.out.println((result.length() == 0) ? i : result);
        }
    }
}
