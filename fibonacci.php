<?php
/**
 * PHP 5.6.3 (cli) (built: Dec 29 2014 16:39:23)
 * Psy Shell v0.5.2 (PHP 5.6.3 — cli)
 *
 * 1st: 2.8430109024048
 * 2nd: 2.8606810569763
 * 3rd: 2.8435399532318
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
