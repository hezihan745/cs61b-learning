public class fib {

    public static int fib_n(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fib_n(n-1) + fib_n(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib_n(6));
    }

}
