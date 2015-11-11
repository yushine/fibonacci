/**
 * java version "1.8.0_20"
 * Java(TM) SE Runtime Environment (build 1.8.0_20-b26)
 * Java HotSpot(TM) 64-Bit Server VM (build 25.20-b23, mixed mode)
 *
 * 1st: 0.014
 * 2nd: 0.014
 * 3rd: 0.014
 *
 */

import java.util.Calendar;

public class Fibonacci {

    public static void main(String[] args) {

        double startTimestamp = Calendar.getInstance().getTime().getTime();

        System.out.println(fibonacci(30));

        double endTimestamp = Calendar.getInstance().getTime().getTime();

        double diffTime = endTimestamp - startTimestamp;

        System.out.println(startTimestamp);
        System.out.println(endTimestamp);
        System.out.println(diffTime / 1000);
    }

    public static int fibonacci(int n) {
        if (n <= 2) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
