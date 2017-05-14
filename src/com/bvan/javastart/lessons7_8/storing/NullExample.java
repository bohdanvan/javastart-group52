package com.bvan.javastart.lessons7_8.storing;

/**
 * @author bvanchuhov
 */
public class NullExample {

    public static void main(String[] args) {
        String s = null;

        if (s != null) {
            int length = s.length();
            System.out.println(length);
        }

        String s1 = s.toLowerCase(); // NullPointerException
        System.out.println(s1);
    }
}
