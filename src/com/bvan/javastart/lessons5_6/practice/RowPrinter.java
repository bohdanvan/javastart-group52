package com.bvan.javastart.lessons5_6.practice;

/**
 * Вывести строку из 'x' длиной {@code length}.<br/>
 *
 * Пример:<br/>
 * in: size=4<br/>
 * out: xxxx<br/>
 *
 * @author bvanchuhov
 */
public class RowPrinter {

    public static void main(String[] args) {
        int length = 100;

        for (int n = 1; n <= length; n++) {
            System.out.print("x");
        }
        System.out.println();
    }
}
