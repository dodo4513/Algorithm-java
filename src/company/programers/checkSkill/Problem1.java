package company.programers.checkSkill;

/**
 * @author doyoung hwang on 2019-11-01
 */
public class Problem1 {

  public static long solution(long n) {
    double d1 = Math.sqrt(n);
    double d2 = Math.ceil(d1);

    if (d1 != d2) {
      return -1;
    }

    return (long) Math.pow((long)d1 + 1, 2);
  }


  public static void main(String[] args) {

    System.out.print(solution(121));

  }

}
