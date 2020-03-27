package company.handcoding;

/**
 * @author Do-young on 3/23/20
 */
public class P1 {

    public static OneWayNode remove(OneWayNode n, int v) {
        if (n == null) {
            return null;
        }
        if (n.val == v) {
            return remove(n.next, v);
        }

        n.next = remove(n.next, v);
        return n;
    }

    public static void main(String[] args) {
        // 1 - 2 - 3 - 5 - 3 - 3
        OneWayNode root = new OneWayNode(1);
        OneWayNode n1 = new OneWayNode(2);
        OneWayNode n2 = new OneWayNode(3);
        OneWayNode n3 = new OneWayNode(5);
        OneWayNode n4 = new OneWayNode(3);
        OneWayNode n5 = new OneWayNode(3);

        root.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(remove(root, 3));
    }
}
