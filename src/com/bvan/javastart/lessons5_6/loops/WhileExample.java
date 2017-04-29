package com.bvan.javastart.lessons5_6.loops;

/**
 * @author bvanchuhov
 */
public class WhileExample {

    public static void main(String[] args) {
        int n = 1; // (1)

        while (n <= 5) { // (2)
            System.out.println(n);
            n++; // (3)
        }

        System.out.println("Goodbye");
    }
}
