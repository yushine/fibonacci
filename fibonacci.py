import time


def fibonacci(n):
    if n < 2:
        return n
    return fibonacci(n - 1) + fibonacci(n - 2)


start_time = time.perf_counter()

result = fibonacci(30)
print(f"Result: {result}")

end_time = time.perf_counter()
elapsed_ms = (end_time - start_time) * 1000
print(f"Time: {elapsed_ms:.3f} ms")
