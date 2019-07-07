package company.backjoon;

import java.util.Scanner;

/**
 * @author doyoung hwang on 2019-07-07
 */
public class ColoredPaper {


  static final int WHITE = 0;
  static int blackResult = 0;
  static int whiteResult = 0;


  private static void recursive(int[][] array, int startY, int startX, int n) {
    boolean isClear = true;
    int firstTile = array[startY][startX];
    for (int i = startY; i < startY + n; i++) {
      for (int j = startX; j < startX + n; j++) {
        if (array[i][j] != firstTile) {
          isClear = false;
        }
      }
    }

    if (isClear) {
      if (firstTile == WHITE) {
        whiteResult++;
      } else {
        blackResult++;
      }

      return;
    }

    int dividedN = n / 2;
    recursive(array, startY, startX, dividedN);
    recursive(array, startY, startX + dividedN, dividedN);
    recursive(array, startY + dividedN, startX, dividedN);
    recursive(array, startY + dividedN, startX + dividedN, dividedN);
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[][] array = new int[128][128];

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        array[i][j] = scan.nextInt();
      }
    }
    recursive(array, 0, 0, n);

    System.out.println(whiteResult);
    System.out.println(blackResult);
  }
}

