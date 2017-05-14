package com.bvan.javastart.lessons7_8.stringbuilder;

/**
 * @author bvanchuhov
 */
public class StringAndStringBuilderExample {

    public static void main(String[] args) {
        String name = "John";
        int age = 25;

        String s = "Hello, I'm " + name + ", " + age + " years old";
        System.out.println(s);

        //-------------------

        StringBuilder sb = new StringBuilder();
        sb.append("Hello, I'm ");
        sb.append(name);
        sb.append(", ");
        sb.append(age);
        sb.append(" years old");

        String s1 = sb.toString();
        System.out.println(s1);
    }
}
