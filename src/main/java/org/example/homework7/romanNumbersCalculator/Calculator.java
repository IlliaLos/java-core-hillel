package org.example.homework7.romanNumbersCalculator;

public class Calculator {

    public int calculate(RomanNumber num1, RomanNumber num2, String operation) {
        int value1 = num1.getValue();
        int value2 = num2.getValue();
        int Result = 0;

        switch (operation) {
            case "+" ->
                Result = value1 + value2;
            case "-" -> {
                Result = value1 - value2;
            }
            case "*" -> {
                Result = value1 * value2;
            }
            case "/" -> {
                Result = value1 / value2;
            }
            default -> System.out.println("Error");
        }

        return Result;
    }
}
