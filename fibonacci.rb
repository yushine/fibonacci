def fibonacci(n)
  return n if n < 2
  fibonacci(n - 1) + fibonacci(n - 2)
end

start_time = Time.now

result = fibonacci(30)
puts "Result: #{result}"

end_time = Time.now
elapsed_ms = (end_time - start_time) * 1000
puts format("Time: %.3f ms", elapsed_ms)
