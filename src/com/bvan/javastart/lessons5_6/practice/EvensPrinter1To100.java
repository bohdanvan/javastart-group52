package com.bvan.javastart.lessons5_6.practice;

/**
 * Вывести все четные числа от 1 до 100.
 *
 * @author bvanchuhov
 */
public class EvensPrinter1To100 {

    public static void main(String[] args) {
        for (int n = 2; n <= 100; n += 2) {
            System.out.println(n);
        }

        // BAD
//        for (int n = 1; n <= 100; n++) {
//            if (n % 2 == 0) {
//                System.out.println(n);
//            }
//        }
    }
}
