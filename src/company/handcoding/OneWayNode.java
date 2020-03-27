package company.handcoding;

/**
 * @author Do-young on 3/23/20
 */
public class OneWayNode {
    int val;
    OneWayNode next;

    OneWayNode(int v) {
        val = v;
    }

    public String toString() {
        return "[val:" + val + ", next:" + next + "]";
    }
}
