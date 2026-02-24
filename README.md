# Fibonacci Performance Benchmark

Recursive Fibonacci sequence implementations across multiple programming languages for performance comparison.

## Running the Implementations

| Language | Command |
|----------|---------|
| C | `gcc fibonacci.c -o fibonacci && ./fibonacci` |
| C++ | `g++ fibonacci.cpp -o fibonacci && ./fibonacci` |
| Go | `go run fibonacci.go` |
| Java | `javac Fibonacci.java && java Fibonacci` |
| JavaScript | `node fibonacci.js` |
| PHP | `php fibonacci.php` |
| Python | `python fibonacci.py` |
| Ruby | `ruby fibonacci.rb` |
| Rust | `rustc fibonacci.rs && ./fibonacci` |

## Benchmark Results

Execution time for calculating fibonacci(30):

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
