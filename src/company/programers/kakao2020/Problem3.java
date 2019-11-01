package company.programers.kakao2020;

/**
 * @author doyoung hwang on 2019-10-03
 */
public class Problem3 {

  public static boolean solution(int[][] key, int[][] lock) {
    int N = lock[0].length;
    int M = key[0].length;

    for (int y = -M + 1; y < N; y++) {
      for (int x = -M + 1; x < N; x++) {

        int[][][] copyKey = changeDirection(key);

        for (int i = 0; i < 4; i++) {
          if (isOpen(copyKey[i], lock, y, x)) {
            return true;
          }
        }
      }
    }

    return false;
  }

  private static int[][][] changeDirection(int[][] key) {

    int kl = key.length;

    int[][][] changedKey = new int[4][kl][kl];

    for (int i = 0; i < kl; i++) {
      for (int j = 0; j < kl; j++) {
        if (key[i][j] == 1) {
          changedKey[0][i][j] = 1;
          changedKey[1][j][kl - i - 1] = 1;
          changedKey[2][kl - i - 1][kl - j - 1] = 1;
          changedKey[3][kl - j - 1][i] = 1;
        }
      }
    }

//    1,0 -> 0,1
//    2,1 -> 1,0
//    2,2 -> 2,0
//
//    0,1 -> 1,2
//    1,0 -> 0,1
//    2,0 -> 0,0
//
//    1,2 -> 2,1
//    0,1 -> 1,2
//    0,0 -> 0,2
//
//    2,1 -> 1,0
//    1,2 -> 2,1
//    0,2 -> 2,2

    return changedKey;
  }

  private static boolean isOpen(int[][] key, int[][] lock, int y, int x) {
    int[][] mLock = copy(lock, lock.length);

    for (int i = 0; i < key.length; i++) {
      for (int j = 0; j < key.length; j++) {
        if (key[i][j] == 1) { // 키가 1이면
          int dy = i + y;
          int dx = j + x;
          if (dy >= 0 && dx >= 0 && dy < lock.length && dx < lock.length) { // 해당 위치가 체크 가능한 위치인가?
            if (lock[dy][dx] == 1) { // 키랑 자물쇠가 충돌
              return false;
            } else { // 우선 맞았다.
              mLock[dy][dx] = 1;
            }
          }
        }
      }
    }

    for (int i = 0; i < lock.length; i++) {
      for (int j = 0; j < lock.length; j++) {
        if (mLock[i][j] == 0) {
          return false;
        }
      }
    }

    return true;
  }


  private static int[][] copy(int[][] array, int length) {
    int[][] newArray = new int[length][length];
    for (int i = 0; i < length; i++) {
      for (int j = 0; j < length; j++) {
        newArray[i][j] = array[i][j];
      }
    }
    return newArray;
  }

  public static void main(String[] args) {
    int[][] key = {
        {0, 1, 1},
        {0, 1, 1},
        {0, 0, 0}
    };

//    int[][] key1 = {
//        {0, 0, 0},
//        {0, 0, 1},
//        {0, 1, 0}
//    };
    int[][] lock = {
        {1, 1, 1},
        {1, 1, 1},
        {1, 0, 1}
    };
    System.out.println(solution(key, lock));

//    System.out.println(isOpen(key1, lock, 0, 0));

//    int[][] aaa = key.clone();
//    aaa[0][0] = 2;
//    System.out.println(key);

  }
}


