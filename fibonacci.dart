import 'dart:io';


int fibonacci(int n) {
  if (n < 2) {
    return n;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
}


void main() {
  final start = DateTime.now();

  final result = fibonacci(30);
  print('Result: $result');

  final elapsed = DateTime.now().difference(start).inMicroseconds / 1000.0;
  print('Time: ${elapsed.toStringAsFixed(3)} ms');
}
