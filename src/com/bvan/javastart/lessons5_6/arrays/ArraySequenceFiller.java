package com.bvan.javastart.lessons5_6.arrays;

import java.util.Arrays;

/**
 * Заполнить массив чисами 1, 2, 3 и т.д.<br/>
 *
 * Пример:<br/>
 * Для массива на 5 элементов: [1, 2, 3, 4, 5]<br/>
 *
 * @author bvanchuhov
 */
public class ArraySequenceFiller {

    public static void main(String[] args) {
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }

        System.out.println(Arrays.toString(array));
    }
}
