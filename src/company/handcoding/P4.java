package company.handcoding;

/**
 * @author Do-young on 3/24/20
 */
public class P4 {

    static int maxV = Integer.MIN_VALUE;

    public static void calculate(Tree t, int v) {
        if (t == null) {
            return;
        }

        maxV = Math.max(maxV, v);

        if (t.left != null) {
            if (t.val == t.left.val) {
                calculate(t.left, v + 1);
            } else {
                calculate(t.left, 0);
            }
        } else if (t.right != null) {
            if (t.val == t.right.val) {
                calculate(t.right, v + 1);
            } else {
                calculate(t.right, 0);
            }
        }
    }

    public static void main(String[] args) {

        Tree r = new Tree(1);

        Tree n1 = new Tree(1);
        Tree n2 = new Tree(2);

        Tree n3 = new Tree(1);
        Tree n4 = new Tree(2);
        Tree n5 = new Tree(3);

        Tree n6 = new Tree(1);

        r.left = n1;
        r.right = n2;

        n1.left = n3;
        n1.right = n4;
        n2.right = n5;

        n3.left = n6;

        calculate(r, 0);
        System.out.println(maxV);

    }
}
