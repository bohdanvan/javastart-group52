package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayMethodStoring {

    public static void main(String[] args) {
        int[] a = new int[3];
        fill(a, 1);
        System.out.println(Arrays.toString(a)); // [1, 1, 1]
    }

    private static void fill(int[] a, int filler) {
        for (int i = 0; i < a.length; i++) {
            a[i] = filler;
        }
    }

    public static int[] createArray(int size) {
        return new int[size];
    }
}
