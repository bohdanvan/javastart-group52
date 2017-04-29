package com.bvan.javastart.lessons5_6.arrays;

import java.util.Arrays;

/**
 * Заполнить массив чисами 1, 2, 3 и т.д. в обратном порядке<br/>
 *
 * Пример:<br/>
 * Для массива на 5 элементов: [5, 4, 3, 2, 1]<br/>
 *
 * @author bvanchuhov
 */
public class ArrayReversedSequenceFiller {

    public static void main(String[] args) {
        int[] array = new int[5];

        int filler = array.length;
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
            filler--;
        }

        System.out.println(Arrays.toString(array));
    }
}
