package org.example.lesson5;

public class WhileLoop {

    public static void main(String[] args) {
        int firstNumber = 11;
        int secondNumber = 10;
//
//        while(secondNumber > firstNumber) {
//            System.out.println(firstNumber);
//            firstNumber = firstNumber + 2;
//        }

        do {
            System.out.println(firstNumber);
            firstNumber = firstNumber + 2;
        } while (secondNumber > firstNumber);

    }
}
