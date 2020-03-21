package company.handcoding;

/**
 * @author Do-young on 3/9/20
 */
public class fibonacci {

    private static int fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }

        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        System.out.println(fibo(1));
        System.out.println(fibo(2));
        System.out.println(fibo(3));
        System.out.println(fibo(4));
        System.out.println(fibo(5));
        System.out.println(fibo(6));
    }
}
