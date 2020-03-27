package company.handcoding;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Do-young on 3/24/20
 */
public class P8 {

    static boolean[] visited = new boolean[100];

    public static void dfs(boolean[][] arr, int n) {
        for (int i = 1; i < 5; i++) {
            if (arr[n][i] && !visited[i]) {
                visited[i] = true;
                System.out.println(i);
                dfs(arr, i);
            }
        }
    }

    public static void bfs(boolean[][] arr, int n) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);

        while (!queue.isEmpty()) {

            for (int i = 1; i < 5; i++) {
//                if ()
            }

        }
    }

    public static void main(String[] args) {
        int n = 4;
        boolean[][] arr = new boolean[100][100];

        arr[1][2] = true;
        arr[1][3] = true;
        arr[1][4] = true;
        arr[2][4] = true;
        arr[3][4] = true;

        visited[1] = true;
        dfs(arr, 1);

    }
}
