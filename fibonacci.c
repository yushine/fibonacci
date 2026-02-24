#include <stdio.h>
#include <time.h>

int fibonacci(int n) {
    if (n < 2) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}

int main() {
    clock_t start = clock();

    int result = fibonacci(30);
    printf("Result: %d\n", result);

    clock_t end = clock();
    double elapsed_ms = ((double)(end - start) / CLOCKS_PER_SEC) * 1000;
    printf("Time: %.3f ms\n", elapsed_ms);

    return 0;
}
