package company.programers.practiceKit.BruteForce;

/**
 * @author cyclamen on 09/02/2019
 */
public class 카펫 {

  static int[] solution(int brown, int red) {
    int[] r = new int[2];

    for (int ry = red; ry > 0; ry--) {
      for (int rx = 1; rx <= Math.sqrt(red); rx++) {
        if (ry * rx == red) {
          int a = 0, _brown = 0;
          while (_brown < brown) {
            a++;
            _brown = 2 * a * rx + 2 * a * ry + a * a * 4;
          }

          if (brown == _brown) {
            r[0] = Math.max(rx, ry) + 2 * a;
            r[1] = Math.min(rx, ry) + 2 * a;
            return r;
          }
        }
      }
    }

    return null;
  }

  public static void main(String args[]) {
    System.out.println(solution(5000, 2000000));
  }
}

