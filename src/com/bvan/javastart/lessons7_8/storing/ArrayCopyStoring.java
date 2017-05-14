package com.bvan.javastart.lessons7_8.storing;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayCopyStoring {

    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] b = Arrays.copyOf(a, a.length);

        b[0] = 10000;

        System.out.println("a = " + Arrays.toString(a)); // [10, 20]
        System.out.println("b = " + Arrays.toString(b)); // [10000, 20]
    }
}
