package company.programers.checkSkill;

/**
 * @author doyoung hwang on 2019-11-01
 */
public class Problem3 {

  static char[] numbers;
  static boolean[] delete;
  static int numberSize;
  static int max;

  public static String solution(String number, int k) {

    numberSize = number.length();
    numbers = new char[numberSize];
    max = -1;


    for (int i = 0; i < numberSize; i++) {
      numbers[i] = number.charAt(i);
    }

    dfs(0, k);

    return answer;
  }


  static void dfs(int step, int k) {

    if (step == numberSize) {

    }


    // use
    delete[step] = true;
    k--;
    dfs(step + 1, k);
    delete[step] = false;
    k++;

    // not use
    dfs(step + 1, k);
  }


  public static void main(String[] args) {

    System.out.print((solution("1924", 2)));
  }
}
