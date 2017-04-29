package com.bvan.javastart.lessons5_6.conditions;

/**
 * @author bvanchuhov
 */
public class ComparingExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 2;

        // a > b: +1
        // a < b: -1
        // a == b: 0

        int cmp = (a > b) ? 1 : ((a < b) ? -1 : 0);

        System.out.println("cmp = " + cmp);
    }
}
