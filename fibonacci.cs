using System;
using System.Diagnostics;


class Fibonacci {
    static int Fibonacci(int n) {
        if (n < 2) {
            return n;
        }
        return Fibonacci(n - 1) + Fibonacci(n - 2);
    }

    static void Main() {
        var stopwatch = Stopwatch.StartNew();

        int result = Fibonacci(30);
        Console.WriteLine($"Result: {result}");

        stopwatch.Stop();
        Console.WriteLine($"Time: {stopwatch.Elapsed.TotalMilliseconds:F3} ms");
    }
}
