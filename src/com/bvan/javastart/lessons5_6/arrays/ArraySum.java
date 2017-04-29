package com.bvan.javastart.lessons5_6.arrays;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArraySum {

    public static void main(String[] args) {
        int[] array = {10, 40, 30, 20};

//        int sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            int elem = array[i];
//            sum += elem;
//        }

        int sum = 0;
        for (int elem : array) { // for-each, READ-ONLY
            sum += elem;
        }

        System.out.println("sum = " + sum);
    }
}
