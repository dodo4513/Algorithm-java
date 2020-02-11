package company.HackerRank.Y20200209;

/**
 * @author cyclamen on 2/9/20 https://leetcode.com/problems/merge-two-binary-trees/
 */
public class MergeTree {

  public static class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }

  static class Solution {

    public static void search(TreeNode t1, TreeNode t2) {
      t1.val += t2.val;

      if (t2.left != null) {
        if (t1.left == null) {
          t1.left = new TreeNode(0);
        }

        search(t1.left, t2.left);
      }

      if (t2.right != null) {
        if (t1.right == null) {
          t1.right = new TreeNode(0);
        }

        search(t1.right, t2.right);
      }
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

      if (t1 == null && t2 == null) {
        return null;
      }

      if (t1 == null) {
        t1 = new TreeNode(0);
      }

      if (t2 == null) {
        t2 = new TreeNode(0);
      }

      search(t1, t2);
      return t1;
    }
  }

  public static void main(String[] args) {

    TreeNode t1 = new TreeNode(1);
    t1.left = new TreeNode(3);
    t1.right = new TreeNode(2);
    t1.left.left = new TreeNode(5);

    TreeNode t2 = new TreeNode(2);
    t2.left = new TreeNode(1);
    t2.right = new TreeNode(3);
    t2.left.right = new TreeNode(4);
    t2.right.right = new TreeNode(7);

    Solution.mergeTrees(null, new TreeNode(1));

    System.out.println(1);

  }
}


