package com.bvan.javastart.lessons3_4.loops.printer;

/**
 * @author bvanchuhov
 */
public class PrinterDoWhile {

    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println(n);
            n++;
        } while (n <= 10);
    }
}
