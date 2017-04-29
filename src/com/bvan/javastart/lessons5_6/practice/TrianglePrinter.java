package com.bvan.javastart.lessons5_6.practice;

/**
 * Вывести треугольник размером {@code size}.
 *
 * @author bvanchuhov
 */
public class TrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        for (int length = 1; length <= size; length++) {
            // Print row
            for (int n = 1; n <= length; n++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
