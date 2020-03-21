package company.test.Y20200229.hyper;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * @author cyclamen on 2/29/20
 */
public class ValidBrackets {

    private static final List<Character> openBrackets = Arrays.asList('[', '{', '(');
    private static final List<Character> closeBrackets = Arrays.asList(']', '}', ')');

    public static boolean isValid(String brackets) {
        Stack<Character> stack = new Stack<>();
        if (brackets.length() % 2 != 0) {
            return false;
        }

        for (Character character : brackets.toCharArray()) {
            if (openBrackets.contains(character)) {
                stack.push(character);
            } else if (stack.isEmpty() || !character.equals(closeBrackets.get(openBrackets.indexOf(stack.pop())))) {
                return false;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(ValidBrackets.isValid("[{()}]"));
        System.out.println(ValidBrackets.isValid("{{"));
        System.out.println(ValidBrackets.isValid("{(]"));
        System.out.println(ValidBrackets.isValid(""));
        System.out.println(ValidBrackets.isValid("[(])"));
        System.out.println(ValidBrackets.isValid("{()()}"));
    }
}
