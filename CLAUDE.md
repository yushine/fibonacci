# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Repository Purpose

A multi-language benchmark collection implementing recursive Fibonacci sequence calculations. Each implementation calculates fibonacci(30) and measures execution time for performance comparison across languages.

## Running the Implementations

| Language | Run Command |
|----------|-------------|
| Go | `go run fibonacci.go` |
| Java | `javac Fibonacci.java && java Fibonacci` |
| JavaScript | `node fibonacci.js` |
| PHP | `php fibonacci.php` |
| Ruby | `ruby fibonacci.rb` |

## Architecture

Each file is a self-contained, standalone program with identical structure:
1. Records start timestamp
2. Calculates fibonacci(30) using recursive algorithm
3. Records end timestamp
4. Outputs the result and elapsed time

The benchmark results are documented in comments at the top of each file.
