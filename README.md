# Fibonacci Performance Benchmark

Recursive Fibonacci sequence implementations across multiple programming languages for performance comparison.

## Running the Implementations

| Language | Command |
|----------|---------|
| C | `gcc fibonacci.c -o fibonacci && ./fibonacci` |
| C# | `dotnet run` (requires project setup) |
| C++ | `g++ fibonacci.cpp -o fibonacci && ./fibonacci` |
| Dart | `dart run fibonacci.dart` |
| Go | `go run fibonacci.go` |
| Java | `javac Fibonacci.java && java Fibonacci` |
| JavaScript | `node fibonacci.js` |
| Kotlin | `kotlinc -script fibonacci.kts` |
| PHP | `php fibonacci.php` |
| Python | `python fibonacci.py` |
| Ruby | `ruby fibonacci.rb` |
| Rust | `rustc fibonacci.rs && ./fibonacci` |
| Swift | `swift fibonacci.swift` |

## Benchmark Results

Execution time for calculating fibonacci(30) (tested on macOS Darwin 25.2.0):

| Language | Version | Execution Time |
|----------|---------|----------------|
| Go | go1.23.6 | 4.254 ms |
| Swift | 6.0.2 | 4.458 ms |
| C | clang 18.1.8 | 5.492 ms |
| Kotlin | 2.1.0 | 5.328 ms |
| C++ | clang 18.1.8 | 5.664 ms |
| Rust | 1.84.1 | 8.078 ms |
| Dart | 3.11.0 | 10.681 ms |
| Java | openjdk 23.0.1 | 11.759 ms |
| JavaScript | Node v22.20.0 | 18.000 ms |
| PHP | 8.3.14 | 78.195 ms |
| Ruby | 3.3.6 | 95.451 ms |
| Python | 3.13.2 | 151.881 ms |
| C# | - | not tested |

### Historical Results (Original Test)

| Language Version | Execution Time |
|------------------|----------------|
| Go 1.5.1 | ~6.8ms |
| Java 1.8.0_20 | ~14ms |
| Node v4.2.2 | ~29-30ms |
| PHP 7.0.1 | ~184-192ms |
| Ruby 2.2.2 | ~200-225ms |

## Implementation

Each file is a self-contained program with identical structure:
1. Record start timestamp
2. Calculate fibonacci(30) using recursive algorithm
3. Record end timestamp
4. Output result and elapsed time

## Related

- [中文版 README](README_CN.md)
