package com.bvan.javastart.lessons7_8.method;

import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class HelloPrinter {

    // Client
    public static void main(String[] args) {
        test();
    }

    public static void test() {
        int count = readIntFromRange("count", 1, 100);
        String[] helloMessages = prepareHelloMessages(count);

        for (String helloMessage : helloMessages) {
            System.out.println(helloMessage);
        }
    }

    public static String[] prepareHelloMessages(int count) {
        String[] messages = new String[count];
        for (int i = 0; i < count; i++) {
            String name = readString("name");
            int age = readIntFromRange("age", 1, 120);
            String message = helloMessage(name, age);
            messages[i] = message;
        }
        return messages;
    }

    public static int readIntFromRange(String varName, int min, int max) {
        int res = readInt(varName);
        while (res < min || res > max) {
            System.out.println("Illegal " + varName + ", should be in the range [" + min + ", " + max + "]");
            res = readInt(varName);
        }
        return res;
    }

    public static int readInt(String varName) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter " + varName + ": ");
        while (!scanner.hasNextInt()) {
            System.out.println("Illegal " + varName);
            scanner.next();

            System.out.print("Enter " + varName + ": ");
        }
        return scanner.nextInt();
    }

    public static String readString(String varName) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter " + varName + ": ");
        return scanner.next();
    }

    public static String[] readNames(int count) {
        String[] names = new String[count];
        for (int i = 0; i < names.length; i++) {
            String name = readString("name");
            names[i] = name;
        }
        return names;
    }

    // Creator
    public static String helloMessage(String name, int age) {
        return "Hello, I'm " + name + ", " + age + " years old";
    }
}
