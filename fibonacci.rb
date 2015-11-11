#
# ruby 2.2.2p95 (2015-04-13 revision 50295) [x86_64-darwin14]
#
# 1st: 0.21766018867492676
# 2nd: 0.20011091232299805
# 3rd: 0.22544598579406738
#

def fibonacci(n)
  return n if (n == 1 || n == 0)
  fibonacci(n - 1) + fibonacci(n - 2)
end

start_time = Time.now.to_f
puts "start: #{start_time}"

puts fibonacci(30)

end_time = Time.now.to_f
puts "end: #{end_time}"

puts end_time - start_time