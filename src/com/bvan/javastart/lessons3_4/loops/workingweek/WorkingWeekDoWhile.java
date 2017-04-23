package com.bvan.javastart.lessons3_4.loops.workingweek;

/**
 * @author bvanchuhov
 */
public class WorkingWeekDoWhile {

    public static void main(String[] args) {
        int day = 1; // day = 1..7

        do {
            System.out.println(day + ": Work");
            day++;
        } while (day <= 5);

        System.out.println("Goodbye");
    }
}
