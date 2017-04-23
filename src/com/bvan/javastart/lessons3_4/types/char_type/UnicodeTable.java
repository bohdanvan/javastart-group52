package com.bvan.javastart.lessons3_4.types.char_type;

/**
 * @author bvanchuhov
 */
public class UnicodeTable {

    public static void main(String[] args) {
        for (char c = Character.MIN_VALUE; c < Character.MAX_VALUE; c++) {
            System.out.print(c);

            if (c % 30 == 0) {
                System.out.println();
            }
        }
    }
}
