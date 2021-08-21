public class fibonacci {




    public static void main(String[] args) {

            int n = 6;
            int fib0 = 0;
            int fib1 = 1;
            int fib2;
            System.out.println(fib0);
            System.out.println(fib1);
            for (int i = 1; i <= n; i++) {

                fib2 = fib0 + fib1;
                fib0 = fib1;
                fib1 = fib2;
                System.out.println(fib2);


        }
    }
}
