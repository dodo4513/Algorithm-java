package company.handcoding;

/**
 * @author Do-young on 3/24/20
 */
public class P3 {

    public static boolean check(OneWayNode r) {
        String a = "";
        String b = "";

        while (r != null) {
            a = a + r.val;
            b = r.val + b;
            r = r.next;
        }

        return a.equals(b);
    }

    public static void main(String[] args) {
        OneWayNode root = new OneWayNode(1);
        OneWayNode n1 = new OneWayNode(2);
        OneWayNode n2 = new OneWayNode(3);
        OneWayNode n3 = new OneWayNode(1);
        OneWayNode n4 = new OneWayNode(2);
        OneWayNode n5 = new OneWayNode(1);

        root.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        System.out.println(check(root));
    }
}
