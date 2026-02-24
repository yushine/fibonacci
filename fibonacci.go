package main

import (
	"fmt"
	"time"
)

func main() {
	start := time.Now()

	result := fibonacci(30)
	fmt.Printf("Result: %d\n", result)

	elapsed := time.Since(start)
	fmt.Printf("Time: %v\n", elapsed)
}

func fibonacci(n int) int {
	if n < 2 {
		return n
	}
	return fibonacci(n-1) + fibonacci(n-2)
}
