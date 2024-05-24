package org.example.lesson5;

public class ConstExample {

    public static final int MINUTES_TO_YEARS_DIVIDER = 525600;

    public static void main(String[] args) {
        long min = 1441;
        printYearsAndDays(min);
    }

    private static void printYearsAndDays(long minutes) {
        if (minutes < 1) {
            System.out.println("Invalid value");
            return;
        }
        long yy = minutes / MINUTES_TO_YEARS_DIVIDER;
        long dd = (minutes - yy * 525600) / 1440;
        System.out.println(minutes + " min = " + yy + " y and " + dd + " d");
    }
}
