package com.bvan.javastart.lessons7_8.matrix;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class MatrixExample {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            printArray(row);
        }
    }

    public static void printArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
}
