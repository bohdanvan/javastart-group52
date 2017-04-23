package com.bvan.javastart.lessons3_4.object;

/**
 * @author bvanchuhov
 */
public class StringExample {

    public static void main(String[] args) {
        String s = "Hello, Java!";
        System.out.println(s);

        int length = s.length();
        System.out.println("length = " + length);

        char c = s.charAt(1);
        System.out.println("c = " + c);

        char lastChar = s.charAt(s.length() - 1);
        System.out.println("lastChar = " + lastChar);

        String upperCase = s.toUpperCase();
        System.out.println("upperCase = " + upperCase);

        String lowerCase = s.toLowerCase();
        System.out.println("lowerCase = " + lowerCase);

        int indexOfJava = s.indexOf("Java");
        System.out.println("indexOfJava = " + indexOfJava);

        boolean equals = s.equals("Hello, Java!");
        System.out.println("equals = " + equals);

        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println("reversed = " + reversed);
    }
}
