# 斐波那契数列性能测试

多编程语言递归斐波那契数列实现，用于性能对比测试。

## 运行方式

| 语言 | 命令 |
|------|------|
| Go | `go run fibonacci.go` |
| Java | `javac Fibonacci.java && java Fibonacci` |
| JavaScript | `node fibonacci.js` |
| PHP | `php fibonacci.php` |
| Ruby | `ruby fibonacci.rb` |

## 基准测试结果

各语言计算 fibonacci(30) 的执行时间：

| 语言版本 | 执行时间 |
|----------|----------|
| Go 1.5.1 | ~6.8ms |
| Java 1.8.0_20 | ~14ms |
| Node v4.2.2 | ~29-30ms |
| PHP 7.0.1 | ~184-192ms |
| Ruby 2.2.2 | ~200-225ms |

## 实现说明

每个文件都是独立的程序，结构一致：
1. 记录开始时间戳
2. 使用递归算法计算 fibonacci(30)
3. 记录结束时间戳
4. 输出结果和耗时
