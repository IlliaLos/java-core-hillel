package org.example.homework3;

public class MinAndMax {
    public static void main(String[] args) {
        int x = 1;
        int y = 27;

        int min = x < y ? x : y;
        int max = x > y ? x : y;

        System.out.println("Min variable: " + min);
        System.out.println("Max variable: " + max);

    }
}
