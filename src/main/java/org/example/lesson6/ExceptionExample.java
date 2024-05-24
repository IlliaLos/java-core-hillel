package org.example.lesson6;

import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) {
        try {
            int aNumberFromScanner = Integer.parseInt(getStringInputFromConsole());
            System.out.println("You've entered: " + aNumberFromScanner);
        } catch (NumberFormatException e) {
            System.out.println("Incorrect input");
        }
    }

    private static String getStringInputFromConsole() {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
