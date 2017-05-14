package com.bvan.javastart.lessons7_8.stringbuilder;

/**
 * @author bvanchuhov
 */
public class Benchmark {

    public static void main(String[] args) {
        int count = 100000;
        System.out.println("String Builder:\t" + timeWithStringBuilder(count));
        System.out.println("String:\t\t\t" + timeWithString(count));
    }

    public static long timeWithString(int count) {
        long start = System.currentTimeMillis();

        testWithString(count);

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static long timeWithStringBuilder(int count) {
        long start = System.currentTimeMillis();

        testWithStringBuilder(count);

        long finish = System.currentTimeMillis();
        return finish - start;
    }

    public static void testWithString(int count) {
        String s = "";
        for (int i = 0; i < count; i++) {
            s += "a";
        }
    }

    public static void testWithStringBuilder(int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append("a");
        }
    }
}
