package org.example.homework4;

public class MinutesToYearsAndDays {
    public static void main(String[] args) {
        printYearsAndDays(525600L);
    }

    private static void printYearsAndDays(long minutes) {
        long days = minutes / 60 / 24;
        long years = minutes / 60 / 24 / 365;
        long leftDays = days % 365;

        if (minutes < 0)
            System.out.println("Invalid Value");
        else System.out.println(minutes + " min = " + years + " y and " + leftDays + " d");
    }
}
