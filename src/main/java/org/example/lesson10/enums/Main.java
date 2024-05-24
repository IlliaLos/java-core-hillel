package org.example.lesson10.enums;

public class Main {

    public static void main(String[] args) {
        DaysOfWeek daysOfWeek = DaysOfWeek.SUNDAY;
        System.out.println(daysOfWeek);
        System.out.println(daysOfWeek.name());
        System.out.println(daysOfWeek.ordinal());

        DaysOfWeek[] daysArray = DaysOfWeek.values();
        System.out.println(daysArray[6]);
    }
}
