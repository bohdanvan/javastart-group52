package com.bvan.javastart.lessons5_6.practice;

/**
 * Вывести все четные числа от {@code from} до {@code to},
 * причем {@code from} всегда меньше, чем {@code to}.
 *
 * @author bvanchuhov
 */
public class EvensRangePrinter {

    public static void main(String[] args) {
        int from = 1;
        int to = 100;

        if (from % 2 != 0) {
            from++;
        }
        for (int n = from; n <= to; n += 2) {
            System.out.println(n);
        }
    }
}
