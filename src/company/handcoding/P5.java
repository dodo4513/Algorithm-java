package company.handcoding;

/**
 * @author Do-young on 3/24/20
 */
public class P5 {

    public static OneWayNode merge(OneWayNode l, OneWayNode r) {
        if (l == null && r == null) {
            return null;
        } else if (l == null) {
            return r;
        } else if (r == null) {
            return l;
        }

        if (l.val > r.val) {
            r.next = merge(l, r.next);
            return r;
        }
        l.next = merge(r, l.next);
        return l;
    }

    public static void main(String[] args) {
        OneWayNode a = new OneWayNode(1);
        OneWayNode a1 = new OneWayNode(2);
        OneWayNode a2 = new OneWayNode(5);

        a.next = a1;
        a1.next = a2;

        OneWayNode b = new OneWayNode(2);
        OneWayNode b1 = new OneWayNode(6);
        OneWayNode b2 = new OneWayNode(9);

        b.next = b1;
        b1.next = b2;

        System.out.println(merge(a, b));
    }
}
