public class FibonacciComecandoPorUm {

    public static void main(String[] args) {

        System.out.println(fibo(9L));
    }

    public static Long fibo(Long n) {

        if (n < 2) {
            return 1L;
        }
        return fibo(n - 1) + fibo(n - 2);
    }
}
