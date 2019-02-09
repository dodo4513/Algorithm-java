package company.programers.practiceKit.hash;

import java.util.Arrays;

/**
 * @author cyclamen on 09/02/2019
 */
public class 전화번호목록 {

  //  static final String[] phone_book = {"119", "97674223", "1195524421"};
  static final String[] phone_book = {"123", "456", "789"};

  private static boolean solution(String[] phone_book) {

    for (String number : phone_book) {
      int numberSize = number.length();

      if (Arrays.stream(phone_book).anyMatch(n -> {
        if (n.equals(number)) {
          return false;
        } else if (numberSize > n.length()) {
          return false;
        } else {
          return n.substring(0, numberSize).equals(number);
        }
      })) {
        return false;
      }
    }

    return true;
  }

  public static void main(String args[]) {
    System.out.println(solution(phone_book));
  }
}

