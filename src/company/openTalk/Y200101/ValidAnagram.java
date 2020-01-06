package company.openTalk.Y200101;

import java.util.Arrays;

/**
 * @author cyclamen on 1/2/20
 */
public class ValidAnagram {

  public static boolean isAnagram(String s, String t) {
    int alpha[] = new int[26];

    for (char c : s.toCharArray()) {
      alpha[c - 'a']++;
    }

    for (char c : t.toCharArray()) {
      alpha[c - 'a']--;
    }

    return Arrays.stream(alpha).filter(a -> a != 0).count() == 0;
  }

  public static void main(String[] args) {

    System.out.println(isAnagram("anagram", "nagaram"));
    System.out.println(isAnagram("anagram", "nagara"));

  }

}
