/**
 * Node version: v4.2.2
 *
 * 1st: 0.029000043869018555
 * 2nd: 0.029999971389770508
 * 3rd: 0.03000020980834961
 *
 */

function fibonacci(n) {
  if (n == 1 || n == 0) {
    return n;
  }
  return fibonacci(n - 1) + fibonacci(n - 2);
}

function getTimeStamp() {
  var time = new Date().getTime();
  return time / 1000;
}

var startTime = getTimeStamp();
console.log(startTime);

fibonacci(30);

var endTime = getTimeStamp();
console.log(endTime);

console.log(endTime - startTime);
