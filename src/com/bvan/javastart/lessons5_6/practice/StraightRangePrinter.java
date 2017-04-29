package com.bvan.javastart.lessons5_6.practice;

/**
 * Вывести все числа от {@code from} до {@code to},
 * причем {@code from} всегда меньше, чем {@code to}.
 *
 * @author bvanchuhov
 */
public class StraightRangePrinter {

    public static void main(String[] args) {
        int from = 10;
        int to = 20;

        for (int n = from; n <= to; n++) {
            System.out.println(n);
        }
    }
}
