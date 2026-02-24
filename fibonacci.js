function fibonacci(n) {
  if (n < 2) {
    return n;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
}

const startTime = Date.now();

const result = fibonacci(30);
console.log(`Result: ${result}`);

const endTime = Date.now();
const elapsedMs = endTime - startTime;
console.log(`Time: ${elapsedMs} ms`);
