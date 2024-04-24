package org.example.homework7;

public class Calculator {

    public int calculate(RomanNumber num1, RomanNumber num2, String operation) {

        int Result = 0;

        switch (operation) {
            case "+" ->
                Result = num1.getValue() + num2.getValue();
            case "-" -> {
                Result = num1.getValue() - num2.getValue();
            }
            case "*" -> {
                Result = num1.getValue() * num2.getValue();
            }
            case "/" -> {
                if (num2.getValue() == 0) {
                    System.out.println("Error: Division by zero");
                } else Result = num1.getValue() / num2.getValue();
            }
        }
        return Result;
    }
}
