package org.example.homework3;

public class LongToInt {
    public static void main(String[] args) {
        long l = 9999999999999999L;
        int i = (int) l;

        System.out.println("Original result: " + l);
        System.out.println("Converted result: " + i);
    }
}
