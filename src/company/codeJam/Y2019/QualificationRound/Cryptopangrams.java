package company.codeJam.Y2019.QualificationRound;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author doyoung hwang on 2019-04-06
 */
public class Cryptopangrams {

  static BigInteger gcd(BigInteger a, BigInteger b) {
    while (!b.equals(BigInteger.ZERO)) {
      BigInteger r = a.mod(b);
      a = b;
      b = r;
    }
    return a;
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
    int t = in.nextInt();
    for (int i = 1; i <= t; ++i) {
      /* input */
      String[] arr = new String[100];
      List<BigInteger> sosu = new ArrayList<>();
      in.nextInt(); // N
      int L = in.nextInt();
      for (int j = 0; j < L; j++) {
        arr[j] = in.next();
      }

      /* process */
      System.out.print("Case #" + i + ": ");

      int n = -1;
      for (int m = 0; m < L - 1; m++) {
        if (!arr[m].equals(arr[m + 1])) {
          BigInteger key = gcd(new BigInteger(arr[m]), new BigInteger(arr[m+1]));
          sosu.add(new BigInteger(arr[m]).divide(key));
          sosu.add(key);
          for (int k = m + 1; k < L; k++) {
            key = new BigInteger(arr[k]).divide(key);
            sosu.add(key);
          }
          break;
        } else {
          n = m;
        }
      }

      for (int q = n; q >= 0; q--) {
        sosu.add(0, new BigInteger(arr[q]).divide(sosu.get(0)));
      }

      List<BigInteger> table = sosu.stream().distinct().sorted(Comparator.naturalOrder())
          .collect(Collectors.toList());

      for (BigInteger bigInteger : sosu) {
        System.out.print((char) ('A' + (table.indexOf(bigInteger))));
      }
      System.out.println();
    }
  }
}

/*
7 5 7

1
103 31
35 35 217 1891 4819 2291 2987 3811 1739 2491 4717 445 65 1079 8383 5353 901 187 649 1003 697 3239 7663 291 123 779 1007 3551 1943 2117 2117
10000 25
3292937 175597 18779 50429 375469 1651121 2102 3722 2376497 611683 489059 2328901 3150061 829981 421301 76409 38477 291931 730241 959821 1664197 3057407 4267589 4729181 5335543


*/


//0 = {BigInteger@704}"7"
//    1={BigInteger@705}"31"
//    2={BigInteger@706}"61"
//    3={BigInteger@707}"79"
//    4={BigInteger@708}"29"
//    5={BigInteger@709}"103"

//    6={BigInteger@710}"37"
//    7={BigInteger@711}"47"
//    8={BigInteger@712}"53"
//    9={BigInteger@713}"89"
//    10={BigInteger@714}"5"
//    11={BigInteger@715}"13"
//    12={BigInteger@716}"83"
//    13={BigInteger@717}"101"
//    14={BigInteger@718}"53"
//    15={BigInteger@719}"17"
//    16={BigInteger@720}"11"
//    17={BigInteger@721}"59"
//    18={BigInteger@722}"17"
//    19={BigInteger@723}"41"
//    20={BigInteger@724}"79"
//    21={BigInteger@725}"97"
//    22={BigInteger@726}"3"
//    23={BigInteger@727}"41"
//    24={BigInteger@728}"19"
//    25={BigInteger@729}"53"
//    26={BigInteger@730}"67"
//    27={BigInteger@731}"29"
//    28={BigInteger@732}"73"
//    29={BigInteger@733}"23"
//    30={BigInteger@734}"43"
//    31={BigInteger@735}"71"
