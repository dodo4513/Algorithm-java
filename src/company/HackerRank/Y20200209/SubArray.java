package company.HackerRank.Y20200209;

/**
 * @author cyclamen on 2/9/20 https://leetcode.com/problems/shortest-unsorted-continuous-subarray/
 */
public class SubArray {

  static class Solution {

    public int findUnsortedSubarray(int[] nums) {
      if (nums.length == 1) {
        return 0;
      } else if (nums.length == 2) {
        return nums[1] < nums[0] ? 2 : 0;
      }

      int maxNum = nums[0];
      int min = 987654321;
      int max = 0;
      for (int i = 1; i < nums.length; i++) {
        if (nums[i] < maxNum) {
          min = Math.min(min, i - 1);
          max = i;
        }

        if (maxNum < nums[i]) {
          maxNum = nums[i];
        }
      }

      return max - min + 1;
    }
  }


  public static void main(String[] args) {
    Solution solution = new Solution();

    System.out.println(solution.findUnsortedSubarray(new int[]{2, 6, 4, 8, 10, 9, 15}));
//    System.out.println(solution.findUnsortedSubarray(new int[]{5, 1, 2, 6}));
//    System.out.println(solution.findUnsortedSubarray(new int[]{1}));
//    System.out.println(solution.findUnsortedSubarray(new int[]{1, 2}));
//    System.out.println(solution.findUnsortedSubarray(new int[]{2, 1}));
//    System.out.println(solution.findUnsortedSubarray(new int[]{9, 8, 9}));
//    System.out.println(solution.findUnsortedSubarray(new int[]{2, 5, 4, 3, 6, 7, 9, 10, 1}));
//    System.out.println(solution.findUnsortedSubarray(new int[]{2, 5, 4, 3, 6, 7, 9, 10, 1}));
    System.out.println(solution.findUnsortedSubarray(new int[]{2, 4, 3, 1}));

  }
}
