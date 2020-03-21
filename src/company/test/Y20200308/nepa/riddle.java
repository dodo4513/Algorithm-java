package company.test.Y20200308.nepa;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author Do-young on 3/8/20
 */
public class riddle {

    public final static List<Character> characterStream = Arrays.asList('a', 'b', 'c');

    public static String solution(String riddle) {
        char[] chars = riddle.toCharArray();

        for (int i = 0; i < riddle.length(); i++) {
            if (chars[i] == '?') {
                chars[i] = getNotConsecutiveChar(riddle, chars, i);
            }
        }

        return String.valueOf(chars);
    }

    private static Character getNotConsecutiveChar(String riddle, char[] chars, int i) {
        Set<Character> siblingChars = new HashSet<>();
        if (i > 0) {
            siblingChars.add(chars[i - 1]);
        }
        if (i < riddle.length() - 1) {
            siblingChars.add(chars[i + 1]);
        }
        return characterStream.stream().filter(s -> !siblingChars.contains(s)).findAny().get();
    }

    public static void main(String[] args) {
        System.out.println(solution("rd?e?wg??"));
        System.out.println(solution("???????"));
    }
}
