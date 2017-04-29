package com.bvan.javastart.lessons5_6.practice;

/**
 * Вывести все числа от {@code from} до {@code to}.
 *
 * Если {@code from < to},
 * вывести от {@code from} до {@code to} в прямом прядке.
 *
 * Если {@code from > to},
 * вывести от {@code from} до {@code to} в обратном прядке.
 *
 * Если {@code from == to}, вывести одно из них.
 *
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        int from = 36;
        int to = 34;

        if (from <= to) {
            for (int n = from; n <= to; n++) {
                System.out.println(n);
            }
        } else {
            for (int n = from; n >= to; n--) {
                System.out.println(n);
            }
        }
    }
}
