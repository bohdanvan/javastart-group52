package com.bvan.javastart.lessons3_4.types.floating_point;

/**
 * @author bvanchuhov
 */
public class MoneyStoring {

    public static void main(String[] args) {
        long money = 267029827;
        int factor = 10000000;
        double moneyForOutput = (double) money / factor;
        System.out.println(moneyForOutput);
    }
}
