    public class Fibonacci {
        public static long fibonacci(long n) {
            // Baasjuhtumid:
            if (n <= 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                // Rekursiivne samm: Fibonacci numbri arvutamine kahe eelmise numbri põhjal.
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        public static void main(String[] args) {
            int n = 40; // Muuda n soovitud Fibonacci numbri indeksiks.
            long result = fibonacci(n);
            System.out.println("Fibonacci " + n + ". number on: " + result);
        }
    }