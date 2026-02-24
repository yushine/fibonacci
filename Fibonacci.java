public class Fibonacci {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int result = fibonacci(30);
        System.out.println("Result: " + result);

        long endTime = System.nanoTime();
        double elapsedMs = (endTime - startTime) / 1_000_000.0;
        System.out.printf("Time: %.3f ms\n", elapsedMs);
    }

    public static int fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
