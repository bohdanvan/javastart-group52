package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        s1 = s1.concat(", world");

        System.out.println("s1 = " + s1); // Hello, world
        System.out.println("s2 = " + s2); // Hello
    }
}
