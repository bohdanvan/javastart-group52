package com.bvan.javastart.lessons5_6.practice;

/**
 * Подсчитать сумму всех чисел в диапазоне
 * от {@code from} до {@code to}.
 *
 * Если {@code from > to}, тогда сумма равна 0.
 *
 * @author bvanchuhov
 */
public class RangeSum {

    public static void main(String[] args) {
        int from = 30;
        int to = 20;

        // validation
        if (from > to) {
            System.out.println("Sorry, illegal from and to");
            System.exit(0);
        }

        int sum = 0;
        for (int n = from; n <= to; n++) {
            sum += n;
        }

        System.out.println("sum = " + sum);
    }
}
