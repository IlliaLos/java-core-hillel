package org.example.homework6;

import java.util.Scanner;

public class BasicInteractiveCalculator {

    public static void main(String[] args) {
        String userWish = "yes";

        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter a number");
            double firstNumber = Double.parseDouble(scanner.nextLine());

            System.out.println("Enter an operation (+, -, *, /)");
            char arithmeticSymbol = scanner.nextLine().charAt(0);

            System.out.println("Enter another number");
            double secondNumber = Double.parseDouble(scanner.nextLine());

            arithmeticOperation(firstNumber, arithmeticSymbol, secondNumber);
            System.out.println("Do you want to perform another calculation? (yes/no)");
            userWish = scanner.nextLine().toLowerCase();
        } while (userWish.equals("yes"));

        if (userWish.equals("no")) {
            System.out.println("Exiting the calculator.");
        }
    }

    private static void arithmeticOperation(double firstNumber, char arithmeticSymbol, double secondNumber) {
        switch (arithmeticSymbol) {
            case '+' -> {
                System.out.println("Result: " + (firstNumber + secondNumber));
            }
            case '-' -> {
                System.out.println("Result: " + (firstNumber - secondNumber));
            }
            case '*' -> {
                System.out.println("Result: " + (firstNumber * secondNumber));
            }
            case '/' -> {
                if (secondNumber == 0) {
                    System.out.println("Error: Division by zero");
                } else System.out.println("Result: " + (firstNumber / secondNumber));
            }
        }
    }
}
