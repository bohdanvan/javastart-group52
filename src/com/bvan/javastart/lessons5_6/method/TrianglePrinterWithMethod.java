package com.bvan.javastart.lessons5_6.method;

/**
 * Вывести треугольник размером {@code size}.
 *
 * @author bvanchuhov
 */
public class TrianglePrinterWithMethod {

    public static void main(String[] args) {
        printTriangle(3);
        printTriangle(4);
    }

    public static void printTriangle(int size) {
        for (int length = 1; length <= size; length++) {
            printRow(length);
        }
    }

    public static void printRow(int length) {
        for (int n = 1; n <= length; n++) {
            System.out.print("x");
        }
        System.out.println();
    }
}
