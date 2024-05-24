package org.example.lesson6;

import java.util.Scanner;

public class ScannerUsage {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int counter = 1;
        int sum = 0;

        do {
            System.out.println("Enter a number #" + counter +": ");
            String nextNumber = scanner.nextLine();
            try {
                int number = Integer.parseInt(nextNumber);
                counter++;
                sum += number;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + nextNumber);
            }
        } while (counter <= 5);

        System.out.println("The sum of 5 numbers is: " + sum);
    }
}
