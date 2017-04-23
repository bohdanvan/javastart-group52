package com.bvan.javastart.lessons3_4.conditions;

/**
 * @author bvanchuhov
 */
public class WorkingWeekConditions {

    public static void main(String[] args) {
        int day = 5; // day = 1..7

        boolean isWorkingDay = day <= 3 || day == 5; // 1, 2, 3, 5
        boolean isFriendsDay = day >= 4 && day <= 6; // 4, 5, 6
        boolean isJavaDay = !isFriendsDay; // 1, 2, 3, 7

        if (isWorkingDay) {
            System.out.println("Work");
        }
        if (isFriendsDay) {
            System.out.println("Friends");
        }
        if (isJavaDay) {
            System.out.println("Java Courses");
        }
    }
}
