/**
 * go version go1.5.1 darwin/amd64
 *
 * 1st: 6.847421ms
 * 2nd: 6.953043ms
 * 3rd: 6.877671ms
 *
 */

package main
import "fmt"
import "time"
 
func main() {
  start := time.Now()
  fmt.Println(start)

  fmt.Printf("%d\n", fibonacci(30))

  end := time.Now()
  fmt.Println(end)

  fmt.Println(end.Sub(start))
}
 
func fibonacci(num int) int {
  if num < 2 {
    return num
  }
  return fibonacci(num-1) + fibonacci(num-2)
}
