<?php
/**
 * Have no idea why these two versions(5.6.3) has huge performance difference.
 *
 * PHP 5.6.3 (cli) (built: Dec 29 2014 16:39:23) (Original Version from MAC System)
 * 1st: 2.8430109024048
 * 2nd: 2.8606810569763
 * 3rd: 2.8435399532318
 *
 * PHP 5.6.3 (cli) (built: Dec 24 2015 16:12:24)
 * 1st: 0.40977907180786
 * 2nd: 0.40410709381104
 * 3rd: 0.39038801193237
 *
 * PHP 7.0.1 (cli) (built: Dec 24 2015 15:22:14) ( NTS )
 * 1st: 0.1923041343689
 * 2nd: 0.1842520236969
 * 3rd: 0.18664717674255
 *
 */

function fibonacci($n)
{
    if ($n == 1 or $n == 0) {
        return $n;
    }
    return fibonacci($n - 1) + fibonacci($n - 2);
}

$startTime = microtime(true);
var_dump($startTime);

fibonacci(30);

$endTime = microtime(true);
var_dump($endTime);

var_dump($endTime - $startTime);
