package com.bvan.javastart.lessons5_6.conditions;

/**
 * @author bvanchuhov
 */
public class IfChainExample {

    public static void main(String[] args) {
        int x = 10;

        if (x < 20) {
            System.out.println("1");
        } else if (x < 30) {
            System.out.println("2");
        } else {
            System.out.println("3");
        }


        System.out.println("Goodbye");
    }
}
