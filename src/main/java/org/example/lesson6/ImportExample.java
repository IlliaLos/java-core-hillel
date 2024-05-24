package org.example.lesson6;

import java.util.Scanner;

public class ImportExample {

    public static void main(String[] args) {
        int aNumberFromScanner = Integer.parseInt(getStringInputFromConsole());
        System.out.println("You've entered: "+ aNumberFromScanner);

        int integerVariable = getIntegerInputFromConsole();
        System.out.println(integerVariable);
    }

    private static String getStringInputFromConsole() {
        System.out.println("Input a number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static int getIntegerInputFromConsole() {
        System.out.println("Integer input: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
