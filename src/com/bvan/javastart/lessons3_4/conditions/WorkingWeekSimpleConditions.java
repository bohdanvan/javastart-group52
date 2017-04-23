package com.bvan.javastart.lessons3_4.conditions;

/**
 * @author bvanchuhov
 */
public class WorkingWeekSimpleConditions {

    public static void main(String[] args) {
        int day = 1; // day = 1..7

        if (day <= 5) {
            System.out.println("Work");
        } else {
            System.out.println("Friends");
        }
        System.out.println("Java Courses");
    }
}
