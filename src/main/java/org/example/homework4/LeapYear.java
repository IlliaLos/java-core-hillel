package org.example.homework4;

public class LeapYear {
    public static void main(String[] args){
        int year = 4000;
        boolean leapYear = isLeapYear(year);
        if (leapYear)
            System.out.println("The year " + year + " is leap");
        else System.out.println("The year " + year + " is not leap");
    }

    public static boolean isLeapYear (int year) {
        if (year < 1 || year > 9999)
        return false;
        else if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        else return false;
    }

}
