<?php

function fibonacci($n) {
    if ($n < 2) {
        return $n;
    }
    return fibonacci($n - 1) + fibonacci($n - 2);
}

$startTime = microtime(true);

$result = fibonacci(30);
echo "Result: $result\n";

$endTime = microtime(true);
$elapsedMs = ($endTime - $startTime) * 1000;
echo sprintf("Time: %.3f ms\n", $elapsedMs);
