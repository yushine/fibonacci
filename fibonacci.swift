import Foundation


func fibonacci(_ n: Int) -> Int {
    if n < 2 {
        return n
    }
    return fibonacci(n - 1) + fibonacci(n - 2)
}


let start = Date()

let result = fibonacci(30)
print("Result: \(result)")

let elapsed = Date().timeIntervalSince(start) * 1000
print(String(format: "Time: %.3f ms", elapsed))
