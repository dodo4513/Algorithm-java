package company.HackerRank.InterviewPreparationKit.DictionariesAndHashMap;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author cyclamen on 30/12/2018
 */
public class HashTablesRansomNote {

  static final String[] magazine = {"two", "times", "three", "is", "not", "four"};
  static final String[] note = {"two", "times", "two", "is", "four"};

  static void checkMagazine() {
    List<String> magazinList = new LinkedList<>(Arrays.asList(magazine));

    for (String s : note) {
      int index = magazinList.indexOf(s);
      if (index == -1) {
        System.out.println("No");
        return;
      } else {
        magazinList.remove(index);
      }
    }

    System.out.println("Yes");
  }

  public static void main(String[] args) {
    checkMagazine();
  }

}
