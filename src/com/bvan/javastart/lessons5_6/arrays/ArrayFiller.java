package com.bvan.javastart.lessons5_6.arrays;

import java.util.Arrays;

/**
 * Заполнить массив числом {@code filler}.<br/>
 *
 * Пример:<br/>
 * Для массива на 5 элементов и {@code filler = 1}: [1, 1, 1, 1, 1]<br/>
 *
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] array = new int[5];

        int filler = 1;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }

        System.out.println(Arrays.toString(array));
    }
}
