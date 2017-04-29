package com.bvan.javastart.lessons5_6.practice;

/**
 * @author bvanchuhov
 */
public class ReversedTrianglePrinter {

    public static void main(String[] args) {
        int size = 10;

        for (int length = size; length >= 1; length--) {
            // Print row
            for (int n = 1; n <= length; n++) {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
