#include <iostream>
#include <chrono>


int fibonacci(int n) {
    if (n < 2) {
        return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
}


int main() {
    auto start = std::chrono::high_resolution_clock::now();

    int result = fibonacci(30);
    std::cout << "Result: " << result << std::endl;

    auto end = std::chrono::high_resolution_clock::now();
    auto elapsed = std::chrono::duration_cast<std::chrono::microseconds>(end - start);
    double elapsed_ms = elapsed.count() / 1000.0;
    printf("Time: %.3f ms\n", elapsed_ms);

    return 0;
}
