fun fibonacci(n: Int): Int {
    if (n < 2) {
        return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}


val start = System.nanoTime()
val result = fibonacci(30)
val elapsedMs = (System.nanoTime() - start) / 1_000_000.0

println("Result: $result")
println("Time: ${"%.3f".format(elapsedMs)} ms")
