import kotlin.system.measureTimeMillis


fun fibonacci(n: Int): Int {
    if (n < 2) {
        return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}


fun main() {
    val result: Int
    val elapsedMs = measureTimeMillis {
        result = fibonacci(30)
    }

    println("Result: $result")
    println("Time: $elapsedMs ms")
}
