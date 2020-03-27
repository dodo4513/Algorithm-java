package company.handcoding;

/**
 * @author Do-young on 3/25/20
 */
public class P9 {

    // https://ndb796.tistory.com/74

    public static OneWayNode reverse(OneWayNode head) {
        OneWayNode tail = null;
        OneWayNode curNode;

        while (head != null) {
            curNode = head.next;
            head.next = tail;
            tail = head;
            head = curNode;
        }

        return tail;
    }

    public static void main(String[] args) {
        // 1 - 2 - 3 - 5
        OneWayNode root = new OneWayNode(1);
        OneWayNode n1 = new OneWayNode(2);
        OneWayNode n2 = new OneWayNode(3);
        OneWayNode n3 = new OneWayNode(5);

        root.next = n1;
        n1.next = n2;
        n2.next = n3;



        System.out.println(reverse(root));
    }
}
