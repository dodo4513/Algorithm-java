package company.handcoding;

/**
 * @author Do-young on 3/24/20
 */
public class P2 {

    public static int fibo(int i) {
        if (i == 1 || i == 2) {
            return 1;
        }

        return fibo(i - 1) + fibo(i - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(6));
        System.out.println(fibo(5));
        System.out.println(fibo(4));
        System.out.println(fibo(3));
        System.out.println(fibo(2));
        System.out.println(fibo(1));
    }
}
