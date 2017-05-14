package com.bvan.javastart.lessons7_8.method;

/**
 * @author bvanchuhov
 */
public class MethodExample {

    public static void main(String[] args) {
        String s = "10";
        int n = stringToInt(s);
        printMessage("my number [" + n + "]");
    }

    public static int stringToInt(String s) {
        int i = Integer.parseInt(s);
        return i;
    }

    public static void printMessage(String message) {
        System.out.println("The message is '" + message + "'");
    }
}
