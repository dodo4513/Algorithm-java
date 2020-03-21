package company;

import java.util.Arrays;
import java.util.List;

/**
 * @author Do-young on 3/15/20
 */
public class Temp {
    public static int maxHeight(List<Integer> wallPositions, List<Integer> wallHeights) {

        int result = Integer.MIN_VALUE;
        for (int i=0; i<wallPositions.size() -1; i++) {
            int aWall = wallPositions.get(i);
            int bWall = wallPositions.get(i+1);
            int aHeight = wallHeights.get(i);
            int bHeight = wallHeights.get(i+1);

            int ableTime =  Math.abs(aWall - bWall) - 1;
            int diffHeight = Math.abs(aHeight - bHeight);

            if (diffHeight > ableTime) {
                return 0;
            }

            if (diffHeight == ableTime) {
                result = result > Math.max(aHeight, bHeight) ? result : Math.max(aHeight, bHeight);
                continue;
            }

            if (diffHeight < ableTime) {
                int a = Math.max(aHeight, bHeight) + (int)Math.ceil((ableTime - diffHeight)/2.0);
                result = result > a ? result : a;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(maxHeight(Arrays.asList(14,21,26,29,30,33), Arrays.asList(29,31,15,37,16,35,33)));
    }
}
