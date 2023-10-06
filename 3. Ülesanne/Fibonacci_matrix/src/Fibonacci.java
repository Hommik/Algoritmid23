public class Fibonacci {
    /* Function that returns nth Fibonacci number as a long */
    static long fib(int n) {
        long F[][] = new long[][] { { 1, 1 }, { 1, 0 } };
        if (n == 0)
            return 0;
        power(F, n - 1);

        return F[0][0];
    }

    static void multiply(long F[][], long M[][]) {
        long x = F[0][0] * M[0][0] + F[0][1] * M[1][0];
        long y = F[0][0] * M[0][1] + F[0][1] * M[1][1];
        long z = F[1][0] * M[0][0] + F[1][1] * M[1][0];
        long w = F[1][0] * M[0][1] + F[1][1] * M[1][1];

        F[0][0] = x;
        F[0][1] = y;
        F[1][0] = z;
        F[1][1] = w;
    }

    /* Optimized version of power() */
    static void power(long F[][], int n) {
        if (n == 0 || n == 1)
            return;
        long M[][] = new long[][] { { 1, 1 }, { 1, 0 } };

        power(F, n / 2);
        multiply(F, F);

        if (n % 2 != 0)
            multiply(F, M);
    }

    /* Driver program to test above function */
    public static void main(String args[]) {
        int n = 5000000;
        System.out.println(fib(n));
    }
}

/* This code is contributed by Rajat Mishra */