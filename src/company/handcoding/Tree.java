package company.handcoding;

/**
 * @author Do-young on 3/24/20
 */
public class Tree {

    int val;
    Tree left;
    Tree right;

    public Tree(int v) {
        val = v;
    }

    public String toString() {
        return "[val: " + val + ", left: " + left + ", right: " + right + "]";
    }
}

